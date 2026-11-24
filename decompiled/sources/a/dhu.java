package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class dhu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pbt f6108a;

    public dhu(pbt pbtVar, byte b) {
        pbtVar.getClass();
        switch (b) {
            case 1:
                this.f6108a = pbtVar;
                break;
            default:
                this.f6108a = pbtVar;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object a(zje zjeVar, String str, boolean z) {
        nkt0 nkt0Var;
        if (zjeVar instanceof nkt0) {
            nkt0Var = (nkt0) zjeVar;
            int i = nkt0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                nkt0Var.k = i - Integer.MIN_VALUE;
            } else {
                nkt0Var = new nkt0(this, zjeVar);
            }
        } else {
            nkt0Var = new nkt0(this, zjeVar);
        }
        nkt0 nkt0Var2 = nkt0Var;
        Object obj = nkt0Var2.i;
        wne wneVar = wne.f39444a;
        int i2 = nkt0Var2.k;
        if (i2 == 0) {
            z1x.P(obj);
            nkt0Var2.k = 1;
            if (this.f6108a.o(true, str, z, true, nkt0Var2) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }
}
