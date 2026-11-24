package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class uhe implements die {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gtr f35673a;

    public uhe(gtr gtrVar) {
        this.f35673a = gtrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uhe) && this.f35673a.equals(((uhe) obj).f35673a);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f35673a.f11894a);
    }

    public final String toString() {
        return "Shimmers(content=" + this.f35673a + Separators.RPAREN;
    }
}
