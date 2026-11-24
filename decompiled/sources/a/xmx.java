package a;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class xmx implements iys0, jys0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public wsy f41149a;
    public final LinkedHashSet b;
    public final int c;

    public xmx(AbstractCollection abstractCollection) {
        abstractCollection.isEmpty();
        LinkedHashSet linkedHashSet = new LinkedHashSet(abstractCollection);
        this.b = linkedHashSet;
        this.c = linkedHashSet.hashCode();
    }

    public final kzj0 a() {
        ays0.b.getClass();
        return ucx.i0(ays0.c, this, iun.f15405a, false, jpm0.j("member scope for intersection type", this.b), new w0((Object) this, (byte) 25));
    }

    @Override // a.iys0
    public final Collection b() {
        return this.b;
    }

    @Override // a.iys0
    public final ary c() {
        ary aryVarC = ((wsy) this.b.iterator().next()).S().c();
        aryVarC.getClass();
        return aryVarC;
    }

    public final String d(Function1 function1) {
        function1.getClass();
        return CollectionsKt.b0(CollectionsKt.A0(this.b, new mto(function1, (byte) 3)), " & ", "{", "}", new w8v(function1, (byte) 4), 24);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xmx)) {
            return false;
        }
        return this.b.equals(((xmx) obj).b);
    }

    @Override // a.iys0
    public final List getParameters() {
        return iun.f15405a;
    }

    public final int hashCode() {
        return this.c;
    }

    @Override // a.iys0
    public final foc n() {
        return null;
    }

    @Override // a.iys0
    public final boolean p() {
        return false;
    }

    public final String toString() {
        return d(j9x.d);
    }
}
