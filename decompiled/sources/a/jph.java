package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class jph {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16900a;
    public final aqh b;
    public final aqh c;

    public jph(String str, aqh aqhVar, aqh aqhVar2) {
        str.getClass();
        this.f16900a = str;
        this.b = aqhVar;
        this.c = aqhVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jph)) {
            return false;
        }
        jph jphVar = (jph) obj;
        return Intrinsics.d(this.f16900a, jphVar.f16900a) && this.b.equals(jphVar.b) && this.c.equals(jphVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f16900a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CyberUFCStatisticsComparativeItemUiModel(title=" + this.f16900a + ", firstOpponent=" + this.b + ", secondOpponent=" + this.c + Separators.RPAREN;
    }
}
