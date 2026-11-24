package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class tjn0 implements xjn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34057a;

    public final boolean equals(Object obj) {
        if (obj instanceof tjn0) {
            return this.f34057a == ((tjn0) obj).f34057a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f34057a);
    }

    public final String toString() {
        return ua80.e(this.f34057a, "IconResId(value=", Separators.RPAREN);
    }
}
