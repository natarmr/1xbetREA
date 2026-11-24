package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class s7h implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31749a;
    public final /* synthetic */ kmq b;
    public final /* synthetic */ long c;

    public /* synthetic */ s7h(kmq kmqVar, long j, byte b) {
        this.f31749a = b;
        this.b = kmqVar;
        this.c = j;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x019e  */
    /* JADX WARN: Code duplicated, block: B:124:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:167:0x0313  */
    /* JADX WARN: Code duplicated, block: B:182:0x034d  */
    /* JADX WARN: Code duplicated, block: B:184:0x0356  */
    /* JADX WARN: Code duplicated, block: B:187:0x035b  */
    /* JADX WARN: Code duplicated, block: B:194:0x0372  */
    /* JADX WARN: Code duplicated, block: B:221:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:243:0x0444  */
    /* JADX WARN: Code duplicated, block: B:259:0x048a  */
    /* JADX WARN: Code duplicated, block: B:275:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:28:0x0070  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:66:0x0109  */
    /* JADX WARN: Code duplicated, block: B:84:0x0150  */
    /* JADX WARN: Code duplicated, block: B:9:0x0026  */
    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        r7h r7hVar;
        v7h v7hVar;
        x7h x7hVar;
        qno qnoVar;
        tno tnoVar;
        lrt lrtVar;
        ql5 ql5Var;
        y2z y2zVar;
        i5z i5zVar;
        l5z l5zVar;
        ha60 ha60Var;
        ma60 ma60Var;
        n7s0 n7s0Var;
        q9s0 q9s0Var;
        byte b = this.f31749a;
        long j = this.c;
        kmq kmqVar = this.b;
        int i = 1;
        Object obj2 = null;
        switch (b) {
            case 0:
                if (yjeVar instanceof r7h) {
                    r7hVar = (r7h) yjeVar;
                    int i2 = r7hVar.j;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        r7hVar.j = i2 - Integer.MIN_VALUE;
                    } else {
                        r7hVar = new r7h(this, yjeVar);
                    }
                } else {
                    r7hVar = new r7h(this, yjeVar);
                }
                Object obj3 = r7hVar.i;
                wne wneVar = wne.f39444a;
                int i3 = r7hVar.j;
                if (i3 == 0) {
                    z1x.P(obj3);
                    Pair pair = new Pair(new Long(j), (Map) obj);
                    r7hVar.j = 1;
                    if (kmqVar.a(pair, r7hVar) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (i3 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj3);
                }
                return Unit.f46060a;
            case 1:
                if (yjeVar instanceof v7h) {
                    v7hVar = (v7h) yjeVar;
                    int i4 = v7hVar.j;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        v7hVar.j = i4 - Integer.MIN_VALUE;
                    } else {
                        v7hVar = new v7h(this, yjeVar);
                    }
                } else {
                    v7hVar = new v7h(this, yjeVar);
                }
                Object obj4 = v7hVar.i;
                wne wneVar2 = wne.f39444a;
                int i5 = v7hVar.j;
                if (i5 == 0) {
                    z1x.P(obj4);
                    Pair pair2 = new Pair(new Long(j), (Set) obj);
                    v7hVar.j = 1;
                    if (kmqVar.a(pair2, v7hVar) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (i5 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj4);
                }
                return Unit.f46060a;
            case 2:
                if (yjeVar instanceof x7h) {
                    x7hVar = (x7h) yjeVar;
                    int i6 = x7hVar.j;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        x7hVar.j = i6 - Integer.MIN_VALUE;
                    } else {
                        x7hVar = new x7h(this, yjeVar);
                    }
                } else {
                    x7hVar = new x7h(this, yjeVar);
                }
                Object obj5 = x7hVar.i;
                wne wneVar3 = wne.f39444a;
                int i7 = x7hVar.j;
                if (i7 == 0) {
                    z1x.P(obj5);
                    Pair pair3 = new Pair(new Long(j), (dx7) obj);
                    x7hVar.j = 1;
                    if (kmqVar.a(pair3, x7hVar) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (i7 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj5);
                }
                return Unit.f46060a;
            case 3:
                if (yjeVar instanceof qno) {
                    qnoVar = (qno) yjeVar;
                    int i8 = qnoVar.j;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        qnoVar.j = i8 - Integer.MIN_VALUE;
                    } else {
                        qnoVar = new qno(this, yjeVar);
                    }
                } else {
                    qnoVar = new qno(this, yjeVar);
                }
                Object obj6 = qnoVar.i;
                wne wneVar4 = wne.f39444a;
                int i9 = qnoVar.j;
                if (i9 == 0) {
                    z1x.P(obj6);
                    lno lnoVar = (lno) ((Map) obj).get(new Long(j));
                    obj2 = lnoVar != null ? lnoVar.f20356a : null;
                    if (obj2 == null) {
                        obj2 = lun.f20680a;
                        obj2.getClass();
                    }
                    qnoVar.j = 1;
                    if (kmqVar.a(obj2, qnoVar) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (i9 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj6);
                }
                return Unit.f46060a;
            case 4:
                if (yjeVar instanceof tno) {
                    tnoVar = (tno) yjeVar;
                    int i10 = tnoVar.j;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        tnoVar.j = i10 - Integer.MIN_VALUE;
                    } else {
                        tnoVar = new tno(this, yjeVar);
                    }
                } else {
                    tnoVar = new tno(this, yjeVar);
                }
                Object obj7 = tnoVar.i;
                wne wneVar5 = wne.f39444a;
                int i11 = tnoVar.j;
                if (i11 == 0) {
                    z1x.P(obj7);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj8 : (Set) obj) {
                        if (((ono) obj8).f25557a == j) {
                            arrayList.add(obj8);
                        }
                    }
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        linkedHashSet.add(new Long(((ono) it.next()).b));
                    }
                    tnoVar.j = 1;
                    if (kmqVar.a(linkedHashSet, tnoVar) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (i11 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj7);
                }
                return Unit.f46060a;
            case 5:
                if (yjeVar instanceof lrt) {
                    lrtVar = (lrt) yjeVar;
                    int i12 = lrtVar.j;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        lrtVar.j = i12 - Integer.MIN_VALUE;
                    } else {
                        lrtVar = new lrt(this, yjeVar);
                    }
                } else {
                    lrtVar = new lrt(this, yjeVar);
                }
                Object obj9 = lrtVar.i;
                wne wneVar6 = wne.f39444a;
                int i13 = lrtVar.j;
                if (i13 == 0) {
                    z1x.P(obj9);
                    for (Object obj10 : (List) obj) {
                        if (((ql5) obj10).f28916a == j) {
                            obj2 = obj10;
                            ql5Var = (ql5) obj2;
                            if (ql5Var != null) {
                                throw new ss3();
                            }
                            lrtVar.j = 1;
                            if (kmqVar.a(ql5Var, lrtVar) == wneVar6) {
                                return wneVar6;
                            }
                        }
                    }
                    ql5Var = (ql5) obj2;
                    if (ql5Var != null) {
                        throw new ss3();
                    }
                    lrtVar.j = 1;
                    if (kmqVar.a(ql5Var, lrtVar) == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (i13 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj9);
                }
                return Unit.f46060a;
            case 6:
                if (yjeVar instanceof y2z) {
                    y2zVar = (y2z) yjeVar;
                    int i14 = y2zVar.j;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        y2zVar.j = i14 - Integer.MIN_VALUE;
                    } else {
                        y2zVar = new y2z(this, yjeVar);
                    }
                } else {
                    y2zVar = new y2z(this, yjeVar);
                }
                Object obj11 = y2zVar.i;
                wne wneVar7 = wne.f39444a;
                int i15 = y2zVar.j;
                if (i15 == 0) {
                    z1x.P(obj11);
                    List list = (List) obj;
                    ArrayList arrayListU = twn.u(list);
                    for (Object obj12 : list) {
                        if (((qu6) obj12).c == j) {
                            arrayListU.add(obj12);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj13 : arrayListU) {
                        if (((qu6) obj13).F.b != 0) {
                            arrayList2.add(obj13);
                        }
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Object obj14 : arrayList2) {
                        Long lValueOf = Long.valueOf(((qu6) obj14).b);
                        Object arrayList3 = linkedHashMap.get(lValueOf);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            linkedHashMap.put(lValueOf, arrayList3);
                        }
                        ((List) arrayList3).add(obj14);
                    }
                    ArrayList arrayList4 = new ArrayList(linkedHashMap.size());
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        long jLongValue = ((Number) entry.getKey()).longValue();
                        List<qu6> list2 = (List) entry.getValue();
                        ic9 ic9Var = ((qu6) CollectionsKt.U(list2)).F;
                        int i16 = ic9Var.b;
                        int i17 = ic9Var.f14524a;
                        int i18 = ic9Var.c;
                        ArrayList arrayList5 = new ArrayList(r3d.q(list2, 10));
                        for (qu6 qu6Var : list2) {
                            arrayList5.add(new fi6(qu6Var.t, qu6Var.x, qu6Var.d));
                        }
                        arrayList4.add(new lh6(jLongValue, i16, i17, i18, arrayList5));
                        i = 1;
                    }
                    y2zVar.j = i;
                    if (kmqVar.a(arrayList4, y2zVar) == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (i15 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj11);
                }
                return Unit.f46060a;
            case 7:
                if (yjeVar instanceof i5z) {
                    i5zVar = (i5z) yjeVar;
                    int i19 = i5zVar.j;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        i5zVar.j = i19 - Integer.MIN_VALUE;
                    } else {
                        i5zVar = new i5z(this, yjeVar);
                    }
                } else {
                    i5zVar = new i5z(this, yjeVar);
                }
                Object obj15 = i5zVar.i;
                wne wneVar8 = wne.f39444a;
                int i20 = i5zVar.j;
                if (i20 == 0) {
                    z1x.P(obj15);
                    x3z x3zVar = (x3z) obj;
                    Object n5zVar = x3zVar instanceof w3z ? new n5z(((w3z) x3zVar).f38520a) : new m5z(j);
                    i5zVar.j = 1;
                    if (kmqVar.a(n5zVar, i5zVar) == wneVar8) {
                        return wneVar8;
                    }
                } else {
                    if (i20 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj15);
                }
                return Unit.f46060a;
            case 8:
                if (yjeVar instanceof l5z) {
                    l5zVar = (l5z) yjeVar;
                    int i21 = l5zVar.j;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        l5zVar.j = i21 - Integer.MIN_VALUE;
                    } else {
                        l5zVar = new l5z(this, yjeVar);
                    }
                } else {
                    l5zVar = new l5z(this, yjeVar);
                }
                Object obj16 = l5zVar.i;
                wne wneVar9 = wne.f39444a;
                int i22 = l5zVar.j;
                if (i22 == 0) {
                    z1x.P(obj16);
                    b4z b4zVar = (b4z) obj;
                    Object p5zVar = b4zVar instanceof a4z ? new p5z(((a4z) b4zVar).f245a) : new o5z(j);
                    l5zVar.j = 1;
                    if (kmqVar.a(p5zVar, l5zVar) == wneVar9) {
                        return wneVar9;
                    }
                } else {
                    if (i22 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj16);
                }
                return Unit.f46060a;
            case 9:
                if (yjeVar instanceof ha60) {
                    ha60Var = (ha60) yjeVar;
                    int i23 = ha60Var.j;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        ha60Var.j = i23 - Integer.MIN_VALUE;
                    } else {
                        ha60Var = new ha60(this, yjeVar);
                    }
                } else {
                    ha60Var = new ha60(this, yjeVar);
                }
                Object obj17 = ha60Var.i;
                wne wneVar10 = wne.f39444a;
                int i24 = ha60Var.j;
                if (i24 == 0) {
                    z1x.P(obj17);
                    if (((Number) ((Pair) obj).f46059a).longValue() == j) {
                        ha60Var.j = 1;
                        if (kmqVar.a(obj, ha60Var) == wneVar10) {
                            return wneVar10;
                        }
                    }
                } else {
                    if (i24 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj17);
                }
                return Unit.f46060a;
            case 10:
                if (yjeVar instanceof ma60) {
                    ma60Var = (ma60) yjeVar;
                    int i25 = ma60Var.j;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        ma60Var.j = i25 - Integer.MIN_VALUE;
                    } else {
                        ma60Var = new ma60(this, yjeVar);
                    }
                } else {
                    ma60Var = new ma60(this, yjeVar);
                }
                Object obj18 = ma60Var.i;
                wne wneVar11 = wne.f39444a;
                int i26 = ma60Var.j;
                if (i26 == 0) {
                    z1x.P(obj18);
                    if (((Number) ((Pair) obj).f46059a).longValue() == j) {
                        ma60Var.j = 1;
                        if (kmqVar.a(obj, ma60Var) == wneVar11) {
                            return wneVar11;
                        }
                    }
                } else {
                    if (i26 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj18);
                }
                return Unit.f46060a;
            case 11:
                if (yjeVar instanceof n7s0) {
                    n7s0Var = (n7s0) yjeVar;
                    int i27 = n7s0Var.j;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        n7s0Var.j = i27 - Integer.MIN_VALUE;
                    } else {
                        n7s0Var = new n7s0(this, yjeVar);
                    }
                } else {
                    n7s0Var = new n7s0(this, yjeVar);
                }
                Object obj19 = n7s0Var.i;
                wne wneVar12 = wne.f39444a;
                int i28 = n7s0Var.j;
                if (i28 == 0) {
                    z1x.P(obj19);
                    Boolean bool = (Boolean) ((Map) obj).get(new Long(j));
                    Boolean boolValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                    n7s0Var.j = 1;
                    if (kmqVar.a(boolValueOf, n7s0Var) == wneVar12) {
                        return wneVar12;
                    }
                } else {
                    if (i28 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj19);
                }
                return Unit.f46060a;
            default:
                if (yjeVar instanceof q9s0) {
                    q9s0Var = (q9s0) yjeVar;
                    int i29 = q9s0Var.j;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        q9s0Var.j = i29 - Integer.MIN_VALUE;
                    } else {
                        q9s0Var = new q9s0(this, yjeVar);
                    }
                } else {
                    q9s0Var = new q9s0(this, yjeVar);
                }
                Object obj20 = q9s0Var.i;
                wne wneVar13 = wne.f39444a;
                int i30 = q9s0Var.j;
                if (i30 == 0) {
                    z1x.P(obj20);
                    gqt0 gqt0Var = (gqt0) ((Map) obj).get(new Long(j));
                    if (gqt0Var == null) {
                        gqt0Var = gqt0.h;
                    }
                    q9s0Var.j = 1;
                    if (kmqVar.a(gqt0Var, q9s0Var) == wneVar13) {
                        return wneVar13;
                    }
                } else {
                    if (i30 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj20);
                }
                return Unit.f46060a;
        }
    }
}
