package a;

/* JADX INFO: loaded from: classes.dex */
public final class s45 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dzb0 f31589a;
    public final b1x b;

    public s45(dzb0 dzb0Var, b1x b1xVar) {
        if (dzb0Var == null) {
            hny.u("Null processingRequest");
            throw null;
        }
        this.f31589a = dzb0Var;
        this.b = b1xVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s45)) {
            return false;
        }
        s45 s45Var = (s45) obj;
        return this.f31589a.equals(s45Var.f31589a) && this.b.equals(s45Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.f31589a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "InputPacket{processingRequest=" + this.f31589a + ", imageProxy=" + this.b + "}";
    }
}
