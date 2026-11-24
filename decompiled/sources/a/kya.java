package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class kya {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f19097a;
    public final a4x b;
    public final bi90 c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final long i;
    public final Throwable j;

    public kya(a4x a4xVar, a4x a4xVar2, bi90 bi90Var, String str, boolean z, boolean z2, boolean z3, boolean z4, long j, Throwable th) {
        a4xVar.getClass();
        a4xVar2.getClass();
        bi90Var.getClass();
        this.f19097a = a4xVar;
        this.b = a4xVar2;
        this.c = bi90Var;
        this.d = str;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = j;
        this.j = th;
    }

    public static kya a(kya kyaVar, a4x a4xVar, a4x a4xVar2, bi90 bi90Var, String str, boolean z, boolean z2, long j, Throwable th, int i) {
        if ((i & 1) != 0) {
            a4xVar = kyaVar.f19097a;
        }
        a4x a4xVar3 = a4xVar;
        a4x a4xVar4 = (i & 2) != 0 ? kyaVar.b : a4xVar2;
        bi90 bi90Var2 = (i & 4) != 0 ? kyaVar.c : bi90Var;
        String str2 = (i & 8) != 0 ? kyaVar.d : str;
        boolean z3 = (i & 16) != 0 ? kyaVar.e : false;
        boolean z4 = (i & 32) != 0 ? kyaVar.f : true;
        boolean z5 = (i & 64) != 0 ? kyaVar.g : z;
        boolean z6 = (i & 128) != 0 ? kyaVar.h : z2;
        long j2 = (i & 256) != 0 ? kyaVar.i : j;
        Throwable th2 = (i & 512) != 0 ? kyaVar.j : th;
        kyaVar.getClass();
        a4xVar3.getClass();
        a4xVar4.getClass();
        bi90Var2.getClass();
        return new kya(a4xVar3, a4xVar4, bi90Var2, str2, z3, z4, z5, z6, j2, th2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kya)) {
            return false;
        }
        kya kyaVar = (kya) obj;
        return Intrinsics.d(this.f19097a, kyaVar.f19097a) && Intrinsics.d(this.b, kyaVar.b) && Intrinsics.d(this.c, kyaVar.c) && Intrinsics.d(this.d, kyaVar.d) && this.e == kyaVar.e && this.f == kyaVar.f && this.g == kyaVar.g && this.h == kyaVar.h && this.i == kyaVar.i && Intrinsics.d(this.j, kyaVar.j);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + cs0.b(this.b, this.f19097a.hashCode() * 31, 31)) * 31;
        String str = this.d;
        int iB = rw2.b(brm0.e(brm0.e(brm0.e(brm0.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        Throwable th = this.j;
        return iB + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = rw2.q("CashbackChoosingState(games=", this.f19097a, ", allGames=", this.b, ", selectedGameIds=");
        sbQ.append(this.c);
        sbQ.append(", searchQuery=");
        sbQ.append(this.d);
        sbQ.append(", isLoading=");
        ua80.u(", isGamesLoaded=", ", isConnected=", sbQ, this.e, this.f);
        ua80.u(", isNothingFound=", ", monthGameId=", sbQ, this.g, this.h);
        sbQ.append(this.i);
        sbQ.append(", error=");
        sbQ.append(this.j);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
