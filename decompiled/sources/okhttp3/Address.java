package okhttp3;

import a.axq;
import a.c99;
import a.dw9;
import a.jf4;
import a.twn;
import a.ua80;
import java.io.EOFException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal._HostnamesCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/Address;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Address {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Dns f46075a;
    public final SocketFactory b;
    public final SSLSocketFactory c;
    public final HostnameVerifier d;
    public final CertificatePinner e;
    public final Authenticator f;
    public final Proxy g;
    public final ProxySelector h;
    public final HttpUrl i;
    public final List j;
    public final List k;

    public Address(String str, int i, Dns dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, CertificatePinner certificatePinner, Authenticator authenticator, Proxy proxy, List list, List list2, ProxySelector proxySelector) throws EOFException {
        str.getClass();
        dns.getClass();
        socketFactory.getClass();
        authenticator.getClass();
        list.getClass();
        list2.getClass();
        proxySelector.getClass();
        this.f46075a = dns;
        this.b = socketFactory;
        this.c = sSLSocketFactory;
        this.d = hostnameVerifier;
        this.e = certificatePinner;
        this.f = authenticator;
        this.g = proxy;
        this.h = proxySelector;
        HttpUrl.Builder builder = new HttpUrl.Builder();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            builder.f46101a = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                jf4.o("unexpected scheme: ".concat(str2));
                throw null;
            }
            builder.f46101a = "https";
        }
        String strB = _HostnamesCommonKt.b(_UrlKt.d(0, 0, 7, str));
        if (strB == null) {
            jf4.o("unexpected host: ".concat(str));
            throw null;
        }
        builder.d = strB;
        if (1 > i || i >= 65536) {
            c99.s(twn.m(i, "unexpected port: "));
            throw null;
        }
        builder.e = i;
        this.i = builder.a();
        this.j = _UtilJvmKt.j(list);
        this.k = _UtilJvmKt.j(list2);
    }

    public final boolean a(Address address) {
        return Intrinsics.d(this.f46075a, address.f46075a) && Intrinsics.d(this.f, address.f) && Intrinsics.d(this.j, address.j) && Intrinsics.d(this.k, address.k) && Intrinsics.d(this.h, address.h) && Intrinsics.d(this.g, address.g) && Intrinsics.d(this.c, address.c) && Intrinsics.d(this.d, address.d) && Intrinsics.d(this.e, address.e) && this.i.e == address.i.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Address)) {
            return false;
        }
        Address address = (Address) obj;
        return this.i.equals(address.i) && a(address);
    }

    public final int hashCode() {
        return Objects.hashCode(this.e) + ((Objects.hashCode(this.d) + ((Objects.hashCode(this.c) + ((Objects.hashCode(this.g) + ((this.h.hashCode() + dw9.a(dw9.a((this.f.hashCode() + ((this.f46075a.hashCode() + ua80.b(527, 31, this.i.i)) * 31)) * 31, 31, this.j), 31, this.k)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Address{");
        HttpUrl httpUrl = this.i;
        sb.append(httpUrl.d);
        sb.append(':');
        sb.append(httpUrl.e);
        sb.append(", ");
        Proxy proxy = this.g;
        if (proxy != null) {
            str = "proxy=" + proxy;
        } else {
            str = "proxySelector=" + this.h;
        }
        return axq.m(sb, str, '}');
    }
}
