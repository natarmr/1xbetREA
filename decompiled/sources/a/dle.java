package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class dle extends zy5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f6276a;
    public final boolean b;

    public dle(double d, boolean z) {
        this.f6276a = d;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dle)) {
            return false;
        }
        dle dleVar = (dle) obj;
        return Double.compare(this.f6276a, dleVar.f6276a) == 0 && this.b == dleVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Double.hashCode(this.f6276a) * 31);
    }

    public final String toString() {
        return "AutoSpinGameFinished(summ=" + this.f6276a + ", draw=" + this.b + Separators.RPAREN;
    }
}
