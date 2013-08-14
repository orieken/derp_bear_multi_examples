require 'factory_girl'


Dir["#{File.dirname(__FILE__)}/../lib/sites/*.rb"].each {|f| require f}
Dir["#{File.dirname(__FILE__)}/factories/*.rb"].each {|f| require f}


p Dir["#{File.dirname(__FILE__)}/factories/*.rb"]