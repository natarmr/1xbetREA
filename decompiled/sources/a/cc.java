package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class cc implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r040 f4085a;
    public final int b;
    public final String c;
    public final boolean d;

    public cc(r040 r040Var, int i, String str, boolean z) {
        this.f4085a = r040Var;
        this.b = i;
        this.c = str;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cc)) {
            return false;
        }
        cc ccVar = (cc) obj;
        return this.f4085a == ccVar.f4085a && this.b == ccVar.b && this.c.equals(ccVar.c) && this.d == ccVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ua80.b(twn.a(this.b, this.f4085a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleAccordionMenuUiItem(menuSectionType=");
        sb.append(this.f4085a);
        sb.append(", icon=");
        sb.append(this.b);
        sb.append(", title=");
        return defpackage.c.c(this.c, ", isExpand=", Separators.RPAREN, sb, this.d);
    }
}
