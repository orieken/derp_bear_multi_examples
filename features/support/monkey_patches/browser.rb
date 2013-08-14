module Taza
  class Browser
    def self.create_watir_webdriver(params)
      require 'watir-webdriver'
      if ENV['BROWSER'] == 'android'
        browser = Watir::Browser.new params[:browser]
      elsif ENV['BROWSER'] == 'iphone'
        capabilities = {
            'browserName' => 'iOS',
            'platform' => 'Mac',
            'version' => '6.1',
            'app' => 'safari'
        }
        server_url = "http://127.0.0.1:4723/wd/hub"

        driver = Selenium::WebDriver.for(:remote, :desired_capabilities => capabilities, :url => server_url)
        browser = Watir::Browser.new driver
      end

    end
  end
end





