package a;

/* JADX INFO: loaded from: classes.dex */
public final class pq00 extends hy40 {
    public final saw0 l;
    public clz m;
    public qq00 n;

    public pq00(saw0 saw0Var) {
        this.l = saw0Var;
        if (saw0Var.f31903a == null) {
            saw0Var.f31903a = this;
        } else {
            jf4.n("There is already a listener registered");
            throw null;
        }
    }

    @Override // a.wh00
    public final void g() {
        saw0 saw0Var = this.l;
        saw0Var.b = true;
        saw0Var.d = false;
        saw0Var.c = false;
        saw0Var.i.drainPermits();
        saw0Var.d();
    }

    @Override // a.wh00
    public final void h() {
        this.l.b = false;
    }

    @Override // a.wh00
    public final void j(ee60 ee60Var) {
        super.j(ee60Var);
        this.m = null;
        this.n = null;
    }

    public final void m() {
        clz clzVar = this.m;
        qq00 qq00Var = this.n;
        if (clzVar == null || qq00Var == null) {
            return;
        }
        super.j(qq00Var);
        e(clzVar, qq00Var);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #0 : ");
        Class<?> cls = this.l.getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append("}}");
        return sb.toString();
    }
}
