require 'factory_girl'

FactoryGirl.define do
  factory :valid, class: DerpBear::Users do
    username "Bond"
    password "007"
    address "1234"

    factory :invalid do
      username "hi"
      password "ohno"
    end
  end
end