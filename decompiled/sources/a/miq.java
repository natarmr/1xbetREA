package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class miq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21856a;
    public final long b;

    public miq(int i, long j) {
        this.f21856a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof miq)) {
            return false;
        }
        miq miqVar = (miq) obj;
        return this.f21856a == miqVar.f21856a && this.b == miqVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Integer.hashCode(this.f21856a) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = vqd.q(this.f21856a, this.b, "FixedGraphValueUiModel(value=", ", timeInSeconds=");
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
