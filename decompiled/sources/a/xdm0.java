package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class xdm0 implements zdm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eme f40701a;

    public xdm0(eme emeVar) {
        emeVar.getClass();
        this.f40701a = emeVar;
    }

    @Override // a.zdm0
    public final eme a() {
        return this.f40701a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xdm0) && this.f40701a == ((xdm0) obj).f40701a;
    }

    public final int hashCode() {
        return this.f40701a.hashCode();
    }

    public final String toString() {
        return "Error(coreHeaderModel=" + this.f40701a + Separators.RPAREN;
    }
}
