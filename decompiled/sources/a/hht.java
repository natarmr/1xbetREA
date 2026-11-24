package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class hht {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f13082a;
    public final ArrayList b;

    public hht(double d, ArrayList arrayList) {
        this.f13082a = d;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hht)) {
            return false;
        }
        hht hhtVar = (hht) obj;
        return Double.compare(this.f13082a, hhtVar.f13082a) == 0 && this.b.equals(hhtVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Double.hashCode(this.f13082a) * 31);
    }

    public final String toString() {
        return "GenerateCouponModel(coefficient=" + this.f13082a + ", findCouponDescs=" + this.b + Separators.RPAREN;
    }
}
