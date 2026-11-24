package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class deh {
    public static final ceh Companion = new ceh();
    public static final a8z[] e = {null, null, maz.a(wez.f39042a, new gch(2)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f5950a;
    public final Integer b;
    public final List c;
    public final String d;

    public /* synthetic */ deh(int i, Integer num, Integer num2, String str, List list) {
        if ((i & 1) == 0) {
            this.f5950a = null;
        } else {
            this.f5950a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof deh)) {
            return false;
        }
        deh dehVar = (deh) obj;
        return Intrinsics.d(this.f5950a, dehVar.f5950a) && Intrinsics.d(this.b, dehVar.b) && Intrinsics.d(this.c, dehVar.c) && Intrinsics.d(this.d, dehVar.d);
    }

    public final int hashCode() {
        Integer num = this.f5950a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        List list = this.c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.d;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = hne.q("CyberStageTableBodyColumnResponse(id=", this.f5950a, ", contentType=", this.b, ", value=");
        sbQ.append(this.c);
        sbQ.append(", competitorId=");
        sbQ.append(this.d);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
