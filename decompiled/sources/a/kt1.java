package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class kt1 implements ot1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l5i f18841a;
    public final nrl b;

    public kt1(l5i l5iVar, nrl nrlVar) {
        this.f18841a = l5iVar;
        this.b = nrlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kt1)) {
            return false;
        }
        kt1 kt1Var = (kt1) obj;
        return this.f18841a == kt1Var.f18841a && this.b.equals(kt1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f18841a.hashCode() * 31);
    }

    public final String toString() {
        return "StagesUiModel(style=" + this.f18841a + ", uiModel=" + this.b + Separators.RPAREN;
    }
}
