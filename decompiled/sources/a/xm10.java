package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class xm10 implements ym10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sd f41100a;
    public final vo10 b;
    public final String c;
    public final int d;
    public final boolean e;
    public final String f;
    public final String g;
    public final boolean h;
    public final long i;
    public final String j;
    public final wul k;
    public final wul l;
    public final wul m;
    public final boolean n;
    public final boolean o;
    public final boolean p;

    public xm10(sd sdVar, vo10 vo10Var, String str, int i, boolean z, String str2, String str3, boolean z2, long j, String str4, wul wulVar, wul wulVar2, wul wulVar3, boolean z3, boolean z4, boolean z5) {
        cs0.x(str, str2, str3, str4);
        this.f41100a = sdVar;
        this.b = vo10Var;
        this.c = str;
        this.d = i;
        this.e = z;
        this.f = str2;
        this.g = str3;
        this.h = z2;
        this.i = j;
        this.j = str4;
        this.k = wulVar;
        this.l = wulVar2;
        this.m = wulVar3;
        this.n = z3;
        this.o = z4;
        this.p = z5;
    }

    @Override // a.ym10
    public final boolean a() {
        return this.p;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xm10)) {
            return false;
        }
        xm10 xm10Var = (xm10) obj;
        return this.f41100a.equals(xm10Var.f41100a) && this.b.equals(xm10Var.b) && Intrinsics.d(this.c, xm10Var.c) && this.d == xm10Var.d && this.e == xm10Var.e && Intrinsics.d(this.f, xm10Var.f) && Intrinsics.d(this.g, xm10Var.g) && this.h == xm10Var.h && this.i == xm10Var.i && Intrinsics.d(this.j, xm10Var.j) && this.k.equals(xm10Var.k) && Intrinsics.d(this.l, xm10Var.l) && this.m.equals(xm10Var.m) && this.n == xm10Var.n && this.o == xm10Var.o && this.p == xm10Var.p;
    }

    public final int hashCode() {
        int iA = i8i.a(this.k, ua80.b(rw2.b(brm0.e(ua80.b(ua80.b(brm0.e(twn.a(this.d, ua80.b((this.b.hashCode() + (this.f41100a.hashCode() * 31)) * 31, 31, this.c), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31);
        wul wulVar = this.l;
        return Boolean.hashCode(this.p) + brm0.e(brm0.e(i8i.a(this.m, (iA + (wulVar == null ? 0 : wulVar.hashCode())) * 31, 31), 31, this.n), 31, this.o);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result(balance=");
        sb.append(this.f41100a);
        sb.append(", wheel=");
        sb.append(this.b);
        sb.append(", titleCaption=");
        twn.w(this.d, this.c, ", iconResId=", ", isWin=", sb);
        f140.s(", title=", this.f, ", description=", sb, this.e);
        brm0.C(this.g, ", timerVisible=", ", timerTargetMillis=", sb, this.h);
        kng0.z(sb, this.i, ", freeSpinTimerLabel=", this.j);
        sb.append(", spinButton=");
        sb.append(this.k);
        sb.append(", activateButton=");
        sb.append(this.l);
        sb.append(", continueButton=");
        sb.append(this.m);
        sb.append(", toolbarButtonsEnabled=");
        sb.append(this.n);
        w6x.A(", backButtonEnabled=", ", networkAvailable=", sb, this.o, this.p);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
