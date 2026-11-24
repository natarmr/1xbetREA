package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class klp implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18502a;

    public final boolean equals(Object obj) {
        if (obj instanceof klp) {
            return this.f18502a == ((klp) obj).f18502a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f18502a);
    }

    public final String toString() {
        return ua80.e(this.f18502a, "GamesCount(value=", Separators.RPAREN);
    }
}
