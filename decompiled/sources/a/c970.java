package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c970 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3949a;
    public final csr b;
    public final b970 c;

    public c970(boolean z, csr csrVar, b970 b970Var) {
        csrVar.getClass();
        this.f3949a = z;
        this.b = csrVar;
        this.c = b970Var;
    }

    public static c970 a(c970 c970Var, boolean z, csr csrVar, b970 b970Var, int i) {
        if ((i & 1) != 0) {
            z = c970Var.f3949a;
        }
        if ((i & 2) != 0) {
            csrVar = c970Var.b;
        }
        if ((i & 4) != 0) {
            b970Var = c970Var.c;
        }
        csrVar.getClass();
        return new c970(z, csrVar, b970Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c970)) {
            return false;
        }
        c970 c970Var = (c970) obj;
        return this.f3949a == c970Var.f3949a && Intrinsics.d(this.b, c970Var.b) && this.c == c970Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.f3949a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "OneXGamesWebGameBonusState(bonusAvailable=" + this.f3949a + ", activeBonus=" + this.b + ", bonusSelectPlace=" + this.c + ", hasGamesWildFreebet=false)";
    }
}
