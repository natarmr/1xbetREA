package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class jih {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f16574a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;

    public jih(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        this.f16574a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
        this.g = obj7;
        this.h = obj8;
        this.i = obj9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jih)) {
            return false;
        }
        jih jihVar = (jih) obj;
        Object obj2 = jihVar.f16574a;
        e0g0 e0g0Var = j0g0.b;
        return Intrinsics.d(this.f16574a, obj2) && Intrinsics.d(this.b, jihVar.b) && Intrinsics.d(this.c, jihVar.c) && Intrinsics.d(this.d, jihVar.d) && Intrinsics.d(this.e, jihVar.e) && Intrinsics.d(this.f, jihVar.f) && Intrinsics.d(this.g, jihVar.g) && Intrinsics.d(this.h, jihVar.h) && Intrinsics.d(this.i, jihVar.i);
    }

    public final int hashCode() {
        return j0g0.b(this.i) + twn.c(twn.c(twn.c(twn.c(twn.c(twn.c(twn.c(j0g0.b(this.f16574a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        String strD = j0g0.d(this.f16574a);
        String strD2 = j0g0.d(this.b);
        String strD3 = j0g0.d(this.c);
        String strD4 = j0g0.d(this.d);
        String strD5 = j0g0.d(this.e);
        String strD6 = j0g0.d(this.f);
        String strD7 = j0g0.d(this.g);
        String strD8 = j0g0.d(this.h);
        String strD9 = j0g0.d(this.i);
        StringBuilder sbN = b1j.n("CyberTopScenarioModel(topBanners=", strD, ", topDisciplines=", strD2, ", liveTopEvents=");
        f140.v(sbN, strD3, ", lineTopEvents=", strD4, ", partnersTeams=");
        f140.v(sbN, strD5, ", liveTopChamps=", strD6, ", lineTopChamps=");
        f140.v(sbN, strD7, ", virtualGameCategories=", strD8, ", realTopChamps=");
        return axq.n(sbN, strD9, Separators.RPAREN);
    }
}
