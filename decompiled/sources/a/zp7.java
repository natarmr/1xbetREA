package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class zp7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f44745a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final String f;
    public final int g;
    public final String h;
    public final v5l0 i;
    public final boolean j;

    public zp7(List list, boolean z, boolean z2, boolean z3, String str, String str2, int i, String str3, v5l0 v5l0Var, boolean z4) {
        list.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.f44745a = list;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = str;
        this.f = str2;
        this.g = i;
        this.h = str3;
        this.i = v5l0Var;
        this.j = z4;
    }

    public static zp7 a(zp7 zp7Var, List list, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            list = zp7Var.f44745a;
        }
        List list2 = list;
        if ((i & 2) != 0) {
            z = zp7Var.b;
        }
        boolean z4 = z;
        if ((i & 4) != 0) {
            z2 = zp7Var.c;
        }
        boolean z5 = z2;
        boolean z6 = (i & 8) != 0 ? zp7Var.d : z3;
        String str = zp7Var.e;
        String str2 = zp7Var.f;
        int i2 = zp7Var.g;
        String str3 = zp7Var.h;
        v5l0 v5l0Var = zp7Var.i;
        boolean z7 = zp7Var.j;
        zp7Var.getClass();
        list2.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        return new zp7(list2, z4, z5, z6, str, str2, i2, str3, v5l0Var, z7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zp7)) {
            return false;
        }
        zp7 zp7Var = (zp7) obj;
        return Intrinsics.d(this.f44745a, zp7Var.f44745a) && this.b == zp7Var.b && this.c == zp7Var.c && this.d == zp7Var.d && Intrinsics.d(this.e, zp7Var.e) && Intrinsics.d(this.f, zp7Var.f) && this.g == zp7Var.g && Intrinsics.d(this.h, zp7Var.h) && this.i == zp7Var.i && this.j == zp7Var.j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j) + axq.c(this.i, ua80.b(twn.a(this.g, ua80.b(ua80.b(brm0.e(brm0.e(brm0.e(this.f44745a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31), 31, this.h), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BetWithoutRiskStateModel(matches=");
        sb.append(this.f44745a);
        sb.append(", isLoadingShowing=");
        sb.append(this.b);
        sb.append(", isErrorShowing=");
        ua80.u(", appBarExpandedState=", ", imgUrl=", sb, this.c, this.d);
        f140.v(sb, this.e, ", title=", this.f, ", lotteryId=");
        kng0.w(this.g, ", bannerId=", this.h, ", sportEventCardStyle=", sb);
        sb.append(this.i);
        sb.append(", supportRtl=");
        sb.append(this.j);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
