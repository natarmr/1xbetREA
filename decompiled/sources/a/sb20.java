package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class sb20 implements yc20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31911a;

    public sb20(String str) {
        this.f31911a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sb20) && this.f31911a.equals(((sb20) obj).f31911a);
    }

    public final int hashCode() {
        return this.f31911a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowBetExistsErrorDialog(errorMessage=", this.f31911a, Separators.RPAREN);
    }
}
