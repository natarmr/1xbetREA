package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class cjp0 implements djp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bop0 f4473a;

    public cjp0(bop0 bop0Var) {
        this.f4473a = bop0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cjp0) && this.f4473a == ((cjp0) obj).f4473a;
    }

    public final int hashCode() {
        return this.f4473a.hashCode();
    }

    public final String toString() {
        return "OnTeamClick(team=" + this.f4473a + Separators.RPAREN;
    }
}
