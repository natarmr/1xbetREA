package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class l150 implements r150 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t150 f19233a;

    public l150(t150 t150Var) {
        this.f19233a = t150Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l150) && this.f19233a == ((l150) obj).f19233a;
    }

    public final int hashCode() {
        return this.f19233a.hashCode();
    }

    public final String toString() {
        return "OnClickRegistration(type=" + this.f19233a + Separators.RPAREN;
    }
}
