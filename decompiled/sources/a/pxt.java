package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class pxt implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27770a;
    public final /* synthetic */ gmq[] b;

    public /* synthetic */ pxt(gmq[] gmqVarArr, byte b) {
        this.f27770a = b;
        this.b = gmqVarArr;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0039  */
    /* JADX WARN: Code duplicated, block: B:30:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:62:0x0105  */
    /* JADX WARN: Code duplicated, block: B:78:0x0147  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        nxt nxtVar;
        b4u b4uVar;
        wbu wbuVar;
        w060 w060Var;
        m260 m260Var;
        byte b = this.f27770a;
        byte b2 = 4;
        byte b3 = 5;
        byte b4 = 1;
        gmq[] gmqVarArr = this.b;
        byte b5 = 3;
        yje yjeVar2 = null;
        switch (b) {
            case 0:
                if (yjeVar instanceof nxt) {
                    nxtVar = (nxt) yjeVar;
                    int i = nxtVar.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        nxtVar.j = i - Integer.MIN_VALUE;
                    } else {
                        nxtVar = new nxt(this, yjeVar);
                    }
                } else {
                    nxtVar = new nxt(this, yjeVar);
                }
                Object obj = nxtVar.i;
                wne wneVar = wne.f39444a;
                int i2 = nxtVar.j;
                if (i2 == 0) {
                    z1x.P(obj);
                    ti3 ti3Var = new ti3(gmqVarArr, (byte) 4);
                    oxt oxtVar = new oxt(b5, yjeVar2, (byte) 0);
                    nxtVar.j = 1;
                    if (tdc.G(nxtVar, kmqVar, oxtVar, ti3Var, gmqVarArr) == wneVar) {
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
                if (yjeVar instanceof b4u) {
                    b4uVar = (b4u) yjeVar;
                    int i3 = b4uVar.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        b4uVar.j = i3 - Integer.MIN_VALUE;
                    } else {
                        b4uVar = new b4u(this, yjeVar);
                    }
                } else {
                    b4uVar = new b4u(this, yjeVar);
                }
                Object obj2 = b4uVar.i;
                wne wneVar2 = wne.f39444a;
                int i4 = b4uVar.j;
                if (i4 == 0) {
                    z1x.P(obj2);
                    ti3 ti3Var2 = new ti3(gmqVarArr, (byte) 5);
                    oxt oxtVar2 = new oxt(b5, yjeVar2, b4);
                    b4uVar.j = 1;
                    if (tdc.G(b4uVar, kmqVar, oxtVar2, ti3Var2, gmqVarArr) == wneVar2) {
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
                if (yjeVar instanceof wbu) {
                    wbuVar = (wbu) yjeVar;
                    int i5 = wbuVar.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        wbuVar.j = i5 - Integer.MIN_VALUE;
                    } else {
                        wbuVar = new wbu(this, yjeVar);
                    }
                } else {
                    wbuVar = new wbu(this, yjeVar);
                }
                Object obj3 = wbuVar.i;
                wne wneVar3 = wne.f39444a;
                int i6 = wbuVar.j;
                if (i6 == 0) {
                    z1x.P(obj3);
                    ti3 ti3Var3 = new ti3(gmqVarArr, (byte) 7);
                    oxt oxtVar3 = new oxt(b5, yjeVar2, (byte) 2);
                    wbuVar.j = 1;
                    if (tdc.G(wbuVar, kmqVar, oxtVar3, ti3Var3, gmqVarArr) == wneVar3) {
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
            case 3:
                if (yjeVar instanceof w060) {
                    w060Var = (w060) yjeVar;
                    int i7 = w060Var.j;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        w060Var.j = i7 - Integer.MIN_VALUE;
                    } else {
                        w060Var = new w060(this, yjeVar);
                    }
                } else {
                    w060Var = new w060(this, yjeVar);
                }
                Object obj4 = w060Var.i;
                wne wneVar4 = wne.f39444a;
                int i8 = w060Var.j;
                if (i8 == 0) {
                    z1x.P(obj4);
                    ti3 ti3Var4 = new ti3(gmqVarArr, (byte) 9);
                    oxt oxtVar4 = new oxt(b5, yjeVar2, b5);
                    w060Var.j = 1;
                    if (tdc.G(w060Var, kmqVar, oxtVar4, ti3Var4, gmqVarArr) == wneVar4) {
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
            case 4:
                if (yjeVar instanceof m260) {
                    m260Var = (m260) yjeVar;
                    int i9 = m260Var.j;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        m260Var.j = i9 - Integer.MIN_VALUE;
                    } else {
                        m260Var = new m260(this, yjeVar);
                    }
                } else {
                    m260Var = new m260(this, yjeVar);
                }
                Object obj5 = m260Var.i;
                wne wneVar5 = wne.f39444a;
                int i10 = m260Var.j;
                if (i10 == 0) {
                    z1x.P(obj5);
                    ti3 ti3Var5 = new ti3(gmqVarArr, (byte) 10);
                    oxt oxtVar5 = new oxt(b5, yjeVar2, b2);
                    m260Var.j = 1;
                    if (tdc.G(m260Var, kmqVar, oxtVar5, ti3Var5, gmqVarArr) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (i10 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj5);
                }
                return Unit.f46060a;
            default:
                Object objG = tdc.G(yjeVar, kmqVar, new oxt(b5, yjeVar2, b3), new ti3(gmqVarArr, (byte) 13), gmqVarArr);
                return objG == wne.f39444a ? objG : Unit.f46060a;
        }
    }
}
