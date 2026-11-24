package a;

import android.gov.nist.core.Separators;
import org.xplatform.related.api.presentation.RelatedParams;

/* JADX INFO: loaded from: classes5.dex */
public final class z730 implements b830 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelatedParams f43900a;

    public z730(RelatedParams relatedParams) {
        this.f43900a = relatedParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z730) && this.f43900a.equals(((z730) obj).f43900a);
    }

    public final int hashCode() {
        return this.f43900a.hashCode();
    }

    public final String toString() {
        return "Transfer(relatedParams=" + this.f43900a + Separators.RPAREN;
    }
}
