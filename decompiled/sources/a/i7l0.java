package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i7l0 implements b8l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b2l0 f14297a;
    public final int b;
    public final String c;
    public final y3d d;
    public final t1l0 e;
    public final w2l0 f;

    public i7l0(b2l0 b2l0Var, int i, String str, y3d y3dVar) {
        this.f14297a = b2l0Var;
        this.b = i;
        this.c = str;
        this.d = y3dVar;
        p1l0 p1l0Var = p1l0.SPORT_ICON;
        pz40 pz40Var = s6t0.f31722a;
        this.e = new t1l0(p1l0Var, new y3d(s6t0.b().f33626a.getSecondary()), str, null, y3dVar, null, 192);
        this.f = new w2l0(i, new kpe());
    }

    @Override // a.b8l0
    public final u1l0 a() {
        return this.e;
    }

    @Override // a.b8l0
    public final g3l0 b() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i7l0)) {
            return false;
        }
        i7l0 i7l0Var = (i7l0) obj;
        return this.f14297a.equals(i7l0Var.f14297a) && this.b == i7l0Var.b && this.c.equals(i7l0Var.c) && Intrinsics.d(this.d, i7l0Var.d);
    }

    @Override // a.b8l0
    public final f2l0 getTitle() {
        return this.f14297a;
    }

    public final int hashCode() {
        int iHashCode;
        int iB = ua80.b(twn.a(this.b, this.f14297a.hashCode() * 31, 31), 961, this.c);
        y3d y3dVar = this.d;
        if (y3dVar == null) {
            iHashCode = 0;
        } else {
            long j = y3dVar.f41946a;
            g2t0 g2t0Var = h2t0.b;
            iHashCode = Long.hashCode(j);
        }
        return (iB + iHashCode) * 31;
    }

    public final String toString() {
        return "SportCounter(title=" + this.f14297a + ", counterValue=" + this.b + ", iconUrl=" + this.c + ", iconResId=null, iconColor=" + this.d + ", badgeStyle=null)";
    }
}
