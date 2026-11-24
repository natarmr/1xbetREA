package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class tu4 implements uu4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34533a;
    public final String b;
    public final String c;
    public final String d;

    public tu4(String str, String str2, String str3, String str4) {
        cs0.x(str, str2, str3, str4);
        this.f34533a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tu4)) {
            return false;
        }
        tu4 tu4Var = (tu4) obj;
        return Intrinsics.d(this.f34533a, tu4Var.f34533a) && Intrinsics.d(this.b, tu4Var.b) && Intrinsics.d(this.c, tu4Var.c) && Intrinsics.d(this.d, tu4Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(this.f34533a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ua80.m(b1j.n("User(login=", this.f34533a, ", password=", this.b, ", phoneCode="), this.c, ", phoneBody=", this.d, Separators.RPAREN);
    }
}
