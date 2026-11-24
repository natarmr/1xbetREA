package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ProgressBar;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/nzo;", "La/yx5;", "<init>", "()V", "a/pek", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class nzo extends yx5 {
    public fiu0 K1;
    public ii L1;
    public final kiu0 M1;
    public final s0r N1;
    public String O1;
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(nzo.class, "binding", "getBinding()Lorg/xplatform/fast_games/impl/databinding/FragmentFastGamesBinding;", 0)};
    public static final pek P1 = new pek();

    public nzo() {
        super(R.layout.fragment_fast_games);
        jzo jzoVar = new jzo(this, (byte) 1);
        a8z a8zVarA = maz.a(wez.b, new jfl(new jfl(this, (byte) 8), (byte) 9));
        this.M1 = agc.G(this, sre0.f32672a.b(e0p.class), new b9k(a8zVarA, (byte) 26), new b9k(a8zVarA, (byte) 27), jzoVar);
        this.N1 = ltt0.o(this, kzo.f19161a);
        this.O1 = "";
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        siq fixedWebView = G0().g.getFixedWebView();
        yje yjeVar = null;
        if (fixedWebView != null) {
            fixedWebView.setInitialScale(1);
            fixedWebView.getSettings().setDomStorageEnabled(true);
            fixedWebView.getSettings().setJavaScriptEnabled(true);
            fixedWebView.getSettings().setLoadWithOverviewMode(true);
            fixedWebView.getSettings().setUseWideViewPort(true);
            fixedWebView.getSettings().setAllowFileAccess(true);
            fixedWebView.getSettings().setBuiltInZoomControls(true);
            fixedWebView.setLayerType(2, null);
        }
        ProgressBar progressBar = G0().f;
        siq fixedWebView2 = G0().g.getFixedWebView();
        if (fixedWebView2 != null) {
            fixedWebView2.setFixedWebViewClient(new lzo(this, progressBar));
        }
        siq fixedWebView3 = G0().g.getFixedWebView();
        byte b = 0;
        if (fixedWebView3 != null) {
            fixedWebView3.setWebChromeClient(new mzo(this, b));
        }
        G0().d.setNavigationIcon(R.drawable.ic_arrow_back);
        G0().d.setNavigationOnClickListener(new q10(this, (byte) 21));
        Drawable navigationIcon = G0().d.getNavigationIcon();
        Context context = G0().d.getContext();
        context.getClass();
        sj3.B0(navigationIcon, context, R.attr.uikitSecondary);
        G0().f.setVisibility(0);
        dyb.O(G0().b, new yhn((Object) this, (byte) 23));
        ccq0.V(this, "REQUEST_GAME_URL_ERROR_DIALOG_KEY", new jzo(this, b));
        if ((n0().getApplicationInfo().flags & 2) != 0) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        e0p e0pVar = (e0p) this.M1.getValue();
        Class<duj> cls = duj.class;
        sac.V(jiu0.a(e0pVar), new hin(1, e0pVar.i, cls, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 23), null, null, new hij(e0pVar, yjeVar, (byte) 17), 14);
        sac.T(new fnq(i120.W(e0pVar.d.a(bm5.e)), new sxk(e0pVar, yjeVar, (byte) 10), (byte) 4), jiu0.a(e0pVar), new pfl(2, e0pVar.i, cls, "handleError", "handleError(Ljava/lang/Throwable;)V", 4, (byte) 5));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(ozo.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            ozo ozoVar = (ozo) (ze3Var instanceof ozo ? ze3Var : null);
            if (ozoVar != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                cad cadVar = ozoVar.d;
                btt0 btt0Var = ozoVar.f26108a;
                zri zriVar = ozoVar.b;
                knf0 knf0Var = ozoVar.c;
                v88 v88Var = ozoVar.f;
                gii0 gii0Var = ozoVar.g;
                wsf0 wsf0Var = ozoVar.i;
                gst0 gst0Var = ozoVar.j;
                ii iiVar = ozoVar.h;
                fsd fsdVar = ozoVar.k;
                duj dujVar = ozoVar.l;
                gst0Var.getClass();
                iiVar.getClass();
                btt0Var.getClass();
                knf0Var.getClass();
                gii0Var.getClass();
                fsdVar.getClass();
                this.K1 = new fiu0(Collections.singletonMap(e0p.class, (yei) new o3c(cadVar, wsf0Var, gst0Var, iiVar, dujVar, btt0Var, zriVar, knf0Var, v88Var, fsdVar, i1w0VarF).k));
                this.L1 = iiVar;
                return;
            }
        }
        jf4.n(b1j.i(ozo.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        qoj0 qoj0Var = ((e0p) this.M1.getValue()).k;
        sxk sxkVar = new sxk(this, null, (byte) 9);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new ofl(qoj0Var, clzVarW, sxkVar, (yje) null), 3);
    }

    public final wzq G0() {
        Object objN = this.N1.n(Q1[0], this);
        objN.getClass();
        return (wzq) objN;
    }

    public final void H0() {
        G0().c.setText(H(R.string.data_retrieval_error));
        G0().c.setVisibility(0);
        G0().g.setVisibility(8);
    }
}
