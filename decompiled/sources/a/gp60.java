package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class gp60 implements vp60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11669a;
    public final String b;

    public gp60(long j, String str) {
        this.f11669a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gp60)) {
            return false;
        }
        gp60 gp60Var = (gp60) obj;
        return this.f11669a == gp60Var.f11669a && Intrinsics.d(this.b, gp60Var.b);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f11669a) * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f11669a, "OnGameClicked(gameId=", ", loadedImageUrl=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
