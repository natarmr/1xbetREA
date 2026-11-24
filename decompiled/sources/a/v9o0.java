package a;

import android.view.View;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class v9o0 extends agx {
    public Function1 r;
    public djv0 s;

    @Override // a.sfx, a.lm40
    public final void R0() {
        View viewZ = tdc.Z(this);
        WeakHashMap weakHashMap = djv0.w;
        djv0 djv0VarJ = zcm0.j(viewZ);
        djv0VarJ.a(viewZ);
        vhv0 vhv0Var = (vhv0) this.r.invoke(djv0VarJ);
        if (!Intrinsics.d(vhv0Var, this.q)) {
            this.q = vhv0Var;
            a1();
        }
        this.s = djv0VarJ;
        super.R0();
    }

    @Override // a.sfx, a.lm40
    public final void S0() {
        View viewZ = tdc.Z(this);
        djv0 djv0Var = this.s;
        if (djv0Var != null) {
            int i = djv0Var.u - 1;
            djv0Var.u = i;
            if (i == 0) {
                WeakHashMap weakHashMap = rgu0.f30456a;
                igu0.c(viewZ, null);
                div0.a(viewZ, null);
                viewZ.removeOnAttachStateChangeListener(djv0Var.v);
            }
        }
        super.S0();
    }
}
