package a;

import android.content.ComponentCallbacks2;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.rules.impl.presentation.models.PaymentInfoParams;
import org.xplatform.ui_core.viewcomponents.webview.FixedWebView;
import org.xplatform.uikit.components.lottie.LottieView;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/lmg0;", "La/yx5;", "<init>", "()V", "a/eke0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class lmg0 extends yx5 {
    public final hnm0 K1;
    public fiu0 L1;
    public z7z M1;
    public wdk0 N1;
    public final kiu0 O1;
    public final s0r P1;
    public final zz2 Q1;
    public final phf0 R1;
    public final zz2 S1;
    public final cgx0 U1;
    public boolean V1;
    public boolean W1;
    public final n0o0 X1;
    public static final /* synthetic */ iiy[] Z1 = {new j0d0(lmg0.class, "binding", "getBinding()Lorg/xplatform/ui_core/databinding/FragmentWebBrowserBinding;", 0), new ez40(lmg0.class, "titleRes", "getTitleRes()I", 0), new ez40(lmg0.class, RemoteMessageConst.Notification.URL, "getUrl()Ljava/lang/String;", 0), new ez40(lmg0.class, "projectId", "getProjectId()I", 0), new ez40(lmg0.class, "showReload", "getShowReload()Z", 0)};
    public static final eke0 Y1 = new eke0();

    public lmg0() {
        super(R.layout.fragment_web_browser);
        this.K1 = hnm0.f13359a;
        hmg0 hmg0Var = new hmg0(this, (byte) 2);
        a8z a8zVarA = maz.a(wez.b, new yxf0(new yxf0(this, (byte) 7), (byte) 8));
        this.O1 = agc.G(this, sre0.f32672a.b(umg0.class), new fxf0(a8zVarA, (byte) 10), new fxf0(a8zVarA, (byte) 11), hmg0Var);
        this.P1 = ltt0.o(this, img0.f15025a);
        this.Q1 = new zz2("EXTRA_TITLE_RES", 0);
        this.R1 = new phf0("EXTRA_URL", "");
        this.S1 = new zz2("EXTRA_PROJECT_ID", 0);
        this.U1 = new cgx0("EXTRA_SHOW_RELOAD", false);
        this.X1 = maz.b(new hmg0(this, (byte) 3));
    }

    public static String H0(String str) {
        return (kotlin.text.c.x(str, "http", false) || kotlin.text.c.x(str, "mailto", false) || kotlin.text.c.x(str, "tel", false)) ? str : "http://".concat(str);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) throws Exception {
        lmg0 lmg0Var;
        byte b = 0;
        ((ProgressBar) G0().f.b).setVisibility(0);
        G0().b.setVisibility(8);
        knm0.h(G0().g, false);
        siq fixedWebView = G0().g.getFixedWebView();
        byte b2 = 1;
        if (fixedWebView != null) {
            fixedWebView.setVisibility(8);
            fixedWebView.getSettings().setDomStorageEnabled(true);
            fixedWebView.getSettings().setJavaScriptEnabled(true);
            fixedWebView.getSettings().setLoadWithOverviewMode(true);
            fixedWebView.setInitialScale(1);
            fixedWebView.getSettings().setUseWideViewPort(true);
            fixedWebView.getSettings().setAllowFileAccess(true);
            fixedWebView.getSettings().setBuiltInZoomControls(true);
            fixedWebView.setLayerType(2, null);
        }
        nq8 nq8Var = G0().f;
        LottieView lottieView = G0().c;
        FixedWebView fixedWebView2 = G0().g;
        TextView textView = G0().e;
        ConstraintLayout constraintLayout = G0().b;
        siq fixedWebView3 = G0().g.getFixedWebView();
        if (fixedWebView3 != null) {
            jmg0 jmg0Var = new jmg0(this, nq8Var, fixedWebView3, lottieView, fixedWebView2, textView, constraintLayout);
            lmg0Var = this;
            fixedWebView3.setFixedWebViewClient(jmg0Var);
        } else {
            lmg0Var = this;
        }
        DsNavigationBar dsNavigationBar = lmg0Var.G0().d;
        iiy[] iiyVarArr = Z1;
        String strH = lmg0Var.H(lmg0Var.Q1.n(lmg0Var, iiyVarArr[1]).intValue());
        strH.getClass();
        dsNavigationBar.setTitle(strH);
        mc50.a(dsNavigationBar, new hmg0(lmg0Var, b));
        if (lmg0Var.U1.n(lmg0Var, iiyVarArr[4]).booleanValue()) {
            dsNavigationBar.setNavigationBarButtons(q3d.e(new hc50("REFRESH_BUTTON", ybg0.f42342a, R.drawable.ic_payments_refresh, new hmg0(lmg0Var, b2), 2032)));
        }
        dsNavigationBar.setNavigationBarButtonsColorStateList(ColorStateList.valueOf(m5d.b(R.attr.uikitSecondary, lmg0Var.o0())));
        String strN = lmg0Var.R1.n(lmg0Var, iiyVarArr[2]);
        lun lunVar = lun.f20680a;
        lunVar.getClass();
        lmg0Var.G0().g.d(H0(strN), lunVar);
        kiu0 kiu0Var = lmg0Var.O1;
        qoj0 qoj0Var = ((umg0) kiu0Var.getValue()).g;
        int i = 4;
        Class<lmg0> cls = lmg0.class;
        jjc0 jjc0Var = new jjc0(2, lmg0Var, cls, "handleLoadPageEvent", "handleLoadPageEvent(Lorg/xplatform/rules/impl/presentation/RulesOldWebViewModel$LoadPageEvent;)V", i, (byte) 26);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new kmg0(qoj0Var, clzVarW, jjc0Var, (yje) null), 3);
        ol60 ol60Var = ((umg0) kiu0Var.getValue()).h;
        jjc0 jjc0Var2 = new jjc0(2, this, cls, "handleViewAction", "handleViewAction(Lorg/xplatform/rules/impl/presentation/RulesOldWebViewModel$ViewAction;)V", i, (byte) 27);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new kmg0(ol60Var, clzVarW2, jjc0Var2, (yje) null, (byte) 0), 3);
        p7m0 p7m0Var = ((umg0) kiu0Var.getValue()).i;
        jjc0 jjc0Var3 = new jjc0(2, this, cls, "handleReloadState", "handleReloadState(Lorg/xplatform/rules/impl/presentation/RulesOldWebViewModel$ReloadState;)V", 4, (byte) 28);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new kmg0((gmq) p7m0Var, clzVarW3, jjc0Var3, (yje) null, (char) 0), 3);
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(t790.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            t790 t790Var = (t790) (ze3Var instanceof t790 ? ze3Var : null);
            if (t790Var != null) {
                o3c o3cVarA = t790Var.a(new PaymentInfoParams(this.S1.n(this, Z1[3]).intValue(), 0, "", false));
                this.L1 = o3cVarA.y();
                this.M1 = mbl.a((zix) o3cVarA.k);
                this.N1 = (wdk0) o3cVarA.g;
                return;
            }
        }
        jf4.n(b1j.i(t790.class, "Cannot create dependency "));
    }

    public final p6r G0() {
        Object objN = this.P1.n(Z1[0], this);
        objN.getClass();
        return (p6r) objN;
    }

    public final void I0() {
        i1w0 i1w0VarC = ((umg0) this.O1.getValue()).f.c();
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0VarC, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0VarC.a((oe50) pawVar.next());
            }
        }
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.K1;
    }
}
