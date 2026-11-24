package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/vzv;", "La/iw5;", "<init>", "()V", "a/sqt", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class vzv extends iw5 {
    public fiu0 k2;
    public final a8z l2 = xbc.b0(this, sre0.f32672a.b(l0w.class), new bdv(this, 13));
    public final yzn0 m2 = new yzn0("HISTORY_TYPE_KEY");
    public final yzn0 n2 = new yzn0("HISTORY_TYPE_MODEL_KEY");
    public final phf0 o2 = new phf0("HISTORY_STATUS_FILTER_REQUEST_KEY");
    public static final /* synthetic */ iiy[] q2 = {new ez40(vzv.class, "historyTypeScreen", "getHistoryTypeScreen()Lorg/xplatform/bet_history/domain/model/HistoryTypeScreen;", 0), new ez40(vzv.class, "historyTypeModel", "getHistoryTypeModel()Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;", 0), new ez40(vzv.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0)};
    public static final sqt p2 = new sqt();

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        vzv vzvVar;
        fetVar.e0(1241712579);
        k3t0 k3t0VarP0 = P0();
        boolean zI = fetVar.i(this);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (zI || objP == obj) {
            vzvVar = this;
            Object vftVar = new vft(1, vzvVar, vzv.class, "handleSideEffects", "handleSideEffects(Lorg/xplatform/bet_history/history/presentation/dialog/history_coupon_status/model/HistoryCouponStatusDialogSideEffect;)V", 0, (byte) 19);
            fetVar.o0(vftVar);
            objP = vftVar;
        } else {
            vzvVar = this;
        }
        lkz lkzVar = lkz.f20223a;
        pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
        boolean zI2 = fetVar.i(k3t0VarP0) | fetVar.i(vzvVar) | fetVar.e(3) | fetVar.g(pz40VarF);
        Object objP2 = fetVar.P();
        if (zI2 || objP2 == obj) {
            objP2 = new g6g(k3t0VarP0, vzvVar, pz40VarF, (yje) null);
            fetVar.o0(objP2);
        }
        m0x0.t(fetVar, vzvVar, (Function2) objP2);
        pz40 pz40VarY = ((i3t0) vzvVar.P0()).y(fetVar);
        int i = tzv.f34822a[((HistoryTypeModel) vzvVar.n2.n(vzvVar, q2[1])).ordinal()] == 1 ? R.string.filters : R.string.bet_filter_new;
        vzvVar.L0().K = true;
        vzvVar.L0().N(3);
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), u1c.M(2108806004, new cl2(i, (byte) 5), fetVar), (ugd) null, u1c.M(1873532466, new rgh(pz40VarY, vzvVar, (byte) 24), fetVar), 10);
        fetVar.r(false);
        return bw5Var;
    }

    public final k3t0 P0() {
        return (k3t0) this.l2.getValue();
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void V(Context context) {
        super.V(context);
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(k1w.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            k1w k1wVar = (k1w) (ze3Var instanceof k1w ? ze3Var : null);
            if (k1wVar != null) {
                iiy[] iiyVarArr = q2;
                f8w f8wVar = (f8w) this.m2.n(this, iiyVarArr[0]);
                HistoryTypeModel historyTypeModel = (HistoryTypeModel) this.n2.n(this, iiyVarArr[1]);
                cad cadVar = k1wVar.b;
                ctf0 ctf0Var = k1wVar.f17549a;
                j77 j77Var = k1wVar.d;
                pru pruVar = k1wVar.c;
                ctf0Var.getClass();
                j77Var.getClass();
                ywq0 ywq0Var = new ywq0();
                ywq0Var.f43384a = historyTypeModel;
                ywq0Var.b = f8wVar;
                ywq0Var.c = cadVar;
                ywq0Var.d = pruVar;
                ywq0Var.e = ctf0Var;
                ywq0Var.f = j77Var;
                ywq0Var.g = new ugi(ywq0Var, (byte) 29);
                this.k2 = new fiu0(Collections.singletonMap(l0w.class, (ugi) ywq0Var.g));
                return;
            }
        }
        jf4.n(b1j.i(k1w.class, "Cannot create dependency "));
    }
}
