package a;

import android.gov.nist.core.Separators;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j4b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x2q f15876a;
    public final Set b;

    public j4b(x2q x2qVar, Set set) {
        set.getClass();
        this.f15876a = x2qVar;
        this.b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j4b)) {
            return false;
        }
        j4b j4bVar = (j4b) obj;
        return this.f15876a.equals(j4bVar.f15876a) && Intrinsics.d(this.b, j4bVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f15876a.hashCode() * 31);
    }

    public final String toString() {
        return "CategoryFilterState(filterCategoryModel=" + this.f15876a + ", selectedFiltersIds=" + this.b + Separators.RPAREN;
    }
}
