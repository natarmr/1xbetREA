package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f7l0 implements b8l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b2l0 f9063a;
    public final String b;
    public final y3d c;
    public final boolean d;
    public final boolean e;
    public final t1l0 f;
    public final d3l0 g;

    public f7l0(b2l0 b2l0Var, String str, y3d y3dVar, boolean z, boolean z2) {
        this.f9063a = b2l0Var;
        this.b = str;
        this.c = y3dVar;
        this.d = z;
        this.e = z2;
        p1l0 p1l0Var = p1l0.CHAMPIONSHIP_ICON;
        pz40 pz40Var = s6t0.f31722a;
        this.f = new t1l0(p1l0Var, new y3d(s6t0.b().f33626a.getSecondary()), str, null, y3dVar, null, 192);
        this.g = new d3l0(z, z2);
    }

    @Override // a.b8l0
    public final u1l0 a() {
        return this.f;
    }

    @Override // a.b8l0
    public final g3l0 b() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f7l0)) {
            return false;
        }
        f7l0 f7l0Var = (f7l0) obj;
        return this.f9063a.equals(f7l0Var.f9063a) && this.b.equals(f7l0Var.b) && Intrinsics.d(this.c, f7l0Var.c) && this.d == f7l0Var.d && this.e == f7l0Var.e;
    }

    @Override // a.b8l0
    public final f2l0 getTitle() {
        return this.f9063a;
    }

    public final int hashCode() {
        int iHashCode;
        int iB = ua80.b(this.f9063a.hashCode() * 31, 961, this.b);
        y3d y3dVar = this.c;
        if (y3dVar == null) {
            iHashCode = 0;
        } else {
            long j = y3dVar.f41946a;
            g2t0 g2t0Var = h2t0.b;
            iHashCode = Long.hashCode(j);
        }
        return Boolean.hashCode(this.e) + brm0.e((iB + iHashCode) * 961, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ListCheckbox(title=");
        sb.append(this.f9063a);
        sb.append(", iconUrl=");
        sb.append(this.b);
        sb.append(", iconResId=null, iconColor=");
        sb.append(this.c);
        sb.append(", badgeStyle=null, active=");
        sb.append(this.d);
        sb.append(", enabled=");
        return rw2.p(sb, this.e, Separators.RPAREN);
    }
}
