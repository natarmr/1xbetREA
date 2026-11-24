package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class uxr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36456a;
    public final sso0 b;

    public uxr0(String str, sso0 sso0Var) {
        str.getClass();
        this.f36456a = str;
        this.b = sso0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uxr0)) {
            return false;
        }
        uxr0 uxr0Var = (uxr0) obj;
        return Intrinsics.d(this.f36456a, uxr0Var.f36456a) && this.b.equals(uxr0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f36456a.hashCode() * 31);
    }

    public final String toString() {
        return "TournamentBracketSwissSectionHeaderUiModel(scoreText=" + this.f36456a + ", scoreTagStyle=" + this.b + Separators.RPAREN;
    }
}
