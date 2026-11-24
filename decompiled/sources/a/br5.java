package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class br5 implements dr5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aq5 f3060a;

    public br5(aq5 aq5Var) {
        this.f3060a = aq5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof br5) && this.f3060a.equals(((br5) obj).f3060a);
    }

    public final int hashCode() {
        return this.f3060a.f1281a.hashCode();
    }

    public final String toString() {
        return "Loading(contentItems=" + this.f3060a + Separators.RPAREN;
    }
}
