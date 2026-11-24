package a;

import android.gov.nist.core.Separators;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class jf2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b9g0 f16404a;
    public final h8l0 b;
    public final i8l0 c;
    public final zvh0 d;
    public final Map e;
    public final boolean f;
    public final boolean g;
    public final Calendar h;

    public jf2(b9g0 b9g0Var, h8l0 h8l0Var, i8l0 i8l0Var, zvh0 zvh0Var, Map map, boolean z, boolean z2, Calendar calendar) {
        this.f16404a = b9g0Var;
        this.b = h8l0Var;
        this.c = i8l0Var;
        this.d = zvh0Var;
        this.e = map;
        this.f = z;
        this.g = z2;
        this.h = calendar;
    }

    public static jf2 a(jf2 jf2Var, b9g0 b9g0Var, LinkedHashMap linkedHashMap, boolean z, boolean z2, Calendar calendar, int i) {
        if ((i & 1) != 0) {
            b9g0Var = jf2Var.f16404a;
        }
        b9g0 b9g0Var2 = b9g0Var;
        h8l0 h8l0Var = jf2Var.b;
        i8l0 i8l0Var = jf2Var.c;
        zvh0 zvh0Var = jf2Var.d;
        Map map = linkedHashMap;
        if ((i & 16) != 0) {
            map = jf2Var.e;
        }
        Map map2 = map;
        if ((i & 32) != 0) {
            z = jf2Var.f;
        }
        boolean z3 = z;
        if ((i & 64) != 0) {
            z2 = jf2Var.g;
        }
        boolean z4 = z2;
        if ((i & 128) != 0) {
            calendar = jf2Var.h;
        }
        jf2Var.getClass();
        return new jf2(b9g0Var2, h8l0Var, i8l0Var, zvh0Var, map2, z3, z4, calendar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jf2)) {
            return false;
        }
        jf2 jf2Var = (jf2) obj;
        return this.f16404a == jf2Var.f16404a && this.b == jf2Var.b && this.c == jf2Var.c && this.d == jf2Var.d && this.e.equals(jf2Var.e) && this.f == jf2Var.f && this.g == jf2Var.g && Intrinsics.d(this.h, jf2Var.h);
    }

    public final int hashCode() {
        int iE = brm0.e(brm0.e(ohs0.f(this.e, (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f16404a.hashCode() * 31)) * 31)) * 31)) * 31, 31), 31, this.f), 31, this.g);
        Calendar calendar = this.h;
        return iE + (calendar == null ? 0 : calendar.hashCode());
    }

    public final String toString() {
        return "AltResultsState(selectedTab=" + this.f16404a + ", sportFeedHeaderStyle=" + this.b + ", sportFeedListIconStyle=" + this.c + ", segmentControlStyleModel=" + this.d + ", searchQueryMap=" + this.e + ", isSearchActive=" + this.f + ", showMultiselect=" + this.g + ", choosenDate=" + this.h + Separators.RPAREN;
    }
}
