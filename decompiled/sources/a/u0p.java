package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class u0p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34865a;
    public final a4x b;

    public u0p(i4 i4Var, String str) {
        str.getClass();
        i4Var.getClass();
        this.f34865a = str;
        this.b = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0p)) {
            return false;
        }
        u0p u0pVar = (u0p) obj;
        return Intrinsics.d(this.f34865a, u0pVar.f34865a) && Intrinsics.d(this.b, u0pVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f34865a.hashCode() * 31);
    }

    public final String toString() {
        return f140.m("FatalFuryRoundRowUiModel(roundNumber=", this.f34865a, ", cells=", this.b, Separators.RPAREN);
    }
}
