package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a76 implements e76 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f349a;
    public final uxm b;
    public final String c;
    public final f2i d;

    public a76(String str, uxm uxmVar, String str2, d2i d2iVar) {
        str.getClass();
        str2.getClass();
        this.f349a = str;
        this.b = uxmVar;
        this.c = str2;
        this.d = d2iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a76)) {
            return false;
        }
        a76 a76Var = (a76) obj;
        return Intrinsics.d(this.f349a, a76Var.f349a) && Intrinsics.d(this.b, a76Var.b) && Intrinsics.d(this.c, a76Var.c) && Intrinsics.d(this.d, a76Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.f349a.hashCode() * 31;
        uxm uxmVar = this.b;
        int iB = ua80.b((iHashCode + (uxmVar == null ? 0 : uxmVar.hashCode())) * 31, 31, this.c);
        f2i f2iVar = this.d;
        return iB + (f2iVar != null ? f2iVar.hashCode() : 0);
    }

    public final String toString() {
        return "OneOpponent(opponentName=" + this.f349a + ", timer=" + this.b + ", infoLabel=" + this.c + ", broadcastIndicatorModel=" + this.d + Separators.RPAREN;
    }
}
