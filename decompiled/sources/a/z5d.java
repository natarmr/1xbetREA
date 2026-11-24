package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class z5d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f43810a;
    public final oab b;
    public final q9b c;
    public final String d;
    public final String e;

    public z5d(boolean z, oab oabVar, q9b q9bVar, String str, String str2) {
        this.f43810a = z;
        this.b = oabVar;
        this.c = q9bVar;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z5d)) {
            return false;
        }
        z5d z5dVar = (z5d) obj;
        return this.f43810a == z5dVar.f43810a && this.b == z5dVar.b && this.c == z5dVar.c && this.d.equals(z5dVar.d) && this.e.equals(z5dVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b((this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.f43810a) * 31)) * 31)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ColumnTitleModel(isFixed=");
        sb.append(this.f43810a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", icon=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", description=");
        return axq.n(sb, this.e, Separators.RPAREN);
    }
}
