package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class b7h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2108a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final a7h g;
    public final boolean h;

    public b7h(long j, String str, boolean z, boolean z2, boolean z3, int i, a7h a7hVar, boolean z4) {
        this.f2108a = j;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = i;
        this.g = a7hVar;
        this.h = z4;
    }

    public static b7h a(b7h b7hVar) {
        long j = b7hVar.f2108a;
        String str = b7hVar.b;
        boolean z = b7hVar.d;
        boolean z2 = b7hVar.e;
        int i = b7hVar.f;
        a7h a7hVar = b7hVar.g;
        boolean z3 = b7hVar.h;
        b7hVar.getClass();
        return new b7h(j, str, true, z, z2, i, a7hVar, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b7h)) {
            return false;
        }
        b7h b7hVar = (b7h) obj;
        return this.f2108a == b7hVar.f2108a && this.b.equals(b7hVar.b) && this.c == b7hVar.c && this.d == b7hVar.d && this.e == b7hVar.e && this.f == b7hVar.f && this.g.equals(b7hVar.g) && this.h == b7hVar.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + cs0.b(this.g.f369a, twn.a(this.f, brm0.e(brm0.e(brm0.e(ua80.b(Long.hashCode(this.f2108a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f2108a, "CyberMarketsGroupUiModel(id=", ", title=", this.b);
        w6x.A(", isExpanded=", ", isPinned=", sbO, this.c, this.d);
        cs0.v(this.f, ", hasSpecialSign=", ", countMarkets=", sbO, this.e);
        sbO.append(", content=");
        sbO.append(this.g);
        sbO.append(", supportRtl=");
        sbO.append(this.h);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
