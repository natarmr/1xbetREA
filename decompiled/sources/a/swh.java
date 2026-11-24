package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class swh {
    public static final qwh Companion = new qwh();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f32921a;
    public final byh b;

    static {
        ayh ayhVar = byh.Companion;
    }

    public /* synthetic */ swh(int i, Long l, byh byhVar) {
        if ((i & 1) == 0) {
            this.f32921a = null;
        } else {
            this.f32921a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = byhVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof swh)) {
            return false;
        }
        swh swhVar = (swh) obj;
        return Intrinsics.d(this.f32921a, swhVar.f32921a) && Intrinsics.d(this.b, swhVar.b);
    }

    public final int hashCode() {
        Long l = this.f32921a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        byh byhVar = this.b;
        return iHashCode + (byhVar != null ? byhVar.hashCode() : 0);
    }

    public final String toString() {
        return "CyclingResponse(sportId=" + this.f32921a + ", response=" + this.b + Separators.RPAREN;
    }
}
