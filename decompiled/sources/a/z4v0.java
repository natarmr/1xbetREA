package a;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class z4v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sa3 f43791a;
    public static final sa3 b;
    public static final sa3 c;
    public static final sa3 d;

    static {
        new sa3("VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK", (byte) 0);
        new sa3("OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER", (byte) 0);
        new sa3("SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE", (byte) 4);
        new sa3("DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS", (byte) 1);
        new sa3("START_SAFE_BROWSING", "START_SAFE_BROWSING", (byte) 5);
        new sa3("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST", (byte) 5);
        new sa3("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST", (byte) 5);
        new sa3("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST", (byte) 5);
        new sa3("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST", (byte) 5);
        new sa3("SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL", (byte) 5);
        new sa3("SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE", (byte) 1);
        new sa3("SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE", (byte) 1);
        new sa3("SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS", (byte) 1);
        new sa3("SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS", (byte) 1);
        new sa3("SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS", (byte) 1);
        new sa3("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", (byte) 1);
        new sa3("RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR", (byte) 0);
        new sa3("RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR", (byte) 0);
        new sa3("SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS", (byte) 1);
        new sa3("SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT", (byte) 5);
        new sa3("WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT", (byte) 1);
        new sa3("WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION", (byte) 0);
        new sa3("WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE", (byte) 0);
        new sa3("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", (byte) 5);
        new sa3("SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED", (byte) 5);
        new sa3("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", (byte) 5);
        new sa3("WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE", (byte) 0);
        new sa3("WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE", (byte) 0);
        new sa3("WEB_MESSAGE_ARRAY_BUFFER", "WEB_MESSAGE_ARRAY_BUFFER", (byte) 2);
        new sa3("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", (byte) 0);
        new sa3("CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL", (byte) 0);
        new sa3("POST_WEB_MESSAGE", "POST_WEB_MESSAGE", (byte) 0);
        new sa3("WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE", (byte) 0);
        new sa3("GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT", (byte) 4);
        new sa3("GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT", (byte) 4);
        new sa3("GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER", (byte) 7);
        new sa3("WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE", (byte) 7);
        new sa3("TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE", (byte) 6);
        new q6m0();
        new q6m0();
        new q6m0();
        new sa3("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", (byte) 7);
        new x4v0();
        new sa3("PROXY_OVERRIDE", "PROXY_OVERRIDE:3", (byte) 2);
        f43791a = new sa3("MULTI_PROCESS", "MULTI_PROCESS_QUERY", (byte) 2);
        new sa3("FORCE_DARK", "FORCE_DARK", (byte) 7);
        new sa3("FORCE_DARK_STRATEGY", "FORCE_DARK_BEHAVIOR", (byte) 2);
        new sa3("WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER", (byte) 2);
        new sa3("DOCUMENT_START_SCRIPT", "DOCUMENT_START_SCRIPT:1", (byte) 2);
        new sa3("PROXY_OVERRIDE_REVERSE_BYPASS", "PROXY_OVERRIDE_REVERSE_BYPASS", (byte) 2);
        new sa3("GET_VARIATIONS_HEADER", "GET_VARIATIONS_HEADER", (byte) 2);
        new sa3("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", (byte) 2);
        new sa3("GET_COOKIE_INFO", "GET_COOKIE_INFO", (byte) 2);
        new sa3("REQUESTED_WITH_HEADER_ALLOW_LIST", "REQUESTED_WITH_HEADER_ALLOW_LIST", (byte) 2);
        new sa3("USER_AGENT_METADATA", "USER_AGENT_METADATA", (byte) 2);
        new y4v0("USER_AGENT_METADATA_FORM_FACTORS", "USER_AGENT_METADATA", (byte) 0);
        new y4v0("MULTI_PROFILE", "MULTI_PROFILE", (byte) 1);
        new sa3("ATTRIBUTION_REGISTRATION_BEHAVIOR", "ATTRIBUTION_BEHAVIOR", (byte) 2);
        new sa3("WEBVIEW_MEDIA_INTEGRITY_API_STATUS", "WEBVIEW_INTEGRITY_API_STATUS", (byte) 2);
        b = new sa3("MUTE_AUDIO", "MUTE_AUDIO", (byte) 2);
        new sa3("WEB_AUTHENTICATION", "WEB_AUTHENTICATION", (byte) 2);
        new sa3("SPECULATIVE_LOADING_STATUS", "SPECULATIVE_LOADING", (byte) 2);
        new sa3("BACK_FORWARD_CACHE", "BACK_FORWARD_CACHE", (byte) 2);
        new sa3("BACK_FORWARD_CACHE_SETTINGS", "BACK_FORWARD_CACHE_SETTINGS", (byte) 2);
        new sa3("BACK_FORWARD_CACHE_SETTINGS_EXPERIMENTAL_V3", "BACK_FORWARD_CACHE_SETTINGS_V3", (byte) 2);
        new sa3("BACK_FORWARD_CACHE_SETTINGS_EXPERIMENTAL_V4", "BACK_FORWARD_CACHE_SETTINGS_V4", (byte) 2);
        new sa3("DELETE_BROWSING_DATA", "WEB_STORAGE_DELETE_BROWSING_DATA", (byte) 2);
        String str = "PREFETCH_URL_V5";
        new y4v0(str, "PREFETCH_URL_V5", (byte) 2);
        new sa3("ASYNC_WEBVIEW_STARTUP_V2");
        new sa3("ASYNC_WEBVIEW_STARTUP");
        new sa3("ASYNC_WEBVIEW_STARTUP_ASYNC_STARTUP_LOCATIONS");
        new sa3("DEFAULT_TRAFFICSTATS_TAGGING", "DEFAULT_TRAFFICSTATS_TAGGING", (byte) 2);
        new sa3("PRERENDER_URL_V2", "PRERENDER_URL_V3", (byte) 2);
        new sa3("SPECULATIVE_LOADING_CONFIG_V2", "SPECULATIVE_LOADING_CONFIG_V2", (byte) 2);
        new sa3("PREFETCH_CACHE_V1", "PREFETCH_CACHE_V1", (byte) 2);
        new sa3("PREFETCH_WITH_CALLBACK_RESULT_V1");
        new sa3("SET_MAX_PRERENDERS_V1", "SET_MAX_PRERENDERS_V1", (byte) 2);
        new sa3("SAVE_STATE", "SAVE_STATE", (byte) 2);
        new sa3("NAVIGATION_GET_WEB_RESOURCE_ERROR", "NAVIGATION_GET_WEB_RESOURCE_ERROR", (byte) 2);
        new sa3("NAVIGATION_LISTENER", "PAGE_GET_URL", (byte) 2);
        c = new sa3("PROVIDER_WEAKLY_REF_WEBVIEW", "PROVIDER_WEAKLY_REF_WEBVIEW", (byte) 2);
        d = new sa3("PAYMENT_REQUEST", "PAYMENT_REQUEST", (byte) 2);
        new sa3("WEBVIEW_BUILDER_EXPERIMENTAL_V1", "WEBVIEW_BUILDER_V1", (byte) 2);
        new sa3("WEBVIEW_BUILDER_EXPERIMENTAL_V2", "WEBVIEW_BUILDER_V2", (byte) 2);
        new sa3("COOKIE_INTERCEPT", "COOKIE_INTERCEPT", (byte) 2);
        new sa3("WARM_UP_RENDERER_PROCESS", "WARM_UP_RENDERER_PROCESS", (byte) 2);
        new sa3("CUSTOM_REQUEST_HEADERS", "CUSTOM_REQUEST_HEADERS", (byte) 2);
        new q6m0();
        new q6m0();
        new q6m0();
        new sa3("PRECONNECT", "PRECONNECT", (byte) 2);
        new sa3("ENQUEUE_PRECONNECT", "ENQUEUE_PRECONNECT", (byte) 2);
        new sa3("ADD_QUIC_HINTS", "ADD_QUIC_HINTS_V1", (byte) 2);
        new sa3("HYPERLINK_CONTEXT_MENU_ITEMS", "HYPERLINK_CONTEXT_MENU_ITEMS", (byte) 2);
        new sa3("JS_INJECTION_IN_FRAME_AND_WORLD", "JS_INJECTION_IN_FRAME_AND_WORLD", (byte) 2);
        new sa3("WEBVIEW_NAVIGATE_EXPERIMENTAL_V1", "WEBVIEW_NAVIGATE_V1", (byte) 2);
        new sa3("DOWNLOAD_FAVICONS_ENABLED", "DOWNLOAD_FAVICONS_ENABLED", (byte) 2);
        new sa3("HTTP_CACHE_MANAGER", "HTTP_CACHE_MANAGER", (byte) 2);
    }

    public static boolean a(String str) {
        Set<ta3> setUnmodifiableSet = Collections.unmodifiableSet(ta3.c);
        HashSet<ta3> hashSet = new HashSet();
        for (ta3 ta3Var : setUnmodifiableSet) {
            if (ta3Var.f33595a.equals(str)) {
                hashSet.add(ta3Var);
            }
        }
        if (hashSet.isEmpty()) {
            itt0.k("Unknown feature ".concat(str));
            return false;
        }
        for (ta3 ta3Var2 : hashSet) {
            if (ta3Var2.a() || ta3Var2.b()) {
                return true;
            }
        }
        return false;
    }
}
