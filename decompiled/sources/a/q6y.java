package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class q6y implements r6y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f6y f28223a;
    public final String b;

    public q6y(f6y f6yVar, String str) {
        f6yVar.getClass();
        str.getClass();
        this.f28223a = f6yVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q6y)) {
            return false;
        }
        q6y q6yVar = (q6y) obj;
        return Intrinsics.d(this.f28223a, q6yVar.f28223a) && Intrinsics.d(this.b, q6yVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f28223a.hashCode() * 31);
    }

    public final String toString() {
        return "UpdateJackpotModel(jackpotModel=" + this.f28223a + ", currencySymbol=" + this.b + Separators.RPAREN;
    }
}
