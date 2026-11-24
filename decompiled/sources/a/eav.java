package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class eav {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7488a;
    public final String b;
    public final String c;

    public eav(String str, String str2, String str3) {
        this.f7488a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eav)) {
            return false;
        }
        eav eavVar = (eav) obj;
        return this.f7488a.equals(eavVar.f7488a) && this.b.equals(eavVar.b) && this.c.equals(eavVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f7488a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("GoldRushPlayerImagesUiModel(playerIcon=", this.f7488a, ", playerIconBonusGreen=", this.b, ", playerIconBonusRed="), this.c, Separators.RPAREN);
    }
}
