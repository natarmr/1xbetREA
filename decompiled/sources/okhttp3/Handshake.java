package okhttp3;

import a.awj;
import a.dbn;
import a.iun;
import a.jf4;
import a.maz;
import a.n0o0;
import a.ohq;
import a.r3d;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal._UtilJvmKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/Handshake;", "", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Handshake {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TlsVersion f46097a;
    public final CipherSuite b;
    public final List c;
    public final n0o0 d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/Handshake$Companion;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static Handshake a(SSLSession sSLSession) throws IOException {
            List listK;
            sSLSession.getClass();
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                jf4.n("cipherSuite == null");
                return null;
            }
            if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") || cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
                ohq.l("cipherSuite == ".concat(cipherSuite));
                return null;
            }
            CipherSuite cipherSuiteA = CipherSuite.b.a(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                jf4.n("tlsVersion == null");
                return null;
            }
            if ("NONE".equals(protocol)) {
                ohq.l("tlsVersion == NONE");
                return null;
            }
            TlsVersion.b.getClass();
            TlsVersion tlsVersionA = TlsVersion.Companion.a(protocol);
            try {
                listK = _UtilJvmKt.k(sSLSession.getPeerCertificates());
            } catch (SSLPeerUnverifiedException unused) {
                listK = iun.f15405a;
            }
            return new Handshake(tlsVersionA, cipherSuiteA, _UtilJvmKt.k(sSLSession.getLocalCertificates()), new awj(listK, (byte) 2));
        }
    }

    public Handshake(TlsVersion tlsVersion, CipherSuite cipherSuite, List list, Function0 function0) {
        list.getClass();
        this.f46097a = tlsVersion;
        this.b = cipherSuite;
        this.c = list;
        this.d = maz.b(new dbn(function0, (byte) 14));
    }

    public final List a() {
        return (List) this.d.getValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Handshake)) {
            return false;
        }
        Handshake handshake = (Handshake) obj;
        return handshake.f46097a == this.f46097a && handshake.b == this.b && Intrinsics.d(handshake.a(), a()) && Intrinsics.d(handshake.c, this.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((a().hashCode() + ((this.b.hashCode() + ((this.f46097a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> listA = a();
        ArrayList arrayList = new ArrayList(r3d.q(listA, 10));
        for (Certificate certificate : listA) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                type2.getClass();
            }
            arrayList.add(type2);
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f46097a);
        sb.append(" cipherSuite=");
        sb.append(this.b);
        sb.append(" peerCertificates=");
        sb.append(string);
        sb.append(" localCertificates=");
        List<Certificate> list = this.c;
        ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                type.getClass();
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
