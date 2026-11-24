package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class va00 implements db00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f37061a;
    public final boolean b;
    public final a4x c;
    public final a4x d;
    public final int e;
    public final mdm f;

    public va00(boolean z, boolean z2, i4 i4Var, i4 i4Var2, int i, mdm mdmVar) {
        i4Var.getClass();
        i4Var2.getClass();
        this.f37061a = z;
        this.b = z2;
        this.c = i4Var;
        this.d = i4Var2;
        this.e = i;
        this.f = mdmVar;
    }

    @Override // a.db00
    public final boolean a() {
        return this.b;
    }

    @Override // a.db00
    public final boolean b() {
        return this.f37061a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof va00)) {
            return false;
        }
        va00 va00Var = (va00) obj;
        return this.f37061a == va00Var.f37061a && this.b == va00Var.b && Intrinsics.d(this.c, va00Var.c) && Intrinsics.d(this.d, va00Var.d) && this.e == va00Var.e && this.f.equals(va00Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + twn.a(this.e, cs0.b(this.d, cs0.b(this.c, brm0.e(Boolean.hashCode(this.f37061a) * 31, 31, this.b), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("Content(isExpanded=", ", isImplemented=", ", teamTitleList=", this.f37061a, this.b);
        hne.y(sbQ, this.c, ", lineupListUiModel=", this.d, ", selectedTab=");
        sbQ.append(this.e);
        sbQ.append(", lottieConfig=");
        sbQ.append(this.f);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
