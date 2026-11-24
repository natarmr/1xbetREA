package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class zpr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ypr f44773a;

    public zpr(ypr yprVar) {
        yprVar.getClass();
        this.f44773a = yprVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zpr) && Intrinsics.d(this.f44773a, ((zpr) obj).f44773a);
    }

    public final int hashCode() {
        return this.f44773a.hashCode();
    }

    public final String toString() {
        return "GameAnalyticsState(gameAnalyticsParams=" + this.f44773a + Separators.RPAREN;
    }
}
