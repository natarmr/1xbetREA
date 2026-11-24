package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class pdq implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f26819a;
    public final long b;
    public final int c;

    public pdq(mdm mdmVar, long j, int i) {
        this.f26819a = mdmVar;
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pdq)) {
            return false;
        }
        pdq pdqVar = (pdq) obj;
        return Intrinsics.d(this.f26819a, pdqVar.f26819a) && wen.d(this.b, pdqVar.b) && this.c == pdqVar.c;
    }

    public final int hashCode() {
        int iHashCode = this.f26819a.hashCode() * 31;
        uen uenVar = wen.b;
        return Integer.hashCode(this.c) + rw2.b(iHashCode, 31, this.b);
    }

    public final String toString() {
        String strM = wen.m(this.b);
        StringBuilder sb = new StringBuilder("FindLiveUiModel(lottieConfig=");
        sb.append(this.f26819a);
        sb.append(", before=");
        sb.append(strM);
        sb.append(", gameStatusRes=");
        return rz4.j(this.c, Separators.RPAREN, sb);
    }
}
