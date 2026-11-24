package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class div implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6155a;
    public final /* synthetic */ xp90 b;

    public /* synthetic */ div(xp90 xp90Var, byte b) {
        this.f6155a = b;
        this.b = xp90Var;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005d  */
    /* JADX WARN: Code duplicated, block: B:41:0x009c  */
    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        biv bivVar;
        ppk0 ppk0Var;
        rpk0 rpk0Var;
        byte b = this.f6155a;
        xp90 xp90Var = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof biv) {
                    bivVar = (biv) yjeVar;
                    int i = bivVar.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        bivVar.j = i - Integer.MIN_VALUE;
                    } else {
                        bivVar = new biv(this, yjeVar);
                    }
                } else {
                    bivVar = new biv(this, yjeVar);
                }
                Object obj = bivVar.i;
                wne wneVar = wne.f39444a;
                int i2 = bivVar.j;
                if (i2 == 0) {
                    z1x.P(obj);
                    b4v b4vVar = new b4v(kmqVar, (byte) 5);
                    bivVar.j = 1;
                    if (xp90Var.c(b4vVar, bivVar) == wneVar) {
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
                if (yjeVar instanceof ppk0) {
                    ppk0Var = (ppk0) yjeVar;
                    int i3 = ppk0Var.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        ppk0Var.j = i3 - Integer.MIN_VALUE;
                    } else {
                        ppk0Var = new ppk0(this, yjeVar);
                    }
                } else {
                    ppk0Var = new ppk0(this, yjeVar);
                }
                Object obj2 = ppk0Var.i;
                wne wneVar2 = wne.f39444a;
                int i4 = ppk0Var.j;
                if (i4 == 0) {
                    z1x.P(obj2);
                    r5j0 r5j0Var = new r5j0(kmqVar, (byte) 18);
                    ppk0Var.j = 1;
                    if (xp90Var.c(r5j0Var, ppk0Var) == wneVar2) {
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
                if (yjeVar instanceof rpk0) {
                    rpk0Var = (rpk0) yjeVar;
                    int i5 = rpk0Var.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        rpk0Var.j = i5 - Integer.MIN_VALUE;
                    } else {
                        rpk0Var = new rpk0(this, yjeVar);
                    }
                } else {
                    rpk0Var = new rpk0(this, yjeVar);
                }
                Object obj3 = rpk0Var.i;
                wne wneVar3 = wne.f39444a;
                int i6 = rpk0Var.j;
                if (i6 == 0) {
                    z1x.P(obj3);
                    r5j0 r5j0Var2 = new r5j0(kmqVar, (byte) 19);
                    rpk0Var.j = 1;
                    if (xp90Var.c(r5j0Var2, rpk0Var) == wneVar3) {
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
