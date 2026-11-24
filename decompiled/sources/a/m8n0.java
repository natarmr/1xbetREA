package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class m8n0 {
    public static final l8n0 Companion = new l8n0();
    public static final a8z[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f21380a;
    public final String b;
    public final Long c;
    public final List d;

    static {
        wez wezVar = wez.f39042a;
        e = new a8z[]{maz.a(wezVar, new a7n0((byte) 4)), null, null, maz.a(wezVar, new a7n0((byte) 5))};
    }

    public /* synthetic */ m8n0(int i, List list, String str, Long l, List list2) {
        if ((i & 1) == 0) {
            this.f21380a = null;
        } else {
            this.f21380a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m8n0)) {
            return false;
        }
        m8n0 m8n0Var = (m8n0) obj;
        return Intrinsics.d(this.f21380a, m8n0Var.f21380a) && Intrinsics.d(this.b, m8n0Var.b) && Intrinsics.d(this.c, m8n0Var.c) && Intrinsics.d(this.d, m8n0Var.d);
    }

    public final int hashCode() {
        List list = this.f21380a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.c;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        List list2 = this.d;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = ua80.o("SubscriptionOpponentResponse(images=", ", name=", this.b, this.f21380a, ", countryId=");
        sbO.append(this.c);
        sbO.append(", ids=");
        sbO.append(this.d);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
