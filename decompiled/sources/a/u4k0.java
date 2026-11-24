package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class u4k0 implements w4k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ctp0 f35054a;

    public u4k0(ctp0 ctp0Var) {
        this.f35054a = ctp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u4k0) && this.f35054a.equals(((u4k0) obj).f35054a);
    }

    public final int hashCode() {
        return this.f35054a.hashCode();
    }

    public final String toString() {
        return "OnItemClick(teamsStatisticMenuType=" + this.f35054a + Separators.RPAREN;
    }
}
