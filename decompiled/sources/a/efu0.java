package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class efu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7734a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public efu0(String str, boolean z, boolean z2, boolean z3) {
        this.f7734a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof efu0)) {
            return false;
        }
        efu0 efu0Var = (efu0) obj;
        return Intrinsics.d(this.f7734a, efu0Var.f7734a) && this.b == efu0Var.b && this.c == efu0Var.c && this.d == efu0Var.d;
    }

    public final int hashCode() {
        String str = this.f7734a;
        return Boolean.hashCode(this.d) + brm0.e(brm0.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ohs0.p(", isVideoBlur=", Separators.RPAREN, brm0.u("VideoPlayerUiModel(videoUrl=", this.f7734a, ", isSoundEnable=", this.b, ", isBroadcastingRun="), this.c, this.d);
    }
}
