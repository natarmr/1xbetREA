package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class xlf implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f41070a;

    public final boolean equals(Object obj) {
        if (obj instanceof xlf) {
            return this.f41070a == ((xlf) obj).f41070a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f41070a);
    }

    public final String toString() {
        return axq.h(this.f41070a, "BombTime(value=", Separators.RPAREN);
    }
}
