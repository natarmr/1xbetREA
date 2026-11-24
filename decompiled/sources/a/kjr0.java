package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class kjr0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ njr0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kjr0(njr0 njr0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = njr0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        njr0 njr0Var = this.k;
        switch (b) {
            case 0:
                return new kjr0(njr0Var, yjeVar, (byte) 0);
            case 1:
                return new kjr0(njr0Var, yjeVar, (byte) 1);
            case 2:
                return new kjr0(njr0Var, yjeVar, (byte) 2);
            case 3:
                return new kjr0(njr0Var, yjeVar, (byte) 3);
            case 4:
                return new kjr0(njr0Var, yjeVar, (byte) 4);
            case 5:
                kjr0 kjr0Var = new kjr0(njr0Var, yjeVar, (byte) 5);
                kjr0Var.j = ((Boolean) obj).booleanValue();
                return kjr0Var;
            default:
                return new kjr0(njr0Var, yjeVar, (byte) 6);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((kjr0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((kjr0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((kjr0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((kjr0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((kjr0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((kjr0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((kjr0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        njr0 njr0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    xex xexVar = njr0Var.A;
                    this.j = true;
                    obj = xexVar.H(this);
                    if (obj == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    njr0Var.I.f(sir0.f32276a);
                }
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    usc uscVar = njr0Var.o;
                    this.j = true;
                    if (uscVar.a(this) == wneVar2) {
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
                    zpu zpuVar = njr0Var.B;
                    this.j = true;
                    if (zpuVar.j(this) == wneVar3) {
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
                    yk00 yk00Var = njr0Var.h;
                    this.j = true;
                    Object objD = yk00Var.f42764a.d(this);
                    if (objD != wneVar4) {
                        objD = Unit.f46060a;
                    }
                    if (objD == wneVar4) {
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
                    if (njr0Var.i.f4960a.r().c != ulr0.TOTO_1XTOTO) {
                        boolean zV = njr0Var.t.v();
                        String str = njr0Var.i.f4960a.r().b;
                        String strValueOf = String.valueOf(njr0Var.r.a());
                        boolean z6 = njr0Var.l.a().l.g;
                        ol60 ol60Var = njr0Var.I;
                        if (zV) {
                            ol60Var.f(new tir0(str, strValueOf, z6, njr0Var.F.c(j820.c) != ua20.MEDIUM_NO_GAME_INFO));
                        } else {
                            ol60Var.f(xir0.f40959a);
                        }
                        return Unit.f46060a;
                    }
                    g2v g2vVar = njr0Var.u;
                    this.j = true;
                    obj = g2vVar.f(this);
                    if (obj == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    njr0Var.B();
                } else {
                    njr0Var.I.f(uir0.f35747a);
                }
                return Unit.f46060a;
            case 5:
                boolean z7 = this.j;
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                if (z7 && (((cjr0) njr0Var.G.getValue()).b instanceof ejr0)) {
                    njr0Var.A(false);
                }
                return Unit.f46060a;
            default:
                wne wneVar7 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    nhf0 nhf0Var = njr0Var.q;
                    this.j = true;
                    if (nhf0Var.w(this) == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
