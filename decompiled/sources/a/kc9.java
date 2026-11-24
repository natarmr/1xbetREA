package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class kc9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18047a;
    public final i4 b;
    public final String c;
    public final boolean d;

    public kc9(long j, i4 i4Var, String str, boolean z) {
        i4Var.getClass();
        str.getClass();
        this.f18047a = j;
        this.b = i4Var;
        this.c = str;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kc9)) {
            return false;
        }
        kc9 kc9Var = (kc9) obj;
        return this.f18047a == kc9Var.f18047a && Intrinsics.d(this.b, kc9Var.b) && Intrinsics.d(this.c, kc9Var.c) && this.d == kc9Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ua80.b(f140.c(this.b, Long.hashCode(this.f18047a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BuilderSportCouponItemUiModel(eventId=");
        sb.append(this.f18047a);
        sb.append(", builderTagList=");
        sb.append(this.b);
        w6x.z(", outcome=", this.c, ", isActive=", sb, this.d);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
