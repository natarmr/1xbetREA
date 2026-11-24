package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class unl0 implements xnl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z0n f35969a;
    public final z0n b;
    public final String c;
    public final p0n d;
    public final String e;
    public final String f;
    public final String g;
    public final xem h;

    public unl0(z0n z0nVar, z0n z0nVar2, String str, p0n p0nVar, String str2, String str3, String str4, xem xemVar) {
        str4.getClass();
        this.f35969a = z0nVar;
        this.b = z0nVar2;
        this.c = str;
        this.d = p0nVar;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = xemVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof unl0)) {
            return false;
        }
        unl0 unl0Var = (unl0) obj;
        return this.f35969a.equals(unl0Var.f35969a) && this.b.equals(unl0Var.b) && Intrinsics.d(this.c, unl0Var.c) && Intrinsics.d(this.d, unl0Var.d) && this.e.equals(unl0Var.e) && this.f.equals(unl0Var.f) && Intrinsics.d(this.g, unl0Var.g) && this.h.equals(unl0Var.h);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f35969a.hashCode() * 31)) * 31;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        p0n p0nVar = this.d;
        return this.h.hashCode() + ua80.b(ua80.b(ua80.b((iHashCode2 + (p0nVar != null ? p0nVar.hashCode() : 0)) * 31, 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Tennis(teamOneModel=");
        sb.append(this.f35969a);
        sb.append(", teamTwoModel=");
        sb.append(this.b);
        sb.append(", infoLabel=");
        sb.append(this.c);
        sb.append(", timer=");
        sb.append(this.d);
        sb.append(", scoreGameTitle=");
        f140.v(sb, this.e, ", scoreSetTitle=", this.f, ", scoreResultTitle=");
        sb.append(this.g);
        sb.append(", gameIndicator=");
        sb.append(this.h);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
