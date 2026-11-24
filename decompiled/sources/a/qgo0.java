package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class qgo0 implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28696a;
    public final /* synthetic */ gmq b;
    public final /* synthetic */ r040 c;

    public /* synthetic */ qgo0(p7m0 p7m0Var, r040 r040Var, byte b) {
        this.f28696a = b;
        this.b = p7m0Var;
        this.c = r040Var;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005e  */
    /* JADX WARN: Code duplicated, block: B:41:0x009b  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        ngo0 ngo0Var;
        rgo0 rgo0Var;
        fio0 fio0Var;
        byte b = this.f28696a;
        r040 r040Var = this.c;
        gmq gmqVar = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof ngo0) {
                    ngo0Var = (ngo0) yjeVar;
                    int i = ngo0Var.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        ngo0Var.j = i - Integer.MIN_VALUE;
                    } else {
                        ngo0Var = new ngo0(this, yjeVar);
                    }
                } else {
                    ngo0Var = new ngo0(this, yjeVar);
                }
                Object obj = ngo0Var.i;
                wne wneVar = wne.f39444a;
                int i2 = ngo0Var.j;
                if (i2 == 0) {
                    z1x.P(obj);
                    pgo0 pgo0Var = new pgo0(kmqVar, r040Var, (byte) 0);
                    ngo0Var.j = 1;
                    if (gmqVar.c(pgo0Var, ngo0Var) == wneVar) {
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
                if (yjeVar instanceof rgo0) {
                    rgo0Var = (rgo0) yjeVar;
                    int i3 = rgo0Var.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        rgo0Var.j = i3 - Integer.MIN_VALUE;
                    } else {
                        rgo0Var = new rgo0(this, yjeVar);
                    }
                } else {
                    rgo0Var = new rgo0(this, yjeVar);
                }
                Object obj2 = rgo0Var.i;
                wne wneVar2 = wne.f39444a;
                int i4 = rgo0Var.j;
                if (i4 == 0) {
                    z1x.P(obj2);
                    pgo0 pgo0Var2 = new pgo0(kmqVar, r040Var, (byte) 1);
                    rgo0Var.j = 1;
                    if (gmqVar.c(pgo0Var2, rgo0Var) == wneVar2) {
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
                if (yjeVar instanceof fio0) {
                    fio0Var = (fio0) yjeVar;
                    int i5 = fio0Var.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        fio0Var.j = i5 - Integer.MIN_VALUE;
                    } else {
                        fio0Var = new fio0(this, yjeVar);
                    }
                } else {
                    fio0Var = new fio0(this, yjeVar);
                }
                Object obj3 = fio0Var.i;
                wne wneVar3 = wne.f39444a;
                int i6 = fio0Var.j;
                if (i6 == 0) {
                    z1x.P(obj3);
                    pgo0 pgo0Var3 = new pgo0(kmqVar, r040Var, (byte) 2);
                    fio0Var.j = 1;
                    if (gmqVar.c(pgo0Var3, fio0Var) == wneVar3) {
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
