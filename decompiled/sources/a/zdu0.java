package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class zdu0 implements cqg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final feu0 f44225a;
    public final feu0 b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final ydu0 i;

    public zdu0(feu0 feu0Var, feu0 feu0Var2, int i, int i2, int i3, int i4, int i5, int i6, ydu0 ydu0Var) {
        this.f44225a = feu0Var;
        this.b = feu0Var2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = ydu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zdu0)) {
            return false;
        }
        zdu0 zdu0Var = (zdu0) obj;
        return this.f44225a == zdu0Var.f44225a && this.b == zdu0Var.b && this.c == zdu0Var.c && this.d == zdu0Var.d && this.e == zdu0Var.e && this.f == zdu0Var.f && this.g == zdu0Var.g && this.h == zdu0Var.h && this.i == zdu0Var.i;
    }

    public final int hashCode() {
        return this.i.hashCode() + twn.a(this.h, twn.a(this.g, twn.a(this.f, twn.a(this.e, twn.a(this.d, twn.a(this.c, (this.b.hashCode() + (this.f44225a.hashCode() * 31)) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VictoryFormulaModel(playerOneFormula=");
        sb.append(this.f44225a);
        sb.append(", playerTwoFormula=");
        sb.append(this.b);
        sb.append(", playerOneFirstNumber=");
        axq.r(this.c, this.d, ", playerOneSecondNumber=", ", playerOneThirdNumber=", sb);
        axq.r(this.e, this.f, ", playerTwoFirstNumber=", ", playerTwoSecondNumber=", sb);
        axq.r(this.g, this.h, ", playerTwoThirdNumber=", ", matchState=", sb);
        sb.append(this.i);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
