package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class iv20 implements kv20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15424a;
    public final String b;
    public final boolean c;

    public iv20(String str, long j, boolean z) {
        str.getClass();
        this.f15424a = j;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iv20)) {
            return false;
        }
        iv20 iv20Var = (iv20) obj;
        return this.f15424a == iv20Var.f15424a && Intrinsics.d(this.b, iv20Var.b) && this.c == iv20Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(Long.hashCode(this.f15424a) * 31, 31, this.b);
    }

    public final String toString() {
        return f140.n(axq.o(this.f15424a, "ExpandClick(marketGroupId=", ", marketUniqueExpandedKey=", this.b), ", isExpanded=", this.c, Separators.RPAREN);
    }
}
