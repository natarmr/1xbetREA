package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s7a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f31741a;
    public final boolean b;
    public final List c;

    public s7a0(List list, boolean z, boolean z2) {
        list.getClass();
        this.f31741a = z;
        this.b = z2;
        this.c = list;
    }

    public static s7a0 a(s7a0 s7a0Var, boolean z, boolean z2) {
        List list = s7a0Var.c;
        list.getClass();
        return new s7a0(list, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s7a0)) {
            return false;
        }
        s7a0 s7a0Var = (s7a0) obj;
        return this.f31741a == s7a0Var.f31741a && this.b == s7a0Var.b && Intrinsics.d(this.c, s7a0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(Boolean.hashCode(this.f31741a) * 31, 31, this.b);
    }

    public final String toString() {
        return dw9.r(f140.q("PlayerMedalsStatisticState(isLoading=", ", isError=", ", playerMedals=", this.f31741a, this.b), this.c, Separators.RPAREN);
    }
}
