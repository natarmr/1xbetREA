package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class jpf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f16898a;
    public final boolean b;
    public final String c;
    public final String d;

    public jpf0(String str, String str2, boolean z, boolean z2) {
        str2.getClass();
        this.f16898a = z;
        this.b = z2;
        this.c = str;
        this.d = str2;
    }

    public static jpf0 a(jpf0 jpf0Var, boolean z, int i) {
        boolean z2 = (i & 1) != 0 ? jpf0Var.f16898a : false;
        String str = jpf0Var.c;
        String str2 = jpf0Var.d;
        jpf0Var.getClass();
        str2.getClass();
        return new jpf0(str, str2, z2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jpf0)) {
            return false;
        }
        jpf0 jpf0Var = (jpf0) obj;
        return this.f16898a == jpf0Var.f16898a && this.b == jpf0Var.b && this.c.equals(jpf0Var.c) && Intrinsics.d(this.d, jpf0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(brm0.e(Boolean.hashCode(this.f16898a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ua80.m(f140.q("SecondLifeState(show=", ", bindToGame=", ", price=", this.f16898a, this.b), this.c, ", currency=", this.d, Separators.RPAREN);
    }
}
