package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ly00 implements yy00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uss f20842a;

    public final boolean equals(Object obj) {
        if (obj instanceof ly00) {
            return this.f20842a.equals(((ly00) obj).f20842a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20842a.hashCode();
    }

    public final String toString() {
        return "OnGameStreamAction(value=" + this.f20842a + Separators.RPAREN;
    }
}
