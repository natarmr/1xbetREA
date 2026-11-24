package a;

import android.gov.nist.core.Separators;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey;

/* JADX INFO: loaded from: classes6.dex */
public final class qfr0 implements qdr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TopSectionKey.VirtualGames f28651a;
    public final bml b;

    public qfr0(TopSectionKey.VirtualGames virtualGames, bml bmlVar) {
        this.f28651a = virtualGames;
        this.b = bmlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qfr0)) {
            return false;
        }
        qfr0 qfr0Var = (qfr0) obj;
        return this.f28651a.equals(qfr0Var.f28651a) && this.b.equals(qfr0Var.b);
    }

    @Override // a.qdr0
    public final TopSectionKey getKey() {
        return this.f28651a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f28651a.f47159a) * 31);
    }

    public final String toString() {
        return "TopVirtualGamesUiModel(key=" + this.f28651a + ", model=" + this.b + Separators.RPAREN;
    }
}
