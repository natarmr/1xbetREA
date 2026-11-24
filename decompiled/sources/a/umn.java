package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class umn {
    public static final tmn Companion = new tmn();
    public static final a8z[] d = {null, null, maz.a(wez.f39042a, new dcn(22))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35925a;
    public final Long b;
    public final List c;

    public /* synthetic */ umn(int i, int i2, Long l, List list) {
        if (7 != (i & 7)) {
            m2x.I(i, 7, smn.f32455a.getDescriptor());
            throw null;
        }
        this.f35925a = i2;
        this.b = l;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof umn)) {
            return false;
        }
        umn umnVar = (umn) obj;
        return this.f35925a == umnVar.f35925a && Intrinsics.d(this.b, umnVar.b) && Intrinsics.d(this.c, umnVar.c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f35925a) * 31;
        Long l = this.b;
        return this.c.hashCode() + ((iHashCode + (l == null ? 0 : l.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditCouponRequest(cfView=");
        sb.append(this.f35925a);
        sb.append(", userBonusId=");
        sb.append(this.b);
        sb.append(", idList=");
        return dw9.r(sb, this.c, Separators.RPAREN);
    }

    public umn(int i, Long l, List list) {
        list.getClass();
        this.f35925a = i;
        this.b = l;
        this.c = list;
    }
}
