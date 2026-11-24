package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class uqr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36131a;
    public final j83 b;
    public final String c;
    public final jg30 d;

    public uqr(String str, j83 j83Var, String str2, jg30 jg30Var) {
        this.f36131a = str;
        this.b = j83Var;
        this.c = str2;
        this.d = jg30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uqr)) {
            return false;
        }
        uqr uqrVar = (uqr) obj;
        return this.f36131a.equals(uqrVar.f36131a) && this.b.equals(uqrVar.b) && this.c.equals(uqrVar.c) && Intrinsics.d(this.d, uqrVar.d);
    }

    public final int hashCode() {
        int iB = ua80.b(brm0.f(this.b, this.f36131a.hashCode() * 31, 31), 31, this.c);
        jg30 jg30Var = this.d;
        return iB + (jg30Var == null ? 0 : jg30Var.hashCode());
    }

    public final String toString() {
        return "GameBoardLabelsUiModel(gameName=" + this.f36131a + ", gameInfo=" + ((Object) this.b) + ", championshipUrl=" + this.c + ", timer=" + this.d + Separators.RPAREN;
    }
}
