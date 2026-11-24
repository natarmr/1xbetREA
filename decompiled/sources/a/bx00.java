package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class bx00 implements dx00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3353a;

    public final boolean equals(Object obj) {
        if (obj instanceof bx00) {
            return this.f3353a == ((bx00) obj).f3353a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3353a);
    }

    public final String toString() {
        return ua80.e(this.f3353a, "Res(value=", Separators.RPAREN);
    }
}
