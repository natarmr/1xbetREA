package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class wdp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jjl f38985a;
    public final ijl b;

    public wdp(ijl ijlVar, jjl jjlVar) {
        ijlVar.getClass();
        this.f38985a = jjlVar;
        this.b = ijlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wdp)) {
            return false;
        }
        wdp wdpVar = (wdp) obj;
        return this.f38985a.equals(wdpVar.f38985a) && this.b == wdpVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f38985a.hashCode() * 31);
    }

    public final String toString() {
        return "FavoritesAccountSelectionUiState(accountSelectionUiModel=" + this.f38985a + ", accountSelectionStyle=" + this.b + Separators.RPAREN;
    }
}
