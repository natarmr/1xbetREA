package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class aem implements bem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f736a;
    public final boolean b;
    public final z3i c;

    public aem(long j, boolean z, z3i z3iVar) {
        z3iVar.getClass();
        this.f736a = j;
        this.b = z;
        this.c = z3iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aem)) {
            return false;
        }
        aem aemVar = (aem) obj;
        return this.f736a == aemVar.f736a && this.b == aemVar.b && Intrinsics.d(this.c, aemVar.c);
    }

    public final int hashCode() {
        return this.c.f43719a.hashCode() + brm0.e(Long.hashCode(this.f736a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f736a, "OnNotificationBtnClicked(gameId=", ", isLive=", this.b);
        sbR.append(", buttonModel=");
        sbR.append(this.c);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
