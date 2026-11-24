package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class gxp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fxp f12088a;
    public final a4x b;

    public gxp(fxp fxpVar, a4x a4xVar) {
        a4xVar.getClass();
        this.f12088a = fxpVar;
        this.b = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxp)) {
            return false;
        }
        gxp gxpVar = (gxp) obj;
        return Intrinsics.d(this.f12088a, gxpVar.f12088a) && Intrinsics.d(this.b, gxpVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f12088a.hashCode() * 31);
    }

    public final String toString() {
        return "FighterScrollableContentUiState(screenState=" + this.f12088a + ", uiItems=" + this.b + Separators.RPAREN;
    }

    public gxp(fxp fxpVar) {
        this(fxpVar, lak0.c);
    }
}
