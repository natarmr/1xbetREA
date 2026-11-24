package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class rwr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pr8 f31230a;
    public final a4x b;

    public rwr0(pr8 pr8Var, a4x a4xVar) {
        pr8Var.getClass();
        a4xVar.getClass();
        this.f31230a = pr8Var;
        this.b = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rwr0)) {
            return false;
        }
        rwr0 rwr0Var = (rwr0) obj;
        return this.f31230a == rwr0Var.f31230a && Intrinsics.d(this.b, rwr0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f31230a.hashCode() * 31);
    }

    public final String toString() {
        return "TournamentBracketColumnUiModel(widthType=" + this.f31230a + ", items=" + this.b + Separators.RPAREN;
    }
}
