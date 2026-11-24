package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class nr30 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23984a;
    public final /* synthetic */ kmq b;

    public nr30(kmq kmqVar, j910 j910Var) {
        this.f23984a = (byte) 22;
        this.b = kmqVar;
    }

    /* JADX WARN: Code duplicated, block: B:118:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:138:0x0219  */
    /* JADX WARN: Code duplicated, block: B:159:0x0263  */
    /* JADX WARN: Code duplicated, block: B:180:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:196:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:212:0x032c  */
    /* JADX WARN: Code duplicated, block: B:228:0x036a  */
    /* JADX WARN: Code duplicated, block: B:244:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:260:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:27:0x0062  */
    /* JADX WARN: Code duplicated, block: B:280:0x043e  */
    /* JADX WARN: Code duplicated, block: B:296:0x047b  */
    /* JADX WARN: Code duplicated, block: B:312:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:330:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:346:0x053a  */
    /* JADX WARN: Code duplicated, block: B:366:0x0595  */
    /* JADX WARN: Code duplicated, block: B:386:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:406:0x064b  */
    /* JADX WARN: Code duplicated, block: B:426:0x06a6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:442:0x06e4  */
    /* JADX WARN: Code duplicated, block: B:460:0x0720  */
    /* JADX WARN: Code duplicated, block: B:476:0x076c  */
    /* JADX WARN: Code duplicated, block: B:494:0x07ad  */
    /* JADX WARN: Code duplicated, block: B:512:0x07e9  */
    /* JADX WARN: Code duplicated, block: B:534:0x0854  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:75:0x011f  */
    /* JADX WARN: Code duplicated, block: B:91:0x015e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0021  */
    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) throws l52 {
        mr30 mr30Var;
        x240 x240Var;
        c340 c340Var;
        ha40 ha40Var;
        zf40 zf40Var;
        dj40 dj40Var;
        vk40 vk40Var;
        i550 i550Var;
        k550 k550Var;
        d750 d750Var;
        f750 f750Var;
        y950 y950Var;
        lb50 lb50Var;
        t060 t060Var;
        j260 j260Var;
        l260 l260Var;
        x260 x260Var;
        ka60 ka60Var;
        oa60 oa60Var;
        nb60 nb60Var;
        tb60 tb60Var;
        wb60 wb60Var;
        yb60 yb60Var;
        ic60 ic60Var;
        qc60 qc60Var;
        Object s1d0Var;
        uc60 uc60Var;
        wc60 wc60Var;
        zc60 zc60Var;
        bd60 bd60Var;
        hd60 hd60Var;
        byte b = this.f23984a;
        boolean z = false;
        kmq kmqVar = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof mr30) {
                    mr30Var = (mr30) yjeVar;
                    int i = mr30Var.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        mr30Var.j = i - Integer.MIN_VALUE;
                    } else {
                        mr30Var = new mr30(this, yjeVar);
                    }
                } else {
                    mr30Var = new mr30(this, yjeVar);
                }
                Object obj2 = mr30Var.i;
                wne wneVar = wne.f39444a;
                int i2 = mr30Var.j;
                if (i2 == 0) {
                    z1x.P(obj2);
                    Pair pair = (Pair) obj;
                    Object obj3 = pair != null ? pair.f46059a : null;
                    mr30Var.j = 1;
                    if (kmqVar.a(obj3, mr30Var) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (i2 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj2);
                }
                return Unit.f46060a;
            case 1:
                if (yjeVar instanceof x240) {
                    x240Var = (x240) yjeVar;
                    int i3 = x240Var.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        x240Var.j = i3 - Integer.MIN_VALUE;
                    } else {
                        x240Var = new x240(this, yjeVar);
                    }
                } else {
                    x240Var = new x240(this, yjeVar);
                }
                Object obj4 = x240Var.i;
                wne wneVar2 = wne.f39444a;
                int i4 = x240Var.j;
                if (i4 == 0) {
                    z1x.P(obj4);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : ((Map) obj).entrySet()) {
                        if (!((Collection) entry.getValue()).isEmpty()) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    x240Var.j = 1;
                    if (kmqVar.a(linkedHashMap, x240Var) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (i4 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj4);
                }
                return Unit.f46060a;
            case 2:
                if (yjeVar instanceof c340) {
                    c340Var = (c340) yjeVar;
                    int i5 = c340Var.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        c340Var.j = i5 - Integer.MIN_VALUE;
                    } else {
                        c340Var = new c340(this, yjeVar);
                    }
                } else {
                    c340Var = new c340(this, yjeVar);
                }
                Object obj5 = c340Var.i;
                wne wneVar3 = wne.f39444a;
                int i6 = c340Var.j;
                if (i6 == 0) {
                    z1x.P(obj5);
                    if (obj instanceof ab50) {
                        c340Var.j = 1;
                        if (kmqVar.a(obj, c340Var) == wneVar3) {
                            return wneVar3;
                        }
                    }
                } else {
                    if (i6 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj5);
                }
                return Unit.f46060a;
            case 3:
                if (yjeVar instanceof ha40) {
                    ha40Var = (ha40) yjeVar;
                    int i7 = ha40Var.j;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        ha40Var.j = i7 - Integer.MIN_VALUE;
                    } else {
                        ha40Var = new ha40(this, yjeVar);
                    }
                } else {
                    ha40Var = new ha40(this, yjeVar);
                }
                Object obj6 = ha40Var.i;
                wne wneVar4 = wne.f39444a;
                int i8 = ha40Var.j;
                if (i8 == 0) {
                    z1x.P(obj6);
                    if (((Boolean) obj).booleanValue()) {
                        ha40Var.j = 1;
                        if (kmqVar.a(obj, ha40Var) == wneVar4) {
                            return wneVar4;
                        }
                    }
                } else {
                    if (i8 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj6);
                }
                return Unit.f46060a;
            case 4:
                if (yjeVar instanceof zf40) {
                    zf40Var = (zf40) yjeVar;
                    int i9 = zf40Var.j;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        zf40Var.j = i9 - Integer.MIN_VALUE;
                    } else {
                        zf40Var = new zf40(this, yjeVar);
                    }
                } else {
                    zf40Var = new zf40(this, yjeVar);
                }
                Object obj7 = zf40Var.i;
                wne wneVar5 = wne.f39444a;
                int i10 = zf40Var.j;
                if (i10 == 0) {
                    z1x.P(obj7);
                    m2c0 m2c0Var = (m2c0) obj;
                    Pair pair2 = new Pair(new Long(m2c0Var.S), Boolean.valueOf(m2c0Var.n0));
                    zf40Var.j = 1;
                    if (kmqVar.a(pair2, zf40Var) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (i10 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj7);
                }
                return Unit.f46060a;
            case 5:
                if (yjeVar instanceof dj40) {
                    dj40Var = (dj40) yjeVar;
                    int i11 = dj40Var.j;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        dj40Var.j = i11 - Integer.MIN_VALUE;
                    } else {
                        dj40Var = new dj40(this, yjeVar);
                    }
                } else {
                    dj40Var = new dj40(this, yjeVar);
                }
                Object obj8 = dj40Var.i;
                wne wneVar6 = wne.f39444a;
                int i12 = dj40Var.j;
                if (i12 == 0) {
                    z1x.P(obj8);
                    if (obj instanceof nel) {
                        dj40Var.j = 1;
                        if (kmqVar.a(obj, dj40Var) == wneVar6) {
                            return wneVar6;
                        }
                    }
                } else {
                    if (i12 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj8);
                }
                return Unit.f46060a;
            case 6:
                if (yjeVar instanceof vk40) {
                    vk40Var = (vk40) yjeVar;
                    int i13 = vk40Var.j;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        vk40Var.j = i13 - Integer.MIN_VALUE;
                    } else {
                        vk40Var = new vk40(this, yjeVar);
                    }
                } else {
                    vk40Var = new vk40(this, yjeVar);
                }
                Object obj9 = vk40Var.i;
                wne wneVar7 = wne.f39444a;
                int i14 = vk40Var.j;
                if (i14 == 0) {
                    z1x.P(obj9);
                    cqr cqrVarO0 = kpb.o0((bqr) obj, false);
                    vk40Var.j = 1;
                    if (kmqVar.a(cqrVarO0, vk40Var) == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (i14 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj9);
                }
                return Unit.f46060a;
            case 7:
                if (yjeVar instanceof i550) {
                    i550Var = (i550) yjeVar;
                    int i15 = i550Var.j;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        i550Var.j = i15 - Integer.MIN_VALUE;
                    } else {
                        i550Var = new i550(this, yjeVar);
                    }
                } else {
                    i550Var = new i550(this, yjeVar);
                }
                Object obj10 = i550Var.i;
                wne wneVar8 = wne.f39444a;
                int i16 = i550Var.j;
                if (i16 == 0) {
                    z1x.P(obj10);
                    List list = (List) obj;
                    ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(hew0.W((uvc) it.next()));
                    }
                    i550Var.j = 1;
                    if (kmqVar.a(arrayList, i550Var) == wneVar8) {
                        return wneVar8;
                    }
                } else {
                    if (i16 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj10);
                }
                return Unit.f46060a;
            case 8:
                if (yjeVar instanceof k550) {
                    k550Var = (k550) yjeVar;
                    int i17 = k550Var.j;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        k550Var.j = i17 - Integer.MIN_VALUE;
                    } else {
                        k550Var = new k550(this, yjeVar);
                    }
                } else {
                    k550Var = new k550(this, yjeVar);
                }
                Object obj11 = k550Var.i;
                wne wneVar9 = wne.f39444a;
                int i18 = k550Var.j;
                if (i18 == 0) {
                    z1x.P(obj11);
                    List list2 = (List) obj;
                    ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(hew0.V((kr5) it2.next()));
                    }
                    k550Var.j = 1;
                    if (kmqVar.a(arrayList2, k550Var) == wneVar9) {
                        return wneVar9;
                    }
                } else {
                    if (i18 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj11);
                }
                return Unit.f46060a;
            case 9:
                if (yjeVar instanceof d750) {
                    d750Var = (d750) yjeVar;
                    int i19 = d750Var.j;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        d750Var.j = i19 - Integer.MIN_VALUE;
                    } else {
                        d750Var = new d750(this, yjeVar);
                    }
                } else {
                    d750Var = new d750(this, yjeVar);
                }
                Object obj12 = d750Var.i;
                wne wneVar10 = wne.f39444a;
                int i20 = d750Var.j;
                if (i20 == 0) {
                    z1x.P(obj12);
                    List list3 = (List) obj;
                    ArrayList arrayList3 = new ArrayList(r3d.q(list3, 10));
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(hew0.W((uvc) it3.next()));
                    }
                    d750Var.j = 1;
                    if (kmqVar.a(arrayList3, d750Var) == wneVar10) {
                        return wneVar10;
                    }
                } else {
                    if (i20 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj12);
                }
                return Unit.f46060a;
            case 10:
                if (yjeVar instanceof f750) {
                    f750Var = (f750) yjeVar;
                    int i21 = f750Var.j;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        f750Var.j = i21 - Integer.MIN_VALUE;
                    } else {
                        f750Var = new f750(this, yjeVar);
                    }
                } else {
                    f750Var = new f750(this, yjeVar);
                }
                Object obj13 = f750Var.i;
                wne wneVar11 = wne.f39444a;
                int i22 = f750Var.j;
                if (i22 == 0) {
                    z1x.P(obj13);
                    List list4 = (List) obj;
                    ArrayList arrayList4 = new ArrayList(r3d.q(list4, 10));
                    Iterator it4 = list4.iterator();
                    while (it4.hasNext()) {
                        arrayList4.add(hew0.V((kr5) it4.next()));
                    }
                    f750Var.j = 1;
                    if (kmqVar.a(arrayList4, f750Var) == wneVar11) {
                        return wneVar11;
                    }
                } else {
                    if (i22 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj13);
                }
                return Unit.f46060a;
            case 11:
                if (yjeVar instanceof y950) {
                    y950Var = (y950) yjeVar;
                    int i23 = y950Var.j;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        y950Var.j = i23 - Integer.MIN_VALUE;
                    } else {
                        y950Var = new y950(this, yjeVar);
                    }
                } else {
                    y950Var = new y950(this, yjeVar);
                }
                Object obj14 = y950Var.i;
                wne wneVar12 = wne.f39444a;
                int i24 = y950Var.j;
                if (i24 == 0) {
                    z1x.P(obj14);
                    Boolean boolValueOf = Boolean.valueOf(((db50) obj).f5786a);
                    y950Var.j = 1;
                    if (kmqVar.a(boolValueOf, y950Var) == wneVar12) {
                        return wneVar12;
                    }
                } else {
                    if (i24 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj14);
                }
                return Unit.f46060a;
            case 12:
                if (yjeVar instanceof lb50) {
                    lb50Var = (lb50) yjeVar;
                    int i25 = lb50Var.j;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        lb50Var.j = i25 - Integer.MIN_VALUE;
                    } else {
                        lb50Var = new lb50(this, yjeVar);
                    }
                } else {
                    lb50Var = new lb50(this, yjeVar);
                }
                Object obj15 = lb50Var.i;
                wne wneVar13 = wne.f39444a;
                int i26 = lb50Var.j;
                if (i26 == 0) {
                    z1x.P(obj15);
                    if (!((Boolean) obj).booleanValue()) {
                        lb50Var.j = 1;
                        if (kmqVar.a(obj, lb50Var) == wneVar13) {
                            return wneVar13;
                        }
                    }
                } else {
                    if (i26 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj15);
                }
                return Unit.f46060a;
            case 13:
                if (yjeVar instanceof t060) {
                    t060Var = (t060) yjeVar;
                    int i27 = t060Var.j;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        t060Var.j = i27 - Integer.MIN_VALUE;
                    } else {
                        t060Var = new t060(this, yjeVar);
                    }
                } else {
                    t060Var = new t060(this, yjeVar);
                }
                Object obj16 = t060Var.i;
                wne wneVar14 = wne.f39444a;
                int i28 = t060Var.j;
                if (i28 == 0) {
                    z1x.P(obj16);
                    List list5 = (List) ((Pair) obj).f46059a;
                    t060Var.j = 1;
                    if (kmqVar.a(list5, t060Var) == wneVar14) {
                        return wneVar14;
                    }
                } else {
                    if (i28 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj16);
                }
                return Unit.f46060a;
            case 14:
                if (yjeVar instanceof j260) {
                    j260Var = (j260) yjeVar;
                    int i29 = j260Var.j;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        j260Var.j = i29 - Integer.MIN_VALUE;
                    } else {
                        j260Var = new j260(this, yjeVar);
                    }
                } else {
                    j260Var = new j260(this, yjeVar);
                }
                Object obj17 = j260Var.i;
                wne wneVar15 = wne.f39444a;
                int i30 = j260Var.j;
                if (i30 == 0) {
                    z1x.P(obj17);
                    kz50 kz50Var = new kz50(obj);
                    j260Var.j = 1;
                    if (kmqVar.a(kz50Var, j260Var) == wneVar15) {
                        return wneVar15;
                    }
                } else {
                    if (i30 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj17);
                }
                return Unit.f46060a;
            case 15:
                if (yjeVar instanceof l260) {
                    l260Var = (l260) yjeVar;
                    int i31 = l260Var.j;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        l260Var.j = i31 - Integer.MIN_VALUE;
                    } else {
                        l260Var = new l260(this, yjeVar);
                    }
                } else {
                    l260Var = new l260(this, yjeVar);
                }
                Object obj18 = l260Var.i;
                wne wneVar16 = wne.f39444a;
                int i32 = l260Var.j;
                if (i32 == 0) {
                    z1x.P(obj18);
                    o8p o8pVar = (o8p) obj;
                    if (o8pVar.e) {
                        throw new l52();
                    }
                    List listA0 = CollectionsKt.A0(CollectionsKt.q0(o8pVar.f24842a, o8pVar.b), new lk30((byte) 12));
                    l260Var.j = 1;
                    if (kmqVar.a(listA0, l260Var) == wneVar16) {
                        return wneVar16;
                    }
                } else {
                    if (i32 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj18);
                }
                return Unit.f46060a;
            case 16:
                if (yjeVar instanceof x260) {
                    x260Var = (x260) yjeVar;
                    int i33 = x260Var.j;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        x260Var.j = i33 - Integer.MIN_VALUE;
                    } else {
                        x260Var = new x260(this, yjeVar);
                    }
                } else {
                    x260Var = new x260(this, yjeVar);
                }
                Object obj19 = x260Var.i;
                wne wneVar17 = wne.f39444a;
                int i34 = x260Var.j;
                if (i34 == 0) {
                    z1x.P(obj19);
                    sz50 sz50Var = new sz50((List) obj);
                    x260Var.j = 1;
                    if (kmqVar.a(sz50Var, x260Var) == wneVar17) {
                        return wneVar17;
                    }
                } else {
                    if (i34 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj19);
                }
                return Unit.f46060a;
            case 17:
                if (yjeVar instanceof ka60) {
                    ka60Var = (ka60) yjeVar;
                    int i35 = ka60Var.j;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        ka60Var.j = i35 - Integer.MIN_VALUE;
                    } else {
                        ka60Var = new ka60(this, yjeVar);
                    }
                } else {
                    ka60Var = new ka60(this, yjeVar);
                }
                Object obj20 = ka60Var.i;
                wne wneVar18 = wne.f39444a;
                int i36 = ka60Var.j;
                if (i36 == 0) {
                    z1x.P(obj20);
                    List list6 = (List) ((Pair) obj).b;
                    ka60Var.j = 1;
                    if (kmqVar.a(list6, ka60Var) == wneVar18) {
                        return wneVar18;
                    }
                } else {
                    if (i36 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj20);
                }
                return Unit.f46060a;
            case 18:
                if (yjeVar instanceof oa60) {
                    oa60Var = (oa60) yjeVar;
                    int i37 = oa60Var.j;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        oa60Var.j = i37 - Integer.MIN_VALUE;
                    } else {
                        oa60Var = new oa60(this, yjeVar);
                    }
                } else {
                    oa60Var = new oa60(this, yjeVar);
                }
                Object obj21 = oa60Var.i;
                wne wneVar19 = wne.f39444a;
                int i38 = oa60Var.j;
                if (i38 == 0) {
                    z1x.P(obj21);
                    List list7 = (List) ((Pair) obj).b;
                    oa60Var.j = 1;
                    if (kmqVar.a(list7, oa60Var) == wneVar19) {
                        return wneVar19;
                    }
                } else {
                    if (i38 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj21);
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                if (yjeVar instanceof nb60) {
                    nb60Var = (nb60) yjeVar;
                    int i39 = nb60Var.j;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        nb60Var.j = i39 - Integer.MIN_VALUE;
                    } else {
                        nb60Var = new nb60(this, yjeVar);
                    }
                } else {
                    nb60Var = new nb60(this, yjeVar);
                }
                Object obj22 = nb60Var.i;
                wne wneVar20 = wne.f39444a;
                int i40 = nb60Var.j;
                if (i40 == 0) {
                    z1x.P(obj22);
                    List listA1 = CollectionsKt.A0((List) obj, new lk30((byte) 13));
                    nb60Var.j = 1;
                    if (kmqVar.a(listA1, nb60Var) == wneVar20) {
                        return wneVar20;
                    }
                } else {
                    if (i40 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj22);
                }
                return Unit.f46060a;
            case 20:
                if (yjeVar instanceof tb60) {
                    tb60Var = (tb60) yjeVar;
                    int i41 = tb60Var.j;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        tb60Var.j = i41 - Integer.MIN_VALUE;
                    } else {
                        tb60Var = new tb60(this, yjeVar);
                    }
                } else {
                    tb60Var = new tb60(this, yjeVar);
                }
                Object obj23 = tb60Var.i;
                wne wneVar21 = wne.f39444a;
                int i42 = tb60Var.j;
                if (i42 == 0) {
                    z1x.P(obj23);
                    qb60 qb60Var = new qb60((List) obj);
                    tb60Var.j = 1;
                    if (kmqVar.a(qb60Var, tb60Var) == wneVar21) {
                        return wneVar21;
                    }
                } else {
                    if (i42 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj23);
                }
                return Unit.f46060a;
            case 21:
                if (yjeVar instanceof wb60) {
                    wb60Var = (wb60) yjeVar;
                    int i43 = wb60Var.j;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        wb60Var.j = i43 - Integer.MIN_VALUE;
                    } else {
                        wb60Var = new wb60(this, yjeVar);
                    }
                } else {
                    wb60Var = new wb60(this, yjeVar);
                }
                Object obj24 = wb60Var.i;
                wne wneVar22 = wne.f39444a;
                int i44 = wb60Var.j;
                if (i44 == 0) {
                    z1x.P(obj24);
                    yws ywsVar = (yws) obj;
                    if (ywsVar != null && ywsVar.c) {
                        z = true;
                    }
                    Boolean boolValueOf2 = Boolean.valueOf(z);
                    wb60Var.j = 1;
                    if (kmqVar.a(boolValueOf2, wb60Var) == wneVar22) {
                        return wneVar22;
                    }
                } else {
                    if (i44 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj24);
                }
                return Unit.f46060a;
            case 22:
                if (yjeVar instanceof yb60) {
                    yb60Var = (yb60) yjeVar;
                    int i45 = yb60Var.j;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        yb60Var.j = i45 - Integer.MIN_VALUE;
                    } else {
                        yb60Var = new yb60(this, yjeVar);
                    }
                } else {
                    yb60Var = new yb60(this, yjeVar);
                }
                Object obj25 = yb60Var.i;
                wne wneVar23 = wne.f39444a;
                int i46 = yb60Var.j;
                if (i46 == 0) {
                    z1x.P(obj25);
                    jlr jlrVar = (jlr) obj;
                    if (!(jlrVar instanceof xkr) || ((xkr) jlrVar).e == -26) {
                        yb60Var.j = 1;
                        if (kmqVar.a(obj, yb60Var) == wneVar23) {
                            return wneVar23;
                        }
                    }
                } else {
                    if (i46 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj25);
                }
                return Unit.f46060a;
            case 23:
                if (yjeVar instanceof ic60) {
                    ic60Var = (ic60) yjeVar;
                    int i47 = ic60Var.j;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        ic60Var.j = i47 - Integer.MIN_VALUE;
                    } else {
                        ic60Var = new ic60(this, yjeVar);
                    }
                } else {
                    ic60Var = new ic60(this, yjeVar);
                }
                Object obj26 = ic60Var.i;
                wne wneVar24 = wne.f39444a;
                int i48 = ic60Var.j;
                if (i48 == 0) {
                    z1x.P(obj26);
                    List list8 = (List) obj;
                    ArrayList arrayList5 = new ArrayList(r3d.q(list8, 10));
                    Iterator it5 = list8.iterator();
                    while (it5.hasNext()) {
                        axq.t(((ots) it5.next()).f25844a, arrayList5);
                    }
                    ic60Var.j = 1;
                    if (kmqVar.a(arrayList5, ic60Var) == wneVar24) {
                        return wneVar24;
                    }
                } else {
                    if (i48 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj26);
                }
                return Unit.f46060a;
            case 24:
                if (yjeVar instanceof qc60) {
                    qc60Var = (qc60) yjeVar;
                    int i49 = qc60Var.j;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        qc60Var.j = i49 - Integer.MIN_VALUE;
                    } else {
                        qc60Var = new qc60(this, yjeVar);
                    }
                } else {
                    qc60Var = new qc60(this, yjeVar);
                }
                Object obj27 = qc60Var.i;
                wne wneVar25 = wne.f39444a;
                int i50 = qc60Var.j;
                if (i50 == 0) {
                    z1x.P(obj27);
                    o1d0 o1d0Var = (o1d0) obj;
                    if (o1d0Var instanceof m1d0) {
                        m1d0 m1d0Var = (m1d0) o1d0Var;
                        Long l = m1d0Var.b;
                        Long l2 = m1d0Var.c;
                        s1d0Var = (l == null || l2 == null) ? m1d0Var.d ? q1d0.f27948a : r1d0.f29674a : new s1d0(l.longValue(), l2.longValue());
                    } else {
                        s1d0Var = p1d0.f26196a;
                    }
                    qc60Var.j = 1;
                    if (kmqVar.a(s1d0Var, qc60Var) == wneVar25) {
                        return wneVar25;
                    }
                } else {
                    if (i50 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj27);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                if (yjeVar instanceof uc60) {
                    uc60Var = (uc60) yjeVar;
                    int i51 = uc60Var.j;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        uc60Var.j = i51 - Integer.MIN_VALUE;
                    } else {
                        uc60Var = new uc60(this, yjeVar);
                    }
                } else {
                    uc60Var = new uc60(this, yjeVar);
                }
                Object obj28 = uc60Var.i;
                wne wneVar26 = wne.f39444a;
                int i52 = uc60Var.j;
                if (i52 == 0) {
                    z1x.P(obj28);
                    j0g0 j0g0Var = new j0g0((List) obj);
                    uc60Var.j = 1;
                    if (kmqVar.a(j0g0Var, uc60Var) == wneVar26) {
                        return wneVar26;
                    }
                } else {
                    if (i52 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj28);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                if (yjeVar instanceof wc60) {
                    wc60Var = (wc60) yjeVar;
                    int i53 = wc60Var.j;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        wc60Var.j = i53 - Integer.MIN_VALUE;
                    } else {
                        wc60Var = new wc60(this, yjeVar);
                    }
                } else {
                    wc60Var = new wc60(this, yjeVar);
                }
                Object obj29 = wc60Var.i;
                wne wneVar27 = wne.f39444a;
                int i54 = wc60Var.j;
                if (i54 == 0) {
                    z1x.P(obj29);
                    j0g0 j0g0Var2 = new j0g0((List) obj);
                    wc60Var.j = 1;
                    if (kmqVar.a(j0g0Var2, wc60Var) == wneVar27) {
                        return wneVar27;
                    }
                } else {
                    if (i54 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj29);
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                if (yjeVar instanceof zc60) {
                    zc60Var = (zc60) yjeVar;
                    int i55 = zc60Var.j;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        zc60Var.j = i55 - Integer.MIN_VALUE;
                    } else {
                        zc60Var = new zc60(this, yjeVar);
                    }
                } else {
                    zc60Var = new zc60(this, yjeVar);
                }
                Object obj30 = zc60Var.i;
                wne wneVar28 = wne.f39444a;
                int i56 = zc60Var.j;
                if (i56 == 0) {
                    z1x.P(obj30);
                    j0g0 j0g0Var3 = new j0g0((List) obj);
                    zc60Var.j = 1;
                    if (kmqVar.a(j0g0Var3, zc60Var) == wneVar28) {
                        return wneVar28;
                    }
                } else {
                    if (i56 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj30);
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                if (yjeVar instanceof bd60) {
                    bd60Var = (bd60) yjeVar;
                    int i57 = bd60Var.j;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        bd60Var.j = i57 - Integer.MIN_VALUE;
                    } else {
                        bd60Var = new bd60(this, yjeVar);
                    }
                } else {
                    bd60Var = new bd60(this, yjeVar);
                }
                Object obj31 = bd60Var.i;
                wne wneVar29 = wne.f39444a;
                int i58 = bd60Var.j;
                if (i58 == 0) {
                    z1x.P(obj31);
                    j0g0 j0g0Var4 = new j0g0((List) obj);
                    bd60Var.j = 1;
                    if (kmqVar.a(j0g0Var4, bd60Var) == wneVar29) {
                        return wneVar29;
                    }
                } else {
                    if (i58 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj31);
                }
                return Unit.f46060a;
            default:
                if (yjeVar instanceof hd60) {
                    hd60Var = (hd60) yjeVar;
                    int i59 = hd60Var.j;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        hd60Var.j = i59 - Integer.MIN_VALUE;
                    } else {
                        hd60Var = new hd60(this, yjeVar);
                    }
                } else {
                    hd60Var = new hd60(this, yjeVar);
                }
                Object obj32 = hd60Var.i;
                wne wneVar30 = wne.f39444a;
                int i60 = hd60Var.j;
                if (i60 == 0) {
                    z1x.P(obj32);
                    if (!((List) obj).isEmpty()) {
                        hd60Var.j = 1;
                        if (kmqVar.a(obj, hd60Var) == wneVar30) {
                            return wneVar30;
                        }
                    }
                } else {
                    if (i60 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj32);
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ nr30(kmq kmqVar, byte b) {
        this.f23984a = b;
        this.b = kmqVar;
    }
}
