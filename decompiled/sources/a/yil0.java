package a;

/* JADX INFO: loaded from: classes6.dex */
public final class yil0 implements bjl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f42698a;
    public final n0x b;
    public final o4n c;
    public final ejl0 d;
    public final ynm e;

    public yil0(long j, n0x n0xVar, o4n o4nVar, ejl0 ejl0Var, ynm ynmVar) {
        this.f42698a = j;
        this.b = n0xVar;
        this.c = o4nVar;
        this.d = ejl0Var;
        this.e = ynmVar;
    }

    @Override // a.bjl0
    public final long a() {
        return this.f42698a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yil0)) {
            return false;
        }
        yil0 yil0Var = (yil0) obj;
        return this.f42698a == yil0Var.f42698a && this.b.equals(yil0Var.b) && this.c.equals(yil0Var.c) && this.d.equals(yil0Var.d) && this.e.equals(yil0Var.e);
    }

    public final int hashCode() {
        return (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + f140.f(this.b, Long.hashCode(this.f42698a) * 31, 31)) * 31)) * 31)) * 31;
    }

    public final String toString() {
        return "LargeCardWatermark(gameId=" + this.f42698a + ", watermark=" + this.b + ", topBlock=" + this.c + ", middleBlock=" + this.d + ", bottomBlock=" + this.e + ", watermarkColor=null)";
    }
}
