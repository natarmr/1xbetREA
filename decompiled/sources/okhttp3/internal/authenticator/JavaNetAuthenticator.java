package okhttp3.internal.authenticator;

import a.f99;
import a.iun;
import a.qg9;
import java.io.EOFException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.text.Charsets;
import okhttp3.Address;
import okhttp3.Authenticator;
import okhttp3.Challenge;
import okhttp3.Credentials;
import okhttp3.Dns;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal._HeadersCommonKt;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.platform.Platform;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/authenticator/JavaNetAuthenticator;", "Lokhttp3/Authenticator;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JavaNetAuthenticator implements Authenticator {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46124a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f46124a = iArr;
        }
    }

    public static InetAddress a(Proxy proxy, HttpUrl httpUrl, Dns dns) {
        Proxy.Type type = proxy.type();
        if ((type == null ? -1 : WhenMappings.f46124a[type.ordinal()]) == 1) {
            return (InetAddress) CollectionsKt.U(dns.a(httpUrl.d));
        }
        SocketAddress socketAddressAddress = proxy.address();
        socketAddressAddress.getClass();
        InetAddress address = ((InetSocketAddress) socketAddressAddress).getAddress();
        address.getClass();
        return address;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005a  */
    /* JADX WARN: Code duplicated, block: B:26:0x0061  */
    /* JADX WARN: Code duplicated, block: B:30:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x008f  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:52:0x0110  */
    /* JADX WARN: Code duplicated, block: B:59:0x0108 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0123 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x007f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0067 A[SYNTHETIC] */
    @Override // okhttp3.Authenticator
    public final Request d(Route route, Response response) {
        String str;
        List list;
        Request request;
        HttpUrl httpUrl;
        boolean z;
        Proxy proxy;
        Iterator it;
        Dns dns;
        Challenge challenge;
        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication;
        String str2;
        String str3;
        Charset charsetForName;
        Address address;
        Dns dns2;
        Headers headers = response.f;
        int i = response.d;
        if (i != 401) {
            if (i != 407) {
                list = iun.f15405a;
            } else {
                str = "Proxy-Authenticate";
            }
            request = response.f46111a;
            httpUrl = request.f46108a;
            z = response.d == 407;
            if (route != null || (proxy = route.b) == null) {
                proxy = Proxy.NO_PROXY;
            }
            it = list.iterator();
            while (true) {
                dns = null;
                if (it.hasNext()) {
                    return null;
                }
                challenge = (Challenge) it.next();
                if ("Basic".equalsIgnoreCase(challenge.f46081a)) {
                    if (route != null && (address = route.f46114a) != null && (dns2 = address.f46075a) != null) {
                        dns = dns2;
                    }
                    if (z) {
                        SocketAddress socketAddressAddress = proxy.address();
                        socketAddressAddress.getClass();
                        InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                        passwordAuthenticationRequestPasswordAuthentication = java.net.Authenticator.requestPasswordAuthentication(inetSocketAddress.getHostName(), a(proxy, httpUrl, dns), inetSocketAddress.getPort(), httpUrl.f46100a, (String) challenge.b.get("realm"), challenge.f46081a, httpUrl.j(), java.net.Authenticator.RequestorType.PROXY);
                    } else {
                        String str4 = httpUrl.d;
                        proxy.getClass();
                        passwordAuthenticationRequestPasswordAuthentication = java.net.Authenticator.requestPasswordAuthentication(str4, a(proxy, httpUrl, dns), httpUrl.e, httpUrl.f46100a, (String) challenge.b.get("realm"), challenge.f46081a, httpUrl.j(), java.net.Authenticator.RequestorType.SERVER);
                    }
                    if (passwordAuthenticationRequestPasswordAuthentication != null) {
                        if (z) {
                            str2 = "Proxy-Authorization";
                        } else {
                            str2 = "Authorization";
                        }
                        String userName = passwordAuthenticationRequestPasswordAuthentication.getUserName();
                        userName.getClass();
                        char[] password = passwordAuthenticationRequestPasswordAuthentication.getPassword();
                        password.getClass();
                        String str5 = new String(password);
                        str3 = (String) challenge.b.get("charset");
                        if (str3 != null) {
                            try {
                                charsetForName = Charset.forName(str3);
                                charsetForName.getClass();
                            } catch (Exception unused) {
                                charsetForName = Charsets.d;
                            }
                        } else {
                            charsetForName = Charsets.d;
                        }
                        String strA = Credentials.a(userName, str5, charsetForName);
                        Request.Builder builderA = request.a();
                        builderA.a(str2, strA);
                        return new Request(builderA);
                    }
                }
            }
        } else {
            str = "WWW-Authenticate";
        }
        String str6 = str;
        qg9 qg9Var = HttpHeaders.f46171a;
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (str6.equalsIgnoreCase(_HeadersCommonKt.c(headers, i2))) {
                f99 f99Var = new f99();
                f99Var.c0(_HeadersCommonKt.e(headers, i2));
                try {
                    HttpHeaders.b(f99Var, arrayList);
                } catch (EOFException e) {
                    Platform platform = Platform.f46208a;
                    Platform.f46208a.k(5, "Unable to parse challenge", e);
                }
            }
        }
        list = arrayList;
        request = response.f46111a;
        httpUrl = request.f46108a;
        if (response.d == 407) {
        }
        if (route != null) {
            proxy = Proxy.NO_PROXY;
        } else {
            proxy = Proxy.NO_PROXY;
        }
        it = list.iterator();
        while (true) {
            dns = null;
            if (it.hasNext()) {
                return null;
            }
            challenge = (Challenge) it.next();
            if ("Basic".equalsIgnoreCase(challenge.f46081a)) {
                if (route != null) {
                    dns = dns2;
                }
                if (z) {
                    SocketAddress socketAddressAddress2 = proxy.address();
                    socketAddressAddress2.getClass();
                    InetSocketAddress inetSocketAddress2 = (InetSocketAddress) socketAddressAddress2;
                    passwordAuthenticationRequestPasswordAuthentication = java.net.Authenticator.requestPasswordAuthentication(inetSocketAddress2.getHostName(), a(proxy, httpUrl, dns), inetSocketAddress2.getPort(), httpUrl.f46100a, (String) challenge.b.get("realm"), challenge.f46081a, httpUrl.j(), java.net.Authenticator.RequestorType.PROXY);
                } else {
                    String str7 = httpUrl.d;
                    proxy.getClass();
                    passwordAuthenticationRequestPasswordAuthentication = java.net.Authenticator.requestPasswordAuthentication(str7, a(proxy, httpUrl, dns), httpUrl.e, httpUrl.f46100a, (String) challenge.b.get("realm"), challenge.f46081a, httpUrl.j(), java.net.Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthenticationRequestPasswordAuthentication != null) {
                    if (z) {
                        str2 = "Proxy-Authorization";
                    } else {
                        str2 = "Authorization";
                    }
                    String userName2 = passwordAuthenticationRequestPasswordAuthentication.getUserName();
                    userName2.getClass();
                    char[] password2 = passwordAuthenticationRequestPasswordAuthentication.getPassword();
                    password2.getClass();
                    String str8 = new String(password2);
                    str3 = (String) challenge.b.get("charset");
                    if (str3 != null) {
                        charsetForName = Charset.forName(str3);
                        charsetForName.getClass();
                    } else {
                        charsetForName = Charsets.d;
                    }
                    String strA2 = Credentials.a(userName2, str8, charsetForName);
                    Request.Builder builderA2 = request.a();
                    builderA2.a(str2, strA2);
                    return new Request(builderA2);
                }
            }
        }
    }
}
