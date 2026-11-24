package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/i5j;", "La/yx5;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class i5j extends yx5 {
    public static final /* synthetic */ iiy[] O1 = {new j0d0(i5j.class, "binding", "getBinding()Lorg/xplatform/aggregator/daily_tasks/impl/databinding/DailyTaskRulesFragmentBinding;", 0)};
    public final e9o0 K1;
    public fiu0 L1;
    public final a8z M1;
    public final s0r N1;

    public i5j() {
        super(R.layout.daily_task_rules_fragment);
        this.K1 = new e9o0(R.attr.uikitBackgroundContent, R.attr.uikitStaticTransparent, 12);
        this.M1 = xbc.b0(this, sre0.f32672a.b(p5j.class), new e8g(this, (byte) 26));
        this.N1 = ltt0.o(this, h5j.f12482a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.N1.n(O1[0], this);
        objN.getClass();
        b1j.t(((k2j) objN).f17575a, new ugd(-974631020, true, new g5j(this)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(l2j.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            l2j l2jVar = (l2j) (ze3Var instanceof l2j ? ze3Var : null);
            if (l2jVar != null) {
                cad cadVar = l2jVar.f19311a;
                ctf0 ctf0Var = l2jVar.b;
                ctf0Var.getClass();
                this.L1 = new fiu0(Collections.singletonMap(p5j.class, (yei) new lhf0(cadVar, ctf0Var).d));
                return;
            }
        }
        jf4.n(b1j.i(l2j.class, "Cannot create dependency "));
    }

    public final void G0(int i, fet fetVar) {
        Object ua7Var;
        mm40 mm40Var;
        fetVar.g0(-939765550);
        byte b = 2;
        int i2 = (fetVar.i(this) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            a8z a8zVar = this.M1;
            pz40 pz40VarY = ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar);
            k3t0 k3t0Var = (k3t0) a8zVar.getValue();
            boolean zI = fetVar.i(this);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zI || objP == obj) {
                objP = new e3j(this, b);
                fetVar.o0(objP);
            }
            lkz lkzVar = lkz.f20223a;
            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) objP, fetVar);
            boolean zI2 = fetVar.i(k3t0Var) | fetVar.i(this) | fetVar.e(3) | fetVar.g(pz40VarF);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == obj) {
                mm40Var = null;
                ua7Var = new ua7(k3t0Var, this, pz40VarF, null, (byte) 23);
                fetVar.o0(ua7Var);
            } else {
                ua7Var = objP2;
                mm40Var = null;
            }
            m0x0.t(fetVar, this, (Function2) ua7Var);
            Object obj2 = (k3t0) a8zVar.getValue();
            boolean zI3 = fetVar.i(obj2);
            Object objP3 = fetVar.P();
            if (zI3 || objP3 == obj) {
                Object y6hVar = new y6h(1, obj2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 13);
                fetVar.o0(y6hVar);
                objP3 = y6hVar;
            }
            bsr0.k(0, fetVar, mm40Var, pz40VarY, (Function1) ((jhy) objP3));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g5j(this, i);
        }
    }

    @Override // a.yx5
    public final j9o0 z0() {
        return this.K1;
    }
}
