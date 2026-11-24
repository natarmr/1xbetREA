package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.special_event.impl.alleventsgames.presentation.AllEventGamesScreenParams;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class s32 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31534a;
    public final /* synthetic */ org.xplatform.special_event.impl.alleventsgames.presentation.f b;

    public /* synthetic */ s32(org.xplatform.special_event.impl.alleventsgames.presentation.f fVar, byte b) {
        this.f31534a = b;
        this.b = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:138:0x0249  */
    /* JADX WARN: Code duplicated, block: B:162:0x029e  */
    /* JADX WARN: Code duplicated, block: B:186:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:228:0x01bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x01bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:0x01bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:? A[LOOP:2: B:98:0x01a5->B:249:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:? A[LOOP:4: B:74:0x0146->B:252:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:255:? A[LOOP:6: B:50:0x00e5->B:255:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:0x02ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:0x02ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:281:0x02ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:290:? A[LOOP:10: B:184:0x02eb->B:290:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:293:? A[LOOP:12: B:160:0x0298->B:293:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:296:? A[LOOP:14: B:136:0x0243->B:296:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:76:0x014c  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        ArrayList arrayList;
        List list;
        Iterator it;
        List list2;
        Iterator it2;
        List list3;
        Iterator it3;
        List list4;
        Iterator it4;
        List list5;
        Iterator it5;
        List list6;
        Iterator it6;
        byte b = this.f31534a;
        org.xplatform.special_event.impl.alleventsgames.presentation.f fVar = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                th.printStackTrace();
                vzg0 vzg0Var = fVar.o;
                eep0 eep0Var = eep0.f7684a;
                vzg0Var.e("TEAM_HAS_STATISTIC_KEY", eep0Var);
                p7m0 p7m0Var = fVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    fVar.f.getClass();
                } while (!p7m0Var.m(value, n32.a((n32) value, eep0Var, null, null, null, null, null, 254)));
                return Unit.f46060a;
            case 1:
                ArrayList arrayList2 = ((rzv) obj).f31380a;
                int i = org.xplatform.special_event.impl.alleventsgames.presentation.f.Q;
                AllEventGamesScreenParams allEventGamesScreenParams = fVar.q;
                if (allEventGamesScreenParams != null) {
                    if (allEventGamesScreenParams instanceof AllEventGamesScreenParams.AllGames) {
                        ArrayList arrayList3 = ((AllEventGamesScreenParams.AllGames) allEventGamesScreenParams).b;
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj2 : arrayList2) {
                            if (obj2 instanceof b2w) {
                                arrayList4.add(obj2);
                            }
                        }
                        arrayList = new ArrayList();
                        for (Object obj3 : arrayList4) {
                            b2w b2wVar = (b2w) obj3;
                            if (b2wVar != null) {
                                if (b2wVar instanceof u1w) {
                                    u1w u1wVar = (u1w) b2wVar;
                                    List list7 = u1wVar.o.c;
                                    if (list7 == null || !list7.isEmpty()) {
                                        Iterator it7 = list7.iterator();
                                        while (true) {
                                            if (!it7.hasNext()) {
                                                list4 = u1wVar.p.c;
                                                if (list4 != null || !list4.isEmpty()) {
                                                    it4 = list4.iterator();
                                                    while (it4.hasNext()) {
                                                        if (arrayList3.contains(Long.valueOf(((Number) it4.next()).longValue()))) {
                                                        }
                                                    }
                                                }
                                            } else if (arrayList3.contains(Long.valueOf(((Number) it7.next()).longValue()))) {
                                            }
                                            arrayList.add(obj3);
                                        }
                                    }
                                    list4 = u1wVar.p.c;
                                    if (list4 != null) {
                                    }
                                    it4 = list4.iterator();
                                    while (it4.hasNext()) {
                                        if (arrayList3.contains(Long.valueOf(((Number) it4.next()).longValue()))) {
                                            arrayList.add(obj3);
                                        }
                                        break;
                                    }
                                    break;
                                } else if (b2wVar instanceof x1w) {
                                    x1w x1wVar = (x1w) b2wVar;
                                    List list8 = x1wVar.n.c;
                                    if (list8 == null || !list8.isEmpty()) {
                                        Iterator it8 = list8.iterator();
                                        while (true) {
                                            if (!it8.hasNext()) {
                                                list5 = x1wVar.o.c;
                                                if (list5 != null || !list5.isEmpty()) {
                                                    it5 = list5.iterator();
                                                    while (it5.hasNext()) {
                                                        if (arrayList3.contains(Long.valueOf(((Number) it5.next()).longValue()))) {
                                                        }
                                                    }
                                                }
                                            } else if (arrayList3.contains(Long.valueOf(((Number) it8.next()).longValue()))) {
                                            }
                                            arrayList.add(obj3);
                                        }
                                    }
                                    list5 = x1wVar.o.c;
                                    if (list5 != null) {
                                    }
                                    it5 = list5.iterator();
                                    while (it5.hasNext()) {
                                        if (arrayList3.contains(Long.valueOf(((Number) it5.next()).longValue()))) {
                                            arrayList.add(obj3);
                                        }
                                        break;
                                    }
                                    break;
                                } else if (b2wVar instanceof c2w) {
                                    c2w c2wVar = (c2w) b2wVar;
                                    List list9 = c2wVar.o.c;
                                    if (list9 == null || !list9.isEmpty()) {
                                        Iterator it9 = list9.iterator();
                                        while (true) {
                                            if (!it9.hasNext()) {
                                                list6 = c2wVar.p.c;
                                                if (list6 != null || !list6.isEmpty()) {
                                                    it6 = list6.iterator();
                                                    while (it6.hasNext()) {
                                                        if (arrayList3.contains(Long.valueOf(((Number) it6.next()).longValue()))) {
                                                        }
                                                    }
                                                }
                                            } else if (arrayList3.contains(Long.valueOf(((Number) it9.next()).longValue()))) {
                                            }
                                            arrayList.add(obj3);
                                        }
                                    }
                                    list6 = c2wVar.p.c;
                                    if (list6 != null) {
                                    }
                                    it6 = list6.iterator();
                                    while (it6.hasNext()) {
                                        if (arrayList3.contains(Long.valueOf(((Number) it6.next()).longValue()))) {
                                            arrayList.add(obj3);
                                        }
                                        break;
                                    }
                                    break;
                                }
                            }
                            t9f.b();
                            return null;
                        }
                    }
                    if (allEventGamesScreenParams instanceof AllEventGamesScreenParams.ParticipantGames) {
                        long j = ((AllEventGamesScreenParams.ParticipantGames) allEventGamesScreenParams).b;
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj4 : arrayList2) {
                            if (obj4 instanceof b2w) {
                                arrayList5.add(obj4);
                            }
                        }
                        arrayList = new ArrayList();
                        for (Object obj5 : arrayList5) {
                            b2w b2wVar2 = (b2w) obj5;
                            if (b2wVar2 != null) {
                                if (b2wVar2 instanceof u1w) {
                                    u1w u1wVar2 = (u1w) b2wVar2;
                                    List list10 = u1wVar2.o.c;
                                    if (list10 == null || !list10.isEmpty()) {
                                        Iterator it10 = list10.iterator();
                                        while (true) {
                                            if (!it10.hasNext()) {
                                                list = u1wVar2.p.c;
                                                if (list != null || !list.isEmpty()) {
                                                    it = list.iterator();
                                                    while (it.hasNext()) {
                                                        if (((Number) it.next()).longValue() == j) {
                                                        }
                                                    }
                                                }
                                            } else if (((Number) it10.next()).longValue() == j) {
                                            }
                                            arrayList.add(obj5);
                                        }
                                    }
                                    list = u1wVar2.p.c;
                                    if (list != null) {
                                    }
                                    it = list.iterator();
                                    while (it.hasNext()) {
                                        if (((Number) it.next()).longValue() == j) {
                                            arrayList.add(obj5);
                                        }
                                        break;
                                    }
                                    break;
                                } else if (b2wVar2 instanceof x1w) {
                                    x1w x1wVar2 = (x1w) b2wVar2;
                                    List list11 = x1wVar2.n.c;
                                    if (list11 == null || !list11.isEmpty()) {
                                        Iterator it11 = list11.iterator();
                                        while (true) {
                                            if (!it11.hasNext()) {
                                                list2 = x1wVar2.o.c;
                                                if (list2 != null || !list2.isEmpty()) {
                                                    it2 = list2.iterator();
                                                    while (it2.hasNext()) {
                                                        if (((Number) it2.next()).longValue() == j) {
                                                        }
                                                    }
                                                }
                                            } else if (((Number) it11.next()).longValue() == j) {
                                            }
                                            arrayList.add(obj5);
                                        }
                                    }
                                    list2 = x1wVar2.o.c;
                                    if (list2 != null) {
                                    }
                                    it2 = list2.iterator();
                                    while (it2.hasNext()) {
                                        if (((Number) it2.next()).longValue() == j) {
                                            arrayList.add(obj5);
                                        }
                                        break;
                                    }
                                    break;
                                } else if (b2wVar2 instanceof c2w) {
                                    c2w c2wVar2 = (c2w) b2wVar2;
                                    List list12 = c2wVar2.o.c;
                                    if (list12 == null || !list12.isEmpty()) {
                                        Iterator it12 = list12.iterator();
                                        while (true) {
                                            if (!it12.hasNext()) {
                                                list3 = c2wVar2.p.c;
                                                if (list3 != null || !list3.isEmpty()) {
                                                    it3 = list3.iterator();
                                                    while (it3.hasNext()) {
                                                        if (((Number) it3.next()).longValue() == j) {
                                                        }
                                                    }
                                                }
                                            } else if (((Number) it12.next()).longValue() == j) {
                                            }
                                            arrayList.add(obj5);
                                        }
                                    }
                                    list3 = c2wVar2.p.c;
                                    if (list3 != null) {
                                    }
                                    it3 = list3.iterator();
                                    while (it3.hasNext()) {
                                        if (((Number) it3.next()).longValue() == j) {
                                            arrayList.add(obj5);
                                        }
                                        break;
                                    }
                                    break;
                                }
                            }
                            t9f.b();
                            return null;
                        }
                    }
                    if (allEventGamesScreenParams instanceof AllEventGamesScreenParams.StadiumGames) {
                        long j2 = ((AllEventGamesScreenParams.StadiumGames) allEventGamesScreenParams).b;
                        ArrayList arrayList6 = new ArrayList();
                        for (Object obj6 : arrayList2) {
                            d2w d2wVar = (d2w) obj6;
                            if (((d2wVar instanceof c2w) && ((c2w) d2wVar).h == j2) || ((d2wVar instanceof u1w) && ((u1w) d2wVar).h == j2)) {
                                arrayList6.add(obj6);
                            }
                        }
                        arrayList = arrayList6;
                    }
                    if (arrayList.isEmpty()) {
                        fVar.R(new u32(m32.c, iun.f15405a, xun.f41520a));
                    } else {
                        fVar.R(new u32(m32.d, arrayList, ((n32) fVar.D()).d.d));
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 2:
                int i2 = org.xplatform.special_event.impl.alleventsgames.presentation.f.Q;
                ArrayList arrayListM = fVar.M((List) obj);
                if (arrayListM.isEmpty()) {
                    fVar.R(new v32(m32.c, iun.f15405a));
                } else {
                    fVar.R(new v32(m32.d, arrayListM));
                }
                return Unit.f46060a;
            default:
                int i3 = org.xplatform.special_event.impl.alleventsgames.presentation.f.Q;
                ArrayList arrayListM2 = fVar.M((List) obj);
                if (fVar.M(arrayListM2).isEmpty()) {
                    fVar.R(new w32(m32.c, iun.f15405a));
                } else {
                    fVar.R(new w32(m32.d, arrayListM2));
                }
                return Unit.f46060a;
        }
    }
}
