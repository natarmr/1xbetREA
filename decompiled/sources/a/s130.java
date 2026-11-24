package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s130 implements y130 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31436a;
    public final String b;
    public final String c;
    public final String d;

    public s130(String str, String str2, String str3, String str4) {
        brm0.B(str, str3, str4);
        this.f31436a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s130)) {
            return false;
        }
        s130 s130Var = (s130) obj;
        return Intrinsics.d(this.f31436a, s130Var.f31436a) && this.b.equals(s130Var.b) && Intrinsics.d(this.c, s130Var.c) && Intrinsics.d(this.d, s130Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(this.f31436a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ua80.m(b1j.n("ShowQuickBetExistError(title=", this.f31436a, ", message=", this.b, ", textForFirstButton="), this.c, ", textForSecondButton=", this.d, Separators.RPAREN);
    }
}
