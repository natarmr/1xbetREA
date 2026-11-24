package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.registration_default.impl.presentation.udf.state.models.fields.BonusStateModel;
import org.xplatform.registration_default.impl.presentation.udf.state.models.fields.CitizenshipStateModel;
import org.xplatform.registration_default.impl.presentation.udf.state.models.fields.CityStateModel;
import org.xplatform.registration_default.impl.presentation.udf.state.models.fields.CountryStateModel;
import org.xplatform.registration_default.impl.presentation.udf.state.models.fields.CurrencyStateModel;
import org.xplatform.registration_default.impl.presentation.udf.state.models.fields.RegionStateModel;

/* JADX INFO: loaded from: classes5.dex */
public final class aye0 {
    public final cne0 A;
    public final boolean B;
    public final mdm C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1667a;
    public final boolean b;
    public final boolean c;
    public final List d;
    public final List e;
    public final Map f;
    public final List g;
    public final q1f0 h;
    public final Map i;
    public final Map j;
    public final q7f0 k;
    public final Integer l;
    public final sff0 m;
    public final u0f0 n;
    public final List o;
    public final boolean p;
    public final boolean q;
    public final v8d r;
    public final CountryStateModel s;
    public final RegionStateModel t;
    public final CurrencyStateModel u;
    public final BonusStateModel v;
    public final CitizenshipStateModel w;
    public final CityStateModel x;
    public final String y;
    public final Integer z;

    public aye0(boolean z, boolean z2, boolean z3, List list, List list2, Map map, List list3, q1f0 q1f0Var, Map map2, Map map3, q7f0 q7f0Var, Integer num, sff0 sff0Var, u0f0 u0f0Var, List list4, boolean z4, boolean z5, v8d v8dVar, CountryStateModel countryStateModel, RegionStateModel regionStateModel, CurrencyStateModel currencyStateModel, BonusStateModel bonusStateModel, CitizenshipStateModel citizenshipStateModel, CityStateModel cityStateModel, String str, Integer num2, cne0 cne0Var, boolean z6, mdm mdmVar) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        v8dVar.getClass();
        this.f1667a = z;
        this.b = z2;
        this.c = z3;
        this.d = list;
        this.e = list2;
        this.f = map;
        this.g = list3;
        this.h = q1f0Var;
        this.i = map2;
        this.j = map3;
        this.k = q7f0Var;
        this.l = num;
        this.m = sff0Var;
        this.n = u0f0Var;
        this.o = list4;
        this.p = z4;
        this.q = z5;
        this.r = v8dVar;
        this.s = countryStateModel;
        this.t = regionStateModel;
        this.u = currencyStateModel;
        this.v = bonusStateModel;
        this.w = citizenshipStateModel;
        this.x = cityStateModel;
        this.y = str;
        this.z = num2;
        this.A = cne0Var;
        this.B = z6;
        this.C = mdmVar;
    }

    public static aye0 a(aye0 aye0Var, boolean z, boolean z2, boolean z3, List list, List list2, Map map, ArrayList arrayList, q1f0 q1f0Var, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, u0f0 u0f0Var, List list3, boolean z4, CountryStateModel countryStateModel, RegionStateModel regionStateModel, CurrencyStateModel currencyStateModel, BonusStateModel bonusStateModel, CitizenshipStateModel citizenshipStateModel, CityStateModel cityStateModel, String str, Integer num, int i) {
        boolean z5 = (i & 1) != 0 ? aye0Var.f1667a : z;
        boolean z6 = (i & 2) != 0 ? aye0Var.b : z2;
        boolean z7 = (i & 4) != 0 ? aye0Var.c : z3;
        List list4 = (i & 8) != 0 ? aye0Var.d : list;
        List list5 = (i & 16) != 0 ? aye0Var.e : list2;
        Map map2 = (i & 32) != 0 ? aye0Var.f : map;
        List list6 = (i & 64) != 0 ? aye0Var.g : arrayList;
        q1f0 q1f0Var2 = (i & 128) != 0 ? aye0Var.h : q1f0Var;
        Map map3 = (i & 256) != 0 ? aye0Var.i : linkedHashMap;
        Map map4 = (i & 512) != 0 ? aye0Var.j : linkedHashMap2;
        aye0Var.getClass();
        q7f0 q7f0Var = aye0Var.k;
        Integer num2 = aye0Var.l;
        sff0 sff0Var = aye0Var.m;
        u0f0 u0f0Var2 = (i & 16384) != 0 ? aye0Var.n : u0f0Var;
        List list7 = (32768 & i) != 0 ? aye0Var.o : list3;
        boolean z8 = (65536 & i) != 0 ? aye0Var.p : z4;
        boolean z9 = aye0Var.q;
        v8d v8dVar = aye0Var.r;
        CountryStateModel countryStateModel2 = (i & 524288) != 0 ? aye0Var.s : countryStateModel;
        RegionStateModel regionStateModel2 = (i & 1048576) != 0 ? aye0Var.t : regionStateModel;
        CurrencyStateModel currencyStateModel2 = (i & 2097152) != 0 ? aye0Var.u : currencyStateModel;
        BonusStateModel bonusStateModel2 = (i & 4194304) != 0 ? aye0Var.v : bonusStateModel;
        CitizenshipStateModel citizenshipStateModel2 = (i & 8388608) != 0 ? aye0Var.w : citizenshipStateModel;
        CityStateModel cityStateModel2 = (i & 16777216) != 0 ? aye0Var.x : cityStateModel;
        String str2 = (i & 33554432) != 0 ? aye0Var.y : str;
        Integer num3 = (i & 67108864) != 0 ? aye0Var.z : num;
        cne0 cne0Var = aye0Var.A;
        aye0Var.getClass();
        boolean z10 = aye0Var.B;
        mdm mdmVar = aye0Var.C;
        aye0Var.getClass();
        list4.getClass();
        list5.getClass();
        map2.getClass();
        list6.getClass();
        q1f0Var2.getClass();
        list7.getClass();
        v8dVar.getClass();
        return new aye0(z5, z6, z7, list4, list5, map2, list6, q1f0Var2, map3, map4, q7f0Var, num2, sff0Var, u0f0Var2, list7, z8, z9, v8dVar, countryStateModel2, regionStateModel2, currencyStateModel2, bonusStateModel2, citizenshipStateModel2, cityStateModel2, str2, num3, cne0Var, z10, mdmVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aye0)) {
            return false;
        }
        aye0 aye0Var = (aye0) obj;
        return this.f1667a == aye0Var.f1667a && this.b == aye0Var.b && this.c == aye0Var.c && Intrinsics.d(this.d, aye0Var.d) && Intrinsics.d(this.e, aye0Var.e) && this.f.equals(aye0Var.f) && Intrinsics.d(this.g, aye0Var.g) && this.h.equals(aye0Var.h) && this.i.equals(aye0Var.i) && this.j.equals(aye0Var.j) && this.k == aye0Var.k && Intrinsics.d(this.l, aye0Var.l) && this.m.equals(aye0Var.m) && this.n == aye0Var.n && Intrinsics.d(this.o, aye0Var.o) && this.p == aye0Var.p && this.q == aye0Var.q && Intrinsics.d(this.r, aye0Var.r) && Intrinsics.d(this.s, aye0Var.s) && Intrinsics.d(this.t, aye0Var.t) && Intrinsics.d(this.u, aye0Var.u) && Intrinsics.d(this.v, aye0Var.v) && Intrinsics.d(this.w, aye0Var.w) && Intrinsics.d(this.x, aye0Var.x) && Intrinsics.d(this.y, aye0Var.y) && Intrinsics.d(this.z, aye0Var.z) && this.A.equals(aye0Var.A) && this.B == aye0Var.B && this.C.equals(aye0Var.C);
    }

    public final int hashCode() {
        int iE = brm0.e(ohs0.f(this.j, ohs0.f(this.i, (this.h.hashCode() + dw9.a(ohs0.f(this.f, dw9.a(dw9.a(brm0.e(brm0.e(Boolean.hashCode(this.f1667a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31, this.g)) * 31, 31), 31), 31, false);
        q7f0 q7f0Var = this.k;
        int iHashCode = (iE + (q7f0Var == null ? 0 : q7f0Var.hashCode())) * 31;
        Integer num = this.l;
        int iC = cs0.c(this.m, (iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31);
        u0f0 u0f0Var = this.n;
        int iHashCode2 = (this.r.hashCode() + brm0.e(brm0.e(dw9.a((iC + (u0f0Var == null ? 0 : u0f0Var.hashCode())) * 31, 31, this.o), 31, this.p), 31, this.q)) * 31;
        CountryStateModel countryStateModel = this.s;
        int iHashCode3 = (iHashCode2 + (countryStateModel == null ? 0 : countryStateModel.hashCode())) * 31;
        RegionStateModel regionStateModel = this.t;
        int iHashCode4 = (iHashCode3 + (regionStateModel == null ? 0 : regionStateModel.hashCode())) * 31;
        CurrencyStateModel currencyStateModel = this.u;
        int iHashCode5 = (iHashCode4 + (currencyStateModel == null ? 0 : currencyStateModel.hashCode())) * 31;
        BonusStateModel bonusStateModel = this.v;
        int iHashCode6 = (iHashCode5 + (bonusStateModel == null ? 0 : bonusStateModel.hashCode())) * 31;
        CitizenshipStateModel citizenshipStateModel = this.w;
        int iHashCode7 = (iHashCode6 + (citizenshipStateModel == null ? 0 : citizenshipStateModel.hashCode())) * 31;
        CityStateModel cityStateModel = this.x;
        int iHashCode8 = (iHashCode7 + (cityStateModel == null ? 0 : cityStateModel.hashCode())) * 31;
        String str = this.y;
        int iHashCode9 = (iHashCode8 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.z;
        return this.C.hashCode() + brm0.e(twn.a(1357, (this.A.hashCode() + ((iHashCode9 + (num2 != null ? num2.hashCode() : 0)) * 31)) * 31, 31), 31, this.B);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("RegistrationDefaultStateModel(isBlockingLoading=", ", isContentLoading=", ", hasLoadError=", this.f1667a, this.b);
        vqd.y(sbQ, ", passwordRequirementList=", this.d, ", registrationFieldModelList=", this.c);
        sbQ.append(this.e);
        sbQ.append(", registrationFieldModelErrorMap=");
        sbQ.append(this.f);
        sbQ.append(", socialsList=");
        sbQ.append(this.g);
        sbQ.append(", fields=");
        sbQ.append(this.h);
        sbQ.append(", registrationFieldModelImeActionMap=");
        sbQ.append(this.i);
        sbQ.append(", registrationFieldModelFocusMap=");
        sbQ.append(this.j);
        sbQ.append(", hasError=false, registrationTypeSelected=");
        sbQ.append(this.k);
        sbQ.append(", onlyOneSocialType=");
        sbQ.append(this.l);
        sbQ.append(", remoteConfigModel=");
        sbQ.append(this.m);
        sbQ.append(", scrollToField=");
        sbQ.append(this.n);
        sbQ.append(", bonusInfoModelList=");
        rz4.z(sbQ, ", isInternetConnected=", this.o, ", isBettingDisable=", this.p);
        sbQ.append(this.q);
        sbQ.append(", commonConfig=");
        sbQ.append(this.r);
        sbQ.append(", initialCountry=");
        sbQ.append(this.s);
        sbQ.append(", initialRegion=");
        sbQ.append(this.t);
        sbQ.append(", initialCurrency=");
        sbQ.append(this.u);
        sbQ.append(", initialBonus=");
        sbQ.append(this.v);
        sbQ.append(", initialCitizenship=");
        sbQ.append(this.w);
        sbQ.append(", initialCity=");
        sbQ.append(this.x);
        sbQ.append(", initialPromoCode=");
        axq.x(this.z, this.y, ", defaultBonusId=", ", referralInformationModel=", sbQ);
        sbQ.append(this.A);
        sbQ.append(", groupId=1357, initialNotifyNewsCall=");
        sbQ.append(this.B);
        sbQ.append(", dsEmptyConfig=");
        return cs0.m(sbQ, this.C, Separators.RPAREN);
    }
}
