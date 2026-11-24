package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class bu70 implements cu70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3218a;

    public final boolean equals(Object obj) {
        if (obj instanceof bu70) {
            return this.f3218a.equals(((bu70) obj).f3218a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3218a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowPermissionRequestDialog(value=", this.f3218a, Separators.RPAREN);
    }
}
