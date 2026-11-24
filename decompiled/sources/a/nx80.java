package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class nx80 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24272a;

    public nx80(String str) {
        this.f24272a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nx80) && this.f24272a.equals(((nx80) obj).f24272a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f24272a;
    }

    public final int hashCode() {
        return this.f24272a.hashCode();
    }

    public final String toString() {
        return kng0.l("PartnerShimmerUiModel(key=", this.f24272a, Separators.RPAREN);
    }
}
