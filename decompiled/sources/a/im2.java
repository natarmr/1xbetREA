package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class im2 implements vm2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final js0 f15005a;

    public final boolean equals(Object obj) {
        if (obj instanceof im2) {
            return this.f15005a.equals(((im2) obj).f15005a);
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f15005a.f17026a);
    }

    public final String toString() {
        return "AggregatorClicked(value=" + this.f15005a + Separators.RPAREN;
    }
}
