package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class yod implements ynd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42979a;
    public final String b;
    public final j83 c;
    public final mpm d;

    public yod(String str, String str2, j83 j83Var, mpm mpmVar) {
        str.getClass();
        str2.getClass();
        this.f42979a = str;
        this.b = str2;
        this.c = j83Var;
        this.d = mpmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yod)) {
            return false;
        }
        yod yodVar = (yod) obj;
        return Intrinsics.d(this.f42979a, yodVar.f42979a) && Intrinsics.d(this.b, yodVar.b) && this.c.equals(yodVar.c) && this.d.equals(yodVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.f(this.c, ua80.b(this.f42979a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CompressedCardMultiTeamUiModel(teamOne=", this.f42979a, ", teamTwo=", this.b, ", topInfo=");
        sbN.append((Object) this.c);
        sbN.append(", score=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
