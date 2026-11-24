package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class i9e implements k9e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14381a;

    public i9e(int i) {
        this.f14381a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i9e) && this.f14381a == ((i9e) obj).f14381a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f14381a);
    }

    public final String toString() {
        return ua80.e(this.f14381a, "ScrollToNewMessagesLabel(position=", Separators.RPAREN);
    }
}
