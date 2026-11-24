package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class gfr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11219a;
    public final ArrayList b;

    public gfr(long j, ArrayList arrayList) {
        this.f11219a = j;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gfr)) {
            return false;
        }
        gfr gfrVar = (gfr) obj;
        return this.f11219a == gfrVar.f11219a && this.b.equals(gfrVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f11219a) * 31);
    }

    public final String toString() {
        return "FutureMatchModel(sportId=" + this.f11219a + ", events=" + this.b + Separators.RPAREN;
    }
}
