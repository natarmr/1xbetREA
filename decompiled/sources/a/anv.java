package a;

/* JADX INFO: loaded from: classes4.dex */
public final class anv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nst0 f1173a;

    public anv(nst0 nst0Var) {
        nst0Var.getClass();
        this.f1173a = nst0Var;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0080  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(zje zjeVar) {
        zmv zmvVar;
        long j;
        boolean zBooleanValue;
        Object[] objArr;
        if (zjeVar instanceof zmv) {
            zmvVar = (zmv) zjeVar;
            int i = zmvVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                zmvVar.l = i - Integer.MIN_VALUE;
            } else {
                zmvVar = new zmv(this, zjeVar);
            }
        } else {
            zmvVar = new zmv(this, zjeVar);
        }
        Object objD0 = zmvVar.j;
        wne wneVar = wne.f39444a;
        int i2 = zmvVar.l;
        yje yjeVar = null;
        boolean z = false;
        z = false;
        nst0 nst0Var = this.f1173a;
        if (i2 == 0) {
            z1x.P(objD0);
            zmvVar.l = 1;
            objD0 = qjj.d0(nst0Var.c.b, new mst0(nst0Var, yjeVar, z ? (byte) 1 : (byte) 0), zmvVar);
            if (objD0 != wneVar) {
            }
            return wneVar;
        }
        if (i2 == 1) {
            z1x.P(objD0);
        } else {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = zmvVar.i;
            z1x.P(objD0);
        }
        zBooleanValue = ((Boolean) objD0).booleanValue();
        if (System.currentTimeMillis() - j >= 1800000) {
            objArr = true;
        } else {
            objArr = false;
        }
        if (zBooleanValue && objArr != false) {
            z = true;
        }
        return Boolean.valueOf(z);
        long jLongValue = ((Number) objD0).longValue();
        zmvVar.i = jLongValue;
        zmvVar.l = 2;
        objD0 = qjj.d0(nst0Var.c.b, new wup0(nst0Var, yjeVar, (byte) 10), zmvVar);
        if (objD0 != wneVar) {
            j = jLongValue;
            zBooleanValue = ((Boolean) objD0).booleanValue();
            if (System.currentTimeMillis() - j >= 1800000) {
                objArr = true;
            } else {
                objArr = false;
            }
            if (zBooleanValue) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        return wneVar;
    }
}
