package a;

import android.gov.nist.core.Separators;
import org.xplatform.statistic.champ_statistic.presentation.models.ChampSubMenuItem;

/* JADX INFO: loaded from: classes6.dex */
public final class rbm0 implements sbm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChampSubMenuItem f30196a;

    public rbm0(ChampSubMenuItem champSubMenuItem) {
        this.f30196a = champSubMenuItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rbm0) && this.f30196a.equals(((rbm0) obj).f30196a);
    }

    public final int hashCode() {
        return this.f30196a.hashCode();
    }

    public final String toString() {
        return "OnSubMenuItemPressed(menuItem=" + this.f30196a + Separators.RPAREN;
    }
}
