package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class u130 implements y130 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34884a;
    public final String b;
    public final String c;
    public final String d;

    public u130(String str, String str2, String str3, String str4) {
        brm0.B(str, str3, str4);
        this.f34884a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u130)) {
            return false;
        }
        u130 u130Var = (u130) obj;
        return Intrinsics.d(this.f34884a, u130Var.f34884a) && this.b.equals(u130Var.b) && Intrinsics.d(this.c, u130Var.c) && Intrinsics.d(this.d, u130Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(this.f34884a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ua80.m(b1j.n("ShowQuickBetNotEnoughMoneyError(title=", this.f34884a, ", message=", this.b, ", textForFirstButton="), this.c, ", textForSecondButton=", this.d, Separators.RPAREN);
    }
}
