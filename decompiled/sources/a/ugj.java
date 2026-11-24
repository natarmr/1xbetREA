package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ugj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35626a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;

    public ugj(String str, String str2, List list, String str3, List list2) {
        list.getClass();
        list2.getClass();
        this.f35626a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = list2;
    }

    public static ugj a(ugj ugjVar, String str, String str2, String str3, ArrayList arrayList, ArrayList arrayList2, int i) {
        if ((i & 1) != 0) {
            str = ugjVar.f35626a;
        }
        String str4 = str;
        if ((i & 2) != 0) {
            str2 = ugjVar.b;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = ugjVar.c;
        }
        String str6 = str3;
        List list = arrayList;
        if ((i & 8) != 0) {
            list = ugjVar.d;
        }
        List list2 = list;
        List list3 = arrayList2;
        if ((i & 16) != 0) {
            list3 = ugjVar.e;
        }
        List list4 = list3;
        ugjVar.getClass();
        str4.getClass();
        str6.getClass();
        list2.getClass();
        list4.getClass();
        return new ugj(str4, str5, list2, str6, list4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ugj)) {
            return false;
        }
        ugj ugjVar = (ugj) obj;
        return this.f35626a.equals(ugjVar.f35626a) && this.b.equals(ugjVar.b) && this.c.equals(ugjVar.c) && Intrinsics.d(this.d, ugjVar.d) && Intrinsics.d(this.e, ugjVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + dw9.a(ua80.b(ua80.b(this.f35626a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("ScreenUiState(eventTitle=", this.f35626a, ", totalCoeff=", this.b, ", eventsValue=");
        cs0.y(this.c, ", expressIcons=", ", uiItems=", sbN, this.d);
        return dw9.r(sbN, this.e, Separators.RPAREN);
    }
}
