package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class z13 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public yjj0 f43599a;
    public long b;
    public k6z c;
    public float d;
    public kjj0 e;

    public z13(yjj0 yjj0Var, long j, k6z k6zVar, float f, kjj0 kjj0Var) {
        this.f43599a = yjj0Var;
        this.b = j;
        this.c = k6zVar;
        this.d = f;
        this.e = kjj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z13)) {
            return false;
        }
        z13 z13Var = (z13) obj;
        return Intrinsics.d(this.f43599a, z13Var.f43599a) && h7k0.b(this.b, z13Var.b) && this.c == z13Var.c && Float.compare(this.d, z13Var.d) == 0 && Intrinsics.d(this.e, z13Var.e);
    }

    public final int hashCode() {
        int iA = defpackage.c.a((this.c.hashCode() + rw2.b(this.f43599a.hashCode() * 31, 31, this.b)) * 31, this.d, 31);
        kjj0 kjj0Var = this.e;
        return iA + (kjj0Var == null ? 0 : kjj0Var.hashCode());
    }

    public final String toString() {
        return "ShadowKey(shape=" + this.f43599a + ", size=" + h7k0.g(this.b) + ", layoutDirection=" + this.c + ", density=" + this.d + ", shadow=" + this.e + Separators.RPAREN;
    }
}
