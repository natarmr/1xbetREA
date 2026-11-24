package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ftc0 implements zrc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10105a;
    public final zuc0 b;
    public final int c;
    public final soc0 d;

    public ftc0(boolean z, zuc0 zuc0Var, int i, soc0 soc0Var) {
        this.f10105a = z;
        this.b = zuc0Var;
        this.c = i;
        this.d = soc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ftc0)) {
            return false;
        }
        ftc0 ftc0Var = (ftc0) obj;
        return this.f10105a == ftc0Var.f10105a && this.b == ftc0Var.b && this.c == ftc0Var.c && this.d == ftc0Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + twn.a(this.c, (this.b.hashCode() + (Boolean.hashCode(this.f10105a) * 31)) * 31, 31);
    }

    public final String toString() {
        return "PromoSimpleInfoStateModel(showValue=" + this.f10105a + ", promoType=" + this.b + ", promoValue=" + this.c + ", promoCategory=" + this.d + Separators.RPAREN;
    }
}
