package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class nxr0 extends nsm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f24296a;

    public nxr0(i4 i4Var) {
        i4Var.getClass();
        this.f24296a = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nxr0) && Intrinsics.d(this.f24296a, ((nxr0) obj).f24296a);
    }

    public final int hashCode() {
        return this.f24296a.hashCode();
    }

    @Override // a.nsm0
    public final a4x r() {
        return this.f24296a;
    }

    public final String toString() {
        return h97.i(this.f24296a, "TournamentBracketStageSwiss(columns=", Separators.RPAREN);
    }
}
