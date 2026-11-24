package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hva {
    public static final hva d = new hva(-1, "", iko0.e);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13717a;
    public final String b;
    public final iko0 c;

    public hva(int i, String str, iko0 iko0Var) {
        iko0Var.getClass();
        this.f13717a = i;
        this.b = str;
        this.c = iko0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hva)) {
            return false;
        }
        hva hvaVar = (hva) obj;
        return this.f13717a == hvaVar.f13717a && this.b.equals(hvaVar.b) && Intrinsics.d(this.c, hvaVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Integer.hashCode(this.f13717a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f13717a, "CareerTableModel(id=", ", title=", this.b, ", table=");
        sbR.append(this.c);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
