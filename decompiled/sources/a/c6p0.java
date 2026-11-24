package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c6p0 implements d6p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3829a;
    public final a4x b;
    public final a4x c;

    public c6p0(String str, a4x a4xVar, a4x a4xVar2) {
        str.getClass();
        a4xVar.getClass();
        a4xVar2.getClass();
        this.f3829a = str;
        this.b = a4xVar;
        this.c = a4xVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6p0)) {
            return false;
        }
        c6p0 c6p0Var = (c6p0) obj;
        return Intrinsics.d(this.f3829a, c6p0Var.f3829a) && Intrinsics.d(this.b, c6p0Var.b) && Intrinsics.d(this.c, c6p0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cs0.b(this.b, this.f3829a.hashCode() * 31, 31);
    }

    public final String toString() {
        return cs0.n(kng0.u("TeamCharacteristicsTwoTeamBlockUiModel(title=", this.f3829a, ", firstTeamCharacteristicsList=", this.b, ", secondTeamCharacteristicsList="), this.c, Separators.RPAREN);
    }
}
