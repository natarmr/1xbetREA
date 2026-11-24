package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class lem implements nem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19910a;
    public final a4x b;

    public lem(long j, a4x a4xVar) {
        a4xVar.getClass();
        this.f19910a = j;
        this.b = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lem)) {
            return false;
        }
        lem lemVar = (lem) obj;
        return this.f19910a == lemVar.f19910a && Intrinsics.d(this.b, lemVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f19910a) * 31);
    }

    public final String toString() {
        return "Multiline(gameId=" + this.f19910a + ", marketGroupList=" + this.b + Separators.RPAREN;
    }
}
