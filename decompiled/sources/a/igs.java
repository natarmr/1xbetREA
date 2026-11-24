package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class igs implements pgs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14748a;
    public final String b;
    public final b6q c;

    public igs(String str, String str2, b6q b6qVar) {
        str.getClass();
        str2.getClass();
        this.f14748a = str;
        this.b = str2;
        this.c = b6qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof igs)) {
            return false;
        }
        igs igsVar = (igs) obj;
        return Intrinsics.d(this.f14748a, igsVar.f14748a) && Intrinsics.d(this.b, igsVar.b) && this.c.equals(igsVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f14748a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("FinBetLevelUiModel(levelLabel=", this.f14748a, ", typeLabel=", this.b, ", finBetCoefType=");
        sbN.append(this.c);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
