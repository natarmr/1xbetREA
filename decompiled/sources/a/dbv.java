package a;

/* JADX INFO: loaded from: classes5.dex */
public final class dbv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final us00 f5821a;

    public /* synthetic */ dbv(us00 us00Var) {
        this.f5821a = us00Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(zje zjeVar) {
        cbv cbvVar;
        if (zjeVar instanceof cbv) {
            cbvVar = (cbv) zjeVar;
            int i = cbvVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                cbvVar.k = i - Integer.MIN_VALUE;
            } else {
                cbvVar = new cbv(this, zjeVar);
            }
        } else {
            cbvVar = new cbv(this, zjeVar);
        }
        Object objD0 = cbvVar.i;
        wne wneVar = wne.f39444a;
        int i2 = cbvVar.k;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(objD0);
            rwj rwjVar = tvk.f34603a;
            dvj dvjVar = dvj.c;
            b04 b04Var = new b04(2, yjeVar, (byte) 6);
            cbvVar.k = 1;
            objD0 = qjj.d0(dvjVar, b04Var, cbvVar);
            if (objD0 == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objD0);
        }
        objD0.getClass();
        return objD0;
    }
}
