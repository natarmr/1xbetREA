package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class q820 implements t820 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xy6 f28279a;

    public q820(xy6 xy6Var) {
        xy6Var.getClass();
        this.f28279a = xy6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q820) && Intrinsics.d(this.f28279a, ((q820) obj).f28279a);
    }

    public final int hashCode() {
        return this.f28279a.hashCode();
    }

    public final String toString() {
        return "PrimaryBet(betGameInfo=" + this.f28279a + Separators.RPAREN;
    }
}
