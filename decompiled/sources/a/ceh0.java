package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ceh0 implements ieh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4212a;

    public final boolean equals(Object obj) {
        if (obj instanceof ceh0) {
            return this.f4212a.equals(((ceh0) obj).f4212a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4212a.hashCode();
    }

    public final String toString() {
        return kng0.l("PlayerTwoIcon(value=", this.f4212a, Separators.RPAREN);
    }
}
