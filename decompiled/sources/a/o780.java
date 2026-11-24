package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class o780 implements p780 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24774a;

    public final boolean equals(Object obj) {
        if (obj instanceof o780) {
            return this.f24774a == ((o780) obj).f24774a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f24774a);
    }

    public final String toString() {
        return ua80.e(this.f24774a, "OnThemeSelected(themeId=", Separators.RPAREN);
    }
}
