package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class oqv implements pqv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r040 f25708a;
    public final hjm b;

    public oqv(r040 r040Var, hjm hjmVar) {
        kjm kjmVar = kjm.f18392a;
        this.f25708a = r040Var;
        this.b = hjmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oqv)) {
            return false;
        }
        oqv oqvVar = (oqv) obj;
        if (this.f25708a != oqvVar.f25708a || !this.b.equals(oqvVar.b)) {
            return false;
        }
        kjm kjmVar = kjm.f18392a;
        return true;
    }

    @Override // a.pqv
    public final boolean f0() {
        return true;
    }

    public final int hashCode() {
        return kjm.f18392a.hashCode() + hne.e(this.b, brm0.e(this.f25708a.hashCode() * 31, 31, true), 31);
    }

    @Override // a.pqv
    public final r040 n() {
        return this.f25708a;
    }

    public final String toString() {
        return "HeaderMenuCellUiItem(menuSectionType=" + this.f25708a + ", expanded=true, model=" + this.b + ", type=" + kjm.f18392a + Separators.RPAREN;
    }
}
