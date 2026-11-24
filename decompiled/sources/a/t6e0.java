package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class t6e0 {
    public static final r6e0 Companion = new r6e0();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new etd0(29))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f33415a;
    public final List b;

    public /* synthetic */ t6e0(int i, Integer num, List list) {
        if ((i & 1) == 0) {
            this.f33415a = null;
        } else {
            this.f33415a = num;
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
        if (!(obj instanceof t6e0)) {
            return false;
        }
        t6e0 t6e0Var = (t6e0) obj;
        return Intrinsics.d(this.f33415a, t6e0Var.f33415a) && Intrinsics.d(this.b, t6e0Var.b);
    }

    public final int hashCode() {
        Integer num = this.f33415a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return kng0.h(this.f33415a, "RatingRowResponse(id=", ", ratingValueCol=", Separators.RPAREN, this.b);
    }
}
