package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class jdp0 implements rdp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16340a;
    public final i5a0 b;
    public final vy c;

    public jdp0(String str, i5a0 i5a0Var, vy vyVar) {
        str.getClass();
        this.f16340a = str;
        this.b = i5a0Var;
        this.c = vyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jdp0)) {
            return false;
        }
        jdp0 jdp0Var = (jdp0) obj;
        return Intrinsics.d(this.f16340a, jdp0Var.f16340a) && this.b.equals(jdp0Var.b) && Intrinsics.d(this.c, jdp0Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f16340a.hashCode() * 31)) * 31;
        vy vyVar = this.c;
        return iHashCode + (vyVar == null ? 0 : vyVar.hashCode());
    }

    public final String toString() {
        return "Default(name=" + this.f16340a + ", playerLogo=" + this.b + ", additionalInfo=" + this.c + Separators.RPAREN;
    }
}
