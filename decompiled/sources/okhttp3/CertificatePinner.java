package okhttp3;

import a.ohs0;
import a.qg9;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.tls.CertificateChainCleaner;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/CertificatePinner;", "", "Pin", "Builder", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CertificatePinner {
    public static final CertificatePinner c = new CertificatePinner(CollectionsKt.P0(new Builder().f46080a), null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f46079a;
    public final CertificateChainCleaner b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/CertificatePinner$Builder;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f46080a = new ArrayList();
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/CertificatePinner$Companion;", "", "Lokhttp3/CertificatePinner;", "DEFAULT", "Lokhttp3/CertificatePinner;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/CertificatePinner$Pin;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Pin {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Pin);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            qg9 qg9Var = qg9.d;
            throw null;
        }
    }

    public CertificatePinner(Set set, CertificateChainCleaner certificateChainCleaner) {
        set.getClass();
        this.f46079a = set;
        this.b = certificateChainCleaner;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CertificatePinner)) {
            return false;
        }
        CertificatePinner certificatePinner = (CertificatePinner) obj;
        return Intrinsics.d(certificatePinner.f46079a, this.f46079a) && Intrinsics.d(certificatePinner.b, this.b);
    }

    public final int hashCode() {
        int iG = ohs0.g(this.f46079a, 1517, 41);
        CertificateChainCleaner certificateChainCleaner = this.b;
        return iG + (certificateChainCleaner != null ? certificateChainCleaner.hashCode() : 0);
    }
}
