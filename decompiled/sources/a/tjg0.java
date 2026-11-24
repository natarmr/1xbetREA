package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class tjg0 {
    public static final sjg0 Companion = new sjg0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f34047a;
    public final String b;
    public final Integer c;
    public final Boolean d;

    public /* synthetic */ tjg0(int i, Boolean bool, Integer num, Integer num2, String str) {
        if ((i & 1) == 0) {
            this.f34047a = null;
        } else {
            this.f34047a = num;
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
            this.d = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tjg0)) {
            return false;
        }
        tjg0 tjg0Var = (tjg0) obj;
        return Intrinsics.d(this.f34047a, tjg0Var.f34047a) && Intrinsics.d(this.b, tjg0Var.b) && Intrinsics.d(this.c, tjg0Var.c) && Intrinsics.d(this.d, tjg0Var.d);
    }

    public final int hashCode() {
        Integer num = this.f34047a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.d;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = h97.n(this.f34047a, "RpsPlayerInformationResponse(id=", ", name=", this.b, ", score=");
        sbN.append(this.c);
        sbN.append(", win=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
