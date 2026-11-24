package a;

/* JADX INFO: loaded from: classes3.dex */
public final class ucu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final scu f35449a;
    public final ntu b;

    public ucu(scu scuVar, ntu ntuVar) {
        scuVar.getClass();
        this.f35449a = scuVar;
        this.b = ntuVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, zje zjeVar) {
        tcu tcuVar;
        if (zjeVar instanceof tcu) {
            tcuVar = (tcu) zjeVar;
            int i = tcuVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                tcuVar.k = i - Integer.MIN_VALUE;
            } else {
                tcuVar = new tcu(this, zjeVar);
            }
        } else {
            tcuVar = new tcu(this, zjeVar);
        }
        Object objA = tcuVar.i;
        wne wneVar = wne.f39444a;
        int i2 = tcuVar.k;
        if (i2 == 0) {
            z1x.P(objA);
            String strA = this.b.a();
            tcuVar.k = 1;
            objA = this.f35449a.a(j, tcuVar, strA);
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
        return ((pbv) objA).c;
    }
}
