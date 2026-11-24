package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/q9q;", "La/iw5;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class q9q extends iw5 {
    public static final /* synthetic */ int m2 = 0;
    public fiu0 k2;
    public final a8z l2 = xbc.b0(this, sre0.f32672a.b(x9q.class), new yip(this, (byte) 9));

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        fetVar.e0(530039941);
        a8z a8zVar = this.l2;
        k3t0 k3t0Var = (k3t0) a8zVar.getValue();
        boolean zI = fetVar.i(this);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (zI || objP == obj) {
            Object popVar = new pop(1, this, q9q.class, "handleSideEffects", "handleSideEffects(Lorg/xplatform/feature/fin_bet/impl/presentation/dialogs/FinBetsInstrumentsDialogSideEffect;)V", 0, (byte) 12);
            fetVar.o0(popVar);
            objP = popVar;
        }
        lkz lkzVar = lkz.f20223a;
        pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
        boolean zI2 = fetVar.i(k3t0Var) | fetVar.i(this) | fetVar.e(3) | fetVar.g(pz40VarF);
        Object objP2 = fetVar.P();
        if (zI2 || objP2 == obj) {
            objP2 = new g6g(k3t0Var, this, pz40VarF, (yje) null);
            fetVar.o0(objP2);
        }
        m0x0.t(fetVar, this, (Function2) objP2);
        bw5 bw5Var = new bw5(cw5.a(iw5.O0(1, fetVar), false, true, false, null, 0L, 59), eeq.h, (ugd) null, u1c.M(-1390477964, new rgh(((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar), this, (byte) 14), fetVar), 10);
        fetVar.r(false);
        return bw5Var;
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void V(Context context) {
        super.V(context);
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(o9q.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            o9q o9qVar = (o9q) (ze3Var instanceof o9q ? ze3Var : null);
            if (o9qVar != null) {
                this.k2 = new fiu0(Collections.singletonMap(x9q.class, (dci) o9qVar.a(a4n0.f(this)).G));
                return;
            }
        }
        jf4.n(b1j.i(o9q.class, "Cannot create dependency "));
    }
}
