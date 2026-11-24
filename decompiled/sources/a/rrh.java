package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class rrh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30983a;
    public final String b;
    public final String c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final String i;

    public rrh(String str, String str2, String str3, float f, float f2, float f3, float f4, float f5, String str4) {
        this.f30983a = str;
        this.b = str2;
        this.c = str3;
        this.d = f;
        this.e = f2;
        this.f = f3;
        this.g = f4;
        this.h = f5;
        this.i = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rrh)) {
            return false;
        }
        rrh rrhVar = (rrh) obj;
        return this.f30983a.equals(rrhVar.f30983a) && this.b.equals(rrhVar.b) && this.c.equals(rrhVar.c) && Float.compare(this.d, rrhVar.d) == 0 && Float.compare(this.e, rrhVar.e) == 0 && Float.compare(this.f, rrhVar.f) == 0 && Float.compare(this.g, rrhVar.g) == 0 && Float.compare(this.h, rrhVar.h) == 0 && this.i.equals(rrhVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + defpackage.c.a(defpackage.c.a(defpackage.c.a(defpackage.c.a(defpackage.c.a(ua80.b(ua80.b(this.f30983a.hashCode() * 31, 31, this.b), 31, this.c), this.d, 31), this.e, 31), this.f, 31), this.g, 31), this.h, 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CyberValorantPlayerModel(playerId=", this.f30983a, ", playerName=", this.b, ", playerImage=");
        sbN.append(this.c);
        sbN.append(", combatScore=");
        sbN.append(this.d);
        sbN.append(", kills=");
        vqd.v(sbN, this.e, ", deaths=", this.f, ", firstKills=");
        vqd.v(sbN, this.g, ", headshots=", this.h, ", countyImage=");
        return axq.n(sbN, this.i, Separators.RPAREN);
    }
}
