package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class yop implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42997a;
    public final /* synthetic */ fnq b;

    public /* synthetic */ yop(fnq fnqVar, byte b) {
        this.f42997a = b;
        this.b = fnqVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005c  */
    /* JADX WARN: Code duplicated, block: B:41:0x009b  */
    /* JADX WARN: Code duplicated, block: B:57:0x00da  */
    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        wop wopVar;
        izs izsVar;
        o1t o1tVar;
        g9u g9uVar;
        byte b = this.f42997a;
        fnq fnqVar = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof wop) {
                    wopVar = (wop) yjeVar;
                    int i = wopVar.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        wopVar.j = i - Integer.MIN_VALUE;
                    } else {
                        wopVar = new wop(this, yjeVar);
                    }
                } else {
                    wopVar = new wop(this, yjeVar);
                }
                Object obj = wopVar.i;
                wne wneVar = wne.f39444a;
                int i2 = wopVar.j;
                if (i2 == 0) {
                    z1x.P(obj);
                    uap uapVar = new uap(kmqVar, (byte) 4);
                    wopVar.j = 1;
                    if (fnqVar.c(uapVar, wopVar) == wneVar) {
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
                if (yjeVar instanceof izs) {
                    izsVar = (izs) yjeVar;
                    int i3 = izsVar.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        izsVar.j = i3 - Integer.MIN_VALUE;
                    } else {
                        izsVar = new izs(this, yjeVar);
                    }
                } else {
                    izsVar = new izs(this, yjeVar);
                }
                Object obj2 = izsVar.i;
                wne wneVar2 = wne.f39444a;
                int i4 = izsVar.j;
                if (i4 == 0) {
                    z1x.P(obj2);
                    uap uapVar2 = new uap(kmqVar, (byte) 22);
                    izsVar.j = 1;
                    if (fnqVar.c(uapVar2, izsVar) == wneVar2) {
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
                if (yjeVar instanceof o1t) {
                    o1tVar = (o1t) yjeVar;
                    int i5 = o1tVar.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        o1tVar.j = i5 - Integer.MIN_VALUE;
                    } else {
                        o1tVar = new o1t(this, yjeVar);
                    }
                } else {
                    o1tVar = new o1t(this, yjeVar);
                }
                Object obj3 = o1tVar.i;
                wne wneVar3 = wne.f39444a;
                int i6 = o1tVar.j;
                if (i6 == 0) {
                    z1x.P(obj3);
                    uap uapVar3 = new uap(kmqVar, (byte) 25);
                    o1tVar.j = 1;
                    if (fnqVar.c(uapVar3, o1tVar) == wneVar3) {
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
                if (yjeVar instanceof g9u) {
                    g9uVar = (g9u) yjeVar;
                    int i7 = g9uVar.j;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        g9uVar.j = i7 - Integer.MIN_VALUE;
                    } else {
                        g9uVar = new g9u(this, yjeVar);
                    }
                } else {
                    g9uVar = new g9u(this, yjeVar);
                }
                Object obj4 = g9uVar.i;
                wne wneVar4 = wne.f39444a;
                int i8 = g9uVar.j;
                if (i8 == 0) {
                    z1x.P(obj4);
                    y6u y6uVar = new y6u(kmqVar, (byte) 2);
                    g9uVar.j = 1;
                    if (fnqVar.c(y6uVar, g9uVar) == wneVar4) {
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
