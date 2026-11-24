package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class tod implements znd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tdp0 f34279a;
    public final j83 b;

    public tod(tdp0 tdp0Var, j83 j83Var) {
        this.f34279a = tdp0Var;
        this.b = j83Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tod)) {
            return false;
        }
        tod todVar = (tod) obj;
        return this.f34279a.equals(todVar.f34279a) && this.b.equals(todVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f34279a.f33780a.hashCode() * 31);
    }

    public final String toString() {
        return "SingleTeam(team=" + this.f34279a + ", matchInfo=" + ((Object) this.b) + Separators.RPAREN;
    }
}
