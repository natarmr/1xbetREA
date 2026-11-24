package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class iso {
    public static final gso Companion = new gso();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jex f15314a;
    public final tdf b;

    public /* synthetic */ iso(int i, jex jexVar, tdf tdfVar) {
        if ((i & 1) == 0) {
            this.f15314a = null;
        } else {
            this.f15314a = jexVar;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = tdfVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iso)) {
            return false;
        }
        iso isoVar = (iso) obj;
        return Intrinsics.d(this.f15314a, isoVar.f15314a) && Intrinsics.d(this.b, isoVar.b);
    }

    public final int hashCode() {
        jex jexVar = this.f15314a;
        int iHashCode = (jexVar == null ? 0 : jexVar.hashCode()) * 31;
        tdf tdfVar = this.b;
        return iHashCode + (tdfVar != null ? tdfVar.hashCode() : 0);
    }

    public final String toString() {
        return "ExtendedScoreResponse(innsStats=" + this.f15314a + ", cricketScore=" + this.b + Separators.RPAREN;
    }
}
