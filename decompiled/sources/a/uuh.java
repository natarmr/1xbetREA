package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class uuh implements vuh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ydm0 f36299a;
    public final j9m0 b;
    public final llm0 c;
    public final boolean d;

    public uuh(ydm0 ydm0Var, j9m0 j9m0Var, llm0 llm0Var, boolean z) {
        this.f36299a = ydm0Var;
        this.b = j9m0Var;
        this.c = llm0Var;
        this.d = z;
    }

    @Override // a.vuh
    public final boolean a() {
        return this.d;
    }

    @Override // a.vuh
    public final j9m0 b() {
        return this.b;
    }

    @Override // a.vuh
    public final zdm0 c() {
        return this.f36299a;
    }

    @Override // a.vuh
    public final llm0 d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uuh)) {
            return false;
        }
        uuh uuhVar = (uuh) obj;
        return this.f36299a.equals(uuhVar.f36299a) && this.b.equals(uuhVar.b) && this.c == uuhVar.c && this.d == uuhVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + w6x.h(this.b, this.f36299a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "Loading(statisticHeaderUiModel=" + this.f36299a + ", statisticBackgroundUiModel=" + this.b + ", screenStyle=" + this.c + ", rtlSupport=" + this.d + Separators.RPAREN;
    }
}
