package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class z5a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w6k f43806a;
    public k6z b;
    public x5a c;
    public long d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z5a)) {
            return false;
        }
        z5a z5aVar = (z5a) obj;
        return Intrinsics.d(this.f43806a, z5aVar.f43806a) && this.b == z5aVar.b && Intrinsics.d(this.c, z5aVar.c) && h7k0.b(this.d, z5aVar.d);
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.f43806a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DrawParams(density=" + this.f43806a + ", layoutDirection=" + this.b + ", canvas=" + this.c + ", size=" + h7k0.g(this.d) + Separators.RPAREN;
    }
}
