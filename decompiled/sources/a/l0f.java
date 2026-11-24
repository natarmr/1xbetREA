package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class l0f implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19198a;
    public final /* synthetic */ xae0 b;

    public /* synthetic */ l0f(xae0 xae0Var, byte b) {
        this.f19198a = b;
        this.b = xae0Var;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005f  */
    /* JADX WARN: Code duplicated, block: B:41:0x009e  */
    /* JADX WARN: Code duplicated, block: B:57:0x00de  */
    /* JADX WARN: Code duplicated, block: B:73:0x011f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        i0f i0fVar;
        cm20 cm20Var;
        kmb0 kmb0Var;
        mwj0 mwj0Var;
        vco0 vco0Var;
        byte b = this.f19198a;
        byte b2 = 13;
        xae0 xae0Var = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof i0f) {
                    i0fVar = (i0f) yjeVar;
                    int i = i0fVar.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        i0fVar.j = i - Integer.MIN_VALUE;
                    } else {
                        i0fVar = new i0f(this, yjeVar);
                    }
                } else {
                    i0fVar = new i0f(this, yjeVar);
                }
                Object obj = i0fVar.i;
                wne wneVar = wne.f39444a;
                int i2 = i0fVar.j;
                if (i2 == 0) {
                    z1x.P(obj);
                    k0f k0fVar = new k0f(kmqVar, (byte) 0);
                    i0fVar.j = 1;
                    if (xae0Var.f40549a.c(k0fVar, i0fVar) == wneVar) {
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
                if (yjeVar instanceof cm20) {
                    cm20Var = (cm20) yjeVar;
                    int i3 = cm20Var.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        cm20Var.j = i3 - Integer.MIN_VALUE;
                    } else {
                        cm20Var = new cm20(this, yjeVar);
                    }
                } else {
                    cm20Var = new cm20(this, yjeVar);
                }
                Object obj2 = cm20Var.i;
                wne wneVar2 = wne.f39444a;
                int i4 = cm20Var.j;
                if (i4 == 0) {
                    z1x.P(obj2);
                    b4v b4vVar = new b4v(kmqVar, (byte) 28);
                    cm20Var.j = 1;
                    if (xae0Var.f40549a.c(b4vVar, cm20Var) == wneVar2) {
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
                if (yjeVar instanceof kmb0) {
                    kmb0Var = (kmb0) yjeVar;
                    int i5 = kmb0Var.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        kmb0Var.j = i5 - Integer.MIN_VALUE;
                    } else {
                        kmb0Var = new kmb0(this, yjeVar);
                    }
                } else {
                    kmb0Var = new kmb0(this, yjeVar);
                }
                Object obj3 = kmb0Var.i;
                wne wneVar3 = wne.f39444a;
                int i6 = kmb0Var.j;
                if (i6 == 0) {
                    z1x.P(obj3);
                    hbb0 hbb0Var = new hbb0(kmqVar, (byte) 3);
                    kmb0Var.j = 1;
                    if (xae0Var.f40549a.c(hbb0Var, kmb0Var) == wneVar3) {
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
                if (yjeVar instanceof mwj0) {
                    mwj0Var = (mwj0) yjeVar;
                    int i7 = mwj0Var.j;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        mwj0Var.j = i7 - Integer.MIN_VALUE;
                    } else {
                        mwj0Var = new mwj0(this, yjeVar);
                    }
                } else {
                    mwj0Var = new mwj0(this, yjeVar);
                }
                Object obj4 = mwj0Var.i;
                wne wneVar4 = wne.f39444a;
                int i8 = mwj0Var.j;
                if (i8 == 0) {
                    z1x.P(obj4);
                    r5j0 r5j0Var = new r5j0(kmqVar, b2);
                    mwj0Var.j = 1;
                    if (xae0Var.f40549a.c(r5j0Var, mwj0Var) == wneVar4) {
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
            default:
                if (yjeVar instanceof vco0) {
                    vco0Var = (vco0) yjeVar;
                    int i9 = vco0Var.j;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        vco0Var.j = i9 - Integer.MIN_VALUE;
                    } else {
                        vco0Var = new vco0(this, yjeVar);
                    }
                } else {
                    vco0Var = new vco0(this, yjeVar);
                }
                Object obj5 = vco0Var.i;
                wne wneVar5 = wne.f39444a;
                int i10 = vco0Var.j;
                if (i10 == 0) {
                    z1x.P(obj5);
                    d8n0 d8n0Var = new d8n0(kmqVar, b2);
                    vco0Var.j = 1;
                    if (xae0Var.f40549a.c(d8n0Var, vco0Var) == wneVar5) {
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
        }
    }
}
