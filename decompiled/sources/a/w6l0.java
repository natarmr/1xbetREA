package a;

/* JADX INFO: loaded from: classes6.dex */
public final class w6l0 implements b8l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y1l0 f38629a;
    public final Integer b;
    public final y3d c;
    public final r1l0 d;

    public w6l0(y1l0 y1l0Var, Integer num, y3d y3dVar) {
        this.f38629a = y1l0Var;
        this.b = num;
        this.c = y3dVar;
        p1l0 p1l0Var = p1l0.CHAMPIONSHIP_ICON;
        pz40 pz40Var = s6t0.f31722a;
        this.d = new r1l0(p1l0Var, new y3d(s6t0.b().f33626a.getSecondary()), s6t0.b().f33626a.getBackground(), null, num, y3dVar, null, null, null);
    }

    @Override // a.b8l0
    public final u1l0 a() {
        return this.d;
    }

    @Override // a.b8l0
    public final g3l0 b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6l0)) {
            return false;
        }
        w6l0 w6l0Var = (w6l0) obj;
        return this.f38629a.equals(w6l0Var.f38629a) && this.b.equals(w6l0Var.b) && this.c.equals(w6l0Var.c);
    }

    @Override // a.b8l0
    public final f2l0 getTitle() {
        return this.f38629a;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f38629a.hashCode() * 961)) * 31;
        long j = this.c.f41946a;
        g2t0 g2t0Var = h2t0.b;
        return rw2.b(iHashCode, 31, j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResultChampionshipCounter(title=");
        sb.append(this.f38629a);
        sb.append(", iconUrl=null, iconResId=");
        sb.append(this.b);
        sb.append(", iconColor=");
        return hne.p(sb, this.c, ", badgeStyle=null)");
    }
}
