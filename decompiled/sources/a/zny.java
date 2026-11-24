package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class zny implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44694a;

    public final boolean equals(Object obj) {
        if (obj instanceof zny) {
            return this.f44694a == ((zny) obj).f44694a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f44694a);
    }

    public final String toString() {
        return ua80.e(this.f44694a, "KillsTextColor(value=", Separators.RPAREN);
    }
}
