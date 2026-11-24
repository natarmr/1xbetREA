package okhttp3;

import a.hne;
import a.qg9;
import android.gov.nist.core.Separators;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal._HostnamesCommonKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/Route;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Route {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Address f46114a;
    public final Proxy b;
    public final InetSocketAddress c;
    public final qg9 d;

    public Route(Address address, Proxy proxy, InetSocketAddress inetSocketAddress, qg9 qg9Var) {
        address.getClass();
        proxy.getClass();
        inetSocketAddress.getClass();
        this.f46114a = address;
        this.b = proxy;
        this.c = inetSocketAddress;
        this.d = qg9Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Route)) {
            return false;
        }
        Route route = (Route) obj;
        return Intrinsics.d(route.f46114a, this.f46114a) && Intrinsics.d(route.b, this.b) && Intrinsics.d(route.c, this.c) && Intrinsics.d(route.d, this.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + ((this.f46114a.hashCode() + 527) * 31)) * 31)) * 31;
        qg9 qg9Var = this.d;
        return iHashCode + (qg9Var != null ? qg9Var.hashCode() : 0);
    }

    public final String toString() {
        String hostAddress;
        StringBuilder sb = new StringBuilder();
        Address address = this.f46114a;
        HttpUrl httpUrl = address.i;
        HttpUrl httpUrl2 = address.i;
        String str = httpUrl.d;
        InetSocketAddress inetSocketAddress = this.c;
        InetAddress address2 = inetSocketAddress.getAddress();
        String strB = (address2 == null || (hostAddress = address2.getHostAddress()) == null) ? null : _HostnamesCommonKt.b(hostAddress);
        if (StringsKt.P(str, ':')) {
            hne.B(sb, "[", str, "]");
        } else {
            sb.append(str);
        }
        if (httpUrl2.e != inetSocketAddress.getPort() || str.equals(strB)) {
            sb.append(Separators.COLON);
            sb.append(httpUrl2.e);
        }
        if (!str.equals(strB)) {
            if (Intrinsics.d(this.b, Proxy.NO_PROXY)) {
                sb.append(" at ");
            } else {
                sb.append(" via proxy ");
            }
            if (strB == null) {
                sb.append("<unresolved>");
            } else if (StringsKt.P(strB, ':')) {
                hne.B(sb, "[", strB, "]");
            } else {
                sb.append(strB);
            }
            sb.append(Separators.COLON);
            sb.append(inetSocketAddress.getPort());
        }
        if (this.d != null) {
            sb.append(" with ECH");
        }
        return sb.toString();
    }
}
