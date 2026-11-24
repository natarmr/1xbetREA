package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class q6h implements t6h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28197a;
    public final Long b;

    public q6h(Long l, long j) {
        this.f28197a = j;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q6h)) {
            return false;
        }
        q6h q6hVar = (q6h) obj;
        return this.f28197a == q6hVar.f28197a && Intrinsics.d(this.b, q6hVar.b);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f28197a) * 31;
        Long l = this.b;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "Loading(categoryId=" + this.f28197a + ", subGameId=" + this.b + Separators.RPAREN;
    }
}
