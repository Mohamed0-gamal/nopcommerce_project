@smoke
  Feature:user could search using product name
    Scenario:
     Given Write the word book inside the search place
      Then Make sure that  pressure on the search button appears for the search URL
        Then Count number of search results
    Scenario: user could search using product SUK
      Given Write the word SUK inside the search place
      Then Click The search button in dynamic list drop
      And Verify the product SUK inside the page






