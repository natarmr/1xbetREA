package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class be8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f2436a;
    public final int b;
    public final long c;

    public be8(int i, long j, ArrayList arrayList) {
        this.f2436a = arrayList;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof be8)) {
            return false;
        }
        be8 be8Var = (be8) obj;
        return this.f2436a.equals(be8Var.f2436a) && this.b == be8Var.b && this.c == be8Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + twn.a(this.b, this.f2436a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BonusDataModel(bonusList=");
        sb.append(this.f2436a);
        sb.append(", countryId=");
        sb.append(this.b);
        sb.append(", currencyId=");
        return brm0.k(this.c, Separators.RPAREN, sb);
    }
}
