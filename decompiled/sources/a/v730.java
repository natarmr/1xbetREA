package a;

import android.gov.nist.core.Separators;
import org.xplatform.sportgame.categories_subgames.api.MarketsCategoriesParams;

/* JADX INFO: loaded from: classes5.dex */
public final class v730 implements b830 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MarketsCategoriesParams f36904a;

    public v730(MarketsCategoriesParams marketsCategoriesParams) {
        this.f36904a = marketsCategoriesParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v730) && this.f36904a.equals(((v730) obj).f36904a);
    }

    public final int hashCode() {
        return this.f36904a.hashCode();
    }

    public final String toString() {
        return "Content(marketsCategoriesParams=" + this.f36904a + Separators.RPAREN;
    }
}
