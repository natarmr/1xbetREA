package a;

import java.util.ArrayList;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class j7d implements cfq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f16035a;

    public j7d(ArrayList arrayList) {
        this.f16035a = arrayList;
    }

    @Override // a.j73
    public final p5u0 a(lxs0 lxs0Var) {
        ArrayList arrayList = this.f16035a;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) arrayList.get(i);
            arrayList2.add(new Pair(Long.valueOf(((long) ((Number) pair.f46059a).intValue()) * 1000000), ((cfq) pair.b).a(lxs0Var)));
        }
        return new n5u0(arrayList2);
    }
}
