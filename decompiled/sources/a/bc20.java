package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class bc20 implements yc20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2334a;

    public bc20(String str) {
        this.f2334a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bc20) && this.f2334a.equals(((bc20) obj).f2334a);
    }

    public final int hashCode() {
        return this.f2334a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowInsufficientFundsErrorDialog(errorMessage=", this.f2334a, Separators.RPAREN);
    }
}
