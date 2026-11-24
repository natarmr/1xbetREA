package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class tvo0 implements uvo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j83 f34610a;
    public final a4x b;

    public tvo0(j83 j83Var, a4x a4xVar) {
        a4xVar.getClass();
        this.f34610a = j83Var;
        this.b = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tvo0)) {
            return false;
        }
        tvo0 tvo0Var = (tvo0) obj;
        return this.f34610a.equals(tvo0Var.f34610a) && Intrinsics.d(this.b, tvo0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f34610a.hashCode() * 31);
    }

    public final String toString() {
        return "TaxContent(payDiffValue=" + ((Object) this.f34610a) + ", taxSpoilerParamUiItemsList=" + this.b + Separators.RPAREN;
    }
}
