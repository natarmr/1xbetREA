package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class u3n0 {
    public static final o3n0 Companion = new o3n0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f35005a;
    public final String b;

    public /* synthetic */ u3n0(int i, Integer num, String str) {
        if ((i & 1) == 0) {
            this.f35005a = null;
        } else {
            this.f35005a = num;
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
        if (!(obj instanceof u3n0)) {
            return false;
        }
        u3n0 u3n0Var = (u3n0) obj;
        return Intrinsics.d(this.f35005a, u3n0Var.f35005a) && Intrinsics.d(this.b, u3n0Var.b);
    }

    public final int hashCode() {
        Integer num = this.f35005a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return ua80.f(this.f35005a, "SubSportResponse(id=", ", name=", this.b, Separators.RPAREN);
    }
}
