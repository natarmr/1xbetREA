package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class xmb {
    public static final tmb Companion = new tmb();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new e0b(22))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f41117a;
    public final List b;

    public /* synthetic */ xmb(int i, Integer num, List list) {
        if ((i & 1) == 0) {
            this.f41117a = null;
        } else {
            this.f41117a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xmb)) {
            return false;
        }
        xmb xmbVar = (xmb) obj;
        return Intrinsics.d(this.f41117a, xmbVar.f41117a) && Intrinsics.d(this.b, xmbVar.b);
    }

    public final int hashCode() {
        Integer num = this.f41117a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return kng0.h(this.f41117a, "ChampsResultsResponse(count=", ", items=", Separators.RPAREN, this.b);
    }
}
