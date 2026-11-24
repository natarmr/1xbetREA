package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class s0 extends cne {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return Intrinsics.d(this.f4649a, s0Var.f4649a) && Intrinsics.d(this.b, s0Var.b) && Intrinsics.d(this.c, s0Var.c) && Intrinsics.d(this.d, s0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f4649a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AbsoluteRoundedCornerShape(topLeft = " + this.f4649a + ", topRight = " + this.b + ", bottomRight = " + this.c + ", bottomLeft = " + this.d + Separators.RPAREN;
    }
}
