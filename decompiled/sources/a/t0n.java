package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class t0n implements x0n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z0n f33126a;
    public final z0n b;
    public final p0n c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final sem h;
    public final xem i;

    public t0n(z0n z0nVar, z0n z0nVar2, p0n p0nVar, String str, String str2, String str3, String str4, sem semVar, xem xemVar) {
        brm0.B(str, str3, str4);
        this.f33126a = z0nVar;
        this.b = z0nVar2;
        this.c = p0nVar;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = semVar;
        this.i = xemVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0n)) {
            return false;
        }
        t0n t0nVar = (t0n) obj;
        return this.f33126a.equals(t0nVar.f33126a) && this.b.equals(t0nVar.b) && Intrinsics.d(this.c, t0nVar.c) && Intrinsics.d(this.d, t0nVar.d) && this.e.equals(t0nVar.e) && Intrinsics.d(this.f, t0nVar.f) && Intrinsics.d(this.g, t0nVar.g) && this.h.equals(t0nVar.h) && this.i.equals(t0nVar.i);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f33126a.hashCode() * 31)) * 31;
        p0n p0nVar = this.c;
        return this.i.hashCode() + ((this.h.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b((iHashCode + (p0nVar == null ? 0 : p0nVar.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("V1(firstOpponentModel=");
        sb.append(this.f33126a);
        sb.append(", secondOpponentModel=");
        sb.append(this.b);
        sb.append(", timer=");
        sb.append(this.c);
        sb.append(", infoLabel=");
        sb.append(this.d);
        sb.append(", scoreGameTitle=");
        f140.v(sb, this.e, ", scoreSetTitle=", this.f, ", scoreResultTitle=");
        sb.append(this.g);
        sb.append(", eventStatusIndicatorModel=");
        sb.append(this.h);
        sb.append(", gameIndicator=");
        sb.append(this.i);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
