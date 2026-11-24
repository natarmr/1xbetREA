package a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class vr00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wvq0 f37876a;
    public final Collection b;
    public final Collection c;

    public vr00(wvq0 wvq0Var, Collection collection, Collection collection2) {
        wvq0Var.getClass();
        collection.getClass();
        collection2.getClass();
        this.f37876a = wvq0Var;
        this.b = collection;
        this.c = collection2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vr00)) {
            return false;
        }
        vr00 vr00Var = (vr00) obj;
        return Intrinsics.d(this.f37876a, vr00Var.f37876a) && Intrinsics.d(this.b, vr00Var.b) && Intrinsics.d(this.c, vr00Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f37876a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LocalParsingResult(iteratorPosition=" + this.f37876a + ", parsedNodes=" + this.b + ", rangesToProcessFurther=" + this.c + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public vr00(wvq0 wvq0Var, List list, ArrayList arrayList) {
        this(wvq0Var, list, kotlin.collections.a.c(arrayList));
        list.getClass();
    }
}
