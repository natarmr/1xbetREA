package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f4f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g4f f8911a;
    public final String b;

    public f4f(g4f g4fVar, String str) {
        g4fVar.getClass();
        this.f8911a = g4fVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f4f)) {
            return false;
        }
        f4f f4fVar = (f4f) obj;
        return Intrinsics.d(this.f8911a, f4fVar.f8911a) && this.b.equals(f4fVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8911a.hashCode() * 31);
    }

    public final String toString() {
        return "CouponTipModel(screen=" + this.f8911a + ", imagePath=" + this.b + Separators.RPAREN;
    }
}
