

module DerpBear
  class Users
    include ActiveModel::Validations

    attr_accessor :username, :password, :address

    validates_presence_of :username, :password
  end
end

