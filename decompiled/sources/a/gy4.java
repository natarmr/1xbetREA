package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class gy4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12107a;

    public /* synthetic */ gy4(int i) {
        this.f12107a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gy4) {
            return this.f12107a == ((gy4) obj).f12107a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12107a);
    }

    public final String toString() {
        return ua80.e(this.f12107a, "AutoClearFocusBehavior(value=", Separators.RPAREN);
    }
}
