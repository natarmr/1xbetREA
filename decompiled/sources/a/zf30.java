package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class zf30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f44284a;
    public final mmo b;

    public zf30(i4 i4Var, mmo mmoVar) {
        i4Var.getClass();
        this.f44284a = i4Var;
        this.b = mmoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zf30)) {
            return false;
        }
        zf30 zf30Var = (zf30) obj;
        return Intrinsics.d(this.f44284a, zf30Var.f44284a) && this.b.equals(zf30Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f44284a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchReviewUiModel(events=" + this.f44284a + ", btnUiModel=" + this.b + Separators.RPAREN;
    }
}
