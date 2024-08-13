# wanted-pre-onboarding-backend
This is the django backend code for the Hidac Article Generation UI.


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


