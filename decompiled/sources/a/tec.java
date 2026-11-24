package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class tec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f33813a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final List e;
    public final Set f;
    public final mdm g;

    public tec(boolean z, boolean z2, boolean z3, String str, List list, Set set, mdm mdmVar) {
        str.getClass();
        list.getClass();
        set.getClass();
        this.f33813a = z;
        this.b = z2;
        this.c = z3;
        this.d = str;
        this.e = list;
        this.f = set;
        this.g = mdmVar;
    }

    public static tec a(tec tecVar, boolean z, boolean z2, String str, List list, Set set, int i) {
        boolean z3 = (i & 1) != 0 ? tecVar.f33813a : false;
        if ((i & 2) != 0) {
            z = tecVar.b;
        }
        boolean z4 = z;
        if ((i & 4) != 0) {
            z2 = tecVar.c;
        }
        boolean z5 = z2;
        if ((i & 8) != 0) {
            str = tecVar.d;
        }
        String str2 = str;
        if ((i & 16) != 0) {
            list = tecVar.e;
        }
        List list2 = list;
        if ((i & 32) != 0) {
            set = tecVar.f;
        }
        Set set2 = set;
        mdm mdmVar = tecVar.g;
        tecVar.getClass();
        str2.getClass();
        list2.getClass();
        set2.getClass();
        return new tec(z3, z4, z5, str2, list2, set2, mdmVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tec)) {
            return false;
        }
        tec tecVar = (tec) obj;
        return this.f33813a == tecVar.f33813a && this.b == tecVar.b && this.c == tecVar.c && Intrinsics.d(this.d, tecVar.d) && Intrinsics.d(this.e, tecVar.e) && Intrinsics.d(this.f, tecVar.f) && this.g.equals(tecVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ohs0.g(this.f, dw9.a(ua80.b(brm0.e(brm0.e(Boolean.hashCode(this.f33813a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("ChooseCountryState(initial=", ", scrollTop=", ", searchFieldVisible=", this.f33813a, this.b);
        f140.s(", query=", this.d, ", allCountries=", sbQ, this.c);
        sbQ.append(this.e);
        sbQ.append(", selectedCountriesIds=");
        sbQ.append(this.f);
        sbQ.append(", lottieEmptySearchConfig=");
        return cs0.m(sbQ, this.g, Separators.RPAREN);
    }
}
