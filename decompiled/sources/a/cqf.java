package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class cqf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f4792a;
    public final dqf b;

    public cqf(float f, dqf dqfVar) {
        this.f4792a = f;
        this.b = dqfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqf)) {
            return false;
        }
        cqf cqfVar = (cqf) obj;
        return Float.compare(this.f4792a, cqfVar.f4792a) == 0 && this.b == cqfVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.f4792a) * 31);
    }

    public final String toString() {
        return "Cs2PlayerDuelStatModel(valueStat=" + this.f4792a + ", statType=" + this.b + Separators.RPAREN;
    }
}
