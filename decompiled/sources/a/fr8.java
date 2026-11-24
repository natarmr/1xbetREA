package a;

/* JADX INFO: loaded from: classes.dex */
public final class fr8 implements er8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fq80 f10006a;
    public final int b;
    public final int c;
    public int d;
    public short e;

    public fr8(fv40 fv40Var) {
        fq80 fq80Var = fv40Var.e;
        this.f10006a = fq80Var;
        fq80Var.M(12);
        this.c = fq80Var.D() & 255;
        this.b = fq80Var.D();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [int, short] */
    @Override // a.er8
    public final int g() {
        fq80 fq80Var = this.f10006a;
        int i = this.c;
        if (i == 8) {
            return fq80Var.z();
        }
        if (i == 16) {
            return fq80Var.G();
        }
        int i2 = this.d;
        this.d = i2 + 1;
        if (i2 % 2 != 0) {
            return this.e & 15;
        }
        ?? Z = fq80Var.z();
        this.e = Z;
        return (Z & 240) >> 4;
    }

    @Override // a.er8
    public final int k() {
        return -1;
    }

    @Override // a.er8
    public final int m() {
        return this.b;
    }
}
