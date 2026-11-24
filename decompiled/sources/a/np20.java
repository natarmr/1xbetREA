package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class np20 {
    public static final mp20 Companion = new mp20();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23892a;
    public final Integer b;
    public final Integer c;
    public final Integer d;

    public /* synthetic */ np20(int i, Integer num, Integer num2, Integer num3, String str) {
        if ((i & 1) == 0) {
            this.f23892a = null;
        } else {
            this.f23892a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
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
        if (!(obj instanceof np20)) {
            return false;
        }
        np20 np20Var = (np20) obj;
        return Intrinsics.d(this.f23892a, np20Var.f23892a) && Intrinsics.d(this.b, np20Var.b) && Intrinsics.d(this.c, np20Var.c) && Intrinsics.d(this.d, np20Var.d);
    }

    public final int hashCode() {
        String str = this.f23892a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return ua80.l(axq.p(this.b, "MapStatisticResponse(name=", this.f23892a, ", ctWinRate=", ", tWinRate="), this.c, ", count=", this.d, Separators.RPAREN);
    }
}
