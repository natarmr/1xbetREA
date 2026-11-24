package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class xs2 {
    public static final ws2 Companion = new ws2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final us2 f41393a;
    public final String b;

    public /* synthetic */ xs2(int i, us2 us2Var, String str) {
        if ((i & 1) == 0) {
            this.f41393a = null;
        } else {
            this.f41393a = us2Var;
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
        if (!(obj instanceof xs2)) {
            return false;
        }
        xs2 xs2Var = (xs2) obj;
        return Intrinsics.d(this.f41393a, xs2Var.f41393a) && Intrinsics.d(this.b, xs2Var.b);
    }

    public final int hashCode() {
        us2 us2Var = this.f41393a;
        int iHashCode = (us2Var == null ? 0 : us2Var.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "AnalyticsEventRequestData(attributes=" + this.f41393a + ", type=" + this.b + Separators.RPAREN;
    }

    public xs2(us2 us2Var) {
        this.f41393a = us2Var;
        this.b = "AnalyticsEvent";
    }
}
