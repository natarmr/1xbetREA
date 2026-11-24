package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class rue0 implements Serializable {
    public static final que0 Companion = new que0();
    public static final a8z[] i = {null, null, null, maz.a(wez.f39042a, new o6e0(24)), null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31124a;
    public final String b;
    public final boolean c;
    public final uue0 d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final boolean h;

    public /* synthetic */ rue0(int i2, long j, String str, boolean z, uue0 uue0Var, boolean z2, boolean z3, String str2, boolean z4) {
        this.f31124a = (i2 & 1) == 0 ? 0L : j;
        if ((i2 & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i2 & 4) == 0) {
            this.c = false;
        } else {
            this.c = z;
        }
        if ((i2 & 8) == 0) {
            this.d = uue0.d;
        } else {
            this.d = uue0Var;
        }
        if ((i2 & 16) == 0) {
            this.e = false;
        } else {
            this.e = z2;
        }
        if ((i2 & 32) == 0) {
            this.f = false;
        } else {
            this.f = z3;
        }
        if ((i2 & 64) == 0) {
            this.g = "";
        } else {
            this.g = str2;
        }
        if ((i2 & 128) == 0) {
            this.h = true;
        } else {
            this.h = z4;
        }
    }

    public static rue0 a(rue0 rue0Var) {
        long j = rue0Var.f31124a;
        String str = rue0Var.b;
        boolean z = rue0Var.c;
        uue0 uue0Var = rue0Var.d;
        boolean z2 = rue0Var.f;
        String str2 = rue0Var.g;
        boolean z3 = rue0Var.h;
        str.getClass();
        uue0Var.getClass();
        str2.getClass();
        return new rue0(j, str, z, uue0Var, true, z2, str2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rue0)) {
            return false;
        }
        rue0 rue0Var = (rue0) obj;
        return this.f31124a == rue0Var.f31124a && Intrinsics.d(this.b, rue0Var.b) && this.c == rue0Var.c && this.d == rue0Var.d && this.e == rue0Var.e && this.f == rue0Var.f && Intrinsics.d(this.g, rue0Var.g) && this.h == rue0Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + ua80.b(brm0.e(brm0.e((this.d.hashCode() + brm0.e(ua80.b(Long.hashCode(this.f31124a) * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f31124a, "RegistrationChoice(id=", ", text=", this.b);
        sbO.append(", isChoice=");
        sbO.append(this.c);
        sbO.append(", type=");
        sbO.append(this.d);
        w6x.A(", top=", ", title=", sbO, this.e, this.f);
        w6x.z(", image=", this.g, ", available=", sbO, this.h);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }

    public rue0(long j, String str, boolean z, uue0 uue0Var, boolean z2, boolean z3, String str2, boolean z4) {
        str.getClass();
        uue0Var.getClass();
        this.f31124a = j;
        this.b = str;
        this.c = z;
        this.d = uue0Var;
        this.e = z2;
        this.f = z3;
        this.g = str2;
        this.h = z4;
    }

    public /* synthetic */ rue0(long j, String str, boolean z, uue0 uue0Var, boolean z2, int i2) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? uue0.d : uue0Var, (i2 & 16) != 0 ? false : z2, (i2 & 32) == 0, "", true);
    }
}
