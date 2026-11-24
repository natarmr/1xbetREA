package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class cyr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uxr0 f5192a;
    public final a4x b;
    public final txr0 c;

    public cyr0(uxr0 uxr0Var, i4 i4Var, txr0 txr0Var) {
        i4Var.getClass();
        this.f5192a = uxr0Var;
        this.b = i4Var;
        this.c = txr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cyr0)) {
            return false;
        }
        cyr0 cyr0Var = (cyr0) obj;
        return this.f5192a.equals(cyr0Var.f5192a) && Intrinsics.d(this.b, cyr0Var.b) && this.c == cyr0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + cs0.b(this.b, this.f5192a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "TournamentBracketSwissSectionUiModel(headerUiModel=" + this.f5192a + ", matches=" + this.b + ", background=" + this.c + Separators.RPAREN;
    }
}
