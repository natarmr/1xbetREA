package a;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.results.impl.presentation.dialogs.results.params.SelectDateScreenParams;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"La/x1i0;", "La/iw5;", "<init>", "()V", "a/zie0", "La/k2i0;", "uiState", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class x1i0 extends iw5 {
    public final khf0 k2 = new khf0("SELECT_DATE_TIME_SCREEN_PARAMS");
    public final n0o0 l2 = maz.b(new w1i0(this, 0));
    public final a8z m2 = xbc.a0(this, sre0.f32672a.b(f4i0.class), null, new w1i0(this, 1), 14);
    public static final /* synthetic */ iiy[] o2 = {new ez40(x1i0.class, "params", "getParams()Lorg/xplatform/results/impl/presentation/dialogs/results/params/SelectDateScreenParams;", 0)};
    public static final zie0 n2 = new zie0();

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        fetVar.e0(1215949454);
        L0().K = true;
        L0().N(3);
        k3t0 k3t0VarQ0 = Q0();
        boolean zI = fetVar.i(this);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (zI || objP == obj) {
            Object nxh0Var = new nxh0(1, this, x1i0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/results/impl/presentation/dialogs/results/models/SelectDateSideEffect;)V", 0, (byte) 18);
            fetVar.o0(nxh0Var);
            objP = nxh0Var;
        }
        lkz lkzVar = lkz.f20223a;
        pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
        boolean zI2 = fetVar.i(k3t0VarQ0) | fetVar.i(this) | fetVar.e(3) | fetVar.g(pz40VarF);
        Object objP2 = fetVar.P();
        if (zI2 || objP2 == obj) {
            objP2 = new qkb0(k3t0VarQ0, this, pz40VarF, (yje) null);
            fetVar.o0(objP2);
        }
        m0x0.t(fetVar, this, (Function2) objP2);
        pz40 pz40VarY = ((i3t0) Q0()).y(fetVar);
        hdj hdjVarB0 = tlb.b0(((k2i0) pz40VarY.getValue()).f17574a, ((k2i0) pz40VarY.getValue()).b, ((k2i0) pz40VarY.getValue()).c, fetVar);
        nul nulVar = nul.e;
        oe9 oe9Var = oe9.f25112a;
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), b34.o, u1c.M(-1075141065, new v1i0(new wul(nulVar, oe9Var, new ue9(rsm0.w(R.string.calendar_date_module_cancel, 0, fetVar)), true, false, false), new wul(lul.e, oe9Var, new ue9(rsm0.w(R.string.calendar_date_module_apply, 0, fetVar)), ((k2i0) pz40VarY.getValue()).e, false, false), this, hdjVarB0, (byte) 0), fetVar), u1c.M(346584125, new in80(hdjVarB0, this, (byte) 22), fetVar), 2);
        fetVar.r(false);
        return bw5Var;
    }

    public final SelectDateScreenParams P0() {
        return (SelectDateScreenParams) this.k2.n(this, o2[0]);
    }

    public final k3t0 Q0() {
        return (k3t0) this.m2.getValue();
    }
}
