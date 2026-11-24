package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class zh3 implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44373a;
    public final /* synthetic */ rwk b;
    public final /* synthetic */ ij3 c;

    public /* synthetic */ zh3(rwk rwkVar, ij3 ij3Var, byte b) {
        this.f44373a = b;
        this.b = rwkVar;
        this.c = ij3Var;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005f  */
    /* JADX WARN: Code duplicated, block: B:41:0x009c  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        wh3 wh3Var;
        di3 di3Var;
        mi3 mi3Var;
        byte b = this.f44373a;
        ij3 ij3Var = this.c;
        rwk rwkVar = this.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                if (yjeVar instanceof wh3) {
                    wh3Var = (wh3) yjeVar;
                    int i = wh3Var.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        wh3Var.j = i - Integer.MIN_VALUE;
                    } else {
                        wh3Var = new wh3(this, yjeVar);
                    }
                } else {
                    wh3Var = new wh3(this, yjeVar);
                }
                Object obj = wh3Var.i;
                wne wneVar = wne.f39444a;
                int i2 = wh3Var.j;
                if (i2 == 0) {
                    z1x.P(obj);
                    yh3 yh3Var = new yh3(kmqVar, ij3Var, (byte) 0);
                    wh3Var.j = 1;
                    if (rwkVar.c(yh3Var, wh3Var) == wneVar) {
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
            case 1:
                if (yjeVar instanceof di3) {
                    di3Var = (di3) yjeVar;
                    int i3 = di3Var.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        di3Var.j = i3 - Integer.MIN_VALUE;
                    } else {
                        di3Var = new di3(this, yjeVar);
                    }
                } else {
                    di3Var = new di3(this, yjeVar);
                }
                Object obj2 = di3Var.i;
                wne wneVar2 = wne.f39444a;
                int i4 = di3Var.j;
                if (i4 == 0) {
                    z1x.P(obj2);
                    yh3 yh3Var2 = new yh3(kmqVar, ij3Var, b2);
                    di3Var.j = 1;
                    if (rwkVar.c(yh3Var2, di3Var) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (i4 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj2);
                }
                return Unit.f46060a;
            default:
                if (yjeVar instanceof mi3) {
                    mi3Var = (mi3) yjeVar;
                    int i5 = mi3Var.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        mi3Var.j = i5 - Integer.MIN_VALUE;
                    } else {
                        mi3Var = new mi3(this, yjeVar);
                    }
                } else {
                    mi3Var = new mi3(this, yjeVar);
                }
                Object obj3 = mi3Var.i;
                wne wneVar3 = wne.f39444a;
                int i6 = mi3Var.j;
                if (i6 == 0) {
                    z1x.P(obj3);
                    ua uaVar = new ua(kmqVar, ij3Var, (byte) 24);
                    mi3Var.j = 1;
                    if (rwkVar.c(uaVar, mi3Var) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (i6 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj3);
                }
                return Unit.f46060a;
        }
    }
}
