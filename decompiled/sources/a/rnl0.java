package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class rnl0 implements xnl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tum f30794a;
    public final tum b;
    public final mpm c;
    public final String d;
    public final kum e;

    public rnl0(tum tumVar, tum tumVar2, mpm mpmVar, String str, kum kumVar) {
        this.f30794a = tumVar;
        this.b = tumVar2;
        this.c = mpmVar;
        this.d = str;
        this.e = kumVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rnl0)) {
            return false;
        }
        rnl0 rnl0Var = (rnl0) obj;
        return this.f30794a.equals(rnl0Var.f30794a) && this.b.equals(rnl0Var.b) && this.c.equals(rnl0Var.c) && Intrinsics.d(this.d, rnl0Var.d) && Intrinsics.d(this.e, rnl0Var.e);
    }

    public final int hashCode() {
        int iE = ohs0.e(this.c, (this.b.hashCode() + (this.f30794a.hashCode() * 31)) * 31, 31);
        String str = this.d;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        kum kumVar = this.e;
        return iHashCode + (kumVar != null ? kumVar.hashCode() : 0);
    }

    public final String toString() {
        return "Cyber(teamOneModel=" + this.f30794a + ", teamTwoModel=" + this.b + ", scoreModel=" + this.c + ", infoLabel=" + this.d + ", timer=" + this.e + Separators.RPAREN;
    }
}
