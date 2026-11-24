package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class h4a0 {
    public static final f4a0 Companion = new f4a0();
    public static final a8z[] e = {null, null, maz.a(wez.f39042a, new wm90(18)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f12425a;
    public final Integer b;
    public final List c;
    public final Integer d;

    public /* synthetic */ h4a0(int i, Integer num, Integer num2, Integer num3, List list) {
        if ((i & 1) == 0) {
            this.f12425a = null;
        } else {
            this.f12425a = num;
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
            this.d = num3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h4a0)) {
            return false;
        }
        h4a0 h4a0Var = (h4a0) obj;
        return Intrinsics.d(this.f12425a, h4a0Var.f12425a) && Intrinsics.d(this.b, h4a0Var.b) && Intrinsics.d(this.c, h4a0Var.c) && Intrinsics.d(this.d, h4a0Var.d);
    }

    public final int hashCode() {
        Integer num = this.f12425a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        List list = this.c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num3 = this.d;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = hne.q("PlayerInfoResponse(total=", this.f12425a, ", numberOfThrows=", this.b, ", throws=");
        sbQ.append(this.c);
        sbQ.append(", sumOfThrows=");
        sbQ.append(this.d);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
