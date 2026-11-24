package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class frw implements hrw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dbd f10039a = dbd.f5798a;
    public final mdm b;

    public frw(mdm mdmVar) {
        this.b = mdmVar;
    }

    @Override // a.hrw
    public final dbd a() {
        return this.f10039a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof frw)) {
            return false;
        }
        frw frwVar = (frw) obj;
        return this.f10039a == frwVar.f10039a && this.b.equals(frwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f10039a.hashCode() * 31);
    }

    public final String toString() {
        return "Error(compactIconState=" + this.f10039a + ", lottieConfig=" + this.b + Separators.RPAREN;
    }
}
