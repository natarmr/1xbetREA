package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class ji3 implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16556a;
    public final /* synthetic */ rwk b;

    public /* synthetic */ ji3(rwk rwkVar, byte b) {
        this.f16556a = b;
        this.b = rwkVar;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0197  */
    /* JADX WARN: Code duplicated, block: B:25:0x005d  */
    /* JADX WARN: Code duplicated, block: B:41:0x009c  */
    /* JADX WARN: Code duplicated, block: B:57:0x00da  */
    /* JADX WARN: Code duplicated, block: B:73:0x0119  */
    /* JADX WARN: Code duplicated, block: B:89:0x0158  */
    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        hi3 hi3Var;
        ki3 ki3Var;
        ln3 ln3Var;
        pc60 pc60Var;
        a0o0 a0o0Var;
        g0o0 g0o0Var;
        k0o0 k0o0Var;
        byte b = this.f16556a;
        rwk rwkVar = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof hi3) {
                    hi3Var = (hi3) yjeVar;
                    int i = hi3Var.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        hi3Var.j = i - Integer.MIN_VALUE;
                    } else {
                        hi3Var = new hi3(this, yjeVar);
                    }
                } else {
                    hi3Var = new hi3(this, yjeVar);
                }
                Object obj = hi3Var.i;
                wne wneVar = wne.f39444a;
                int i2 = hi3Var.j;
                if (i2 == 0) {
                    z1x.P(obj);
                    ua uaVar = new ua(kmqVar, (byte) 22);
                    hi3Var.j = 1;
                    if (rwkVar.c(uaVar, hi3Var) == wneVar) {
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
                if (yjeVar instanceof ki3) {
                    ki3Var = (ki3) yjeVar;
                    int i3 = ki3Var.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        ki3Var.j = i3 - Integer.MIN_VALUE;
                    } else {
                        ki3Var = new ki3(this, yjeVar);
                    }
                } else {
                    ki3Var = new ki3(this, yjeVar);
                }
                Object obj2 = ki3Var.i;
                wne wneVar2 = wne.f39444a;
                int i4 = ki3Var.j;
                if (i4 == 0) {
                    z1x.P(obj2);
                    ua uaVar2 = new ua(kmqVar, (byte) 23);
                    ki3Var.j = 1;
                    if (rwkVar.c(uaVar2, ki3Var) == wneVar2) {
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
                if (yjeVar instanceof ln3) {
                    ln3Var = (ln3) yjeVar;
                    int i5 = ln3Var.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        ln3Var.j = i5 - Integer.MIN_VALUE;
                    } else {
                        ln3Var = new ln3(this, yjeVar);
                    }
                } else {
                    ln3Var = new ln3(this, yjeVar);
                }
                Object obj3 = ln3Var.i;
                wne wneVar3 = wne.f39444a;
                int i6 = ln3Var.j;
                if (i6 == 0) {
                    z1x.P(obj3);
                    ua uaVar3 = new ua(kmqVar, (byte) 28);
                    ln3Var.j = 1;
                    if (rwkVar.c(uaVar3, ln3Var) == wneVar3) {
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
                if (yjeVar instanceof pc60) {
                    pc60Var = (pc60) yjeVar;
                    int i7 = pc60Var.j;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        pc60Var.j = i7 - Integer.MIN_VALUE;
                    } else {
                        pc60Var = new pc60(this, yjeVar);
                    }
                } else {
                    pc60Var = new pc60(this, yjeVar);
                }
                Object obj4 = pc60Var.i;
                wne wneVar4 = wne.f39444a;
                int i8 = pc60Var.j;
                if (i8 == 0) {
                    z1x.P(obj4);
                    nr30 nr30Var = new nr30(kmqVar, (byte) 24);
                    pc60Var.j = 1;
                    if (rwkVar.c(nr30Var, pc60Var) == wneVar4) {
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
                if (yjeVar instanceof a0o0) {
                    a0o0Var = (a0o0) yjeVar;
                    int i9 = a0o0Var.j;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        a0o0Var.j = i9 - Integer.MIN_VALUE;
                    } else {
                        a0o0Var = new a0o0(this, yjeVar);
                    }
                } else {
                    a0o0Var = new a0o0(this, yjeVar);
                }
                Object obj5 = a0o0Var.i;
                wne wneVar5 = wne.f39444a;
                int i10 = a0o0Var.j;
                if (i10 == 0) {
                    z1x.P(obj5);
                    d8n0 d8n0Var = new d8n0(kmqVar, (byte) 7);
                    a0o0Var.j = 1;
                    if (rwkVar.c(d8n0Var, a0o0Var) == wneVar5) {
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
            case 5:
                if (yjeVar instanceof g0o0) {
                    g0o0Var = (g0o0) yjeVar;
                    int i11 = g0o0Var.j;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        g0o0Var.j = i11 - Integer.MIN_VALUE;
                    } else {
                        g0o0Var = new g0o0(this, yjeVar);
                    }
                } else {
                    g0o0Var = new g0o0(this, yjeVar);
                }
                Object obj6 = g0o0Var.i;
                wne wneVar6 = wne.f39444a;
                int i12 = g0o0Var.j;
                if (i12 == 0) {
                    z1x.P(obj6);
                    d8n0 d8n0Var2 = new d8n0(kmqVar, (byte) 8);
                    g0o0Var.j = 1;
                    if (rwkVar.c(d8n0Var2, g0o0Var) == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (i12 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj6);
                }
                return Unit.f46060a;
            default:
                if (yjeVar instanceof k0o0) {
                    k0o0Var = (k0o0) yjeVar;
                    int i13 = k0o0Var.j;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        k0o0Var.j = i13 - Integer.MIN_VALUE;
                    } else {
                        k0o0Var = new k0o0(this, yjeVar);
                    }
                } else {
                    k0o0Var = new k0o0(this, yjeVar);
                }
                Object obj7 = k0o0Var.i;
                wne wneVar7 = wne.f39444a;
                int i14 = k0o0Var.j;
                if (i14 == 0) {
                    z1x.P(obj7);
                    d8n0 d8n0Var3 = new d8n0(kmqVar, (byte) 9);
                    k0o0Var.j = 1;
                    if (rwkVar.c(d8n0Var3, k0o0Var) == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (i14 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj7);
                }
                return Unit.f46060a;
        }
    }
}
