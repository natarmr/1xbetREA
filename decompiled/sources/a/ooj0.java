package a;

/* JADX INFO: loaded from: classes2.dex */
public final class ooj0 implements nwk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qoj0 f25598a;
    public final long b;
    public final Object c;
    public final n5a d;

    public ooj0(qoj0 qoj0Var, long j, Object obj, n5a n5aVar) {
        this.f25598a = qoj0Var;
        this.b = j;
        this.c = obj;
        this.d = n5aVar;
    }

    @Override // a.nwk
    public final void a() {
        qoj0 qoj0Var = this.f25598a;
        synchronized (qoj0Var) {
            if (this.b >= qoj0Var.s()) {
                Object[] objArr = qoj0Var.h;
                objArr.getClass();
                long j = this.b;
                if (objArr[((int) j) & (objArr.length - 1)] == this) {
                    roj0.d(objArr, j, roj0.f30841a);
                    qoj0Var.n();
                }
            }
        }
    }
}
