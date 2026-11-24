package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class zpa extends dqa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zmk0 f44750a;

    public zpa(zmk0 zmk0Var) {
        this.f44750a = zmk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zpa) && this.f44750a.equals(((zpa) obj).f44750a);
    }

    public final int hashCode() {
        return this.f44750a.hashCode();
    }

    public final String toString() {
        return dw9.p("TeamOneTennisGameScore(score=", this.f44750a, Separators.RPAREN);
    }
}
