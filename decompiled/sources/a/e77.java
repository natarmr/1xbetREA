package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class e77 implements h77 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7318a;

    public final boolean equals(Object obj) {
        if (obj instanceof e77) {
            return this.f7318a.equals(((e77) obj).f7318a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7318a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowServerError(message=", this.f7318a, Separators.RPAREN);
    }
}
