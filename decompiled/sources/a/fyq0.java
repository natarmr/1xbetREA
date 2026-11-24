package a;

import android.gov.nist.core.Separators;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey;

/* JADX INFO: loaded from: classes6.dex */
public final class fyq0 implements qdr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TopSectionKey f10373a;
    public final jml b;

    public fyq0(TopSectionKey topSectionKey, jml jmlVar) {
        this.f10373a = topSectionKey;
        this.b = jmlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fyq0)) {
            return false;
        }
        fyq0 fyq0Var = (fyq0) obj;
        return this.f10373a.equals(fyq0Var.f10373a) && this.b.equals(fyq0Var.b);
    }

    @Override // a.qdr0
    public final TopSectionKey getKey() {
        return this.f10373a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f10373a.hashCode() * 31);
    }

    public final String toString() {
        return "TopAggregatorPromoGamesUiModel(key=" + this.f10373a + ", model=" + this.b + Separators.RPAREN;
    }
}
