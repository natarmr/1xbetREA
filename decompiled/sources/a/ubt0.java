package a;

import android.gov.nist.core.Separators;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ubt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f35399a;
    public final Date b;
    public final j0g0 c;
    public final Locale d;
    public final qbt0 e;
    public final sff0 f;
    public final boolean g;

    public ubt0(boolean z, Date date, j0g0 j0g0Var, Locale locale, qbt0 qbt0Var, sff0 sff0Var, boolean z2) {
        this.f35399a = z;
        this.b = date;
        this.c = j0g0Var;
        this.d = locale;
        this.e = qbt0Var;
        this.f = sff0Var;
        this.g = z2;
    }

    public static ubt0 a(ubt0 ubt0Var, boolean z, Date date, j0g0 j0g0Var, qbt0 qbt0Var, int i) {
        if ((i & 1) != 0) {
            z = ubt0Var.f35399a;
        }
        boolean z2 = z;
        if ((i & 2) != 0) {
            date = ubt0Var.b;
        }
        Date date2 = date;
        if ((i & 4) != 0) {
            j0g0Var = ubt0Var.c;
        }
        j0g0 j0g0Var2 = j0g0Var;
        Locale locale = ubt0Var.d;
        if ((i & 16) != 0) {
            qbt0Var = ubt0Var.e;
        }
        sff0 sff0Var = ubt0Var.f;
        boolean z3 = ubt0Var.g;
        ubt0Var.getClass();
        return new ubt0(z2, date2, j0g0Var2, locale, qbt0Var, sff0Var, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ubt0)) {
            return false;
        }
        ubt0 ubt0Var = (ubt0) obj;
        return this.f35399a == ubt0Var.f35399a && this.b.equals(ubt0Var.b) && Intrinsics.d(this.c, ubt0Var.c) && this.d.equals(ubt0Var.d) && Intrinsics.d(this.e, ubt0Var.e) && this.f.equals(ubt0Var.f) && this.g == ubt0Var.g;
    }

    public final int hashCode() {
        int i = brm0.i(this.b, Boolean.hashCode(this.f35399a) * 31, 31);
        j0g0 j0g0Var = this.c;
        int iHashCode = (this.d.hashCode() + ((i + (j0g0Var == null ? 0 : j0g0.b(j0g0Var.f15681a))) * 31)) * 31;
        qbt0 qbt0Var = this.e;
        return Boolean.hashCode(this.g) + cs0.c(this.f, (iHashCode + (qbt0Var != null ? qbt0Var.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UniversalChampResultsStateModel(connected=");
        sb.append(this.f35399a);
        sb.append(", selectedDate=");
        sb.append(this.b);
        sb.append(", resultsCalendarDates=");
        sb.append(this.c);
        sb.append(", currentLocale=");
        sb.append(this.d);
        sb.append(", champResults=");
        sb.append(this.e);
        sb.append(", remoteConfigModel=");
        sb.append(this.f);
        sb.append(", supportRtl=");
        return rw2.p(sb, this.g, Separators.RPAREN);
    }
}
