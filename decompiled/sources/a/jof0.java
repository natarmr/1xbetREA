package a;

/* JADX INFO: loaded from: classes5.dex */
public final class jof0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z220 f16855a;

    public jof0(z220 z220Var) {
        this.f16855a = z220Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(zje zjeVar) {
        krh0 krh0Var;
        if (zjeVar instanceof krh0) {
            krh0Var = (krh0) zjeVar;
            int i = krh0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                krh0Var.l = i - Integer.MIN_VALUE;
            } else {
                krh0Var = new krh0(this, zjeVar);
            }
        } else {
            krh0Var = new krh0(this, zjeVar);
        }
        Object objP = krh0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = krh0Var.l;
        if (i2 == 0) {
            z1x.P(objP);
            krh0Var.l = 1;
            objP = this.f16855a.p(krh0Var);
            if (objP != wneVar) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str = krh0Var.i;
            z1x.P(objP);
            return str;
        }
        z1x.P(objP);
        String str2 = (String) objP;
        krh0Var.i = str2;
        krh0Var.l = 2;
        return qcc.O(2000L, krh0Var) == wneVar ? wneVar : str2;
    }

    public jof0(z220 z220Var, dpx dpxVar) {
        this.f16855a = z220Var;
    }
}
