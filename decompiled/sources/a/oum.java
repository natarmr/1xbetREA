package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class oum implements rum {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tum f25884a;
    public final tum b;
    public final kum c;
    public final String d;
    public final sem e;

    public oum(tum tumVar, tum tumVar2, kum kumVar, String str, sem semVar) {
        str.getClass();
        this.f25884a = tumVar;
        this.b = tumVar2;
        this.c = kumVar;
        this.d = str;
        this.e = semVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oum)) {
            return false;
        }
        oum oumVar = (oum) obj;
        return this.f25884a.equals(oumVar.f25884a) && this.b.equals(oumVar.b) && Intrinsics.d(this.c, oumVar.c) && Intrinsics.d(this.d, oumVar.d) && this.e.equals(oumVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f25884a.hashCode() * 31)) * 31;
        kum kumVar = this.c;
        return this.e.hashCode() + ua80.b((iHashCode + (kumVar == null ? 0 : kumVar.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        return "V1(firstOpponentModel=" + this.f25884a + ", secondOpponentModel=" + this.b + ", timer=" + this.c + ", infoLabel=" + this.d + ", eventStatusIndicatorModel=" + this.e + Separators.RPAREN;
    }
}
