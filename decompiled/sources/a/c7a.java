package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class c7a implements e7a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ynb0 f3852a;

    public c7a(ynb0 ynb0Var) {
        this.f3852a = ynb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c7a) && this.f3852a.equals(((c7a) obj).f3852a);
    }

    public final int hashCode() {
        return this.f3852a.hashCode();
    }

    public final String toString() {
        return "Success(powWrapper=" + this.f3852a + Separators.RPAREN;
    }
}
