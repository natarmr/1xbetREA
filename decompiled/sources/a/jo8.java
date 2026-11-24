package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class jo8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f16844a;
    public final byte b;
    public final boolean c;
    public final boolean d;

    /* JADX WARN: Multi-variable type inference failed */
    public jo8(ArrayList arrayList, int i, boolean z, boolean z2) {
        this.f16844a = arrayList;
        this.b = i;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jo8)) {
            return false;
        }
        jo8 jo8Var = (jo8) obj;
        return this.f16844a.equals(jo8Var.f16844a) && this.b == jo8Var.b && this.c == jo8Var.c && this.d == jo8Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(twn.a(this.b, this.f16844a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BottomMarketUiModel(groups=");
        sb.append(this.f16844a);
        sb.append(", maxRow=");
        sb.append((int) this.b);
        sb.append(", showMoreAvailable=");
        return ohs0.p(", blockedAvailable=", Separators.RPAREN, sb, this.c, this.d);
    }
}
