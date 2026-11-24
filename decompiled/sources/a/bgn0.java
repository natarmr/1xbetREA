package a;

import android.content.DialogInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetAlertModel;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetStringModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/bgn0;", "La/iw5;", "<init>", "()V", "a/j6m0", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class bgn0 extends iw5 {
    public final khf0 k2 = new khf0("SUCCESS_BET_STRING_MODEL");
    public final khf0 l2 = new khf0("SUCCESS_BET_ALERT_MODEL");
    public final yzn0 m2 = new yzn0("BET_DONE_ICON_STYLE");
    public final yzn0 n2 = new yzn0("BET_DONE_SCREEN_STYLE");
    public final a8z o2 = maz.a(wez.b, new zfn0(this, 0));
    public final a8z p2 = xbc.a0(this, sre0.f32672a.b(sgn0.class), null, new zfn0(this, 1), 14);
    public static final /* synthetic */ iiy[] r2 = {new ez40(bgn0.class, "successBetStringModel", "getSuccessBetStringModel()Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;", 0), new ez40(bgn0.class, "successBetAlertModel", "getSuccessBetAlertModel()Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;", 0), new ez40(bgn0.class, "betDoneIconStyle", "getBetDoneIconStyle()Lorg/xplatform/remoteconfig/domain/models/BetDoneIconStyle;", 0), new ez40(bgn0.class, "betDoneScreenStyle", "getBetDoneScreenStyle()Lorg/xplatform/remoteconfig/domain/models/BetDoneScreenStyle;", 0)};
    public static final j6m0 q2 = new j6m0((byte) 5);
    public static final String s2 = bgn0.class.getName();

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        fetVar.e0(705232624);
        iiy[] iiyVarArr = r2;
        qgn0 qgn0VarO = k9x.O((SuccessBetStringModel) this.k2.n(this, iiyVarArr[0]), (SuccessBetAlertModel) this.l2.n(this, iiyVarArr[1]), (bu6) this.n2.n(this, iiyVarArr[3]), fetVar);
        k3t0 k3t0VarP0 = P0();
        boolean zI = fetVar.i(this);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (zI || objP == obj) {
            objP = new j1l0(this, (byte) 24);
            fetVar.o0(objP);
        }
        clz clzVar = (clz) fetVar.k(or00.f25714a);
        lkz lkzVar = lkz.f20223a;
        pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) objP, fetVar);
        boolean zI2 = fetVar.i(k3t0VarP0) | fetVar.i(clzVar) | fetVar.e(3) | fetVar.g(pz40VarF);
        Object objP2 = fetVar.P();
        if (zI2 || objP2 == obj) {
            Object kc70Var = new kc70(k3t0VarP0, clzVar, pz40VarF, null, (byte) 19);
            fetVar.o0(kc70Var);
            objP2 = kc70Var;
        }
        m0x0.t(fetVar, clzVar, (Function2) objP2);
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), (xdr) null, (ugd) null, u1c.M(-496604769, new nhl0(this, qgn0VarO, (byte) 12), fetVar), 14);
        fetVar.r(false);
        return bw5Var;
    }

    public final k3t0 P0() {
        return (k3t0) this.p2.getValue();
    }

    @Override // a.sik, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        P0().x(pfn0.f26914a);
    }
}
