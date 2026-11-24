package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class zpi0 {
    public static final xpi0 Companion = new xpi0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wkd0 f44762a;

    static {
        ukd0 ukd0Var = wkd0.Companion;
    }

    public /* synthetic */ zpi0(int i, wkd0 wkd0Var) {
        if ((i & 1) == 0) {
            this.f44762a = null;
        } else {
            this.f44762a = wkd0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zpi0) && Intrinsics.d(this.f44762a, ((zpi0) obj).f44762a);
    }

    public final int hashCode() {
        wkd0 wkd0Var = this.f44762a;
        if (wkd0Var == null) {
            return 0;
        }
        return wkd0Var.hashCode();
    }

    public final String toString() {
        return "SetLimitsWithExamResponse(questionData=" + this.f44762a + Separators.RPAREN;
    }
}
