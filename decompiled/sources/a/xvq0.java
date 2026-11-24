package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes2.dex */
public final class xvq0 extends wvq0 {
    public final List c;
    public final int d;
    public final /* synthetic */ dgu e;

    /* JADX WARN: Illegal instructions before constructor call */
    public xvq0(dgu dguVar, List list) {
        list.getClass();
        IntRange intRange = (IntRange) CollectionsKt.firstOrNull(list);
        this(dguVar, list, 0, intRange != null ? intRange.f46068a : -1);
    }

    @Override // a.wvq0
    public final ar20 g() {
        IntRange intRange = (IntRange) CollectionsKt.W(this.d, this.c);
        if (intRange == null) {
            return null;
        }
        int i = intRange.f46068a;
        int i2 = intRange.b;
        int i3 = this.f39851a + 1;
        if (i > i3 || i3 > i2) {
            return null;
        }
        return f(1).f20728a;
    }

    @Override // a.wvq0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final xvq0 a() {
        List list = this.c;
        int size = list.size();
        int i = this.d;
        if (i >= size) {
            return this;
        }
        int i2 = ((IntRange) list.get(i)).b;
        dgu dguVar = this.e;
        int i3 = this.f39851a;
        if (i3 != i2) {
            return new xvq0(dguVar, list, i, i3 + 1);
        }
        int i4 = i + 1;
        IntRange intRange = (IntRange) CollectionsKt.W(i4, list);
        return new xvq0(dguVar, list, i4, intRange != null ? intRange.f46068a : ((ArrayList) dguVar.b).size());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xvq0(dgu dguVar, List list, int i, int i2) {
        super(dguVar, i2);
        this.e = dguVar;
        this.c = list;
        this.d = i;
    }
}
