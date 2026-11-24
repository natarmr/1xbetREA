package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class nda implements rda {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j83 f23329a;
    public final j83 b;
    public final cex c;
    public final kdp0 d;
    public final kdp0 e;
    public final String f;
    public final boolean g;
    public final String h;
    public final boolean i;

    public nda(j83 j83Var, j83 j83Var2, cex cexVar, kdp0 kdp0Var, kdp0 kdp0Var2, String str, boolean z, String str2, boolean z2) {
        str.getClass();
        str2.getClass();
        this.f23329a = j83Var;
        this.b = j83Var2;
        this.c = cexVar;
        this.d = kdp0Var;
        this.e = kdp0Var2;
        this.f = str;
        this.g = z;
        this.h = str2;
        this.i = z2;
        dja djaVar = dja.PENALTY;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nda)) {
            return false;
        }
        nda ndaVar = (nda) obj;
        return this.f23329a.equals(ndaVar.f23329a) && this.b.equals(ndaVar.b) && this.c == ndaVar.c && this.d.equals(ndaVar.d) && this.e.equals(ndaVar.e) && Intrinsics.d(this.f, ndaVar.f) && this.g == ndaVar.g && Intrinsics.d(this.h, ndaVar.h) && this.i == ndaVar.i;
    }

    @Override // a.bja
    public final dja getType() {
        return dja.COMMON;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + ua80.b(brm0.e(ua80.b((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + brm0.f(this.b, this.f23329a.hashCode() * 31, 31)) * 31)) * 31)) * 31, 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Cricket(topInfo=");
        sb.append((Object) this.f23329a);
        sb.append(", bottomInfo=");
        sb.append((Object) this.b);
        sb.append(", inningType=");
        sb.append(this.c);
        sb.append(", teamOne=");
        sb.append(this.d);
        sb.append(", teamTwo=");
        sb.append(this.e);
        sb.append(", teamOneScore=");
        sb.append(this.f);
        sb.append(", teamOneScoreIncrease=");
        f140.s(", teamTwoScore=", this.h, ", teamTwoScoreIncrease=", sb, this.g);
        return rw2.p(sb, this.i, Separators.RPAREN);
    }
}
