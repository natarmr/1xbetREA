package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class vm10 implements ym10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sd f37655a;
    public final vo10 b;
    public final String c;
    public final boolean d;
    public final wul e;
    public final wul f;
    public final boolean g;
    public final long h;
    public final String i;
    public final wul j;
    public final boolean k;
    public final boolean l;
    public final boolean m;

    public vm10(sd sdVar, vo10 vo10Var, String str, boolean z, wul wulVar, wul wulVar2, boolean z2, long j, String str2, wul wulVar3, boolean z3, boolean z4, boolean z5) {
        str.getClass();
        str2.getClass();
        this.f37655a = sdVar;
        this.b = vo10Var;
        this.c = str;
        this.d = z;
        this.e = wulVar;
        this.f = wulVar2;
        this.g = z2;
        this.h = j;
        this.i = str2;
        this.j = wulVar3;
        this.k = z3;
        this.l = z4;
        this.m = z5;
    }

    @Override // a.ym10
    public final boolean a() {
        return this.m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vm10)) {
            return false;
        }
        vm10 vm10Var = (vm10) obj;
        return this.f37655a.equals(vm10Var.f37655a) && this.b.equals(vm10Var.b) && Intrinsics.d(this.c, vm10Var.c) && this.d == vm10Var.d && this.e.equals(vm10Var.e) && Intrinsics.d(this.f, vm10Var.f) && this.g == vm10Var.g && this.h == vm10Var.h && Intrinsics.d(this.i, vm10Var.i) && Intrinsics.d(this.j, vm10Var.j) && this.k == vm10Var.k && this.l == vm10Var.l && this.m == vm10Var.m;
    }

    public final int hashCode() {
        int iA = i8i.a(this.e, brm0.e(ua80.b((this.b.hashCode() + (this.f37655a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31);
        wul wulVar = this.f;
        int iB = ua80.b(rw2.b(brm0.e((iA + (wulVar == null ? 0 : wulVar.hashCode())) * 31, 31, this.g), 31, this.h), 31, this.i);
        wul wulVar2 = this.j;
        return Boolean.hashCode(this.m) + brm0.e(brm0.e((iB + (wulVar2 != null ? wulVar2.hashCode() : 0)) * 31, 31, this.k), 31, this.l);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Main(balance=");
        sb.append(this.f37655a);
        sb.append(", wheel=");
        sb.append(this.b);
        sb.append(", titleCaption=");
        brm0.C(this.c, ", controlsVisible=", ", spinButton=", sb, this.d);
        sb.append(this.e);
        sb.append(", spinAllButton=");
        sb.append(this.f);
        sb.append(", timerVisible=");
        rw2.v(this.h, ", timerTargetMillis=", sb, this.g);
        sb.append(", freeSpinTimerLabel=");
        sb.append(this.i);
        sb.append(", bonusInfoButton=");
        sb.append(this.j);
        w6x.A(", toolbarButtonsEnabled=", ", backButtonEnabled=", sb, this.k, this.l);
        return f140.n(sb, ", networkAvailable=", this.m, Separators.RPAREN);
    }
}
