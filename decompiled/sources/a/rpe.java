package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class rpe implements tpe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30883a;

    public rpe(int i) {
        this.f30883a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rpe) && this.f30883a == ((rpe) obj).f30883a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f30883a);
    }

    public final String toString() {
        return ua80.e(this.f30883a, "Digit(value=", Separators.RPAREN);
    }
}
