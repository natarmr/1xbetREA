package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ydj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q760 f42441a;
    public final lxl b;
    public final boolean c;

    public ydj(q760 q760Var, lxl lxlVar, boolean z) {
        this.f42441a = q760Var;
        this.b = lxlVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ydj)) {
            return false;
        }
        ydj ydjVar = (ydj) obj;
        return this.f42441a == ydjVar.f42441a && this.b.equals(ydjVar.b) && this.c == ydjVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.f42441a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DatePeriodUiModel(type=");
        sb.append(this.f42441a);
        sb.append(", model=");
        sb.append(this.b);
        sb.append(", selected=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
