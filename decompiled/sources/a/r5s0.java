package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class r5s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f29904a;
    public final List b;
    public final a4x c;

    public r5s0(List list, List list2, a4x a4xVar) {
        list.getClass();
        list2.getClass();
        a4xVar.getClass();
        this.f29904a = list;
        this.b = list2;
        this.c = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r5s0)) {
            return false;
        }
        r5s0 r5s0Var = (r5s0) obj;
        return Intrinsics.d(this.f29904a, r5s0Var.f29904a) && Intrinsics.d(this.b, r5s0Var.b) && Intrinsics.d(this.c, r5s0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dw9.a(this.f29904a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return cs0.n(w6x.t("TournamentStageParts(orderedMatches=", ", centers=", this.f29904a, ", columns=", this.b), this.c, Separators.RPAREN);
    }
}
