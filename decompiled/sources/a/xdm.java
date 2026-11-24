package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class xdm implements bem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f40700a;
    public final boolean b;
    public final s3i c;

    public xdm(long j, boolean z, s3i s3iVar) {
        s3iVar.getClass();
        this.f40700a = j;
        this.b = z;
        this.c = s3iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xdm)) {
            return false;
        }
        xdm xdmVar = (xdm) obj;
        return this.f40700a == xdmVar.f40700a && this.b == xdmVar.b && Intrinsics.d(this.c, xdmVar.c);
    }

    public final int hashCode() {
        return this.c.f31559a.hashCode() + brm0.e(Long.hashCode(this.f40700a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f40700a, "OnAccordionBtnClicked(gameId=", ", isLive=", this.b);
        sbR.append(", buttonModel=");
        sbR.append(this.c);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
