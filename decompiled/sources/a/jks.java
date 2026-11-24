package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class jks extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ yks k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jks(yks yksVar, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = yksVar;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        yks yksVar = this.k;
        switch (b) {
            case 0:
                return new jks(yksVar, yjeVar, (byte) 0);
            case 1:
                return new jks(yksVar, yjeVar, (byte) 1);
            case 2:
                return new jks(yksVar, yjeVar, (byte) 2);
            case 3:
                return new jks(yksVar, yjeVar, (byte) 3);
            case 4:
                return new jks(yksVar, yjeVar, (byte) 4);
            case 5:
                return new jks(yksVar, yjeVar, (byte) 5);
            case 6:
                return new jks(yksVar, yjeVar, (byte) 6);
            case 7:
                return new jks(yksVar, yjeVar, (byte) 7);
            case 8:
                return new jks(yksVar, yjeVar, (byte) 8);
            default:
                return new jks(yksVar, yjeVar, (byte) 9);
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
        return ((jks) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        byte b = this.i;
        byte b2 = 3;
        byte b3 = 0;
        byte b4 = 9;
        h660 h660Var = h660.f12515a;
        yks yksVar = this.k;
        yje yjeVar = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    ewt ewtVarA = yksVar.F.a();
                    gks gksVar = new gks(yksVar, yjeVar, b2);
                    this.j = true;
                    Object objC = ewtVarA.c(new vnq(h660Var, gksVar, (byte) 2), this);
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
                    gmq gmqVarB = yksVar.I.b();
                    yjs yjsVar = new yjs(yksVar, yjeVar, b2);
                    this.j = true;
                    Object objC2 = gmqVarB.c(new vnq(h660Var, yjsVar, (byte) 2), this);
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
                    a1t a1tVarB = yksVar.H.b();
                    gks gksVar2 = new gks(yksVar, yjeVar, (byte) 5);
                    this.j = true;
                    Object objC3 = a1tVarB.c(new vnq(h660Var, gksVar2, (byte) 2), this);
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
                    i89 i89VarA = yksVar.B.a();
                    i89 i89Var = new i89(yksVar.Q.f15754a.f1372a.b, (byte) 22);
                    wx4 wx4Var = new wx4((Object) yksVar, yjeVar, (byte) 12);
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
                    i89 i89VarA2 = yksVar.E.a();
                    gks gksVar3 = new gks(yksVar, yjeVar, (byte) 6);
                    this.j = true;
                    Object objC4 = i89VarA2.c(new vnq(h660Var, gksVar3, (byte) 2), this);
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
                    gmq gmqVarW = i120.W(yksVar.v.a());
                    rks rksVar = new rks(yksVar, b3);
                    this.j = true;
                    if (gmqVarW.c(rksVar, this) == wneVar5) {
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
                    i89 i89VarH = yksVar.C.h();
                    gks gksVar4 = new gks(yksVar, yjeVar, (byte) 7);
                    this.j = true;
                    Object objC5 = i89VarH.c(new vnq(h660Var, gksVar4, (byte) 2), this);
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
                p7m0 p7m0VarB = yksVar.x.b();
                gks gksVar5 = new gks(yksVar, yjeVar, (byte) 8);
                this.j = true;
                p7m0VarB.c(new vnq(h660Var, gksVar5, (byte) 2), this);
                return wneVar7;
            case 8:
                wne wneVar8 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    i89 i89VarA3 = yksVar.G.a();
                    gks gksVar6 = new gks(yksVar, yjeVar, b4);
                    this.j = true;
                    Object objC6 = i89VarA3.c(new vnq(h660Var, gksVar6, (byte) 2), this);
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
                    i89 i89VarA4 = yksVar.P.a();
                    gks gksVar7 = new gks(yksVar, yjeVar, (byte) 10);
                    this.j = true;
                    Object objC7 = i89VarA4.c(new vnq(h660Var, gksVar7, (byte) 2), this);
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
