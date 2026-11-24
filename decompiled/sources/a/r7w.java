package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/r7w;", "La/iw5;", "<init>", "()V", "a/bst", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class r7w extends iw5 {
    public fiu0 k2;
    public final yzn0 l2 = new yzn0("BALANCE_MODEL_KEY");
    public final yzn0 m2 = new yzn0("HISTORY_TYPE_KEY");
    public final yzn0 n2 = new yzn0("HISTORY_TYPE_MODEL_KEY");
    public final phf0 o2 = new phf0("HISTORY_TYPE_REQUEST_KEY");
    public final a8z p2 = xbc.b0(this, sre0.f32672a.b(k8w.class), new bdv(this, 15));
    public static final /* synthetic */ iiy[] r2 = {new ez40(r7w.class, "balanceModel", "getBalanceModel()Lorg/xplatform/balance/model/BalanceModel;", 0), new ez40(r7w.class, "historyTypeScreen", "getHistoryTypeScreen()Lorg/xplatform/bet_history/domain/model/HistoryTypeScreen;", 0), new ez40(r7w.class, "historyTypeModel", "getHistoryTypeModel()Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;", 0), new ez40(r7w.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0)};
    public static final bst q2 = new bst();

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        r7w r7wVar;
        fetVar.e0(-104686814);
        a8z a8zVar = this.p2;
        k3t0 k3t0Var = (k3t0) a8zVar.getValue();
        boolean zI = fetVar.i(this);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (zI || objP == obj) {
            r7wVar = this;
            Object n5wVar = new n5w(1, r7wVar, r7w.class, "handleSideEffects", "handleSideEffects(Lorg/xplatform/bet_history/history/presentation/dialog/history_type/model/HistoryTypeBottomSheetDialogSideEffect;)V", 0, (byte) 7);
            fetVar.o0(n5wVar);
            objP = n5wVar;
        } else {
            r7wVar = this;
        }
        lkz lkzVar = lkz.f20223a;
        pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
        boolean zI2 = fetVar.i(k3t0Var) | fetVar.i(r7wVar) | fetVar.e(3) | fetVar.g(pz40VarF);
        Object objP2 = fetVar.P();
        if (zI2 || objP2 == obj) {
            objP2 = new g6g(k3t0Var, r7wVar, pz40VarF, (yje) null);
            fetVar.o0(objP2);
        }
        m0x0.t(fetVar, r7wVar, (Function2) objP2);
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), ffb0.b, (ugd) null, u1c.M(-2652717, new rgh(((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar), r7wVar, (byte) 25), fetVar), 10);
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
            o5d0 o5d0Var = (o5d0) af3Var.d().get(d8w.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            d8w d8wVar = (d8w) (ze3Var instanceof d8w ? ze3Var : null);
            if (d8wVar != null) {
                iiy[] iiyVarArr = r2;
                ql5 ql5Var = (ql5) this.l2.n(this, iiyVarArr[0]);
                f8w f8wVar = (f8w) this.m2.n(this, iiyVarArr[1]);
                HistoryTypeModel historyTypeModel = (HistoryTypeModel) this.n2.n(this, iiyVarArr[2]);
                cad cadVar = d8wVar.b;
                ctf0 ctf0Var = d8wVar.f5671a;
                pru pruVar = d8wVar.c;
                kt2 kt2Var = d8wVar.d;
                ctf0Var.getClass();
                kt2Var.getClass();
                this.k2 = new fiu0(Collections.singletonMap(k8w.class, (tii) new qgd(cadVar, ql5Var, f8wVar, historyTypeModel, ctf0Var, pruVar).h));
                return;
            }
        }
        jf4.n(b1j.i(d8w.class, "Cannot create dependency "));
    }
}
