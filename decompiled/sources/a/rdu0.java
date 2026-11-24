package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class rdu0 implements wdu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30306a;

    public final boolean equals(Object obj) {
        if (obj instanceof rdu0) {
            return this.f30306a.equals(((rdu0) obj).f30306a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f30306a.hashCode();
    }

    public final String toString() {
        return kng0.l("SecondPlayerSecondNumber(value=", this.f30306a, Separators.RPAREN);
    }
}
