package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/e11;", "La/yx5;", "<init>", "()V", "a/qek0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class e11 extends yx5 {
    public final s0r K1;
    public fiu0 L1;
    public ynb M1;
    public wdk0 N1;
    public ii O1;
    public final zz2 P1;
    public final zz2 Q1;
    public final zz2 R1;
    public final cgx0 S1;
    public final boolean U1;
    public final a8z V1;
    public static final /* synthetic */ iiy[] X1 = {new j0d0(e11.class, "viewBinding", "getViewBinding()Lorg/xplatform/aggregator/impl/databinding/FragmentAggregatorGiftsBinding;", 0), new ez40(e11.class, "bundleBonusesCount", "getBundleBonusesCount()I", 0), new ez40(e11.class, "bundleFreeSpinsCount", "getBundleFreeSpinsCount()I", 0), new ez40(e11.class, "bundleGiftTypeId", "getBundleGiftTypeId()I", 0), new ez40(e11.class, "bundleAfterAuth", "getBundleAfterAuth()Z", 0)};
    public static final qek0 W1 = new qek0();

    public e11() {
        super(R.layout.fragment_aggregator_gifts);
        this.K1 = ltt0.o(this, d11.f5288a);
        this.P1 = new zz2("BONUSES_COUNT");
        this.Q1 = new zz2("FREE_SPINS_COUNT");
        this.R1 = new zz2("GIFT_TYPE_ID");
        this.S1 = new cgx0("AFTER_AUTH");
        this.U1 = true;
        this.V1 = xbc.b0(this, sre0.f32672a.b(n21.class), new c11(this, (byte) 1));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.K1.n(X1[0], this);
        objN.getClass();
        pkd.h(((sxq) objN).b, new owp0(K()), null, new ugd(524861963, true, new tx(this, (byte) 2)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(f11.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            f11 f11Var = (f11) (ze3Var instanceof f11 ? ze3Var : null);
            if (f11Var != null) {
                iiy[] iiyVarArr = X1;
                this.P1.n(this, iiyVarArr[1]);
                this.Q1.n(this, iiyVarArr[2]);
                int iIntValue = this.R1.n(this, iiyVarArr[3]).intValue();
                this.S1.n(this, iiyVarArr[4]);
                x860 x860Var = new x860(iIntValue, false);
                ehf0 ehf0Var = f11Var.f8742a;
                cad cadVar = f11Var.g;
                oeg0 oeg0Var = f11Var.o;
                btt0 btt0Var = f11Var.b;
                xk0 xk0Var = f11Var.c;
                gii0 gii0Var = f11Var.d;
                r9u r9uVar = f11Var.e;
                gst0 gst0Var = f11Var.f;
                ii iiVar = f11Var.q;
                duj dujVar = f11Var.h;
                m1e m1eVar = f11Var.i;
                s91 s91Var = f11Var.j;
                v88 v88Var = f11Var.l;
                kt2 kt2Var = f11Var.n;
                peg0 peg0Var = f11Var.k;
                wsf0 wsf0Var = f11Var.m;
                ctf0 ctf0Var = f11Var.p;
                s64 s64Var = f11Var.v;
                cmt cmtVar = f11Var.w;
                l7k l7kVar = f11Var.s;
                pru pruVar = f11Var.r;
                wdk0 wdk0Var = f11Var.t;
                dmt dmtVar = f11Var.u;
                x20 x20Var = f11Var.x;
                gg5 gg5Var = f11Var.y;
                bzt bztVar = f11Var.z;
                wsf0 wsf0Var2 = f11Var.A;
                peg0 peg0Var2 = f11Var.B;
                wgu wguVar = f11Var.C;
                ytt yttVar = f11Var.D;
                iiVar.getClass();
                oeg0Var.getClass();
                btt0Var.getClass();
                xk0Var.getClass();
                gii0Var.getClass();
                r9uVar.getClass();
                gst0Var.getClass();
                m1eVar.getClass();
                s91Var.getClass();
                kt2Var.getClass();
                ctf0Var.getClass();
                wdk0Var.getClass();
                wguVar.getClass();
                this.L1 = new fiu0(Collections.singletonMap(n21.class, (f7i) new t7i(cadVar, ehf0Var, peg0Var, wsf0Var, wsf0Var2, peg0Var2, iiVar, oeg0Var, r9uVar, gst0Var, dujVar, x860Var, m1eVar, s91Var, v88Var, kt2Var, ctf0Var, l7kVar, pruVar, wdk0Var, dmtVar, s64Var, cmtVar, x20Var, gg5Var, bztVar, yttVar).y));
                ynb ynbVarI = ((yzn0) peg0Var.b).i();
                x1x.x(ynbVarI);
                this.M1 = ynbVarI;
                this.N1 = wdk0Var;
                this.O1 = iiVar;
                return;
            }
        }
        jf4.n(b1j.i(f11.class, "Cannot create dependency "));
    }

    public final k3t0 G0() {
        return (k3t0) this.V1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        G0().x(p01.f26124a);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        super.i0(view, bundle);
        ccq0.V(this, "REQUEST_REFUSE_BONUS", new c11(this, (byte) 0));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getU1() {
        return this.U1;
    }
}
