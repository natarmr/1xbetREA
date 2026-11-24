package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class zoc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nvu f44712a;

    public /* synthetic */ zoc(nvu nvuVar) {
        this.f44712a = nvuVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(zje zjeVar) {
        zmt0 zmt0Var;
        if (zjeVar instanceof zmt0) {
            zmt0Var = (zmt0) zjeVar;
            int i = zmt0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                zmt0Var.k = i - Integer.MIN_VALUE;
            } else {
                zmt0Var = new zmt0(this, zjeVar);
            }
        } else {
            zmt0Var = new zmt0(this, zjeVar);
        }
        Object obj = zmt0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = zmt0Var.k;
        if (i2 == 0) {
            z1x.P(obj);
            zmt0Var.k = 1;
            if (this.f44712a.E(zmt0Var) == wneVar) {
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
