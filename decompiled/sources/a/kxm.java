package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class kxm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19062a;
    public final c280 b;
    public final String c;
    public final a4x d;

    public kxm(String str, c280 c280Var, String str2, a4x a4xVar) {
        str.getClass();
        a4xVar.getClass();
        this.f19062a = str;
        this.b = c280Var;
        this.c = str2;
        this.d = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kxm)) {
            return false;
        }
        kxm kxmVar = (kxm) obj;
        return Intrinsics.d(this.f19062a, kxmVar.f19062a) && this.b.equals(kxmVar.b) && this.c.equals(kxmVar.c) && Intrinsics.d(this.d, kxmVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(hne.g(this.b, this.f19062a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbP = f140.p(this.b, "V2(opponentLabel=", this.f19062a, ", opponentIcon=", ", seed=");
        sbP.append(this.c);
        sbP.append(", scores=");
        sbP.append(this.d);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
