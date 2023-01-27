@smoke
Feature: F07_followUs | users could open followUs links

  Scenario: user opens facebook link
  Given user opens facebook link
  Then www.facebook" is opened in new tab

  Scenario: user opens twitter link
  Given user opens twitter link
  Then verify twitter is opened in new tab

  Scenario: user opens rss link
  Given user opens rss link
  Then verify rss is opened in new tab

  Scenario: user opens youtube link
  Given user opens youtube link
  Then verify youtube is opened in new tab
