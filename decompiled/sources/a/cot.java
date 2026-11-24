package a;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class cot extends bnn0 implements zdr {
    public final /* synthetic */ byte i;
    public /* synthetic */ List j;
    public /* synthetic */ Object k;
    public /* synthetic */ Object l;
    public /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cot(int i, yje yjeVar, byte b) {
        super(i, yjeVar);
        this.i = b;
    }

    @Override // a.zdr
    public final Object O(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i = 5;
        switch (this.i) {
            case 0:
                cot cotVar = new cot(i, (yje) obj5, (byte) 0);
                cotVar.j = (List) obj;
                cotVar.k = (List) obj2;
                cotVar.l = (List) obj3;
                cotVar.m = (List) obj4;
                return cotVar.invokeSuspend(Unit.f46060a);
            default:
                cot cotVar2 = new cot(i, (yje) obj5, (byte) 1);
                cotVar2.k = (gxb) obj;
                cotVar2.j = (List) obj2;
                cotVar2.l = (Map) obj3;
                cotVar2.m = (Map) obj4;
                return cotVar2.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        a640 n540Var;
        a640 r540Var;
        switch (this.i) {
            case 0:
                List list = this.j;
                List list2 = (List) this.k;
                List list3 = (List) this.l;
                List list4 = (List) this.m;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                return CollectionsKt.q0(CollectionsKt.q0(CollectionsKt.q0(list, list2), list3), list4);
            default:
                gxb gxbVar = (gxb) this.k;
                List<a640> list5 = this.j;
                Map map = (Map) this.l;
                Map map2 = (Map) this.m;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                ArrayList arrayList = new ArrayList(r3d.q(list5, 10));
                for (a640 a640Var : list5) {
                    List list6 = gxbVar.i;
                    int iA = wp20.a(r3d.q(list6, 10));
                    if (iA < 16) {
                        iA = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                    for (Object obj2 : list6) {
                        linkedHashMap.put(((xrt0) obj2).a(), obj2);
                    }
                    int i = gxbVar.d;
                    int i2 = gxbVar.e;
                    a640Var.getClass();
                    map.getClass();
                    map2.getClass();
                    xrt0 xrt0VarE = (xrt0) linkedHashMap.get(a640Var.e().a());
                    if (xrt0VarE == null) {
                        xrt0VarE = a640Var.e();
                    }
                    xrt0 xrt0Var = xrt0VarE;
                    if (a640Var instanceof x540) {
                        x540 x540Var = (x540) a640Var;
                        x640 x640VarA = s0x.A(x540Var.c, i, i2, xrt0Var instanceof srt0);
                        int i3 = x540Var.c;
                        String str = x540Var.d;
                        ilf0 ilf0Var = x540Var.e;
                        String str2 = x540Var.g;
                        List list7 = x540Var.h;
                        List list8 = x540Var.i;
                        List list9 = x540Var.j;
                        Date date = x540Var.l;
                        xrt0Var.getClass();
                        str2.getClass();
                        list8.getClass();
                        list9.getClass();
                        date.getClass();
                        r540Var = new x540(i3, str, ilf0Var, xrt0Var, str2, list7, list8, list9, x640VarA, date);
                    } else {
                        if (a640Var instanceof w540) {
                            w540 w540Var = (w540) a640Var;
                            n540Var = new w540(w540Var.c, w540Var.d, w540Var.e, s0x.A(w540Var.c, i, i2, xrt0Var instanceof srt0), w540Var.g);
                        } else if (a640Var instanceof p540) {
                            p540 p540Var = (p540) a640Var;
                            x640 x640VarA2 = s0x.A(p540Var.c, i, i2, xrt0Var instanceof srt0);
                            List<o540> list10 = p540Var.k;
                            ArrayList arrayList2 = new ArrayList(r3d.q(list10, 10));
                            for (o540 o540Var : list10) {
                                yos0 yos0VarN = s0x.N(o540Var.d.a(), map, map2);
                                String str3 = o540Var.f24670a;
                                long j = o540Var.b;
                                String str4 = o540Var.c;
                                str3.getClass();
                                str4.getClass();
                                arrayList2.add(new o540(j, yos0VarN, str3, str4));
                            }
                            int i4 = p540Var.c;
                            ilf0 ilf0Var2 = p540Var.d;
                            String str5 = p540Var.e;
                            Date date2 = p540Var.h;
                            String str6 = p540Var.i;
                            List list11 = p540Var.j;
                            xrt0Var.getClass();
                            date2.getClass();
                            str6.getClass();
                            r540Var = new p540(i4, ilf0Var2, str5, xrt0Var, x640VarA2, date2, str6, list11, arrayList2);
                        } else {
                            if (a640Var instanceof r540) {
                                r540 r540Var2 = (r540) a640Var;
                                x640 x640VarA3 = s0x.A(r540Var2.c, i, i2, xrt0Var instanceof srt0);
                                List<q540> list12 = r540Var2.k;
                                ArrayList arrayList3 = new ArrayList(r3d.q(list12, 10));
                                for (q540 q540Var : list12) {
                                    yos0 yos0VarN2 = s0x.N(q540Var.b.a(), map, map2);
                                    String str7 = q540Var.f28132a;
                                    long j2 = q540Var.c;
                                    String str8 = q540Var.d;
                                    str7.getClass();
                                    str8.getClass();
                                    arrayList3.add(new q540(j2, yos0VarN2, str7, str8));
                                }
                                int i5 = r540Var2.c;
                                ilf0 ilf0Var3 = r540Var2.d;
                                String str9 = r540Var2.e;
                                Date date3 = r540Var2.h;
                                String str10 = r540Var2.i;
                                List list13 = r540Var2.j;
                                xrt0Var.getClass();
                                date3.getClass();
                                str10.getClass();
                                r540Var = new r540(i5, ilf0Var3, str9, xrt0Var, x640VarA3, date3, str10, list13, arrayList3);
                            } else if (a640Var instanceof n540) {
                                n540 n540Var2 = (n540) a640Var;
                                n540Var = new n540(n540Var2.c, n540Var2.d, n540Var2.e, s0x.A(n540Var2.c, i, i2, false), n540Var2.g);
                            } else if (!(a640Var instanceof y540)) {
                                t9f.b();
                                return null;
                            }
                            arrayList.add(a640Var);
                        }
                        a640Var = n540Var;
                        arrayList.add(a640Var);
                    }
                    a640Var = r540Var;
                    arrayList.add(a640Var);
                }
                return arrayList;
        }
    }
}
