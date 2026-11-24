package a;

import android.gov.nist.core.Separators;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f230 implements m230 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8795a;
    public final Set b;

    public f230(Set set, long j) {
        set.getClass();
        this.f8795a = j;
        this.b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f230)) {
            return false;
        }
        f230 f230Var = (f230) obj;
        return this.f8795a == f230Var.f8795a && Intrinsics.d(this.b, f230Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f8795a) * 31);
    }

    public final String toString() {
        return "OnGlobalMarketsToggled(categoryId=" + this.f8795a + ", subGameIds=" + this.b + Separators.RPAREN;
    }
}
