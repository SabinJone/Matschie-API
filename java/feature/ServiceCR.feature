Feature: Change Request


Scenario: Create a Change Request in Service Now


When Create change request with '{"description": "Hello from Makaia Framework"}'
Then Validate the response as 201


Scenario: Get all Change Request

When get the request which we created with query parameters with sys_param_field  'sys_param_fields' and 'sys_id,short_description'
Then Validate the response for read 200