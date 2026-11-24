package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class k2c implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17565a;
    public final /* synthetic */ a1g b;

    public /* synthetic */ k2c(a1g a1gVar, byte b) {
        this.f17565a = b;
        this.b = a1gVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0099  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        i2c i2cVar;
        jbf jbfVar;
        zot zotVar;
        egb0 egb0Var;
        byte b = this.f17565a;
        a1g a1gVar = this.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                if (yjeVar instanceof i2c) {
                    i2cVar = (i2c) yjeVar;
                    int i = i2cVar.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        i2cVar.j = i - Integer.MIN_VALUE;
                    } else {
                        i2cVar = new i2c(this, yjeVar);
                    }
                } else {
                    i2cVar = new i2c(this, yjeVar);
                }
                Object obj = i2cVar.i;
                wne wneVar = wne.f39444a;
                int i2 = i2cVar.j;
                if (i2 == 0) {
                    z1x.P(obj);
                    osa osaVar = new osa(kmqVar, (byte) 9);
                    i2cVar.j = 1;
                    if (a1gVar.c(osaVar, i2cVar) == wneVar) {
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
                if (yjeVar instanceof jbf) {
                    jbfVar = (jbf) yjeVar;
                    int i3 = jbfVar.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        jbfVar.j = i3 - Integer.MIN_VALUE;
                    } else {
                        jbfVar = new jbf(this, yjeVar);
                    }
                } else {
                    jbfVar = new jbf(this, yjeVar);
                }
                Object obj2 = jbfVar.i;
                wne wneVar2 = wne.f39444a;
                int i4 = jbfVar.j;
                if (i4 == 0) {
                    z1x.P(obj2);
                    k0f k0fVar = new k0f(kmqVar, (byte) 4);
                    jbfVar.j = 1;
                    if (a1gVar.c(k0fVar, jbfVar) == wneVar2) {
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
                if (yjeVar instanceof zot) {
                    zotVar = (zot) yjeVar;
                    int i5 = zotVar.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        zotVar.j = i5 - Integer.MIN_VALUE;
                    } else {
                        zotVar = new zot(this, yjeVar);
                    }
                } else {
                    zotVar = new zot(this, yjeVar);
                }
                Object obj3 = zotVar.i;
                wne wneVar3 = wne.f39444a;
                int i6 = zotVar.j;
                if (i6 == 0) {
                    z1x.P(obj3);
                    tnt tntVar = new tnt(kmqVar, b2);
                    zotVar.j = 1;
                    if (a1gVar.c(tntVar, zotVar) == wneVar3) {
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
                if (yjeVar instanceof egb0) {
                    egb0Var = (egb0) yjeVar;
                    int i7 = egb0Var.j;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        egb0Var.j = i7 - Integer.MIN_VALUE;
                    } else {
                        egb0Var = new egb0(this, yjeVar);
                    }
                } else {
                    egb0Var = new egb0(this, yjeVar);
                }
                Object obj4 = egb0Var.i;
                wne wneVar4 = wne.f39444a;
                int i8 = egb0Var.j;
                if (i8 == 0) {
                    z1x.P(obj4);
                    hbb0 hbb0Var = new hbb0(kmqVar, (byte) 2);
                    egb0Var.j = 1;
                    if (a1gVar.c(hbb0Var, egb0Var) == wneVar4) {
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
