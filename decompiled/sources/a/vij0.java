package a;

import android.gov.nist.core.Separators;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class vij0 implements bjj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f37481a;

    public final boolean equals(Object obj) {
        if (obj instanceof vij0) {
            return this.f37481a.equals(((vij0) obj).f37481a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f37481a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f37481a, "DealerCardList(value=", Separators.RPAREN);
    }
}
