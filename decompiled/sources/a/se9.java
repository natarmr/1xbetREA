package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class se9 implements xe9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32067a;

    public se9(int i) {
        this.f32067a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof se9) && this.f32067a == ((se9) obj).f32067a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f32067a);
    }

    public final String toString() {
        return ua80.e(this.f32067a, "IconCircle(iconResId=", Separators.RPAREN);
    }
}
