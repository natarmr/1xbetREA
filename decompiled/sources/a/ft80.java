package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.aggregator.impl.category.presentation.models.AggregatorProvidersFiltersUiModel;

/* JADX INFO: loaded from: classes3.dex */
public final class ft80 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ jt80 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ft80(jt80 jt80Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = jt80Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        jt80 jt80Var = this.k;
        switch (b) {
            case 0:
                return new ft80(jt80Var, yjeVar, (byte) 0);
            case 1:
                return new ft80(jt80Var, yjeVar, (byte) 1);
            case 2:
                return new ft80(jt80Var, yjeVar, (byte) 2);
            case 3:
                ft80 ft80Var = new ft80(jt80Var, yjeVar, (byte) 3);
                ft80Var.j = ((Boolean) obj).booleanValue();
                return ft80Var;
            case 4:
                ft80 ft80Var2 = new ft80(jt80Var, yjeVar, (byte) 4);
                ft80Var2.j = ((Boolean) obj).booleanValue();
                return ft80Var2;
            default:
                return new ft80(jt80Var, yjeVar, (byte) 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((ft80) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((ft80) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((ft80) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((ft80) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((ft80) create(bool2, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((ft80) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:62:0x0164  */
    /* JADX WARN: Code duplicated, block: B:64:0x0172  */
    /* JADX WARN: Code duplicated, block: B:71:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:73:0x01f4  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        k7k k7kVar;
        String str;
        p7m0 p7m0Var;
        Object value;
        r3q r3qVar;
        p7m0 p7m0Var2;
        Object value2;
        p7m0 p7m0Var3;
        Object value3;
        Object value4;
        byte b = this.i;
        jt80 jt80Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    wk30 wk30Var = new wk30(jt80Var.O.f2901a.b.d, (byte) 11);
                    this.j = true;
                    if (ntb.K(wk30Var, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i = jt80.s0;
                jt80Var.V();
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    kb0 kb0Var = jt80Var.R;
                    String str2 = jt80Var.b0;
                    str2.getClass();
                    long j = jt80Var.o;
                    if (j == nw80.b.getId()) {
                        k7kVar = k7k.AggregatorSlots;
                    } else {
                        k7kVar = j == nw80.f24223a.getId() ? k7k.AggregatorLive : k7k.UNKNOWN;
                    }
                    db0 db0Var = new db0(str2, k7kVar, jt80Var.a0.g());
                    this.j = true;
                    kb0Var.getClass();
                    if (kb0Var.o(db0Var, this) == wneVar2) {
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
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    kb0 kb0Var2 = jt80Var.R;
                    String str3 = jt80Var.b0;
                    str3.getClass();
                    long j2 = jt80Var.o;
                    if (j2 == nw80.b.getId()) {
                        str = "aggregator_slots";
                    } else {
                        str = j2 == nw80.f24223a.getId() ? "aggregator_live" : "";
                    }
                    cb0 cb0Var = new cb0(str3, str);
                    this.j = true;
                    kb0Var2.getClass();
                    if (kb0Var2.o(cb0Var, this) == wneVar3) {
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
            case 3:
                boolean z4 = this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                oyg0 oyg0Var = jt80Var.f;
                ocj ocjVar = jt80Var.i;
                if (jt80Var.n0 == null || ((rs80) jt80Var.D()).r.isEmpty() || jt80Var.m0.equals(AggregatorProvidersFiltersUiModel.d)) {
                    jt80Var.X();
                    if (((rs80) jt80Var.D()).t instanceof nr80) {
                        jt80Var.V();
                    }
                    if (((rs80) jt80Var.D()).f) {
                        p7m0Var = ocjVar.f25029a;
                        do {
                            value = p7m0Var.getValue();
                            value.getClass();
                            oyg0Var.getClass();
                        } while (!p7m0Var.m(value, rs80.a((rs80) value, false, false, false, false, false, false, false, null, null, null, null, null, null, null, vr80.f37887a, null, null, false, null, 130023423)));
                        ap0 ap0Var = jt80Var.x.f41210a.b;
                        ap0Var.f1227a.clear();
                        ap0Var.c = null;
                        jt80Var.s.f41210a.b.d = false;
                        fuu fuuVar = jt80Var.D;
                        long j3 = jt80Var.o;
                        iun iunVar = iun.f15405a;
                        iunVar.getClass();
                        fuuVar.getClass();
                        fuuVar.f10183a.b.a(j3, iunVar);
                        r3qVar = jt80Var.n0;
                        if (r3qVar != null) {
                            if (((rs80) jt80Var.D()).r.isEmpty()) {
                                p7m0Var3 = ocjVar.f25029a;
                                do {
                                    value3 = p7m0Var3.getValue();
                                    value3.getClass();
                                    oyg0Var.getClass();
                                } while (!p7m0Var3.m(value3, rs80.a((rs80) value3, true, false, false, false, false, false, false, null, null, null, null, null, null, null, null, null, null, false, null, 134217720)));
                            }
                            p7m0Var2 = ocjVar.f25029a;
                            do {
                                value2 = p7m0Var2.getValue();
                                value2.getClass();
                                oyg0Var.getClass();
                            } while (!p7m0Var2.m(value2, rs80.a((rs80) value2, false, false, false, false, false, false, true, null, null, null, null, null, null, null, null, null, null, false, null, 134217663)));
                            jt80Var.Y(((rs80) jt80Var.D()).q, r3qVar);
                        }
                    } else if (jt80Var.n0 != null) {
                        jt80Var.Z();
                    }
                } else {
                    r3q r3qVar2 = jt80Var.n0;
                    List list = r3qVar2 != null ? r3qVar2.b : null;
                    if (list == null) {
                        list = iun.f15405a;
                    }
                    if (list.isEmpty()) {
                        r3q r3qVar3 = jt80Var.n0;
                        List list2 = r3qVar3 != null ? r3qVar3.c : null;
                        if (list2 == null) {
                            list2 = iun.f15405a;
                        }
                        if (!list2.isEmpty() || z4) {
                            jt80Var.X();
                            if (((rs80) jt80Var.D()).t instanceof nr80) {
                                jt80Var.V();
                            }
                            if (((rs80) jt80Var.D()).f) {
                                p7m0Var = ocjVar.f25029a;
                                do {
                                    value = p7m0Var.getValue();
                                    value.getClass();
                                    oyg0Var.getClass();
                                } while (!p7m0Var.m(value, rs80.a((rs80) value, false, false, false, false, false, false, false, null, null, null, null, null, null, null, vr80.f37887a, null, null, false, null, 130023423)));
                                ap0 ap0Var2 = jt80Var.x.f41210a.b;
                                ap0Var2.f1227a.clear();
                                ap0Var2.c = null;
                                jt80Var.s.f41210a.b.d = false;
                                fuu fuuVar2 = jt80Var.D;
                                long j4 = jt80Var.o;
                                iun iunVar2 = iun.f15405a;
                                iunVar2.getClass();
                                fuuVar2.getClass();
                                fuuVar2.f10183a.b.a(j4, iunVar2);
                                r3qVar = jt80Var.n0;
                                if (r3qVar != null) {
                                    if (((rs80) jt80Var.D()).r.isEmpty()) {
                                        p7m0Var3 = ocjVar.f25029a;
                                        do {
                                            value3 = p7m0Var3.getValue();
                                            value3.getClass();
                                            oyg0Var.getClass();
                                        } while (!p7m0Var3.m(value3, rs80.a((rs80) value3, true, false, false, false, false, false, false, null, null, null, null, null, null, null, null, null, null, false, null, 134217720)));
                                    }
                                    p7m0Var2 = ocjVar.f25029a;
                                    do {
                                        value2 = p7m0Var2.getValue();
                                        value2.getClass();
                                        oyg0Var.getClass();
                                    } while (!p7m0Var2.m(value2, rs80.a((rs80) value2, false, false, false, false, false, false, true, null, null, null, null, null, null, null, null, null, null, false, null, 134217663)));
                                    jt80Var.Y(((rs80) jt80Var.D()).q, r3qVar);
                                }
                            } else if (jt80Var.n0 != null) {
                                jt80Var.Z();
                            }
                        }
                    } else {
                        jt80Var.X();
                        if (((rs80) jt80Var.D()).t instanceof nr80) {
                            jt80Var.V();
                        }
                        if (((rs80) jt80Var.D()).f) {
                            p7m0Var = ocjVar.f25029a;
                            do {
                                value = p7m0Var.getValue();
                                value.getClass();
                                oyg0Var.getClass();
                            } while (!p7m0Var.m(value, rs80.a((rs80) value, false, false, false, false, false, false, false, null, null, null, null, null, null, null, vr80.f37887a, null, null, false, null, 130023423)));
                            ap0 ap0Var3 = jt80Var.x.f41210a.b;
                            ap0Var3.f1227a.clear();
                            ap0Var3.c = null;
                            jt80Var.s.f41210a.b.d = false;
                            fuu fuuVar3 = jt80Var.D;
                            long j5 = jt80Var.o;
                            iun iunVar3 = iun.f15405a;
                            iunVar3.getClass();
                            fuuVar3.getClass();
                            fuuVar3.f10183a.b.a(j5, iunVar3);
                            r3qVar = jt80Var.n0;
                            if (r3qVar != null) {
                                if (((rs80) jt80Var.D()).r.isEmpty()) {
                                    p7m0Var3 = ocjVar.f25029a;
                                    do {
                                        value3 = p7m0Var3.getValue();
                                        value3.getClass();
                                        oyg0Var.getClass();
                                    } while (!p7m0Var3.m(value3, rs80.a((rs80) value3, true, false, false, false, false, false, false, null, null, null, null, null, null, null, null, null, null, false, null, 134217720)));
                                }
                                p7m0Var2 = ocjVar.f25029a;
                                do {
                                    value2 = p7m0Var2.getValue();
                                    value2.getClass();
                                    oyg0Var.getClass();
                                } while (!p7m0Var2.m(value2, rs80.a((rs80) value2, false, false, false, false, false, false, true, null, null, null, null, null, null, null, null, null, null, false, null, 134217663)));
                                jt80Var.Y(((rs80) jt80Var.D()).q, r3qVar);
                            }
                        } else if (jt80Var.n0 != null) {
                            jt80Var.Z();
                        }
                    }
                }
                return Unit.f46060a;
            case 4:
                boolean z5 = this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                if (!((rs80) jt80Var.D()).e && z5) {
                    if (jt80Var.q0) {
                        if (((rs80) jt80Var.D()).t instanceof nr80) {
                            jt80Var.V();
                        }
                        jt80Var.X();
                    } else {
                        jt80Var.c0();
                    }
                }
                p7m0 p7m0Var4 = jt80Var.i.f25029a;
                do {
                    value4 = p7m0Var4.getValue();
                    value4.getClass();
                } while (!p7m0Var4.m(value4, rs80.a((rs80) value4, false, false, false, false, z5, false, false, null, null, null, null, null, null, null, null, null, null, false, null, 134217711)));
                return Unit.f46060a;
            default:
                wne wneVar6 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    kd30 kd30Var = jt80Var.Y;
                    this.j = true;
                    if (kd30Var.N() == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
