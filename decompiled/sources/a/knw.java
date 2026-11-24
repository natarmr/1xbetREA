package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class knw implements onw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f18605a;
    public final xmw b;
    public final j9m0 c;

    public knw(a4x a4xVar, xmw xmwVar, j9m0 j9m0Var) {
        a4xVar.getClass();
        this.f18605a = a4xVar;
        this.b = xmwVar;
        this.c = j9m0Var;
    }

    @Override // a.onw
    public final xmw a() {
        return this.b;
    }

    @Override // a.onw
    public final j9m0 b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof knw)) {
            return false;
        }
        knw knwVar = (knw) obj;
        return Intrinsics.d(this.f18605a, knwVar.f18605a) && this.b.equals(knwVar.b) && this.c.equals(knwVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f18605a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Content(horseMenuItemList=" + this.f18605a + ", horseMenuHeaderUiModel=" + this.b + ", statisticBackgroundUiModel=" + this.c + Separators.RPAREN;
    }
}
