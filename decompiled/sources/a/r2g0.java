package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class r2g0 {
    public static final q2g0 Companion = new q2g0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29733a;
    public final Boolean b;
    public final Integer c;
    public final Integer d;

    public /* synthetic */ r2g0(int i, Boolean bool, Integer num, Integer num2, String str) {
        if ((i & 1) == 0) {
            this.f29733a = null;
        } else {
            this.f29733a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool;
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2g0)) {
            return false;
        }
        r2g0 r2g0Var = (r2g0) obj;
        return Intrinsics.d(this.f29733a, r2g0Var.f29733a) && Intrinsics.d(this.b, r2g0Var.b) && Intrinsics.d(this.c, r2g0Var.c) && Intrinsics.d(this.d, r2g0Var.d);
    }

    public final int hashCode() {
        String str = this.f29733a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResultItemResponse(gamerId=");
        sb.append(this.f29733a);
        sb.append(", isMe=");
        sb.append(this.b);
        sb.append(", place=");
        return ua80.l(sb, this.c, ", point=", this.d, Separators.RPAREN);
    }
}
