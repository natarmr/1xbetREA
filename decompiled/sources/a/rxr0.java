package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class rxr0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31279a;
    public final cyr0 b;
    public final float c;

    public rxr0(String str, cyr0 cyr0Var, float f) {
        this.f31279a = str;
        this.b = cyr0Var;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rxr0)) {
            return false;
        }
        rxr0 rxr0Var = (rxr0) obj;
        return this.f31279a.equals(rxr0Var.f31279a) && this.b.equals(rxr0Var.b) && ycl.b(this.c, rxr0Var.c);
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + ((this.b.hashCode() + (this.f31279a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        String strC = ycl.c(this.c);
        StringBuilder sb = new StringBuilder("TournamentBracketSwissGroupUiModel(groupId=");
        sb.append(this.f31279a);
        sb.append(", section=");
        sb.append(this.b);
        sb.append(", height=");
        return axq.n(sb, strC, Separators.RPAREN);
    }
}
