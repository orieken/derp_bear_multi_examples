require 'rubygems'
require 'bundler/setup'
require 'rspec'
require 'taza'
require 'watir-webdriver'
require 'pry'
require 'pry-nav'

require "#{File.expand_path(File.join(File.dirname(__FILE__),"..", "..", "lib", "sites"))}/derp_bear.rb"

ENV['TAZA_ENV'] ||= 'heroku'
(ENV['BROWSER'] ||= 'chrome').downcase
(ENV['DRIVER'] ||= 'watir_webdriver').downcase