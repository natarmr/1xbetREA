package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ydm implements bem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f42445a;
    public final boolean b;
    public final v3i c;

    public ydm(long j, boolean z, v3i v3iVar) {
        v3iVar.getClass();
        this.f42445a = j;
        this.b = z;
        this.c = v3iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ydm)) {
            return false;
        }
        ydm ydmVar = (ydm) obj;
        return this.f42445a == ydmVar.f42445a && this.b == ydmVar.b && Intrinsics.d(this.c, ydmVar.c);
    }

    public final int hashCode() {
        return this.c.f36733a.hashCode() + brm0.e(Long.hashCode(this.f42445a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f42445a, "OnBroadcastBtnClicked(gameId=", ", isLive=", this.b);
        sbR.append(", buttonModel=");
        sbR.append(this.c);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
