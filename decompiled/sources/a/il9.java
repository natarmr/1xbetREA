package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class il9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14965a;
    public final int b;
    public final ArrayList c;

    public il9(ArrayList arrayList, int i, int i2) {
        this.f14965a = i;
        this.b = i2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof il9)) {
            return false;
        }
        il9 il9Var = (il9) obj;
        return this.f14965a == il9Var.f14965a && this.b == il9Var.b && this.c.equals(il9Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, Integer.hashCode(this.f14965a) * 31, 31);
    }

    public final String toString() {
        return rz4.n(dw9.t("CalendarMonthGridModel(year=", this.f14965a, ", month=", ", weeks=", this.b), this.c, Separators.RPAREN);
    }
}
