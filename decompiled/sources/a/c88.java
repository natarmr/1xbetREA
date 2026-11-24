package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class c88 {
    public static final b88 Companion = new b88();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3901a;
    public final String b;
    public final Boolean c;
    public final String d;

    public /* synthetic */ c88(int i, String str, String str2, Boolean bool, String str3) {
        if ((i & 1) == 0) {
            this.f3901a = null;
        } else {
            this.f3901a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bool;
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
        if (!(obj instanceof c88)) {
            return false;
        }
        c88 c88Var = (c88) obj;
        return Intrinsics.d(this.f3901a, c88Var.f3901a) && Intrinsics.d(this.b, c88Var.b) && Intrinsics.d(this.c, c88Var.c) && Intrinsics.d(this.d, c88Var.d);
    }

    public final int hashCode() {
        String str = this.f3901a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("BlockFullRuleResponse(content=", this.f3901a, ", subContent=", this.b, ", isShowGame=");
        sbN.append(this.c);
        sbN.append(", title=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
