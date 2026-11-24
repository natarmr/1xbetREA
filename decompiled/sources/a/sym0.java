package a;

import android.gov.nist.core.Separators;
import org.xplatform.sportgame.categories_subgames.api.MarketsCategoriesParams;

/* JADX INFO: loaded from: classes5.dex */
public final class sym0 implements yym0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MarketsCategoriesParams f33029a;

    public sym0(MarketsCategoriesParams marketsCategoriesParams) {
        this.f33029a = marketsCategoriesParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sym0) && this.f33029a.equals(((sym0) obj).f33029a);
    }

    public final int hashCode() {
        return this.f33029a.hashCode();
    }

    public final String toString() {
        return "Content(marketsCategoriesParams=" + this.f33029a + Separators.RPAREN;
    }
}
