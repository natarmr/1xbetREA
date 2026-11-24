package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class r7l0 implements s7l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b2l0 f29982a;
    public final int b;
    public final String c;
    public final y3d d;
    public final boolean e;
    public final boolean f;
    public final t1l0 g;
    public final a3l0 h;

    public r7l0(b2l0 b2l0Var, int i, String str, y3d y3dVar, boolean z, boolean z2) {
        this.f29982a = b2l0Var;
        this.b = i;
        this.c = str;
        this.d = y3dVar;
        this.e = z;
        this.f = z2;
        p1l0 p1l0Var = p1l0.SPORT_ICON;
        pz40 pz40Var = s6t0.f31722a;
        this.g = new t1l0(p1l0Var, new y3d(s6t0.b().f33626a.getSecondary()), str, null, y3dVar, null, 192);
        this.h = new a3l0(new fpe(null, false, 3), i, z, z2);
    }

    @Override // a.b8l0
    public final u1l0 a() {
        return this.g;
    }

    @Override // a.b8l0
    public final g3l0 b() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7l0)) {
            return false;
        }
        r7l0 r7l0Var = (r7l0) obj;
        return this.f29982a.equals(r7l0Var.f29982a) && this.b == r7l0Var.b && this.c.equals(r7l0Var.c) && Intrinsics.d(this.d, r7l0Var.d) && this.e == r7l0Var.e && this.f == r7l0Var.f;
    }

    @Override // a.b8l0
    public final f2l0 getTitle() {
        return this.f29982a;
    }

    public final int hashCode() {
        int iHashCode;
        int iB = ua80.b(twn.a(this.b, this.f29982a.hashCode() * 31, 31), 961, this.c);
        y3d y3dVar = this.d;
        if (y3dVar == null) {
            iHashCode = 0;
        } else {
            long j = y3dVar.f41946a;
            g2t0 g2t0Var = h2t0.b;
            iHashCode = Long.hashCode(j);
        }
        return Boolean.hashCode(this.f) + brm0.e((iB + iHashCode) * 961, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SportCounterWithListCheckbox(title=");
        sb.append(this.f29982a);
        sb.append(", counterValue=");
        sb.append(this.b);
        sb.append(", iconUrl=");
        sb.append(this.c);
        sb.append(", iconResId=null, iconColor=");
        sb.append(this.d);
        sb.append(", badgeStyle=null, active=");
        return ohs0.p(", enabled=", Separators.RPAREN, sb, this.e, this.f);
    }
}
