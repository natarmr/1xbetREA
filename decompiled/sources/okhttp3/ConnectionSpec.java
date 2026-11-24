package okhttp3;

import a.brm0;
import a.jf4;
import a.q3d;
import a.r950;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import okhttp3.internal._UtilCommonKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/ConnectionSpec;", "", "Builder", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConnectionSpec {
    public static final List e;
    public static final List f;
    public static final ConnectionSpec g;
    public static final ConnectionSpec h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f46085a;
    public final boolean b;
    public final String[] c;
    public final String[] d;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lokhttp3/ConnectionSpec$Companion;", "", "", "Lokhttp3/CipherSuite;", "RESTRICTED_CIPHER_SUITES", "Ljava/util/List;", "APPROVED_CIPHER_SUITES", "Lokhttp3/ConnectionSpec;", "RESTRICTED_TLS", "Lokhttp3/ConnectionSpec;", "MODERN_TLS", "COMPATIBLE_TLS", "CLEARTEXT", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        CipherSuite cipherSuite = CipherSuite.r;
        CipherSuite cipherSuite2 = CipherSuite.s;
        CipherSuite cipherSuite3 = CipherSuite.t;
        CipherSuite cipherSuite4 = CipherSuite.l;
        CipherSuite cipherSuite5 = CipherSuite.n;
        CipherSuite cipherSuite6 = CipherSuite.m;
        CipherSuite cipherSuite7 = CipherSuite.o;
        CipherSuite cipherSuite8 = CipherSuite.q;
        CipherSuite cipherSuite9 = CipherSuite.p;
        List listJ = q3d.j(cipherSuite, cipherSuite2, cipherSuite3, cipherSuite4, cipherSuite5, cipherSuite6, cipherSuite7, cipherSuite8, cipherSuite9);
        e = listJ;
        List listJ2 = q3d.j(cipherSuite, cipherSuite2, cipherSuite3, cipherSuite4, cipherSuite5, cipherSuite6, cipherSuite7, cipherSuite8, cipherSuite9, CipherSuite.j, CipherSuite.k, CipherSuite.h, CipherSuite.i, CipherSuite.f, CipherSuite.g, CipherSuite.e);
        f = listJ2;
        Builder builder = new Builder(true);
        CipherSuite[] cipherSuiteArr = (CipherSuite[]) listJ.toArray(new CipherSuite[0]);
        builder.c((CipherSuite[]) Arrays.copyOf(cipherSuiteArr, cipherSuiteArr.length));
        TlsVersion tlsVersion = TlsVersion.TLS_1_3;
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
        builder.e(tlsVersion, tlsVersion2);
        builder.d = true;
        builder.a();
        Builder builder2 = new Builder(true);
        CipherSuite[] cipherSuiteArr2 = (CipherSuite[]) listJ2.toArray(new CipherSuite[0]);
        builder2.c((CipherSuite[]) Arrays.copyOf(cipherSuiteArr2, cipherSuiteArr2.length));
        builder2.e(tlsVersion, tlsVersion2);
        builder2.d = true;
        g = builder2.a();
        Builder builder3 = new Builder(true);
        CipherSuite[] cipherSuiteArr3 = (CipherSuite[]) listJ2.toArray(new CipherSuite[0]);
        builder3.c((CipherSuite[]) Arrays.copyOf(cipherSuiteArr3, cipherSuiteArr3.length));
        builder3.e(tlsVersion, tlsVersion2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0);
        builder3.d = true;
        builder3.a();
        h = new Builder(false).a();
    }

    public ConnectionSpec(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.f46085a = z;
        this.b = z2;
        this.c = strArr;
        this.d = strArr2;
    }

    public final void a(SSLSocket sSLSocket, boolean z) {
        String[] enabledProtocols;
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        enabledCipherSuites.getClass();
        String[] strArr = this.c;
        if (strArr != null) {
            enabledCipherSuites = _UtilCommonKt.l(strArr, enabledCipherSuites, CipherSuite.c);
        }
        String[] strArr2 = this.d;
        if (strArr2 != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            enabledProtocols2.getClass();
            r950 r950Var = r950.f30062a;
            r950Var.getClass();
            enabledProtocols = _UtilCommonKt.l(enabledProtocols2, strArr2, r950Var);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        supportedCipherSuites.getClass();
        CipherSuite$Companion$ORDER_BY_NAME$1 cipherSuite$Companion$ORDER_BY_NAME$1 = CipherSuite.c;
        byte[] bArr = _UtilCommonKt.f46121a;
        int length = supportedCipherSuites.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (cipherSuite$Companion$ORDER_BY_NAME$1.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            } else {
                i++;
            }
        }
        if (z && i != -1) {
            String str = supportedCipherSuites[i];
            str.getClass();
            enabledCipherSuites.getClass();
            enabledCipherSuites = (String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        Builder builder = new Builder(this);
        builder.b((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        builder.d((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        ConnectionSpec connectionSpecA = builder.a();
        if (connectionSpecA.c() != null) {
            sSLSocket.setEnabledProtocols(connectionSpecA.d);
        }
        if (connectionSpecA.b() != null) {
            sSLSocket.setEnabledCipherSuites(connectionSpecA.c);
        }
    }

    public final ArrayList b() {
        String[] strArr = this.c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(CipherSuite.b.a(str));
        }
        return arrayList;
    }

    public final ArrayList c() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            TlsVersion.b.getClass();
            arrayList.add(TlsVersion.Companion.a(str));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ConnectionSpec)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ConnectionSpec connectionSpec = (ConnectionSpec) obj;
        boolean z = connectionSpec.f46085a;
        boolean z2 = this.f46085a;
        if (z2 != z) {
            return false;
        }
        if (z2) {
            return Arrays.equals(this.c, connectionSpec.c) && Arrays.equals(this.d, connectionSpec.d) && this.b == connectionSpec.b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.f46085a) {
            return 17;
        }
        String[] strArr = this.c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f46085a) {
            return "ConnectionSpec()";
        }
        StringBuilder sb = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb.append(Objects.toString(b(), "[all enabled]"));
        sb.append(", tlsVersions=");
        sb.append(Objects.toString(c(), "[all enabled]"));
        sb.append(", supportsTlsExtensions=");
        return brm0.o(sb, this.b, ')');
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/ConnectionSpec$Builder;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f46086a;
        public String[] b;
        public String[] c;
        public boolean d;

        public Builder(ConnectionSpec connectionSpec) {
            connectionSpec.getClass();
            this.f46086a = connectionSpec.f46085a;
            this.b = connectionSpec.c;
            this.c = connectionSpec.d;
            this.d = connectionSpec.b;
        }

        public final ConnectionSpec a() {
            return new ConnectionSpec(this.f46086a, this.d, this.b, this.c);
        }

        public final void b(String... strArr) {
            if (!this.f46086a) {
                jf4.o("no cipher suites for cleartext connections");
            } else if (strArr.length != 0) {
                this.b = (String[]) Arrays.copyOf(strArr, strArr.length);
            } else {
                jf4.o("At least one cipher suite is required");
            }
        }

        public final void c(CipherSuite... cipherSuiteArr) {
            if (!this.f46086a) {
                jf4.o("no cipher suites for cleartext connections");
                return;
            }
            ArrayList arrayList = new ArrayList(cipherSuiteArr.length);
            for (CipherSuite cipherSuite : cipherSuiteArr) {
                arrayList.add(cipherSuite.f46082a);
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            b((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final void d(String... strArr) {
            if (!this.f46086a) {
                jf4.o("no TLS versions for cleartext connections");
            } else if (strArr.length != 0) {
                this.c = (String[]) Arrays.copyOf(strArr, strArr.length);
            } else {
                jf4.o("At least one TLS version is required");
            }
        }

        public final void e(TlsVersion... tlsVersionArr) {
            if (!this.f46086a) {
                jf4.o("no TLS versions for cleartext connections");
                return;
            }
            ArrayList arrayList = new ArrayList(tlsVersionArr.length);
            for (TlsVersion tlsVersion : tlsVersionArr) {
                arrayList.add(tlsVersion.f46115a);
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            d((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public Builder(boolean z) {
            this.f46086a = z;
        }
    }
}
