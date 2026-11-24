package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class qig0 {
    public static final pig0 Companion = new pig0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tjg0 f28791a;
    public final tjg0 b;
    public final tjg0 c;
    public final Integer d;

    public /* synthetic */ qig0(int i, tjg0 tjg0Var, tjg0 tjg0Var2, tjg0 tjg0Var3, Integer num) {
        if ((i & 1) == 0) {
            this.f28791a = null;
        } else {
            this.f28791a = tjg0Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = tjg0Var2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = tjg0Var3;
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
        if (!(obj instanceof qig0)) {
            return false;
        }
        qig0 qig0Var = (qig0) obj;
        return Intrinsics.d(this.f28791a, qig0Var.f28791a) && Intrinsics.d(this.b, qig0Var.b) && Intrinsics.d(this.c, qig0Var.c) && Intrinsics.d(this.d, qig0Var.d);
    }

    public final int hashCode() {
        tjg0 tjg0Var = this.f28791a;
        int iHashCode = (tjg0Var == null ? 0 : tjg0Var.hashCode()) * 31;
        tjg0 tjg0Var2 = this.b;
        int iHashCode2 = (iHashCode + (tjg0Var2 == null ? 0 : tjg0Var2.hashCode())) * 31;
        tjg0 tjg0Var3 = this.c;
        int iHashCode3 = (iHashCode2 + (tjg0Var3 == null ? 0 : tjg0Var3.hashCode())) * 31;
        Integer num = this.d;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "RpsGameInformationResponse(firstPlayer=" + this.f28791a + ", secondPlayer=" + this.b + ", thirdPlayer=" + this.c + ", result=" + this.d + Separators.RPAREN;
    }
}
