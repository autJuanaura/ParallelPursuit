Feature: net Bubble LogIn tests
  
  As a Bubble Automation user, I am required to log in so that hackers are kept out.

  @sce001
  Scenario: initialize a new session successfully
    When User enters username as "Brpb4bq=cdjcnUCBD=" and password as "hW/EyyCDLomcdfvlg=="
    Then The user has been successfully authenticated
