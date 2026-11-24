package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class zdm implements bem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f44219a;
    public final boolean b;
    public final x3i c;

    public zdm(long j, boolean z, x3i x3iVar) {
        x3iVar.getClass();
        this.f44219a = j;
        this.b = z;
        this.c = x3iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zdm)) {
            return false;
        }
        zdm zdmVar = (zdm) obj;
        return this.f44219a == zdmVar.f44219a && this.b == zdmVar.b && Intrinsics.d(this.c, zdmVar.c);
    }

    public final int hashCode() {
        return this.c.f40219a.hashCode() + brm0.e(Long.hashCode(this.f44219a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f44219a, "OnFavoriteBtnClicked(gameId=", ", isLive=", this.b);
        sbR.append(", buttonModel=");
        sbR.append(this.c);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
