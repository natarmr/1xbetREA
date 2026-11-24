package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class kei0 extends oei0 {
    public static final jei0 Companion = new jei0();
    public static final a8z[] g = {null, maz.a(wez.f39042a, new gei0((byte) 1)), null, null, null};
    public final String b;
    public final List c;
    public final Date d;
    public final String e;
    public final Boolean f;

    public /* synthetic */ kei0(int i, String str, List list, Date date, String str2, Boolean bool) {
        if ((i & 1) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 2) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
        if ((i & 4) == 0) {
            this.d = null;
        } else {
            this.d = date;
        }
        if ((i & 8) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        if ((i & 16) == 0) {
            this.f = null;
        } else {
            this.f = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kei0)) {
            return false;
        }
        kei0 kei0Var = (kei0) obj;
        return Intrinsics.d(this.b, kei0Var.b) && Intrinsics.d(this.c, kei0Var.c) && Intrinsics.d(this.d, kei0Var.d) && Intrinsics.d(this.e, kei0Var.e) && Intrinsics.d(this.f, kei0Var.f);
    }

    public final int hashCode() {
        String str = this.b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.c;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Date date = this.d;
        int iHashCode3 = (iHashCode2 + (date == null ? 0 : date.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbF = defpackage.c.f("FilesModel(text=", this.b, ", filePaths=", this.c, ", createdDate=");
        sbF.append(this.d);
        sbF.append(", keyForLocalStore=");
        sbF.append(this.e);
        sbF.append(", sendWithError=");
        return defpackage.c.e(sbF, this.f, Separators.RPAREN);
    }

    public kei0(String str, ArrayList arrayList, Date date, String str2, Boolean bool) {
        this.b = str;
        this.c = arrayList;
        this.d = date;
        this.e = str2;
        this.f = bool;
    }
}
