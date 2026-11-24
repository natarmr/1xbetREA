package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class x4k {
    public static final w4k Companion = new w4k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f40268a;
    public final Long b;

    public /* synthetic */ x4k(int i, long j, Long l) {
        if (3 != (i & 3)) {
            m2x.I(i, 3, v4k.f36784a.getDescriptor());
            throw null;
        }
        this.f40268a = j;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x4k)) {
            return false;
        }
        x4k x4kVar = (x4k) obj;
        return this.f40268a == x4kVar.f40268a && Intrinsics.d(this.b, x4kVar.b);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f40268a) * 31;
        Long l = this.b;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "DeleteFavoriteChampRequest(champId=" + this.f40268a + ", subSportId=" + this.b + Separators.RPAREN;
    }

    public x4k(Long l, long j) {
        this.f40268a = j;
        this.b = l;
    }
}
