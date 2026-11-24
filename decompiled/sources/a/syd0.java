package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class syd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ezd0 f33020a;
    public final ezd0 b;

    public syd0(ezd0 ezd0Var, ezd0 ezd0Var2) {
        this.f33020a = ezd0Var;
        this.b = ezd0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof syd0)) {
            return false;
        }
        syd0 syd0Var = (syd0) obj;
        return this.f33020a.equals(syd0Var.f33020a) && this.b.equals(syd0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f33020a.hashCode() * 31);
    }

    public final String toString() {
        return "RainbowStatisticMatchesComparisonModel(team1=" + this.f33020a + ", team2=" + this.b + Separators.RPAREN;
    }
}
