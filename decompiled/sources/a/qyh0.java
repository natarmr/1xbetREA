package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class qyh0 {
    public static final pyh0 Companion = new pyh0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f29534a;
    public final String b;
    public final Integer c;
    public final Integer d;

    public /* synthetic */ qyh0(int i, Integer num, Integer num2, Integer num3, String str) {
        if ((i & 1) == 0) {
            this.f29534a = null;
        } else {
            this.f29534a = num;
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
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qyh0)) {
            return false;
        }
        qyh0 qyh0Var = (qyh0) obj;
        return Intrinsics.d(this.f29534a, qyh0Var.f29534a) && Intrinsics.d(this.b, qyh0Var.b) && Intrinsics.d(this.c, qyh0Var.c) && Intrinsics.d(this.d, qyh0Var.d);
    }

    public final int hashCode() {
        Integer num = this.f29534a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return ua80.l(h97.n(this.f29534a, "SekiroRoundResponse(round=", ", winnerName=", this.b, ", firstScore="), this.c, ", secondScore=", this.d, Separators.RPAREN);
    }
}
