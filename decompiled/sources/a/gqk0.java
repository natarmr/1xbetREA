package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class gqk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final btk0 f11738a;
    public final o0 b;

    public gqk0(btk0 btk0Var, o0 o0Var) {
        btk0Var.getClass();
        this.f11738a = btk0Var;
        this.b = o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gqk0)) {
            return false;
        }
        gqk0 gqk0Var = (gqk0) obj;
        return Intrinsics.d(this.f11738a, gqk0Var.f11738a) && Intrinsics.d(this.b, gqk0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.f11738a.hashCode() * 31;
        o0 o0Var = this.b;
        return iHashCode + (o0Var == null ? 0 : o0Var.hashCode());
    }

    public final String toString() {
        return "SpecialEventTabAboutTournamentStateModel(contentStatus=" + this.f11738a + ", content=" + this.b + Separators.RPAREN;
    }
}
