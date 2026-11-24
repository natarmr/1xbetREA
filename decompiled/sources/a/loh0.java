package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class loh0 implements noh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ssh0 f20390a;
    public final boolean b;
    public final int c;
    public final long d;
    public final long e;
    public final boolean f;
    public final String g;
    public final String h;

    public loh0(ssh0 ssh0Var, boolean z, int i, long j, long j2, boolean z2, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f20390a = ssh0Var;
        this.b = z;
        this.c = i;
        this.d = j;
        this.e = j2;
        this.f = z2;
        this.g = str;
        this.h = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof loh0)) {
            return false;
        }
        loh0 loh0Var = (loh0) obj;
        if (this.f20390a != loh0Var.f20390a || this.b != loh0Var.b || this.c != loh0Var.c) {
            return false;
        }
        long j = loh0Var.d;
        int i = y3d.h;
        return h2t0.a(this.d, j) && h2t0.a(this.e, loh0Var.e) && this.f == loh0Var.f && Intrinsics.d(this.g, loh0Var.g) && Intrinsics.d(this.h, loh0Var.h);
    }

    public final int hashCode() {
        int iA = twn.a(this.c, brm0.e(this.f20390a.hashCode() * 31, 31, this.b), 31);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return this.h.hashCode() + ua80.b(brm0.e(rw2.b(rw2.b(iA, 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    @Override // a.noh0
    public final boolean s() {
        return this.b;
    }

    @Override // a.noh0
    public final ssh0 t() {
        return this.f20390a;
    }

    public final String toString() {
        String strI = y3d.i(this.d);
        String strI2 = y3d.i(this.e);
        StringBuilder sb = new StringBuilder("Simple(settingType=");
        sb.append(this.f20390a);
        sb.append(", settingAchieved=");
        sb.append(this.b);
        sb.append(", painterRes=");
        kng0.w(this.c, ", descriptionColor=", strI, ", iconTint=", sb);
        brm0.C(strI2, ", showArrow=", ", title=", sb, this.f);
        return ua80.m(sb, this.g, ", description=", this.h, Separators.RPAREN);
    }
}
