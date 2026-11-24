package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class glh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11490a;
    public final boolean b;
    public final boolean c;
    public final List d;

    public glh(String str, List list, boolean z, boolean z2) {
        list.getClass();
        this.f11490a = str;
        this.b = z;
        this.c = z2;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof glh)) {
            return false;
        }
        glh glhVar = (glh) obj;
        return this.f11490a.equals(glhVar.f11490a) && this.b == glhVar.b && this.c == glhVar.c && Intrinsics.d(this.d, glhVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.e(brm0.e(this.f11490a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbU = brm0.u("CyberTournamentBracketRoundPlayoffModel(name=", this.f11490a, ", isThirdPlace=", this.b, ", isGrandFinal=");
        sbU.append(this.c);
        sbU.append(", matches=");
        sbU.append(this.d);
        sbU.append(Separators.RPAREN);
        return sbU.toString();
    }
}
