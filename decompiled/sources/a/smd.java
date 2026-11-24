package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class smd extends umd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ank0 f32438a;

    public smd(ank0 ank0Var) {
        this.f32438a = ank0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof smd) && this.f32438a.equals(((smd) obj).f32438a);
    }

    public final int hashCode() {
        return this.f32438a.f1159a.hashCode();
    }

    public final String toString() {
        return w6x.p("MatchDescriptionChanged(matchDescription=", this.f32438a, Separators.RPAREN);
    }
}
