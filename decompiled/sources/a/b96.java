package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b96 implements h96 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m2g f2192a;
    public final m2g b;
    public final kum c;
    public final String d;
    public final qem e;

    public b96(m2g m2gVar, m2g m2gVar2, kum kumVar, String str, qem qemVar) {
        str.getClass();
        this.f2192a = m2gVar;
        this.b = m2gVar2;
        this.c = kumVar;
        this.d = str;
        this.e = qemVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b96)) {
            return false;
        }
        b96 b96Var = (b96) obj;
        return this.f2192a.equals(b96Var.f2192a) && this.b.equals(b96Var.b) && Intrinsics.d(this.c, b96Var.c) && Intrinsics.d(this.d, b96Var.d) && Intrinsics.d(this.e, b96Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f2192a.hashCode() * 31)) * 31;
        kum kumVar = this.c;
        return ua80.b((iHashCode + (kumVar == null ? 0 : kumVar.hashCode())) * 31, 31, this.d) + (this.e != null ? -924444967 : 0);
    }

    public final String toString() {
        return "Cyber(firstOpponentModel=" + this.f2192a + ", secondOpponentModel=" + this.b + ", timer=" + this.c + ", infoLabel=" + this.d + ", eventStatusIndicatorModel=" + this.e + Separators.RPAREN;
    }
}
