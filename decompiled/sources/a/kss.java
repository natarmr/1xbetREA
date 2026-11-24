package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class kss {
    public static final iss Companion = new iss();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b7m0 f18831a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ kss(int i, b7m0 b7m0Var, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f18831a = null;
        } else {
            this.f18831a = b7m0Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
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
        if (!(obj instanceof kss)) {
            return false;
        }
        kss kssVar = (kss) obj;
        return this.f18831a == kssVar.f18831a && Intrinsics.d(this.b, kssVar.b) && Intrinsics.d(this.c, kssVar.c) && Intrinsics.d(this.d, kssVar.d);
    }

    public final int hashCode() {
        b7m0 b7m0Var = this.f18831a;
        int iHashCode = (b7m0Var == null ? 0 : b7m0Var.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GameStatisticResponse(type=");
        sb.append(this.f18831a);
        sb.append(", teamOneScore=");
        sb.append(this.b);
        sb.append(", teamTwoScore=");
        return ua80.m(sb, this.c, ", statName=", this.d, Separators.RPAREN);
    }
}
