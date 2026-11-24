package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class vv1 implements xv1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38076a;
    public final n0x b;
    public final String c;
    public final String d;
    public final String e;

    public vv1(String str, n0x n0xVar, String str2, String str3, String str4) {
        str.getClass();
        str3.getClass();
        this.f38076a = str;
        this.b = n0xVar;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vv1)) {
            return false;
        }
        vv1 vv1Var = (vv1) obj;
        return Intrinsics.d(this.f38076a, vv1Var.f38076a) && this.b.equals(vv1Var.b) && this.c.equals(vv1Var.c) && Intrinsics.d(this.d, vv1Var.d) && this.e.equals(vv1Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b(f140.f(this.b, this.f38076a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(id=");
        sb.append(this.f38076a);
        sb.append(", icon=");
        sb.append(this.b);
        sb.append(", title=");
        f140.v(sb, this.c, ", subtitleAmount=", this.d, ", subtitleFs=");
        return axq.n(sb, this.e, Separators.RPAREN);
    }
}
