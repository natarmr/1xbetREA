package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class eq8 implements hq8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8224a;
    public final String b;
    public final String c;
    public final String d;

    public eq8(String str, String str2, String str3, String str4) {
        cs0.x(str, str2, str3, str4);
        this.f8224a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eq8)) {
            return false;
        }
        eq8 eq8Var = (eq8) obj;
        return Intrinsics.d(this.f8224a, eq8Var.f8224a) && Intrinsics.d(this.b, eq8Var.b) && Intrinsics.d(this.c, eq8Var.c) && Intrinsics.d(this.d, eq8Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(this.f8224a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ua80.m(b1j.n("CloseAllSessions(title=", this.f8224a, ", subtitle=", this.b, ", cancelButtonTitle="), this.c, ", confirmButtonTitle=", this.d, Separators.RPAREN);
    }
}
