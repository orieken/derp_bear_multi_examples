require 'spec_helper'
require 'rubygems'

describe 'validate FactoryGirl factories' do
  FactoryGirl.factories.each do |factory|
    context "with factory for :#{factory.name}" do
      subject { FactoryGirl.build(factory.name) }

      it "is valid" do
        db_connection(factory.name)
        subject.should be_true, subject.errors.full_messages
      end
    end
  end
end