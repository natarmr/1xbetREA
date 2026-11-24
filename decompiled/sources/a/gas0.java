package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class gas0 implements jas0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bol f10985a;
    public final mtl b;

    public gas0(bol bolVar, mtl mtlVar) {
        this.f10985a = bolVar;
        this.b = mtlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gas0)) {
            return false;
        }
        gas0 gas0Var = (gas0) obj;
        return this.f10985a.equals(gas0Var.f10985a) && Intrinsics.d(this.b, gas0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.f10985a.hashCode() * 31;
        mtl mtlVar = this.b;
        return iHashCode + (mtlVar == null ? 0 : mtlVar.f22376a.hashCode());
    }

    public final String toString() {
        return "Content(providersCardCollectionUiModel=" + this.f10985a + ", bottomBarModel=" + this.b + Separators.RPAREN;
    }
}
