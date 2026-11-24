package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class fl30 {
    public static final el30 Companion = new el30();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9721a;
    public final Integer b;
    public final Integer c;
    public final Integer d;

    public /* synthetic */ fl30(int i, Integer num, Integer num2, Integer num3, String str) {
        if ((i & 1) == 0) {
            this.f9721a = null;
        } else {
            this.f9721a = str;
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
        if (!(obj instanceof fl30)) {
            return false;
        }
        fl30 fl30Var = (fl30) obj;
        return Intrinsics.d(this.f9721a, fl30Var.f9721a) && Intrinsics.d(this.b, fl30Var.b) && Intrinsics.d(this.c, fl30Var.c) && Intrinsics.d(this.d, fl30Var.d);
    }

    public final int hashCode() {
        String str = this.f9721a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return ua80.l(axq.p(this.b, "MedalsResponse(competition=", this.f9721a, ", gold=", ", silver="), this.c, ", bronze=", this.d, Separators.RPAREN);
    }
}
