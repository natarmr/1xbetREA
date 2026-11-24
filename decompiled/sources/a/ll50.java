package a;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ll50 extends kjt {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 7;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 12;
    private static final ll50 DEFAULT_INSTANCE;
    public static final int HTTP_METHOD_FIELD_NUMBER = 2;
    public static final int HTTP_RESPONSE_CODE_FIELD_NUMBER = 5;
    public static final int NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER = 11;
    private static volatile iq80 PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 13;
    public static final int REQUEST_PAYLOAD_BYTES_FIELD_NUMBER = 3;
    public static final int RESPONSE_CONTENT_TYPE_FIELD_NUMBER = 6;
    public static final int RESPONSE_PAYLOAD_BYTES_FIELD_NUMBER = 4;
    public static final int TIME_TO_REQUEST_COMPLETED_US_FIELD_NUMBER = 8;
    public static final int TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER = 10;
    public static final int TIME_TO_RESPONSE_INITIATED_US_FIELD_NUMBER = 9;
    public static final int URL_FIELD_NUMBER = 1;
    private int bitField0_;
    private long clientStartTimeUs_;
    private int httpMethod_;
    private int httpResponseCode_;
    private int networkClientErrorReason_;
    private long requestPayloadBytes_;
    private long responsePayloadBytes_;
    private long timeToRequestCompletedUs_;
    private long timeToResponseCompletedUs_;
    private long timeToResponseInitiatedUs_;
    private vo20 customAttributes_ = vo20.b;
    private String url_ = "";
    private String responseContentType_ = "";
    private amx perfSessions_ = e5d0.d;

    static {
        ll50 ll50Var = new ll50();
        DEFAULT_INSTANCE = ll50Var;
        kjt.p(ll50.class, ll50Var);
    }

    public static jl50 M() {
        return (jl50) DEFAULT_INSTANCE.i();
    }

    public static ll50 u() {
        return DEFAULT_INSTANCE;
    }

    public final long A() {
        return this.timeToRequestCompletedUs_;
    }

    public final long B() {
        return this.timeToResponseCompletedUs_;
    }

    public final long C() {
        return this.timeToResponseInitiatedUs_;
    }

    public final String D() {
        return this.url_;
    }

    public final boolean E() {
        return (this.bitField0_ & 128) != 0;
    }

    public final boolean F() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean G() {
        return (this.bitField0_ & 32) != 0;
    }

    public final boolean H() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean I() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean J() {
        return (this.bitField0_ & 256) != 0;
    }

    public final boolean K() {
        return (this.bitField0_ & 1024) != 0;
    }

    public final boolean L() {
        return (this.bitField0_ & 512) != 0;
    }

    public final void N(long j) {
        this.bitField0_ |= 128;
        this.clientStartTimeUs_ = j;
    }

    public final void O(int i) {
        int i2;
        switch (i) {
            case 1:
                i2 = 0;
                break;
            case 2:
                i2 = 1;
                break;
            case 3:
                i2 = 2;
                break;
            case 4:
                i2 = 3;
                break;
            case 5:
                i2 = 4;
                break;
            case 6:
                i2 = 5;
                break;
            case 7:
                i2 = 6;
                break;
            case 8:
                i2 = 7;
                break;
            case 9:
                i2 = 8;
                break;
            case 10:
                i2 = 9;
                break;
            default:
                throw null;
        }
        this.httpMethod_ = i2;
        this.bitField0_ |= 2;
    }

    public final void P(int i) {
        this.bitField0_ |= 32;
        this.httpResponseCode_ = i;
    }

    public final void Q() {
        this.networkClientErrorReason_ = 1;
        this.bitField0_ |= 16;
    }

    public final void R(long j) {
        this.bitField0_ |= 4;
        this.requestPayloadBytes_ = j;
    }

    public final void S(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.responseContentType_ = str;
    }

    public final void T(long j) {
        this.bitField0_ |= 8;
        this.responsePayloadBytes_ = j;
    }

    public final void U(long j) {
        this.bitField0_ |= 256;
        this.timeToRequestCompletedUs_ = j;
    }

    public final void V(long j) {
        this.bitField0_ |= 1024;
        this.timeToResponseCompletedUs_ = j;
    }

    public final void W(long j) {
        this.bitField0_ |= 512;
        this.timeToResponseInitiatedUs_ = j;
    }

    public final void X(String str) {
        this.bitField0_ |= 1;
        this.url_ = str;
    }

    @Override // a.kjt
    public final Object j(int i) {
        iq80 djtVar;
        switch (hne.E(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new y9e0(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0001\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0005\u0006ဈ\u0006\u0007ဂ\u0007\bဂ\b\tဂ\t\nဂ\n\u000b᠌\u0004\f2\r\u001b", new Object[]{"bitField0_", "url_", "httpMethod_", rv00.v, "requestPayloadBytes_", "responsePayloadBytes_", "httpResponseCode_", "responseContentType_", "clientStartTimeUs_", "timeToRequestCompletedUs_", "timeToResponseInitiatedUs_", "timeToResponseCompletedUs_", "networkClientErrorReason_", gqw0.u1, "customAttributes_", kl50.f18469a, "perfSessions_", rd90.class});
            case 3:
                return new ll50();
            case 4:
                return new jl50(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                iq80 iq80Var = PARSER;
                if (iq80Var != null) {
                    return iq80Var;
                }
                synchronized (ll50.class) {
                    try {
                        djtVar = PARSER;
                        if (djtVar == null) {
                            djtVar = new djt();
                            PARSER = djtVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return djtVar;
            default:
                e9d0.b();
                return null;
        }
    }

    public final void r(List list) {
        amx amxVarO = this.perfSessions_;
        if (!((n4) amxVarO).f22873a) {
            amxVarO = kjt.o(amxVarO);
            this.perfSessions_ = amxVarO;
        }
        zit.g(list, amxVarO);
    }

    public final void s() {
        this.bitField0_ &= -65;
        this.responseContentType_ = DEFAULT_INSTANCE.responseContentType_;
    }

    public final long t() {
        return this.clientStartTimeUs_;
    }

    public final int v() {
        int i;
        switch (this.httpMethod_) {
            case 0:
                i = 1;
                break;
            case 1:
                i = 2;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 7;
                break;
            case 7:
                i = 8;
                break;
            case 8:
                i = 9;
                break;
            case 9:
                i = 10;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final int w() {
        return this.httpResponseCode_;
    }

    public final amx x() {
        return this.perfSessions_;
    }

    public final long y() {
        return this.requestPayloadBytes_;
    }

    public final long z() {
        return this.responsePayloadBytes_;
    }
}
