package a;

import android.gov.nist.core.Separators;
import org.xplatform.related.api.presentation.RelatedParams;

/* JADX INFO: loaded from: classes5.dex */
public final class yal0 implements abl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelatedParams f42305a;

    public yal0(RelatedParams relatedParams) {
        this.f42305a = relatedParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yal0) && this.f42305a.equals(((yal0) obj).f42305a);
    }

    public final int hashCode() {
        return this.f42305a.hashCode();
    }

    public final String toString() {
        return "ShowRelatedGames(relatedParams=" + this.f42305a + Separators.RPAREN;
    }
}
