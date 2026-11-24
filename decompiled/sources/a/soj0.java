package a;

/* JADX INFO: loaded from: classes2.dex */
public final class soj0 extends f5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f32545a;
    public n5a b;

    @Override // a.f5
    public final boolean a(e5 e5Var) {
        qoj0 qoj0Var = (qoj0) e5Var;
        if (this.f32545a >= 0) {
            return false;
        }
        long j = qoj0Var.i;
        if (j < qoj0Var.j) {
            qoj0Var.j = j;
        }
        this.f32545a = j;
        return true;
    }

    @Override // a.f5
    public final yje[] b(e5 e5Var) {
        long j = this.f32545a;
        this.f32545a = -1L;
        this.b = null;
        return ((qoj0) e5Var).y(j);
    }
}
