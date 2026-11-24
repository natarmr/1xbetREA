package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ncv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f23312a;
    public final i3m0 b;
    public final boolean c;
    public final dxh0 d;
    public final boolean e;
    public final boolean f;
    public final int g;
    public final boolean h;

    public ncv0(List list, i3m0 i3m0Var, boolean z, dxh0 dxh0Var, boolean z2, boolean z3, int i, boolean z4) {
        list.getClass();
        this.f23312a = list;
        this.b = i3m0Var;
        this.c = z;
        this.d = dxh0Var;
        this.e = z2;
        this.f = z3;
        this.g = i;
        this.h = z4;
    }

    public static ncv0 a(ncv0 ncv0Var, List list, i3m0 i3m0Var, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            list = ncv0Var.f23312a;
        }
        List list2 = list;
        if ((i & 2) != 0) {
            i3m0Var = ncv0Var.b;
        }
        i3m0 i3m0Var2 = i3m0Var;
        if ((i & 4) != 0) {
            z = ncv0Var.c;
        }
        boolean z4 = z;
        dxh0 dxh0Var = ncv0Var.d;
        if ((i & 16) != 0) {
            z2 = ncv0Var.e;
        }
        boolean z5 = z2;
        boolean z6 = ncv0Var.f;
        int i2 = ncv0Var.g;
        if ((i & 128) != 0) {
            z3 = ncv0Var.h;
        }
        ncv0Var.getClass();
        list2.getClass();
        return new ncv0(list2, i3m0Var2, z4, dxh0Var, z5, z6, i2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ncv0)) {
            return false;
        }
        ncv0 ncv0Var = (ncv0) obj;
        return Intrinsics.d(this.f23312a, ncv0Var.f23312a) && Intrinsics.d(this.b, ncv0Var.b) && this.c == ncv0Var.c && this.d.equals(ncv0Var.d) && this.e == ncv0Var.e && this.f == ncv0Var.f && this.g == ncv0Var.g && this.h == ncv0Var.h;
    }

    public final int hashCode() {
        int iHashCode = this.f23312a.hashCode() * 31;
        i3m0 i3m0Var = this.b;
        return Boolean.hashCode(this.h) + twn.a(this.g, brm0.e(brm0.e(hne.h(this.d, brm0.e((iHashCode + (i3m0Var == null ? 0 : i3m0Var.hashCode())) * 31, 31, this.c), 31), 31, this.e), 31, this.f), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WhoWinStateModel(availableTabList=");
        sb.append(this.f23312a);
        sb.append(", selectedTab=");
        sb.append(this.b);
        sb.append(", isError=");
        sb.append(this.c);
        sb.append(", segmentedControlStyle=");
        sb.append(this.d);
        sb.append(", isAuthorized=");
        ua80.u(", isNewEventParams=", ", lottieType=", sb, this.e, this.f);
        return ohs0.k(this.g, ", isLoading=", Separators.RPAREN, sb, this.h);
    }
}
