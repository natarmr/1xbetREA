package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class v1z implements fm80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f36657a;

    public v1z(Long l) {
        this.f36657a = l;
    }

    @Override // a.fm80
    public final int a() {
        return 15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v1z) && Intrinsics.d(this.f36657a, ((v1z) obj).f36657a);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(15) * 31;
        Long l = this.f36657a;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "LastIdPagingRequest(limit=15, lastId=" + this.f36657a + Separators.RPAREN;
    }
}
