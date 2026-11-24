package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes3.dex */
public final class c4a extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ float k;
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4a(int i, d4a d4aVar, float f, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 0;
        this.l = i;
        this.m = d4aVar;
        this.k = f;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.m;
        switch (b) {
            case 0:
                float f = this.k;
                return new c4a(this.l, (d4a) obj2, f, yjeVar);
            case 1:
                return new c4a((xk80) obj2, this.k, this.l, yjeVar, (byte) 1);
            default:
                return new c4a((buv0) obj2, this.k, this.l, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((c4a) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((c4a) create((qah0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((c4a) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:78:0x014b  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        int i = 2;
        int i2 = this.l;
        float f = this.k;
        Object obj2 = this.m;
        switch (b) {
            case 0:
                p7m0 p7m0Var = ((d4a) obj2).n;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    na80.c.getClass();
                    na80 na80Var = na80.BORDER_0_TO_20;
                    IntRange intRange = na80Var.b;
                    int i3 = intRange.f46068a;
                    if (i2 > intRange.b || i3 > i2) {
                        na80Var = na80.BORDER_340_TO_360;
                        IntRange intRange2 = na80Var.b;
                        int i4 = intRange2.f46068a;
                        if (i2 > intRange2.b || i4 > i2) {
                            na80Var = na80.BORDER_70_TO_110;
                            IntRange intRange3 = na80Var.b;
                            int i5 = intRange3.f46068a;
                            if (i2 > intRange3.b || i5 > i2) {
                                na80Var = na80.BORDER_160_TO_200;
                                IntRange intRange4 = na80Var.b;
                                int i6 = intRange4.f46068a;
                                if (i2 > intRange4.b || i6 > i2) {
                                    na80Var = na80.BORDER_250_TO_290;
                                    IntRange intRange5 = na80Var.b;
                                    int i7 = intRange5.f46068a;
                                    if (i2 > intRange5.b || i7 > i2) {
                                        na80Var = na80.BORDER_UNDEFINED;
                                    }
                                }
                            }
                        }
                    }
                    int i8 = na80Var.f23178a;
                    if (i8 != -1 && i8 != ((sa80) p7m0Var.getValue()).c) {
                        float f2 = f % 360.0f;
                        if (f2 == 0.0f) {
                            f2 = -360.0f;
                        }
                        float f3 = i8;
                        float fFloatValue = (Math.abs(f2 - f3) > 180.0f ? new Float(f3 - 360.0f) : new Integer(i8)).floatValue();
                        int i9 = ((sa80) p7m0Var.getValue()).d;
                        int iOrdinal = na80Var.ordinal();
                        if (iOrdinal == 0) {
                            i = 0;
                        } else if (iOrdinal == 1) {
                            i = 3;
                        } else if (iOrdinal != 2) {
                            if (iOrdinal == 3) {
                                i = 1;
                            } else if (iOrdinal != 4) {
                                i = i9;
                            } else {
                                i = 0;
                            }
                        }
                        sa80 sa80Var = new sa80(f2, fFloatValue, i8, i);
                        this.j = true;
                        p7m0Var.getClass();
                        p7m0Var.o(null, sa80Var);
                        if (Unit.f46060a == wneVar) {
                            return wneVar;
                        }
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
                xk80 xk80Var = (xk80) obj2;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    this.j = true;
                    if (xk80Var.i(this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                double d = f;
                if (-0.5d > d || d > 0.5d) {
                    adx.a("pageOffsetFraction " + f + " is not within the range -0.5 to 0.5");
                }
                xk80Var.w(f, xk80Var.j(i2), true);
                return Unit.f46060a;
            default:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    t33 t33Var = ((buv0) obj2).j;
                    Float f4 = new Float(f);
                    uts0 uts0VarM0 = ro4.m0(i2, 0, ihn.d, 2);
                    this.j = true;
                    if (t33.a(t33Var, f4, uts0VarM0, null, null, this, 12) == wneVar3) {
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
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c4a(Object obj, float f, int i, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.m = obj;
        this.k = f;
        this.l = i;
    }
}
