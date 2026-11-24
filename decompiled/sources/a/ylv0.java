package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ylv0 implements zlv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ydm0 f42861a;
    public final j9m0 b;
    public final llm0 c;
    public final boolean d;

    public ylv0(ydm0 ydm0Var, j9m0 j9m0Var, llm0 llm0Var, boolean z) {
        this.f42861a = ydm0Var;
        this.b = j9m0Var;
        this.c = llm0Var;
        this.d = z;
    }

    @Override // a.zlv0
    public final boolean a() {
        return this.d;
    }

    @Override // a.zlv0
    public final j9m0 b() {
        return this.b;
    }

    @Override // a.zlv0
    public final zdm0 c() {
        return this.f42861a;
    }

    @Override // a.zlv0
    public final llm0 d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ylv0)) {
            return false;
        }
        ylv0 ylv0Var = (ylv0) obj;
        return this.f42861a.equals(ylv0Var.f42861a) && this.b.equals(ylv0Var.b) && this.c == ylv0Var.c && this.d == ylv0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + w6x.h(this.b, this.f42861a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "Loading(statisticHeaderUiModel=" + this.f42861a + ", statisticBackgroundUiModel=" + this.b + ", screenStyle=" + this.c + ", rtlSupport=" + this.d + Separators.RPAREN;
    }
}
