package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class jun0 implements nun0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17164a;

    public jun0(String str) {
        this.f17164a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jun0) && this.f17164a.equals(((jun0) obj).f17164a);
    }

    public final int hashCode() {
        return this.f17164a.hashCode();
    }

    public final String toString() {
        return kng0.l("AddDepositError(errorMessage=", this.f17164a, Separators.RPAREN);
    }
}
