require 'rubygems'
require 'taza/page'

module DerpBear
  class LoginPage < ::Taza::Page

    element(:username) { browser.text_field(id: "username") }
    element(:password) { browser.text_field(id: "password") }
    element(:login) { browser.button(id: "submit") }


    def login_as(user_name="Bond", pass_word = "007")

      username.when_present.set user_name
      password.set pass_word
      login.click
    end



  end
end

