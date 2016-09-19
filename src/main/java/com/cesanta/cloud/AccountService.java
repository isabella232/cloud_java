// This is a generated file. Not intended for manual editing.
//
// This file is automatically generated with miot clubbygen.
//
// Copyright (c) 2016 Cesanta Software Limited
// All rights reserved
//

package com.cesanta.cloud;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import com.cesanta.clubby.lib.Clubby;
import com.cesanta.clubby.lib.ClubbyOptions;
import com.cesanta.clubby.lib.CmdListener;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Provides methods for managing users. Used by the frontend.
 */
public final class AccountService {

    private final Clubby clubby;
    private ClubbyOptions defaultOpts;

    public static AccountService createInstance(Clubby clubby) {
        return new AccountService(clubby);
    }

    private AccountService(Clubby clubby) {
        this.clubby = clubby;
        this.defaultOpts = clubby.getOptions();
    }


    //-- ConfirmUserRegistration {{{

    /**
     * Confirm the identity (e.g. email) given to RegisterUser by providing a
code sent to the user. This method returns the same info as Login: an
ID and a token.
NOTE: this method can be called from an unauthenticated connection.

     *
     * @param opts
     *      Options instance which will override current default options. If
     *      there is a need to override defaults, use {@link
     *      AccountService#getOptions() getOptions()} to get current defaults, and then
     *      modify received options object in some way.
     */
    public void confirmUserRegistration(
            AccountService.ConfirmUserRegistrationArgs args,
            CmdListener<AccountService.ConfirmUserRegistrationResponse> listener,
            ClubbyOptions opts
            ) {
        clubby.callBackend(
                "/v1/Account.ConfirmUserRegistration",
                args,
                listener,
                AccountService.ConfirmUserRegistrationResponse.class,
                opts
                );
    }

    /**
     * Confirm the identity (e.g. email) given to RegisterUser by providing a
code sent to the user. This method returns the same info as Login: an
ID and a token.
NOTE: this method can be called from an unauthenticated connection.

     */
    public void confirmUserRegistration(
            AccountService.ConfirmUserRegistrationArgs args,
            CmdListener<AccountService.ConfirmUserRegistrationResponse> listener
            ) {
        confirmUserRegistration(args, listener, defaultOpts);
    }

    //-- args {{{

    /**
     * Arguments for the {@link com.cesanta.cloud.AccountService#confirmUserRegistration confirmUserRegistration} method.
     */
    public static final class ConfirmUserRegistrationArgs  {

        /**
         * Confirmation code
         */
        @JsonProperty("code")
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        private String code;


        /**
         * Set confirmation code
         */
        public ConfirmUserRegistrationArgs code(String code) {
            this.code = code;
            return this;
        }

    }


    // }}}

    //-- response {{{

    public static final class ConfirmUserRegistrationResponse  {

        /**
         * ID to be used to authenticate to the API.
         */
        @JsonProperty("id")
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        public String id;

        /**
         * Token to be used to authenticate to the API.
         */
        @JsonProperty("token")
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        public String token;


    }


    // }}}

    // }}}

    //-- CreateGroup {{{

    /**
     * Creates a new group.

     *
     * @param opts
     *      Options instance which will override current default options. If
     *      there is a need to override defaults, use {@link
     *      AccountService#getOptions() getOptions()} to get current defaults, and then
     *      modify received options object in some way.
     */
    public void createGroup(
            AccountService.CreateGroupArgs args,
            CmdListener<AccountService.CreateGroupResponse> listener,
            ClubbyOptions opts
            ) {
        clubby.callBackend(
                "/v1/Account.CreateGroup",
                args,
                listener,
                AccountService.CreateGroupResponse.class,
                opts
                );
    }

    /**
     * Creates a new group.

     */
    public void createGroup(
            AccountService.CreateGroupArgs args,
            CmdListener<AccountService.CreateGroupResponse> listener
            ) {
        createGroup(args, listener, defaultOpts);
    }

    //-- args {{{

    /**
     * Arguments for the {@link com.cesanta.cloud.AccountService#createGroup createGroup} method.
     */
    public static final class CreateGroupArgs  {

        /**
         * ID for the new group.
         */
        @JsonProperty("id")
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        private String id;

        /**
         * An object with labels to set. Object keys are label names, corresponding values are label values to set.
         */
        @JsonProperty("labels")
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        private Map<String, String> labels = new HashMap<String, String>();


        /**
         * Set ID for the new group.
         */
        public CreateGroupArgs id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Add an item to the an object with labels to set. Object keys are label names, corresponding values are label values to set.
         */
        public CreateGroupArgs label(String key, String label) {
            this.labels.put(key, label);
            return this;
        }

    }


    // }}}

    //-- response {{{

    /**
     * Response of the {@link com.cesanta.cloud.AccountService#createGroup createGroup} method.
     */
    public static final class CreateGroupResponse  {


    }


    // }}}

    // }}}

    //-- CreateToken {{{

    /**
     * Generate a personal access token that can be passed in GET parameters instead user/psk pair

     *
     * @param opts
     *      Options instance which will override current default options. If
     *      there is a need to override defaults, use {@link
     *      AccountService#getOptions() getOptions()} to get current defaults, and then
     *      modify received options object in some way.
     */
    public void createToken(
            AccountService.CreateTokenArgs args,
            CmdListener<String> listener,
            ClubbyOptions opts
            ) {
        clubby.callBackend(
                "/v1/Account.CreateToken",
                args,
                listener,
                String.class,
                opts
                );
    }

    /**
     * Generate a personal access token that can be passed in GET parameters instead user/psk pair

     */
    public void createToken(
            AccountService.CreateTokenArgs args,
            CmdListener<String> listener
            ) {
        createToken(args, listener, defaultOpts);
    }

    //-- args {{{

    /**
     * Arguments for the {@link com.cesanta.cloud.AccountService#createToken createToken} method.
     */
    public static final class CreateTokenArgs  {

        /**
         * Optional account ID. If omitted caller is implied.
         */
        @JsonProperty("account")
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        private String account;

        /**
         * Displayed when listing the tokens.
         */
        @JsonProperty("description")
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        private String description;


        /**
         * Set optional account ID. If omitted caller is implied.
         */
        public CreateTokenArgs account(String account) {
            this.account = account;
            return this;
        }

        /**
         * Set displayed when listing the tokens.
         */
        public CreateTokenArgs description(String description) {
            this.description = description;
            return this;
        }

    }


    // }}}

    //-- response {{{

    // }}}

    // }}}

    //-- CreateUser {{{

    /**
     * Creates a new user. Can only be called by the frontend.
     *
     * @param opts
     *      Options instance which will override current default options. If
     *      there is a need to override defaults, use {@link
     *      AccountService#getOptions() getOptions()} to get current defaults, and then
     *      modify received options object in some way.
     */
    public void createUser(
            AccountService.CreateUserArgs args,
            CmdListener<AccountService.CreateUserResponse> listener,
            ClubbyOptions opts
            ) {
        clubby.callBackend(
                "/v1/Account.CreateUser",
                args,
                listener,
                AccountService.CreateUserResponse.class,
                opts
                );
    }

    /**
     * Creates a new user. Can only be called by the frontend.
     */
    public void createUser(
            AccountService.CreateUserArgs args,
            CmdListener<AccountService.CreateUserResponse> listener
            ) {
        createUser(args, listener, defaultOpts);
    }

    //-- args {{{

    /**
     * Arguments for the {@link com.cesanta.cloud.AccountService#createUser createUser} method.
     */
    public static final class CreateUserArgs  {

        /**
         * User's email address.
         */
        @JsonProperty("email")
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        private String email;

        /**
         * ID for the new user.
         */
        @JsonProperty("id")
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        private String id;

        /**
         * An object with labels to set. Object keys are label names, corresponding values are label values to set.
         */
        @JsonProperty("labels")
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        private Map<String, String> labels = new HashMap<String, String>();

        /**
         * Display name for the user.
         */
        @JsonProperty("name")
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        private String name;

        /**
         * Password for the user.
         */
        @JsonProperty("password")
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        private String password;


        /**
         * Set user's email address.
         */
        public CreateUserArgs email(String email) {
            this.email = email;
            return this;
        }

        /**
         * Set ID for the new user.
         */
        public CreateUserArgs id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Add an item to the an object with labels to set. Object keys are label names, corresponding values are label values to set.
         */
        public CreateUserArgs label(String key, String label) {
            this.labels.put(key, label);
            return this;
        }

        /**
         * Set display name for the user.
         */
        public CreateUserArgs name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Set password for the user.
         */
        public CreateUserArgs password(String password) {
            this.password = password;
            return this;
        }

    }


    // }}}

    //-- response {{{

    /**
     * Response of the {@link com.cesanta.cloud.AccountService#createUser createUser} method.
     */
    public static final class CreateUserResponse  {


    }


    // }}}

    // }}}

    //-- DeleteGroup {{{

    /**
     * Deletes a group.

     *
     * @param opts
     *      Options instance which will override current default options. If
     *      there is a need to override defaults, use {@link
     *      AccountService#getOptions() getOptions()} to get current defaults, and then
     *      modify received options object in some way.
     */
    public void deleteGroup(
            AccountService.DeleteGroupArgs args,
            CmdListener<AccountService.DeleteGroupResponse> listener,
            ClubbyOptions opts
            ) {
        clubby.callBackend(
                "/v1/Account.DeleteGroup",
                args,
                listener,
                AccountService.DeleteGroupResponse.class,
                opts
                );
    }

    /**
     * Deletes a group.

     */
    public void deleteGroup(
            AccountService.DeleteGroupArgs args,
            CmdListener<AccountService.DeleteGroupResponse> listener
            ) {
        deleteGroup(args, listener, defaultOpts);
    }

    //-- args {{{

    /**
     * Arguments for the {@link com.cesanta.cloud.AccountService#deleteGroup deleteGroup} method.
     */
    public static final class DeleteGroupArgs  {

        /**
         * ID for the group to be deleted.
         */
        @JsonProperty("id")
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        private String id;


        /**
         * Set ID for the group to be deleted.
         */
        public DeleteGroupArgs id(String id) {
            this.id = id;
            return this;
        }

    }


    // }}}

    //-- response {{{

    /**
     * Response of the {@link com.cesanta.cloud.AccountService#deleteGroup deleteGroup} method.
     */
    public static final class DeleteGroupResponse  {


    }


    // }}}

    // }}}

    //-- GetInfo {{{

    /**
     * Retrieves info about an existing user.
If id is present, info is fetched by id. Otherwise, if name is present, info is fetched by name.
Otherwise, it's an error.

     *
     * @param opts
     *      Options instance which will override current default options. If
     *      there is a need to override defaults, use {@link
     *      AccountService#getOptions() getOptions()} to get current defaults, and then
     *      modify received options object in some way.
     */
    public void getInfo(
            AccountService.GetInfoArgs args,
            CmdListener<AccountService.GetInfoResponse> listener,
            ClubbyOptions opts
            ) {
        clubby.callBackend(
                "/v1/Account.GetInfo",
                args,
                listener,
                AccountService.GetInfoResponse.class,
                opts
                );
    }

    /**
     * Retrieves info about an existing user.
If id is present, info is fetched by id. Otherwise, if name is present, info is fetched by name.
Otherwise, it's an error.

     */
    public void getInfo(
            AccountService.GetInfoArgs args,
            CmdListener<AccountService.GetInfoResponse> listener
            ) {
        getInfo(args, listener, defaultOpts);
    }

    //-- args {{{

    /**
     * Arguments for the {@link com.cesanta.cloud.AccountService#getInfo getInfo} method.
     */
    public static final class GetInfoArgs  {

        /**
         * ID of the user.
         */
        @JsonProperty("id")
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        private String id;

        /**
         * Name of the user.
         */
        @JsonProperty("name")
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        private String name;


        /**
         * Set ID of the user.
         */
        public GetInfoArgs id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Set name of the user.
         */
        public GetInfoArgs name(String name) {
            this.name = name;
            return this;
        }

    }


    // }}}

    //-- response {{{

    public static final class GetInfoResponse  {

        @JsonProperty("email")
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        public String email;

        @JsonProperty("name")
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        public String name;


    }


    // }}}

    // }}}

    //-- GetMembership {{{

    /**
     * Set group membership info.

     *
     * @param opts
     *      Options instance which will override current default options. If
     *      there is a need to override defaults, use {@link
     *      AccountService#getOptions() getOptions()} to get current defaults, and then
     *      modify received options object in some way.
     */
    public void getMembership(
            AccountService.GetMembershipArgs args,
            CmdListener<AccountService.GetMembershipResponse> listener,
            ClubbyOptions opts
            ) {
        clubby.callBackend(
                "/v1/Account.GetMembership",
                args,
                listener,
                AccountService.GetMembershipResponse.class,
                opts
                );
    }

    /**
     * Set group membership info.

     */
    public void getMembership(
            AccountService.GetMembershipArgs args,
            CmdListener<AccountService.GetMembershipResponse> listener
            ) {
        getMembership(args, listener, defaultOpts);
    }

    //-- args {{{

    /**
     * Arguments for the {@link com.cesanta.cloud.AccountService#getMembership getMembership} method.
     */
    public static final class GetMembershipArgs  {

        /**
         * Account ID.
         */
        @JsonProperty("account")
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        private String account;

        /**
         * Group ID.
         */
        @JsonProperty("group")
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        private String group;


        /**
         * Set account ID.
         */
        public GetMembershipArgs account(String account) {
            this.account = account;
            return this;
        }

        /**
         * Set group ID.
         */
        public GetMembershipArgs group(String group) {
            this.group = group;
            return this;
        }

    }


    // }}}

    //-- response {{{

    /**
     * Response of the {@link com.cesanta.cloud.AccountService#getMembership getMembership} method.
     */
    public static final class GetMembershipResponse extends ArrayList<String> {

        static final long serialVersionUID = 1;


    }


    // }}}

    // }}}

    //-- ListGroups {{{

    /**
     * List groups.

     *
     * @param opts
     *      Options instance which will override current default options. If
     *      there is a need to override defaults, use {@link
     *      AccountService#getOptions() getOptions()} to get current defaults, and then
     *      modify received options object in some way.
     */
    public void listGroups(
            AccountService.ListGroupsArgs args,
            CmdListener<AccountService.ListGroupsResponse> listener,
            ClubbyOptions opts
            ) {
        clubby.callBackend(
                "/v1/Account.ListGroups",
                args,
                listener,
                AccountService.ListGroupsResponse.class,
                opts
                );
    }

    /**
     * List groups.

     */
    public void listGroups(
            AccountService.ListGroupsArgs args,
            CmdListener<AccountService.ListGroupsResponse> listener
            ) {
        listGroups(args, listener, defaultOpts);
    }

    //-- args {{{

    /**
     * Arguments for the {@link com.cesanta.cloud.AccountService#listGroups listGroups} method.
     */
    public static final class ListGroupsArgs  {

        /**
         * Optional account name or ID. If omitted sender is implied.
         */
        @JsonProperty("account")
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        private String account;

        /**
         * An object with labels to query for. Object keys are label names, corresponding values are label values.
         */
        @JsonProperty("labels")
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        private Map<String, String> labels = new HashMap<String, String>();


        /**
         * Set optional account name or ID. If omitted sender is implied.
         */
        public ListGroupsArgs account(String account) {
            this.account = account;
            return this;
        }

        /**
         * Add an item to the an object with labels to query for. Object keys are label names, corresponding values are label values.
         */
        public ListGroupsArgs label(String key, String label) {
            this.labels.put(key, label);
            return this;
        }

    }


    // }}}

    //-- response {{{

    /**
     * Response of the {@link com.cesanta.cloud.AccountService#listGroups listGroups} method.
     */
    public static final class ListGroupsResponse extends ArrayList<String> {

        static final long serialVersionUID = 1;


    }


    // }}}

    // }}}

    //-- ListTokens {{{

    /**
     * List tokens.

     *
     * @param opts
     *      Options instance which will override current default options. If
     *      there is a need to override defaults, use {@link
     *      AccountService#getOptions() getOptions()} to get current defaults, and then
     *      modify received options object in some way.
     */
    public void listTokens(
            AccountService.ListTokensArgs args,
            CmdListener<AccountService.ListTokensResponse> listener,
            ClubbyOptions opts
            ) {
        clubby.callBackend(
                "/v1/Account.ListTokens",
                args,
                listener,
                AccountService.ListTokensResponse.class,
                opts
                );
    }

    /**
     * List tokens.

     */
    public void listTokens(
            AccountService.ListTokensArgs args,
            CmdListener<AccountService.ListTokensResponse> listener
            ) {
        listTokens(args, listener, defaultOpts);
    }

    //-- args {{{

    /**
     * Arguments for the {@link com.cesanta.cloud.AccountService#listTokens listTokens} method.
     */
    public static final class ListTokensArgs  {

        /**
         * Account ID. If omitted caller is implied.
         */
        @JsonProperty("account")
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        private String account;


        /**
         * Set account ID. If omitted caller is implied.
         */
        public ListTokensArgs account(String account) {
            this.account = account;
            return this;
        }

    }


    // }}}

    //-- response {{{

    /**
     * Response of the {@link com.cesanta.cloud.AccountService#listTokens listTokens} method.
     */
    public static final class ListTokensResponse extends ArrayList<ListTokensResponseItem> {

        static final long serialVersionUID = 1;


    }


    public static final class ListTokensResponseItem  {

        @JsonProperty("description")
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        public String description;

        @JsonProperty("id")
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        public String id;

        @JsonProperty("token")
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        public String token;


    }


    // }}}

    // }}}

    //-- Login {{{

    /**
     * Log in with username+password.

Returns the credentials (ID + token) required to access the API.
NOTE: this method can be called from an unauthenticated connection.

     *
     * @param opts
     *      Options instance which will override current default options. If
     *      there is a need to override defaults, use {@link
     *      AccountService#getOptions() getOptions()} to get current defaults, and then
     *      modify received options object in some way.
     */
    public void login(
            AccountService.LoginArgs args,
            CmdListener<AccountService.LoginResponse> listener,
            ClubbyOptions opts
            ) {
        clubby.callBackend(
                "/v1/Account.Login",
                args,
                listener,
                AccountService.LoginResponse.class,
                opts
                );
    }

    /**
     * Log in with username+password.

Returns the credentials (ID + token) required to access the API.
NOTE: this method can be called from an unauthenticated connection.

     */
    public void login(
            AccountService.LoginArgs args,
            CmdListener<AccountService.LoginResponse> listener
            ) {
        login(args, listener, defaultOpts);
    }

    //-- args {{{

    /**
     * Arguments for the {@link com.cesanta.cloud.AccountService#login login} method.
     */
    public static final class LoginArgs  {

        /**
         * Password.
         */
        @JsonProperty("password")
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        private String password;

        /**
         * Username (usually the email address).
         */
        @JsonProperty("username")
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        private String username;


        /**
         * Set password.
         */
        public LoginArgs password(String password) {
            this.password = password;
            return this;
        }

        /**
         * Set username (usually the email address).
         */
        public LoginArgs username(String username) {
            this.username = username;
            return this;
        }

    }


    // }}}

    //-- response {{{

    public static final class LoginResponse  {

        /**
         * ID to be used to authenticate to the API.
         */
        @JsonProperty("id")
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        public String id;

        /**
         * Token to be used to authenticate to the API.
         */
        @JsonProperty("token")
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        public String token;


    }


    // }}}

    // }}}

    //-- RegisterUser {{{

    /**
     * Register a new user. It sends the confirmation code to the email.
NOTE: this method can be called from an unauthenticated connection.

     *
     * @param opts
     *      Options instance which will override current default options. If
     *      there is a need to override defaults, use {@link
     *      AccountService#getOptions() getOptions()} to get current defaults, and then
     *      modify received options object in some way.
     */
    public void registerUser(
            AccountService.RegisterUserArgs args,
            CmdListener<AccountService.RegisterUserResponse> listener,
            ClubbyOptions opts
            ) {
        clubby.callBackend(
                "/v1/Account.RegisterUser",
                args,
                listener,
                AccountService.RegisterUserResponse.class,
                opts
                );
    }

    /**
     * Register a new user. It sends the confirmation code to the email.
NOTE: this method can be called from an unauthenticated connection.

     */
    public void registerUser(
            AccountService.RegisterUserArgs args,
            CmdListener<AccountService.RegisterUserResponse> listener
            ) {
        registerUser(args, listener, defaultOpts);
    }

    //-- args {{{

    /**
     * Arguments for the {@link com.cesanta.cloud.AccountService#registerUser registerUser} method.
     */
    public static final class RegisterUserArgs  {

        /**
         * email
         */
        @JsonProperty("email")
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        private String email;

        /**
         * An object with labels to set. Object keys are label names, corresponding values are label values to set. Users are encouraged to set at least 2 labels: "name" (which is a real name like "Jack London") and "company".
         */
        @JsonProperty("labels")
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        private Map<String, String> labels = new HashMap<String, String>();

        @JsonProperty("password")
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        private String password;

        /**
         * Optional username. If omitted, the email will be used as username.
         */
        @JsonProperty("username")
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        private String username;


        /**
         * Set email
         */
        public RegisterUserArgs email(String email) {
            this.email = email;
            return this;
        }

        /**
         * Add an item to the an object with labels to set. Object keys are label names, corresponding values are label values to set. Users are encouraged to set at least 2 labels: "name" (which is a real name like "Jack London") and "company".
         */
        public RegisterUserArgs label(String key, String label) {
            this.labels.put(key, label);
            return this;
        }

        /**
         * Set password
         */
        public RegisterUserArgs password(String password) {
            this.password = password;
            return this;
        }

        /**
         * Set optional username. If omitted, the email will be used as username.
         */
        public RegisterUserArgs username(String username) {
            this.username = username;
            return this;
        }

    }


    // }}}

    //-- response {{{

    public static final class RegisterUserResponse  {

        /**
         * Number of seconds after which the code sent to the email will be
expired.

         */
        @JsonProperty("expiresInSeconds")
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        public Long expiresInSeconds;


    }


    // }}}

    // }}}

    //-- RevokeToken {{{

    /**
     * Delete the token.

     *
     * @param opts
     *      Options instance which will override current default options. If
     *      there is a need to override defaults, use {@link
     *      AccountService#getOptions() getOptions()} to get current defaults, and then
     *      modify received options object in some way.
     */
    public void revokeToken(
            AccountService.RevokeTokenArgs args,
            CmdListener<AccountService.RevokeTokenResponse> listener,
            ClubbyOptions opts
            ) {
        clubby.callBackend(
                "/v1/Account.RevokeToken",
                args,
                listener,
                AccountService.RevokeTokenResponse.class,
                opts
                );
    }

    /**
     * Delete the token.

     */
    public void revokeToken(
            AccountService.RevokeTokenArgs args,
            CmdListener<AccountService.RevokeTokenResponse> listener
            ) {
        revokeToken(args, listener, defaultOpts);
    }

    //-- args {{{

    /**
     * Arguments for the {@link com.cesanta.cloud.AccountService#revokeToken revokeToken} method.
     */
    public static final class RevokeTokenArgs  {

        @JsonProperty("id")
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        private String id;


        /**
         * Set id
         */
        public RevokeTokenArgs id(String id) {
            this.id = id;
            return this;
        }

    }


    // }}}

    //-- response {{{

    /**
     * Response of the {@link com.cesanta.cloud.AccountService#revokeToken revokeToken} method.
     */
    public static final class RevokeTokenResponse  {


    }


    // }}}

    // }}}

    //-- SetMembership {{{

    /**
     * Set group membership.
To remove an account from a group pass an empty roles list

     *
     * @param opts
     *      Options instance which will override current default options. If
     *      there is a need to override defaults, use {@link
     *      AccountService#getOptions() getOptions()} to get current defaults, and then
     *      modify received options object in some way.
     */
    public void setMembership(
            AccountService.SetMembershipArgs args,
            CmdListener<AccountService.SetMembershipResponse> listener,
            ClubbyOptions opts
            ) {
        clubby.callBackend(
                "/v1/Account.SetMembership",
                args,
                listener,
                AccountService.SetMembershipResponse.class,
                opts
                );
    }

    /**
     * Set group membership.
To remove an account from a group pass an empty roles list

     */
    public void setMembership(
            AccountService.SetMembershipArgs args,
            CmdListener<AccountService.SetMembershipResponse> listener
            ) {
        setMembership(args, listener, defaultOpts);
    }

    //-- args {{{

    /**
     * Arguments for the {@link com.cesanta.cloud.AccountService#setMembership setMembership} method.
     */
    public static final class SetMembershipArgs  {

        /**
         * Account ID.
         */
        @JsonProperty("account")
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        private String account;

        /**
         * Group ID.
         */
        @JsonProperty("group")
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        private String group;

        /**
         * List of role names.
         */
        @JsonProperty("roles")
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        private List<String> roles = new ArrayList<String>();


        /**
         * Set account ID.
         */
        public SetMembershipArgs account(String account) {
            this.account = account;
            return this;
        }

        /**
         * Set group ID.
         */
        public SetMembershipArgs group(String group) {
            this.group = group;
            return this;
        }

        /**
         * Add an item to the list of role names.
         */
        public SetMembershipArgs role(String role) {
            this.roles.add(role);
            return this;
        }

    }


    // }}}

    //-- response {{{

    /**
     * Response of the {@link com.cesanta.cloud.AccountService#setMembership setMembership} method.
     */
    public static final class SetMembershipResponse  {


    }


    // }}}

    // }}}

    //-- UserExists {{{

    /**
     * Returns whether the user exists.

     *
     * @param opts
     *      Options instance which will override current default options. If
     *      there is a need to override defaults, use {@link
     *      AccountService#getOptions() getOptions()} to get current defaults, and then
     *      modify received options object in some way.
     */
    public void userExists(
            AccountService.UserExistsArgs args,
            CmdListener<AccountService.UserExistsResponse> listener,
            ClubbyOptions opts
            ) {
        clubby.callBackend(
                "/v1/Account.UserExists",
                args,
                listener,
                AccountService.UserExistsResponse.class,
                opts
                );
    }

    /**
     * Returns whether the user exists.

     */
    public void userExists(
            AccountService.UserExistsArgs args,
            CmdListener<AccountService.UserExistsResponse> listener
            ) {
        userExists(args, listener, defaultOpts);
    }

    //-- args {{{

    /**
     * Arguments for the {@link com.cesanta.cloud.AccountService#userExists userExists} method.
     */
    public static final class UserExistsArgs  {

        /**
         * ID of the user.
         */
        @JsonProperty("id")
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        private String id;

        /**
         * Name of the user.
         */
        @JsonProperty("name")
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        private String name;


        /**
         * Set ID of the user.
         */
        public UserExistsArgs id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Set name of the user.
         */
        public UserExistsArgs name(String name) {
            this.name = name;
            return this;
        }

    }


    // }}}

    //-- response {{{

    public static final class UserExistsResponse  {

        @JsonProperty("exists")
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        public Boolean exists;


    }


    // }}}

    // }}}

    //-- ValidateToken {{{

    /**
     * Validates a token and returns the user ID associated with it.

     *
     * @param opts
     *      Options instance which will override current default options. If
     *      there is a need to override defaults, use {@link
     *      AccountService#getOptions() getOptions()} to get current defaults, and then
     *      modify received options object in some way.
     */
    public void validateToken(
            AccountService.ValidateTokenArgs args,
            CmdListener<AccountService.ValidateTokenResponse> listener,
            ClubbyOptions opts
            ) {
        clubby.callBackend(
                "/v1/Account.ValidateToken",
                args,
                listener,
                AccountService.ValidateTokenResponse.class,
                opts
                );
    }

    /**
     * Validates a token and returns the user ID associated with it.

     */
    public void validateToken(
            AccountService.ValidateTokenArgs args,
            CmdListener<AccountService.ValidateTokenResponse> listener
            ) {
        validateToken(args, listener, defaultOpts);
    }

    //-- args {{{

    /**
     * Arguments for the {@link com.cesanta.cloud.AccountService#validateToken validateToken} method.
     */
    public static final class ValidateTokenArgs  {

        @JsonProperty("token")
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        private String token;


        /**
         * Set token
         */
        public ValidateTokenArgs token(String token) {
            this.token = token;
            return this;
        }

    }


    // }}}

    //-- response {{{

    public static final class ValidateTokenResponse  {

        @JsonProperty("account")
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        public String account;


    }


    // }}}

    // }}}


    public void setDefaultOptions(ClubbyOptions opts) {
        this.defaultOpts = ClubbyOptions.createFrom(opts);
    }

    public ClubbyOptions getOptions() {
        return ClubbyOptions.createFrom(defaultOpts);
    }
}

