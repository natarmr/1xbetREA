package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class m4j0 implements n4j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21174a;

    public final boolean equals(Object obj) {
        if (obj instanceof m4j0) {
            return this.f21174a.equals(((m4j0) obj).f21174a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21174a.hashCode();
    }

    public final String toString() {
        return kng0.l("ThirdValue(value=", this.f21174a, Separators.RPAREN);
    }
}
