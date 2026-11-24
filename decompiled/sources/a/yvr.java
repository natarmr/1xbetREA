package a;

import android.gov.nist.core.Separators;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class yvr implements ewr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f43334a;

    public final boolean equals(Object obj) {
        if (obj instanceof yvr) {
            return this.f43334a.equals(((yvr) obj).f43334a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f43334a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f43334a, "DealearCards(value=", Separators.RPAREN);
    }
}
