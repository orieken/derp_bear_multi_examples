require 'rubygems'
require 'taza/page'

module DerpBear
  class Notifications < ::Taza::Page

    element(:notice){ browser.div(:id => "flash") }

  end
end
