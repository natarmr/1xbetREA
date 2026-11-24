package a;

import android.gov.nist.core.Separators;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class kkp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18453a;
    public final LinkedHashMap b;

    public kkp0(long j, LinkedHashMap linkedHashMap) {
        this.f18453a = j;
        this.b = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kkp0)) {
            return false;
        }
        kkp0 kkp0Var = (kkp0) obj;
        return this.f18453a == kkp0Var.f18453a && this.b.equals(kkp0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f18453a) * 31);
    }

    public final String toString() {
        return "TeamSquadStatisticModel(sportId=" + this.f18453a + ", playerStatisticMap=" + this.b + Separators.RPAREN;
    }
}
