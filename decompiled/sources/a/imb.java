package a;

/* JADX INFO: loaded from: classes3.dex */
public final class imb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p7m0 f15016a;

    public imb(byte b) {
        switch (b) {
            case 2:
                this.f15016a = q7m0.a("");
                break;
            default:
                this.f15016a = q7m0.a(iun.f15405a);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public void a(h5v h5vVar, zje zjeVar) {
        ce60 ce60Var;
        if (zjeVar instanceof ce60) {
            ce60Var = (ce60) zjeVar;
            int i = ce60Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ce60Var.k = i - Integer.MIN_VALUE;
            } else {
                ce60Var = new ce60(this, zjeVar);
            }
        } else {
            ce60Var = new ce60(this, zjeVar);
        }
        Object obj = ce60Var.i;
        wne wneVar = wne.f39444a;
        int i2 = ce60Var.k;
        if (i2 == 0) {
            z1x.P(obj);
            ce60Var.k = 1;
            this.f15016a.c(h5vVar, ce60Var);
        } else if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
        } else {
            z1x.P(obj);
            csj.b();
        }
    }

    public imb(int i) {
        this.f15016a = q7m0.a(new int[i]);
    }
}
