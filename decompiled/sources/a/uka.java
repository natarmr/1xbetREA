package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class uka {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rpp0 f35818a;
    public final String b;
    public final String c;
    public final boolean d;

    public uka(rpp0 rpp0Var, String str, String str2, boolean z) {
        this.f35818a = rpp0Var;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uka)) {
            return false;
        }
        uka ukaVar = (uka) obj;
        return this.f35818a.equals(ukaVar.f35818a) && this.b.equals(ukaVar.b) && this.c.equals(ukaVar.c) && this.d == ukaVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ua80.b(ua80.b(this.f35818a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardPenaltyModel(teamsInfoModel=");
        sb.append(this.f35818a);
        sb.append(", teamOneImageUrl=");
        sb.append(this.b);
        sb.append(", teamTwoImageUrl=");
        return defpackage.c.c(this.c, ", gameFinished=", Separators.RPAREN, sb, this.d);
    }
}
