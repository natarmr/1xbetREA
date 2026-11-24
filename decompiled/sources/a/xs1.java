package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class xs1 implements zs1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f41392a;

    public xs1(a4x a4xVar) {
        a4xVar.getClass();
        this.f41392a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xs1) && Intrinsics.d(this.f41392a, ((xs1) obj).f41392a);
    }

    public final int hashCode() {
        return this.f41392a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f41392a, "TournamentRules(items=", Separators.RPAREN);
    }
}
