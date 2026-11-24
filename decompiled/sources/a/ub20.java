package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ub20 implements ad20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35359a;

    public ub20(String str) {
        this.f35359a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ub20) && this.f35359a.equals(((ub20) obj).f35359a);
    }

    public final int hashCode() {
        return this.f35359a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowBetExistsErrorDialog(errorMessage=", this.f35359a, Separators.RPAREN);
    }
}
