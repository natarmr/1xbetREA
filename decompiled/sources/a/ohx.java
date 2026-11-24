package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ohx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f25287a;
    public final List b;
    public final l9s c;
    public final boolean d;
    public final mhx e;
    public final aw20 f;
    public final boolean g;

    public ohx(List list, List list2, l9s l9sVar, boolean z, mhx mhxVar, aw20 aw20Var, boolean z2) {
        list.getClass();
        list2.getClass();
        this.f25287a = list;
        this.b = list2;
        this.c = l9sVar;
        this.d = z;
        this.e = mhxVar;
        this.f = aw20Var;
        this.g = z2;
    }

    public static ohx a(ohx ohxVar, List list, List list2, l9s l9sVar, aw20 aw20Var, int i) {
        if ((i & 1) != 0) {
            list = ohxVar.f25287a;
        }
        List list3 = list;
        if ((i & 2) != 0) {
            list2 = ohxVar.b;
        }
        List list4 = list2;
        if ((i & 4) != 0) {
            l9sVar = ohxVar.c;
        }
        l9s l9sVar2 = l9sVar;
        boolean z = (i & 8) != 0 ? ohxVar.d : false;
        mhx mhxVar = ohxVar.e;
        if ((i & 32) != 0) {
            aw20Var = ohxVar.f;
        }
        aw20 aw20Var2 = aw20Var;
        boolean z2 = ohxVar.g;
        ohxVar.getClass();
        list3.getClass();
        list4.getClass();
        aw20Var2.getClass();
        return new ohx(list3, list4, l9sVar2, z, mhxVar, aw20Var2, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ohx)) {
            return false;
        }
        ohx ohxVar = (ohx) obj;
        return Intrinsics.d(this.f25287a, ohxVar.f25287a) && Intrinsics.d(this.b, ohxVar.b) && Intrinsics.d(this.c, ohxVar.c) && this.d == ohxVar.d && this.e.equals(ohxVar.e) && this.f.equals(ohxVar.f) && this.g == ohxVar.g;
    }

    public final int hashCode() {
        int iA = dw9.a(this.f25287a.hashCode() * 31, 31, this.b);
        l9s l9sVar = this.c;
        return Boolean.hashCode(this.g) + ((this.f.hashCode() + ((this.e.hashCode() + brm0.e((iA + (l9sVar == null ? 0 : l9sVar.hashCode())) * 31, 31, this.d)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("InsightsMarketsStateModel(totalExactSelectedModels=", ", insights=", this.f25287a, ", gameDetailsModel=", this.b);
        sbT.append(this.c);
        sbT.append(", isLoading=");
        sbT.append(this.d);
        sbT.append(", settings=");
        sbT.append(this.e);
        sbT.append(", marketPropertiesModel=");
        sbT.append(this.f);
        sbT.append(", rtlSupport=");
        return rw2.p(sbT, this.g, Separators.RPAREN);
    }
}
