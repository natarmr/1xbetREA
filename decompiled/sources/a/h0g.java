package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class h0g implements j0g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0x f12233a;
    public final String b;
    public final g4m c;

    public h0g(n0x n0xVar, String str, g4m g4mVar) {
        this.f12233a = n0xVar;
        this.b = str;
        this.c = g4mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0g)) {
            return false;
        }
        h0g h0gVar = (h0g) obj;
        return this.f12233a.equals(h0gVar.f12233a) && this.b.equals(h0gVar.b) && this.c.equals(h0gVar.c);
    }

    public final int hashCode() {
        return this.c.f10673a.hashCode() + ua80.b(this.f12233a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "Content(imageLink=" + this.f12233a + ", achievementName=" + this.b + ", chips=" + this.c + Separators.RPAREN;
    }
}
