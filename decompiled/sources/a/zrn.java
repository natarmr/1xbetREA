package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class zrn {
    public static final xrn Companion = new xrn();
    public static final a8z[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f44863a;
    public final Double b;
    public final Integer c;
    public final List d;
    public final List e;

    static {
        wez wezVar = wez.f39042a;
        f = new a8z[]{null, null, null, maz.a(wezVar, new dcn((byte) 29)), maz.a(wezVar, new urn((byte) 1))};
    }

    public /* synthetic */ zrn(int i, Double d, Double d2, Integer num, List list, List list2) {
        if ((i & 1) == 0) {
            this.f44863a = null;
        } else {
            this.f44863a = d;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = d2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zrn)) {
            return false;
        }
        zrn zrnVar = (zrn) obj;
        return Intrinsics.d(this.f44863a, zrnVar.f44863a) && Intrinsics.d(this.b, zrnVar.b) && Intrinsics.d(this.c, zrnVar.c) && Intrinsics.d(this.d, zrnVar.d) && Intrinsics.d(this.e, zrnVar.e);
    }

    public final int hashCode() {
        Double d = this.f44863a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.b;
        int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.e;
        return iHashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ElevateInfoResponse(param=");
        sb.append(this.f44863a);
        sb.append(", sum=");
        sb.append(this.b);
        sb.append(", type=");
        cs0.z(sb, this.c, ", params=", this.d, ", playerNames=");
        return dw9.r(sb, this.e, Separators.RPAREN);
    }
}
