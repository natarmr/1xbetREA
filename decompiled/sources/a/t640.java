package a;

/* JADX INFO: loaded from: classes.dex */
public final class t640 implements q2h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4 f33398a;
    public final bet0 b;
    public final xso c;

    public t640(bet0 bet0Var, xso xsoVar, a4 a4Var) {
        this.b = bet0Var;
        xsoVar.getClass();
        this.c = xsoVar;
        this.f33398a = a4Var;
    }

    @Override // a.q2h0
    public final void a(Object obj, Object obj2) {
        y2h0.k(this.b, obj, obj2);
    }

    @Override // a.q2h0
    public final void b(Object obj) {
        this.b.getClass();
        ydt0 ydt0Var = ((mjt) obj).unknownFields;
        if (ydt0Var.e) {
            ydt0Var.e = false;
        }
        this.c.getClass();
        rw2.w(obj);
        throw null;
    }

    @Override // a.q2h0
    public final boolean c(Object obj) {
        this.c.getClass();
        rw2.w(obj);
        throw null;
    }

    @Override // a.q2h0
    public final mjt d() {
        a4 a4Var = this.f33398a;
        return a4Var instanceof mjt ? ((mjt) a4Var).i() : ((bjt) ((mjt) a4Var).c(5)).b();
    }

    @Override // a.q2h0
    public final int e(mjt mjtVar) {
        this.b.getClass();
        ydt0 ydt0Var = mjtVar.unknownFields;
        int i = ydt0Var.d;
        if (i != -1) {
            return i;
        }
        int iF = 0;
        for (int i2 = 0; i2 < ydt0Var.f42457a; i2++) {
            int i3 = ydt0Var.b[i2] >>> 3;
            iF += syc.f(3, (mg9) ydt0Var.c[i2]) + syc.i(i3) + syc.h(2) + (syc.h(1) * 2);
        }
        ydt0Var.d = iF;
        return iF;
    }

    @Override // a.q2h0
    public final void f(Object obj, hu5 hu5Var, tso tsoVar) {
        this.b.getClass();
        bet0.a(obj);
        this.c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // a.q2h0
    public final void g(Object obj, yqc yqcVar) {
        this.c.getClass();
        rw2.w(obj);
        throw null;
    }

    @Override // a.q2h0
    public final int h(mjt mjtVar) {
        this.b.getClass();
        return mjtVar.unknownFields.hashCode();
    }

    @Override // a.q2h0
    public final boolean i(mjt mjtVar, mjt mjtVar2) {
        this.b.getClass();
        return mjtVar.unknownFields.equals(mjtVar2.unknownFields);
    }
}
