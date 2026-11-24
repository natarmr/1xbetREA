package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class wd5 implements be5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38957a;

    public final boolean equals(Object obj) {
        if (obj instanceof wd5) {
            return this.f38957a.equals(((wd5) obj).f38957a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f38957a.hashCode();
    }

    public final String toString() {
        return kng0.l("Medium(urn=", this.f38957a, Separators.RPAREN);
    }
}
