package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class pvr implements uvr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27675a;

    public final boolean equals(Object obj) {
        if (obj instanceof pvr) {
            return this.f27675a.equals(((pvr) obj).f27675a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f27675a.hashCode();
    }

    public final String toString() {
        return kng0.l("Information(value=", this.f27675a, Separators.RPAREN);
    }
}
