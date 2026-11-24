package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class l8n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k8n f19613a;
    public final int b;
    public final int c;

    public l8n(k8n k8nVar, int i, int i2) {
        this.f19613a = k8nVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8n)) {
            return false;
        }
        l8n l8nVar = (l8n) obj;
        return this.f19613a.equals(l8nVar.f19613a) && this.b == l8nVar.b && this.c == l8nVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + twn.a(this.b, this.f19613a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DsVictoryIndicatorCompactUiModel(style=");
        sb.append(this.f19613a);
        sb.append(", totalCount=");
        sb.append(this.b);
        sb.append(", winCount=");
        return rz4.j(this.c, Separators.RPAREN, sb);
    }
}
