package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class aqh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1295a;
    public final int b;
    public final boolean c;

    public aqh(String str, int i, boolean z) {
        str.getClass();
        this.f1295a = str;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqh)) {
            return false;
        }
        aqh aqhVar = (aqh) obj;
        return Intrinsics.d(this.f1295a, aqhVar.f1295a) && this.b == aqhVar.b && this.c == aqhVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + twn.a(this.b, this.f1295a.hashCode() * 31, 31);
    }

    public final String toString() {
        return rw2.p(kng0.p(this.b, "CyberUFCStatisticsOpponentValueUiModel(value=", this.f1295a, ", progress=", ", active="), this.c, Separators.RPAREN);
    }
}
