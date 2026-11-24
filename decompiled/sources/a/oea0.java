package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class oea0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25114a;
    public final c280 b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public oea0(String str, c280 c280Var, String str2, boolean z, boolean z2, boolean z3) {
        str.getClass();
        str2.getClass();
        this.f25114a = str;
        this.b = c280Var;
        this.c = str2;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oea0)) {
            return false;
        }
        oea0 oea0Var = (oea0) obj;
        return Intrinsics.d(this.f25114a, oea0Var.f25114a) && this.b.equals(oea0Var.b) && Intrinsics.d(this.c, oea0Var.c) && this.d == oea0Var.d && this.e == oea0Var.e && this.f == oea0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + brm0.e(brm0.e(ua80.b(hne.g(this.b, this.f25114a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbP = f140.p(this.b, "PlayerUiModel(playerId=", this.f25114a, ", playerIcon=", ", playerName=");
        brm0.C(this.c, ", isCaptain=", ", isSelected=", sbP, this.d);
        return ohs0.p(", isDisabled=", Separators.RPAREN, sbP, this.e, this.f);
    }
}
