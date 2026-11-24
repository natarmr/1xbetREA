package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class txo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ojp0 f34712a;

    public txo0(ojp0 ojp0Var) {
        this.f34712a = ojp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof txo0) && this.f34712a.equals(((txo0) obj).f34712a);
    }

    public final int hashCode() {
        return this.f34712a.hashCode();
    }

    public final String toString() {
        return "SendSelectedTeam(teamSelectorModel=" + this.f34712a + Separators.RPAREN;
    }
}
