require 'rubygems'
require 'taza'
require 'active_record'
require 'active_support'

Dir["#{File.dirname(__FILE__)}/derp_bear/models/*.rb"].each {|f| require f}
Dir["#{File.dirname(__FILE__)}/derp_bear/factories/*.rb"].each {|f| require f}

module DerpBear
  include ForwardInitialization

  class DerpBear < ::Taza::Site


    def close
      browser.close
    end
  end
end
