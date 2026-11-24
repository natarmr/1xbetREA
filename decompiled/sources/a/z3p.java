package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class z3p implements d4p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f43732a;

    public z3p(i4 i4Var) {
        i4Var.getClass();
        this.f43732a = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z3p) && Intrinsics.d(this.f43732a, ((z3p) obj).f43732a);
    }

    public final int hashCode() {
        return this.f43732a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f43732a, "Content(cardList=", Separators.RPAREN);
    }
}
