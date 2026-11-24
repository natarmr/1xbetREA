package okhttp3;

import a.ohq;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.text.c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/Protocol;", "", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum Protocol {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic"),
    HTTP_3("h3");

    public static final Companion b = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46107a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/Protocol$Companion;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static Protocol a(String str) throws IOException {
            str.getClass();
            Protocol protocol = Protocol.HTTP_1_0;
            if (str.equals("http/1.0")) {
                return protocol;
            }
            Protocol protocol2 = Protocol.HTTP_1_1;
            if (str.equals("http/1.1")) {
                return protocol2;
            }
            Protocol protocol3 = Protocol.H2_PRIOR_KNOWLEDGE;
            if (str.equals("h2_prior_knowledge")) {
                return protocol3;
            }
            Protocol protocol4 = Protocol.HTTP_2;
            if (str.equals("h2")) {
                return protocol4;
            }
            Protocol protocol5 = Protocol.SPDY_3;
            if (str.equals("spdy/3.1")) {
                return protocol5;
            }
            Protocol protocol6 = Protocol.QUIC;
            if (str.equals("quic")) {
                return protocol6;
            }
            Protocol protocol7 = Protocol.HTTP_3;
            if (c.x(str, "h3", false)) {
                return protocol7;
            }
            ohq.l("Unexpected protocol: ".concat(str));
            return null;
        }
    }

    Protocol(String str) {
        this.f46107a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f46107a;
    }
}
