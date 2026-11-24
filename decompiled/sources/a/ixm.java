package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ixm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15547a;
    public final c280 b;
    public final String c;
    public final a4x d;

    public ixm(String str, c280 c280Var, String str2, a4x a4xVar) {
        str.getClass();
        a4xVar.getClass();
        this.f15547a = str;
        this.b = c280Var;
        this.c = str2;
        this.d = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ixm)) {
            return false;
        }
        ixm ixmVar = (ixm) obj;
        return Intrinsics.d(this.f15547a, ixmVar.f15547a) && this.b.equals(ixmVar.b) && this.c.equals(ixmVar.c) && Intrinsics.d(this.d, ixmVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(hne.g(this.b, this.f15547a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbP = f140.p(this.b, "Default(opponentLabel=", this.f15547a, ", opponentIcon=", ", seed=");
        sbP.append(this.c);
        sbP.append(", scores=");
        sbP.append(this.d);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
