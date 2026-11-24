package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class z6l0 implements b8l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z1l0 f43875a;
    public final String b;
    public final y3d c;
    public final boolean d;
    public final boolean e;
    public final r1l0 f;
    public final d3l0 g;

    public z6l0(z1l0 z1l0Var, String str, y3d y3dVar, boolean z, boolean z2) {
        this.f43875a = z1l0Var;
        this.b = str;
        this.c = y3dVar;
        this.d = z;
        this.e = z2;
        p1l0 p1l0Var = p1l0.SPORT_ICON;
        pz40 pz40Var = s6t0.f31722a;
        this.f = new r1l0(p1l0Var, new y3d(s6t0.b().f33626a.getSecondary()), s6t0.b().f33626a.getBackground(), str, null, y3dVar, null, null, null);
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
        if (!(obj instanceof z6l0)) {
            return false;
        }
        z6l0 z6l0Var = (z6l0) obj;
        return this.f43875a.equals(z6l0Var.f43875a) && this.b.equals(z6l0Var.b) && Intrinsics.d(this.c, z6l0Var.c) && this.d == z6l0Var.d && this.e == z6l0Var.e;
    }

    @Override // a.b8l0
    public final f2l0 getTitle() {
        return this.f43875a;
    }

    public final int hashCode() {
        int iHashCode;
        int iB = ua80.b(this.f43875a.hashCode() * 31, 961, this.b);
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
        StringBuilder sb = new StringBuilder("SportCounterWithListCheckbox(title=");
        sb.append(this.f43875a);
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
