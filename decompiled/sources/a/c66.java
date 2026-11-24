package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c66 implements g66 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3803a;
    public final uxm b;
    public final String c;

    public c66(String str, uxm uxmVar, String str2) {
        str.getClass();
        str2.getClass();
        this.f3803a = str;
        this.b = uxmVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c66)) {
            return false;
        }
        c66 c66Var = (c66) obj;
        return Intrinsics.d(this.f3803a, c66Var.f3803a) && Intrinsics.d(this.b, c66Var.b) && Intrinsics.d(this.c, c66Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.f3803a.hashCode() * 31;
        uxm uxmVar = this.b;
        return this.c.hashCode() + ((iHashCode + (uxmVar == null ? 0 : uxmVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OneOpponent(opponentName=");
        sb.append(this.f3803a);
        sb.append(", timer=");
        sb.append(this.b);
        sb.append(", infoLabel=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
