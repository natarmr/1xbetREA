package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class ar0 implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vsg0 f1320a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;

    public ar0(vsg0 vsg0Var, long j, boolean z) {
        this.f1320a = vsg0Var;
        this.b = j;
        this.c = z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        xq0 xq0Var;
        if (yjeVar instanceof xq0) {
            xq0Var = (xq0) yjeVar;
            int i = xq0Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                xq0Var.j = i - Integer.MIN_VALUE;
            } else {
                xq0Var = new xq0(this, yjeVar);
            }
        } else {
            xq0Var = new xq0(this, yjeVar);
        }
        Object obj = xq0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = xq0Var.j;
        if (i2 == 0) {
            z1x.P(obj);
            zq0 zq0Var = new zq0(kmqVar, this.b, this.c);
            xq0Var.j = 1;
            if (this.f1320a.c(zq0Var, xq0Var) == wneVar) {
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
