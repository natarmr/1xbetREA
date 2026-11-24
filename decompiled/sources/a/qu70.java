package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class qu70 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ bv70 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qu70(bv70 bv70Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = bv70Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        bv70 bv70Var = this.k;
        switch (b) {
            case 0:
                qu70 qu70Var = new qu70(bv70Var, yjeVar, (byte) 0);
                qu70Var.j = obj;
                return qu70Var;
            case 1:
                qu70 qu70Var2 = new qu70(bv70Var, yjeVar, (byte) 1);
                qu70Var2.j = obj;
                return qu70Var2;
            case 2:
                qu70 qu70Var3 = new qu70(bv70Var, yjeVar, (byte) 2);
                qu70Var3.j = obj;
                return qu70Var3;
            default:
                qu70 qu70Var4 = new qu70(bv70Var, yjeVar, (byte) 3);
                qu70Var4.j = obj;
                return qu70Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((qu70) create((String) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((qu70) create((fr70) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((qu70) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((qu70) create((suy) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        hu70 hu70Var;
        Object value3;
        Object value4;
        Object value5;
        byte b = this.i;
        bv70 bv70Var = this.k;
        switch (b) {
            case 0:
                String str = (String) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = bv70.g0;
                p7m0 p7m0Var = bv70Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, hu70.a((hu70) value, 0, 0, false, false, false, false, false, false, false, false, str, false, false, false, null, false, null, null, false, 2095103)));
                return Unit.f46060a;
            case 1:
                oyg0 oyg0Var = bv70Var.f;
                ocj ocjVar = bv70Var.i;
                fr70 fr70Var = (fr70) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (fr70Var != null) {
                    if (!(fr70Var instanceof cr70)) {
                        if (fr70Var instanceof dr70) {
                            vt70 vt70Var = new vt70(true);
                            int i2 = bv70.g0;
                            bv70Var.G(vt70Var);
                        } else if (fr70Var instanceof ar70) {
                            int i3 = bv70.g0;
                            bv70Var.G(tt70.f34497a);
                            bv70Var.N();
                        } else if (fr70Var instanceof zq70) {
                            int i4 = bv70.g0;
                            bv70Var.P();
                        } else {
                            boolean z = fr70Var instanceof br70;
                            wt70 wt70Var = wt70.f39727a;
                            if (z) {
                                int i5 = bv70.g0;
                                bv70Var.P();
                                bv70Var.G(wt70Var);
                            } else if (fr70Var instanceof er70) {
                                if (((er70) fr70Var).f8267a) {
                                    int i6 = bv70.g0;
                                    p7m0 p7m0Var2 = ocjVar.f25029a;
                                    do {
                                        value2 = p7m0Var2.getValue();
                                        value2.getClass();
                                        hu70Var = (hu70) value2;
                                        oyg0Var.getClass();
                                    } while (!p7m0Var2.m(value2, hu70.a(hu70Var, 0, hu70Var.b + 1, false, false, false, false, false, false, false, false, null, false, false, false, null, false, null, null, false, 2097149)));
                                    if (((hu70) bv70Var.D()).b > bv70Var.E.f27255a.a().size()) {
                                        p7m0 p7m0Var3 = ocjVar.f25029a;
                                        do {
                                            value3 = p7m0Var3.getValue();
                                            value3.getClass();
                                            oyg0Var.getClass();
                                        } while (!p7m0Var3.m(value3, hu70.a((hu70) value3, 0, 0, false, false, false, false, false, false, false, false, null, false, false, false, null, false, null, null, false, 2097149)));
                                        bv70Var.w.a(false);
                                        bv70Var.G(new vt70(false));
                                        p7m0 p7m0Var4 = ocjVar.f25029a;
                                        do {
                                            value4 = p7m0Var4.getValue();
                                            value4.getClass();
                                            oyg0Var.getClass();
                                        } while (!p7m0Var4.m(value4, hu70.a((hu70) value4, 0, 0, false, false, false, false, false, false, false, false, null, false, false, false, null, false, null, null, false, 1048575)));
                                    } else {
                                        bv70Var.q.a();
                                        bv70Var.M();
                                    }
                                } else {
                                    int i7 = bv70.g0;
                                    bv70Var.R();
                                }
                                bv70Var.G(wt70Var);
                            }
                        }
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 2:
                List list = (List) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (list.isEmpty()) {
                    int i8 = bv70.g0;
                    bv70Var.G(xt70.f41451a);
                    p7m0 p7m0Var5 = bv70Var.i.f25029a;
                    do {
                        value5 = p7m0Var5.getValue();
                        value5.getClass();
                    } while (!p7m0Var5.m(value5, hu70.a((hu70) value5, 0, 0, false, false, false, false, false, false, false, false, null, false, false, false, null, false, iun.f15405a, null, false, 1949667)));
                } else {
                    jt50 jt50Var = new jt50(list, bv70Var, (byte) 22);
                    int i9 = bv70.g0;
                    bv70Var.H(jt50Var);
                }
                return Unit.f46060a;
            default:
                suy suyVar = (suy) this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                int i10 = bv70.g0;
                p7m0 p7m0Var6 = bv70Var.i.f25029a;
                while (true) {
                    Object value6 = p7m0Var6.getValue();
                    value6.getClass();
                    suy suyVar2 = suyVar;
                    if (p7m0Var6.m(value6, hu70.a((hu70) value6, 0, 0, false, false, false, false, false, false, false, false, null, false, false, false, null, false, null, suyVar, false, 1572863))) {
                        if (suyVar2.e && suyVar2.c != 0) {
                            bv70Var.Q();
                        }
                        return Unit.f46060a;
                    }
                    suyVar = suyVar2;
                }
                break;
        }
    }
}
