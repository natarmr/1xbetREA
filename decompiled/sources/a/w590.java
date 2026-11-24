package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.javax.sip.message.Response;
import android.net.Uri;
import android.os.Bundle;
import android.view.Window;
import android.webkit.ValueCallback;
import androidx.activity.result.ActivityResult;
import androidx.core.content.FileProvider;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/w590;", "La/yx5;", "La/cg60;", "<init>", "()V", "a/mi70", "promotions"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class w590 extends yx5 implements cg60 {
    public final f9o0 K1;
    public final hnm0 L1;
    public fiu0 M1;
    public wdk0 N1;
    public ii O1;
    public vby P1;
    public final kiu0 Q1;
    public final ywq R1;
    public final n0o0 S1;
    public ValueCallback U1;
    public final s0r V1;
    public static final /* synthetic */ iiy[] X1 = {new j0d0(w590.class, "binding", "getBinding()Lorg/xplatform/promotions/databinding/PaymentConsultantFragmentBinding;", 0)};
    public static final mi70 W1 = new mi70();
    public static final List Y1 = kotlin.collections.a.c(Integer.valueOf(Response.UNAUTHORIZED));

    public w590() {
        super(R.layout.payment_consultant_fragment);
        this.K1 = new f9o0(R.attr.uikitBackgroundContent);
        this.L1 = hnm0.f13359a;
        r590 r590Var = new r590(this, (byte) 2);
        byte b = 4;
        a8z a8zVarA = maz.a(wez.b, new wz80(new wz80(this, (byte) 4), (byte) 5));
        this.Q1 = agc.G(this, sre0.f32672a.b(s690.class), new a190(a8zVarA, (byte) 4), new a190(a8zVarA, (byte) 5), r590Var);
        final byte b2 = 0;
        this.R1 = m0(new wn(this) { // from class: a.s590
            public final /* synthetic */ w590 b;

            {
                this.b = this;
            }

            @Override // a.wn
            public final void a(Object obj) {
                Uri[] uriArr;
                Uri[] uriArr2;
                Uri data;
                byte b3 = b2;
                w590 w590Var = this.b;
                ActivityResult activityResult = (ActivityResult) obj;
                switch (b3) {
                    case 0:
                        mi70 mi70Var = w590.W1;
                        activityResult.getClass();
                        Intent intent = activityResult.b;
                        int i = activityResult.f45280a;
                        if ((intent != null ? intent.getClipData() : null) == null) {
                            String string = (intent == null || (data = intent.getData()) == null) ? null : data.toString();
                            if (string == null || string.length() == 0) {
                                Bundle bundle = w590Var.g;
                                String string2 = bundle != null ? bundle.getString("FILE_PATH_BUNDLE_NAME") : null;
                                File file = new File(string2 != null ? string2 : "");
                                if (i != -1 || w590Var.U1 == null) {
                                    uriArr2 = null;
                                } else {
                                    Uri uriC = FileProvider.c(w590Var.o0(), file, w590Var.n0().getPackageName() + ".provider");
                                    uriC.getClass();
                                    uriArr2 = new Uri[]{Uri.parse(uriC.toString())};
                                }
                                ValueCallback valueCallback = w590Var.U1;
                                if (valueCallback != null) {
                                    valueCallback.onReceiveValue(uriArr2);
                                }
                                w590Var.U1 = null;
                            }
                        }
                        if (intent != null) {
                            if (i == -1) {
                                d590.c.getClass();
                                boolean zB = v3a.b(intent, jh70.g(), w590Var.o0());
                                ValueCallback valueCallback2 = w590Var.U1;
                                if (!zB) {
                                    if (valueCallback2 != null) {
                                        valueCallback2.onReceiveValue(new Uri[0]);
                                    }
                                    w590Var.U1 = null;
                                } else if (valueCallback2 != null) {
                                    Intent intent2 = w590Var.n0().getIntent();
                                    if ((intent2 != null ? intent2.getData() : null) == null) {
                                        String dataString = intent.getDataString();
                                        uriArr = new Uri[]{Uri.parse(dataString != null ? dataString : "")};
                                    } else {
                                        String dataString2 = w590Var.n0().getIntent().getDataString();
                                        if (dataString2 != null) {
                                            uriArr = new Uri[]{Uri.parse(dataString2)};
                                        }
                                    }
                                }
                                uriArr = null;
                            } else {
                                uriArr = null;
                            }
                            ValueCallback valueCallback3 = w590Var.U1;
                            if (valueCallback3 != null) {
                                valueCallback3.onReceiveValue(uriArr);
                            }
                            w590Var.U1 = null;
                        }
                        break;
                    default:
                        mi70 mi70Var2 = w590.W1;
                        activityResult.getClass();
                        w590Var.G0();
                        break;
                }
            }
        }, new xn(b));
        xn xnVar = new xn(b);
        final byte b3 = 1;
        m0(new wn(this) { // from class: a.s590
            public final /* synthetic */ w590 b;

            {
                this.b = this;
            }

            @Override // a.wn
            public final void a(Object obj) {
                Uri[] uriArr;
                Uri[] uriArr2;
                Uri data;
                byte b4 = b3;
                w590 w590Var = this.b;
                ActivityResult activityResult = (ActivityResult) obj;
                switch (b4) {
                    case 0:
                        mi70 mi70Var = w590.W1;
                        activityResult.getClass();
                        Intent intent = activityResult.b;
                        int i = activityResult.f45280a;
                        if ((intent != null ? intent.getClipData() : null) == null) {
                            String string = (intent == null || (data = intent.getData()) == null) ? null : data.toString();
                            if (string == null || string.length() == 0) {
                                Bundle bundle = w590Var.g;
                                String string2 = bundle != null ? bundle.getString("FILE_PATH_BUNDLE_NAME") : null;
                                File file = new File(string2 != null ? string2 : "");
                                if (i != -1 || w590Var.U1 == null) {
                                    uriArr2 = null;
                                } else {
                                    Uri uriC = FileProvider.c(w590Var.o0(), file, w590Var.n0().getPackageName() + ".provider");
                                    uriC.getClass();
                                    uriArr2 = new Uri[]{Uri.parse(uriC.toString())};
                                }
                                ValueCallback valueCallback = w590Var.U1;
                                if (valueCallback != null) {
                                    valueCallback.onReceiveValue(uriArr2);
                                }
                                w590Var.U1 = null;
                            }
                        }
                        if (intent != null) {
                            if (i == -1) {
                                d590.c.getClass();
                                boolean zB = v3a.b(intent, jh70.g(), w590Var.o0());
                                ValueCallback valueCallback2 = w590Var.U1;
                                if (!zB) {
                                    if (valueCallback2 != null) {
                                        valueCallback2.onReceiveValue(new Uri[0]);
                                    }
                                    w590Var.U1 = null;
                                } else if (valueCallback2 != null) {
                                    Intent intent2 = w590Var.n0().getIntent();
                                    if ((intent2 != null ? intent2.getData() : null) == null) {
                                        String dataString = intent.getDataString();
                                        uriArr = new Uri[]{Uri.parse(dataString != null ? dataString : "")};
                                    } else {
                                        String dataString2 = w590Var.n0().getIntent().getDataString();
                                        if (dataString2 != null) {
                                            uriArr = new Uri[]{Uri.parse(dataString2)};
                                        }
                                    }
                                }
                                uriArr = null;
                            } else {
                                uriArr = null;
                            }
                            ValueCallback valueCallback3 = w590Var.U1;
                            if (valueCallback3 != null) {
                                valueCallback3.onReceiveValue(uriArr);
                            }
                            w590Var.U1 = null;
                        }
                        break;
                    default:
                        mi70 mi70Var2 = w590.W1;
                        activityResult.getClass();
                        w590Var.G0();
                        break;
                }
            }
        }, xnVar);
        this.S1 = maz.b(new r590(this, (byte) 3));
        this.V1 = ltt0.o(this, t590.f33357a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) throws Exception {
        Window window;
        kxq kxqVarB = B();
        yje yjeVar = null;
        if (kxqVarB != null && (window = kxqVarB.getWindow()) != null) {
            ofm0.z(window, null, R.attr.uikitBackground, R.attr.uikitBackground, 9);
        }
        DsNavigationBar dsNavigationBar = H0().d;
        byte b = 0;
        mc50.a(dsNavigationBar, new r590(this, b));
        dsNavigationBar.setNavigationBarButtons(q3d.e(new hc50("TOOLBAR_BUTTON_REFRESH", ybg0.f42342a, R.drawable.ic_payments_refresh, new cz60(0, I0(), s690.class, "reload", "reload()V", 0, (byte) 15), 2032)));
        Context context = dsNavigationBar.getContext();
        context.getClass();
        dsNavigationBar.setNavigationBarButtonsColorStateList(ColorStateList.valueOf(m5d.b(R.attr.uikitSecondary, context)));
        knm0.h(H0().e, false);
        siq fixedWebView = H0().e.getFixedWebView();
        byte b2 = 1;
        if (fixedWebView != null) {
            fixedWebView.getSettings().setDomStorageEnabled(true);
            fixedWebView.getSettings().setJavaScriptEnabled(true);
            fixedWebView.getSettings().setLoadWithOverviewMode(true);
            fixedWebView.getSettings().setUseWideViewPort(true);
            fixedWebView.getSettings().setAllowFileAccess(true);
        }
        s690 s690VarI0 = I0();
        fnq fnqVar = new fnq(s690VarI0.j.b(), new q690(s690VarI0, null, (byte) 0), (byte) 4);
        r690 r690Var = r690.h;
        bvc bvcVarA = jiu0.a(s690VarI0);
        mne mneVar = s690VarI0.k;
        sac.T(fnqVar, d5c.S(bvcVarA, mneVar.f22085a), r690Var);
        sac.V(jiu0.a(s690VarI0), new x590(s690VarI0, (byte) 0), null, mneVar.f22085a, new m690(s690VarI0, null, (byte) 1), 10);
        sac.T(new fnq(s690VarI0.x, new m690(s690VarI0, null, (byte) 0), (byte) 4), jiu0.a(s690VarI0), n690.h);
        s690VarI0.y();
        xae0 xae0VarN = vtb.N(I0().v);
        u590 u590Var = new u590(this, yjeVar, b);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        tkz tkzVarQ = x0x.Q(clzVarW.x());
        w090 w090Var = new w090(xae0VarN, clzVarW, u590Var, (yje) null);
        byte b3 = 3;
        qjj.W(tkzVarQ, null, null, w090Var, 3);
        xae0 xae0VarN2 = vtb.N(I0().w);
        u590 u590Var2 = new u590(this, yjeVar, b2);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new w090(xae0VarN2, clzVarW2, u590Var2, (yje) null, (byte) 0), 3);
        ol60 ol60Var = I0().y;
        u590 u590Var3 = new u590(this, yjeVar, (byte) 2);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new w090(ol60Var, clzVarW3, u590Var3, (yje) null), 3);
        siq fixedWebView2 = H0().e.getFixedWebView();
        if (fixedWebView2 != null) {
            fixedWebView2.setFixedWebViewClient(new v590(this));
        }
        siq fixedWebView3 = H0().e.getFixedWebView();
        if (fixedWebView3 != null) {
            vby vbyVar = this.P1;
            if (vbyVar == null) {
                Intrinsics.h("json");
                throw null;
            }
            fixedWebView3.addJavascriptInterface(new q590(new r590(this, (byte) 5), new r590(this, (byte) 6), new r590(this, (byte) 7), new yr80(this, b3), vbyVar), "MobileAppApiV2");
        }
        siq fixedWebView4 = H0().e.getFixedWebView();
        if (fixedWebView4 != null) {
            fixedWebView4.setWebChromeClient(new mzo(this, (byte) 2));
        }
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(e590.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            e590 e590Var = (e590) (ze3Var instanceof e590 ? ze3Var : null);
            if (e590Var != null) {
                v9i v9iVarA = e590Var.a(a4n0.f(this));
                this.M1 = v9iVarA.e();
                this.N1 = (wdk0) v9iVarA.w;
                this.O1 = (ii) v9iVarA.v;
                this.P1 = (vby) v9iVarA.u;
                return;
            }
        }
        jf4.n(b1j.i(e590.class, "Cannot create dependency "));
    }

    public final void G0() {
        qog0 qog0Var = (qog0) this.S1.getValue();
        lz9 lz9Var = new lz9(qog0Var, this, (byte) 3);
        qog0Var.getClass();
        qog0Var.f29072a.add(lz9Var);
        qog0Var.a();
    }

    public final m590 H0() {
        Object objN = this.V1.n(X1[0], this);
        objN.getClass();
        return (m590) objN;
    }

    public final s690 I0() {
        return (s690) this.Q1.getValue();
    }

    public final void J0() {
        ii iiVar = this.O1;
        if (iiVar == null) {
            Intrinsics.h("actionDialogManager");
            throw null;
        }
        String strH = H(R.string.caution);
        String strH2 = H(R.string.permission_message_camera);
        String strH3 = H(R.string.permission_allow);
        strH3.getClass();
        DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, H(R.string.cancel), (String) null, "CAMERA_PERMISSION_DIALOG", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
        androidx.fragment.app.e eVarC = C();
        eVarC.getClass();
        iiVar.d(dialogFields, eVarC);
        ccq0.V(this, "CAMERA_PERMISSION_DIALOG", new r590(this, (byte) 1));
    }

    public final void K0() {
        ii iiVar = this.O1;
        if (iiVar == null) {
            Intrinsics.h("actionDialogManager");
            throw null;
        }
        String strH = H(R.string.caution);
        String strH2 = H(R.string.permission_message_read_files);
        String strH3 = H(R.string.permission_allow);
        strH3.getClass();
        DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, H(R.string.cancel), (String) null, "PERMISSION_DIALOG", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
        androidx.fragment.app.e eVarC = C();
        eVarC.getClass();
        iiVar.d(dialogFields, eVarC);
        ccq0.V(this, "PERMISSION_DIALOG", new r590(this, (byte) 4));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        hxm0.n(H0().f21210a);
        super.g0();
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        hxm0.m(H0().f21210a);
        this.j1 = true;
    }

    @Override // a.cg60
    public final boolean j() {
        I0().w();
        return false;
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.L1;
    }

    @Override // a.yx5
    public final j9o0 z0() {
        return this.K1;
    }
}
