package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class swp0 extends h46 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32933a;
    public final String b;
    public final boolean c;

    /* JADX WARN: Illegal instructions before constructor call */
    public swp0(ywp0 ywp0Var, boolean z) {
        String str;
        if (ywp0Var == null || (str = ywp0Var.f43382a) == null) {
            jf4.k(null);
            throw null;
        }
        String str2 = ywp0Var.b;
        if (str2 != null) {
            this(str, str2, z);
        } else {
            jf4.k(null);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof swp0)) {
            return false;
        }
        swp0 swp0Var = (swp0) obj;
        return Intrinsics.d(this.f32933a, swp0Var.f32933a) && Intrinsics.d(this.b, swp0Var.b) && this.c == swp0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(this.f32933a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(b1j.n("TemporaryToken(guid=", this.f32933a, ", token=", this.b, ", authenticatorEnabled="), this.c, Separators.RPAREN);
    }

    public swp0(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.f32933a = str;
        this.b = str2;
        this.c = z;
    }
}
