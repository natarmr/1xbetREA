package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class be6 extends ce6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2432a;
    public final boolean b;
    public final boolean c;
    public final String d;

    public be6(String str, String str2, boolean z, boolean z2) {
        str2.getClass();
        this.f2432a = str;
        this.b = z;
        this.c = z2;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof be6)) {
            return false;
        }
        be6 be6Var = (be6) obj;
        return this.f2432a.equals(be6Var.f2432a) && this.b == be6Var.b && this.c == be6Var.c && Intrinsics.d(this.d, be6Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.e(brm0.e(this.f2432a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return twn.q(", inputText=", this.d, Separators.RPAREN, brm0.u("ScreenState(title=", this.f2432a, ", prevButtonEnabled=", this.b, ", nextButtonEnabled="), this.c);
    }
}
