package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a8q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j83 f440a;
    public final long b;
    public final o9q0 c;

    public a8q0(j83 j83Var, long j, o9q0 o9q0Var) {
        o9q0 o9q0Var2;
        this.f440a = j83Var;
        this.b = s7n0.k(j83Var.b.length(), j);
        if (o9q0Var != null) {
            o9q0Var2 = new o9q0(s7n0.k(j83Var.b.length(), o9q0Var.f24893a));
        } else {
            o9q0Var2 = null;
        }
        this.c = o9q0Var2;
    }

    public static a8q0 a(a8q0 a8q0Var, j83 j83Var, long j, int i) {
        if ((i & 1) != 0) {
            j83Var = a8q0Var.f440a;
        }
        if ((i & 2) != 0) {
            j = a8q0Var.b;
        }
        o9q0 o9q0Var = (i & 4) != 0 ? a8q0Var.c : null;
        a8q0Var.getClass();
        return new a8q0(j83Var, j, o9q0Var);
    }

    public static a8q0 b(a8q0 a8q0Var, String str, long j, int i) {
        if ((i & 2) != 0) {
            j = a8q0Var.b;
        }
        o9q0 o9q0Var = a8q0Var.c;
        a8q0Var.getClass();
        return new a8q0(new j83(str), j, o9q0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a8q0)) {
            return false;
        }
        a8q0 a8q0Var = (a8q0) obj;
        return o9q0.b(this.b, a8q0Var.b) && Intrinsics.d(this.c, a8q0Var.c) && Intrinsics.d(this.f440a, a8q0Var.f440a);
    }

    public final int hashCode() {
        int iHashCode = this.f440a.hashCode() * 31;
        int i = o9q0.c;
        int iB = rw2.b(iHashCode, 31, this.b);
        o9q0 o9q0Var = this.c;
        return iB + (o9q0Var != null ? Long.hashCode(o9q0Var.f24893a) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.f440a) + "', selection=" + o9q0.h(this.b) + ", composition=" + this.c + Separators.RPAREN;
    }

    public a8q0(String str, long j, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? o9q0.b : j, (o9q0) null);
    }

    public a8q0(String str, long j, o9q0 o9q0Var) {
        this(new j83(str), j, o9q0Var);
    }
}
