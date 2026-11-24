package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class odh0 {
    public static final ndh0 Companion = new ndh0();
    public static final a8z[] d = {null, null, maz.a(wez.f39042a, new yxg0(29))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f25075a;
    public final Integer b;
    public final List c;

    public /* synthetic */ odh0(int i, Integer num, Integer num2, List list) {
        if ((i & 1) == 0) {
            this.f25075a = null;
        } else {
            this.f25075a = num;
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof odh0)) {
            return false;
        }
        odh0 odh0Var = (odh0) obj;
        return Intrinsics.d(this.f25075a, odh0Var.f25075a) && Intrinsics.d(this.b, odh0Var.b) && Intrinsics.d(this.c, odh0Var.c);
    }

    public final int hashCode() {
        Integer num = this.f25075a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return dw9.r(hne.q("SeaBattleShipResponse(size=", this.f25075a, ", orientation=", this.b, ", coordinates="), this.c, Separators.RPAREN);
    }
}
