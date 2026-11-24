package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ys1 implements zs1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f43146a;

    public ys1(a4x a4xVar) {
        a4xVar.getClass();
        this.f43146a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ys1) && Intrinsics.d(this.f43146a, ((ys1) obj).f43146a);
    }

    public final int hashCode() {
        return this.f43146a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f43146a, "TournamentRulesWithStages(items=", Separators.RPAREN);
    }
}
