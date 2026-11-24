package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class vnl0 implements xnl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z0n f37724a;
    public final z0n b;
    public final String c;
    public final p0n d;
    public final String e;
    public final String f;
    public final xem g;

    public vnl0(z0n z0nVar, z0n z0nVar2, String str, p0n p0nVar, String str2, String str3, xem xemVar) {
        str3.getClass();
        this.f37724a = z0nVar;
        this.b = z0nVar2;
        this.c = str;
        this.d = p0nVar;
        this.e = str2;
        this.f = str3;
        this.g = xemVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vnl0)) {
            return false;
        }
        vnl0 vnl0Var = (vnl0) obj;
        return this.f37724a.equals(vnl0Var.f37724a) && this.b.equals(vnl0Var.b) && this.c.equals(vnl0Var.c) && Intrinsics.d(this.d, vnl0Var.d) && this.e.equals(vnl0Var.e) && Intrinsics.d(this.f, vnl0Var.f) && this.g.equals(vnl0Var.g);
    }

    public final int hashCode() {
        int iB = ua80.b((this.b.hashCode() + (this.f37724a.hashCode() * 31)) * 31, 31, this.c);
        p0n p0nVar = this.d;
        return this.g.hashCode() + ua80.b(ua80.b((iB + (p0nVar == null ? 0 : p0nVar.hashCode())) * 961, 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TwoOpponents(teamOneModel=");
        sb.append(this.f37724a);
        sb.append(", teamTwoModel=");
        sb.append(this.b);
        sb.append(", infoLabel=");
        sb.append(this.c);
        sb.append(", timer=");
        sb.append(this.d);
        sb.append(", scoreGameTitle=, scoreSetTitle=");
        f140.v(sb, this.e, ", scoreResultTitle=", this.f, ", gameIndicator=");
        sb.append(this.g);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
