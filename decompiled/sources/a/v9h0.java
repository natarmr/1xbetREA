package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class v9h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tai0 f37034a;
    public final int b;
    public final mkx c;
    public final s460 d;

    public v9h0(tai0 tai0Var, int i, mkx mkxVar, s460 s460Var) {
        this.f37034a = tai0Var;
        this.b = i;
        this.c = mkxVar;
        this.d = s460Var;
    }

    public final String toString() {
        return "ScrollCaptureCandidate(node=" + this.f37034a + ", depth=" + this.b + ", viewportBoundsInWindow=" + this.c + ", coordinates=" + this.d + Separators.RPAREN;
    }
}
