package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class zmf implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final srf f44623a;

    public final boolean equals(Object obj) {
        if (obj instanceof zmf) {
            return this.f44623a.equals(((zmf) obj).f44623a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f44623a.hashCode();
    }

    public final String toString() {
        return "FivePlayer(value=" + this.f44623a + Separators.RPAREN;
    }
}
