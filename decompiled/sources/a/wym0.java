package a;

import android.gov.nist.core.Separators;
import org.xplatform.related.api.presentation.RelatedParams;

/* JADX INFO: loaded from: classes5.dex */
public final class wym0 implements zym0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelatedParams f39981a;

    public wym0(RelatedParams relatedParams) {
        this.f39981a = relatedParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wym0) && this.f39981a.equals(((wym0) obj).f39981a);
    }

    public final int hashCode() {
        return this.f39981a.hashCode();
    }

    public final String toString() {
        return "Transfer(relatedParams=" + this.f39981a + Separators.RPAREN;
    }
}
