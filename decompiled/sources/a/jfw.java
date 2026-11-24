package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class jfw implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kzc0 f16449a;
    public final boolean b;
    public final String c;
    public final String d;

    public jfw(kzc0 kzc0Var, boolean z, String str, String str2) {
        this.f16449a = kzc0Var;
        this.b = z;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jfw)) {
            return false;
        }
        jfw jfwVar = (jfw) obj;
        return this.f16449a.equals(jfwVar.f16449a) && this.b == jfwVar.b && this.c.equals(jfwVar.c) && this.d.equals(jfwVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(brm0.e(this.f16449a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HltvPromotionUiModel(promoCardModel=");
        sb.append(this.f16449a);
        sb.append(", action=");
        sb.append(this.b);
        sb.append(", deepLink=");
        return ua80.m(sb, this.c, ", siteLink=", this.d, Separators.RPAREN);
    }
}
