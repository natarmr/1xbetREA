package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class epd implements ynd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final udp0 f8181a;
    public final udp0 b;
    public final t5h0 c;
    public final String d;

    public epd(udp0 udp0Var, udp0 udp0Var2, t5h0 t5h0Var, String str) {
        str.getClass();
        this.f8181a = udp0Var;
        this.b = udp0Var2;
        this.c = t5h0Var;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof epd)) {
            return false;
        }
        epd epdVar = (epd) obj;
        return this.f8181a.equals(epdVar.f8181a) && this.b.equals(epdVar.b) && this.c.equals(epdVar.c) && Intrinsics.d(this.d, epdVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f8181a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CompressedCardPeriodsScoreUiModel(teamOne=" + this.f8181a + ", teamTwo=" + this.b + ", score=" + this.c + ", periodLabel=" + this.d + Separators.RPAREN;
    }
}
