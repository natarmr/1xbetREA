package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class mem implements nem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21653a;
    public final a4x b;

    public mem(long j, a4x a4xVar) {
        a4xVar.getClass();
        this.f21653a = j;
        this.b = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mem)) {
            return false;
        }
        mem memVar = (mem) obj;
        return this.f21653a == memVar.f21653a && Intrinsics.d(this.b, memVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f21653a) * 31);
    }

    public final String toString() {
        return "SingleLine(gameId=" + this.f21653a + ", marketGroupList=" + this.b + Separators.RPAREN;
    }
}
