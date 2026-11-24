package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class hwk0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ iwk0 k;
    public final /* synthetic */ ArrayList l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hwk0(iwk0 iwk0Var, ArrayList arrayList, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = iwk0Var;
        this.l = arrayList;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ArrayList arrayList = this.l;
        iwk0 iwk0Var = this.k;
        switch (b) {
            case 0:
                hwk0 hwk0Var = new hwk0(iwk0Var, arrayList, yjeVar, (byte) 0);
                hwk0Var.j = obj;
                return hwk0Var;
            case 1:
                hwk0 hwk0Var2 = new hwk0(iwk0Var, arrayList, yjeVar, (byte) 1);
                hwk0Var2.j = obj;
                return hwk0Var2;
            default:
                hwk0 hwk0Var3 = new hwk0(iwk0Var, arrayList, yjeVar, (byte) 2);
                hwk0Var3.j = obj;
                return hwk0Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        dqk0 dqk0Var = (dqk0) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((hwk0) create(dqk0Var, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:119:0x020c  */
    /* JADX WARN: Code duplicated, block: B:141:0x0220 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x0220 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:0x0220 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:? A[LOOP:2: B:117:0x0206->B:162:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:? A[LOOP:4: B:93:0x01a7->B:165:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:? A[LOOP:6: B:69:0x0146->B:168:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x014c  */
    /* JADX WARN: Code duplicated, block: B:95:0x01ad  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        List list;
        Iterator it;
        List list2;
        Iterator it2;
        List list3;
        Iterator it3;
        byte b = this.i;
        ysk0 ysk0Var = ysk0.f43172a;
        vsk0 vsk0Var = vsk0.f37956a;
        ArrayList arrayList = this.l;
        iwk0 iwk0Var = this.k;
        dqk0 dqk0Var = (dqk0) this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (dqk0Var != null) {
                    if (dqk0Var instanceof bqk0) {
                        iwk0Var.E.b(((bqk0) dqk0Var).f3036a, new awk0(iwk0Var, (byte) 6));
                    } else if (dqk0Var instanceof cqk0) {
                        ArrayList arrayList2 = ((rzv) ((cqk0) dqk0Var).f4798a).f31380a;
                        int i = iwk0.X0;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj2 : arrayList2) {
                            if (obj2 instanceof b2w) {
                                arrayList3.add(obj2);
                            }
                        }
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj3 : arrayList3) {
                            b2w b2wVar = (b2w) obj3;
                            if (b2wVar != null) {
                                if (b2wVar instanceof u1w) {
                                    u1w u1wVar = (u1w) b2wVar;
                                    List list4 = u1wVar.o.c;
                                    if (list4 == null || !list4.isEmpty()) {
                                        Iterator it4 = list4.iterator();
                                        while (true) {
                                            if (!it4.hasNext()) {
                                                list = u1wVar.p.c;
                                                if (list != null || !list.isEmpty()) {
                                                    it = list.iterator();
                                                    while (it.hasNext()) {
                                                        if (arrayList.contains(Long.valueOf(((Number) it.next()).longValue()))) {
                                                        }
                                                    }
                                                }
                                            } else if (arrayList.contains(Long.valueOf(((Number) it4.next()).longValue()))) {
                                            }
                                            arrayList4.add(obj3);
                                        }
                                    }
                                    list = u1wVar.p.c;
                                    if (list != null) {
                                    }
                                    it = list.iterator();
                                    while (it.hasNext()) {
                                        if (arrayList.contains(Long.valueOf(((Number) it.next()).longValue()))) {
                                            arrayList4.add(obj3);
                                        }
                                        break;
                                    }
                                    break;
                                } else if (b2wVar instanceof x1w) {
                                    x1w x1wVar = (x1w) b2wVar;
                                    List list5 = x1wVar.n.c;
                                    if (list5 == null || !list5.isEmpty()) {
                                        Iterator it5 = list5.iterator();
                                        while (true) {
                                            if (!it5.hasNext()) {
                                                list2 = x1wVar.o.c;
                                                if (list2 != null || !list2.isEmpty()) {
                                                    it2 = list2.iterator();
                                                    while (it2.hasNext()) {
                                                        if (arrayList.contains(Long.valueOf(((Number) it2.next()).longValue()))) {
                                                        }
                                                    }
                                                }
                                            } else if (arrayList.contains(Long.valueOf(((Number) it5.next()).longValue()))) {
                                            }
                                            arrayList4.add(obj3);
                                        }
                                    }
                                    list2 = x1wVar.o.c;
                                    if (list2 != null) {
                                    }
                                    it2 = list2.iterator();
                                    while (it2.hasNext()) {
                                        if (arrayList.contains(Long.valueOf(((Number) it2.next()).longValue()))) {
                                            arrayList4.add(obj3);
                                        }
                                        break;
                                    }
                                    break;
                                } else if (b2wVar instanceof c2w) {
                                    c2w c2wVar = (c2w) b2wVar;
                                    List list6 = c2wVar.o.c;
                                    if (list6 == null || !list6.isEmpty()) {
                                        Iterator it6 = list6.iterator();
                                        while (true) {
                                            if (!it6.hasNext()) {
                                                list3 = c2wVar.p.c;
                                                if (list3 != null || !list3.isEmpty()) {
                                                    it3 = list3.iterator();
                                                    while (it3.hasNext()) {
                                                        if (arrayList.contains(Long.valueOf(((Number) it3.next()).longValue()))) {
                                                        }
                                                    }
                                                }
                                            } else if (arrayList.contains(Long.valueOf(((Number) it6.next()).longValue()))) {
                                            }
                                            arrayList4.add(obj3);
                                        }
                                    }
                                    list3 = c2wVar.p.c;
                                    if (list3 != null) {
                                    }
                                    it3 = list3.iterator();
                                    while (it3.hasNext()) {
                                        if (arrayList.contains(Long.valueOf(((Number) it3.next()).longValue()))) {
                                            arrayList4.add(obj3);
                                        }
                                        break;
                                    }
                                    break;
                                }
                            }
                            t9f.b();
                            return null;
                        }
                        List listD0 = CollectionsKt.D0(CollectionsKt.A0(arrayList4, new mjf0((byte) 17)), 2);
                        if (listD0.isEmpty()) {
                            iwk0Var.W(new csk0(vsk0Var, iun.f15405a, xun.f41520a));
                        } else {
                            iwk0Var.W(new csk0(ysk0Var, listD0, ((dvk0) iwk0Var.D()).j.c.c));
                        }
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (dqk0Var != null) {
                    if (dqk0Var instanceof bqk0) {
                        iwk0Var.E.b(((bqk0) dqk0Var).f3036a, new awk0(iwk0Var, (byte) 7));
                    } else if (dqk0Var instanceof cqk0) {
                        List listM = iwk0.M(arrayList, (List) ((cqk0) dqk0Var).f4798a);
                        if (listM.isEmpty()) {
                            iwk0Var.W(new dsk0(vsk0Var, iun.f15405a));
                        } else {
                            iwk0Var.W(new dsk0(ysk0Var, listM));
                        }
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            default:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (dqk0Var != null) {
                    if (dqk0Var instanceof bqk0) {
                        iwk0Var.E.b(((bqk0) dqk0Var).f3036a, new awk0(iwk0Var, (byte) 8));
                    } else if (dqk0Var instanceof cqk0) {
                        List listM2 = iwk0.M(arrayList, (List) ((cqk0) dqk0Var).f4798a);
                        if (listM2.isEmpty()) {
                            iwk0Var.W(new esk0(vsk0Var, iun.f15405a));
                        } else {
                            iwk0Var.W(new esk0(ysk0Var, listM2));
                        }
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
        }
    }
}
