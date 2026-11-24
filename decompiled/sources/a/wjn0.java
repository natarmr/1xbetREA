package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class wjn0 implements xjn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39271a;

    public final boolean equals(Object obj) {
        if (obj instanceof wjn0) {
            return this.f39271a == ((wjn0) obj).f39271a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f39271a);
    }

    public final String toString() {
        return ua80.e(this.f39271a, "TitleResId(value=", Separators.RPAREN);
    }
}
