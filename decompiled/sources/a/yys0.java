package a;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class yys0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yys0 f43482a = new yys0();

    public static ArrayList a(AbstractCollection abstractCollection, Function2 function2) {
        ArrayList<kzj0> arrayList = new ArrayList(abstractCollection);
        Iterator it = arrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            kzj0 kzj0Var = (kzj0) it.next();
            if (!arrayList.isEmpty()) {
                for (kzj0 kzj0Var2 : arrayList) {
                    if (kzj0Var2 != kzj0Var) {
                        kzj0Var2.getClass();
                        kzj0Var.getClass();
                        if (((Boolean) function2.invoke(kzj0Var2, kzj0Var)).booleanValue()) {
                            it.remove();
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [a.ays0] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9, types: [a.ays0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v16, types: [a.kzj0] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [a.kzj0, a.wsy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.util.LinkedHashSet, java.util.Set] */
    public final kzj0 b(ArrayList arrayList) {
        kzj0 kzj0VarA;
        arrayList.size();
        ArrayList<kzj0> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            kzj0 kzj0Var = (kzj0) it.next();
            if (kzj0Var.S() instanceof xmx) {
                Collection collectionB = kzj0Var.S().b();
                collectionB.getClass();
                Collection<wsy> collection = collectionB;
                ArrayList arrayList3 = new ArrayList(r3d.q(collection, 10));
                for (wsy wsyVar : collection) {
                    wsyVar.getClass();
                    kzj0 kzj0VarZ = thb.Z(wsyVar);
                    if (kzj0Var.U()) {
                        kzj0VarZ = kzj0VarZ.k0(true);
                    }
                    arrayList3.add(kzj0VarZ);
                }
                arrayList2.addAll(arrayList3);
            } else {
                arrayList2.add(kzj0Var);
            }
        }
        xys0 xys0VarA = xys0.f41720a;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            xys0VarA = xys0VarA.a((tft0) it2.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (kzj0 kzj0VarK0 : arrayList2) {
            if (xys0VarA == xys0.d) {
                if (kzj0VarK0 instanceof yl50) {
                    yl50 yl50Var = (yl50) kzj0VarK0;
                    kzj0VarK0 = new yl50(yl50Var.b, yl50Var.c, yl50Var.d, yl50Var.e, yl50Var.f, true);
                }
                kzj0VarK0.getClass();
                kzj0 kzj0VarE = kud.e(kzj0VarK0, false);
                kzj0VarK0 = (kzj0VarE == null && (kzj0VarE = q7x.C(kzj0VarK0)) == null) ? kzj0VarK0.k0(false) : kzj0VarE;
            }
            linkedHashSet.add(kzj0VarK0);
        }
        ArrayList arrayList4 = new ArrayList(r3d.q(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((kzj0) it3.next()).K());
        }
        Iterator it4 = arrayList4.iterator();
        kzj0 kzj0Var2 = null;
        if (!it4.hasNext()) {
            v4i0.p("Empty collection can't be reduced.");
            return null;
        }
        ?? next = it4.next();
        while (it4.hasNext()) {
            ays0 ays0Var = (ays0) it4.next();
            next = (ays0) next;
            next.getClass();
            fck0 fck0Var = ays0.b;
            ays0Var.getClass();
            if (!next.isEmpty() || !ays0Var.isEmpty()) {
                ArrayList arrayList5 = new ArrayList();
                Collection collectionValues = ((ConcurrentHashMap) fck0Var.b).values();
                collectionValues.getClass();
                Iterator it5 = collectionValues.iterator();
                while (it5.hasNext()) {
                    int iIntValue = ((Number) it5.next()).intValue();
                    j93 j93Var = (j93) next.f1685a.get(iIntValue);
                    j93 j93Var2 = (j93) ays0Var.f1685a.get(iIntValue);
                    if (j93Var != null) {
                        if (!Intrinsics.d(j93Var2, j93Var)) {
                            j93Var = null;
                        }
                        j93Var2 = j93Var;
                    } else if (j93Var2 == null || !Intrinsics.d(j93Var, j93Var2)) {
                        j93Var2 = null;
                    }
                    if (j93Var2 != null) {
                        arrayList5.add(j93Var2);
                    }
                }
                next = fck0.b(arrayList5);
            }
        }
        ays0 ays0Var2 = (ays0) next;
        if (linkedHashSet.size() == 1) {
            kzj0VarA = (kzj0) CollectionsKt.u0(linkedHashSet);
        } else {
            ArrayList arrayListA = a(linkedHashSet, new fup0(2, this, yys0.class, "isStrictSupertype", "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lkotlin/reflect/jvm/internal/impl/types/KotlinType;)Z", 0, (byte) 23));
            arrayListA.isEmpty();
            xkx[] xkxVarArr = xkx.f41048a;
            if (!arrayListA.isEmpty()) {
                Iterator it6 = arrayListA.iterator();
                if (!it6.hasNext()) {
                    v4i0.p("Empty collection can't be reduced.");
                    return null;
                }
                ?? next2 = it6.next();
                while (it6.hasNext()) {
                    kzj0 kzj0Var3 = (kzj0) it6.next();
                    next2 = (kzj0) next2;
                    if (next2 != 0 && kzj0Var3 != null) {
                        iys0 iys0VarS = next2.S();
                        iys0 iys0VarS2 = kzj0Var3.S();
                        boolean z = iys0VarS instanceof ykx;
                        if (z && (iys0VarS2 instanceof ykx)) {
                            LinkedHashSet linkedHashSet2 = ((ykx) iys0VarS).f42813a;
                            LinkedHashSet linkedHashSet3 = ((ykx) iys0VarS2).f42813a;
                            linkedHashSet2.getClass();
                            linkedHashSet3.getClass();
                            LinkedHashSet linkedHashSetO0 = CollectionsKt.O0(linkedHashSet2);
                            w3d.u(linkedHashSetO0, linkedHashSet3);
                            ykx ykxVar = new ykx(linkedHashSetO0);
                            ays0.b.getClass();
                            ays0 ays0Var3 = ays0.c;
                            ays0Var3.getClass();
                            next2 = ucx.h0(f2o.a(u1o.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"), ays0Var3, ykxVar, iun.f15405a, false);
                        } else if (z) {
                            if (((ykx) iys0VarS).f42813a.contains(kzj0Var3)) {
                                next2 = kzj0Var3;
                            }
                        } else if (!(iys0VarS2 instanceof ykx) || !((ykx) iys0VarS2).f42813a.contains(next2)) {
                        }
                    }
                    next2 = 0;
                }
                kzj0Var2 = (kzj0) next2;
            }
            if (kzj0Var2 != null) {
                kzj0VarA = kzj0Var2;
            } else {
                km50.b.getClass();
                ArrayList arrayListA2 = a(arrayListA, new fup0(2, jm50.b, lm50.class, "equalTypes", "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lkotlin/reflect/jvm/internal/impl/types/KotlinType;)Z", 0, (byte) 24));
                arrayListA2.isEmpty();
                kzj0VarA = arrayListA2.size() < 2 ? (kzj0) CollectionsKt.u0(arrayListA2) : new xmx(linkedHashSet).a();
            }
        }
        return kzj0VarA.m0(ays0Var2);
    }
}
