package a;

/* JADX INFO: loaded from: classes6.dex */
public final class tr8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xr8 f34412a;
    public final ur8 b;
    public final xr8 c;
    public final xr8 d;

    public tr8() {
        vr8 vr8Var = new vr8(0.86666f, 0.436f);
        ur8 ur8Var = ur8.f36151a;
        vr8 vr8Var2 = new vr8(0.032f, 0.016f);
        vr8 vr8Var3 = new vr8(0.032f, 0.016f);
        this.f34412a = vr8Var;
        this.b = ur8Var;
        this.c = vr8Var2;
        this.d = vr8Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tr8)) {
            return false;
        }
        tr8 tr8Var = (tr8) obj;
        return this.f34412a.equals(tr8Var.f34412a) && this.b == tr8Var.b && this.c.equals(tr8Var.c) && this.d.equals(tr8Var.d);
    }

    public final int hashCode() {
        return Integer.hashCode(16) + ((this.d.hashCode() + ((this.c.hashCode() + twn.a(0, (this.b.hashCode() + twn.a(92, this.f34412a.hashCode() * 31, 31)) * 31, 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Config(cellWidth=" + this.f34412a + ", cellHeight=92, contentMode=" + this.b + ", horizontalPageOffset=0, lineStartLength=" + this.c + ", lineEndLength=" + this.d + ", nextLayerShowLength=16)";
    }
}
