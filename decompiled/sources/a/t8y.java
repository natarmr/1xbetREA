package a;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class t8y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lov0 f33535a;
    public final Collection b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public t8y(lov0 lov0Var, Collection collection, int i) {
        this(lov0Var, collection, lov0Var.f20409a == p860.c, (i & 8) == 0, (i & 16) == 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t8y)) {
            return false;
        }
        t8y t8yVar = (t8y) obj;
        return Intrinsics.d(this.f33535a, t8yVar.f33535a) && Intrinsics.d(this.b, t8yVar.b) && this.c == t8yVar.c && this.d == t8yVar.d && this.e == t8yVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + brm0.e(brm0.e((this.b.hashCode() + (this.f33535a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JavaDefaultQualifiers(nullabilityQualifier=");
        sb.append(this.f33535a);
        sb.append(", qualifierApplicabilityTypes=");
        sb.append(this.b);
        sb.append(", definitelyNotNull=");
        sb.append(this.c);
        sb.append(", preferQualifierOverBound=");
        sb.append(this.d);
        sb.append(", preferQualifierOverSupertype=");
        return brm0.o(sb, this.e, ')');
    }

    public t8y(lov0 lov0Var, Collection collection, boolean z, boolean z2, boolean z3) {
        collection.getClass();
        this.f33535a = lov0Var;
        this.b = collection;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }
}
