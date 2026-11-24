package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class vvp implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38112a;
    public final hjm b;

    public vvp(hjm hjmVar, String str) {
        this.f38112a = str;
        this.b = hjmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vvp)) {
            return false;
        }
        vvp vvpVar = (vvp) obj;
        return this.f38112a.equals(vvpVar.f38112a) && this.b.equals(vvpVar.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f38112a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f38112a.hashCode() * 31);
    }

    public final String toString() {
        return "FighterHeaderUiModel(key=" + this.f38112a + ", header=" + this.b + Separators.RPAREN;
    }
}
