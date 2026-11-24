package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class nv extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ fnq l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nv(fnq fnqVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = fnqVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        fnq fnqVar = this.l;
        switch (b) {
            case 0:
                nv nvVar = new nv(fnqVar, yjeVar, (byte) 0);
                nvVar.k = obj;
                return nvVar;
            case 1:
                nv nvVar2 = new nv(fnqVar, yjeVar, (byte) 1);
                nvVar2.k = obj;
                return nvVar2;
            case 2:
                nv nvVar3 = new nv(fnqVar, yjeVar, (byte) 2);
                nvVar3.k = obj;
                return nvVar3;
            case 3:
                nv nvVar4 = new nv(fnqVar, yjeVar, (byte) 3);
                nvVar4.k = obj;
                return nvVar4;
            case 4:
                nv nvVar5 = new nv(fnqVar, yjeVar, (byte) 4);
                nvVar5.k = obj;
                return nvVar5;
            case 5:
                nv nvVar6 = new nv(fnqVar, yjeVar, (byte) 5);
                nvVar6.k = obj;
                return nvVar6;
            case 6:
                nv nvVar7 = new nv(fnqVar, yjeVar, (byte) 6);
                nvVar7.k = obj;
                return nvVar7;
            case 7:
                nv nvVar8 = new nv(fnqVar, yjeVar, (byte) 7);
                nvVar8.k = obj;
                return nvVar8;
            case 8:
                nv nvVar9 = new nv(fnqVar, yjeVar, (byte) 8);
                nvVar9.k = obj;
                return nvVar9;
            case 9:
                nv nvVar10 = new nv(fnqVar, yjeVar, (byte) 9);
                nvVar10.k = obj;
                return nvVar10;
            case 10:
                nv nvVar11 = new nv(fnqVar, yjeVar, (byte) 10);
                nvVar11.k = obj;
                return nvVar11;
            case 11:
                nv nvVar12 = new nv(fnqVar, yjeVar, (byte) 11);
                nvVar12.k = obj;
                return nvVar12;
            case 12:
                nv nvVar13 = new nv(fnqVar, yjeVar, (byte) 12);
                nvVar13.k = obj;
                return nvVar13;
            case 13:
                nv nvVar14 = new nv(fnqVar, yjeVar, (byte) 13);
                nvVar14.k = obj;
                return nvVar14;
            case 14:
                nv nvVar15 = new nv(fnqVar, yjeVar, (byte) 14);
                nvVar15.k = obj;
                return nvVar15;
            case 15:
                nv nvVar16 = new nv(fnqVar, yjeVar, (byte) 15);
                nvVar16.k = obj;
                return nvVar16;
            case 16:
                nv nvVar17 = new nv(fnqVar, yjeVar, (byte) 16);
                nvVar17.k = obj;
                return nvVar17;
            case 17:
                nv nvVar18 = new nv(fnqVar, yjeVar, (byte) 17);
                nvVar18.k = obj;
                return nvVar18;
            case 18:
                nv nvVar19 = new nv(fnqVar, yjeVar, (byte) 18);
                nvVar19.k = obj;
                return nvVar19;
            default:
                nv nvVar20 = new nv(fnqVar, yjeVar, (byte) 19);
                nvVar20.k = obj;
                return nvVar20;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kmq kmqVar = (kmq) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
        }
        return ((nv) create(kmqVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        byte b2 = 29;
        byte b3 = 4;
        byte b4 = 5;
        fnq fnqVar = this.l;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    ua uaVar = new ua((kmq) this.k, b3);
                    this.k = null;
                    this.j = true;
                    if (fnqVar.c(uaVar, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    osa osaVar = new osa((kmq) this.k, b3);
                    this.k = null;
                    this.j = true;
                    if (fnqVar.c(osaVar, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    osa osaVar2 = new osa((kmq) this.k, b4);
                    this.k = null;
                    this.j = true;
                    if (fnqVar.c(osaVar2, this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    ld60 ld60Var = new ld60((kmq) this.k, (byte) 13);
                    this.k = null;
                    this.j = true;
                    if (fnqVar.c(ld60Var, this) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    hbb0 hbb0Var = new hbb0((kmq) this.k, b4);
                    this.k = null;
                    this.j = true;
                    if (fnqVar.c(hbb0Var, this) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 5:
                wne wneVar6 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    hbb0 hbb0Var2 = new hbb0((kmq) this.k, (byte) 6);
                    this.k = null;
                    this.j = true;
                    if (fnqVar.c(hbb0Var2, this) == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 6:
                wne wneVar7 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    hbb0 hbb0Var3 = new hbb0((kmq) this.k, (byte) 19);
                    this.k = null;
                    this.j = true;
                    if (fnqVar.c(hbb0Var3, this) == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 7:
                wne wneVar8 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    hbb0 hbb0Var4 = new hbb0((kmq) this.k, (byte) 20);
                    this.k = null;
                    this.j = true;
                    if (fnqVar.c(hbb0Var4, this) == wneVar8) {
                        return wneVar8;
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 8:
                wne wneVar9 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    hbb0 hbb0Var5 = new hbb0((kmq) this.k, (byte) 24);
                    this.k = null;
                    this.j = true;
                    if (fnqVar.c(hbb0Var5, this) == wneVar9) {
                        return wneVar9;
                    }
                } else {
                    if (!z9) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 9:
                wne wneVar10 = wne.f39444a;
                boolean z10 = this.j;
                if (!z10) {
                    z1x.P(obj);
                    hbb0 hbb0Var6 = new hbb0((kmq) this.k, (byte) 25);
                    this.k = null;
                    this.j = true;
                    if (fnqVar.c(hbb0Var6, this) == wneVar10) {
                        return wneVar10;
                    }
                } else {
                    if (!z10) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 10:
                wne wneVar11 = wne.f39444a;
                boolean z11 = this.j;
                if (!z11) {
                    z1x.P(obj);
                    hbb0 hbb0Var7 = new hbb0((kmq) this.k, (byte) 27);
                    this.k = null;
                    this.j = true;
                    if (fnqVar.c(hbb0Var7, this) == wneVar11) {
                        return wneVar11;
                    }
                } else {
                    if (!z11) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 11:
                wne wneVar12 = wne.f39444a;
                boolean z12 = this.j;
                if (!z12) {
                    z1x.P(obj);
                    hbb0 hbb0Var8 = new hbb0((kmq) this.k, b2);
                    this.k = null;
                    this.j = true;
                    if (fnqVar.c(hbb0Var8, this) == wneVar12) {
                        return wneVar12;
                    }
                } else {
                    if (!z12) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 12:
                wne wneVar13 = wne.f39444a;
                boolean z13 = this.j;
                if (!z13) {
                    z1x.P(obj);
                    r5j0 r5j0Var = new r5j0((kmq) this.k, (byte) 2);
                    this.k = null;
                    this.j = true;
                    if (fnqVar.c(r5j0Var, this) == wneVar13) {
                        return wneVar13;
                    }
                } else {
                    if (!z13) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 13:
                wne wneVar14 = wne.f39444a;
                boolean z14 = this.j;
                if (!z14) {
                    z1x.P(obj);
                    r5j0 r5j0Var2 = new r5j0((kmq) this.k, b3);
                    this.k = null;
                    this.j = true;
                    if (fnqVar.c(r5j0Var2, this) == wneVar14) {
                        return wneVar14;
                    }
                } else {
                    if (!z14) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 14:
                wne wneVar15 = wne.f39444a;
                boolean z15 = this.j;
                if (!z15) {
                    z1x.P(obj);
                    r5j0 r5j0Var3 = new r5j0((kmq) this.k, b4);
                    this.k = null;
                    this.j = true;
                    if (fnqVar.c(r5j0Var3, this) == wneVar15) {
                        return wneVar15;
                    }
                } else {
                    if (!z15) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 15:
                wne wneVar16 = wne.f39444a;
                boolean z16 = this.j;
                if (!z16) {
                    z1x.P(obj);
                    r5j0 r5j0Var4 = new r5j0((kmq) this.k, (byte) 7);
                    this.k = null;
                    this.j = true;
                    if (fnqVar.c(r5j0Var4, this) == wneVar16) {
                        return wneVar16;
                    }
                } else {
                    if (!z16) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 16:
                wne wneVar17 = wne.f39444a;
                boolean z17 = this.j;
                if (!z17) {
                    z1x.P(obj);
                    r5j0 r5j0Var5 = new r5j0((kmq) this.k, (byte) 8);
                    this.k = null;
                    this.j = true;
                    if (fnqVar.c(r5j0Var5, this) == wneVar17) {
                        return wneVar17;
                    }
                } else {
                    if (!z17) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 17:
                wne wneVar18 = wne.f39444a;
                boolean z18 = this.j;
                if (!z18) {
                    z1x.P(obj);
                    r5j0 r5j0Var6 = new r5j0((kmq) this.k, (byte) 10);
                    this.k = null;
                    this.j = true;
                    if (fnqVar.c(r5j0Var6, this) == wneVar18) {
                        return wneVar18;
                    }
                } else {
                    if (!z18) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 18:
                kmq kmqVar = (kmq) this.k;
                wne wneVar19 = wne.f39444a;
                boolean z19 = this.j;
                if (!z19) {
                    z1x.P(obj);
                    r5j0 r5j0Var7 = new r5j0(kmqVar, (byte) 16);
                    this.k = null;
                    this.j = true;
                    if (fnqVar.c(r5j0Var7, this) == wneVar19) {
                        return wneVar19;
                    }
                } else {
                    if (!z19) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                kmq kmqVar2 = (kmq) this.k;
                wne wneVar20 = wne.f39444a;
                boolean z20 = this.j;
                if (!z20) {
                    z1x.P(obj);
                    d8n0 d8n0Var = new d8n0(kmqVar2, b2);
                    this.k = null;
                    this.j = true;
                    if (fnqVar.c(d8n0Var, this) == wneVar20) {
                        return wneVar20;
                    }
                } else {
                    if (!z20) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
