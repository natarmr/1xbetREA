package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class p8l0 implements r8l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26561a;

    public p8l0(int i) {
        this.f26561a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p8l0) && this.f26561a == ((p8l0) obj).f26561a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f26561a);
    }

    public final String toString() {
        return ua80.e(this.f26561a, "Icon(value=", Separators.RPAREN);
    }
}
