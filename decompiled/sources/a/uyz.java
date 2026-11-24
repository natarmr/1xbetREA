package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class uyz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i4 f36512a;
    public final i4 b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final i4 f;
    public final i4 g;
    public final boolean h;
    public final ra10 i;

    public uyz(i4 i4Var, i4 i4Var2, boolean z, int i, boolean z2, i4 i4Var3, i4 i4Var4, boolean z3, ra10 ra10Var) {
        i4Var.getClass();
        i4Var2.getClass();
        i4Var3.getClass();
        i4Var4.getClass();
        this.f36512a = i4Var;
        this.b = i4Var2;
        this.c = z;
        this.d = i;
        this.e = z2;
        this.f = i4Var3;
        this.g = i4Var4;
        this.h = z3;
        this.i = ra10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uyz)) {
            return false;
        }
        uyz uyzVar = (uyz) obj;
        return Intrinsics.d(this.f36512a, uyzVar.f36512a) && Intrinsics.d(this.b, uyzVar.b) && this.c == uyzVar.c && this.d == uyzVar.d && this.e == uyzVar.e && Intrinsics.d(this.f, uyzVar.f) && Intrinsics.d(this.g, uyzVar.g) && this.h == uyzVar.h && this.i.equals(uyzVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + brm0.e(f140.c(this.g, f140.c(this.f, brm0.e(twn.a(this.d, brm0.e(f140.c(this.b, this.f36512a.hashCode() * 31, 31), 31, this.c), 31), 31, this.e), 31), 31), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LimitsKenyaUiState(moneyLimitUiModels=");
        sb.append(this.f36512a);
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
        sb.append(", lottieConfig=");
        sb.append(this.i);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
