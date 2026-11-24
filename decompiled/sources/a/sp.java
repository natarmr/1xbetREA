package a;

/* JADX INFO: loaded from: classes3.dex */
public final class sp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rrd f32566a;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(long j, zje zjeVar) {
        cpx cpxVar;
        if (zjeVar instanceof cpx) {
            cpxVar = (cpx) zjeVar;
            int i = cpxVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                cpxVar.k = i - Integer.MIN_VALUE;
            } else {
                cpxVar = new cpx(this, zjeVar);
            }
        } else {
            cpxVar = new cpx(this, zjeVar);
        }
        Object objG = cpxVar.i;
        Object obj = wne.f39444a;
        int i2 = cpxVar.k;
        if (i2 == 0) {
            z1x.P(objG);
            tl5 tl5Var = tl5.c;
            cpxVar.k = 1;
            objG = this.f32566a.g(j, tl5Var, cpxVar);
            if (objG == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objG);
        }
        return Boolean.valueOf(!((ql5) objG).i.a());
    }

    public void b(ql5 ql5Var) {
        ql5Var.getClass();
        tg5 tg5Var = (tg5) this.f32566a.b;
        tg5Var.c(ql5Var);
        tg5Var.c = System.currentTimeMillis();
    }
}
