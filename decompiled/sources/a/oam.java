package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class oam {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24933a;
    public final String b;
    public final String c;

    public oam(long j, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f24933a = j;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oam)) {
            return false;
        }
        oam oamVar = (oam) obj;
        return this.f24933a == oamVar.f24933a && Intrinsics.d(this.b, oamVar.b) && Intrinsics.d(this.c, oamVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Long.hashCode(this.f24933a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.o(axq.o(this.f24933a, "DsCyberSimulationTimerUiState(targetTimeMillis=", ", beforeStartText=", this.b), ", daysTemplate=", this.c, Separators.RPAREN);
    }
}
