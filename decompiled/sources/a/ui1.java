package a;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ui1 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35707a;
    public final /* synthetic */ kmq b;
    public final /* synthetic */ d9z c;

    public /* synthetic */ ui1(kmq kmqVar, d9z d9zVar, byte b) {
        this.f35707a = b;
        this.c = d9zVar;
        this.b = kmqVar;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01af  */
    /* JADX WARN: Code duplicated, block: B:130:0x021d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0063  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:76:0x0141  */
    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        Object objA;
        Object objA2;
        Object objA3;
        Object objA4;
        Object objA5;
        byte b = this.f35707a;
        d9z d9zVar = this.c;
        Object obj2 = null;
        boolean z = true;
        kmq kmqVar = this.b;
        switch (b) {
            case 0:
                List list = (List) obj;
                if (list == null || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    do {
                        if (!it.hasNext()) {
                            z = false;
                        }
                    } while (!Intrinsics.d(((r8z) it.next()).j, sre0.f32672a.b(eol.class)));
                } else {
                    z = false;
                }
                ListIterator listIterator = list.listIterator(list.size());
                while (listIterator.hasPrevious()) {
                    Object objPrevious = listIterator.previous();
                    if (Intrinsics.d(((r8z) objPrevious).j, sre0.f32672a.b(eol.class))) {
                        obj2 = objPrevious;
                        r8z r8zVar = (r8z) obj2;
                        return (z || (r8zVar != null ? r8zVar.f30051a : -1) < d9zVar.j().q + (-9) || (objA = kmqVar.a(Unit.f46060a, yjeVar)) != wne.f39444a) ? Unit.f46060a : objA;
                    }
                }
                r8z r8zVar2 = (r8z) obj2;
                if (z) {
                }
            case 1:
                List list2 = (List) obj;
                if (list2 == null || !list2.isEmpty()) {
                    Iterator it2 = list2.iterator();
                    do {
                        if (!it2.hasNext()) {
                            z = false;
                        }
                    } while (!Intrinsics.d(((r8z) it2.next()).j, sre0.f32672a.b(eol.class)));
                } else {
                    z = false;
                }
                ListIterator listIterator2 = list2.listIterator(list2.size());
                while (listIterator2.hasPrevious()) {
                    Object objPrevious2 = listIterator2.previous();
                    if (Intrinsics.d(((r8z) objPrevious2).j, sre0.f32672a.b(eol.class))) {
                        obj2 = objPrevious2;
                        r8z r8zVar3 = (r8z) obj2;
                        return (z || (r8zVar3 != null ? r8zVar3.f30051a : -1) < d9zVar.j().q + (-9) || (objA2 = kmqVar.a(Unit.f46060a, yjeVar)) != wne.f39444a) ? Unit.f46060a : objA2;
                    }
                }
                r8z r8zVar4 = (r8z) obj2;
                if (z) {
                }
            case 2:
                List list3 = (List) obj;
                if (list3 == null || !list3.isEmpty()) {
                    Iterator it3 = list3.iterator();
                    do {
                        if (!it3.hasNext()) {
                            z = false;
                        }
                    } while (!Intrinsics.d(((r8z) it3.next()).j, sre0.f32672a.b(ezh.class)));
                } else {
                    z = false;
                }
                ListIterator listIterator3 = list3.listIterator(list3.size());
                while (listIterator3.hasPrevious()) {
                    Object objPrevious3 = listIterator3.previous();
                    if (Intrinsics.d(((r8z) objPrevious3).j, sre0.f32672a.b(ezh.class))) {
                        obj2 = objPrevious3;
                        r8z r8zVar5 = (r8z) obj2;
                        return (z || (r8zVar5 != null ? r8zVar5.f30051a : -1) < d9zVar.j().q + (-6) || (objA3 = kmqVar.a(Unit.f46060a, yjeVar)) != wne.f39444a) ? Unit.f46060a : objA3;
                    }
                }
                r8z r8zVar6 = (r8z) obj2;
                if (z) {
                }
            case 3:
                List list4 = (List) obj;
                if (list4 == null || !list4.isEmpty()) {
                    Iterator it4 = list4.iterator();
                    do {
                        if (!it4.hasNext()) {
                            z = false;
                        }
                    } while (!Intrinsics.d(((r8z) it4.next()).j, sre0.f32672a.b(eol.class)));
                } else {
                    z = false;
                }
                ListIterator listIterator4 = list4.listIterator(list4.size());
                while (listIterator4.hasPrevious()) {
                    Object objPrevious4 = listIterator4.previous();
                    if (Intrinsics.d(((r8z) objPrevious4).j, sre0.f32672a.b(eol.class))) {
                        obj2 = objPrevious4;
                        r8z r8zVar7 = (r8z) obj2;
                        return (z || (r8zVar7 != null ? r8zVar7.f30051a : -1) < d9zVar.j().q + (-9) || (objA4 = kmqVar.a(Unit.f46060a, yjeVar)) != wne.f39444a) ? Unit.f46060a : objA4;
                    }
                }
                r8z r8zVar8 = (r8z) obj2;
                if (z) {
                }
            default:
                List list5 = (List) obj;
                if (list5 == null || !list5.isEmpty()) {
                    Iterator it5 = list5.iterator();
                    do {
                        if (!it5.hasNext()) {
                            z = false;
                        }
                    } while (!Intrinsics.d(((r8z) it5.next()).j, sre0.f32672a.b(st0.class)));
                } else {
                    z = false;
                }
                ListIterator listIterator5 = list5.listIterator(list5.size());
                while (listIterator5.hasPrevious()) {
                    Object objPrevious5 = listIterator5.previous();
                    if (Intrinsics.d(((r8z) objPrevious5).j, sre0.f32672a.b(st0.class))) {
                        obj2 = objPrevious5;
                        r8z r8zVar9 = (r8z) obj2;
                        return (z || (r8zVar9 != null ? r8zVar9.f30051a : -1) < d9zVar.j().q + (-6) || (objA5 = kmqVar.a(Unit.f46060a, yjeVar)) != wne.f39444a) ? Unit.f46060a : objA5;
                    }
                }
                r8z r8zVar10 = (r8z) obj2;
                if (z) {
                }
        }
    }
}
