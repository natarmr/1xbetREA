package a;

/* JADX INFO: loaded from: classes6.dex */
public final class weu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nfm0 f39036a;

    public weu(nfm0 nfm0Var, byte b) {
        nfm0Var.getClass();
        switch (b) {
            case 1:
                this.f39036a = nfm0Var;
                break;
            default:
                this.f39036a = nfm0Var;
                break;
        }
    }

    public hdm0 a(String str) {
        str.getClass();
        nfm0 nfm0Var = this.f39036a;
        nfm0Var.getClass();
        ddm0 ddm0Var = nfm0Var.c;
        ddm0Var.getClass();
        hdm0 hdm0Var = (hdm0) ddm0Var.b.get(str);
        return hdm0Var == null ? new edm0(0L) : hdm0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(long j, zje zjeVar) {
        i9m0 i9m0Var;
        Object g0g0Var;
        if (zjeVar instanceof i9m0) {
            i9m0Var = (i9m0) zjeVar;
            int i = i9m0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                i9m0Var.k = i - Integer.MIN_VALUE;
            } else {
                i9m0Var = new i9m0(this, zjeVar);
            }
        } else {
            i9m0Var = new i9m0(this, zjeVar);
        }
        Object obj = i9m0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = i9m0Var.k;
        try {
            if (i2 == 0) {
                z1x.P(obj);
                e0g0 e0g0Var = j0g0.b;
                nfm0 nfm0Var = this.f39036a;
                String strValueOf = String.valueOf(j);
                i9m0Var.k = 1;
                if (nfm0Var.a(strValueOf, i9m0Var) == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
            }
            g0g0Var = h9m0.b;
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        return g0g0Var instanceof g0g0 ? h9m0.f12685a : g0g0Var;
    }
}
