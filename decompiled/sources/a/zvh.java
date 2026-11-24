package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class zvh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45056a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public zvh(String str, String str2, String str3, String str4, String str5) {
        this.f45056a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zvh)) {
            return false;
        }
        zvh zvhVar = (zvh) obj;
        return this.f45056a.equals(zvhVar.f45056a) && this.b.equals(zvhVar.b) && this.c.equals(zvhVar.c) && this.d.equals(zvhVar.d) && this.e.equals(zvhVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b(ua80.b(this.f45056a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CyclingPlayerStatisticsHeaderUiModel(backgroundUrl=", this.f45056a, ", playerAvatarUrl=", this.b, ", playerFlagUrl=");
        f140.v(sbN, this.c, ", playerName=", this.d, ", playerCountry=");
        return axq.n(sbN, this.e, Separators.RPAREN);
    }
}
