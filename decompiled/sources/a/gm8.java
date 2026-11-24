package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class gm8 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ km8 k;
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gm8(km8 km8Var, int i, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = km8Var;
        this.l = i;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        int i = this.l;
        km8 km8Var = this.k;
        switch (b) {
            case 0:
                return new gm8(km8Var, i, yjeVar, (byte) 0);
            case 1:
                return new gm8(km8Var, i, yjeVar, (byte) 1);
            default:
                return new gm8(km8Var, i, yjeVar, (byte) 2);
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
        }
        return ((gm8) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws zhi0 {
        Object value;
        Object value2;
        int i;
        byte b = this.i;
        int i2 = this.l;
        final km8 km8Var = this.k;
        yje yjeVar = null;
        final byte b2 = 1;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    clc clcVar = km8Var.y;
                    this.j = true;
                    oif0 oif0Var = (oif0) clcVar.b;
                    Object objG = ((r7v) oif0Var.c).g(((btt0) oif0Var.b).a(), new blc(i2), this);
                    if (objG != wneVar) {
                        objG = Unit.f46060a;
                    }
                    if (objG != wneVar) {
                        objG = Unit.f46060a;
                    }
                    if (objG == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Boolean.TRUE;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                final byte b3 = 0;
                if (!z2) {
                    z1x.P(obj);
                    gm8 gm8Var = new gm8(km8Var, i2, yjeVar, b3);
                    this.j = true;
                    obj = msm0.u(60000L, gm8Var, this);
                    if (obj == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                Boolean bool = (Boolean) obj;
                if (bool != null ? bool.booleanValue() : false) {
                    int i3 = km8.F;
                    km8Var.N(new Function0() { // from class: a.zl8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Object value3;
                            Object value4;
                            byte b4 = b3;
                            km8 km8Var2 = km8Var;
                            switch (b4) {
                                case 0:
                                    p7m0 p7m0Var = km8Var2.i.f25029a;
                                    do {
                                        value3 = p7m0Var.getValue();
                                        value3.getClass();
                                        km8Var2.f.getClass();
                                    } while (!p7m0Var.m(value3, nl8.a((nl8) value3, null, 0, false, false, null, 61)));
                                    km8Var2.G(dl8.f6265a);
                                    bby bbyVar = km8Var2.A;
                                    if (bbyVar != null) {
                                        bbyVar.cancel(null);
                                    }
                                    break;
                                default:
                                    p7m0 p7m0Var2 = km8Var2.i.f25029a;
                                    do {
                                        value4 = p7m0Var2.getValue();
                                        value4.getClass();
                                        km8Var2.f.getClass();
                                    } while (!p7m0Var2.m(value4, nl8.a((nl8) value4, null, 0, false, false, null, 61)));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    });
                    return Unit.f46060a;
                }
                int i4 = km8.F;
                p7m0 p7m0Var = km8Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    km8Var.f.getClass();
                } while (!p7m0Var.m(value, nl8.a((nl8) value, null, 0, false, false, null, 61)));
                bby bbyVar = km8Var.B;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                km8Var.G(cl8.f4543a);
                return Unit.f46060a;
            default:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    int i5 = km8.F;
                    p7m0 p7m0Var2 = km8Var.i.f25029a;
                    do {
                        value2 = p7m0Var2.getValue();
                        value2.getClass();
                        i = this.l;
                    } while (!p7m0Var2.m(value2, nl8.a((nl8) value2, null, i, false, false, null, 61)));
                    z220 z220Var = km8Var.r;
                    this.j = true;
                    if (z220Var.A(i, this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i6 = km8.F;
                km8Var.N(new Function0() { // from class: a.zl8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Object value3;
                        Object value4;
                        byte b4 = b2;
                        km8 km8Var2 = km8Var;
                        switch (b4) {
                            case 0:
                                p7m0 p7m0Var3 = km8Var2.i.f25029a;
                                do {
                                    value3 = p7m0Var3.getValue();
                                    value3.getClass();
                                    km8Var2.f.getClass();
                                } while (!p7m0Var3.m(value3, nl8.a((nl8) value3, null, 0, false, false, null, 61)));
                                km8Var2.G(dl8.f6265a);
                                bby bbyVar2 = km8Var2.A;
                                if (bbyVar2 != null) {
                                    bbyVar2.cancel(null);
                                }
                                break;
                            default:
                                p7m0 p7m0Var4 = km8Var2.i.f25029a;
                                do {
                                    value4 = p7m0Var4.getValue();
                                    value4.getClass();
                                    km8Var2.f.getClass();
                                } while (!p7m0Var4.m(value4, nl8.a((nl8) value4, null, 0, false, false, null, 61)));
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                return Unit.f46060a;
        }
    }
}
