package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class sl30 extends xl30 {
    public static final rl30 Companion = new rl30();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32379a;
    public final String b;
    public final Integer c;
    public final Integer d;
    public final Long e;

    public sl30(int i, String str, String str2, Integer num, Integer num2, Long l) {
        if ((i & 1) == 0) {
            this.f32379a = null;
        } else {
            this.f32379a = str;
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
            this.e = l;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sl30)) {
            return false;
        }
        sl30 sl30Var = (sl30) obj;
        return Intrinsics.d(this.f32379a, sl30Var.f32379a) && Intrinsics.d(this.b, sl30Var.b) && Intrinsics.d(this.c, sl30Var.c) && Intrinsics.d(this.d, sl30Var.d) && Intrinsics.d(this.e, sl30Var.e);
    }

    public final int hashCode() {
        String str = this.f32379a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.e;
        return iHashCode4 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("ImageSize(type=", this.f32379a, ", sizeOption=", this.b, ", height=");
        rz4.y(sbN, this.c, ", width=", this.d, ", size=");
        return ohs0.r(sbN, this.e, Separators.RPAREN);
    }
}
