package okhttp3.internal.http;

import java.net.ProtocolException;
import kotlin.Metadata;
import kotlin.text.StringsKt;
import kotlin.text.c;
import okhttp3.Protocol;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/http/StatusLine;", "", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StatusLine {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Protocol f46173a;
    public final int b;
    public final String c;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http/StatusLine$Companion;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static StatusLine a(String str) throws ProtocolException {
            Protocol protocol;
            int i;
            String strSubstring;
            if (c.x(str, "HTTP/1.", false)) {
                i = 9;
                if (str.length() < 9 || str.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                int iCharAt = str.charAt(7) - '0';
                if (iCharAt == 0) {
                    protocol = Protocol.HTTP_1_0;
                } else {
                    if (iCharAt != 1) {
                        throw new ProtocolException("Unexpected status line: ".concat(str));
                    }
                    protocol = Protocol.HTTP_1_1;
                }
            } else if (c.x(str, "ICY ", false)) {
                protocol = Protocol.HTTP_1_0;
                i = 4;
            } else {
                if (!c.x(str, "SOURCETABLE ", false)) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                protocol = Protocol.HTTP_1_1;
                i = 12;
            }
            int i2 = i + 3;
            if (str.length() < i2) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            Integer intOrNull = StringsKt.toIntOrNull(str.substring(i, i2));
            if (intOrNull == null) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iIntValue = intOrNull.intValue();
            if (str.length() <= i2) {
                strSubstring = "";
            } else {
                if (str.charAt(i2) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                strSubstring = str.substring(i + 4);
            }
            return new StatusLine(protocol, iIntValue, strSubstring);
        }
    }

    public StatusLine(Protocol protocol, int i, String str) {
        protocol.getClass();
        str.getClass();
        this.f46173a = protocol;
        this.b = i;
        this.c = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f46173a == Protocol.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.b);
        sb.append(' ');
        sb.append(this.c);
        return sb.toString();
    }
}
