package a;

import org.xplatform.onexdatabase.OnexDatabase;

/* JADX INFO: loaded from: classes3.dex */
public final class deo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0o0 f5958a;

    public deo(OnexDatabase onexDatabase) {
        this.f5958a = maz.b(new ntl(onexDatabase, (byte) 18));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(zje zjeVar) {
        ceo ceoVar;
        if (zjeVar instanceof ceo) {
            ceoVar = (ceo) zjeVar;
            int i = ceoVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ceoVar.k = i - Integer.MIN_VALUE;
            } else {
                ceoVar = new ceo(this, zjeVar);
            }
        } else {
            ceoVar = new ceo(this, zjeVar);
        }
        Object objW0 = ceoVar.i;
        wne wneVar = wne.f39444a;
        int i2 = ceoVar.k;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(objW0);
            nbo nboVar = (nbo) this.f5958a.getValue();
            ceoVar.k = 1;
            objW0 = sj3.w0(ceoVar, nboVar.f23251a, new f1e(2, yjeVar, (byte) 19), true, false);
            if (objW0 == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objW0);
        }
        return Boolean.valueOf(((Number) objW0).longValue() != 0);
    }
}
