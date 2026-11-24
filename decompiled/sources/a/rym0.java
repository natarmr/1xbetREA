package a;

import android.gov.nist.core.Separators;
import org.xplatform.sportgame.categories_subgames.api.MarketsCategoriesParams;

/* JADX INFO: loaded from: classes5.dex */
public final class rym0 implements xym0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MarketsCategoriesParams f31320a;

    public rym0(MarketsCategoriesParams marketsCategoriesParams) {
        this.f31320a = marketsCategoriesParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rym0) && this.f31320a.equals(((rym0) obj).f31320a);
    }

    public final int hashCode() {
        return this.f31320a.hashCode();
    }

    public final String toString() {
        return "Content(marketsCategoriesParams=" + this.f31320a + Separators.RPAREN;
    }
}
