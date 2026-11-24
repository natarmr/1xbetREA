package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class za40 implements ab40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xb40 f44052a;

    public za40(xb40 xb40Var) {
        this.f44052a = xb40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof za40) && this.f44052a == ((za40) obj).f44052a;
    }

    public final int hashCode() {
        return this.f44052a.hashCode();
    }

    public final String toString() {
        return "OnRoleSelect(selectedRole=" + this.f44052a + Separators.RPAREN;
    }
}
