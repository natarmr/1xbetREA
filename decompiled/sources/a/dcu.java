package a;

/* JADX INFO: loaded from: classes3.dex */
public final class dcu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final scu f5863a;
    public final ntu b;

    public dcu(scu scuVar, ntu ntuVar) {
        scuVar.getClass();
        this.f5863a = scuVar;
        this.b = ntuVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, zje zjeVar) {
        ccu ccuVar;
        if (zjeVar instanceof ccu) {
            ccuVar = (ccu) zjeVar;
            int i = ccuVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ccuVar.k = i - Integer.MIN_VALUE;
            } else {
                ccuVar = new ccu(this, zjeVar);
            }
        } else {
            ccuVar = new ccu(this, zjeVar);
        }
        Object objA = ccuVar.i;
        wne wneVar = wne.f39444a;
        int i2 = ccuVar.k;
        if (i2 == 0) {
            z1x.P(objA);
            String strA = this.b.a();
            ccuVar.k = 1;
            objA = this.f5863a.a(j, ccuVar, strA);
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
        return Boolean.valueOf(((pbv) objA).r);
    }
}
