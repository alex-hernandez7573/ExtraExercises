"use strict"

let userList = [
    {
        isAdmin: true,
        email: 'user1@email.com'
    },
    {
        isAdmin: true,
        email: 'user2@email.com'
    },
    {
        isAdmin: false,
        email: 'user3@email.com'
    }
];

userList.forEach(function (user){
    if (user.isAdmin == true) {
        console.log( user.email);
    }
})