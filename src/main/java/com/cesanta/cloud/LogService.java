
package com.cesanta.cloud;

// GENERATED FILE DO NOT EDIT
// This file is automatically generated with clubbygen.

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
 * Log service allows clients to log events
 */
public final class LogService {

    private final Clubby clubby;
    private ClubbyOptions defaultOpts;

    public static LogService createInstance(Clubby clubby) {
        return new LogService(clubby);
    }

    private LogService(Clubby clubby) {
        this.clubby = clubby;
        this.defaultOpts = clubby.getOptions();
    }


    //-- List {{{

    /**
     * Returns a list of log entries generated by a specified source id. Each log entry contains an "id" field suitable to be used as a continuation token for the optional "after" argument.
     *
     * @param opts
     *      Options instance which will override current default options. If
     *      there is a need to override defaults, use {@link
     *      LogService#getOptions() getOptions()} to get current defaults, and then
     *      modify received options object in some way.
     */
    public void list(
            LogService.ListArgs args,
            CmdListener<LogService.ListResponse> listener,
            ClubbyOptions opts
            ) {
        clubby.callBackend(
                "/v1/Log.List",
                args,
                listener,
                LogService.ListResponse.class,
                opts
                );
    }

    /**
     * Returns a list of log entries generated by a specified source id. Each log entry contains an "id" field suitable to be used as a continuation token for the optional "after" argument.
     */
    public void list(
            LogService.ListArgs args,
            CmdListener<LogService.ListResponse> listener
            ) {
        list(args, listener, defaultOpts);
    }

    //-- args {{{

    /**
     * Arguments for the {@link com.cesanta.cloud.LogService#list list} method.
     */
    public static final class ListArgs  {

        /**
         * Continuation token. Put here an `id` of the last entry returned by the previous call.
         */
        @JsonProperty("after")
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        private String after;

        /**
         * Whether this call will block until there are some logs to be returned.
         */
        @JsonProperty("follow")
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        private Boolean follow;

        /**
         * Maximum number of entries to return.
         */
        @JsonProperty("limit")
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        private Long limit;

        /**
         * ID of an entity that generated log entries that you want to fetch.
         */
        @JsonProperty("src")
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        private String src;

        /**
         * Log stream name.
         */
        @JsonProperty("stream")
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        private String stream;


        /**
         * Set continuation token. Put here an `id` of the last entry returned by the previous call.
         */
        public ListArgs after(String after) {
            this.after = after;
            return this;
        }

        /**
         * Set whether this call will block until there are some logs to be returned.
         */
        public ListArgs follow(boolean follow) {
            this.follow = follow;
            return this;
        }

        /**
         * Set maximum number of entries to return.
         */
        public ListArgs limit(long limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Set ID of an entity that generated log entries that you want to fetch.
         */
        public ListArgs src(String src) {
            this.src = src;
            return this;
        }

        /**
         * Set log stream name.
         */
        public ListArgs stream(String stream) {
            this.stream = stream;
            return this;
        }

    }


    // }}}

    //-- response {{{

    /**
     * Response of the {@link com.cesanta.cloud.LogService#list list} method.
     */
    public static final class ListResponse extends ArrayList<ListResponseItem> {

        static final long serialVersionUID = 1;


    }


    public static final class ListResponseItem  {

        @JsonProperty("id")
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        public String id;

        @JsonProperty("msg")
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        public Object msg = null;

        @JsonProperty("stream")
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        public String stream;

        @JsonProperty("timestamp")
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        public Long timestamp;


    }


    // }}}

    // }}}

    //-- Log {{{

    /**
     * Records a log entry associated with the src id. If not provided stream defaults to "console". Timestamp is server generated if omitted, otherwise is milliseconds from epoch UTC.
     *
     * @param opts
     *      Options instance which will override current default options. If
     *      there is a need to override defaults, use {@link
     *      LogService#getOptions() getOptions()} to get current defaults, and then
     *      modify received options object in some way.
     */
    public void log(
            LogService.LogArgs args,
            CmdListener<LogService.LogResponse> listener,
            ClubbyOptions opts
            ) {
        clubby.callBackend(
                "/v1/Log.Log",
                args,
                listener,
                LogService.LogResponse.class,
                opts
                );
    }

    /**
     * Records a log entry associated with the src id. If not provided stream defaults to "console". Timestamp is server generated if omitted, otherwise is milliseconds from epoch UTC.
     */
    public void log(
            LogService.LogArgs args,
            CmdListener<LogService.LogResponse> listener
            ) {
        log(args, listener, defaultOpts);
    }

    //-- args {{{

    /**
     * Arguments for the {@link com.cesanta.cloud.LogService#log log} method.
     */
    public static final class LogArgs  {

        /**
         * Message to log.
         */
        @JsonProperty("msg")
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        private Object msg = null;

        /**
         * Override src id. Used to log on behalf of another source, if permitted.
         */
        @JsonProperty("src")
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        private String src;

        /**
         * Log stream name. Defaults to `"console"`.
         */
        @JsonProperty("stream")
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        private String stream;

        /**
         * Timestamp of a message in milliseconds since Epoch.
         */
        @JsonProperty("timestamp")
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        private Long timestamp;


        /**
         * Set message to log.
         */
        public LogArgs msg(Object msg) {
            this.msg = msg;
            return this;
        }

        /**
         * Set override src id. Used to log on behalf of another source, if permitted.
         */
        public LogArgs src(String src) {
            this.src = src;
            return this;
        }

        /**
         * Set log stream name. Defaults to `"console"`.
         */
        public LogArgs stream(String stream) {
            this.stream = stream;
            return this;
        }

        /**
         * Set timestamp of a message in milliseconds since Epoch.
         */
        public LogArgs timestamp(long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

    }


    // }}}

    //-- response {{{

    /**
     * Response of the {@link com.cesanta.cloud.LogService#log log} method.
     */
    public static final class LogResponse  {


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

