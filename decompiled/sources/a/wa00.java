package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class wa00 implements db00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f38805a;
    public final boolean b;
    public final mdm c;
    public final a4x d;
    public final int e;
    public final boolean f;

    public wa00(boolean z, boolean z2, mdm mdmVar, i4 i4Var, int i, boolean z3) {
        i4Var.getClass();
        this.f38805a = z;
        this.b = z2;
        this.c = mdmVar;
        this.d = i4Var;
        this.e = i;
        this.f = z3;
    }

    @Override // a.db00
    public final boolean a() {
        return this.b;
    }

    @Override // a.db00
    public final boolean b() {
        return this.f38805a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wa00)) {
            return false;
        }
        wa00 wa00Var = (wa00) obj;
        return this.f38805a == wa00Var.f38805a && this.b == wa00Var.b && this.c.equals(wa00Var.c) && Intrinsics.d(this.d, wa00Var.d) && this.e == wa00Var.e && this.f == wa00Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + twn.a(this.e, cs0.b(this.d, f140.d(this.c, brm0.e(Boolean.hashCode(this.f38805a) * 31, 31, this.b), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("Empty(isExpanded=", ", isImplemented=", ", lottieConfig=", this.f38805a, this.b);
        sbQ.append(this.c);
        sbQ.append(", teamTitleList=");
        sbQ.append(this.d);
        sbQ.append(", selectedTab=");
        return ohs0.k(this.e, ", showMoreButton=", Separators.RPAREN, sbQ, this.f);
    }
}
