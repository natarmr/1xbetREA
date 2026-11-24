package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class hpt implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13458a;
    public final /* synthetic */ a1g b;

    public /* synthetic */ hpt(a1g a1gVar, byte b) {
        this.f13458a = b;
        this.b = a1gVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005c  */
    /* JADX WARN: Code duplicated, block: B:41:0x009b  */
    /* JADX WARN: Code duplicated, block: B:57:0x00da  */
    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        fpt fptVar;
        mwt mwtVar;
        k260 k260Var;
        d670 d670Var;
        byte b = this.f13458a;
        a1g a1gVar = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof fpt) {
                    fptVar = (fpt) yjeVar;
                    int i = fptVar.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        fptVar.j = i - Integer.MIN_VALUE;
                    } else {
                        fptVar = new fpt(this, yjeVar);
                    }
                } else {
                    fptVar = new fpt(this, yjeVar);
                }
                Object obj = fptVar.i;
                wne wneVar = wne.f39444a;
                int i2 = fptVar.j;
                if (i2 == 0) {
                    z1x.P(obj);
                    tnt tntVar = new tnt(kmqVar, (byte) 4);
                    fptVar.j = 1;
                    if (a1gVar.c(tntVar, fptVar) == wneVar) {
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
                if (yjeVar instanceof mwt) {
                    mwtVar = (mwt) yjeVar;
                    int i3 = mwtVar.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        mwtVar.j = i3 - Integer.MIN_VALUE;
                    } else {
                        mwtVar = new mwt(this, yjeVar);
                    }
                } else {
                    mwtVar = new mwt(this, yjeVar);
                }
                Object obj2 = mwtVar.i;
                wne wneVar2 = wne.f39444a;
                int i4 = mwtVar.j;
                if (i4 == 0) {
                    z1x.P(obj2);
                    tnt tntVar2 = new tnt(kmqVar, (byte) 13);
                    mwtVar.j = 1;
                    if (a1gVar.c(tntVar2, mwtVar) == wneVar2) {
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
            case 2:
                if (yjeVar instanceof k260) {
                    k260Var = (k260) yjeVar;
                    int i5 = k260Var.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        k260Var.j = i5 - Integer.MIN_VALUE;
                    } else {
                        k260Var = new k260(this, yjeVar);
                    }
                } else {
                    k260Var = new k260(this, yjeVar);
                }
                Object obj3 = k260Var.i;
                wne wneVar3 = wne.f39444a;
                int i6 = k260Var.j;
                if (i6 == 0) {
                    z1x.P(obj3);
                    nr30 nr30Var = new nr30(kmqVar, (byte) 15);
                    k260Var.j = 1;
                    if (a1gVar.c(nr30Var, k260Var) == wneVar3) {
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
            default:
                if (yjeVar instanceof d670) {
                    d670Var = (d670) yjeVar;
                    int i7 = d670Var.j;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        d670Var.j = i7 - Integer.MIN_VALUE;
                    } else {
                        d670Var = new d670(this, yjeVar);
                    }
                } else {
                    d670Var = new d670(this, yjeVar);
                }
                Object obj4 = d670Var.i;
                wne wneVar4 = wne.f39444a;
                int i8 = d670Var.j;
                if (i8 == 0) {
                    z1x.P(obj4);
                    ld60 ld60Var = new ld60(kmqVar, (byte) 7);
                    d670Var.j = 1;
                    if (a1gVar.c(ld60Var, d670Var) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (i8 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj4);
                }
                return Unit.f46060a;
        }
    }
}
