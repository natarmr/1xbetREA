package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class o4q0 {
    public static final n4q0 Companion = new n4q0();
    public static final a8z[] f = {null, null, null, null, maz.a(wez.f39042a, new ozp0(6))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24653a;
    public final String b;
    public final Integer c;
    public final Integer d;
    public final List e;

    public /* synthetic */ o4q0(int i, String str, String str2, Integer num, Integer num2, List list) {
        if ((i & 1) == 0) {
            this.f24653a = null;
        } else {
            this.f24653a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o4q0)) {
            return false;
        }
        o4q0 o4q0Var = (o4q0) obj;
        return Intrinsics.d(this.f24653a, o4q0Var.f24653a) && Intrinsics.d(this.b, o4q0Var.b) && Intrinsics.d(this.c, o4q0Var.c) && Intrinsics.d(this.d, o4q0Var.d) && Intrinsics.d(this.e, o4q0Var.e);
    }

    public final int hashCode() {
        String str = this.f24653a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List list = this.e;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("TextContent(type=", this.f24653a, ", text=", this.b, ", offset=");
        rz4.y(sbN, this.c, ", length=", this.d, ", attrs=");
        return dw9.r(sbN, this.e, Separators.RPAREN);
    }
}
