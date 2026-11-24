package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ena implements gna {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mca f8084a;
    public final mnd b;
    public final uka c;
    public final lha d;
    public final wnd e;
    public final xka f;
    public final bpd g;
    public final uia h;
    public final yja i;
    public final hna j;
    public final zvl0 k;
    public final p700 l;
    public final loa m;
    public final woa n;
    public final bha o;
    public final boolean p;
    public final String q;

    public ena(mca mcaVar, mnd mndVar, uka ukaVar, lha lhaVar, wnd wndVar, xka xkaVar, bpd bpdVar, uia uiaVar, yja yjaVar, hna hnaVar, zvl0 zvl0Var, p700 p700Var, loa loaVar, woa woaVar, bha bhaVar, boolean z, String str) {
        str.getClass();
        this.f8084a = mcaVar;
        this.b = mndVar;
        this.c = ukaVar;
        this.d = lhaVar;
        this.e = wndVar;
        this.f = xkaVar;
        this.g = bpdVar;
        this.h = uiaVar;
        this.i = yjaVar;
        this.j = hnaVar;
        this.k = zvl0Var;
        this.l = p700Var;
        this.m = loaVar;
        this.n = woaVar;
        this.o = bhaVar;
        this.p = z;
        this.q = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ena)) {
            return false;
        }
        ena enaVar = (ena) obj;
        return this.f8084a.equals(enaVar.f8084a) && this.b.equals(enaVar.b) && Intrinsics.d(this.c, enaVar.c) && Intrinsics.d(this.d, enaVar.d) && Intrinsics.d(this.e, enaVar.e) && Intrinsics.d(this.f, enaVar.f) && Intrinsics.d(this.g, enaVar.g) && Intrinsics.d(this.h, enaVar.h) && Intrinsics.d(this.i, enaVar.i) && Intrinsics.d(this.j, enaVar.j) && Intrinsics.d(this.k, enaVar.k) && Intrinsics.d(this.l, enaVar.l) && this.m.equals(enaVar.m) && Intrinsics.d(this.n, enaVar.n) && Intrinsics.d(this.o, enaVar.o) && this.p == enaVar.p && Intrinsics.d(this.q, enaVar.q);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f8084a.hashCode() * 31)) * 31;
        uka ukaVar = this.c;
        int iHashCode2 = (iHashCode + (ukaVar == null ? 0 : ukaVar.hashCode())) * 31;
        lha lhaVar = this.d;
        int iHashCode3 = (iHashCode2 + (lhaVar == null ? 0 : lhaVar.hashCode())) * 31;
        wnd wndVar = this.e;
        int iHashCode4 = (iHashCode3 + (wndVar == null ? 0 : wndVar.hashCode())) * 31;
        xka xkaVar = this.f;
        int iHashCode5 = (iHashCode4 + (xkaVar == null ? 0 : xkaVar.hashCode())) * 31;
        bpd bpdVar = this.g;
        int iHashCode6 = (iHashCode5 + (bpdVar == null ? 0 : bpdVar.hashCode())) * 31;
        uia uiaVar = this.h;
        int iHashCode7 = (iHashCode6 + (uiaVar == null ? 0 : uiaVar.hashCode())) * 31;
        yja yjaVar = this.i;
        int iHashCode8 = (iHashCode7 + (yjaVar == null ? 0 : yjaVar.f42730a.hashCode())) * 31;
        hna hnaVar = this.j;
        int iHashCode9 = (iHashCode8 + (hnaVar == null ? 0 : hnaVar.hashCode())) * 31;
        zvl0 zvl0Var = this.k;
        int iHashCode10 = (iHashCode9 + (zvl0Var == null ? 0 : zvl0Var.hashCode())) * 31;
        p700 p700Var = this.l;
        int iHashCode11 = (this.m.hashCode() + ((iHashCode10 + (p700Var == null ? 0 : p700Var.hashCode())) * 31)) * 31;
        woa woaVar = this.n;
        int iHashCode12 = (iHashCode11 + (woaVar == null ? 0 : woaVar.hashCode())) * 31;
        bha bhaVar = this.o;
        return this.q.hashCode() + brm0.e((iHashCode12 + (bhaVar != null ? bhaVar.hashCode() : 0)) * 31, 31, this.p);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(cardCommonModel=");
        sb.append(this.f8084a);
        sb.append(", compressedCardCommonModel=");
        sb.append(this.b);
        sb.append(", cardPenaltyModel=");
        sb.append(this.c);
        sb.append(", cardFootballPeriodModel=");
        sb.append(this.d);
        sb.append(", compressedCardFootballPeriodModel=");
        sb.append(this.e);
        sb.append(", cardPeriodModel=");
        sb.append(this.f);
        sb.append(", compressedCardPeriodModel=");
        sb.append(this.g);
        sb.append(", cardHostVsGuestsModel=");
        sb.append(this.h);
        sb.append(", cardMatchReviewModel=");
        sb.append(this.i);
        sb.append(", cardShortStatisticModel=");
        sb.append(this.j);
        sb.append(", stadiumInfoModel=");
        sb.append(this.k);
        sb.append(", lineStatisticModel=");
        sb.append(this.l);
        sb.append(", cardTimerSectionModel=");
        sb.append(this.m);
        sb.append(", cardWeatherModel=");
        sb.append(this.n);
        sb.append(", cardFootballActivitiesModel=");
        sb.append(this.o);
        sb.append(", show24=");
        sb.append(this.p);
        sb.append(", imageUrl=");
        return axq.n(sb, this.q, Separators.RPAREN);
    }
}
