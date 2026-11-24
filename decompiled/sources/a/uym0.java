package a;

import android.gov.nist.core.Separators;
import org.xplatform.related.api.presentation.RelatedParams;

/* JADX INFO: loaded from: classes5.dex */
public final class uym0 implements xym0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelatedParams f36497a;

    public uym0(RelatedParams relatedParams) {
        this.f36497a = relatedParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uym0) && this.f36497a.equals(((uym0) obj).f36497a);
    }

    public final int hashCode() {
        return this.f36497a.hashCode();
    }

    public final String toString() {
        return "Transfer(relatedParams=" + this.f36497a + Separators.RPAREN;
    }
}
