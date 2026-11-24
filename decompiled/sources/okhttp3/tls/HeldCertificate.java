package okhttp3.tls;

import java.security.KeyPair;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/tls/HeldCertificate;", "", "Builder", "Companion", "okhttp-tls"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HeldCertificate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KeyPair f46239a;
    public final X509Certificate b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/tls/HeldCertificate$Builder;", "", "Companion", "okhttp-tls"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f46240a;
        public final ArrayList b = new ArrayList();

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/tls/HeldCertificate$Builder$Companion;", "", "", "DEFAULT_DURATION_MILLIS", "J", "okhttp-tls"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/tls/HeldCertificate$Companion;", "", "Lkotlin/text/Regex;", "PEM_REGEX", "Lkotlin/text/Regex;", "okhttp-tls"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        new Regex("-----BEGIN ([!-,.-~ ]*)-----([^-]*)-----END \\1-----");
    }

    public HeldCertificate(KeyPair keyPair, X509Certificate x509Certificate) {
        this.f46239a = keyPair;
        this.b = x509Certificate;
    }
}
