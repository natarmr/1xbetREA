package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class olp0 {
    public static final nlp0 Companion = new nlp0();
    public static final a8z[] d = {null, null, maz.a(wez.f39042a, new mhp0(10))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25468a;
    public final Integer b;
    public final List c;

    public /* synthetic */ olp0(int i, Integer num, String str, List list) {
        if ((i & 1) == 0) {
            this.f25468a = null;
        } else {
            this.f25468a = str;
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof olp0)) {
            return false;
        }
        olp0 olp0Var = (olp0) obj;
        return Intrinsics.d(this.f25468a, olp0Var.f25468a) && Intrinsics.d(this.b, olp0Var.b) && Intrinsics.d(this.c, olp0Var.c);
    }

    public final int hashCode() {
        String str = this.f25468a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return dw9.r(axq.p(this.b, "TeamStatisticMenuResponse(id=", this.f25468a, ", stadiumId=", ", menu="), this.c, Separators.RPAREN);
    }
}
