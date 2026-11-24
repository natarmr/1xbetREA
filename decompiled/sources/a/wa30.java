package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class wa30 implements xa30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38810a;

    public final boolean equals(Object obj) {
        if (obj instanceof wa30) {
            return this.f38810a == ((wa30) obj).f38810a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f38810a);
    }

    public final String toString() {
        return ua80.e(this.f38810a, "ShowFavoriteErrorMessage(messageResId=", Separators.RPAREN);
    }
}
