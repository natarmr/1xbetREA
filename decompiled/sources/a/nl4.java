package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class nl4 implements xl4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uu4 f23710a;
    public final ynb0 b;
    public final String c;

    public nl4(uu4 uu4Var, ynb0 ynb0Var, String str) {
        this.f23710a = uu4Var;
        this.b = ynb0Var;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nl4)) {
            return false;
        }
        nl4 nl4Var = (nl4) obj;
        return this.f23710a.equals(nl4Var.f23710a) && this.b.equals(nl4Var.b) && this.c.equals(nl4Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f23710a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PerformAfterCaptcha(authorizationData=");
        sb.append(this.f23710a);
        sb.append(", powWrapper=");
        sb.append(this.b);
        sb.append(", deviceId=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
