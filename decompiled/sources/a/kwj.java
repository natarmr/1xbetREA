package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final class kwj extends xk80 {
    public static final v0h0 I = qxw.L(new x2i(24), new svj(5));
    public final pz40 H;

    public kwj(int i, float f, Function0 function0) {
        super(f, i);
        this.H = androidx.compose.runtime.e.e(function0);
    }

    @Override // a.xk80
    public final int n() {
        return ((Number) ((Function0) ((hgk0) this.H).getValue()).invoke()).intValue();
    }
}
