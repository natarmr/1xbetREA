package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class gza implements iza {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12172a;
    public final o0x b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public gza(String str, o0x o0xVar, boolean z, String str2, String str3, String str4, String str5, String str6) {
        ohs0.z(str, str2, str3, str4, str5);
        str6.getClass();
        this.f12172a = str;
        this.b = o0xVar;
        this.c = z;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gza)) {
            return false;
        }
        gza gzaVar = (gza) obj;
        return Intrinsics.d(this.f12172a, gzaVar.f12172a) && this.b.equals(gzaVar.b) && this.c == gzaVar.c && Intrinsics.d(this.d, gzaVar.d) && Intrinsics.d(this.e, gzaVar.e) && Intrinsics.d(this.f, gzaVar.f) && Intrinsics.d(this.g, gzaVar.g) && Intrinsics.d(this.h, gzaVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(brm0.e(w6x.d(this.b, this.f12172a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(name=");
        sb.append(this.f12172a);
        sb.append(", image=");
        sb.append(this.b);
        sb.append(", isActive=");
        f140.s(", cashback=", this.d, ", experienceTitle=", sb, this.c);
        f140.v(sb, this.e, ", experienceValue=", this.f, ", coefficientTitle=");
        return ua80.m(sb, this.g, ", coefficientValue=", this.h, Separators.RPAREN);
    }
}
