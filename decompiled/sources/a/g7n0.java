package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class g7n0 {
    public static final f7n0 Companion = new f7n0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f10825a;
    public final String b;

    public /* synthetic */ g7n0(int i, Long l, String str) {
        if ((i & 1) == 0) {
            this.f10825a = null;
        } else {
            this.f10825a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g7n0)) {
            return false;
        }
        g7n0 g7n0Var = (g7n0) obj;
        return Intrinsics.d(this.f10825a, g7n0Var.f10825a) && Intrinsics.d(this.b, g7n0Var.b);
    }

    public final int hashCode() {
        Long l = this.f10825a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return ua80.g(this.f10825a, "SubscriptionEventPlayerResponse(id=", ", name=", this.b, Separators.RPAREN);
    }
}
