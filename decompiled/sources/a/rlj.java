package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class rlj extends upj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30700a;
    public final r080 b;

    public rlj(String str, r080 r080Var) {
        this.f30700a = str;
        this.b = r080Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rlj)) {
            return false;
        }
        rlj rljVar = (rlj) obj;
        return this.f30700a.equals(rljVar.f30700a) && this.b == rljVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + ua80.b(Boolean.hashCode(false) * 31, 31, this.f30700a);
    }

    public final String toString() {
        return "Authenticator(hasBackStack=false, operationGuid=" + this.f30700a + ", operationConfirmation=" + this.b + Separators.RPAREN;
    }
}
