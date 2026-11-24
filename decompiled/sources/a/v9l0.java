package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class v9l0 implements x9l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37041a;

    public final boolean equals(Object obj) {
        if (obj instanceof v9l0) {
            return this.f37041a.equals(((v9l0) obj).f37041a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f37041a.hashCode();
    }

    public final String toString() {
        return kng0.l("Line(value=", this.f37041a, Separators.RPAREN);
    }
}
