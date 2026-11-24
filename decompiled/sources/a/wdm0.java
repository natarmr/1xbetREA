package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class wdm0 implements zdm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eme f38980a;

    public wdm0(eme emeVar) {
        emeVar.getClass();
        this.f38980a = emeVar;
    }

    @Override // a.zdm0
    public final eme a() {
        return this.f38980a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wdm0) && this.f38980a == ((wdm0) obj).f38980a;
    }

    public final int hashCode() {
        return this.f38980a.hashCode();
    }

    public final String toString() {
        return "Empty(coreHeaderModel=" + this.f38980a + Separators.RPAREN;
    }
}
