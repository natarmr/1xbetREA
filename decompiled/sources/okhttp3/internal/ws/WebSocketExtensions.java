package okhttp3.internal.ws;

import a.brm0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/ws/WebSocketExtensions;", "", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class WebSocketExtensions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f46231a;
    public final Integer b;
    public final boolean c;
    public final Integer d;
    public final boolean e;
    public final boolean f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/ws/WebSocketExtensions$Companion;", "", "", "HEADER_WEB_SOCKET_EXTENSION", "Ljava/lang/String;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public WebSocketExtensions(boolean z, Integer num, boolean z2, Integer num2, boolean z3, boolean z4) {
        this.f46231a = z;
        this.b = num;
        this.c = z2;
        this.d = num2;
        this.e = z3;
        this.f = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebSocketExtensions)) {
            return false;
        }
        WebSocketExtensions webSocketExtensions = (WebSocketExtensions) obj;
        return this.f46231a == webSocketExtensions.f46231a && Intrinsics.d(this.b, webSocketExtensions.b) && this.c == webSocketExtensions.c && Intrinsics.d(this.d, webSocketExtensions.d) && this.e == webSocketExtensions.e && this.f == webSocketExtensions.f;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f46231a) * 31;
        Integer num = this.b;
        int iE = brm0.e((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.c);
        Integer num2 = this.d;
        return Boolean.hashCode(this.f) + brm0.e((iE + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebSocketExtensions(perMessageDeflate=");
        sb.append(this.f46231a);
        sb.append(", clientMaxWindowBits=");
        sb.append(this.b);
        sb.append(", clientNoContextTakeover=");
        sb.append(this.c);
        sb.append(", serverMaxWindowBits=");
        sb.append(this.d);
        sb.append(", serverNoContextTakeover=");
        sb.append(this.e);
        sb.append(", unknownValues=");
        return brm0.o(sb, this.f, ')');
    }
}
