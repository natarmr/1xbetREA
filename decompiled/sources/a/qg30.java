package a;

import android.content.Context;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/qg30;", "La/iw5;", "<init>", "()V", "a/evz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class qg30 extends iw5 {
    public fiu0 k2;
    public final a8z l2 = xbc.b0(this, sre0.f32672a.b(rg30.class), new rx00(this, (byte) 27));
    public final phf0 m2 = new phf0("EXTRA_REQUEST_KEY");
    public final phf0 n2 = new phf0("PLAYER_ID_BUNDLE_KEY");
    public static final /* synthetic */ iiy[] p2 = {new ez40(qg30.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0), new ez40(qg30.class, "playerId", "getPlayerId()Ljava/lang/String;", 0)};
    public static final evz o2 = new evz();

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        fetVar.e0(-905243322);
        a8z a8zVar = this.l2;
        k3t0 k3t0Var = (k3t0) a8zVar.getValue();
        boolean zI = fetVar.i(this);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (zI || objP == obj) {
            Object du20Var = new du20(1, this, qg30.class, "handleSideEffects", "handleSideEffects(Lorg/xplatform/statistic/tennis/impl/wins_and_losses/presentation/actual/match_types/MatchTypesSideEffect;)V", 0, (byte) 26);
            fetVar.o0(du20Var);
            objP = du20Var;
        }
        lkz lkzVar = lkz.f20223a;
        pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
        boolean zI2 = fetVar.i(k3t0Var) | fetVar.i(this) | fetVar.e(3) | fetVar.g(pz40VarF);
        Object objP2 = fetVar.P();
        if (zI2 || objP2 == obj) {
            objP2 = new khx(k3t0Var, this, pz40VarF, (yje) null);
            fetVar.o0(objP2);
        }
        m0x0.t(fetVar, this, (Function2) objP2);
        bw5 bw5Var = new bw5(cw5.a(iw5.O0(1, fetVar), false, true, false, null, 0L, 59), q8a.d, (ugd) null, u1c.M(-665902347, new ngz(((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar), this, (byte) 18), fetVar), 10);
        fetVar.r(false);
        return bw5Var;
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void V(Context context) {
        super.V(context);
        LinkedHashMap linkedHashMap = d0q0.f5279a;
        iiy[] iiyVarArr = p2;
        iiy iiyVar = iiyVarArr[1];
        phf0 phf0Var = this.n2;
        this.k2 = d0q0.b(d0q0.a(phf0Var.n(this, iiyVar), efx.v(this)), this, phf0Var.n(this, iiyVarArr[1]), a4n0.f(this)).a();
    }
}
