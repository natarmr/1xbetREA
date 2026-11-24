package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class zgh implements bhh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0g f44344a;
    public final String b;
    public final jhh c;

    public zgh(h0g h0gVar, String str, jhh jhhVar) {
        this.f44344a = h0gVar;
        this.b = str;
        this.c = jhhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zgh)) {
            return false;
        }
        zgh zghVar = (zgh) obj;
        return this.f44344a.equals(zghVar.f44344a) && this.b.equals(zghVar.b) && this.c.equals(zghVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f44344a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "Content(achievementUiModel=" + this.f44344a + ", teamInfo=" + this.b + ", otherTeams=" + this.c + Separators.RPAREN;
    }
}
