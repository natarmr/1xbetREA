package a;

import android.gov.nist.core.Separators;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class ris implements sis {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f30559a;

    public final boolean equals(Object obj) {
        if (obj instanceof ris) {
            return this.f30559a.equals(((ris) obj).f30559a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f30559a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f30559a, "UpdateDisplayedCards(cards=", Separators.RPAREN);
    }
}
