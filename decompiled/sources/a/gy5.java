package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class gy5 extends zy5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f12109a;

    public gy5(double d) {
        this.f12109a = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gy5) && Double.compare(this.f12109a, ((gy5) obj).f12109a) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f12109a);
    }

    public final String toString() {
        return "BetSumPreviewChangedCommand(previewBetSum=" + this.f12109a + Separators.RPAREN;
    }
}
