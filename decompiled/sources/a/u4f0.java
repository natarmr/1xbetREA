package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.registration.simple.impl.presentation.state.models.fields.BonusStateModel;
import org.xplatform.registration.simple.impl.presentation.state.models.fields.CitizenshipStateModel;
import org.xplatform.registration.simple.impl.presentation.state.models.fields.CityStateModel;
import org.xplatform.registration.simple.impl.presentation.state.models.fields.CountryStateModel;
import org.xplatform.registration.simple.impl.presentation.state.models.fields.CurrencyStateModel;
import org.xplatform.registration.simple.impl.presentation.state.models.fields.RegionStateModel;

/* JADX INFO: loaded from: classes5.dex */
public final class u4f0 {
    public final cne0 A;
    public final boolean B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f35045a;
    public final boolean b;
    public final List c;
    public final List d;
    public final Map e;
    public final List f;
    public final r1f0 g;
    public final Map h;
    public final Map i;
    public final q7f0 j;
    public final Integer k;
    public final List l;
    public final sff0 m;
    public final boolean n;
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

    public u4f0(boolean z, boolean z2, List list, List list2, Map map, List list3, r1f0 r1f0Var, Map map2, Map map3, q7f0 q7f0Var, Integer num, List list4, sff0 sff0Var, boolean z3, List list5, boolean z4, boolean z5, v8d v8dVar, CountryStateModel countryStateModel, RegionStateModel regionStateModel, CurrencyStateModel currencyStateModel, BonusStateModel bonusStateModel, CitizenshipStateModel citizenshipStateModel, CityStateModel cityStateModel, String str, Integer num2, cne0 cne0Var, boolean z6) {
        rz4.B(list, list2, list3, list4, list5);
        v8dVar.getClass();
        this.f35045a = z;
        this.b = z2;
        this.c = list;
        this.d = list2;
        this.e = map;
        this.f = list3;
        this.g = r1f0Var;
        this.h = map2;
        this.i = map3;
        this.j = q7f0Var;
        this.k = num;
        this.l = list4;
        this.m = sff0Var;
        this.n = z3;
        this.o = list5;
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
    }

    public static u4f0 a(u4f0 u4f0Var, boolean z, boolean z2, List list, List list2, Map map, ArrayList arrayList, r1f0 r1f0Var, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, q7f0 q7f0Var, List list3, boolean z3, List list4, boolean z4, CountryStateModel countryStateModel, RegionStateModel regionStateModel, CurrencyStateModel currencyStateModel, BonusStateModel bonusStateModel, CitizenshipStateModel citizenshipStateModel, CityStateModel cityStateModel, String str, Integer num, int i) {
        boolean z5 = (i & 1) != 0 ? u4f0Var.f35045a : z;
        boolean z6 = (i & 2) != 0 ? u4f0Var.b : z2;
        List list5 = (i & 4) != 0 ? u4f0Var.c : list;
        List list6 = (i & 8) != 0 ? u4f0Var.d : list2;
        Map map2 = (i & 16) != 0 ? u4f0Var.e : map;
        List list7 = (i & 32) != 0 ? u4f0Var.f : arrayList;
        r1f0 r1f0Var2 = (i & 64) != 0 ? u4f0Var.g : r1f0Var;
        Map map3 = (i & 128) != 0 ? u4f0Var.h : linkedHashMap;
        Map map4 = (i & 256) != 0 ? u4f0Var.i : linkedHashMap2;
        u4f0Var.getClass();
        q7f0 q7f0Var2 = (i & 1024) != 0 ? u4f0Var.j : q7f0Var;
        Integer num2 = u4f0Var.k;
        List list8 = (i & 4096) != 0 ? u4f0Var.l : list3;
        sff0 sff0Var = u4f0Var.m;
        boolean z7 = (i & 16384) != 0 ? u4f0Var.n : z3;
        List list9 = (32768 & i) != 0 ? u4f0Var.o : list4;
        boolean z8 = (65536 & i) != 0 ? u4f0Var.p : z4;
        boolean z9 = u4f0Var.q;
        v8d v8dVar = u4f0Var.r;
        CountryStateModel countryStateModel2 = (i & 524288) != 0 ? u4f0Var.s : countryStateModel;
        RegionStateModel regionStateModel2 = (i & 1048576) != 0 ? u4f0Var.t : regionStateModel;
        CurrencyStateModel currencyStateModel2 = (i & 2097152) != 0 ? u4f0Var.u : currencyStateModel;
        BonusStateModel bonusStateModel2 = (i & 4194304) != 0 ? u4f0Var.v : bonusStateModel;
        CitizenshipStateModel citizenshipStateModel2 = (i & 8388608) != 0 ? u4f0Var.w : citizenshipStateModel;
        CityStateModel cityStateModel2 = (i & 16777216) != 0 ? u4f0Var.x : cityStateModel;
        String str2 = (i & 33554432) != 0 ? u4f0Var.y : str;
        Integer num3 = (i & 67108864) != 0 ? u4f0Var.z : num;
        cne0 cne0Var = u4f0Var.A;
        u4f0Var.getClass();
        boolean z10 = u4f0Var.B;
        u4f0Var.getClass();
        list5.getClass();
        list6.getClass();
        map2.getClass();
        list7.getClass();
        r1f0Var2.getClass();
        list8.getClass();
        list9.getClass();
        v8dVar.getClass();
        return new u4f0(z5, z6, list5, list6, map2, list7, r1f0Var2, map3, map4, q7f0Var2, num2, list8, sff0Var, z7, list9, z8, z9, v8dVar, countryStateModel2, regionStateModel2, currencyStateModel2, bonusStateModel2, citizenshipStateModel2, cityStateModel2, str2, num3, cne0Var, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u4f0)) {
            return false;
        }
        u4f0 u4f0Var = (u4f0) obj;
        return this.f35045a == u4f0Var.f35045a && this.b == u4f0Var.b && Intrinsics.d(this.c, u4f0Var.c) && Intrinsics.d(this.d, u4f0Var.d) && this.e.equals(u4f0Var.e) && Intrinsics.d(this.f, u4f0Var.f) && this.g.equals(u4f0Var.g) && this.h.equals(u4f0Var.h) && this.i.equals(u4f0Var.i) && this.j == u4f0Var.j && Intrinsics.d(this.k, u4f0Var.k) && Intrinsics.d(this.l, u4f0Var.l) && this.m.equals(u4f0Var.m) && this.n == u4f0Var.n && Intrinsics.d(this.o, u4f0Var.o) && this.p == u4f0Var.p && this.q == u4f0Var.q && Intrinsics.d(this.r, u4f0Var.r) && Intrinsics.d(this.s, u4f0Var.s) && Intrinsics.d(this.t, u4f0Var.t) && Intrinsics.d(this.u, u4f0Var.u) && Intrinsics.d(this.v, u4f0Var.v) && Intrinsics.d(this.w, u4f0Var.w) && Intrinsics.d(this.x, u4f0Var.x) && Intrinsics.d(this.y, u4f0Var.y) && Intrinsics.d(this.z, u4f0Var.z) && this.A.equals(u4f0Var.A) && this.B == u4f0Var.B;
    }

    public final int hashCode() {
        int iE = brm0.e(ohs0.f(this.i, ohs0.f(this.h, (this.g.hashCode() + dw9.a(ohs0.f(this.e, dw9.a(dw9.a(brm0.e(Boolean.hashCode(this.f35045a) * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f)) * 31, 31), 31), 31, false);
        q7f0 q7f0Var = this.j;
        int iHashCode = (iE + (q7f0Var == null ? 0 : q7f0Var.hashCode())) * 31;
        Integer num = this.k;
        int iHashCode2 = (this.r.hashCode() + brm0.e(brm0.e(dw9.a(brm0.e(cs0.c(this.m, dw9.a((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.l), 31), 31, this.n), 31, this.o), 31, this.p), 31, this.q)) * 31;
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
        return Boolean.hashCode(this.B) + twn.a(1357, (this.A.hashCode() + ((iHashCode9 + (num2 != null ? num2.hashCode() : 0)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("RegistrationSimpleStateModel(isLoading=", ", isFieldsLoading=", ", passwordRequirementList=", this.f35045a, this.b);
        b1j.y(", registrationFieldModelList=", ", registrationFieldModelErrorMap=", sbQ, this.c, this.d);
        sbQ.append(this.e);
        sbQ.append(", socialsList=");
        sbQ.append(this.f);
        sbQ.append(", fields=");
        sbQ.append(this.g);
        sbQ.append(", registrationFieldModelImeActionMap=");
        sbQ.append(this.h);
        sbQ.append(", registrationFieldModelFocusMap=");
        sbQ.append(this.i);
        sbQ.append(", hasError=false, registrationTypeSelected=");
        sbQ.append(this.j);
        sbQ.append(", onlyOneSocialType=");
        cs0.z(sbQ, this.k, ", registrationTypes=", this.l, ", remoteConfigModel=");
        sbQ.append(this.m);
        sbQ.append(", tabsIsVisible=");
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
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
