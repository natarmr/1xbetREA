package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.TextView;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/u3v0;", "La/yx5;", "<init>", "()V", "a/kys0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class u3v0 extends yx5 {
    public lzi K1;
    public final kiu0 L1;
    public final s0r M1;
    public final zz2 N1;
    public final phf0 O1;
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(u3v0.class, "binding", "getBinding()Lorg/xplatform/web_rules/impl/databinding/WebRulesFragmentBinding;", 0), new ez40(u3v0.class, "titleResId", "getTitleResId()I", 0), new ez40(u3v0.class, "endPoint", "getEndPoint()Ljava/lang/String;", 0)};
    public static final kys0 P1 = new kys0((byte) 12);

    public u3v0() {
        super(R.layout.web_rules_fragment);
        rbt0 rbt0Var = new rbt0(this, (byte) 22);
        a8z a8zVarA = maz.a(wez.b, new cvs0(new cvs0(this, (byte) 25), (byte) 26));
        this.L1 = agc.G(this, sre0.f32672a.b(c4v0.class), new w6u0(a8zVarA, (byte) 18), new w6u0(a8zVarA, (byte) 19), rbt0Var);
        this.M1 = ltt0.o(this, s3v0.f31577a);
        this.N1 = new zz2("TITLE_RES", 0);
        this.O1 = new phf0("END_POINT", "");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        siq fixedWebView = G0().f.getFixedWebView();
        yje yjeVar = null;
        if (fixedWebView != null) {
            fixedWebView.getSettings().setJavaScriptEnabled(true);
            fixedWebView.getSettings().setDomStorageEnabled(true);
            fixedWebView.getSettings().setLoadWithOverviewMode(true);
            fixedWebView.getSettings().setUseWideViewPort(true);
            fixedWebView.getSettings().setAllowFileAccess(true);
            fixedWebView.setLayerType(2, null);
        }
        siq fixedWebView2 = G0().f.getFixedWebView();
        if (fixedWebView2 != null) {
            fixedWebView2.setFixedWebViewClient(new t3v0(this));
        }
        siq fixedWebView3 = G0().f.getFixedWebView();
        if (fixedWebView3 != null) {
            fixedWebView3.setWebChromeClient(new mzo(this, (byte) 4));
        }
        TextView textView = G0().d;
        Context contextO0 = o0();
        iiy[] iiyVarArr = Q1;
        textView.setText(contextO0.getString(this.N1.n(this, iiyVarArr[1]).intValue()));
        G0().c.setNavigationIcon(R.drawable.ic_arrow_back);
        G0().c.setNavigationOnClickListener(new jpe0(this, (byte) 19));
        Drawable navigationIcon = G0().c.getNavigationIcon();
        Context context = G0().c.getContext();
        context.getClass();
        sj3.B0(navigationIcon, context, R.attr.uikitSecondary);
        G0().e.setVisibility(0);
        c4v0 c4v0VarH0 = H0();
        String strN = this.O1.n(this, iiyVarArr[2]);
        strN.getClass();
        c4v0VarH0.i = strN;
        sac.V(jiu0.a(c4v0VarH0), new x3v0(c4v0VarH0, (byte) 1), null, null, new n7t0(c4v0VarH0, yjeVar, (byte) 13), 14);
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(w3v0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            w3v0 w3v0Var = (w3v0) (ze3Var instanceof w3v0 ? ze3Var : null);
            if (w3v0Var != null) {
                gii0 gii0Var = w3v0Var.f38517a;
                fsd fsdVar = w3v0Var.b;
                j1q0 j1q0Var = w3v0Var.c;
                sa10 sa10Var = w3v0Var.d;
                mne mneVar = w3v0Var.e;
                a6u a6uVar = w3v0Var.f;
                duj dujVar = w3v0Var.g;
                gii0Var.getClass();
                fsdVar.getClass();
                j1q0Var.getClass();
                this.K1 = (lzi) ((n5d0) new uii(j1q0Var, sa10Var, mneVar, a6uVar, dujVar).f).get();
                return;
            }
        }
        jf4.n(b1j.i(w3v0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        xae0 xae0VarN = vtb.N(H0().g);
        rtq0 rtq0Var = new rtq0(this, null, (byte) 27);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new npu0(xae0VarN, clzVarW, rtq0Var, (yje) null), 3);
        ol60 ol60Var = H0().h;
        k5r0 k5r0Var = new k5r0(2, this, u3v0.class, "handleViewAction", "handleViewAction(Lorg/xplatform/web_rules/impl/presentation/WebRulesViewModel$ViewAction;)V", 4, (byte) 21);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new npu0(ol60Var, clzVarW2, k5r0Var, (yje) null, 0), 3);
    }

    public final v3v0 G0() {
        Object objN = this.M1.n(Q1[0], this);
        objN.getClass();
        return (v3v0) objN;
    }

    public final c4v0 H0() {
        return (c4v0) this.L1.getValue();
    }
}
