package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class bfb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2494a;
    public final String b;
    public final boolean c;

    public bfb0(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.f2494a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bfb0)) {
            return false;
        }
        bfb0 bfb0Var = (bfb0) obj;
        return Intrinsics.d(this.f2494a, bfb0Var.f2494a) && Intrinsics.d(this.b, bfb0Var.b) && this.c == bfb0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(this.f2494a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(b1j.n("PopularOneXGamesLuckyWheelModel(name=", this.f2494a, ", description=", this.b, ", underMaintenance="), this.c, Separators.RPAREN);
    }
}
