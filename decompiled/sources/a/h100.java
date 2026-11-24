package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class h100 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i4 f12258a;
    public final i4 b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final i4 f;
    public final i4 g;
    public final boolean h;
    public final mdm i;

    public h100(i4 i4Var, i4 i4Var2, boolean z, int i, boolean z2, i4 i4Var3, i4 i4Var4, boolean z3, mdm mdmVar) {
        i4Var.getClass();
        i4Var2.getClass();
        i4Var3.getClass();
        i4Var4.getClass();
        this.f12258a = i4Var;
        this.b = i4Var2;
        this.c = z;
        this.d = i;
        this.e = z2;
        this.f = i4Var3;
        this.g = i4Var4;
        this.h = z3;
        this.i = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h100)) {
            return false;
        }
        h100 h100Var = (h100) obj;
        return Intrinsics.d(this.f12258a, h100Var.f12258a) && Intrinsics.d(this.b, h100Var.b) && this.c == h100Var.c && this.d == h100Var.d && this.e == h100Var.e && Intrinsics.d(this.f, h100Var.f) && Intrinsics.d(this.g, h100Var.g) && this.h == h100Var.h && this.i.equals(h100Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + brm0.e(f140.c(this.g, f140.c(this.f, brm0.e(twn.a(this.d, brm0.e(f140.c(this.b, this.f12258a.hashCode() * 31, 31), 31, this.c), 31), 31, this.e), 31), 31), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LimitsNeUiState(moneyLimitUiModels=");
        sb.append(this.f12258a);
        sb.append(", timeLimitUiModels=");
        sb.append(this.b);
        sb.append(", isLoading=");
        ua80.q(this.d, ", currentTab=", ", isUserScrollEnabled=", sb, this.c);
        sb.append(this.e);
        sb.append(", availablePages=");
        sb.append(this.f);
        sb.append(", availableTabs=");
        sb.append(this.g);
        sb.append(", hasErrorWhileLoadingLimits=");
        sb.append(this.h);
        sb.append(", dsEmptyConfig=");
        return cs0.m(sb, this.i, Separators.RPAREN);
    }
}
