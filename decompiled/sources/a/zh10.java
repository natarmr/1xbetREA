package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zh10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44370a;
    public final yh10 b;

    public zh10(String str, yh10 yh10Var) {
        str.getClass();
        yh10Var.getClass();
        this.f44370a = str;
        this.b = yh10Var;
    }

    public static zh10 a(zh10 zh10Var, yh10 yh10Var) {
        String str = zh10Var.f44370a;
        zh10Var.getClass();
        str.getClass();
        return new zh10(str, yh10Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zh10)) {
            return false;
        }
        zh10 zh10Var = (zh10) obj;
        return Intrinsics.d(this.f44370a, zh10Var.f44370a) && Intrinsics.d(this.b, zh10Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f44370a.hashCode() * 31);
    }

    public final String toString() {
        return "LoyaltyProgramFullInfoWithUserModel(userName=" + this.f44370a + ", loyaltyProgramModel=" + this.b + Separators.RPAREN;
    }
}
