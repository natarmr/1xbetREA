package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vfg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final th90 f37330a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;

    public vfg0(th90 th90Var, String str, String str2, String str3, String str4, boolean z) {
        th90Var.getClass();
        this.f37330a = th90Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vfg0)) {
            return false;
        }
        vfg0 vfg0Var = (vfg0) obj;
        return Intrinsics.d(this.f37330a, vfg0Var.f37330a) && this.b.equals(vfg0Var.b) && this.c.equals(vfg0Var.c) && this.d.equals(vfg0Var.d) && this.e.equals(vfg0Var.e) && this.f == vfg0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ua80.b(ua80.b(ua80.b(ua80.b(this.f37330a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RoundPlayedUiModel(values=");
        sb.append(this.f37330a);
        sb.append(", crossesScore=");
        sb.append(this.b);
        sb.append(", noughtsScore=");
        f140.v(sb, this.c, ", crossIcon=", this.d, ", noughtIcon=");
        return defpackage.c.c(this.e, ", played=", Separators.RPAREN, sb, this.f);
    }
}
