package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class vi00 {
    public static final ui00 Companion = new ui00();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f37454a;
    public final String b;
    public final Integer c;

    public /* synthetic */ vi00(int i, Integer num, Integer num2, String str) {
        if ((i & 1) == 0) {
            this.f37454a = null;
        } else {
            this.f37454a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vi00)) {
            return false;
        }
        vi00 vi00Var = (vi00) obj;
        return Intrinsics.d(this.f37454a, vi00Var.f37454a) && Intrinsics.d(this.b, vi00Var.b) && Intrinsics.d(this.c, vi00Var.c);
    }

    public final int hashCode() {
        Integer num = this.f37454a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.c;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return dw9.q(h97.n(this.f37454a, "LiveExpressTabResponseV2(id=", ", name=", this.b, ", gamesCount="), this.c, Separators.RPAREN);
    }
}
