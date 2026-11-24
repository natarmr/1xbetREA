package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.coupon.impl.make_bet.presentation.model.AutoMaxUiModel;

/* JADX INFO: loaded from: classes.dex */
public final class ql20 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ on20 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ql20(on20 on20Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = on20Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        on20 on20Var = this.l;
        switch (b) {
            case 0:
                ql20 ql20Var = new ql20(on20Var, yjeVar, (byte) 0);
                ql20Var.k = obj;
                return ql20Var;
            case 1:
                ql20 ql20Var2 = new ql20(on20Var, yjeVar, (byte) 1);
                ql20Var2.k = obj;
                return ql20Var2;
            case 2:
                ql20 ql20Var3 = new ql20(on20Var, yjeVar, (byte) 2);
                ql20Var3.k = obj;
                return ql20Var3;
            default:
                ql20 ql20Var4 = new ql20(on20Var, yjeVar, (byte) 3);
                ql20Var4.k = obj;
                return ql20Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((ql20) create((ql5) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((ql20) create((vf7) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((ql20) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((ql20) create((q4f) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        byte b2 = 2;
        String str = "";
        on20 on20Var = this.l;
        byte b3 = 6;
        byte b4 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        final byte b5 = 1;
        yje yjeVar = null;
        switch (b) {
            case 0:
                ql5 ql5Var = (ql5) this.k;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    int i = on20.m1;
                    on20Var.G(ab20.f559a);
                    if (((a820) on20Var.D()).d.c.f28916a != ql5Var.f28916a) {
                        on20Var.H(new xh20((Object) new a8q0("", 0L, 6), (boolean) (objArr == true ? 1 : 0), b5));
                        on20Var.G0(new a8q0("", 0L, 6), false);
                    }
                    on20Var.H(new fd20((byte) 29));
                    if (((a820) on20Var.D()).d.c.f28916a != ql5Var.f28916a) {
                        on20Var.H(new lh20(on20Var, (byte) 7));
                    }
                    this.k = ql5Var;
                    this.j = true;
                    if (on20Var.I0(ql5Var, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                String str2 = ql5Var.f;
                int i2 = on20.m1;
                on20Var.H(new yh20(str2, (byte) 2));
                bby bbyVar = on20Var.g1;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                on20Var.H(new lh20(on20Var, (byte) 8));
                on20Var.p0();
                return Unit.f46060a;
            case 1:
                final vf7 vf7Var = (vf7) this.k;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    int i3 = on20.m1;
                    final Object[] objArr5 = objArr2 == true ? 1 : 0;
                    on20Var.H(new Function2() { // from class: a.bi20
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            byte b6 = objArr5;
                            vf7 vf7Var2 = vf7Var;
                            switch (b6) {
                                case 0:
                                    a820 a820Var = (a820) obj3;
                                    ((oyg0) obj2).getClass();
                                    a820Var.getClass();
                                    pvj0 pvj0Var = a820Var.e;
                                    bx6 bx6Var = pvj0Var.f27665a;
                                    tw6 tw6Var = bx6Var.b;
                                    double d = vf7Var2.e;
                                    double d2 = vf7Var2.b;
                                    double d3 = vf7Var2.c;
                                    boolean z3 = vf7Var2.h;
                                    double d4 = z3 ? 9.99999999999999E12d : d2;
                                    String str3 = a820Var.d.c.f;
                                    if (z3) {
                                        d2 = 9.99999999999999E12d;
                                    }
                                    return a820.a(a820Var, null, null, null, pvj0.a(pvj0Var, bx6.a(bx6Var, null, tw6.a(tw6Var, 0.0d, 0.0d, d, d3, d4, str3, z3, false, new AutoMaxUiModel(d2, vf7Var2.g), false, false, !(d == 0.0d), false, false, false, 54915), false, 5), null, null, null, null, false, 62), null, null, null, false, null, 0.0f, false, null, 0, false, false, false, 262127);
                                default:
                                    a820 a820Var2 = (a820) obj3;
                                    ((oyg0) obj2).getClass();
                                    a820Var2.getClass();
                                    hx4 hx4Var = a820Var2.g;
                                    bx6 bx6Var2 = hx4Var.c;
                                    tw6 tw6Var2 = bx6Var2.b;
                                    double d5 = vf7Var2.e;
                                    double d6 = vf7Var2.b;
                                    double d7 = vf7Var2.c;
                                    boolean z4 = vf7Var2.h;
                                    double d8 = z4 ? 9.99999999999999E12d : d6;
                                    String str4 = a820Var2.d.c.f;
                                    if (z4) {
                                        d6 = 9.99999999999999E12d;
                                    }
                                    return a820.a(a820Var2, null, null, null, null, null, hx4.a(hx4Var, null, null, bx6.a(bx6Var2, null, tw6.a(tw6Var2, 0.0d, 0.0d, d5, d7, d8, str4, z4, false, new AutoMaxUiModel(d6, vf7Var2.g), false, true, !(d5 == 0.0d), false, false, false, 53891), false, 5), null, null, false, 59), null, false, null, 0.0f, false, null, 0, false, false, false, 262079);
                            }
                        }
                    });
                    on20Var.H(new Function2() { // from class: a.bi20
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            byte b6 = b5;
                            vf7 vf7Var2 = vf7Var;
                            switch (b6) {
                                case 0:
                                    a820 a820Var = (a820) obj3;
                                    ((oyg0) obj2).getClass();
                                    a820Var.getClass();
                                    pvj0 pvj0Var = a820Var.e;
                                    bx6 bx6Var = pvj0Var.f27665a;
                                    tw6 tw6Var = bx6Var.b;
                                    double d = vf7Var2.e;
                                    double d2 = vf7Var2.b;
                                    double d3 = vf7Var2.c;
                                    boolean z3 = vf7Var2.h;
                                    double d4 = z3 ? 9.99999999999999E12d : d2;
                                    String str3 = a820Var.d.c.f;
                                    if (z3) {
                                        d2 = 9.99999999999999E12d;
                                    }
                                    return a820.a(a820Var, null, null, null, pvj0.a(pvj0Var, bx6.a(bx6Var, null, tw6.a(tw6Var, 0.0d, 0.0d, d, d3, d4, str3, z3, false, new AutoMaxUiModel(d2, vf7Var2.g), false, false, !(d == 0.0d), false, false, false, 54915), false, 5), null, null, null, null, false, 62), null, null, null, false, null, 0.0f, false, null, 0, false, false, false, 262127);
                                default:
                                    a820 a820Var2 = (a820) obj3;
                                    ((oyg0) obj2).getClass();
                                    a820Var2.getClass();
                                    hx4 hx4Var = a820Var2.g;
                                    bx6 bx6Var2 = hx4Var.c;
                                    tw6 tw6Var2 = bx6Var2.b;
                                    double d5 = vf7Var2.e;
                                    double d6 = vf7Var2.b;
                                    double d7 = vf7Var2.c;
                                    boolean z4 = vf7Var2.h;
                                    double d8 = z4 ? 9.99999999999999E12d : d6;
                                    String str4 = a820Var2.d.c.f;
                                    if (z4) {
                                        d6 = 9.99999999999999E12d;
                                    }
                                    return a820.a(a820Var2, null, null, null, null, null, hx4.a(hx4Var, null, null, bx6.a(bx6Var2, null, tw6.a(tw6Var2, 0.0d, 0.0d, d5, d7, d8, str4, z4, false, new AutoMaxUiModel(d6, vf7Var2.g), false, true, !(d5 == 0.0d), false, false, false, 53891), false, 5), null, null, false, 59), null, false, null, 0.0f, false, null, 0, false, false, false, 262079);
                            }
                        }
                    });
                    boolean zK = on20Var.Q.k();
                    this.k = null;
                    this.j = true;
                    if (on20Var.M0(vf7Var, zK, this) == wneVar2) {
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
                kmq kmqVar = (kmq) this.k;
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    q4f q4fVarA = on20Var.b0.a();
                    this.k = null;
                    this.j = true;
                    if (kmqVar.a(q4fVarA, this) == wneVar3) {
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
            default:
                q4f q4fVar = (q4f) this.k;
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                on20 on20Var2 = this.l;
                if (!z4) {
                    z1x.P(obj);
                    this.k = q4fVar;
                    this.j = true;
                    int i4 = on20.m1;
                    if (on20Var2.Q0(q4fVar, this) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i5 = on20.m1;
                ((a820) on20Var2.D()).f.f6938a.f33019a.setValue("");
                on20Var2.H(new yh20(str, b4));
                bby bbyVar2 = on20Var2.g1;
                if (bbyVar2 != null) {
                    bbyVar2.cancel(null);
                }
                on20Var2.H(new lh20(on20Var2, (byte) 8));
                on20Var2.H(new b120(q4fVar, b3));
                on20Var2.p0();
                q4f q4fVar2 = q4f.m;
                if (q3d.j(q4fVar2, q4f.h).contains(q4fVar)) {
                    on20Var2.H(new ei20(b5));
                    c4m0 c4m0Var = on20Var2.k1;
                    if (c4m0Var != null) {
                        c4m0Var.cancel(null);
                    }
                    on20Var2.k1 = i3t0.L(on20Var2, new fnq(new fnq(((lye) ((oif0) on20Var2.q0.f27640a).b).m, new tl20(on20Var2, q4fVar, yjeVar, objArr4 == true ? 1 : 0)), new tl20(on20Var2, q4fVar, yjeVar, b5), (byte) 4), null, null, 3);
                    c4m0 c4m0Var2 = on20Var2.l1;
                    if (c4m0Var2 != null) {
                        c4m0Var2.cancel(null);
                    }
                    on20Var2.l1 = i3t0.L(on20Var2, new fnq(((lye) on20Var2.r0.f42910a.b).l, new tl20(on20Var2, q4fVar, yjeVar, b2), (byte) 4), null, null, 3);
                } else {
                    c4m0 c4m0Var3 = on20Var2.k1;
                    if (c4m0Var3 != null) {
                        c4m0Var3.cancel(null);
                    }
                    c4m0 c4m0Var4 = on20Var2.l1;
                    if (c4m0Var4 != null) {
                        c4m0Var4.cancel(null);
                    }
                    on20Var2.H(new ei20(b3));
                }
                on20Var2.H(new k110((Object) on20Var2, (Object) q4fVar, (byte) 21));
                i3t0.K(on20Var2, null, null, new hj20(on20Var2, yjeVar, objArr3 == true ? 1 : 0), 3);
                on20Var2.L0(on20Var2.Z0.c().f0);
                if (q4fVar == q4fVar2) {
                    double d = ((a820) on20Var2.D()).e.f27665a.b.b;
                    on20Var2.O0(d);
                    on20Var2.H(new ks6(d, (byte) 10));
                    i3t0.K(on20Var2, null, null, new dn20(on20Var2, q4fVar, d, null), 3);
                }
                on20Var2.H(new fd20((byte) 29));
                on20Var2.R0();
                return Unit.f46060a;
        }
    }
}
