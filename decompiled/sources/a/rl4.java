package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class rl4 implements sl4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uu4 f30678a;
    public final ynb0 b;
    public final String c;

    public rl4(uu4 uu4Var, ynb0 ynb0Var, String str) {
        uu4Var.getClass();
        this.f30678a = uu4Var;
        this.b = ynb0Var;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rl4)) {
            return false;
        }
        rl4 rl4Var = (rl4) obj;
        return Intrinsics.d(this.f30678a, rl4Var.f30678a) && this.b.equals(rl4Var.b) && this.c.equals(rl4Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f30678a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PerformAfterCaptcha(authorizationData=");
        sb.append(this.f30678a);
        sb.append(", powWrapper=");
        sb.append(this.b);
        sb.append(", deviceId=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
