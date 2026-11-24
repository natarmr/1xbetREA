package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class oz20 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ uz20 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oz20(uz20 uz20Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = uz20Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        uz20 uz20Var = this.k;
        switch (b) {
            case 0:
                oz20 oz20Var = new oz20(uz20Var, yjeVar, (byte) 0);
                oz20Var.j = obj;
                return oz20Var;
            case 1:
                oz20 oz20Var2 = new oz20(uz20Var, yjeVar, (byte) 1);
                oz20Var2.j = obj;
                return oz20Var2;
            default:
                oz20 oz20Var3 = new oz20(uz20Var, yjeVar, (byte) 2);
                oz20Var3.j = obj;
                return oz20Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((oz20) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((oz20) create((px7) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((oz20) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x007c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0174  */
    /* JADX WARN: Code duplicated, block: B:66:0x017e  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ba  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        js20 js20Var;
        js20 js20Var2;
        p7m0 p7m0Var;
        Object value;
        p7m0 p7m0Var2;
        Object value2;
        dz20 dz20VarA;
        Object value3;
        xvm0 xvm0VarA;
        xvm0 xvm0Var;
        Object value4;
        Object value5;
        dz20 dz20VarA2;
        byte b = this.i;
        Object obj2 = null;
        uz20 uz20Var = this.k;
        switch (b) {
            case 0:
                ocj ocjVar = uz20Var.i;
                List list = (List) this.j;
                wne wneVar = wne.f39444a;
                ArrayList arrayListT = twn.t(obj);
                for (Object obj3 : list) {
                    if (!(((js20) obj3) instanceof hs20)) {
                        arrayListT.add(obj3);
                    }
                }
                for (Object obj4 : arrayListT) {
                    long jA = ((js20) obj4).a();
                    Long l = ((dz20) uz20Var.D()).c;
                    if (l != null && jA == l.longValue()) {
                        obj2 = obj4;
                        js20Var = (js20) obj2;
                        if (js20Var == null) {
                            js20Var = (js20) CollectionsKt.firstOrNull(arrayListT);
                        }
                        js20Var2 = js20Var;
                        if (js20Var2 != null) {
                            j1u j1uVar = uz20Var.r;
                            j1uVar.getClass();
                            j1uVar.f15754a.a(js20Var2);
                            p7m0Var2 = ocjVar.f25029a;
                            do {
                                value2 = p7m0Var2.getValue();
                                value2.getClass();
                                dz20VarA = dz20.a((dz20) value2, list, js20Var2, Long.valueOf(js20Var2.a()), null, null, null, false, null, null, null, false, 2040);
                                uz20Var.o.e("KEY_CURRENT_CATEGORY_ID", dz20VarA.c);
                            } while (!p7m0Var2.m(value2, dz20VarA));
                        } else {
                            int i = uz20.R;
                            p7m0Var = ocjVar.f25029a;
                            do {
                                value = p7m0Var.getValue();
                                value.getClass();
                            } while (!p7m0Var.m(value, dz20.a((dz20) value, null, null, null, null, null, null, false, null, null, null, false, 2047)));
                        }
                        break;
                    }
                }
                js20Var = (js20) obj2;
                if (js20Var == null) {
                    js20Var = (js20) CollectionsKt.firstOrNull(arrayListT);
                }
                js20Var2 = js20Var;
                if (js20Var2 != null) {
                    j1u j1uVar2 = uz20Var.r;
                    j1uVar2.getClass();
                    j1uVar2.f15754a.a(js20Var2);
                    p7m0Var2 = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var2.getValue();
                        value2.getClass();
                        dz20VarA = dz20.a((dz20) value2, list, js20Var2, Long.valueOf(js20Var2.a()), null, null, null, false, null, null, null, false, 2040);
                        uz20Var.o.e("KEY_CURRENT_CATEGORY_ID", dz20VarA.c);
                    } while (!p7m0Var2.m(value2, dz20VarA));
                } else {
                    int i2 = uz20.R;
                    p7m0Var = ocjVar.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                    } while (!p7m0Var.m(value, dz20.a((dz20) value, null, null, null, null, null, null, false, null, null, null, false, 2047)));
                }
                break;
            case 1:
                px7 px7Var = (px7) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i3 = uz20.R;
                p7m0 p7m0Var3 = uz20Var.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                } while (!p7m0Var3.m(value3, dz20.a((dz20) value3, null, null, null, null, null, null, false, null, px7Var, null, false, 3583)));
                break;
            default:
                ocj ocjVar2 = uz20Var.i;
                List list2 = (List) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                try {
                    xvm0VarA = uz20Var.w.f31473a.b.a();
                } catch (ef5 unused) {
                    xvm0VarA = null;
                }
                if (xvm0VarA == null) {
                    for (Object obj5 : list2) {
                        long id = ((xvm0) obj5).getId();
                        Long l2 = ((dz20) uz20Var.D()).e;
                        if (l2 != null && id == l2.longValue()) {
                            obj2 = obj5;
                            xvm0Var = (xvm0) obj2;
                            if (xvm0Var == null) {
                                xvm0Var = (xvm0) CollectionsKt.firstOrNull(list2);
                            }
                        }
                    }
                    xvm0Var = (xvm0) obj2;
                    if (xvm0Var == null) {
                        xvm0Var = (xvm0) CollectionsKt.firstOrNull(list2);
                    }
                } else {
                    for (Object obj6 : list2) {
                        if (((xvm0) obj6).getId() == xvm0VarA.getId()) {
                            obj2 = obj6;
                            xvm0Var = (xvm0) obj2;
                            if (xvm0Var == null) {
                                xvm0Var = (xvm0) CollectionsKt.firstOrNull(list2);
                            }
                        }
                    }
                    xvm0Var = (xvm0) obj2;
                    if (xvm0Var == null) {
                        xvm0Var = (xvm0) CollectionsKt.firstOrNull(list2);
                    }
                }
                xvm0 xvm0Var2 = xvm0Var;
                if (xvm0Var2 != null) {
                    s1u s1uVar = uz20Var.s;
                    s1uVar.getClass();
                    kym0 kym0Var = s1uVar.f31473a;
                    kym0Var.getClass();
                    kym0Var.b.b(xvm0Var2);
                    p7m0 p7m0Var4 = ocjVar2.f25029a;
                    do {
                        value5 = p7m0Var4.getValue();
                        value5.getClass();
                        dz20VarA2 = dz20.a((dz20) value5, null, null, null, list2, Long.valueOf(xvm0Var2.getId()), xvm0Var2, false, null, null, null, false, 4039);
                        uz20Var.o.e("KEY_CURRENT_SUB_GAME_ID", dz20VarA2.e);
                    } while (!p7m0Var4.m(value5, dz20VarA2));
                } else {
                    int i4 = uz20.R;
                    p7m0 p7m0Var5 = ocjVar2.f25029a;
                    do {
                        value4 = p7m0Var5.getValue();
                        value4.getClass();
                    } while (!p7m0Var5.m(value4, dz20.a((dz20) value4, null, null, null, list2, null, null, false, null, null, null, false, 4087)));
                }
                break;
        }
        return Unit.f46060a;
    }
}
