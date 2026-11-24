package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.related.api.presentation.RelatedParams;

/* JADX INFO: loaded from: classes6.dex */
public final class rhx implements shx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final udl0 f30510a;
    public final RelatedParams b;
    public final xef0 c;

    public rhx(udl0 udl0Var, RelatedParams relatedParams, xef0 xef0Var) {
        xef0Var.getClass();
        this.f30510a = udl0Var;
        this.b = relatedParams;
        this.c = xef0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rhx)) {
            return false;
        }
        rhx rhxVar = (rhx) obj;
        return this.f30510a == rhxVar.f30510a && this.b.equals(rhxVar.b) && Intrinsics.d(this.c, rhxVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f30510a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "RelatedGames(sportGameType=" + this.f30510a + ", relatedParams=" + this.b + ", relatedUiModel=" + this.c + Separators.RPAREN;
    }
}
