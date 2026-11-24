package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g3b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zh0 f10602a;
    public final di0 b;

    public g3b(zh0 zh0Var, di0 di0Var) {
        zh0Var.getClass();
        this.f10602a = zh0Var;
        this.b = di0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g3b)) {
            return false;
        }
        g3b g3bVar = (g3b) obj;
        return this.f10602a == g3bVar.f10602a && Intrinsics.d(this.b, g3bVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.f10602a.hashCode() * 31;
        di0 di0Var = this.b;
        return iHashCode + (di0Var == null ? 0 : di0Var.hashCode());
    }

    public final String toString() {
        return "CategoriesUIModel(style=" + this.f10602a + ", uiModel=" + this.b + Separators.RPAREN;
    }
}
