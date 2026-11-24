package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class j310 implements l310 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15809a;

    public final boolean equals(Object obj) {
        if (obj instanceof j310) {
            return this.f15809a.equals(((j310) obj).f15809a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15809a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowSnackbar(message=", this.f15809a, Separators.RPAREN);
    }
}
