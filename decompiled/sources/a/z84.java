package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class z84 implements b94 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43949a;

    public z84(String str) {
        this.f43949a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z84) && this.f43949a.equals(((z84) obj).f43949a);
    }

    public final int hashCode() {
        return this.f43949a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowSnackbar(message=", this.f43949a, Separators.RPAREN);
    }
}
