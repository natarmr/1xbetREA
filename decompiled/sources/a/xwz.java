package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class xwz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i4 f41633a;
    public final i4 b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final i4 f;
    public final i4 g;
    public final boolean h;
    public final mdm i;
    public final imm j;

    public xwz(i4 i4Var, i4 i4Var2, int i, boolean z, boolean z2, i4 i4Var3, i4 i4Var4, boolean z3, mdm mdmVar, imm immVar) {
        i4Var.getClass();
        i4Var2.getClass();
        i4Var3.getClass();
        i4Var4.getClass();
        this.f41633a = i4Var;
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
        if (!(obj instanceof xwz)) {
            return false;
        }
        xwz xwzVar = (xwz) obj;
        return Intrinsics.d(this.f41633a, xwzVar.f41633a) && Intrinsics.d(this.b, xwzVar.b) && this.c == xwzVar.c && this.d == xwzVar.d && this.e == xwzVar.e && Intrinsics.d(this.f, xwzVar.f) && Intrinsics.d(this.g, xwzVar.g) && this.h == xwzVar.h && this.i.equals(xwzVar.i) && this.j.equals(xwzVar.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + f140.d(this.i, brm0.e(f140.c(this.g, f140.c(this.f, brm0.e(brm0.e(twn.a(this.c, f140.c(this.b, this.f41633a.hashCode() * 31, 31), 31), 31, this.d), 31, this.e), 31), 31), 31, this.h), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LimitsIeUiState(moneyLimitUiModels=");
        sb.append(this.f41633a);
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
