package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/iwa0;", "La/iw5;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class iwa0 extends iw5 {
    public static final /* synthetic */ int m2 = 0;
    public fiu0 k2;
    public final a8z l2 = xbc.b0(this, sre0.f32672a.b(uwa0.class), new hwa0(this, (byte) 0));

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        iwa0 iwa0Var;
        fetVar.e0(-165375028);
        a8z a8zVar = this.l2;
        k3t0 k3t0Var = (k3t0) a8zVar.getValue();
        boolean zI = fetVar.i(this);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (zI || objP == obj) {
            iwa0Var = this;
            Object wma0Var = new wma0(1, iwa0Var, iwa0.class, "collectSideEffect", "collectSideEffect(Lorg/xplatform/messages/presentation/popupBonus/models/PopUpBonusSideEffect;)V", 0, (byte) 5);
            fetVar.o0(wma0Var);
            objP = wma0Var;
        } else {
            iwa0Var = this;
        }
        lkz lkzVar = lkz.f20223a;
        pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
        boolean zI2 = fetVar.i(k3t0Var) | fetVar.i(iwa0Var) | fetVar.e(3) | fetVar.g(pz40VarF);
        Object objP2 = fetVar.P();
        if (zI2 || objP2 == obj) {
            objP2 = new khx(k3t0Var, iwa0Var, pz40VarF, (yje) null);
            fetVar.o0(objP2);
        }
        m0x0.t(fetVar, iwa0Var, (Function2) objP2);
        pz40 pz40VarY = ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar);
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), u1c.M(-293767109, new tft(pz40VarY, (byte) 11), fetVar), u1c.M(-1484298749, new in80(pz40VarY, iwa0Var, (byte) 4), fetVar), u1c.M(-170485443, new tft(pz40VarY, (byte) 12), fetVar), 2);
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
            o5d0 o5d0Var = (o5d0) af3Var.d().get(gwa0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            gwa0 gwa0Var = (gwa0) (ze3Var instanceof gwa0 ? ze3Var : null);
            if (gwa0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                cad cadVar = gwa0Var.f12017a;
                h840 h840Var = gwa0Var.b;
                knf0 knf0Var = gwa0Var.c;
                btt0 btt0Var = gwa0Var.d;
                gii0 gii0Var = gwa0Var.e;
                ctf0 ctf0Var = gwa0Var.f;
                ntu ntuVar = gwa0Var.g;
                peg0 peg0Var = gwa0Var.h;
                oeg0 oeg0Var = gwa0Var.i;
                duj dujVar = gwa0Var.j;
                h840Var.getClass();
                knf0Var.getClass();
                btt0Var.getClass();
                gii0Var.getClass();
                ctf0Var.getClass();
                oeg0Var.getClass();
                this.k2 = new fiu0(Collections.singletonMap(uwa0.class, (eni) new daf(cadVar, i1w0VarF, h840Var, knf0Var, btt0Var, gii0Var, ctf0Var, ntuVar, peg0Var, oeg0Var, dujVar).m));
                return;
            }
        }
        jf4.n(b1j.i(gwa0.class, "Cannot create dependency "));
    }
}
