package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ew4 implements iw4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8502a;

    public ew4(String str) {
        this.f8502a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ew4) && this.f8502a.equals(((ew4) obj).f8502a);
    }

    public final int hashCode() {
        return this.f8502a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowBetExistsErrorDialog(errorMessage=", this.f8502a, Separators.RPAREN);
    }
}
