package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class cen0 implements den0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aan0 f4221a;

    public cen0(aan0 aan0Var) {
        this.f4221a = aan0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cen0) && this.f4221a.equals(((cen0) obj).f4221a);
    }

    public final int hashCode() {
        return this.f4221a.hashCode();
    }

    public final String toString() {
        return "OnTeamIteamClicked(model=" + this.f4221a + Separators.RPAREN;
    }
}
