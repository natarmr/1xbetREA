package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ejp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bop0 f7920a;

    public ejp0(bop0 bop0Var) {
        this.f7920a = bop0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ejp0) && this.f7920a == ((ejp0) obj).f7920a;
    }

    public final int hashCode() {
        return this.f7920a.hashCode();
    }

    public final String toString() {
        return "SendSelectedTeam(team=" + this.f7920a + Separators.RPAREN;
    }
}
