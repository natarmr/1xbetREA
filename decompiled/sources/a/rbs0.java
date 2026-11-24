package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class rbs0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30204a;
    public final s7p b;

    public rbs0(String str, s7p s7pVar) {
        str.getClass();
        this.f30204a = str;
        this.b = s7pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rbs0)) {
            return false;
        }
        rbs0 rbs0Var = (rbs0) obj;
        return Intrinsics.d(this.f30204a, rbs0Var.f30204a) && this.b.equals(rbs0Var.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f30204a;
    }

    public final int hashCode() {
        return this.b.f31760a.hashCode() + (this.f30204a.hashCode() * 31);
    }

    public final String toString() {
        return "TrackCoefShimmerUiItem(key=" + this.f30204a + ", model=" + this.b + Separators.RPAREN;
    }
}
