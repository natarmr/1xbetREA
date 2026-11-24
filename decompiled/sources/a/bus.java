package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class bus extends dus {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3248a;

    public bus(int i) {
        this.f3248a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bus) && this.f3248a == ((bus) obj).f3248a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3248a);
    }

    public final String toString() {
        return ua80.e(this.f3248a, "BroadcastingTabUiModel(scrolledPosition=", Separators.RPAREN);
    }
}
