package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class vkk implements wkk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f37577a;
    public final Long b;

    public vkk(Long l, long j) {
        this.f37577a = j;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vkk)) {
            return false;
        }
        vkk vkkVar = (vkk) obj;
        return this.f37577a == vkkVar.f37577a && Intrinsics.d(this.b, vkkVar.b);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f37577a) * 31;
        Long l = this.b;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "Timer(value=" + this.f37577a + ", stageTime=" + this.b + Separators.RPAREN;
    }
}
