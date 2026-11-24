package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.related.api.presentation.RelatedParams;

/* JADX INFO: loaded from: classes6.dex */
public final class y730 implements a830 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final udl0 f42131a;
    public final RelatedParams b;
    public final xef0 c;

    public y730(udl0 udl0Var, RelatedParams relatedParams, xef0 xef0Var) {
        xef0Var.getClass();
        this.f42131a = udl0Var;
        this.b = relatedParams;
        this.c = xef0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y730)) {
            return false;
        }
        y730 y730Var = (y730) obj;
        return this.f42131a == y730Var.f42131a && this.b.equals(y730Var.b) && Intrinsics.d(this.c, y730Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f42131a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "RelatedGames(sportGameType=" + this.f42131a + ", relatedParams=" + this.b + ", relatedUiModel=" + this.c + Separators.RPAREN;
    }
}
