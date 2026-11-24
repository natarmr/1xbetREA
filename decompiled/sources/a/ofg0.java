package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ofg0 implements rfg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25168a;

    public final boolean equals(Object obj) {
        if (obj instanceof ofg0) {
            return this.f25168a == ((ofg0) obj).f25168a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25168a);
    }

    public final String toString() {
        return ua80.e(this.f25168a, "CurrentValue(value=", Separators.RPAREN);
    }
}
