package a;

import android.gov.nist.core.Separators;
import org.xplatform.cyber.game.core.betting.domain.model.RelatedParams;

/* JADX INFO: loaded from: classes4.dex */
public final class nbh implements qbh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelatedParams f23239a;

    public nbh(RelatedParams relatedParams) {
        this.f23239a = relatedParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nbh) && this.f23239a.equals(((nbh) obj).f23239a);
    }

    public final int hashCode() {
        return this.f23239a.hashCode();
    }

    public final String toString() {
        return "OnUpdateParams(params=" + this.f23239a + Separators.RPAREN;
    }
}
