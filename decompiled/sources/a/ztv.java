package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ztv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nep0 f44982a;
    public final lgp0 b;
    public final int c;

    public ztv(nep0 nep0Var, lgp0 lgp0Var, int i) {
        this.f44982a = nep0Var;
        this.b = lgp0Var;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ztv)) {
            return false;
        }
        ztv ztvVar = (ztv) obj;
        return this.f44982a.equals(ztvVar.f44982a) && this.b == ztvVar.b && this.c == ztvVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((this.b.hashCode() + (this.f44982a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeatMapItem(heatMapModel=");
        sb.append(this.f44982a);
        sb.append(", pagerModel=");
        sb.append(this.b);
        sb.append(", heatsCount=");
        return rz4.j(this.c, Separators.RPAREN, sb);
    }
}
