package a;

import android.gov.nist.core.Separators;
import org.xplatform.related.api.presentation.RelatedParams;

/* JADX INFO: loaded from: classes5.dex */
public final class vym0 implements yym0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelatedParams f38256a;

    public vym0(RelatedParams relatedParams) {
        this.f38256a = relatedParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vym0) && this.f38256a.equals(((vym0) obj).f38256a);
    }

    public final int hashCode() {
        return this.f38256a.hashCode();
    }

    public final String toString() {
        return "Transfer(relatedParams=" + this.f38256a + Separators.RPAREN;
    }
}
