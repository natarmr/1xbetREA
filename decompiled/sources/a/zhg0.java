package a;

/* JADX INFO: loaded from: classes6.dex */
public final class zhg0 implements yhg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zhg0 f44392a = new zhg0();

    @Override // a.yhg0
    public final mm40 a(float f, mm40 mm40Var, boolean z) {
        if (f <= 0.0d) {
            vcx.a("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return mm40Var.e(new x7z(f, z));
    }

    @Override // a.yhg0
    public final mm40 b(yx7 yx7Var, mm40 mm40Var) {
        return twn.l(yx7Var, mm40Var);
    }
}
