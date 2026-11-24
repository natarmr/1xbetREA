package a;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.feed.linelive.presentation.dialogs.select_date_time.params.SelectTimeRangeScreenParams;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"La/y3i0;", "La/iw5;", "<init>", "()V", "a/lme0", "La/d4i0;", "uiState", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class y3i0 extends iw5 {
    public final khf0 k2 = new khf0("SELECT_DATE_TIME_SCREEN_PARAMS");
    public final n0o0 l2 = maz.b(new w3i0(this, 0));
    public final a8z m2 = xbc.a0(this, sre0.f32672a.b(g4i0.class), null, new w3i0(this, 1), 14);
    public static final /* synthetic */ iiy[] o2 = {new ez40(y3i0.class, "params", "getParams()Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectTimeRangeScreenParams;", 0)};
    public static final lme0 n2 = new lme0((byte) 17);

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        fetVar.e0(780366315);
        L0().K = true;
        L0().N(3);
        a8z a8zVar = this.m2;
        k3t0 k3t0Var = (k3t0) a8zVar.getValue();
        boolean zI = fetVar.i(this);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (zI || objP == obj) {
            Object nxh0Var = new nxh0(1, this, y3i0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/models/SelectTimeRangeSideEffect;)V", 0, (byte) 21);
            fetVar.o0(nxh0Var);
            objP = nxh0Var;
        }
        lkz lkzVar = lkz.f20223a;
        pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
        boolean zI2 = fetVar.i(k3t0Var) | fetVar.i(this) | fetVar.e(3) | fetVar.g(pz40VarF);
        Object objP2 = fetVar.P();
        if (zI2 || objP2 == obj) {
            objP2 = new qkb0(k3t0Var, (y3i0) this, pz40VarF, (yje) null);
            fetVar.o0(objP2);
        }
        m0x0.t(fetVar, this, (Function2) objP2);
        pz40 pz40VarY = ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar);
        ((d4i0) pz40VarY.getValue()).getClass();
        yg40 yg40Var = yg40.FIVE;
        gfj gfjVarD0 = rsr0.d0(((d4i0) pz40VarY.getValue()).f5457a, ((d4i0) pz40VarY.getValue()).c, ((d4i0) pz40VarY.getValue()).d, ((d4i0) pz40VarY.getValue()).e, ((d4i0) pz40VarY.getValue()).b, null, yg40Var, fetVar, 2101832, 176);
        nul nulVar = nul.e;
        oe9 oe9Var = oe9.f25112a;
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), hp4.i, u1c.M(-1706901740, new v1i0(new wul(nulVar, oe9Var, new ue9(rsm0.w(R.string.calendar_date_module_cancel, 0, fetVar)), true, false, false), new wul(lul.e, oe9Var, new ue9(rsm0.w(R.string.calendar_date_module_apply, 0, fetVar)), true, false, false), this, gfjVarD0, (byte) 1), fetVar), u1c.M(-1885123046, new rqc0(gfjVarD0, (byte) 9), fetVar), 2);
        fetVar.r(false);
        return bw5Var;
    }

    public final SelectTimeRangeScreenParams P0() {
        return (SelectTimeRangeScreenParams) this.k2.n(this, o2[0]);
    }
}
