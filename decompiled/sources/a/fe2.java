package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class fe2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9383a;
    public final qim b;
    public final z2g0 c;
    public final boolean d;

    public fe2(boolean z, qim qimVar, z2g0 z2g0Var, boolean z2) {
        this.f9383a = z;
        this.b = qimVar;
        this.c = z2g0Var;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fe2)) {
            return false;
        }
        fe2 fe2Var = (fe2) obj;
        return this.f9383a == fe2Var.f9383a && this.b.equals(fe2Var.b) && this.c.equals(fe2Var.c) && this.d == fe2Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.f9383a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AltResultLiveGamesUiState(refresh=" + this.f9383a + ", headerModel=" + this.b + ", screenState=" + this.c + ", supportRtl=" + this.d + Separators.RPAREN;
    }
}
