package a;

/* JADX INFO: loaded from: classes6.dex */
public final class exh0 implements hxh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y3d f8577a;
    public final y3d b;
    public final y3d c;
    public final y3d d;

    public exh0(y3d y3dVar, y3d y3dVar2, y3d y3dVar3, y3d y3dVar4) {
        this.f8577a = y3dVar;
        this.b = y3dVar2;
        this.c = y3dVar3;
        this.d = y3dVar4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof exh0)) {
            return false;
        }
        exh0 exh0Var = (exh0) obj;
        return this.f8577a.equals(exh0Var.f8577a) && this.b.equals(exh0Var.b) && this.c.equals(exh0Var.c) && this.d.equals(exh0Var.d);
    }

    public final int hashCode() {
        long j = this.f8577a.f41946a;
        g2t0 g2t0Var = h2t0.b;
        return rw2.b(rw2.b(rw2.b(Long.hashCode(j) * 31, 961, this.b.f41946a), 31, this.c.f41946a), 31, this.d.f41946a);
    }

    public final String toString() {
        return "Custom(backgroundColor=" + this.f8577a + ", indicatorColor=" + this.b + ", dividerColor=null, segmentTextColorSelected=" + this.c + ", segmentTextColorUnselected=" + this.d + ", borderColor=null)";
    }
}
