package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class kyo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jyo0 f19116a;
    public final String b;
    public final String c;
    public final long d;
    public final j3p0 e;
    public final boolean f;
    public final boolean g;

    public kyo0(jyo0 jyo0Var, String str, String str2, long j, j3p0 j3p0Var, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        j3p0Var.getClass();
        this.f19116a = jyo0Var;
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = j3p0Var;
        this.f = z;
        this.g = z2;
    }

    public static kyo0 a(kyo0 kyo0Var, jyo0 jyo0Var, String str, j3p0 j3p0Var, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            jyo0Var = kyo0Var.f19116a;
        }
        jyo0 jyo0Var2 = jyo0Var;
        String str2 = kyo0Var.b;
        if ((i & 4) != 0) {
            str = kyo0Var.c;
        }
        String str3 = str;
        long j = kyo0Var.d;
        if ((i & 16) != 0) {
            j3p0Var = kyo0Var.e;
        }
        j3p0 j3p0Var2 = j3p0Var;
        if ((i & 32) != 0) {
            z = kyo0Var.f;
        }
        boolean z3 = z;
        if ((i & 64) != 0) {
            z2 = kyo0Var.g;
        }
        kyo0Var.getClass();
        str2.getClass();
        str3.getClass();
        j3p0Var2.getClass();
        return new kyo0(jyo0Var2, str2, str3, j, j3p0Var2, z3, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kyo0)) {
            return false;
        }
        kyo0 kyo0Var = (kyo0) obj;
        return Intrinsics.d(this.f19116a, kyo0Var.f19116a) && Intrinsics.d(this.b, kyo0Var.b) && Intrinsics.d(this.c, kyo0Var.c) && this.d == kyo0Var.d && this.e == kyo0Var.e && this.f == kyo0Var.f && this.g == kyo0Var.g;
    }

    public final int hashCode() {
        jyo0 jyo0Var = this.f19116a;
        return Boolean.hashCode(this.g) + brm0.e((this.e.hashCode() + rw2.b(ua80.b(ua80.b((jyo0Var == null ? 0 : jyo0Var.f17370a.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TeamBetContainerScreenState(config=");
        sb.append(this.f19116a);
        sb.append(", teamName=");
        sb.append(this.b);
        sb.append(", teamImage=");
        defpackage.c.i(sb, this.d, this.c, ", sportId=");
        sb.append(", selectedTab=");
        sb.append(this.e);
        sb.append(", subscribed=");
        sb.append(this.f);
        return f140.n(sb, ", favorite=", this.g, Separators.RPAREN);
    }
}
