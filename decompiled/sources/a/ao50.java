package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ao50 implements mo50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1185a;

    public ao50(int i) {
        this.f1185a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ao50) && this.f1185a == ((ao50) obj).f1185a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1185a);
    }

    public final String toString() {
        return ua80.e(this.f1185a, "OnPagerInteractionChange(newPageIndex=", Separators.RPAREN);
    }
}
