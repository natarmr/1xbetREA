package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k4z implements l4z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h4z f17693a;

    public k4z(h4z h4zVar) {
        h4zVar.getClass();
        this.f17693a = h4zVar;
    }

    @Override // a.l4z
    public final h4z a() {
        return this.f17693a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k4z) && Intrinsics.d(this.f17693a, ((k4z) obj).f17693a) && znq0.e(180L, 180L);
    }

    public final int hashCode() {
        return Long.hashCode(180L) + (this.f17693a.hashCode() * 31);
    }

    public final String toString() {
        return "Transfer(commonInfo=" + this.f17693a + ", timerValue=" + znq0.h(180L) + Separators.RPAREN;
    }
}
