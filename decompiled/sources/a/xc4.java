package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class xc4 implements fd4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fn50 f40628a;

    public xc4(fn50 fn50Var) {
        this.f40628a = fn50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xc4) && this.f40628a == ((xc4) obj).f40628a;
    }

    public final int hashCode() {
        return this.f40628a.hashCode();
    }

    public final String toString() {
        return "HandleNewPlace(exception=" + this.f40628a + Separators.RPAREN;
    }
}
