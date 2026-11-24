package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ho5 implements jo5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13378a;

    public final boolean equals(Object obj) {
        if (obj instanceof ho5) {
            return this.f13378a == ((ho5) obj).f13378a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13378a);
    }

    public final String toString() {
        return ua80.e(this.f13378a, "BallImageUiModel(iconResId=", Separators.RPAREN);
    }
}
