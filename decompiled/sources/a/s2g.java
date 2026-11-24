package a;

/* JADX INFO: loaded from: classes.dex */
public final class s2g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p7m0 f31500a;

    public s2g() {
        this.f31500a = q7m0.a(Boolean.TRUE);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public void a(y38 y38Var, zje zjeVar) {
        de60 de60Var;
        if (zjeVar instanceof de60) {
            de60Var = (de60) zjeVar;
            int i = de60Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                de60Var.k = i - Integer.MIN_VALUE;
            } else {
                de60Var = new de60(this, zjeVar);
            }
        } else {
            de60Var = new de60(this, zjeVar);
        }
        Object obj = de60Var.i;
        wne wneVar = wne.f39444a;
        int i2 = de60Var.k;
        if (i2 == 0) {
            z1x.P(obj);
            de60Var.k = 1;
            this.f31500a.c(y38Var, de60Var);
        } else if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
        } else {
            z1x.P(obj);
            csj.b();
        }
    }

    public s2g(int i) {
        this.f31500a = q7m0.a(new int[i]);
    }
}
