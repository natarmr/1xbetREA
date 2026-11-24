package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class jyy implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17381a;
    public final a4x b;
    public final boolean c;

    public jyy(a4x a4xVar, String str, boolean z) {
        a4xVar.getClass();
        this.f17381a = str;
        this.b = a4xVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jyy)) {
            return false;
        }
        jyy jyyVar = (jyy) obj;
        return this.f17381a.equals(jyyVar.f17381a) && Intrinsics.d(this.b, jyyVar.b) && this.c == jyyVar.c;
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f17381a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cs0.b(this.b, this.f17381a.hashCode() * 31, 31);
    }

    public final String toString() {
        return rw2.p(kng0.u("LastFightsResultCardUiModel(key=", this.f17381a, ", results=", this.b, ", supportRtl="), this.c, Separators.RPAREN);
    }
}
