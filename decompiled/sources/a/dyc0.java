package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class dyc0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ hyc0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dyc0(byte b, yje yjeVar, hyc0 hyc0Var, boolean z) {
        super(2, yjeVar);
        this.i = b;
        this.j = z;
        this.k = hyc0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        hyc0 hyc0Var = this.k;
        switch (b) {
            case 0:
                return new dyc0((byte) 0, yjeVar, hyc0Var, this.j);
            case 1:
                return new dyc0((byte) 1, yjeVar, hyc0Var, this.j);
            case 2:
                dyc0 dyc0Var = new dyc0(hyc0Var, yjeVar, (byte) 2);
                dyc0Var.j = ((Boolean) obj).booleanValue();
                return dyc0Var;
            case 3:
                return new dyc0(hyc0Var, yjeVar, (byte) 3);
            default:
                return new dyc0(hyc0Var, yjeVar, (byte) 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((dyc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((dyc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((dyc0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((dyc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((dyc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        gfe afeVar;
        byte b = this.i;
        Object afeVar2 = yee.f42482a;
        dfe dfeVar = dfe.f5996a;
        boolean z = false;
        hyc0 hyc0Var = this.k;
        switch (b) {
            case 0:
                p7m0 p7m0Var = hyc0Var.J;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (this.j) {
                    p7m0Var.getClass();
                    p7m0Var.o(null, dfeVar);
                }
                if (hyc0Var.z.y) {
                    afeVar2 = new afe(Boolean.TRUE);
                }
                p7m0Var.getClass();
                p7m0Var.o(null, afeVar2);
                return Unit.f46060a;
            case 1:
                p7m0 p7m0Var2 = hyc0Var.I;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (this.j) {
                    p7m0Var2.getClass();
                    p7m0Var2.o(null, dfeVar);
                }
                if (hyc0Var.e.a() && hyc0Var.A == zuc0.CARDS_WITH_GAMES_AND_STORE) {
                    z = true;
                }
                if (z) {
                    afeVar2 = new afe(Boolean.TRUE);
                }
                p7m0Var2.getClass();
                p7m0Var2.o(null, afeVar2);
                return Unit.f46060a;
            case 2:
                boolean z2 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (!hyc0Var.y && z2) {
                    hyc0Var.z(false);
                }
                hyc0Var.y = z2;
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    hyc0Var.E(null, Boolean.TRUE);
                    j910 j910Var = hyc0Var.k;
                    this.j = true;
                    obj = j910Var.q(this);
                    if (obj == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                o7c0 o7c0Var = (o7c0) obj;
                i8i.D("screen", "promo_menu", hyc0Var.u.f1961a, "promo_shop_get_points_call");
                hyc0Var.K.f(zvw.V(o7c0Var, hyc0Var.o));
                hyc0Var.E(new Integer(o7c0Var.d), Boolean.FALSE);
                hyc0Var.t.f40143a.a(cui0.b(new j1p("promo_menu", (byte) 1)), 3309L);
                return Unit.f46060a;
            default:
                wne wneVar5 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    nou nouVar = hyc0Var.j;
                    this.j = true;
                    obj = nouVar.a(tl5.c, this);
                    if (obj == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i = ((ql5) obj).h;
                p7m0 p7m0Var3 = hyc0Var.E;
                do {
                    value = p7m0Var3.getValue();
                    afeVar = (gfe) value;
                    if (afeVar instanceof afe) {
                        afeVar = new afe(eic0.a((eic0) ((afe) afeVar).f774a, i, false, 62));
                    }
                } while (!p7m0Var3.m(value, afeVar));
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dyc0(hyc0 hyc0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = hyc0Var;
    }
}
