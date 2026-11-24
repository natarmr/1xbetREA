package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class p18 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rz7 f26187a;
    public final boo0 b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final boolean i;
    public final int j;
    public final int k;
    public final x08 l;

    public p18(rz7 rz7Var, boo0 boo0Var, String str, String str2, boolean z, boolean z2, boolean z3, String str3, boolean z4, int i, int i2, x08 x08Var) {
        brm0.B(str, str2, str3);
        this.f26187a = rz7Var;
        this.b = boo0Var;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = str3;
        this.i = z4;
        this.j = i;
        this.k = i2;
        this.l = x08Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p18)) {
            return false;
        }
        p18 p18Var = (p18) obj;
        return this.f26187a.equals(p18Var.f26187a) && this.b.equals(p18Var.b) && Intrinsics.d(this.c, p18Var.c) && Intrinsics.d(this.d, p18Var.d) && this.e == p18Var.e && this.f == p18Var.f && this.g == p18Var.g && Intrinsics.d(this.h, p18Var.h) && this.i == p18Var.i && this.j == p18Var.j && this.k == p18Var.k && this.l.equals(p18Var.l);
    }

    public final int hashCode() {
        return this.l.hashCode() + twn.a(this.k, twn.a(this.j, brm0.e(ua80.b(brm0.e(brm0.e(brm0.e(ua80.b(ua80.b((this.b.hashCode() + (this.f26187a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BigPigUiModel(images=");
        sb.append(this.f26187a);
        sb.append(", seriesTabs=");
        sb.append(this.b);
        sb.append(", firstDescription=");
        f140.v(sb, this.c, ", secondDescription=", this.d, ", isPlayerActive=");
        ua80.u(", isWaitingNextThrow=", ", isTurnChanging=", sb, this.e, this.f);
        f140.s(", turnChangeDescription=", this.h, ", isGameFinished=", sb, this.g);
        ua80.q(this.j, ", numberOfSeries=", ", numberOfThrow=", sb, this.i);
        sb.append(this.k);
        sb.append(", statistic=");
        sb.append(this.l);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
