package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class qy90 {
    public static final py90 Companion = new py90();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29522a;
    public final String b;
    public final Boolean c;
    public final Integer d;

    public /* synthetic */ qy90(int i, Boolean bool, Integer num, String str, String str2) {
        if ((i & 1) == 0) {
            this.f29522a = null;
        } else {
            this.f29522a = str;
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
            this.d = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qy90)) {
            return false;
        }
        qy90 qy90Var = (qy90) obj;
        return Intrinsics.d(this.f29522a, qy90Var.f29522a) && Intrinsics.d(this.b, qy90Var.b) && Intrinsics.d(this.c, qy90Var.c) && Intrinsics.d(this.d, qy90Var.d);
    }

    public final int hashCode() {
        String str = this.f29522a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.d;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("PlayerAbilitiesResponse(name=", this.f29522a, ", image=", this.b, ", isTalent=");
        sbN.append(this.c);
        sbN.append(", slot=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
