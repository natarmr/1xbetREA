package a;

/* JADX INFO: loaded from: classes6.dex */
public final class ks8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final os8 f18801a;
    public final ls8 b;
    public final os8 c;
    public final os8 d;

    public ks8() {
        ms8 ms8Var = new ms8(0.86666f, 0.436f);
        ls8 ls8Var = ls8.f20564a;
        ms8 ms8Var2 = new ms8(0.032f, 0.016f);
        ms8 ms8Var3 = new ms8(0.032f, 0.016f);
        this.f18801a = ms8Var;
        this.b = ls8Var;
        this.c = ms8Var2;
        this.d = ms8Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ks8)) {
            return false;
        }
        ks8 ks8Var = (ks8) obj;
        return this.f18801a.equals(ks8Var.f18801a) && this.b == ks8Var.b && this.c.equals(ks8Var.c) && this.d.equals(ks8Var.d);
    }

    public final int hashCode() {
        return Integer.hashCode(16) + ((this.d.hashCode() + ((this.c.hashCode() + twn.a(0, (this.b.hashCode() + (this.f18801a.hashCode() * 31)) * 31, 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Config(cellWidth=" + this.f18801a + ", contentMode=" + this.b + ", horizontalPageOffset=0, lineStartLength=" + this.c + ", lineEndLength=" + this.d + ", nextLayerShowLength=16)";
    }
}
