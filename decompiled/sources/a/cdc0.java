package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class cdc0 {
    public static final bdc0 Companion = new bdc0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4156a;
    public final Integer b;
    public final String c;
    public final String d;

    public /* synthetic */ cdc0(int i, Integer num, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f4156a = null;
        } else {
            this.f4156a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdc0)) {
            return false;
        }
        cdc0 cdc0Var = (cdc0) obj;
        return Intrinsics.d(this.f4156a, cdc0Var.f4156a) && Intrinsics.d(this.b, cdc0Var.b) && Intrinsics.d(this.c, cdc0Var.c) && Intrinsics.d(this.d, cdc0Var.d);
    }

    public final int hashCode() {
        String str = this.f4156a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return ua80.m(axq.p(this.b, "PromoCodeConditionsResponse(stateKey=", this.f4156a, ", stateKeyType=", ", stateName="), this.c, ", stateValue=", this.d, Separators.RPAREN);
    }
}
