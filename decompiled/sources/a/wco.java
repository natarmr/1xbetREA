package a;

import org.xplatform.onexdatabase.OnexDatabase;

/* JADX INFO: loaded from: classes3.dex */
public final class wco {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OnexDatabase f38934a;
    public final n0o0 b = maz.b(new ntl(this, 17));

    public wco(OnexDatabase onexDatabase) {
        this.f38934a = onexDatabase;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(zje zjeVar) {
        vco vcoVar;
        if (zjeVar instanceof vco) {
            vcoVar = (vco) zjeVar;
            int i = vcoVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                vcoVar.k = i - Integer.MIN_VALUE;
            } else {
                vcoVar = new vco(this, zjeVar);
            }
        } else {
            vcoVar = new vco(this, zjeVar);
        }
        Object objW0 = vcoVar.i;
        wne wneVar = wne.f39444a;
        int i2 = vcoVar.k;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(objW0);
            qco qcoVar = (qco) this.b.getValue();
            vcoVar.k = 1;
            objW0 = sj3.w0(vcoVar, qcoVar.f28493a, new f1e(2, yjeVar, (byte) 23), true, false);
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
