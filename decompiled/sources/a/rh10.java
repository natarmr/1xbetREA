package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class rh10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f30466a;
    public final zh10 b;

    public rh10(boolean z, zh10 zh10Var) {
        zh10Var.getClass();
        this.f30466a = z;
        this.b = zh10Var;
    }

    public static rh10 a(rh10 rh10Var, boolean z, zh10 zh10Var, int i) {
        if ((i & 1) != 0) {
            z = rh10Var.f30466a;
        }
        if ((i & 2) != 0) {
            zh10Var = rh10Var.b;
        }
        rh10Var.getClass();
        zh10Var.getClass();
        return new rh10(z, zh10Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rh10)) {
            return false;
        }
        rh10 rh10Var = (rh10) obj;
        return this.f30466a == rh10Var.f30466a && Intrinsics.d(this.b, rh10Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f30466a) * 31);
    }

    public final String toString() {
        return "LoyaltyProgramCashbackBlockInfoModel(updating=" + this.f30466a + ", cashbackWithUser=" + this.b + Separators.RPAREN;
    }
}
