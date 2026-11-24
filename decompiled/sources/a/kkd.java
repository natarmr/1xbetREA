package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class kkd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18431a;
    public final Integer b;

    public kkd(int i, fww fwwVar, Integer num) {
        this.f18431a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kkd)) {
            return false;
        }
        kkd kkdVar = (kkd) obj;
        return this.f18431a == kkdVar.f18431a && Intrinsics.d(null, null) && Intrinsics.d(this.b, kkdVar.b);
    }

    public final int hashCode() {
        int iHashCode = ((Integer.hashCode(this.f18431a) * 31) + 0) * 31;
        Integer num = this.b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ComposeStackTraceFrame(groupKey=");
        sb.append(this.f18431a);
        sb.append(", sourceInfo=");
        sb.append((Object) null);
        sb.append(", groupOffset=");
        return dw9.q(sb, this.b, Separators.RPAREN);
    }
}
