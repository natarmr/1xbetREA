package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class wtz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i4 f39767a;
    public final i4 b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final i4 f;
    public final i4 g;
    public final boolean h;
    public final ra10 i;
    public final anz j;

    public wtz(i4 i4Var, i4 i4Var2, boolean z, int i, boolean z2, i4 i4Var3, i4 i4Var4, boolean z3, ra10 ra10Var, anz anzVar) {
        i4Var.getClass();
        i4Var2.getClass();
        i4Var3.getClass();
        i4Var4.getClass();
        this.f39767a = i4Var;
        this.b = i4Var2;
        this.c = z;
        this.d = i;
        this.e = z2;
        this.f = i4Var3;
        this.g = i4Var4;
        this.h = z3;
        this.i = ra10Var;
        this.j = anzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wtz)) {
            return false;
        }
        wtz wtzVar = (wtz) obj;
        return Intrinsics.d(this.f39767a, wtzVar.f39767a) && Intrinsics.d(this.b, wtzVar.b) && this.c == wtzVar.c && this.d == wtzVar.d && this.e == wtzVar.e && Intrinsics.d(this.f, wtzVar.f) && Intrinsics.d(this.g, wtzVar.g) && this.h == wtzVar.h && this.i.equals(wtzVar.i) && this.j.equals(wtzVar.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.i.hashCode() + brm0.e(f140.c(this.g, f140.c(this.f, brm0.e(twn.a(this.d, brm0.e(f140.c(this.b, this.f39767a.hashCode() * 31, 31), 31, this.c), 31), 31, this.e), 31), 31), 31, this.h)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LimitsAfricaUiState(moneyLimitUiModels=");
        sb.append(this.f39767a);
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
        sb.append(", limitBottomSheetUiModel=");
        sb.append(this.j);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
