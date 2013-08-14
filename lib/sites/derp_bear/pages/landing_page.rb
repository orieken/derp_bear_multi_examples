require 'rubygems'
require 'taza/page'

module DerpBear
  class LandingPage < ::Taza::Page
    element(:login) { browser.link(id: "login_link") }

  end
end
