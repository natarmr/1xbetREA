package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class ri00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f30515a;
    public final int b;
    public final boolean c;
    public final ArrayList d;

    public ri00(int i, long j, ArrayList arrayList, boolean z) {
        this.f30515a = j;
        this.b = i;
        this.c = z;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ri00)) {
            return false;
        }
        ri00 ri00Var = (ri00) obj;
        return this.f30515a == ri00Var.f30515a && this.b == ri00Var.b && this.c == ri00Var.c && this.d.equals(ri00Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.e(twn.a(this.b, Long.hashCode(this.f30515a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbQ = brm0.q(this.b, this.f30515a, "LiveExpressTabItemModel(sportId=", ", startPosition=");
        sbQ.append(", top=");
        sbQ.append(this.c);
        sbQ.append(", tabs=");
        sbQ.append(this.d);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
