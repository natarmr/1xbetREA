package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class rha implements sha {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f30480a;
    public final Long b;

    public rha(Long l, long j) {
        this.f30480a = j;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rha)) {
            return false;
        }
        rha rhaVar = (rha) obj;
        return this.f30480a == rhaVar.f30480a && Intrinsics.d(this.b, rhaVar.b);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f30480a) * 31;
        Long l = this.b;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "Timer(time=" + this.f30480a + ", stageTime=" + this.b + Separators.RPAREN;
    }
}
