## Instructions

The goal of this exercise is to create a project that tests the given web application using *Katalon*.

### The Task
You will be creating a series of test suites, based on the requirements written below, using the following application: [dev-find-the-bank-app.herokuapp.com](https://dev-find-the-bank-app.herokuapp.com/)

### Features and Requirements
You should navigate to the aforementioned link in the section above. There are 3 testing suites to take into account.

##### First Testing Flow: Valid submission
1. Upon loading the page, there will be a form requesting a full name. The input should be "John Doe" and the "Next" button should be clicked, directing the user to the form flow.
2. Four steps will be presented in the form flow, each containing fields for input and/or selection.
2.1 **Financing**: select the Stabilized acquisition option. Two fields will render (Purchase Price and Capex Budget). Both of these fields should have a value of 250,000 and 20,000 respectively.
2.2 **The Project**: A series of radio buttons will be rendered alongisde an address input field. The "Multifamily" option should be selected. And for the Address field, "Miami, Florida, USA" should be inputted, which will then render a dropdown with a series of options - the first option should be selected.
2.3 **Additional Info**: A series of checkbox buttons will be rendered on the screen. The "Low Occupancy Level" option should be selected.
2.4 **Personal**: A total of 5 fields will be presented to the user. The Email address field should contain the value "test@email.com". The Cell Phone field should contain the value "78143500001". The "Do you own any other commercial real estate?" field should have the option "Yes" selected. The "What's your estimated net worth?" field should have a value of "1,000,000" inputted. The "Anything else you'd like us to know before we get in touch with you? (optional)" textarea should have a value of "Lorem ipsum".
3. Upon final input of these values, the "Complete Submission" button will be enabled and the user will be redirected to a "Thank You" page. A button at the bottom written "Continue to the homepage" will be appear. The user should be able to click on this button and be redirected to the home page.

##### Second testing flow: Invalid values
- The variation in this flow is regarding the final step: **Personal**. There are two fields with validations. The Email Address field should be flagged as invalid if the input has the following format: "test@"". The Phone number field should be flagged as invalid if it has the following value: "4444". Both or either of these invalid values should prevent the user from completing the submission.

##### Third testing flow: Optional textarea
- The variation in this flow is regarding the textarea field labeled: "Anything else you'd like us to know before we get in touch with you? (optional)". As indicated by the label, this field is optional. If this field is empty, it shouldn't block the user from proceeding with the submission.

### Notes:
At each step in the form flow, the user can only proceed through the "Next" button located at the bottom of the page. The "Next" button will only be enabled if there are values inputted for each field in the step.

## Evaluation
| Functionality     |                                                                | Possible Points |
|-------------------|----------------------------------------------------------------|-----------------|
|                   | Matches the proposed requirements                              |              20 |
| **Code Quality**  |                                                                |                 |
|                   | Code formatting, readability, maintainability, etc             |               5 |
|                   | Folders and packages structure                                 |               5 |
| **Documentation** |                                                                |                 |
|                   | Documentation about the work done, how to run the project, etc |               5 |
| **Total**         |                                                                |             100 |


### Bonus Points:
1. If you provide thoughts on what you could improve on your testing suites if given more time;
2. If you provide thoughts on other scenarios for testing the form flows should cover;

## F.A.Q.

### How do you evaluate the exercise?
For every exercise we have a QA engineer from our team reviewing the solution and giving a score for each line item as shown in the previous table.

### How can I deliver the exercise?
To deliver the exercise, you should clone this repository and work on a new branch. When you've considered it completed, just push the branch and open a Merge Request.

### Will I have access to the evaluation?
By default we only send the result, however you can feel free to request the full evaluation and we will share it with you as well as the final score.

