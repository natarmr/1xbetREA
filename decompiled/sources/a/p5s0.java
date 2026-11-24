package a;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class p5s0 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pz40 f26421a;
    public final /* synthetic */ vne b;
    public final /* synthetic */ t33 c;
    public final /* synthetic */ o6s0 d;
    public final /* synthetic */ sjj e;
    public final /* synthetic */ ngk0 f;
    public final /* synthetic */ long g;

    public p5s0(pz40 pz40Var, vne vneVar, t33 t33Var, o6s0 o6s0Var, sjj sjjVar, ngk0 ngk0Var, long j) {
        this.f26421a = pz40Var;
        this.b = vneVar;
        this.c = t33Var;
        this.d = o6s0Var;
        this.e = sjjVar;
        this.f = ngk0Var;
        this.g = j;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(hpa0 hpa0Var, yje yjeVar) {
        mie0 mie0Var = new mie0();
        mie0Var.f21842a = new j6u0();
        pz40 pz40Var = this.f26421a;
        vne vneVar = this.b;
        t33 t33Var = this.c;
        o6s0 o6s0Var = this.d;
        Object objE = bel.e(hpa0Var, new q6q0(pz40Var, mie0Var, vneVar, t33Var, o6s0Var, (byte) 1), new co0(mie0Var, pz40Var, vneVar, t33Var, o6s0Var, this.e, (byte) 10), new sbe0(mie0Var, (byte) 1), new ds8(o6s0Var, this.f, this.g, mie0Var, (byte) 6), yjeVar);
        return objE == wne.f39444a ? objE : Unit.f46060a;
    }
}
