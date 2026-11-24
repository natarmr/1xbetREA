package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class oh3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25246a;

    public final boolean equals(Object obj) {
        if (obj instanceof oh3) {
            return this.f25246a == ((oh3) obj).f25246a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25246a);
    }

    public final String toString() {
        return ua80.e(this.f25246a, "AppStartUiState(step=", Separators.RPAREN);
    }
}
