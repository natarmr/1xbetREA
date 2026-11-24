package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class uv4 {
    public static final sv4 Companion = new sv4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36330a;
    public final Long b;
    public final zv4 c;
    public final Integer d;

    public /* synthetic */ uv4(int i, String str, Long l, zv4 zv4Var, Integer num) {
        if ((i & 1) == 0) {
            this.f36330a = null;
        } else {
            this.f36330a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = zv4Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uv4)) {
            return false;
        }
        uv4 uv4Var = (uv4) obj;
        return Intrinsics.d(this.f36330a, uv4Var.f36330a) && Intrinsics.d(this.b, uv4Var.b) && this.c == uv4Var.c && Intrinsics.d(this.d, uv4Var.d);
    }

    public final int hashCode() {
        String str = this.f36330a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        zv4 zv4Var = this.c;
        int iHashCode3 = (iHashCode2 + (zv4Var == null ? 0 : zv4Var.hashCode())) * 31;
        Integer num = this.d;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = kng0.s(this.b, "AutoBetCancelResponse(id=", this.f36330a, ", result=", ", status=");
        sbS.append(this.c);
        sbS.append(", waitTime=");
        sbS.append(this.d);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
