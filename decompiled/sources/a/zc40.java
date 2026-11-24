package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class zc40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f44149a;
    public final hyl b;

    public zc40(imm immVar, hyl hylVar) {
        this.f44149a = immVar;
        this.b = hylVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zc40)) {
            return false;
        }
        zc40 zc40Var = (zc40) obj;
        return this.f44149a.equals(zc40Var.f44149a) && this.b.equals(zc40Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f44149a.hashCode() * 31);
    }

    public final String toString() {
        return "MetaHeroesToolbarUiModel(model=" + this.f44149a + ", chips=" + this.b + Separators.RPAREN;
    }
}
