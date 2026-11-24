package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class s8v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f31821a;
    public final a4x b;
    public final bfo0 c;
    public final boolean d;

    public s8v(imm immVar, a4x a4xVar, bfo0 bfo0Var, boolean z) {
        bfo0Var.getClass();
        this.f31821a = immVar;
        this.b = a4xVar;
        this.c = bfo0Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s8v)) {
            return false;
        }
        s8v s8vVar = (s8v) obj;
        return this.f31821a.equals(s8vVar.f31821a) && this.b.equals(s8vVar.b) && this.c == s8vVar.c && this.d == s8vVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + cs0.b(this.b, this.f31821a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "GlobalSearchContainerUiState(navigationBarUiModel=" + this.f31821a + ", items=" + this.b + ", selectedTab=" + this.c + ", showChips=" + this.d + Separators.RPAREN;
    }
}
