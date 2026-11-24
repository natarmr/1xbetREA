package a;

import android.gov.nist.core.Separators;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.api.championships.universal.presentation.UniversalChampParams;

/* JADX INFO: loaded from: classes4.dex */
public final class cdt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4179a;
    public final UniversalChampParams b;
    public final xbt0 c;
    public final List d;
    public final boolean e;
    public final sff0 f;
    public final boolean g;
    public final Locale h;
    public final int i;
    public final Date j;
    public final j0g0 k;
    public final boolean l;

    public cdt0(boolean z, UniversalChampParams universalChampParams, xbt0 xbt0Var, List list, boolean z2, sff0 sff0Var, boolean z3, Locale locale, int i, Date date, j0g0 j0g0Var, boolean z4) {
        this.f4179a = z;
        this.b = universalChampParams;
        this.c = xbt0Var;
        this.d = list;
        this.e = z2;
        this.f = sff0Var;
        this.g = z3;
        this.h = locale;
        this.i = i;
        this.j = date;
        this.k = j0g0Var;
        this.l = z4;
    }

    public static cdt0 a(cdt0 cdt0Var, boolean z, xbt0 xbt0Var, int i, Date date, j0g0 j0g0Var, int i2) {
        boolean z2 = (i2 & 1) != 0 ? cdt0Var.f4179a : z;
        UniversalChampParams universalChampParams = cdt0Var.b;
        xbt0 xbt0Var2 = (i2 & 4) != 0 ? cdt0Var.c : xbt0Var;
        List list = cdt0Var.d;
        boolean z3 = cdt0Var.e;
        sff0 sff0Var = cdt0Var.f;
        boolean z4 = cdt0Var.g;
        Locale locale = cdt0Var.h;
        int i3 = (i2 & 256) != 0 ? cdt0Var.i : i;
        Date date2 = (i2 & 512) != 0 ? cdt0Var.j : date;
        j0g0 j0g0Var2 = (i2 & 1024) != 0 ? cdt0Var.k : j0g0Var;
        boolean z5 = cdt0Var.l;
        cdt0Var.getClass();
        return new cdt0(z2, universalChampParams, xbt0Var2, list, z3, sff0Var, z4, locale, i3, date2, j0g0Var2, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdt0)) {
            return false;
        }
        cdt0 cdt0Var = (cdt0) obj;
        return this.f4179a == cdt0Var.f4179a && this.b.equals(cdt0Var.b) && Intrinsics.d(this.c, cdt0Var.c) && Intrinsics.d(this.d, cdt0Var.d) && this.e == cdt0Var.e && this.f.equals(cdt0Var.f) && this.g == cdt0Var.g && this.h.equals(cdt0Var.h) && this.i == cdt0Var.i && Intrinsics.d(this.j, cdt0Var.j) && Intrinsics.d(this.k, cdt0Var.k) && this.l == cdt0Var.l;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Boolean.hashCode(this.f4179a) * 31)) * 31;
        xbt0 xbt0Var = this.c;
        int iHashCode2 = (iHashCode + (xbt0Var == null ? 0 : xbt0Var.hashCode())) * 31;
        List list = this.d;
        int iA = twn.a(this.i, (this.h.hashCode() + brm0.e(cs0.c(this.f, brm0.e((iHashCode2 + (list == null ? 0 : list.hashCode())) * 31, 31, this.e), 31), 31, this.g)) * 31, 31);
        Date date = this.j;
        int iHashCode3 = (iA + (date == null ? 0 : date.hashCode())) * 31;
        j0g0 j0g0Var = this.k;
        return Boolean.hashCode(this.l) + ((iHashCode3 + (j0g0Var != null ? j0g0.b(j0g0Var.f15681a) : 0)) * 31);
    }

    public final String toString() {
        return "UniversalChampStateModel(connected=" + this.f4179a + ", params=" + this.b + ", scenarioModel=" + this.c + ", specialEventList=" + this.d + ", bettingDisabled=" + this.e + ", remoteConfigModel=" + this.f + ", tablet=" + this.g + ", currentLocale=" + this.h + ", currentGroupStageChipId=" + this.i + ", selectedDate=" + this.j + ", resultsCalendarDates=" + this.k + ", supportRtl=" + this.l + Separators.RPAREN;
    }
}
