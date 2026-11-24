package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class jlb0 implements llb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tsm f16708a;
    public final a4x b;
    public final npo c;

    public jlb0(tsm tsmVar, i4 i4Var, npo npoVar) {
        i4Var.getClass();
        this.f16708a = tsmVar;
        this.b = i4Var;
        this.c = npoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jlb0)) {
            return false;
        }
        jlb0 jlb0Var = (jlb0) obj;
        return Intrinsics.d(this.f16708a, jlb0Var.f16708a) && Intrinsics.d(this.b, jlb0Var.b) && this.c == jlb0Var.c;
    }

    public final int hashCode() {
        tsm tsmVar = this.f16708a;
        return this.c.hashCode() + cs0.b(this.b, (tsmVar == null ? 0 : tsmVar.hashCode()) * 31, 31);
    }

    public final String toString() {
        return "Loading(sportsCollectionModel=" + this.f16708a + ", highRatedChampsShimmers=" + this.b + ", expressCardStyle=" + this.c + Separators.RPAREN;
    }
}
