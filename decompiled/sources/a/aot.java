package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class aot {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final chf0 f1218a;

    public /* synthetic */ aot(chf0 chf0Var) {
        this.f1218a = chf0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(qu6 qu6Var, zje zjeVar) {
        nfx nfxVar;
        if (zjeVar instanceof nfx) {
            nfxVar = (nfx) zjeVar;
            int i = nfxVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                nfxVar.k = i - Integer.MIN_VALUE;
            } else {
                nfxVar = new nfx(this, zjeVar);
            }
        } else {
            nfxVar = new nfx(this, zjeVar);
        }
        Object obj = nfxVar.i;
        wne wneVar = wne.f39444a;
        int i2 = nfxVar.k;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(obj);
            nfxVar.k = 1;
            chf0 chf0Var = this.f1218a;
            ou6 ou6Var = (ou6) chf0Var.c;
            if (sj3.w0(nfxVar, ou6Var.f25862a, new mu6(ou6Var, i120.f0(qu6Var, (vby) chf0Var.b), yjeVar, (byte) 0), false, true) == wneVar) {
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
