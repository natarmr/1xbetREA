package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class xob0 implements yob0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41209a;

    public final boolean equals(Object obj) {
        if (obj instanceof xob0) {
            return this.f41209a.equals(((xob0) obj).f41209a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f41209a.hashCode();
    }

    public final String toString() {
        return kng0.l("SuccessSale(title=", this.f41209a, Separators.RPAREN);
    }
}
