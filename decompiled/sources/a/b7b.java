package a;

import android.gov.nist.core.Separators;
import org.xplatform.related.api.presentation.RelatedParams;

/* JADX INFO: loaded from: classes6.dex */
public final class b7b implements d7b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final udl0 f2098a;
    public final RelatedParams b;

    public b7b(udl0 udl0Var, RelatedParams relatedParams) {
        this.f2098a = udl0Var;
        this.b = relatedParams;
    }

    @Override // a.d7b
    public final udl0 b() {
        return this.f2098a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b7b)) {
            return false;
        }
        b7b b7bVar = (b7b) obj;
        return this.f2098a == b7bVar.f2098a && this.b.equals(b7bVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f2098a.hashCode() * 31);
    }

    public final String toString() {
        return "RelatedGames(sportGameType=" + this.f2098a + ", relatedParams=" + this.b + Separators.RPAREN;
    }
}
