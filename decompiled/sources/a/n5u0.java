package a;

import java.util.ArrayList;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class n5u0 implements p5u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f22963a;

    public n5u0(ArrayList arrayList) {
        this.f22963a = arrayList;
    }

    @Override // a.l5u0
    public final long b(t73 t73Var, t73 t73Var2, t73 t73Var3) {
        Pair pair = (Pair) CollectionsKt.d0(this.f22963a);
        return ((p5u0) pair.b).b(t73Var, t73Var2, t73Var3) + ((Number) pair.f46059a).longValue();
    }

    @Override // a.l5u0
    public final t73 c(long j, t73 t73Var, t73 t73Var2, t73 t73Var3) {
        Pair pairD = d(j);
        return ((p5u0) pairD.b).c(j - ((Number) pairD.f46059a).longValue(), t73Var, t73Var2, t73Var3);
    }

    public final Pair d(long j) {
        Object objPrevious;
        ArrayList arrayList = this.f22963a;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (((Number) ((Pair) objPrevious).f46059a).longValue() > j);
        Pair pair = (Pair) objPrevious;
        return pair == null ? (Pair) CollectionsKt.U(arrayList) : pair;
    }

    @Override // a.l5u0
    public final t73 h(long j, t73 t73Var, t73 t73Var2, t73 t73Var3) {
        Pair pairD = d(j);
        return ((p5u0) pairD.b).h(j - ((Number) pairD.f46059a).longValue(), t73Var, t73Var2, t73Var3);
    }
}
