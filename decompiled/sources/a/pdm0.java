package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class pdm0 implements vdm0, rdm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26815a;
    public final znp0 b;
    public final znp0 c;
    public final p5h0 d;
    public final mom0 e;

    public pdm0(String str, znp0 znp0Var, znp0 znp0Var2, p5h0 p5h0Var, mom0 mom0Var) {
        str.getClass();
        this.f26815a = str;
        this.b = znp0Var;
        this.c = znp0Var2;
        this.d = p5h0Var;
        this.e = mom0Var;
    }

    @Override // a.rdm0
    public final znp0 a() {
        return this.b;
    }

    @Override // a.rdm0
    public final znp0 b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pdm0)) {
            return false;
        }
        pdm0 pdm0Var = (pdm0) obj;
        return Intrinsics.d(this.f26815a, pdm0Var.f26815a) && this.b.equals(pdm0Var.b) && this.c.equals(pdm0Var.c) && this.d.equals(pdm0Var.d) && this.e.equals(pdm0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f26815a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Cricket(eventTitle=" + this.f26815a + ", teamOne=" + this.b + ", teamTwo=" + this.c + ", scoreUiModel=" + this.d + ", gameStatusUiModel=" + this.e + Separators.RPAREN;
    }
}
