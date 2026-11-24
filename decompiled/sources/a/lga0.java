package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class lga0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19999a;
    public final a4x b;

    public lga0(i4 i4Var, String str) {
        str.getClass();
        i4Var.getClass();
        this.f19999a = str;
        this.b = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lga0)) {
            return false;
        }
        lga0 lga0Var = (lga0) obj;
        return Intrinsics.d(this.f19999a, lga0Var.f19999a) && Intrinsics.d(this.b, lga0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f19999a.hashCode() * 31);
    }

    public final String toString() {
        return f140.m("PlayersLevelAbilitiesUiModel(level=", this.f19999a, ", abilities=", this.b, Separators.RPAREN);
    }
}
