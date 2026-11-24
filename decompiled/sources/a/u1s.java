package a;

import android.gov.nist.core.Separators;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class u1s implements v1s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f34914a;

    public final boolean equals(Object obj) {
        if (obj instanceof u1s) {
            return this.f34914a.equals(((u1s) obj).f34914a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f34914a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f34914a, "UpdateDisplayedCards(cards=", Separators.RPAREN);
    }
}
