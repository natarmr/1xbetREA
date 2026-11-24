package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q6g0 extends v8b {
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final String h;
    public final t2m0 i;
    public final int j;
    public final int k;
    public final int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6g0(String str, String str2, String str3, boolean z, String str4, t2m0 t2m0Var, int i, int i2, int i3) {
        super(22, Integer.valueOf(i3), null, q3d.j(new h9b(str), new g9b(i2), new f9b(i), new g9b(i2), new h9b(str2)));
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = z;
        this.h = str4;
        this.i = t2m0Var;
        this.j = i;
        this.k = i2;
        this.l = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q6g0)) {
            return false;
        }
        q6g0 q6g0Var = (q6g0) obj;
        return Intrinsics.d(this.d, q6g0Var.d) && Intrinsics.d(this.e, q6g0Var.e) && Intrinsics.d(this.f, q6g0Var.f) && this.g == q6g0Var.g && Intrinsics.d(this.h, q6g0Var.h) && this.i == q6g0Var.i && this.j == q6g0Var.j && this.k == q6g0Var.k && this.l == q6g0Var.l;
    }

    public final int hashCode() {
        return Integer.hashCode(this.l) + twn.a(this.k, twn.a(this.j, (this.i.hashCode() + ua80.b(brm0.e(ua80.b(ua80.b(this.d.hashCode() * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("RowHeaderCell(position=", this.d, ", title=", this.e, ", image=");
        brm0.C(this.f, ", isClickable=", ", teamId=", sbN, this.g);
        sbN.append(this.h);
        sbN.append(", color=");
        sbN.append(this.i);
        sbN.append(", iconWidth=");
        axq.r(this.j, this.k, ", spaceWidth=", ", maxCellWidth=", sbN);
        return rz4.j(this.l, Separators.RPAREN, sbN);
    }
}
