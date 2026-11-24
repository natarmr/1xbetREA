package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f3b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8853a;
    public final Integer b;
    public final a4x c;

    public f3b() {
        this(false, 0, lak0.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f3b)) {
            return false;
        }
        f3b f3bVar = (f3b) obj;
        return this.f8853a == f3bVar.f8853a && Intrinsics.d(this.b, f3bVar.b) && Intrinsics.d(this.c, f3bVar.c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f8853a) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        a4x a4xVar = this.c;
        return iHashCode2 + (a4xVar != null ? a4xVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CategoriesStateModel(isFilterActive=");
        sb.append(this.f8853a);
        sb.append(", activeChipId=");
        sb.append(this.b);
        sb.append(", chips=");
        return cs0.n(sb, this.c, Separators.RPAREN);
    }

    public f3b(boolean z, Integer num, a4x a4xVar) {
        this.f8853a = z;
        this.b = num;
        this.c = a4xVar;
    }
}
