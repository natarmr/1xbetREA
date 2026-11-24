package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class cfb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4252a;
    public final String b;
    public final boolean c;

    public cfb0(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.f4252a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfb0)) {
            return false;
        }
        cfb0 cfb0Var = (cfb0) obj;
        return Intrinsics.d(this.f4252a, cfb0Var.f4252a) && Intrinsics.d(this.b, cfb0Var.b) && this.c == cfb0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(this.f4252a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(b1j.n("PopularOneXGamesLuckyWheelStateModel(name=", this.f4252a, ", description=", this.b, ", underMaintenance="), this.c, Separators.RPAREN);
    }
}
