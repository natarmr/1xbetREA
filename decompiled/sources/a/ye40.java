package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ye40 implements ef40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vbj f42470a;

    public ye40(vbj vbjVar) {
        this.f42470a = vbjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ye40) && this.f42470a.equals(((ye40) obj).f42470a);
    }

    @Override // a.ef40
    public final vbj getState() {
        return this.f42470a;
    }

    public final int hashCode() {
        return this.f42470a.hashCode();
    }

    public final String toString() {
        return "RegistrationBonusBanner(state=" + this.f42470a + Separators.RPAREN;
    }
}
