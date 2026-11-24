package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class fbe implements gbe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9253a;
    public final int b;

    public fbe(boolean z, int i) {
        this.f9253a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fbe)) {
            return false;
        }
        fbe fbeVar = (fbe) obj;
        return this.f9253a == fbeVar.f9253a && this.b == fbeVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.f9253a) * 31);
    }

    public final String toString() {
        return "SendRating(resolved=" + this.f9253a + ", rating=" + this.b + Separators.RPAREN;
    }
}
