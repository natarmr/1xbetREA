package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class p8s extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ g9s k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p8s(g9s g9sVar, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = g9sVar;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        g9s g9sVar = this.k;
        switch (b) {
            case 0:
                return new p8s(g9sVar, yjeVar, (byte) 0);
            case 1:
                return new p8s(g9sVar, yjeVar, (byte) 1);
            case 2:
                return new p8s(g9sVar, yjeVar, (byte) 2);
            case 3:
                return new p8s(g9sVar, yjeVar, (byte) 3);
            case 4:
                return new p8s(g9sVar, yjeVar, (byte) 4);
            case 5:
                return new p8s(g9sVar, yjeVar, (byte) 5);
            case 6:
                return new p8s(g9sVar, yjeVar, (byte) 6);
            case 7:
                return new p8s(g9sVar, yjeVar, (byte) 7);
            case 8:
                return new p8s(g9sVar, yjeVar, (byte) 8);
            default:
                return new p8s(g9sVar, yjeVar, (byte) 9);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
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
        }
        return ((p8s) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        byte b = this.i;
        byte b2 = 3;
        byte b3 = 0;
        byte b4 = 9;
        h660 h660Var = h660.f12515a;
        g9s g9sVar = this.k;
        yje yjeVar = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    ewt ewtVarA = g9sVar.F.a();
                    n8s n8sVar = new n8s(g9sVar, yjeVar, b2);
                    this.j = true;
                    Object objC = ewtVarA.c(new vnq(h660Var, n8sVar, (byte) 2), this);
                    if (objC != wneVar) {
                        objC = Unit.f46060a;
                    }
                    if (objC != wneVar) {
                        objC = Unit.f46060a;
                    }
                    if (objC == wneVar) {
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
                    gmq gmqVarB = g9sVar.I.b();
                    g8s g8sVar = new g8s(g9sVar, yjeVar, b2);
                    this.j = true;
                    Object objC2 = gmqVarB.c(new vnq(h660Var, g8sVar, (byte) 2), this);
                    if (objC2 != wneVar2) {
                        objC2 = Unit.f46060a;
                    }
                    if (objC2 != wneVar2) {
                        objC2 = Unit.f46060a;
                    }
                    if (objC2 == wneVar2) {
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
                    a1t a1tVarB = g9sVar.H.b();
                    n8s n8sVar2 = new n8s(g9sVar, yjeVar, (byte) 5);
                    this.j = true;
                    Object objC3 = a1tVarB.c(new vnq(h660Var, n8sVar2, (byte) 2), this);
                    if (objC3 != wneVar3) {
                        objC3 = Unit.f46060a;
                    }
                    if (objC3 != wneVar3) {
                        objC3 = Unit.f46060a;
                    }
                    if (objC3 == wneVar3) {
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
                Object obj2 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    i89 i89VarA = g9sVar.B.a();
                    i89 i89Var = new i89(g9sVar.Q.f15754a.f1372a.b, (byte) 22);
                    wx4 wx4Var = new wx4((Object) g9sVar, yjeVar, (byte) 10);
                    this.j = true;
                    Object objG = tdc.G(this, h660Var, new kh1((Object) wx4Var, yjeVar, b4), pul.j, new gmq[]{i89VarA, i89Var});
                    if (objG != obj2) {
                        objG = Unit.f46060a;
                    }
                    if (objG != obj2) {
                        objG = Unit.f46060a;
                    }
                    if (objG == obj2) {
                        return obj2;
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
                wne wneVar4 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    i89 i89VarA2 = g9sVar.E.a();
                    n8s n8sVar3 = new n8s(g9sVar, yjeVar, (byte) 6);
                    this.j = true;
                    Object objC4 = i89VarA2.c(new vnq(h660Var, n8sVar3, (byte) 2), this);
                    if (objC4 != wneVar4) {
                        objC4 = Unit.f46060a;
                    }
                    if (objC4 != wneVar4) {
                        objC4 = Unit.f46060a;
                    }
                    if (objC4 == wneVar4) {
                        return wneVar4;
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
                wne wneVar5 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    gmq gmqVarW = i120.W(g9sVar.v.a());
                    x8s x8sVar = new x8s(g9sVar, b3);
                    this.j = true;
                    if (gmqVarW.c(x8sVar, this) == wneVar5) {
                        return wneVar5;
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
                wne wneVar6 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    i89 i89VarH = g9sVar.C.h();
                    n8s n8sVar4 = new n8s(g9sVar, yjeVar, (byte) 7);
                    this.j = true;
                    Object objC5 = i89VarH.c(new vnq(h660Var, n8sVar4, (byte) 2), this);
                    if (objC5 != wneVar6) {
                        objC5 = Unit.f46060a;
                    }
                    if (objC5 != wneVar6) {
                        objC5 = Unit.f46060a;
                    }
                    if (objC5 == wneVar6) {
                        return wneVar6;
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
                wne wneVar7 = wne.f39444a;
                boolean z8 = this.j;
                if (z8) {
                    if (z8) {
                        z1x.P(obj);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                p7m0 p7m0VarB = g9sVar.x.b();
                n8s n8sVar5 = new n8s(g9sVar, yjeVar, (byte) 8);
                this.j = true;
                p7m0VarB.c(new vnq(h660Var, n8sVar5, (byte) 2), this);
                return wneVar7;
            case 8:
                wne wneVar8 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    i89 i89VarA3 = g9sVar.G.a();
                    n8s n8sVar6 = new n8s(g9sVar, yjeVar, b4);
                    this.j = true;
                    Object objC6 = i89VarA3.c(new vnq(h660Var, n8sVar6, (byte) 2), this);
                    if (objC6 != wneVar8) {
                        objC6 = Unit.f46060a;
                    }
                    if (objC6 != wneVar8) {
                        objC6 = Unit.f46060a;
                    }
                    if (objC6 == wneVar8) {
                        return wneVar8;
                    }
                } else {
                    if (!z9) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar9 = wne.f39444a;
                boolean z10 = this.j;
                if (!z10) {
                    z1x.P(obj);
                    i89 i89VarA4 = g9sVar.P.a();
                    n8s n8sVar7 = new n8s(g9sVar, yjeVar, (byte) 11);
                    this.j = true;
                    Object objC7 = i89VarA4.c(new vnq(h660Var, n8sVar7, (byte) 2), this);
                    if (objC7 != wneVar9) {
                        objC7 = Unit.f46060a;
                    }
                    if (objC7 != wneVar9) {
                        objC7 = Unit.f46060a;
                    }
                    if (objC7 == wneVar9) {
                        return wneVar9;
                    }
                } else {
                    if (!z10) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
