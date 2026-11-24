package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class ab30 implements db30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f561a;

    public ab30(String str) {
        this.f561a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ab30) && this.f561a.equals(((ab30) obj).f561a);
    }

    public final int hashCode() {
        return this.f561a.hashCode();
    }

    public final String toString() {
        return kng0.l("OneOpponent(title=", this.f561a, Separators.RPAREN);
    }
}
