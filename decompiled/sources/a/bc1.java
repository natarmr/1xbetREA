package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class bc1 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ kc1 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bc1(kc1 kc1Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = kc1Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        kc1 kc1Var = this.k;
        switch (b) {
            case 0:
                return new bc1(kc1Var, yjeVar, (byte) 0);
            case 1:
                return new bc1(kc1Var, yjeVar, (byte) 1);
            case 2:
                return new bc1(kc1Var, yjeVar, (byte) 2);
            default:
                return new bc1(kc1Var, yjeVar, (byte) 3);
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
        }
        return ((bc1) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object value;
        Object objA2;
        Object objA3;
        Object objR;
        Object value2;
        byte b = this.i;
        gb1 gb1Var = gb1.f10993a;
        kc1 kc1Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    nou nouVar = kc1Var.F;
                    this.j = true;
                    objA = nouVar.a(tl5.c, this);
                    if (objA == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA = obj;
                }
                ql5 ql5Var = (ql5) objA;
                kc1Var.E.l(bm5.e, ql5Var);
                p7m0 p7m0Var = kc1Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, xb1.a((xb1) value, null, null, false, 0L, 0L, ql5Var.f28916a, false, 1983)));
                kc1Var.T();
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    nrt nrtVar = kc1Var.H;
                    long j = ((xb1) kc1Var.D()).g;
                    this.j = true;
                    objA2 = nrt.a(nrtVar, j, this);
                    if (objA2 == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA2 = obj;
                }
                if (((ql5) objA2).i.a()) {
                    List list = kc1.P;
                    kc1Var.G(gb1Var);
                } else {
                    List list2 = kc1.P;
                    kc1Var.R();
                }
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    nrt nrtVar2 = kc1Var.H;
                    long j2 = ((xb1) kc1Var.D()).g;
                    this.j = true;
                    objA3 = nrt.a(nrtVar2, j2, this);
                    if (objA3 == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA3 = obj;
                }
                boolean zA = ((ql5) objA3).i.a();
                if (zA && ((xb1) kc1Var.D()).f40578a.f) {
                    kc1Var.G(vb1.f37117a);
                } else if (zA && ((xb1) kc1Var.D()).f40578a.e) {
                    kc1Var.G(gb1Var);
                } else {
                    List list3 = kc1.P;
                    kc1Var.T();
                }
                return Unit.f46060a;
            default:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    es esVar = kc1Var.L;
                    long j3 = ((xb1) kc1Var.D()).f40578a.f5778a;
                    this.j = true;
                    objR = esVar.r(j3, this);
                    if (objR == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objR = obj;
                }
                mlr mlrVar = (mlr) objR;
                if (mlrVar != null) {
                    o00 o00Var = new o00(mlrVar, (byte) 15);
                    List list4 = kc1.P;
                    kc1Var.H(o00Var);
                    kc1Var.U(mlrVar.c);
                    long j4 = mlrVar.b;
                    if (kc1.P.contains(Long.valueOf(((xb1) kc1Var.D()).f))) {
                        p7m0 p7m0Var2 = kc1Var.i.f25029a;
                        do {
                            value2 = p7m0Var2.getValue();
                            value2.getClass();
                            kc1Var.f.getClass();
                        } while (!p7m0Var2.m(value2, xb1.a((xb1) value2, null, null, false, 0L, j4, 0L, false, 2015)));
                    }
                }
                List list5 = kc1.P;
                kc1Var.M();
                return Unit.f46060a;
        }
    }
}
