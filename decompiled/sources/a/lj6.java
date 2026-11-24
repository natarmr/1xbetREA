package a;

import android.gov.nist.core.Separators;
import org.xplatform.related.api.presentation.RelatedParams;

/* JADX INFO: loaded from: classes6.dex */
public final class lj6 implements nj6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelatedParams f20135a;

    public lj6(RelatedParams relatedParams) {
        this.f20135a = relatedParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lj6) && this.f20135a.equals(((lj6) obj).f20135a);
    }

    public final int hashCode() {
        return this.f20135a.hashCode();
    }

    public final String toString() {
        return "RelatedGames(relatedParams=" + this.f20135a + Separators.RPAREN;
    }
}
