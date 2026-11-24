package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.coupon.impl.make_bet.presentation.model.StepInputUiModel;

/* JADX INFO: loaded from: classes.dex */
public final class kf20 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ qg20 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kf20(qg20 qg20Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = qg20Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        qg20 qg20Var = this.l;
        switch (b) {
            case 0:
                kf20 kf20Var = new kf20(qg20Var, yjeVar, (byte) 0);
                kf20Var.k = obj;
                return kf20Var;
            case 1:
                kf20 kf20Var2 = new kf20(qg20Var, yjeVar, (byte) 1);
                kf20Var2.k = obj;
                return kf20Var2;
            case 2:
                kf20 kf20Var3 = new kf20(qg20Var, yjeVar, (byte) 2);
                kf20Var3.k = obj;
                return kf20Var3;
            default:
                kf20 kf20Var4 = new kf20(qg20Var, yjeVar, (byte) 3);
                kf20Var4.k = obj;
                return kf20Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((kf20) create((q4f) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((kf20) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((kf20) create((q4f) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((kf20) create((lit0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        StepInputUiModel stepInputUiModel;
        Object value5;
        Object value6;
        Object value7;
        Object value8;
        byte b = this.i;
        qg20 qg20Var = this.l;
        yje yjeVar = null;
        switch (b) {
            case 0:
                q4f q4fVar = (q4f) this.k;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    qoj0 qoj0Var = qg20Var.i1;
                    this.k = null;
                    this.j = true;
                    if (qoj0Var.a(q4fVar, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                bby bbyVar = qg20Var.M0;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                qg20Var.Q(true);
                return Unit.f46060a;
            case 1:
                vne vneVar = (vne) this.k;
                Object obj2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    qoj0 qoj0Var2 = ((lye) qg20Var.l0.f34873a.b).p;
                    qoj0 qoj0Var3 = qg20Var.q1;
                    yf20 yf20Var = new yf20(3, null);
                    clu cluVar = new clu(qg20Var, vneVar, (byte) 13);
                    this.k = null;
                    this.j = true;
                    Object objG = tdc.G(this, cluVar, new kh1((Object) yf20Var, yjeVar, (byte) 9), pul.j, new gmq[]{qoj0Var2, qoj0Var3});
                    if (objG != obj2) {
                        objG = Unit.f46060a;
                    }
                    if (objG == obj2) {
                        return obj2;
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
                p7m0 p7m0Var = qg20Var.d1;
                q4f q4fVar2 = (q4f) this.k;
                wne wneVar2 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    boolean z4 = q4fVar2 == q4f.h;
                    boolean z5 = qg20Var.T0.f24244a;
                    boolean z6 = q4fVar2 == q4f.m;
                    do {
                        value = p7m0Var.getValue();
                    } while (!p7m0Var.m(value, StepInputUiModel.a((StepInputUiModel) value, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, false, false, null, !z4, false, false, false, false, false, false, 261631)));
                    p7m0 p7m0Var2 = qg20Var.n1;
                    do {
                        value2 = p7m0Var2.getValue();
                    } while (!p7m0Var2.m(value2, rn20.a((rn20) value2, false, z4, z5, 1)));
                    if (z4) {
                        qg20Var.d0();
                        p7m0 p7m0Var3 = qg20Var.h1;
                        p7m0Var3.getClass();
                        p7m0Var3.o(null, hnb0.f13344a);
                    } else if (z6) {
                        qg20Var.d0();
                        do {
                            value4 = p7m0Var.getValue();
                            stepInputUiModel = (StepInputUiModel) value4;
                        } while (!p7m0Var.m(value4, StepInputUiModel.a(stepInputUiModel, stepInputUiModel.b, 0.0d, 0.0d, 0.0d, 0.0d, null, false, false, null, false, false, false, false, false, false, false, 258046)));
                    } else {
                        do {
                            value3 = p7m0Var.getValue();
                        } while (!p7m0Var.m(value3, StepInputUiModel.a((StepInputUiModel) value3, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, false, false, null, false, true, false, false, false, false, false, 259071)));
                        qg20Var.S();
                    }
                    if (!((StepInputUiModel) p7m0Var.getValue()).m) {
                        qoj0 qoj0Var4 = qg20Var.k1;
                        Unit unit = Unit.f46060a;
                        this.k = null;
                        this.j = true;
                        if (qoj0Var4.a(unit, this) == wneVar2) {
                            return wneVar2;
                        }
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                bby bbyVar2 = qg20Var.M0;
                if (bbyVar2 != null) {
                    bbyVar2.cancel(null);
                }
                qg20Var.Q(true);
                return Unit.f46060a;
            default:
                p7m0 p7m0Var4 = qg20Var.d1;
                p7m0 p7m0Var5 = qg20Var.l1;
                lit0 lit0Var = (lit0) this.k;
                wne wneVar3 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    if (Intrinsics.d(lit0Var, jit0.f16593a)) {
                        do {
                            value5 = p7m0Var5.getValue();
                        } while (!p7m0Var5.m(value5, fxo.a((fxo) value5, false, false, false, 191)));
                        do {
                            value6 = p7m0Var4.getValue();
                        } while (!p7m0Var4.m(value6, StepInputUiModel.a((StepInputUiModel) value6, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, false, false, null, false, false, false, false, false, false, false, 196607)));
                        sac.V(jiu0.a(qg20Var), kg20.f18221a, null, qg20Var.d.f22085a, new mq10((diu0) qg20Var, yjeVar, (byte) 6), 10);
                    } else {
                        if (!Intrinsics.d(lit0Var, kit0.f18353a)) {
                            t9f.b();
                            return null;
                        }
                        uen uenVar = wen.b;
                        long jW0 = ibc.w0(500L, bfn.MILLISECONDS);
                        this.k = null;
                        this.j = true;
                        if (qcc.P(jW0, this) == wneVar3) {
                            return wneVar3;
                        }
                    }
                    return Unit.f46060a;
                }
                if (!z7) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                do {
                    value7 = p7m0Var5.getValue();
                } while (!p7m0Var5.m(value7, fxo.a((fxo) value7, false, true, false, 191)));
                do {
                    value8 = p7m0Var4.getValue();
                } while (!p7m0Var4.m(value8, StepInputUiModel.a((StepInputUiModel) value8, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, false, false, null, false, false, false, false, false, true, false, 196607)));
                qg20Var.e0(qg20Var.z());
                p7m0 p7m0Var6 = qg20Var.Y0;
                p7m0Var6.getClass();
                p7m0Var6.o(null, l40.f19380a);
                return Unit.f46060a;
        }
    }
}
