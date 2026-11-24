package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class xtp implements ztp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41473a;

    public final boolean equals(Object obj) {
        if (obj instanceof xtp) {
            return this.f41473a.equals(((xtp) obj).f41473a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f41473a.hashCode();
    }

    public final String toString() {
        return kng0.l("FightStatisticHeaderItemUiModel(sectionTitle=", this.f41473a, Separators.RPAREN);
    }
}
