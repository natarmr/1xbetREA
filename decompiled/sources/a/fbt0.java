package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class fbt0 implements ibt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9278a;

    public fbt0(int i) {
        this.f9278a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fbt0) && this.f9278a == ((fbt0) obj).f9278a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9278a);
    }

    public final String toString() {
        return ua80.e(this.f9278a, "OnDateFilterClick(index=", Separators.RPAREN);
    }
}
