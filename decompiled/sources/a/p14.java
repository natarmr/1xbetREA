package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class p14 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26181a;

    public final boolean equals(Object obj) {
        if (obj instanceof p14) {
            return this.f26181a == ((p14) obj).f26181a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f26181a);
    }

    public final String toString() {
        return ua80.e(this.f26181a, "AttrUiModel(value=", Separators.RPAREN);
    }
}
