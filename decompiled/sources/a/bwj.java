package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final class bwj extends xk80 {
    public static final v0h0 I = qxw.L(new x2i(23), new svj(4));
    public final pz40 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bwj(int i, float f, Function0 function0) {
        super(f, i);
        function0.getClass();
        this.H = androidx.compose.runtime.e.e(function0);
    }

    @Override // a.xk80
    public final int n() {
        return ((Number) ((Function0) ((hgk0) this.H).getValue()).invoke()).intValue();
    }
}
