package a;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class rl20 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ on20 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rl20(on20 on20Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = on20Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        on20 on20Var = this.k;
        switch (b) {
            case 0:
                rl20 rl20Var = new rl20(on20Var, yjeVar, (byte) 0);
                rl20Var.j = obj;
                return rl20Var;
            case 1:
                rl20 rl20Var2 = new rl20(on20Var, yjeVar, (byte) 1);
                rl20Var2.j = obj;
                return rl20Var2;
            case 2:
                rl20 rl20Var3 = new rl20(on20Var, yjeVar, (byte) 2);
                rl20Var3.j = obj;
                return rl20Var3;
            case 3:
                rl20 rl20Var4 = new rl20(on20Var, yjeVar, (byte) 3);
                rl20Var4.j = obj;
                return rl20Var4;
            case 4:
                rl20 rl20Var5 = new rl20(on20Var, yjeVar, (byte) 4);
                rl20Var5.j = obj;
                return rl20Var5;
            default:
                rl20 rl20Var6 = new rl20(on20Var, yjeVar, (byte) 5);
                rl20Var6.j = obj;
                return rl20Var6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((rl20) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((rl20) create((en7) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((rl20) create((Pair) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((rl20) create((sw00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((rl20) create((lit0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((rl20) create((lit0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0286  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        a820 a820Var;
        boolean z;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        byte b = this.i;
        kit0 kit0Var = kit0.f18353a;
        jit0 jit0Var = jit0.f16593a;
        yje yjeVar = null;
        byte b2 = 1;
        on20 on20Var = this.k;
        switch (b) {
            case 0:
                Throwable th = (Throwable) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                on20Var.C.b(th, new ei20((byte) 5));
                return Unit.f46060a;
            case 1:
                en7 en7Var = (en7) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                k110 k110Var = new k110((Object) on20Var, (Object) en7Var, (byte) 20);
                int i = on20.m1;
                on20Var.H(k110Var);
                return Unit.f46060a;
            case 2:
                Pair pair = (Pair) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                final String str = (String) pair.f46059a;
                final d680 d680Var = (d680) pair.b;
                final on20 on20Var2 = this.k;
                final double dI = on20Var2.X.i();
                final boolean zK = on20Var2.W.k();
                final boolean z2 = !q3d.j(q4f.g, q4f.f, q4f.h, q4f.j, q4f.k, q4f.m).contains(((a820) on20Var2.D()).j);
                if (d680Var.f5540a == 0.0d) {
                    on20Var2.H(new Function2() { // from class: a.ph20
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            a820 a820Var2 = (a820) obj3;
                            ((oyg0) obj2).getClass();
                            a820Var2.getClass();
                            txe txeVar = a820Var2.b;
                            return a820.a(a820Var2, txe.a(txeVar, 0L, 0, null, on20Var2.K0(txeVar.d, str, dI, z2, zK), null, false, null, 55), null, null, null, null, null, null, false, null, 0.0f, false, null, 0, false, false, false, 262141);
                        }
                    });
                } else {
                    if (q3d.j(q4f.c, q4f.d).contains(((a820) on20Var2.D()).j)) {
                        on20Var2.H(new Function2() { // from class: a.nh20
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                m0d m0dVar;
                                m0d m0dVar2;
                                a820 a820Var2 = (a820) obj3;
                                ((oyg0) obj2).getClass();
                                a820Var2.getClass();
                                txe txeVar = a820Var2.b;
                                h680 h680Var = txeVar.g;
                                if (h680Var != null) {
                                    m0dVar = h680Var.f12519a;
                                } else {
                                    azc azcVar = azc.f1709a;
                                    m0dVar = new m0d(0.0d, "", 0.0d, "", azcVar, azcVar, o0d.f24418a);
                                }
                                on20 on20Var3 = on20Var2;
                                String str2 = str;
                                double d = dI;
                                boolean z3 = zK;
                                m0d m0dVarK0 = on20Var3.K0(m0dVar, str2, d, true, z3);
                                if (h680Var != null) {
                                    m0dVar2 = h680Var.b;
                                } else {
                                    azc azcVar2 = azc.f1709a;
                                    m0dVar2 = new m0d(0.0d, "", 0.0d, "", azcVar2, azcVar2, o0d.f24418a);
                                }
                                d680 d680Var2 = d680Var;
                                return a820.a(a820Var2, txe.a(txeVar, 0L, 0, null, null, null, false, new h680(m0dVarK0, on20Var3.K0(m0dVar2, d680Var2.b, d680Var2.f5540a, true, z3)), 63), null, null, null, null, null, null, false, null, 0.0f, false, null, 0, false, false, false, 262141);
                            }
                        });
                    } else {
                        on20Var2.H(new Function2() { // from class: a.ph20
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                a820 a820Var2 = (a820) obj3;
                                ((oyg0) obj2).getClass();
                                a820Var2.getClass();
                                txe txeVar = a820Var2.b;
                                return a820.a(a820Var2, txe.a(txeVar, 0L, 0, null, on20Var2.K0(txeVar.d, str, dI, z2, zK), null, false, null, 55), null, null, null, null, null, null, false, null, 0.0f, false, null, 0, false, false, false, 262141);
                            }
                        });
                    }
                }
                on20Var2.R0();
                return Unit.f46060a;
            case 3:
                sw00 sw00Var = (sw00) this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                int i2 = on20.m1;
                p7m0 p7m0Var = on20Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    a820Var = (a820) value;
                    z = sw00Var.f32897a;
                } while (!p7m0Var.m(value, a820.a(a820Var, null, null, null, null, null, null, null, z, null, (!z || sw00Var.b) ? a820Var.k : 1.0f, false, null, 0, false, false, false, 260863)));
                if (sw00Var.f32897a) {
                    i3t0.L(on20Var, new fnq(on20Var.Y0.a(), new hk20(on20Var, yjeVar, (byte) 3), (byte) 4), null, null, 3);
                    byte b3 = 0;
                    sac.T(new fnq(i120.W(new fnq(new fnq(on20Var.F.a(bm5.i), new o3s(on20Var, yjeVar, (byte) 18), (byte) 4), new mt00((Object) on20Var, yjeVar, (byte) 13))), new ql20(on20Var, yjeVar, b3), (byte) 4), d5c.S(jiu0.a(on20Var), on20Var.E.b), new rl20(on20Var, yjeVar, b3));
                    uii uiiVar = on20Var.S0;
                    i3t0.L(on20Var, new fnq(new a1t(i120.W(new a1g(((j9c) uiiVar.f35730a).b(), uiiVar, (byte) 29)), (byte) 29), new ql20(on20Var, yjeVar, b2), (byte) 4), null, null, 3);
                    i3t0.K(on20Var, null, null, new hj20(on20Var, yjeVar, (byte) 7), 3);
                }
                return Unit.f46060a;
            case 4:
                oyg0 oyg0Var = on20Var.f;
                ocj ocjVar = on20Var.i;
                lit0 lit0Var = (lit0) this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                if (Intrinsics.d(lit0Var, jit0Var)) {
                    int i3 = on20.m1;
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value3 = p7m0Var2.getValue();
                        value3.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var2.m(value3, a820.a((a820) value3, null, null, null, null, null, null, null, false, null, 0.0f, false, null, 0, false, false, false, 196607)));
                    on20Var.L0(on20Var.Z0.c().f0);
                    on20Var.R0();
                } else {
                    if (!Intrinsics.d(lit0Var, kit0Var)) {
                        t9f.b();
                        return null;
                    }
                    int i4 = on20.m1;
                    p7m0 p7m0Var3 = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var3.getValue();
                        value2.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var3.m(value2, a820.a((a820) value2, null, null, null, null, null, null, null, false, null, 0.0f, false, null, 0, false, false, true, 196607)));
                }
                return Unit.f46060a;
            default:
                oyg0 oyg0Var2 = on20Var.f;
                ocj ocjVar2 = on20Var.i;
                lit0 lit0Var2 = (lit0) this.j;
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                if (Intrinsics.d(lit0Var2, jit0Var)) {
                    int i5 = on20.m1;
                    p7m0 p7m0Var4 = ocjVar2.f25029a;
                    do {
                        value5 = p7m0Var4.getValue();
                        value5.getClass();
                        oyg0Var2.getClass();
                    } while (!p7m0Var4.m(value5, a820.a((a820) value5, null, null, null, null, null, null, null, false, null, 0.0f, false, null, 0, false, false, false, 196607)));
                    on20Var.H(new zl20(on20Var.Z0.c(), (byte) 1));
                } else {
                    if (!Intrinsics.d(lit0Var2, kit0Var)) {
                        t9f.b();
                        return null;
                    }
                    int i6 = on20.m1;
                    p7m0 p7m0Var5 = ocjVar2.f25029a;
                    do {
                        value4 = p7m0Var5.getValue();
                        value4.getClass();
                        oyg0Var2.getClass();
                    } while (!p7m0Var5.m(value4, a820.a((a820) value4, null, null, null, null, null, null, null, false, null, 0.0f, false, null, 0, false, false, true, 196607)));
                }
                return Unit.f46060a;
        }
    }
}
