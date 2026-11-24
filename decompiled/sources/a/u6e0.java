package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class u6e0 {
    public static final s6e0 Companion = new s6e0();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new o6e0(0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f35135a;
    public final List b;

    public /* synthetic */ u6e0(int i, Long l, List list) {
        if ((i & 1) == 0) {
            this.f35135a = null;
        } else {
            this.f35135a = l;
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
        if (!(obj instanceof u6e0)) {
            return false;
        }
        u6e0 u6e0Var = (u6e0) obj;
        return Intrinsics.d(this.f35135a, u6e0Var.f35135a) && Intrinsics.d(this.b, u6e0Var.b);
    }

    public final int hashCode() {
        Long l = this.f35135a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "RatingRowResponse(id=" + this.f35135a + ", ratingValueCol=" + this.b + Separators.RPAREN;
    }
}
