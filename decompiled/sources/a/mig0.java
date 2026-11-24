package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class mig0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mjg0 f21845a;
    public final mjg0 b;
    public final mjg0 c;
    public final ojg0 d;
    public final ojg0 e;
    public final ojg0 f;
    public final boolean g;
    public final boolean h;
    public final okg0 i;
    public final boolean j;

    public mig0(mjg0 mjg0Var, mjg0 mjg0Var2, mjg0 mjg0Var3, ojg0 ojg0Var, ojg0 ojg0Var2, ojg0 ojg0Var3, boolean z, boolean z2, okg0 okg0Var, boolean z3) {
        this.f21845a = mjg0Var;
        this.b = mjg0Var2;
        this.c = mjg0Var3;
        this.d = ojg0Var;
        this.e = ojg0Var2;
        this.f = ojg0Var3;
        this.g = z;
        this.h = z2;
        this.i = okg0Var;
        this.j = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mig0)) {
            return false;
        }
        mig0 mig0Var = (mig0) obj;
        return this.f21845a.equals(mig0Var.f21845a) && this.b.equals(mig0Var.b) && this.c.equals(mig0Var.c) && this.d.equals(mig0Var.d) && this.e.equals(mig0Var.e) && this.f.equals(mig0Var.f) && this.g == mig0Var.g && this.h == mig0Var.h && this.i.equals(mig0Var.i) && this.j == mig0Var.j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j) + ((this.i.hashCode() + brm0.e(brm0.e((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f21845a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.g), 31, this.h)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RpsGameAnimationState(firstPlayerHandParams=");
        sb.append(this.f21845a);
        sb.append(", secondPlayerHandParams=");
        sb.append(this.b);
        sb.append(", thirdPlayerHandParams=");
        sb.append(this.c);
        sb.append(", firstPlayerInfo=");
        sb.append(this.d);
        sb.append(", secondPlayerInfo=");
        sb.append(this.e);
        sb.append(", thirdPlayInfo=");
        sb.append(this.f);
        sb.append(", playerPositionIsCenter=");
        ua80.u(", winner=", ", winnerInfo=", sb, this.g, this.h);
        sb.append(this.i);
        sb.append(", isImmediate=");
        sb.append(this.j);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
