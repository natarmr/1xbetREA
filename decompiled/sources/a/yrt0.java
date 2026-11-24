package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class yrt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43138a;
    public final String b;
    public final String c;
    public final String d;

    public yrt0(String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        this.f43138a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yrt0)) {
            return false;
        }
        yrt0 yrt0Var = (yrt0) obj;
        return Intrinsics.d(this.f43138a, yrt0Var.f43138a) && Intrinsics.d(this.b, yrt0Var.b) && this.c.equals(yrt0Var.c) && this.d.equals(yrt0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(this.f43138a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ua80.m(b1j.n("UserPass(login=", this.f43138a, ", pass=", this.b, ", phoneCode="), this.c, ", phoneBody=", this.d, Separators.RPAREN);
    }
}
