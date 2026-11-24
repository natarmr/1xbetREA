package a;

/* JADX INFO: loaded from: classes3.dex */
public final class pbu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final scu f26726a;
    public final ntu b;

    public pbu(scu scuVar, ntu ntuVar) {
        scuVar.getClass();
        this.f26726a = scuVar;
        this.b = ntuVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, zje zjeVar) {
        obu obuVar;
        if (zjeVar instanceof obu) {
            obuVar = (obu) zjeVar;
            int i = obuVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                obuVar.k = i - Integer.MIN_VALUE;
            } else {
                obuVar = new obu(this, zjeVar);
            }
        } else {
            obuVar = new obu(this, zjeVar);
        }
        Object objA = obuVar.i;
        wne wneVar = wne.f39444a;
        int i2 = obuVar.k;
        if (i2 == 0) {
            z1x.P(objA);
            String strA = this.b.a();
            obuVar.k = 1;
            objA = this.f26726a.a(j, obuVar, strA);
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
        return Boolean.valueOf(((pbv) objA).l);
    }
}
