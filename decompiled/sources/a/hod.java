package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class hod implements znd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tdp0 f13389a;
    public final j83 b;

    public hod(tdp0 tdp0Var, j83 j83Var) {
        this.f13389a = tdp0Var;
        this.b = j83Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hod)) {
            return false;
        }
        hod hodVar = (hod) obj;
        return this.f13389a.equals(hodVar.f13389a) && this.b.equals(hodVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f13389a.f33780a.hashCode() * 31);
    }

    public final String toString() {
        return "SingleTeam(team=" + this.f13389a + ", matchInfo=" + ((Object) this.b) + Separators.RPAREN;
    }
}
