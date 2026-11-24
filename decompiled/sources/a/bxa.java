package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class bxa implements dxa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cza f3366a;
    public final n0x b;
    public final n0x c;
    public final String d;
    public final boolean e;
    public final String f;
    public final boolean g;

    public bxa(cza czaVar, n0x n0xVar, n0x n0xVar2, String str, boolean z, String str2, boolean z2) {
        czaVar.getClass();
        str.getClass();
        str2.getClass();
        this.f3366a = czaVar;
        this.b = n0xVar;
        this.c = n0xVar2;
        this.d = str;
        this.e = z;
        this.f = str2;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bxa)) {
            return false;
        }
        bxa bxaVar = (bxa) obj;
        return this.f3366a == bxaVar.f3366a && this.b.equals(bxaVar.b) && this.c.equals(bxaVar.c) && Intrinsics.d(this.d, bxaVar.d) && this.e == bxaVar.e && Intrinsics.d(this.f, bxaVar.f) && this.g == bxaVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + ua80.b(brm0.e(ua80.b(f140.f(this.c, f140.f(this.b, this.f3366a.hashCode() * 31, 31), 31), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Game(slot=");
        sb.append(this.f3366a);
        sb.append(", image=");
        sb.append(this.b);
        sb.append(", fallbackImage=");
        sb.append(this.c);
        sb.append(", percentBadge=");
        sb.append(this.d);
        sb.append(", isUpperCashBack=");
        f140.s(", title=", this.f, ", underMaintenance=", sb, this.e);
        return rw2.p(sb, this.g, Separators.RPAREN);
    }
}
