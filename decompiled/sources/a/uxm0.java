package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class uxm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f36448a;
    public final String b;

    public uxm0(long j, String str) {
        str.getClass();
        this.f36448a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uxm0)) {
            return false;
        }
        uxm0 uxm0Var = (uxm0) obj;
        return this.f36448a == uxm0Var.f36448a && Intrinsics.d(this.b, uxm0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f36448a) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f36448a, "SubGamesFilterUiModel(id=", ", name=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
