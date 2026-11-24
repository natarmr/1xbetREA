package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class tc7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33705a;
    public final String b;
    public final iln c;

    public tc7(String str, String str2, iln ilnVar) {
        str.getClass();
        str2.getClass();
        this.f33705a = str;
        this.b = str2;
        this.c = ilnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tc7)) {
            return false;
        }
        tc7 tc7Var = (tc7) obj;
        return Intrinsics.d(this.f33705a, tc7Var.f33705a) && Intrinsics.d(this.b, tc7Var.b) && this.c.equals(tc7Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f33705a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("BetInfoUiState(eventsCount=", this.f33705a, ", blockedDependentCount=", this.b, ", infoLabelUiState=");
        sbN.append(this.c);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
