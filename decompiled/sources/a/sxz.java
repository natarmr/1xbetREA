package a;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/sxz;", "La/iw5;", "<init>", "()V", "a/xuz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class sxz extends iw5 {
    public final a8z k2 = maz.a(wez.b, new rxz(this, (byte) 0));
    public final a8z l2 = xbc.a0(this, sre0.f32672a.b(yxz.class), null, new rxz(this, (byte) 1), 14);
    public final yzn0 m2;
    public final phf0 n2;
    public static final /* synthetic */ iiy[] p2 = {new ez40(sxz.class, "params", "getParams()Lorg/xplatform/limits_kenya/impl/presentation/limits_main_screen/models/LimitsKenyaBottomSheetScreenParams;", 0), new ez40(sxz.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0)};
    public static final xuz o2 = new xuz();
    public static final String q2 = sxz.class.getName();

    public sxz() {
        String str = q2;
        str.getClass();
        this.m2 = new yzn0(str);
        this.n2 = new phf0("REQUEST_KEY");
    }

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        sxz sxzVar;
        fetVar.e0(-67099380);
        a8z a8zVar = this.l2;
        xxz xxzVar = (xxz) ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar).getValue();
        k3t0 k3t0Var = (k3t0) a8zVar.getValue();
        boolean zI = fetVar.i(this);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (zI || objP == obj) {
            sxzVar = this;
            Object svzVar = new svz(1, sxzVar, sxz.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/limits_kenya/impl/presentation/limits_main_screen/models/bottom_sheet/LimitsKenyaBottomSheetSideEffect;)V", 0, (byte) 2);
            fetVar.o0(svzVar);
            objP = svzVar;
        } else {
            sxzVar = this;
        }
        lkz lkzVar = lkz.f20223a;
        pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
        byte b = 3;
        boolean zI2 = fetVar.i(k3t0Var) | fetVar.i(sxzVar) | fetVar.e(3) | fetVar.g(pz40VarF);
        Object objP2 = fetVar.P();
        if (zI2 || objP2 == obj) {
            objP2 = new khx(k3t0Var, sxzVar, pz40VarF, (yje) null);
            fetVar.o0(objP2);
        }
        m0x0.t(fetVar, sxzVar, (Function2) objP2);
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), u1c.M(1213435259, new p0z(xxzVar, (byte) 2), fetVar), (ugd) null, u1c.M(1989682813, new ngz(xxzVar, sxzVar, b), fetVar), 10);
        fetVar.r(false);
        return bw5Var;
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void V(Context context) {
        super.V(context);
        ((rji) this.k2.getValue()).getClass();
    }
}
