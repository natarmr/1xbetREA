package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class mcm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kcm f21559a;
    public final xcm b;

    public mcm(kcm kcmVar, xcm xcmVar) {
        this.f21559a = kcmVar;
        this.b = xcmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mcm)) {
            return false;
        }
        mcm mcmVar = (mcm) obj;
        return this.f21559a.equals(mcmVar.f21559a) && this.b.equals(mcmVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f21559a.hashCode() * 31);
    }

    public final String toString() {
        return "DsCyberTransferCardPlayerWithDateUiModel(header=" + this.f21559a + ", transfer=" + this.b + Separators.RPAREN;
    }
}
