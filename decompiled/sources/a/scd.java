package a;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class scd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashSet f31980a;

    static {
        Set<iwb0> set = iwb0.e;
        g950 g950Var = j4m0.f15892a;
        ArrayList arrayList = new ArrayList(r3d.q(set, 10));
        for (iwb0 iwb0Var : set) {
            iwb0Var.getClass();
            arrayList.add(j4m0.l.a(iwb0Var.f15481a));
        }
        ArrayList<swq> arrayListR0 = CollectionsKt.r0(CollectionsKt.r0(CollectionsKt.r0(arrayList, i4m0.f.i()), i4m0.h.i()), i4m0.j.i());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (swq swqVar : arrayListR0) {
            swqVar.getClass();
            linkedHashSet.add(new qlc(swqVar.b(), swqVar.f32934a.g()));
        }
        f31980a = linkedHashSet;
    }
}
