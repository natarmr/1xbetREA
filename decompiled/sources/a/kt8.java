package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class kt8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jt8 f18850a;
    public final String b;
    public final int c;
    public final float d;
    public final int e;
    public final float f;

    public kt8(jt8 jt8Var, String str, int i, float f, int i2, float f2) {
        str.getClass();
        this.f18850a = jt8Var;
        this.b = str;
        this.c = i;
        this.d = f;
        this.e = i2;
        this.f = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kt8)) {
            return false;
        }
        kt8 kt8Var = (kt8) obj;
        return this.f18850a == kt8Var.f18850a && Intrinsics.d(this.b, kt8Var.b) && this.c == kt8Var.c && ycl.b(this.d, kt8Var.d) && this.e == kt8Var.e && ycl.b(this.f, kt8Var.f);
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + twn.a(this.e, defpackage.c.a(twn.a(this.c, ua80.b(this.f18850a.hashCode() * 31, 31, this.b), 31), this.d, 31), 31);
    }

    public final String toString() {
        String strC = ycl.c(this.d);
        String strC2 = ycl.c(this.f);
        StringBuilder sb = new StringBuilder("BracketSectionLabelUiModel(type=");
        sb.append(this.f18850a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", topRows=");
        kng0.w(this.c, ", topDp=", strC, ", labelAreaRows=", sb);
        return rw2.k(this.e, ", visualShiftDp=", strC2, Separators.RPAREN, sb);
    }
}
