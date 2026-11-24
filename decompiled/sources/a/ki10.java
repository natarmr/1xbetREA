package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ki10 implements li10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18315a;

    public ki10(int i) {
        this.f18315a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ki10) && this.f18315a == ((ki10) obj).f18315a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f18315a);
    }

    public final String toString() {
        return ua80.e(this.f18315a, "LastLevel(levelPoints=", Separators.RPAREN);
    }
}
