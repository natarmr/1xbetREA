package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class gjp implements ujp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final chq0 f11411a;

    public gjp(chq0 chq0Var) {
        this.f11411a = chq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gjp) && this.f11411a.equals(((gjp) obj).f11411a);
    }

    public final int hashCode() {
        return this.f11411a.hashCode();
    }

    public final String toString() {
        return "OnFilterChipClick(filter=" + this.f11411a + Separators.RPAREN;
    }
}
