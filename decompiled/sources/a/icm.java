package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class icm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jcm f14542a;
    public final xcm b;

    public icm(jcm jcmVar, xcm xcmVar) {
        this.f14542a = jcmVar;
        this.b = xcmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof icm)) {
            return false;
        }
        icm icmVar = (icm) obj;
        return this.f14542a.equals(icmVar.f14542a) && this.b.equals(icmVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f14542a.f16284a.hashCode() * 31);
    }

    public final String toString() {
        return "DsCyberTransferCardDateUiModel(header=" + this.f14542a + ", transfer=" + this.b + Separators.RPAREN;
    }
}
