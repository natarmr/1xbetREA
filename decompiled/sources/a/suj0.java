package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class suj0 implements wuj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32824a;

    public suj0(String str) {
        this.f32824a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof suj0) && this.f32824a.equals(((suj0) obj).f32824a);
    }

    public final int hashCode() {
        return this.f32824a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowBetExistsErrorDialog(errorMessage=", this.f32824a, Separators.RPAREN);
    }
}
