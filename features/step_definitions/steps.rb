Given(/^I visit derpbear$/) do

end

When(/^I login as a "(.*?)"$/) do |user_type|
  @user = FactoryGirl.build(user_type.to_sym)

  @derp_bear.landing_page.login.click
  @derp_bear.login_page.login_as(@user.username, @user.password)
end

Then(/^I should see the logged in message$/) do
  @derp_bear.notifications.notice.when_present.text.should eql "You are now Logged in."
end

Then(/^I should see "(.*?)"$/) do |arg1|
  pending # express the regexp above with the code you wish you had
end