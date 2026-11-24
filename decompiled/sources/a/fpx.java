package a;

/* JADX INFO: loaded from: classes3.dex */
public final class fpx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final scu f9948a;
    public final ntu b;

    public fpx(scu scuVar, ntu ntuVar) {
        scuVar.getClass();
        this.f9948a = scuVar;
        this.b = ntuVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, zje zjeVar) {
        epx epxVar;
        if (zjeVar instanceof epx) {
            epxVar = (epx) zjeVar;
            int i = epxVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                epxVar.k = i - Integer.MIN_VALUE;
            } else {
                epxVar = new epx(this, zjeVar);
            }
        } else {
            epxVar = new epx(this, zjeVar);
        }
        Object objA = epxVar.i;
        wne wneVar = wne.f39444a;
        int i2 = epxVar.k;
        if (i2 == 0) {
            z1x.P(objA);
            String strA = this.b.a();
            epxVar.k = 1;
            objA = this.f9948a.a(j, epxVar, strA);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        return Boolean.valueOf(((pbv) objA).i);
    }
}
