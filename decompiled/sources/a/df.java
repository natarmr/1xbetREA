package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/df;", "La/yx5;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class df extends yx5 {
    public static final /* synthetic */ iiy[] N1 = {new j0d0(df.class, "binding", "getBinding()Lorg/xplatform/feature/balancemanagement/impl/databinding/FragmentAccountNumberBinding;", 0)};
    public u5i K1;
    public final kiu0 L1;
    public final s0r M1;

    public df() {
        super(R.layout.fragment_account_number);
        af afVar = new af(this, (byte) 1);
        a8z a8zVarA = maz.a(wez.b, new o5(new o5(this, (byte) 17), (byte) 18));
        this.L1 = agc.G(this, sre0.f32672a.b(uf.class), new k8(a8zVarA, (byte) 10), new k8(a8zVarA, (byte) 11), afVar);
        this.M1 = ltt0.o(this, bf.f2477a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        G0().c.b(new af(this, (byte) 0));
        siq fixedWebView = G0().e.getFixedWebView();
        if (fixedWebView != null) {
            fixedWebView.getSettings().setDomStorageEnabled(true);
            fixedWebView.getSettings().setJavaScriptEnabled(true);
            fixedWebView.getSettings().setLoadWithOverviewMode(true);
            fixedWebView.getSettings().setUseWideViewPort(true);
            fixedWebView.getSettings().setAllowFileAccess(true);
            fixedWebView.setFixedWebViewClient(new cf());
        }
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(ef.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            ef efVar = (ef) (ze3Var instanceof ef ? ze3Var : null);
            if (efVar != null) {
                btt0 btt0Var = efVar.f7699a;
                gii0 gii0Var = efVar.b;
                m1e m1eVar = efVar.c;
                gst gstVar = efVar.d;
                sa10 sa10Var = efVar.e;
                btt0Var.getClass();
                gii0Var.getClass();
                m1eVar.getClass();
                gr00 gr00Var = new gr00();
                gr00Var.f11760a = btt0Var;
                gr00Var.b = gii0Var;
                gr00Var.c = gstVar;
                gr00Var.d = sa10Var;
                gr00Var.e = n0k0.a(new t5i(gr00Var, (byte) 1));
                this.K1 = (u5i) ((n5d0) gr00Var.e).get();
                return;
            }
        }
        jf4.n(b1j.i(ef.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        kiu0 kiu0Var = this.L1;
        uf ufVar = (uf) kiu0Var.getValue();
        sac.V(jiu0.a(ufVar), new t1(ufVar, (byte) 7), null, null, new l1(ufVar, null, (byte) 4), 14);
        xae0 xae0VarN = vtb.N(((uf) kiu0Var.getValue()).e);
        qa qaVar = new qa(this, null, (byte) 2);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new m1(xae0VarN, clzVarW, qaVar, (yje) null), 3);
    }

    public final hxq G0() {
        Object objN = this.M1.n(N1[0], this);
        objN.getClass();
        return (hxq) objN;
    }
}
