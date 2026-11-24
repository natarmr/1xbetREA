package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes3.dex */
public final class eyj extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ xk80 k;
    public final /* synthetic */ l7m0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eyj(byte b, yje yjeVar, xk80 xk80Var, l7m0 l7m0Var) {
        super(2, yjeVar);
        this.i = b;
        this.k = xk80Var;
        this.l = l7m0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new eyj((byte) 0, yjeVar, this.k, this.l);
            case 1:
                return new eyj((byte) 1, yjeVar, this.k, this.l);
            case 2:
                return new eyj((byte) 2, yjeVar, this.k, this.l);
            case 3:
                return new eyj((byte) 3, yjeVar, this.k, this.l);
            case 4:
                return new eyj((byte) 4, yjeVar, this.k, this.l);
            case 5:
                return new eyj((byte) 5, yjeVar, this.k, this.l);
            case 6:
                return new eyj((byte) 6, yjeVar, this.k, this.l);
            case 7:
                return new eyj((byte) 7, yjeVar, this.k, this.l);
            case 8:
                return new eyj((byte) 8, yjeVar, this.k, this.l);
            case 9:
                return new eyj((byte) 9, yjeVar, this.k, this.l);
            default:
                return new eyj((byte) 10, yjeVar, this.k, this.l);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
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
        }
        return ((eyj) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        ekw ekwVar;
        CyberGamesPage cyberGamesPage;
        ekw ekwVar2;
        CyberGamesPage cyberGamesPage2;
        ekw ekwVar3;
        CyberGamesPage cyberGamesPage3;
        ekw ekwVar4;
        CyberGamesPage cyberGamesPage4;
        byte b = this.i;
        l7m0 l7m0Var = this.l;
        xk80 xk80Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    gkw gkwVar = (gkw) l7m0Var.getValue();
                    int iK = (gkwVar == null || (ekwVar = gkwVar.c) == null || (cyberGamesPage = ekwVar.f7971a) == null) ? xk80Var.k() : cyberGamesPage.f46556a;
                    uts0 uts0VarB = e3c.B();
                    this.j = true;
                    if (xk80.g(xk80Var, iK, uts0VarB, this, 2) == wneVar) {
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
                    gkw gkwVar2 = (gkw) l7m0Var.getValue();
                    int iK2 = (gkwVar2 == null || (ekwVar2 = gkwVar2.c) == null || (cyberGamesPage2 = ekwVar2.f7971a) == null) ? xk80Var.k() : cyberGamesPage2.f46556a;
                    uts0 uts0VarB2 = e3c.B();
                    this.j = true;
                    if (xk80.g(xk80Var, iK2, uts0VarB2, this, 2) == wneVar2) {
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
                    gkw gkwVar3 = (gkw) l7m0Var.getValue();
                    int iK3 = (gkwVar3 == null || (ekwVar3 = gkwVar3.c) == null || (cyberGamesPage3 = ekwVar3.f7971a) == null) ? xk80Var.k() : cyberGamesPage3.f46556a;
                    uts0 uts0VarB3 = e3c.B();
                    this.j = true;
                    if (xk80.g(xk80Var, iK3, uts0VarB3, this, 2) == wneVar3) {
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
                    gkw gkwVar4 = (gkw) l7m0Var.getValue();
                    int iK4 = (gkwVar4 == null || (ekwVar4 = gkwVar4.c) == null || (cyberGamesPage4 = ekwVar4.f7971a) == null) ? xk80Var.k() : cyberGamesPage4.f46556a;
                    uts0 uts0VarB4 = e3c.B();
                    this.j = true;
                    if (xk80.g(xk80Var, iK4, uts0VarB4, this, 2) == wneVar4) {
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
                    int i = ((wtz) l7m0Var.getValue()).d;
                    this.j = true;
                    if (xk80.g(xk80Var, i, null, this, 6) == wneVar5) {
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
                    int i2 = ((jvz) l7m0Var.getValue()).d;
                    this.j = true;
                    if (xk80.g(xk80Var, i2, null, this, 6) == wneVar6) {
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
                    int i3 = ((xwz) l7m0Var.getValue()).c;
                    this.j = true;
                    if (xk80.g(xk80Var, i3, null, this, 6) == wneVar7) {
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
                    int i4 = ((uyz) l7m0Var.getValue()).d;
                    this.j = true;
                    if (xk80.g(xk80Var, i4, null, this, 6) == wneVar8) {
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
                    int i5 = ((h100) l7m0Var.getValue()).d;
                    this.j = true;
                    if (xk80.g(xk80Var, i5, null, this, 6) == wneVar9) {
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
                    int i6 = ((r400) l7m0Var.getValue()).c;
                    this.j = true;
                    if (xk80.g(xk80Var, i6, null, this, 6) == wneVar10) {
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
            default:
                wne wneVar11 = wne.f39444a;
                boolean z11 = this.j;
                if (!z11) {
                    z1x.P(obj);
                    zie0 zie0Var = fpk0.V1;
                    int i7 = ((kwk0) l7m0Var.getValue()).f19006a;
                    uts0 uts0VarM0 = ro4.m0(300, 0, null, 6);
                    this.j = true;
                    if (xk80.g(xk80Var, i7, uts0VarM0, this, 2) == wneVar11) {
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
        }
    }
}
