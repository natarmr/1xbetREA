package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ki1 implements li1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mtl f18314a;
    public final col b;

    public ki1(mtl mtlVar, col colVar) {
        mtlVar.getClass();
        this.f18314a = mtlVar;
        this.b = colVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ki1)) {
            return false;
        }
        ki1 ki1Var = (ki1) obj;
        return Intrinsics.d(this.f18314a, ki1Var.f18314a) && this.b.equals(ki1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f18314a.f22376a.hashCode() * 31);
    }

    public final String toString() {
        return "Loading(bottomBarUiModel=" + this.f18314a + ", providersCardCollectionUiModel=" + this.b + Separators.RPAREN;
    }
}
