package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class tf10 implements vf10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33846a;
    public final String b;
    public final o0x c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final int h;

    public tf10(String str, String str2, o0x o0xVar, String str3, String str4, String str5, int i, int i2) {
        brm0.B(str, str2, str4);
        this.f33846a = str;
        this.b = str2;
        this.c = o0xVar;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = i;
        this.h = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tf10)) {
            return false;
        }
        tf10 tf10Var = (tf10) obj;
        return Intrinsics.d(this.f33846a, tf10Var.f33846a) && Intrinsics.d(this.b, tf10Var.b) && this.c.equals(tf10Var.c) && this.d.equals(tf10Var.d) && Intrinsics.d(this.e, tf10Var.e) && this.f.equals(tf10Var.f) && this.g == tf10Var.g && this.h == tf10Var.h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h) + twn.a(this.g, ua80.b(ua80.b(ua80.b(w6x.d(this.c, ua80.b(this.f33846a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Content(name=", this.f33846a, ", description=", this.b, ", image=");
        sbN.append(this.c);
        sbN.append(", cashback=");
        sbN.append(this.d);
        sbN.append(", experienceLabel=");
        f140.v(sbN, this.e, ", maxExperienceLabel=", this.f, ", experience=");
        return w6x.o(this.g, this.h, ", maxExperience=", Separators.RPAREN, sbN);
    }
}
