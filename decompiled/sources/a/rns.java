package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class rns {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30804a;
    public final boolean b;
    public final mdm c;
    public final a4x d;

    public rns(mdm mdmVar, a4x a4xVar, String str, boolean z) {
        str.getClass();
        a4xVar.getClass();
        this.f30804a = str;
        this.b = z;
        this.c = mdmVar;
        this.d = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rns)) {
            return false;
        }
        rns rnsVar = (rns) obj;
        return Intrinsics.d(this.f30804a, rnsVar.f30804a) && this.b == rnsVar.b && Intrinsics.d(this.c, rnsVar.c) && Intrinsics.d(this.d, rnsVar.d);
    }

    public final int hashCode() {
        int iE = brm0.e(this.f30804a.hashCode() * 31, 31, this.b);
        mdm mdmVar = this.c;
        return this.d.hashCode() + ((iE + (mdmVar == null ? 0 : mdmVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbU = brm0.u("GameNotificationUiState(title=", this.f30804a, ", loading=", this.b, ", error=");
        sbU.append(this.c);
        sbU.append(", items=");
        sbU.append(this.d);
        sbU.append(Separators.RPAREN);
        return sbU.toString();
    }
}
