package a;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes2.dex */
public class r3 extends m3 implements SortedSet {
    public final /* synthetic */ mx40 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(mx40 mx40Var, SortedMap sortedMap) {
        super(mx40Var, sortedMap);
        this.c = mx40Var;
    }

    public SortedMap b() {
        return (SortedMap) this.f21088a;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return b().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return b().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new r3(this.c, b().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return b().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new r3(this.c, b().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new r3(this.c, b().tailMap(obj));
    }
}
