package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f9j implements g9j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9155a;
    public final Long b;

    public f9j(Long l, long j) {
        this.f9155a = j;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f9j)) {
            return false;
        }
        f9j f9jVar = (f9j) obj;
        return this.f9155a == f9jVar.f9155a && Intrinsics.d(this.b, f9jVar.b);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f9155a) * 31;
        Long l = this.b;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "Timer(value=" + this.f9155a + ", stageTime=" + this.b + Separators.RPAREN;
    }
}
