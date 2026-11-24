package a;

import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class k2k0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ l2k0 k;
    public final /* synthetic */ boolean l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k2k0(l2k0 l2k0Var, boolean z, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = l2k0Var;
        this.l = z;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        boolean z = this.l;
        l2k0 l2k0Var = this.k;
        switch (b) {
            case 0:
                k2k0 k2k0Var = new k2k0(l2k0Var, z, yjeVar, (byte) 0);
                k2k0Var.j = obj;
                return k2k0Var;
            default:
                k2k0 k2k0Var2 = new k2k0(l2k0Var, z, yjeVar, (byte) 1);
                k2k0Var2.j = obj;
                return k2k0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((k2k0) create((IndexedValue) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((k2k0) create((Pair) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        f2k0 f2k0VarA;
        Object obj2;
        Object value2;
        Object value3;
        Object value4;
        byte b = this.i;
        boolean z = this.l;
        l2k0 l2k0Var = this.k;
        switch (b) {
            case 0:
                IndexedValue indexedValue = (IndexedValue) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = indexedValue.f46061a;
                ql5 ql5Var = (ql5) indexedValue.b;
                oyg0 oyg0Var = l2k0Var.f;
                ocj ocjVar = l2k0Var.i;
                ql5 ql5Var2 = ((f2k0) l2k0Var.D()).f8816a;
                Long l = ql5Var2 != null ? new Long(ql5Var2.f28916a) : null;
                p7m0 p7m0Var = ocjVar.f25029a;
                while (true) {
                    Object value5 = p7m0Var.getValue();
                    value5.getClass();
                    ql5 ql5Var3 = ql5Var;
                    if (p7m0Var.m(value5, f2k0.a((f2k0) value5, ql5Var, null, null, null, false, 0, 254))) {
                        boolean z2 = i == 0 && z;
                        long j = ql5Var3.f28916a;
                        if (l == null || j != l.longValue() || z2) {
                            ((oo) ((vkr0) l2k0Var.t.f6397a).c).f25569a.n(iun.f15405a);
                            ((hw3) l2k0Var.u.f4739a.d).f13752a.n(null);
                            l2k0Var.M(false, lk80.f20189a);
                        } else {
                            bby bbyVar = l2k0Var.G;
                            if (bbyVar != null) {
                                bbyVar.cancel(null);
                            }
                            p7m0 p7m0Var2 = ocjVar.f25029a;
                            do {
                                value = p7m0Var2.getValue();
                                value.getClass();
                                f2k0VarA = (f2k0) value;
                                oyg0Var.getClass();
                                if (f2k0VarA.d == ui5.b) {
                                    f2k0VarA = f2k0.a(f2k0VarA, null, null, null, ui5.e, false, 0, 247);
                                }
                            } while (!p7m0Var2.m(value, f2k0VarA));
                        }
                        return Unit.f46060a;
                    }
                    ql5Var = ql5Var3;
                }
                break;
            default:
                Pair pair = (Pair) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                bm80 bm80Var = (bm80) pair.f46059a;
                ik5 ik5Var = (ik5) pair.b;
                oyg0 oyg0Var2 = l2k0Var.f;
                ocj ocjVar2 = l2k0Var.i;
                int i2 = l2k0.J;
                yox yoxVar = l2k0Var.s;
                if (bm80Var != null) {
                    if (bm80Var instanceof sl80) {
                        sl80 sl80Var = (sl80) bm80Var;
                        l2k0Var.p.b(sl80Var.b, new fzi0((Object) ik5Var, (Object) l2k0Var, (Object) sl80Var, (byte) 26));
                    } else {
                        if (!(bm80Var instanceof vl80)) {
                            obj2 = null;
                            if (bm80Var instanceof yl80) {
                                yl80 yl80Var = (yl80) bm80Var;
                                List list = yl80Var.f42828a;
                                int iOrdinal = yl80Var.b.ordinal();
                                if (iOrdinal != 0) {
                                    if (iOrdinal == 1) {
                                        p7m0 p7m0Var3 = ocjVar2.f25029a;
                                        do {
                                            value3 = p7m0Var3.getValue();
                                            value3.getClass();
                                            oyg0Var2.getClass();
                                        } while (!p7m0Var3.m(value3, f2k0.a((f2k0) value3, null, null, new xgs0(list, t2z.c), ui5.e, false, 0, 227)));
                                    } else if (iOrdinal == 2) {
                                        p7m0 p7m0Var4 = ocjVar2.f25029a;
                                        do {
                                            value4 = p7m0Var4.getValue();
                                            value4.getClass();
                                            oyg0Var2.getClass();
                                        } while (!p7m0Var4.m(value4, f2k0.a((f2k0) value4, null, null, null, null, true, 0, 239)));
                                    } else {
                                        t9f.b();
                                    }
                                } else if (z) {
                                    t2z t2zVar = ((hw3) ((vkr0) yoxVar.f43005a).d).f13752a.getValue() != null ? t2z.f33240a : t2z.d;
                                    p7m0 p7m0Var5 = ocjVar2.f25029a;
                                    do {
                                        value2 = p7m0Var5.getValue();
                                        value2.getClass();
                                        oyg0Var2.getClass();
                                    } while (!p7m0Var5.m(value2, f2k0.a((f2k0) value2, null, null, new xgs0(list, t2zVar), ui5.e, false, 0, 227)));
                                }
                            }
                            return obj2;
                        }
                        vl80 vl80Var = (vl80) bm80Var;
                        boolean z3 = vl80Var.b;
                        if (ik5Var != null) {
                            bby bbyVar2 = l2k0Var.G;
                            if (bbyVar2 != null) {
                                bbyVar2.cancel(null);
                            }
                            ql5 ql5Var4 = ((f2k0) l2k0Var.D()).f8816a;
                            t2z t2zVar2 = (!z3 || z || ((hw3) ((vkr0) yoxVar.f43005a).d).f13752a.getValue() != null || (ql5Var4 != null ? ql5Var4.i.a() : false)) ? t2z.f33240a : t2z.b;
                            p7m0 p7m0Var6 = ocjVar2.f25029a;
                            while (true) {
                                Object value6 = p7m0Var6.getValue();
                                value6.getClass();
                                p7m0 p7m0Var7 = p7m0Var6;
                                oyg0Var2.getClass();
                                t2z t2zVar3 = t2zVar2;
                                if (p7m0Var7.m(value6, f2k0.a((f2k0) value6, null, ik5Var, new xgs0(vl80Var.f37609a, t2zVar2), ui5.e, false, 0, 225))) {
                                    List list2 = (List) ((hw3) ((vkr0) l2k0Var.r.f15453a).d).f13752a.getValue();
                                    if (list2 == null) {
                                        list2 = iun.f15405a;
                                    }
                                    if (!z && z3 && !list2.isEmpty()) {
                                        l2k0Var.M(true, lk80.f20189a);
                                    }
                                    if (z && list2.isEmpty()) {
                                        l2k0Var.G(new d2k0(new xdk0(rek0.b, l2k0Var.x.b.a(R.string.archive_is_empty, Arrays.copyOf(new Object[0], 0)), null, null, null, null, 124)));
                                    }
                                } else {
                                    p7m0Var6 = p7m0Var7;
                                    t2zVar2 = t2zVar3;
                                }
                            }
                        }
                    }
                    return Unit.f46060a;
                }
                obj2 = null;
                t9f.b();
                return obj2;
        }
    }
}
