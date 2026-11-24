package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class sg implements tg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32138a;

    public final boolean equals(Object obj) {
        if (obj instanceof sg) {
            return this.f32138a == ((sg) obj).f32138a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f32138a);
    }

    public final String toString() {
        return ua80.e(this.f32138a, "TitleColorRes(value=", Separators.RPAREN);
    }
}
