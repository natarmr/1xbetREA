package a;

import android.gov.nist.core.Separators;
import org.xplatform.related.api.presentation.RelatedParams;

/* JADX INFO: loaded from: classes6.dex */
public final class fdn implements gdn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final udl0 f9365a;
    public final RelatedParams b;

    public fdn(udl0 udl0Var, RelatedParams relatedParams) {
        this.f9365a = udl0Var;
        this.b = relatedParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fdn)) {
            return false;
        }
        fdn fdnVar = (fdn) obj;
        return this.f9365a == fdnVar.f9365a && this.b.equals(fdnVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f9365a.hashCode() * 31);
    }

    public final String toString() {
        return "RelatedGames(sportGameType=" + this.f9365a + ", relatedParams=" + this.b + Separators.RPAREN;
    }
}
