package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class fab {
    public static final dab Companion = new dab();
    public static final a8z[] f = {maz.a(wez.f39042a, new e0b(5)), null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9200a;
    public final Boolean b;
    public final Integer c;
    public final Integer d;
    public final String e;

    public /* synthetic */ fab(int i, Boolean bool, Integer num, Integer num2, String str, List list) {
        if ((i & 1) == 0) {
            this.f9200a = null;
        } else {
            this.f9200a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fab)) {
            return false;
        }
        fab fabVar = (fab) obj;
        return Intrinsics.d(this.f9200a, fabVar.f9200a) && Intrinsics.d(this.b, fabVar.b) && Intrinsics.d(this.c, fabVar.c) && Intrinsics.d(this.d, fabVar.d) && Intrinsics.d(this.e, fabVar.e);
    }

    public final int hashCode() {
        List list = this.f9200a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.e;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CellResponse(value=");
        sb.append(this.f9200a);
        sb.append(", isOffset=");
        sb.append(this.b);
        sb.append(", contentType=");
        rz4.y(sb, this.c, ", contentIconType=", this.d, ", competitorId=");
        return axq.n(sb, this.e, Separators.RPAREN);
    }
}
