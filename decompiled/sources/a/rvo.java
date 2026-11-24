package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class rvo {
    public static final qvo Companion = new qvo();
    public static final a8z[] c = {maz.a(wez.f39042a, new ago(22)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f31180a;
    public final Integer b;

    public /* synthetic */ rvo(int i, Integer num, List list) {
        if ((i & 1) == 0) {
            this.f31180a = null;
        } else {
            this.f31180a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rvo)) {
            return false;
        }
        rvo rvoVar = (rvo) obj;
        return Intrinsics.d(this.f31180a, rvoVar.f31180a) && Intrinsics.d(this.b, rvoVar.b);
    }

    public final int hashCode() {
        List list = this.f31180a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "FactsStatisticResponse(response=" + this.f31180a + ", sportId=" + this.b + Separators.RPAREN;
    }
}
