package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class oip0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25323a;
    public final f3g0 b;

    public oip0(String str, f3g0 f3g0Var) {
        str.getClass();
        this.f25323a = str;
        this.b = f3g0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oip0)) {
            return false;
        }
        oip0 oip0Var = (oip0) obj;
        return Intrinsics.d(this.f25323a, oip0Var.f25323a) && this.b == oip0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f25323a.hashCode() * 31);
    }

    public final String toString() {
        return "TeamScoreResultUiModel(text=" + this.f25323a + ", scoreState=" + this.b + Separators.RPAREN;
    }
}
