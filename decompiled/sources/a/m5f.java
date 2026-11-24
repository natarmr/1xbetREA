package a;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class m5f extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ r7f k;
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m5f(r7f r7fVar, int i, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = r7fVar;
        this.l = i;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        int i = this.l;
        r7f r7fVar = this.k;
        switch (b) {
            case 0:
                return new m5f(r7fVar, i, yjeVar, (byte) 0);
            case 1:
                m5f m5fVar = new m5f(r7fVar, i, yjeVar, (byte) 1);
                m5fVar.j = ((Boolean) obj).booleanValue();
                return m5fVar;
            default:
                return new m5f(r7fVar, i, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((m5f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((m5f) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((m5f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        pu40 pu40Var;
        int i;
        int i2;
        byte b = this.i;
        byte b2 = 4;
        int i3 = 2;
        int i4 = this.l;
        r7f r7fVar = this.k;
        byte b3 = 1;
        yje yjeVar = null;
        switch (b) {
            case 0:
                ol60 ol60Var = r7fVar.d2;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    u8u u8uVar = r7fVar.F;
                    oif0 oif0Var = (oif0) u8uVar.b;
                    g45 g45Var = (g45) u8uVar.c;
                    q4f q4fVar = ((ave) g45Var.c).f1521a;
                    q4f q4fVar2 = q4f.g;
                    q4f q4fVar3 = q4f.h;
                    if (!q3d.j(q4fVar2, q4fVar3).contains(q4fVar)) {
                        pu40Var = pu40.b;
                    } else if (q4fVar == q4fVar2) {
                        Pair pairC = g45Var.C();
                        long jLongValue = ((Number) pairC.f46059a).longValue();
                        int iIntValue = ((Number) pairC.b).intValue();
                        if (jLongValue == -1) {
                            pu40Var = pu40.e;
                        } else {
                            LinkedHashMap linkedHashMapN = u8u.n(iIntValue, i4, oif0Var.n());
                            if (iIntValue == i4) {
                                pu40Var = pu40.f27597a;
                            } else {
                                if (linkedHashMapN.isEmpty()) {
                                    i2 = 0;
                                } else {
                                    Iterator it = linkedHashMapN.entrySet().iterator();
                                    i2 = 0;
                                    while (it.hasNext()) {
                                        if (((Number) ((Map.Entry) it.next()).getValue()).intValue() > 0) {
                                            i2++;
                                        }
                                    }
                                }
                                pu40Var = i2 >= 3 ? pu40.b : pu40.c;
                            }
                        }
                    } else if (q4fVar == q4fVar3) {
                        Pair pairC2 = g45Var.C();
                        long jLongValue2 = ((Number) pairC2.f46059a).longValue();
                        int iIntValue2 = ((Number) pairC2.b).intValue();
                        if (jLongValue2 == -1) {
                            pu40Var = pu40.e;
                        } else {
                            LinkedHashMap linkedHashMapN2 = u8u.n(iIntValue2, i4, oif0Var.n());
                            if (iIntValue2 == i4) {
                                pu40Var = pu40.f27597a;
                            } else {
                                if (linkedHashMapN2.isEmpty()) {
                                    i = 0;
                                } else {
                                    Iterator it2 = linkedHashMapN2.entrySet().iterator();
                                    i = 0;
                                    while (it2.hasNext()) {
                                        if (((Number) ((Map.Entry) it2.next()).getValue()).intValue() > 0) {
                                            i++;
                                        }
                                    }
                                }
                                pu40Var = i >= 2 ? pu40.b : pu40.d;
                            }
                        }
                    } else {
                        pu40Var = pu40.e;
                    }
                    int iOrdinal = pu40Var.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1) {
                            z220 z220Var = r7fVar.G;
                            this.j = true;
                            if (z220Var.A(i4, this) == wneVar) {
                                return wneVar;
                            }
                        } else if (iOrdinal == 2) {
                            ol60Var.f(new u3f(0, 0L, false));
                        } else if (iOrdinal == 3) {
                            ol60Var.f(v3f.f36729a);
                        } else if (iOrdinal != 4) {
                            t9f.b();
                            return null;
                        }
                    }
                    r7fVar.b0.b();
                    return Unit.f46060a;
                }
                if (!z) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                r7fVar.h0(false, false, new s4f(r7fVar, (byte) 10));
                r7fVar.b0.b();
                return Unit.f46060a;
            case 1:
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (z2) {
                    r7fVar.d2.f(new t3f(i4));
                }
                return Boolean.valueOf(z2);
            default:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    fnq fnqVar = new fnq(r7fVar.c2, new b04(i3, yjeVar, b2), (byte) 1);
                    m5f m5fVar = new m5f(r7fVar, i4, yjeVar, b3);
                    this.j = true;
                    if (ntb.L(fnqVar, m5fVar, this) == wneVar3) {
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
}
