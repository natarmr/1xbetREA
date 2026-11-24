package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class kpk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wnk0 f18681a;
    public final z1d b;
    public final owk0 c;
    public final mwk0 d;
    public final kwk0 e;

    public kpk0(wnk0 wnk0Var, z1d z1dVar, owk0 owk0Var, mwk0 mwk0Var, kwk0 kwk0Var) {
        wnk0Var.getClass();
        z1dVar.getClass();
        owk0Var.getClass();
        mwk0Var.getClass();
        kwk0Var.getClass();
        this.f18681a = wnk0Var;
        this.b = z1dVar;
        this.c = owk0Var;
        this.d = mwk0Var;
        this.e = kwk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kpk0)) {
            return false;
        }
        kpk0 kpk0Var = (kpk0) obj;
        return Intrinsics.d(this.f18681a, kpk0Var.f18681a) && Intrinsics.d(this.b, kpk0Var.b) && Intrinsics.d(this.c, kpk0Var.c) && Intrinsics.d(this.d, kpk0Var.d) && Intrinsics.d(this.e, kpk0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f18681a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SpecialEventMainUiState(collapsingHeader=" + this.f18681a + ", collapsingHeaderBackground=" + this.b + ", toolbarContent=" + this.c + ", tabsUiModel=" + this.d + ", tabsContentUiModel=" + this.e + Separators.RPAREN;
    }
}
