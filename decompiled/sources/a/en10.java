package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class en10 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ pn10 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ en10(pn10 pn10Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = pn10Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        pn10 pn10Var = this.k;
        switch (b) {
            case 0:
                return new en10(pn10Var, yjeVar, (byte) 0);
            case 1:
                return new en10(pn10Var, yjeVar, (byte) 1);
            case 2:
                return new en10(pn10Var, yjeVar, (byte) 2);
            case 3:
                return new en10(pn10Var, yjeVar, (byte) 3);
            default:
                en10 en10Var = new en10(pn10Var, yjeVar, (byte) 4);
                en10Var.j = ((Boolean) obj).booleanValue();
                return en10Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((en10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((en10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((en10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((en10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((en10) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Exception {
        Object objA;
        byte b = this.i;
        pn10 pn10Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    this.j = true;
                    int i = pn10.e0;
                    if (pn10Var.P(true, this) == wneVar) {
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
                    vae0 vae0VarA = pn10Var.K.a();
                    kg10 kg10Var = new kg10(pn10Var, (byte) 17);
                    this.j = true;
                    if (vae0VarA.f37082a.c(kg10Var, this) == wneVar2) {
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
                wsf0 wsf0Var = pn10Var.C;
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    hs60 hs60Var = pn10Var.E;
                    s470 s470Var = s470.LUCKY_WHEEL;
                    long jA = s470Var.a();
                    zn60 zn60Var = zn60.Main;
                    hs60Var.b(jA);
                    l7k l7kVar = pn10Var.M;
                    int iA = (int) s470Var.a();
                    y1p y1pVar = y1p.MAIN;
                    l7kVar.a(iA, "games", pn10Var.N.g());
                    khf0 khf0VarG = ((g45) wsf0Var.b).G();
                    bm5 bm5Var = bm5.d;
                    this.j = true;
                    objA = khf0VarG.A(bm5Var, tl5.c, this);
                    if (objA == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA = obj;
                }
                ql5 ql5Var = (ql5) objA;
                wsf0Var.s().l(bm5.d, ql5Var);
                pn10Var.L.a(pn10Var.o, true, ql5Var.f28916a);
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    this.j = true;
                    int i2 = pn10.e0;
                    if (pn10Var.P(true, this) == wneVar4) {
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
            default:
                boolean z5 = this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                pn10Var.b0 = z5;
                p7m0 p7m0Var = pn10Var.i.f25029a;
                while (true) {
                    Object value = p7m0Var.getValue();
                    value.getClass();
                    boolean z6 = z5;
                    if (p7m0Var.m(value, tm10.a((tm10) value, null, null, null, null, null, null, false, null, null, false, null, false, 0L, false, null, null, z6, false, false, null, null, 4063231))) {
                        if (z6 && pn10Var.U == null) {
                            pn10Var.Q(jo10.f16836a, false, false);
                        }
                        return Unit.f46060a;
                    }
                    z5 = z6;
                }
                break;
        }
    }
}
