package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class wap0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f38841a;
    public final Integer b;
    public final j0g0 c;
    public final sff0 d;
    public final boolean e;

    public wap0(boolean z, Integer num, j0g0 j0g0Var, sff0 sff0Var, boolean z2) {
        this.f38841a = z;
        this.b = num;
        this.c = j0g0Var;
        this.d = sff0Var;
        this.e = z2;
    }

    public static wap0 a(wap0 wap0Var, boolean z, Integer num, j0g0 j0g0Var, int i) {
        if ((i & 1) != 0) {
            z = wap0Var.f38841a;
        }
        boolean z2 = z;
        if ((i & 2) != 0) {
            num = wap0Var.b;
        }
        Integer num2 = num;
        if ((i & 4) != 0) {
            j0g0Var = wap0Var.c;
        }
        sff0 sff0Var = wap0Var.d;
        boolean z3 = wap0Var.e;
        wap0Var.getClass();
        return new wap0(z2, num2, j0g0Var, sff0Var, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wap0)) {
            return false;
        }
        wap0 wap0Var = (wap0) obj;
        return this.f38841a == wap0Var.f38841a && Intrinsics.d(this.b, wap0Var.b) && Intrinsics.d(this.c, wap0Var.c) && this.d.equals(wap0Var.d) && this.e == wap0Var.e;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f38841a) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        j0g0 j0g0Var = this.c;
        return Boolean.hashCode(this.e) + cs0.c(this.d, (iHashCode2 + (j0g0Var != null ? j0g0.b(j0g0Var.f15681a) : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TeamDetailsResultsStateModel(connected=");
        sb.append(this.f38841a);
        sb.append(", selectedDateIndex=");
        sb.append(this.b);
        sb.append(", teamResults=");
        sb.append(this.c);
        sb.append(", remoteConfigModel=");
        sb.append(this.d);
        sb.append(", supportRtl=");
        return rw2.p(sb, this.e, Separators.RPAREN);
    }
}
