# wanted-pre-onboarding-backend
## 서비스 개요

- 본 서비스는 기업의 채용을 위한 웹 서비스 입니다.
- 회사는 채용공고를 생성하고, 이에 사용자는 지원합니다.

## Accessing the database
The state of the database can be checked as follows:

   * run the django backend as specified above
   
   * navigate to `jdbc:mysql://localhost:3306/wanted`
   
   * login with the following credentials (will be updated for the future)
   
     ```
         username: wanted_admin
         password: admin_1234
     ```
        

## API endpoints
The API endpoints for the backend are as follows.

### 채용공고 등록 API
   * `/api/recruitments`
      - method: POST

   ```json
   request json
      {
  "id": 0,
  "companyId": 0,
  "position": "string",
  "reward": 0,
  "description": "string",
  "skills": "string"
}

   response json
   {
  "id": 6,
  "companyId": 0,
  "position": "string",
  "reward": 0,
  "description": "string",
  "skills": "string"
}
   ``` 


