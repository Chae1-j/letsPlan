document.addEventListener("DOMContentLoaded", function () {
    const authButton = document.getElementById("authEmail");
    const emailInput = document.getElementById("inputEmail");

    if (authButton && emailInput) {
        authButton.addEventListener("click", function () {
            const email = emailInput.value.trim();

            if (!email) {
                alert("이메일을 입력해주세요.");
                emailInput.focus();
                return;
            }

            // 이메일 형식 검증 (간단한 정규식)
            const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
            if (!emailRegex.test(email)) {
                alert("올바른 이메일 형식을 입력해주세요.");
                emailInput.focus();
                return;
            }

            // 서버로 인증 요청 (예: Node.js API 연동)
            fetch("http://localhost:3000/api/auth/send-email", {  // ← 이 경로는 사용자 서버에 맞게 조정
                method: "POST",
                headers: {
                    "Content-Type": "application/json"
                },
                body: JSON.stringify({ email: email })
            })
                .then(response => response.json())
                .then(data => {
                    if (data.success) {
                        alert("인증 메일이 전송되었습니다. 메일함을 확인해주세요.");
                    } else {
                        alert("메일 전송 실패: " + (data.message || "오류가 발생했습니다."));
                    }
                })
                .catch(error => {
                    console.error("메일 요청 중 오류:", error);
                    alert("서버와의 통신에 실패했습니다.");
                });
        });
    }
});