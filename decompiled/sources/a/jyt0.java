package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class jyt0 implements lyt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17376a;
    public final String b;

    public jyt0(long j, String str) {
        this.f17376a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jyt0)) {
            return false;
        }
        jyt0 jyt0Var = (jyt0) obj;
        return this.f17376a == jyt0Var.f17376a && this.b.equals(jyt0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f17376a) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f17376a, "InfoClick(champId=", ", champName=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
