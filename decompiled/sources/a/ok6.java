package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class ok6 {
    public static final nk6 Companion = new nk6();
    public static final a8z[] d = {null, null, maz.a(wez.f39042a, new lg6(4))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25391a;
    public final Integer b;
    public final List c;

    public /* synthetic */ ok6(int i, Integer num, String str, List list) {
        if ((i & 1) == 0) {
            this.f25391a = null;
        } else {
            this.f25391a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
    }

    public final List a() {
        ArrayList arrayList = null;
        List list = this.c;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = ((lk6) it.next()).c;
                String strP0 = str != null ? StringsKt.p0(str, Separators.SLASH, str) : null;
                if (strP0 == null) {
                    strP0 = "";
                }
                arrayList2.add(strP0);
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? iun.f15405a : arrayList;
    }

    public final List b() {
        ArrayList arrayList;
        List list = this.c;
        if (list != null) {
            arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Long l = ((lk6) it.next()).f20184a;
                if (l != null) {
                    arrayList.add(l);
                }
            }
        } else {
            arrayList = null;
        }
        return arrayList == null ? iun.f15405a : arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ok6)) {
            return false;
        }
        ok6 ok6Var = (ok6) obj;
        return Intrinsics.d(this.f25391a, ok6Var.f25391a) && Intrinsics.d(this.b, ok6Var.b) && Intrinsics.d(this.c, ok6Var.c);
    }

    public final int hashCode() {
        String str = this.f25391a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return dw9.r(axq.p(this.b, "BetBuilderOpponentResponse(fullName=", this.f25391a, ", countryId=", ", opps="), this.c, Separators.RPAREN);
    }
}
