package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class jq1 implements rq1 {
    public static final iq1 Companion = new iq1();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new c51(11))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f16927a;
    public final List b;

    public /* synthetic */ jq1(int i, Long l, List list) {
        if ((i & 1) == 0) {
            this.f16927a = null;
        } else {
            this.f16927a = l;
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
        if (!(obj instanceof jq1)) {
            return false;
        }
        jq1 jq1Var = (jq1) obj;
        return Intrinsics.d(this.f16927a, jq1Var.f16927a) && Intrinsics.d(this.b, jq1Var.b);
    }

    public final int hashCode() {
        Long l = this.f16927a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "Category(partId=" + this.f16927a + ", brandIds=" + this.b + Separators.RPAREN;
    }
}
