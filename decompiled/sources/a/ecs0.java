package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ecs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7582a;
    public final String b;
    public final long c;
    public final vcs0 d;

    public ecs0(int i, String str, long j, vcs0 vcs0Var) {
        str.getClass();
        this.f7582a = i;
        this.b = str;
        this.c = j;
        this.d = vcs0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ecs0)) {
            return false;
        }
        ecs0 ecs0Var = (ecs0) obj;
        return this.f7582a == ecs0Var.f7582a && Intrinsics.d(this.b, ecs0Var.b) && this.c == ecs0Var.c && this.d == ecs0Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + rw2.b(ua80.b(Integer.hashCode(this.f7582a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f7582a, "TrackMessage(messageId=", ", userId=", this.b, ", createdAt=");
        sbR.append(this.c);
        sbR.append(", trackerType=");
        sbR.append(this.d);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
