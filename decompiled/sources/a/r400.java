package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class r400 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i4 f29811a;
    public final i4 b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final i4 f;
    public final i4 g;
    public final boolean h;
    public final mdm i;
    public final imm j;

    public r400(i4 i4Var, i4 i4Var2, int i, boolean z, boolean z2, i4 i4Var3, i4 i4Var4, boolean z3, mdm mdmVar, imm immVar) {
        i4Var.getClass();
        i4Var2.getClass();
        i4Var3.getClass();
        i4Var4.getClass();
        this.f29811a = i4Var;
        this.b = i4Var2;
        this.c = i;
        this.d = z;
        this.e = z2;
        this.f = i4Var3;
        this.g = i4Var4;
        this.h = z3;
        this.i = mdmVar;
        this.j = immVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r400)) {
            return false;
        }
        r400 r400Var = (r400) obj;
        return Intrinsics.d(this.f29811a, r400Var.f29811a) && Intrinsics.d(this.b, r400Var.b) && this.c == r400Var.c && this.d == r400Var.d && this.e == r400Var.e && Intrinsics.d(this.f, r400Var.f) && Intrinsics.d(this.g, r400Var.g) && this.h == r400Var.h && this.i.equals(r400Var.i) && this.j.equals(r400Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + f140.d(this.i, brm0.e(f140.c(this.g, f140.c(this.f, brm0.e(brm0.e(twn.a(this.c, f140.c(this.b, this.f29811a.hashCode() * 31, 31), 31), 31, this.d), 31, this.e), 31), 31), 31, this.h), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LimitsRsUiState(moneyLimitUiModels=");
        sb.append(this.f29811a);
        sb.append(", timeLimitUiModels=");
        sb.append(this.b);
        sb.append(", currentTab=");
        brm0.w(this.c, ", isLoading=", ", isUserScrollEnabled=", sb, this.d);
        sb.append(this.e);
        sb.append(", availablePages=");
        sb.append(this.f);
        sb.append(", availableTabs=");
        sb.append(this.g);
        sb.append(", hasErrorWhileLoadingLimits=");
        sb.append(this.h);
        sb.append(", dsEmptyConfig=");
        sb.append(this.i);
        sb.append(", navigationBarUiModel=");
        sb.append(this.j);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
