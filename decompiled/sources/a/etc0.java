package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class etc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8369a;
    public final zuc0 b;
    public final int c;
    public final soc0 d;

    public etc0(boolean z, zuc0 zuc0Var, int i, soc0 soc0Var) {
        this.f8369a = z;
        this.b = zuc0Var;
        this.c = i;
        this.d = soc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof etc0)) {
            return false;
        }
        etc0 etc0Var = (etc0) obj;
        return this.f8369a == etc0Var.f8369a && this.b == etc0Var.b && this.c == etc0Var.c && this.d == etc0Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + twn.a(this.c, (this.b.hashCode() + (Boolean.hashCode(this.f8369a) * 31)) * 31, 31);
    }

    public final String toString() {
        return "PromoSimpleInfoModel(showValue=" + this.f8369a + ", promoType=" + this.b + ", promoValue=" + this.c + ", promoCategory=" + this.d + Separators.RPAREN;
    }
}
