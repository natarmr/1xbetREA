package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import kotlin.Metadata;
import kotlin.Pair;
import org.xbet.client1.R;
import org.xplatform.bet_history.sale.presentation.model.SaleScreenModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/avg0;", "La/yx5;", "<init>", "()V", "a/cge0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class avg0 extends yx5 {
    public osi K1;
    public wdk0 L1;
    public final khf0 M1;
    public final s0r N1;
    public final a8z O1;
    public static final /* synthetic */ iiy[] Q1 = {new ez40(avg0.class, "saleScreenModel", "getSaleScreenModel()Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;", 0), new j0d0(avg0.class, "viewBinding", "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final cge0 P1 = new cge0((byte) 12);

    public avg0() {
        super(R.layout.compose_fragment);
        this.M1 = new khf0("BUNDLE_SALE_SCREEN");
        this.N1 = ltt0.o(this, yug0.f43267a);
        this.O1 = xbc.a0(this, sre0.f32672a.b(dxg0.class), null, new tug0(this, (byte) 0), 14);
    }

    public final SaleScreenModel G0() {
        return (SaleScreenModel) this.M1.n(this, Q1[0]);
    }

    public final k3t0 H0() {
        return (k3t0) this.O1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void V(Context context) {
        super.V(context);
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(fug0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            fug0 fug0Var = (fug0) (ze3Var instanceof fug0 ? ze3Var : null);
            if (fug0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                SaleScreenModel saleScreenModelG0 = G0();
                i1w0VarF.getClass();
                cad cadVar = fug0Var.f10161a;
                ctf0 ctf0Var = fug0Var.b;
                ocl oclVar = fug0Var.c;
                pru pruVar = fug0Var.d;
                r9u r9uVar = fug0Var.e;
                b8u b8uVar = fug0Var.f;
                fme fmeVar = fug0Var.t;
                edo edoVar = fug0Var.g;
                gst0 gst0Var = fug0Var.i;
                duj dujVar = fug0Var.m;
                m1e m1eVar = fug0Var.h;
                ii iiVar = fug0Var.n;
                wdk0 wdk0Var = fug0Var.o;
                au0 au0Var = fug0Var.l;
                kt2 kt2Var = fug0Var.k;
                kuy kuyVar = fug0Var.s;
                btt0 btt0Var = fug0Var.q;
                knf0 knf0Var = fug0Var.r;
                gii0 gii0Var = fug0Var.p;
                fsd fsdVar = fug0Var.j;
                ugf0 ugf0Var = fug0Var.u;
                wsf0 wsf0Var = fug0Var.v;
                ctf0Var.getClass();
                kt2Var.getClass();
                kuyVar.getClass();
                m1eVar.getClass();
                knf0Var.getClass();
                btt0Var.getClass();
                iiVar.getClass();
                wdk0Var.getClass();
                gii0Var.getClass();
                gst0Var.getClass();
                fsdVar.getClass();
                r9uVar.getClass();
                fmeVar.getClass();
                edoVar.getClass();
                this.K1 = (osi) ((n5d0) new v5i(cadVar, ugf0Var, wsf0Var, saleScreenModelG0, ctf0Var, kt2Var, kuyVar, m1eVar, i1w0VarF, knf0Var, dujVar, btt0Var, au0Var, iiVar, wdk0Var, gii0Var, gst0Var, oclVar, pruVar, b8uVar, fmeVar, edoVar).v).get();
                this.L1 = wdk0Var;
                return;
            }
        }
        jf4.n(b1j.i(fug0.class, "Cannot create dependency "));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        if (G0().d) {
            vcc.f0(i120.V(new Pair("BUNDLE_BET_ID", G0().f46405a)), this, "REQUEST_BET_UPDATE_BY_ID");
        }
        super.Z();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        C().u0("REQUEST_CONFIRM_SALE_DIALOG_KEY", this, new ex60(this, (byte) 21));
        qcc.X(this, new tug0(this, (byte) 1));
        Object objN = this.N1.n(Q1[1], this);
        objN.getClass();
        h97.t(((aid) objN).f919a, new owp0(this), new ugd(1783857281, true, new iob0((Object) this, (byte) 7)));
    }
}
