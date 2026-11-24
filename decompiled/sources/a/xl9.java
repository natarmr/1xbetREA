package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class xl9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f41060a;
    public final Date b;

    public xl9(Date date, List list) {
        list.getClass();
        this.f41060a = list;
        this.b = date;
    }

    public static xl9 a(xl9 xl9Var, ArrayList arrayList, Date date, int i) {
        List list = arrayList;
        if ((i & 1) != 0) {
            list = xl9Var.f41060a;
        }
        if ((i & 2) != 0) {
            date = xl9Var.b;
        }
        list.getClass();
        return new xl9(date, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xl9)) {
            return false;
        }
        xl9 xl9Var = (xl9) obj;
        return Intrinsics.d(this.f41060a, xl9Var.f41060a) && Intrinsics.d(this.b, xl9Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.f41060a.hashCode() * 31;
        Date date = this.b;
        return iHashCode + (date == null ? 0 : date.hashCode());
    }

    public final String toString() {
        return "CalendarState(list=" + this.f41060a + ", selectedDate=" + this.b + Separators.RPAREN;
    }
}
