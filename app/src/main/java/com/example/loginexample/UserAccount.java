package com.example.loginexample;

/**
 * 사용자 계정 정보 모델 클래스
 * 닉네임 저장 또는 프로플 url 등은 여기서 수정 또는 저장 가능
 */
public class UserAccount
{
    private String idToken; //Firebase Uid (고유 토큰 정보)
    private String emailId; //이메일 아이디
    private String password; // 비밀번호

    public UserAccount(){ } //Firebase는  빈 생성자를 만들어줘야 데이터조회를 할 때 오류가 안남

    public String getIdToken()
    {
        return idToken;
    }

    public void setIdToken(String idToken)
    {
        this.idToken = idToken;
    }


    public String getEmailId()
    {
        return emailId;

    }
    public void setEmailId(String emailId)
    {
        this.emailId = emailId;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

}
