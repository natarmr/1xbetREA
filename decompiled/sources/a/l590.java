package a;

import android.content.ComponentCallbacks2;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import androidx.activity.result.ActivityResult;
import androidx.core.content.FileProvider;
import java.io.File;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.webview.FixedWebView;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/l590;", "La/yx5;", "La/cg60;", "<init>", "()V", "a/nh70", "promotions"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class l590 extends yx5 implements cg60 {
    public final s0r K1;
    public fiu0 L1;
    public ii M1;
    public FixedWebView N1;
    public boolean O1;
    public u690 P1;
    public ValueCallback Q1;
    public File R1;
    public final ywq S1;
    public final bc0 U1;
    public final ywq V1;
    public final n0o0 W1;
    public final a8z X1;
    public static final /* synthetic */ iiy[] Z1 = {new j0d0(l590.class, "viewBinding", "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final nh70 Y1 = new nh70();

    public l590() {
        super(R.layout.compose_fragment);
        this.K1 = ltt0.o(this, k590.f17709a);
        byte b = 4;
        final byte b2 = 0;
        this.S1 = m0(new wn(this) { // from class: a.f590
            public final /* synthetic */ l590 b;

            {
                this.b = this;
            }

            @Override // a.wn
            public final void a(Object obj) {
                Uri[] uriArr;
                Uri[] uriArr2;
                Uri data;
                byte b3 = b2;
                l590 l590Var = this.b;
                ActivityResult activityResult = (ActivityResult) obj;
                switch (b3) {
                    case 0:
                        nh70 nh70Var = l590.Y1;
                        activityResult.getClass();
                        Intent intent = activityResult.b;
                        int i = activityResult.f45280a;
                        if ((intent != null ? intent.getClipData() : null) == null) {
                            String string = (intent == null || (data = intent.getData()) == null) ? null : data.toString();
                            if (string == null || string.length() == 0) {
                                File file = l590Var.R1;
                                if (file != null) {
                                    if (i != -1 || l590Var.Q1 == null) {
                                        uriArr2 = null;
                                    } else {
                                        Uri uriC = FileProvider.c(l590Var.o0(), file, l590Var.n0().getPackageName() + ".provider");
                                        uriC.getClass();
                                        uriArr2 = new Uri[]{Uri.parse(uriC.toString())};
                                    }
                                    ValueCallback valueCallback = l590Var.Q1;
                                    if (valueCallback != null) {
                                        valueCallback.onReceiveValue(uriArr2);
                                    }
                                    l590Var.Q1 = null;
                                }
                            }
                        }
                        if (intent != null) {
                            if (i == -1) {
                                d590.c.getClass();
                                boolean zB = v3a.b(intent, jh70.g(), l590Var.o0());
                                ValueCallback valueCallback2 = l590Var.Q1;
                                if (!zB) {
                                    if (valueCallback2 != null) {
                                        valueCallback2.onReceiveValue(new Uri[0]);
                                    }
                                    l590Var.Q1 = null;
                                } else if (valueCallback2 != null) {
                                    Intent intent2 = l590Var.n0().getIntent();
                                    if ((intent2 != null ? intent2.getData() : null) == null) {
                                        String dataString = intent.getDataString();
                                        if (dataString == null) {
                                            dataString = "";
                                        }
                                        uriArr = new Uri[]{Uri.parse(dataString)};
                                    } else {
                                        String dataString2 = l590Var.n0().getIntent().getDataString();
                                        if (dataString2 != null) {
                                            uriArr = new Uri[]{Uri.parse(dataString2)};
                                        }
                                    }
                                }
                                uriArr = null;
                            } else {
                                uriArr = null;
                            }
                            ValueCallback valueCallback3 = l590Var.Q1;
                            if (valueCallback3 != null) {
                                valueCallback3.onReceiveValue(uriArr);
                            }
                            l590Var.Q1 = null;
                        }
                        break;
                    default:
                        nh70 nh70Var2 = l590.Y1;
                        activityResult.getClass();
                        l590Var.I0();
                        break;
                }
            }
        }, new xn(b));
        this.U1 = new bc0(this, (byte) 10);
        final byte b3 = 1;
        this.V1 = m0(new wn(this) { // from class: a.f590
            public final /* synthetic */ l590 b;

            {
                this.b = this;
            }

            @Override // a.wn
            public final void a(Object obj) {
                Uri[] uriArr;
                Uri[] uriArr2;
                Uri data;
                byte b4 = b3;
                l590 l590Var = this.b;
                ActivityResult activityResult = (ActivityResult) obj;
                switch (b4) {
                    case 0:
                        nh70 nh70Var = l590.Y1;
                        activityResult.getClass();
                        Intent intent = activityResult.b;
                        int i = activityResult.f45280a;
                        if ((intent != null ? intent.getClipData() : null) == null) {
                            String string = (intent == null || (data = intent.getData()) == null) ? null : data.toString();
                            if (string == null || string.length() == 0) {
                                File file = l590Var.R1;
                                if (file != null) {
                                    if (i != -1 || l590Var.Q1 == null) {
                                        uriArr2 = null;
                                    } else {
                                        Uri uriC = FileProvider.c(l590Var.o0(), file, l590Var.n0().getPackageName() + ".provider");
                                        uriC.getClass();
                                        uriArr2 = new Uri[]{Uri.parse(uriC.toString())};
                                    }
                                    ValueCallback valueCallback = l590Var.Q1;
                                    if (valueCallback != null) {
                                        valueCallback.onReceiveValue(uriArr2);
                                    }
                                    l590Var.Q1 = null;
                                }
                            }
                        }
                        if (intent != null) {
                            if (i == -1) {
                                d590.c.getClass();
                                boolean zB = v3a.b(intent, jh70.g(), l590Var.o0());
                                ValueCallback valueCallback2 = l590Var.Q1;
                                if (!zB) {
                                    if (valueCallback2 != null) {
                                        valueCallback2.onReceiveValue(new Uri[0]);
                                    }
                                    l590Var.Q1 = null;
                                } else if (valueCallback2 != null) {
                                    Intent intent2 = l590Var.n0().getIntent();
                                    if ((intent2 != null ? intent2.getData() : null) == null) {
                                        String dataString = intent.getDataString();
                                        if (dataString == null) {
                                            dataString = "";
                                        }
                                        uriArr = new Uri[]{Uri.parse(dataString)};
                                    } else {
                                        String dataString2 = l590Var.n0().getIntent().getDataString();
                                        if (dataString2 != null) {
                                            uriArr = new Uri[]{Uri.parse(dataString2)};
                                        }
                                    }
                                }
                                uriArr = null;
                            } else {
                                uriArr = null;
                            }
                            ValueCallback valueCallback3 = l590Var.Q1;
                            if (valueCallback3 != null) {
                                valueCallback3.onReceiveValue(uriArr);
                            }
                            l590Var.Q1 = null;
                        }
                        break;
                    default:
                        nh70 nh70Var2 = l590.Y1;
                        activityResult.getClass();
                        l590Var.I0();
                        break;
                }
            }
        }, new xn(b));
        this.W1 = maz.b(new Function0(this) { // from class: a.g590
            public final /* synthetic */ l590 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b2;
                l590 l590Var = this.b;
                switch (b4) {
                    case 0:
                        nh70 nh70Var = l590.Y1;
                        return m7x.P(l590Var, "android.permission.CAMERA", j120.V()).d();
                    default:
                        nh70 nh70Var2 = l590.Y1;
                        fiu0 fiu0Var = l590Var.L1;
                        if (fiu0Var != null) {
                            return fiu0Var;
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                }
            }
        });
        this.X1 = xbc.b0(this, sre0.f32672a.b(j790.class), new Function0(this) { // from class: a.g590
            public final /* synthetic */ l590 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b3;
                l590 l590Var = this.b;
                switch (b4) {
                    case 0:
                        nh70 nh70Var = l590.Y1;
                        return m7x.P(l590Var, "android.permission.CAMERA", j120.V()).d();
                    default:
                        nh70 nh70Var2 = l590.Y1;
                        fiu0 fiu0Var = l590Var.L1;
                        if (fiu0Var != null) {
                            return fiu0Var;
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                }
            }
        });
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Window window;
        kxq kxqVarB = B();
        if (kxqVarB != null && (window = kxqVarB.getWindow()) != null) {
            ofm0.z(window, null, R.attr.uikitBackground, R.attr.uikitBackground, 9);
        }
        if (this.N1 == null) {
            FixedWebView fixedWebView = new FixedWebView(o0());
            fixedWebView.addOnAttachStateChangeListener(this.U1);
            siq fixedWebView2 = fixedWebView.getFixedWebView();
            if (fixedWebView2 != null) {
                J0(fixedWebView2);
            }
            this.N1 = fixedWebView;
        }
        pkd.h(K0().f919a, qek0.h, null, new ugd(527969940, true, new ds60(this, (byte) 23)));
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
                this.L1 = v9iVarA.e();
                this.M1 = (ii) v9iVarA.v;
                return;
            }
        }
        jf4.n(b1j.i(e590.class, "Cannot create dependency "));
    }

    public final void G0(Function1 function1, fet fetVar, int i) {
        fetVar.g0(404850698);
        int i2 = (fetVar.i(function1) ? 4 : 2) | i | (fetVar.i(this) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            k3t0 k3t0VarL0 = L0();
            boolean zI = fetVar.i(this) | ((i2 & 14) == 4);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zI || objP == obj) {
                objP = new ka70(function1, this, (byte) 12);
                fetVar.o0(objP);
            }
            clz clzVar = (clz) fetVar.k(or00.f25714a);
            lkz lkzVar = lkz.f20223a;
            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) objP, fetVar);
            boolean zI2 = fetVar.i(k3t0VarL0) | fetVar.i(clzVar) | fetVar.e(3) | fetVar.g(pz40VarF);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == obj) {
                Object kc70Var = new kc70(k3t0VarL0, clzVar, pz40VarF, null, (byte) 2);
                fetVar.o0(kc70Var);
                objP2 = kc70Var;
            }
            m0x0.t(fetVar, clzVar, (Function2) objP2);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xd80(this, function1, i, (byte) 8);
        }
    }

    public final void H0() {
        FixedWebView fixedWebView;
        siq fixedWebView2;
        u690 u690Var = this.P1;
        if (u690Var == null || (fixedWebView = this.N1) == null) {
            return;
        }
        if (!fixedWebView.isAttachedToWindow()) {
            fixedWebView = null;
        }
        if (fixedWebView == null || (fixedWebView2 = fixedWebView.getFixedWebView()) == null) {
            return;
        }
        J0(fixedWebView2);
        Pair pair = new Pair("X-Mobile-Project-Id", String.valueOf(1357));
        String str = u690Var.b;
        LinkedHashMap linkedHashMapH = xp20.h(pair, new Pair("x-mobile-app-authorization", str), new Pair("X-Auth", str), new Pair("mf-render-mode", "html"), new Pair("X-Country", u690Var.c));
        String str2 = u690Var.d;
        if (str2.length() > 0) {
            linkedHashMapH.put("X-Language", str2);
        }
        FixedWebView fixedWebView3 = this.N1;
        if (fixedWebView3 != null) {
            fixedWebView3.d(u690Var.f35128a, linkedHashMapH);
        }
        this.P1 = null;
    }

    public final void I0() {
        qog0 qog0Var = (qog0) this.W1.getValue();
        lz9 lz9Var = new lz9(qog0Var, this, (byte) 2);
        qog0Var.getClass();
        qog0Var.f29072a.add(lz9Var);
        qog0Var.a();
    }

    public final void J0(siq siqVar) {
        if (this.O1) {
            return;
        }
        WebSettings settings = siqVar.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setAllowFileAccess(true);
        siqVar.setFixedWebViewClient(new j590(this));
        siqVar.setWebChromeClient(new mzo(this, (byte) 1));
        this.O1 = true;
    }

    public final aid K0() {
        Object objN = this.K1.n(Z1[0], this);
        objN.getClass();
        return (aid) objN;
    }

    public final k3t0 L0() {
        return (k3t0) this.X1.getValue();
    }

    public final void M0(boolean z) {
        ii iiVar = this.M1;
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
        ccq0.V(this, "CAMERA_PERMISSION_DIALOG", new h590(z, this, (byte) 1));
    }

    public final void N0(boolean z) {
        ii iiVar = this.M1;
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
        ccq0.V(this, "PERMISSION_DIALOG", new h590(z, this, (byte) 0));
    }

    @Override // androidx.fragment.app.Fragment
    public final void Y() {
        FixedWebView fixedWebView = this.N1;
        if (fixedWebView != null) {
            fixedWebView.removeOnAttachStateChangeListener(this.U1);
            fixedWebView.a();
        }
        this.N1 = null;
        this.O1 = false;
        this.j1 = true;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        FixedWebView fixedWebView = this.N1;
        if (fixedWebView != null) {
            ViewParent parent = fixedWebView.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(fixedWebView);
            }
        }
        this.O1 = false;
        super.Z();
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        this.j1 = true;
        FixedWebView fixedWebView = this.N1;
        if (fixedWebView != null) {
            fixedWebView.e();
        }
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        hxm0.n(K0().f919a);
        FixedWebView fixedWebView = this.N1;
        if (fixedWebView != null) {
            fixedWebView.f();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        this.j1 = true;
        hxm0.m(K0().f919a);
    }

    @Override // a.cg60
    public final boolean j() {
        L0().x(v490.f36766a);
        return false;
    }
}
