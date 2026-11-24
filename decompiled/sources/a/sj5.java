package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class sj5 implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32290a;
    public final /* synthetic */ gmq b;
    public final /* synthetic */ dk5 c;

    public /* synthetic */ sj5(gmq gmqVar, dk5 dk5Var, byte b) {
        this.f32290a = b;
        this.b = gmqVar;
        this.c = dk5Var;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005e  */
    /* JADX WARN: Code duplicated, block: B:41:0x009b  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        pj5 pj5Var;
        wj5 wj5Var;
        zj5 zj5Var;
        byte b = this.f32290a;
        dk5 dk5Var = this.c;
        gmq gmqVar = this.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                if (yjeVar instanceof pj5) {
                    pj5Var = (pj5) yjeVar;
                    int i = pj5Var.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        pj5Var.j = i - Integer.MIN_VALUE;
                    } else {
                        pj5Var = new pj5(this, yjeVar);
                    }
                } else {
                    pj5Var = new pj5(this, yjeVar);
                }
                Object obj = pj5Var.i;
                wne wneVar = wne.f39444a;
                int i2 = pj5Var.j;
                if (i2 == 0) {
                    z1x.P(obj);
                    rj5 rj5Var = new rj5(kmqVar, dk5Var, (byte) 0);
                    pj5Var.j = 1;
                    if (gmqVar.c(rj5Var, pj5Var) == wneVar) {
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
                if (yjeVar instanceof wj5) {
                    wj5Var = (wj5) yjeVar;
                    int i3 = wj5Var.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        wj5Var.j = i3 - Integer.MIN_VALUE;
                    } else {
                        wj5Var = new wj5(this, yjeVar);
                    }
                } else {
                    wj5Var = new wj5(this, yjeVar);
                }
                Object obj2 = wj5Var.i;
                wne wneVar2 = wne.f39444a;
                int i4 = wj5Var.j;
                if (i4 == 0) {
                    z1x.P(obj2);
                    rj5 rj5Var2 = new rj5(kmqVar, dk5Var, b2);
                    wj5Var.j = 1;
                    if (gmqVar.c(rj5Var2, wj5Var) == wneVar2) {
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
                if (yjeVar instanceof zj5) {
                    zj5Var = (zj5) yjeVar;
                    int i5 = zj5Var.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        zj5Var.j = i5 - Integer.MIN_VALUE;
                    } else {
                        zj5Var = new zj5(this, yjeVar);
                    }
                } else {
                    zj5Var = new zj5(this, yjeVar);
                }
                Object obj3 = zj5Var.i;
                wne wneVar3 = wne.f39444a;
                int i6 = zj5Var.j;
                if (i6 == 0) {
                    z1x.P(obj3);
                    rj5 rj5Var3 = new rj5(kmqVar, dk5Var, (byte) 2);
                    zj5Var.j = 1;
                    if (gmqVar.c(rj5Var3, zj5Var) == wneVar3) {
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
