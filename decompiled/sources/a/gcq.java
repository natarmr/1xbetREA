package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class gcq implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11074a;
    public final String b;
    public final int c;
    public final fcq d;

    public gcq(int i, String str, int i2, fcq fcqVar) {
        this.f11074a = i;
        this.b = str;
        this.c = i2;
        this.d = fcqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gcq)) {
            return false;
        }
        gcq gcqVar = (gcq) obj;
        return this.f11074a == gcqVar.f11074a && this.b.equals(gcqVar.b) && this.c == gcqVar.c && this.d == gcqVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + twn.a(this.c, ua80.b(Integer.hashCode(this.f11074a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f11074a, "FinanceInstrumentModel(id=", ", name=", this.b, ", decimals=");
        sbR.append(this.c);
        sbR.append(", type=");
        sbR.append(this.d);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
