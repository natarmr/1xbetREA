package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i5s0 extends v8b {
    public final String d;
    public final int e;
    public final String f;
    public final String g;
    public final String h;
    public final int i;
    public final List j;
    public final int k;
    public final int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5s0(String str, int i, String str2, String str3, String str4, int i2, List list, int i3, int i4) {
        super(6, Integer.valueOf(i3), Integer.valueOf(i4), list);
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        list.getClass();
        this.d = str;
        this.e = i;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = i2;
        this.j = list;
        this.k = i3;
        this.l = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5s0)) {
            return false;
        }
        i5s0 i5s0Var = (i5s0) obj;
        return Intrinsics.d(this.d, i5s0Var.d) && this.e == i5s0Var.e && Intrinsics.d(this.f, i5s0Var.f) && Intrinsics.d(this.g, i5s0Var.g) && Intrinsics.d(this.h, i5s0Var.h) && this.i == i5s0Var.i && Intrinsics.d(this.j, i5s0Var.j) && this.k == i5s0Var.k && this.l == i5s0Var.l;
    }

    public final int hashCode() {
        return Integer.hashCode(this.l) + twn.a(this.k, dw9.a(twn.a(this.i, ua80.b(ua80.b(ua80.b(twn.a(this.e, this.d.hashCode() * 31, 31), 31, this.f), 31, this.g), 31, this.h), 31), 31, this.j), 31);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.e, "Data(teamName=", this.d, ", color=", ", image=");
        f140.v(sbP, this.f, ", teamId=", this.g, ", position=");
        twn.w(this.i, this.h, ", clId=", ", cellContentList=", sbP);
        brm0.v(this.k, ", widthMax=", ", widthMin=", sbP, this.j);
        return rz4.j(this.l, Separators.RPAREN, sbP);
    }
}
