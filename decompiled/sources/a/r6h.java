package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class r6h implements t6h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f29932a;
    public final Long b;
    public final boolean c;

    public r6h(long j, Long l, boolean z) {
        this.f29932a = j;
        this.b = l;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r6h)) {
            return false;
        }
        r6h r6hVar = (r6h) obj;
        return this.f29932a == r6hVar.f29932a && Intrinsics.d(this.b, r6hVar.b) && this.c == r6hVar.c;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f29932a) * 31;
        Long l = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (l == null ? 0 : l.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Markets(categoryId=");
        sb.append(this.f29932a);
        sb.append(", subGameId=");
        sb.append(this.b);
        return f140.n(sb, ", isEmpty=", this.c, Separators.RPAREN);
    }
}
