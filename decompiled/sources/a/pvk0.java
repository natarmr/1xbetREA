package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class pvk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final btk0 f27666a;
    public final List b;
    public final List c;

    public pvk0(btk0 btk0Var, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f27666a = btk0Var;
        this.b = list;
        this.c = list2;
    }

    public static pvk0 a(pvk0 pvk0Var, btk0 btk0Var, List list, List list2, int i) {
        if ((i & 1) != 0) {
            btk0Var = pvk0Var.f27666a;
        }
        if ((i & 2) != 0) {
            list = pvk0Var.b;
        }
        if ((i & 4) != 0) {
            list2 = pvk0Var.c;
        }
        list.getClass();
        list2.getClass();
        return new pvk0(btk0Var, list, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pvk0)) {
            return false;
        }
        pvk0 pvk0Var = (pvk0) obj;
        return this.f27666a.equals(pvk0Var.f27666a) && Intrinsics.d(this.b, pvk0Var.b) && Intrinsics.d(this.c, pvk0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dw9.a(this.f27666a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpecialEventTabVenuesStateModel(contentStatus=");
        sb.append(this.f27666a);
        sb.append(", content=");
        sb.append(this.b);
        sb.append(", eventsCount=");
        return dw9.r(sb, this.c, Separators.RPAREN);
    }
}
