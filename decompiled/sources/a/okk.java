package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class okk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25408a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public okk(String str, String str2, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        this.f25408a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof okk)) {
            return false;
        }
        okk okkVar = (okk) obj;
        return Intrinsics.d(this.f25408a, okkVar.f25408a) && Intrinsics.d(this.b, okkVar.b) && this.c == okkVar.c && this.d == okkVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(ua80.b(this.f25408a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ohs0.p(", timerInitialVisibility=", Separators.RPAREN, b1j.n("DicePokerStatusUiModel(startStatusText=", this.f25408a, ", endStatusText=", this.b, ", finalStatus="), this.c, this.d);
    }
}
