package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class kij0 implements p6t0, s0h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lij0 f18341a;
    public final lij0 b;
    public final lij0 c;
    public final lij0 d;
    public final lij0 e;
    public final lij0 f;
    public final lij0 g;
    public final lij0 h;
    public final lij0 i;
    public final lij0 j;

    public kij0(lij0 lij0Var, lij0 lij0Var2, lij0 lij0Var3, lij0 lij0Var4, lij0 lij0Var5, lij0 lij0Var6, lij0 lij0Var7, lij0 lij0Var8, lij0 lij0Var9, lij0 lij0Var10) {
        this.f18341a = lij0Var;
        this.b = lij0Var2;
        this.c = lij0Var3;
        this.d = lij0Var4;
        this.e = lij0Var5;
        this.f = lij0Var6;
        this.g = lij0Var7;
        this.h = lij0Var8;
        this.i = lij0Var9;
        this.j = lij0Var10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kij0)) {
            return false;
        }
        kij0 kij0Var = (kij0) obj;
        return this.f18341a.equals(kij0Var.f18341a) && this.b.equals(kij0Var.b) && this.c.equals(kij0Var.c) && this.d.equals(kij0Var.d) && this.e.equals(kij0Var.e) && this.f.equals(kij0Var.f) && this.g.equals(kij0Var.g) && this.h.equals(kij0Var.h) && this.i.equals(kij0Var.i) && this.j.equals(kij0Var.j);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "SETTOE_MEZZO_RULES_KEY";
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + ((this.f18341a.hashCode() - 281164152) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SettoeMezzoCostRuleAllUiModel(key=SETTOE_MEZZO_RULES_KEY, firstRule=" + this.f18341a + ", secondRule=" + this.b + ", thirdRule=" + this.c + ", fourthRule=" + this.d + ", fiveRule=" + this.e + ", sixRule=" + this.f + ", sevenRule=" + this.g + ", eightRule=" + this.h + ", nineRule=" + this.i + ", tenRule=" + this.j + Separators.RPAREN;
    }
}
