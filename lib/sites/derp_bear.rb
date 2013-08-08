require 'rubygems'
require 'taza'

Dir["#{File.dirname(__FILE__)}/ove/models/*.rb"].each {|f| require f}
Dir["#{File.dirname(__FILE__)}/ove/factories/*.rb"].each {|f| require f}

module DerpBear
  include ForwardInitialization

  class DerpBear < ::Taza::Site


    def close
      browser.close
    end
  end
end
