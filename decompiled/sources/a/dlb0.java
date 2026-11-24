package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class dlb0 implements flb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6271a;

    public final boolean equals(Object obj) {
        if (obj instanceof dlb0) {
            return this.f6271a.equals(((dlb0) obj).f6271a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6271a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowErrorMessage(errorMessage=", this.f6271a, Separators.RPAREN);
    }
}
