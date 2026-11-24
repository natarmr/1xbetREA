package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class tmh0 implements vmh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34195a;

    public final boolean equals(Object obj) {
        if (obj instanceof tmh0) {
            return this.f34195a.equals(((tmh0) obj).f34195a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f34195a.hashCode();
    }

    public final String toString() {
        return kng0.l("Name(value=", this.f34195a, Separators.RPAREN);
    }
}
