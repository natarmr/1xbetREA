package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/ylr0;", "La/iw5;", "<init>", "()V", "a/yum0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ylr0 extends iw5 {
    public static final /* synthetic */ int m2 = 0;
    public fiu0 k2;
    public final a8z l2 = xbc.b0(this, sre0.f32672a.b(dmr0.class), new qir0(this, 1));

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        fetVar.e0(1460130249);
        pz40 pz40VarY = ((i3t0) ((k3t0) this.l2.getValue())).y(fetVar);
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), u1c.M(-1222681800, new qjr0(pz40VarY, (byte) 1), fetVar), (ugd) null, u1c.M(1883492922, new nhl0(pz40VarY, this, (byte) 26), fetVar), 10);
        fetVar.r(false);
        return bw5Var;
    }

    public final void P0(int i) {
        if (R()) {
            return;
        }
        vcc.f0(i120.V(new Pair("TotoBetTypeBottomSheetKey", Integer.valueOf(i))), this, "TotoBetTypeBottomSheetKey");
        y0();
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(vlr0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            vlr0 vlr0Var = (vlr0) (ze3Var instanceof vlr0 ? ze3Var : null);
            if (vlr0Var != null) {
                this.k2 = vlr0Var.a().I();
                super.W(bundle);
                return;
            }
        }
        jf4.n(b1j.i(vlr0.class, "Cannot create dependency "));
    }
}
