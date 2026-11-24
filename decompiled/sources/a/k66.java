package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k66 implements o66 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17752a;
    public final uxm b;
    public final String c;

    public k66(String str, uxm uxmVar, String str2) {
        str.getClass();
        str2.getClass();
        this.f17752a = str;
        this.b = uxmVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k66)) {
            return false;
        }
        k66 k66Var = (k66) obj;
        return Intrinsics.d(this.f17752a, k66Var.f17752a) && Intrinsics.d(this.b, k66Var.b) && Intrinsics.d(this.c, k66Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.f17752a.hashCode() * 31;
        uxm uxmVar = this.b;
        return this.c.hashCode() + ((iHashCode + (uxmVar == null ? 0 : uxmVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OneOpponent(opponentName=");
        sb.append(this.f17752a);
        sb.append(", timer=");
        sb.append(this.b);
        sb.append(", infoLabel=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
