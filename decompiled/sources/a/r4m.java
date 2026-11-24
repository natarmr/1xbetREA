package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class r4m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f29842a;
    public final boolean b;
    public final a9q0 c;

    public r4m(boolean z, boolean z2, a9q0 a9q0Var) {
        this.f29842a = z;
        this.b = z2;
        this.c = a9q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r4m)) {
            return false;
        }
        r4m r4mVar = (r4m) obj;
        return this.f29842a == r4mVar.f29842a && this.b == r4mVar.b && this.c.equals(r4mVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(Boolean.hashCode(this.f29842a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("DsCyberGameChartRow(lineVisible=", ", textVisible=", ", textLayoutResult=", this.f29842a, this.b);
        sbQ.append(this.c);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
