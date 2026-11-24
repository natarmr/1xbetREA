package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class tdu0 implements wdu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33788a;

    public final boolean equals(Object obj) {
        if (obj instanceof tdu0) {
            return this.f33788a.equals(((tdu0) obj).f33788a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f33788a.hashCode();
    }

    public final String toString() {
        return kng0.l("SecondPlayerTotal(value=", this.f33788a, Separators.RPAREN);
    }
}
