package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class wts0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39757a;
    public final wnq0 b;

    public wts0(String str, wnq0 wnq0Var) {
        str.getClass();
        this.f39757a = str;
        this.b = wnq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wts0)) {
            return false;
        }
        wts0 wts0Var = (wts0) obj;
        return Intrinsics.d(this.f39757a, wts0Var.f39757a) && this.b.equals(wts0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f39757a.hashCode() * 31);
    }

    public final String toString() {
        return "TwentyOneClassicGameInfoUiModel(matchDescription=" + this.f39757a + ", timer=" + this.b + Separators.RPAREN;
    }
}
