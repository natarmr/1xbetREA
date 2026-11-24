package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class x8n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w8n f40471a;
    public final int b;
    public final int c;

    public x8n(w8n w8nVar, int i, int i2) {
        this.f40471a = w8nVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x8n)) {
            return false;
        }
        x8n x8nVar = (x8n) obj;
        return this.f40471a.equals(x8nVar.f40471a) && this.b == x8nVar.b && this.c == x8nVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + twn.a(this.b, this.f40471a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DsVictoryIndicatorUiModel(style=");
        sb.append(this.f40471a);
        sb.append(", totalCount=");
        sb.append(this.b);
        sb.append(", winCount=");
        return rz4.j(this.c, Separators.RPAREN, sb);
    }
}
