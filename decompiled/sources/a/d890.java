package a;

import android.gov.nist.core.Separators;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d890 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5636a;
    public final String b;
    public final Map c;
    public final long d;
    public final c890 e;
    public final boolean f;

    public d890(int i, String str, Map map, long j, c890 c890Var, boolean z) {
        str.getClass();
        map.getClass();
        this.f5636a = i;
        this.b = str;
        this.c = map;
        this.d = j;
        this.e = c890Var;
        this.f = z;
    }

    public static d890 a(d890 d890Var, Map map, long j, c890 c890Var, boolean z, int i) {
        int i2 = d890Var.f5636a;
        String str = d890Var.b;
        if ((i & 4) != 0) {
            map = d890Var.c;
        }
        Map map2 = map;
        if ((i & 8) != 0) {
            j = d890Var.d;
        }
        long j2 = j;
        if ((i & 16) != 0) {
            c890Var = d890Var.e;
        }
        c890 c890Var2 = c890Var;
        if ((i & 32) != 0) {
            z = d890Var.f;
        }
        d890Var.getClass();
        str.getClass();
        map2.getClass();
        return new d890(i2, str, map2, j2, c890Var2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d890)) {
            return false;
        }
        d890 d890Var = (d890) obj;
        return this.f5636a == d890Var.f5636a && Intrinsics.d(this.b, d890Var.b) && Intrinsics.d(this.c, d890Var.c) && this.d == d890Var.d && this.e == d890Var.e && this.f == d890Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + rw2.b(ohs0.f(this.c, ua80.b(Integer.hashCode(this.f5636a) * 31, 31, this.b), 31), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f5636a, "PaymentInfoState(projectId=", ", url=", this.b, ", extraHeaders=");
        sbR.append(this.c);
        sbR.append(", loadEventId=");
        sbR.append(this.d);
        sbR.append(", pageState=");
        sbR.append(this.e);
        sbR.append(", reloadEnable=");
        sbR.append(this.f);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
