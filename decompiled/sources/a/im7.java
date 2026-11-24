package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class im7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15012a;
    public final boolean b;
    public final boolean c;
    public final en7 d;

    public im7(String str, boolean z, boolean z2, en7 en7Var) {
        this.f15012a = str;
        this.b = z;
        this.c = z2;
        this.d = en7Var;
    }

    public static im7 a(im7 im7Var, String str, boolean z, boolean z2, en7 en7Var, int i) {
        if ((i & 1) != 0) {
            str = im7Var.f15012a;
        }
        if ((i & 2) != 0) {
            z = im7Var.b;
        }
        if ((i & 4) != 0) {
            z2 = im7Var.c;
        }
        if ((i & 8) != 0) {
            en7Var = im7Var.d;
        }
        im7Var.getClass();
        return new im7(str, z, z2, en7Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof im7)) {
            return false;
        }
        im7 im7Var = (im7) obj;
        return this.f15012a.equals(im7Var.f15012a) && this.b == im7Var.b && this.c == im7Var.c && Intrinsics.d(this.d, im7Var.d);
    }

    public final int hashCode() {
        int iE = brm0.e(brm0.e(this.f15012a.hashCode() * 31, 31, this.b), 31, this.c);
        en7 en7Var = this.d;
        return iE + (en7Var == null ? 0 : en7Var.hashCode());
    }

    public final String toString() {
        StringBuilder sbU = brm0.u("BetSettingsStateModel(betChangeSettingsDescription=", this.f15012a, ", betSystemIsVisible=", this.b, ", betSystemIsLoading=");
        sbU.append(this.c);
        sbU.append(", betSystemModel=");
        sbU.append(this.d);
        sbU.append(Separators.RPAREN);
        return sbU.toString();
    }
}
