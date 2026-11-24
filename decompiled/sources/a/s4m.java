package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class s4m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r2m f31614a;
    public final o2m b;
    public final long c;

    public s4m(r2m r2mVar, o2m o2mVar, long j) {
        this.f31614a = r2mVar;
        this.b = o2mVar;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4m)) {
            return false;
        }
        s4m s4mVar = (s4m) obj;
        if (!this.f31614a.equals(s4mVar.f31614a) || !this.b.equals(s4mVar.b)) {
            return false;
        }
        long j = s4mVar.c;
        int i = y3d.h;
        return h2t0.a(this.c, j);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f31614a.hashCode() * 31)) * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.c) + iHashCode;
    }

    public final String toString() {
        String strI = y3d.i(this.c);
        StringBuilder sb = new StringBuilder("DsCyberGameChartTeamUiModel(logo=");
        sb.append(this.f31614a);
        sb.append(", icon=");
        sb.append(this.b);
        sb.append(", color=");
        return axq.n(sb, strI, Separators.RPAREN);
    }
}
