package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class fr {
    public static final er Companion = new er();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9999a;
    public final Long b;

    public /* synthetic */ fr(int i, long j, Long l) {
        if (3 != (i & 3)) {
            m2x.I(i, 3, dr.f6537a.getDescriptor());
            throw null;
        }
        this.f9999a = j;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fr)) {
            return false;
        }
        fr frVar = (fr) obj;
        return this.f9999a == frVar.f9999a && Intrinsics.d(this.b, frVar.b);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f9999a) * 31;
        Long l = this.b;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "AddFavoriteChampRequest(champId=" + this.f9999a + ", subSportId=" + this.b + Separators.RPAREN;
    }

    public fr(Long l, long j) {
        this.f9999a = j;
        this.b = l;
    }
}
