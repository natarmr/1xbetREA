package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class rz50 implements tz50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nz50 f31342a;
    public final nz50 b;
    public final nz50 c;
    public final nz50 d;
    public final nz50 e;
    public final nz50 f;
    public final nz50 g;
    public final nz50 h;

    public rz50(nz50 nz50Var, nz50 nz50Var2, nz50 nz50Var3, nz50 nz50Var4, nz50 nz50Var5, nz50 nz50Var6, nz50 nz50Var7, nz50 nz50Var8) {
        nz50Var.getClass();
        nz50Var2.getClass();
        nz50Var3.getClass();
        nz50Var4.getClass();
        nz50Var5.getClass();
        nz50Var6.getClass();
        nz50Var7.getClass();
        this.f31342a = nz50Var;
        this.b = nz50Var2;
        this.c = nz50Var3;
        this.d = nz50Var4;
        this.e = nz50Var5;
        this.f = nz50Var6;
        this.g = nz50Var7;
        this.h = nz50Var8;
    }

    public static rz50 a(rz50 rz50Var, kz50 kz50Var, nz50 nz50Var, int i) {
        nz50 nz50Var2 = rz50Var.f31342a;
        nz50 nz50Var3 = rz50Var.b;
        nz50 nz50Var4 = rz50Var.c;
        nz50 nz50Var5 = rz50Var.d;
        nz50 nz50Var6 = rz50Var.e;
        nz50 nz50Var7 = kz50Var;
        if ((i & 32) != 0) {
            nz50Var7 = rz50Var.f;
        }
        nz50 nz50Var8 = nz50Var7;
        nz50 nz50Var9 = rz50Var.g;
        if ((i & 128) != 0) {
            nz50Var = rz50Var.h;
        }
        rz50Var.getClass();
        nz50Var2.getClass();
        nz50Var3.getClass();
        nz50Var4.getClass();
        nz50Var5.getClass();
        nz50Var6.getClass();
        nz50Var8.getClass();
        nz50Var9.getClass();
        return new rz50(nz50Var2, nz50Var3, nz50Var4, nz50Var5, nz50Var6, nz50Var8, nz50Var9, nz50Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rz50)) {
            return false;
        }
        rz50 rz50Var = (rz50) obj;
        return Intrinsics.d(this.f31342a, rz50Var.f31342a) && Intrinsics.d(this.b, rz50Var.b) && Intrinsics.d(this.c, rz50Var.c) && Intrinsics.d(this.d, rz50Var.d) && Intrinsics.d(this.e, rz50Var.e) && Intrinsics.d(this.f, rz50Var.f) && Intrinsics.d(this.g, rz50Var.g) && this.h.equals(rz50Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f31342a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Favorites(events=" + this.f31342a + ", trackedCoefs=" + this.b + ", teams=" + this.c + ", champs=" + this.d + ", oneXGames=" + this.e + ", aggregatorGames=" + this.f + ", viewedGames=" + this.g + ", recommendedGames=" + this.h + Separators.RPAREN;
    }
}
