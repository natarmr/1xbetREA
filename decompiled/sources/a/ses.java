package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class ses extends wes {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ank0 f32088a;

    public ses(ank0 ank0Var) {
        this.f32088a = ank0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ses) && this.f32088a.equals(((ses) obj).f32088a);
    }

    public final int hashCode() {
        return this.f32088a.f1159a.hashCode();
    }

    public final String toString() {
        return w6x.p("TeamOneScoreChanged(teamOneScore=", this.f32088a, Separators.RPAREN);
    }
}
