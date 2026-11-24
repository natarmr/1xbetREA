package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class w7l0 implements b8l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d2l0 f38679a;
    public final String b;
    public final y3d c;
    public final boolean d;
    public final boolean e;
    public final t1l0 f;
    public final d3l0 g;

    public w7l0(d2l0 d2l0Var, String str, y3d y3dVar, boolean z, boolean z2) {
        this.f38679a = d2l0Var;
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
        if (!(obj instanceof w7l0)) {
            return false;
        }
        w7l0 w7l0Var = (w7l0) obj;
        return this.f38679a.equals(w7l0Var.f38679a) && this.b.equals(w7l0Var.b) && Intrinsics.d(this.c, w7l0Var.c) && this.d == w7l0Var.d && this.e == w7l0Var.e;
    }

    @Override // a.b8l0
    public final f2l0 getTitle() {
        return this.f38679a;
    }

    public final int hashCode() {
        int iHashCode;
        int iB = ua80.b(this.f38679a.hashCode() * 31, 961, this.b);
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
        sb.append(this.f38679a);
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
