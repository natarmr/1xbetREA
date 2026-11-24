package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.webkit.ValueCallback;
import androidx.core.content.FileProvider;
import com.google.android.material.appbar.MaterialToolbar;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/whn0;", "La/yx5;", "La/cg60;", "<init>", "()V", "a/s2m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class whn0 extends yx5 implements cg60 {
    public jvi K1;
    public kvi L1;
    public c8c M1;
    public ii N1;
    public final kiu0 O1;
    public final s0r P1;
    public ValueCallback Q1;
    public final n0o0 R1;
    public final n0o0 S1;
    public final n0o0 U1;
    public final rhn0 V1;
    public final rhn0 W1;
    public final vhn0 X1;
    public static final /* synthetic */ iiy[] Z1 = {new j0d0(whn0.class, "binding", "getBinding()Lorg/xplatform/verification/sum_sub/impl/databinding/FragmentIframeSumSubBinding;", 0)};
    public static final s2m0 Y1 = new s2m0();

    /* JADX WARN: Type inference failed for: r0v11, types: [a.rhn0] */
    /* JADX WARN: Type inference failed for: r0v12, types: [a.rhn0] */
    public whn0() {
        super(R.layout.fragment_iframe_sum_sub);
        final byte b = 0;
        phn0 phn0Var = new phn0(this, b);
        a8z a8zVarA = maz.a(wez.b, new fyk0(new fyk0(this, (byte) 18), (byte) 19));
        this.O1 = agc.G(this, sre0.f32672a.b(fin0.class), new cdl0(a8zVarA, (byte) 14), new cdl0(a8zVarA, (byte) 15), phn0Var);
        this.P1 = ltt0.o(this, shn0.f32221a);
        this.R1 = maz.b(new phn0(this, (byte) 2));
        this.S1 = maz.b(new phn0(this, (byte) 3));
        this.U1 = maz.b(new phn0(this, (byte) 4));
        this.V1 = new Function2(this) { // from class: a.rhn0
            public final /* synthetic */ whn0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws IOException {
                Uri[] uriArr;
                Uri[] uriArr2;
                byte b2 = b;
                whn0 whn0Var = this.b;
                int iIntValue = ((Integer) obj).intValue();
                switch (b2) {
                    case 0:
                        File file = (File) obj2;
                        s2m0 s2m0Var = whn0.Y1;
                        file.getClass();
                        if (iIntValue != -1 || whn0Var.Q1 == null) {
                            uriArr = null;
                        } else {
                            Uri uriC = FileProvider.c(whn0Var.o0(), file, whn0Var.n0().getPackageName() + ".provider");
                            uriC.getClass();
                            uriArr = new Uri[]{Uri.parse(uriC.toString())};
                        }
                        ValueCallback valueCallback = whn0Var.Q1;
                        if (valueCallback != null) {
                            valueCallback.onReceiveValue(uriArr);
                        }
                        whn0Var.Q1 = null;
                        break;
                    default:
                        Intent intent = (Intent) obj2;
                        s2m0 s2m0Var2 = whn0.Y1;
                        intent.getClass();
                        if (iIntValue == -1) {
                            qm90 qm90VarI0 = whn0Var.I0();
                            Context contextO0 = whn0Var.o0();
                            qm90VarI0.getClass();
                            boolean zB = qm90.b(contextO0, intent);
                            ValueCallback valueCallback2 = whn0Var.Q1;
                            if (!zB) {
                                if (valueCallback2 != null) {
                                    valueCallback2.onReceiveValue(new Uri[0]);
                                }
                                whn0Var.Q1 = null;
                            } else if (valueCallback2 != null) {
                                Intent intent2 = whn0Var.n0().getIntent();
                                if ((intent2 != null ? intent2.getData() : null) == null) {
                                    String dataString = intent.getDataString();
                                    if (dataString == null) {
                                        dataString = "";
                                    }
                                    uriArr2 = new Uri[]{Uri.parse(dataString)};
                                } else {
                                    String dataString2 = whn0Var.n0().getIntent().getDataString();
                                    if (dataString2 != null) {
                                        uriArr2 = new Uri[]{Uri.parse(dataString2)};
                                    }
                                }
                            }
                            uriArr2 = null;
                        } else {
                            uriArr2 = null;
                        }
                        ValueCallback valueCallback3 = whn0Var.Q1;
                        if (valueCallback3 != null) {
                            valueCallback3.onReceiveValue(uriArr2);
                        }
                        whn0Var.Q1 = null;
                        break;
                }
                return Unit.f46060a;
            }
        };
        final byte b2 = 1;
        this.W1 = new Function2(this) { // from class: a.rhn0
            public final /* synthetic */ whn0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws IOException {
                Uri[] uriArr;
                Uri[] uriArr2;
                byte b3 = b2;
                whn0 whn0Var = this.b;
                int iIntValue = ((Integer) obj).intValue();
                switch (b3) {
                    case 0:
                        File file = (File) obj2;
                        s2m0 s2m0Var = whn0.Y1;
                        file.getClass();
                        if (iIntValue != -1 || whn0Var.Q1 == null) {
                            uriArr = null;
                        } else {
                            Uri uriC = FileProvider.c(whn0Var.o0(), file, whn0Var.n0().getPackageName() + ".provider");
                            uriC.getClass();
                            uriArr = new Uri[]{Uri.parse(uriC.toString())};
                        }
                        ValueCallback valueCallback = whn0Var.Q1;
                        if (valueCallback != null) {
                            valueCallback.onReceiveValue(uriArr);
                        }
                        whn0Var.Q1 = null;
                        break;
                    default:
                        Intent intent = (Intent) obj2;
                        s2m0 s2m0Var2 = whn0.Y1;
                        intent.getClass();
                        if (iIntValue == -1) {
                            qm90 qm90VarI0 = whn0Var.I0();
                            Context contextO0 = whn0Var.o0();
                            qm90VarI0.getClass();
                            boolean zB = qm90.b(contextO0, intent);
                            ValueCallback valueCallback2 = whn0Var.Q1;
                            if (!zB) {
                                if (valueCallback2 != null) {
                                    valueCallback2.onReceiveValue(new Uri[0]);
                                }
                                whn0Var.Q1 = null;
                            } else if (valueCallback2 != null) {
                                Intent intent2 = whn0Var.n0().getIntent();
                                if ((intent2 != null ? intent2.getData() : null) == null) {
                                    String dataString = intent.getDataString();
                                    if (dataString == null) {
                                        dataString = "";
                                    }
                                    uriArr2 = new Uri[]{Uri.parse(dataString)};
                                } else {
                                    String dataString2 = whn0Var.n0().getIntent().getDataString();
                                    if (dataString2 != null) {
                                        uriArr2 = new Uri[]{Uri.parse(dataString2)};
                                    }
                                }
                            }
                            uriArr2 = null;
                        } else {
                            uriArr2 = null;
                        }
                        ValueCallback valueCallback3 = whn0Var.Q1;
                        if (valueCallback3 != null) {
                            valueCallback3.onReceiveValue(uriArr2);
                        }
                        whn0Var.Q1 = null;
                        break;
                }
                return Unit.f46060a;
            }
        };
        this.X1 = new vhn0(this);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) throws Exception {
        Window window;
        kxq kxqVarB = B();
        byte b = 9;
        yje yjeVar = null;
        if (kxqVarB != null && (window = kxqVarB.getWindow()) != null) {
            ofm0.z(window, null, R.attr.uikitBackground, R.attr.uikitBackground, 9);
        }
        H0().d.setNavigationOnClickListener(new jpe0(this, (byte) 11));
        MaterialToolbar materialToolbar = H0().d;
        ymx ymxVar = ymx.INTERVAL_100;
        materialToolbar.setOnMenuItemClickListener(new ejj(new j1l0(this, (byte) 25)));
        siq fixedWebView = H0().e.getFixedWebView();
        byte b2 = 1;
        if (fixedWebView != null) {
            fixedWebView.getSettings().setJavaScriptEnabled(true);
            fixedWebView.getSettings().setDomStorageEnabled(true);
            fixedWebView.getSettings().setLoadWithOverviewMode(true);
            fixedWebView.getSettings().setUseWideViewPort(true);
            fixedWebView.getSettings().setAllowFileAccess(true);
        }
        siq fixedWebView2 = H0().e.getFixedWebView();
        if (fixedWebView2 != null) {
            fixedWebView2.setFixedWebViewClient(this.X1);
        }
        siq fixedWebView3 = H0().e.getFixedWebView();
        byte b3 = 3;
        if (fixedWebView3 != null) {
            fixedWebView3.setWebChromeClient(new mzo(this, b3));
        }
        p7m0 p7m0Var = J0().m;
        z2n0 z2n0Var = new z2n0(this, yjeVar, b2);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new agn0(p7m0Var, clzVarW, z2n0Var, (yje) null), 3);
        xae0 xae0VarN = vtb.N(J0().l);
        ssl0 ssl0Var = new ssl0(this, yjeVar, b);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new agn0(xae0VarN, clzVarW2, ssl0Var, (yje) null), 3);
        J0().w(false);
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(ohn0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            ohn0 ohn0Var = (ohn0) (ze3Var instanceof ohn0 ? ze3Var : null);
            if (ohn0Var != null) {
                cad cadVar = ohn0Var.f25273a;
                duj dujVar = ohn0Var.b;
                btt0 btt0Var = ohn0Var.c;
                gii0 gii0Var = ohn0Var.d;
                ilp0 ilp0Var = ohn0Var.e;
                sa10 sa10Var = ohn0Var.f;
                knf0 knf0Var = ohn0Var.g;
                ntu ntuVar = ohn0Var.h;
                n4u n4uVar = ohn0Var.i;
                wgu wguVar = ohn0Var.j;
                iqt iqtVar = ohn0Var.k;
                hru hruVar = ohn0Var.l;
                hse0 hse0Var = ohn0Var.m;
                ii iiVar = ohn0Var.n;
                zri zriVar = ohn0Var.o;
                c8c c8cVar = ohn0Var.p;
                btt0Var.getClass();
                gii0Var.getClass();
                knf0Var.getClass();
                wguVar.getClass();
                hse0Var.getClass();
                iiVar.getClass();
                c8cVar.getClass();
                qv2 qv2Var = new qv2(cadVar, dujVar, ilp0Var, sa10Var, ntuVar, n4uVar, wguVar, iqtVar, hruVar, hse0Var, iiVar, zriVar, c8cVar);
                this.K1 = (jvi) ((n5d0) qv2Var.m).get();
                this.L1 = (kvi) ((n5d0) qv2Var.n).get();
                this.M1 = c8cVar;
                this.N1 = iiVar;
                return;
            }
        }
        jf4.n(b1j.i(ohn0.class, "Cannot create dependency "));
    }

    public final void G0() {
        qog0 qog0Var = (qog0) this.R1.getValue();
        if (qog0Var != null) {
            qog0Var.f29072a.add(new lz9(qog0Var, this, (byte) 7));
            qog0Var.a();
        }
    }

    public final r0r H0() {
        Object objN = this.P1.n(Z1[0], this);
        objN.getClass();
        return (r0r) objN;
    }

    public final qm90 I0() {
        return (qm90) this.U1.getValue();
    }

    public final fin0 J0() {
        return (fin0) this.O1.getValue();
    }

    public final void K0() {
        ii iiVar = this.N1;
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
    }

    public final void L0(final boolean z) {
        c8c c8cVar = this.M1;
        if (c8cVar == null) {
            Intrinsics.h("checkSystemPermissionAccessProvider");
            throw null;
        }
        final byte b = 1;
        if (Build.VERSION.SDK_INT >= 30 || c8cVar.f3906a.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            c8c c8cVar2 = this.M1;
            if (c8cVar2 == null) {
                Intrinsics.h("checkSystemPermissionAccessProvider");
                throw null;
            }
            if (c8cVar2.f3906a.checkSelfPermission("android.permission.CAMERA") == 0) {
                return;
            }
            K0();
            final byte b2 = 0;
            ccq0.V(this, "CAMERA_PERMISSION_DIALOG", new Function0() { // from class: a.qhn0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    byte b3 = b2;
                    whn0 whn0Var = this;
                    boolean z2 = z;
                    switch (b3) {
                        case 0:
                            s2m0 s2m0Var = whn0.Y1;
                            if (z2) {
                                ValueCallback valueCallback = whn0Var.Q1;
                                if (valueCallback != null) {
                                    valueCallback.onReceiveValue(null);
                                }
                                whn0Var.Q1 = null;
                                kxq kxqVarN0 = whn0Var.n0();
                                Intent intentJ = hne.j("android.settings.APPLICATION_DETAILS_SETTINGS");
                                intentJ.setData(Uri.fromParts("package", kxqVarN0.getPackageName(), null));
                                kxqVarN0.startActivityForResult(intentJ, 531);
                            } else {
                                whn0Var.G0();
                            }
                            break;
                        default:
                            s2m0 s2m0Var2 = whn0.Y1;
                            if (z2) {
                                ValueCallback valueCallback2 = whn0Var.Q1;
                                if (valueCallback2 != null) {
                                    valueCallback2.onReceiveValue(null);
                                }
                                whn0Var.Q1 = null;
                                kxq kxqVarN1 = whn0Var.n0();
                                Intent intentJ2 = hne.j("android.settings.APPLICATION_DETAILS_SETTINGS");
                                intentJ2.setData(Uri.fromParts("package", kxqVarN1.getPackageName(), null));
                                kxqVarN1.startActivityForResult(intentJ2, 555);
                            } else {
                                whn0Var.G0();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            });
            ccq0.T(this, "CAMERA_PERMISSION_DIALOG", new phn0(this, b));
            return;
        }
        ii iiVar = this.N1;
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
        ccq0.V(this, "PERMISSION_DIALOG", new Function0() { // from class: a.qhn0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b;
                whn0 whn0Var = this;
                boolean z2 = z;
                switch (b3) {
                    case 0:
                        s2m0 s2m0Var = whn0.Y1;
                        if (z2) {
                            ValueCallback valueCallback = whn0Var.Q1;
                            if (valueCallback != null) {
                                valueCallback.onReceiveValue(null);
                            }
                            whn0Var.Q1 = null;
                            kxq kxqVarN0 = whn0Var.n0();
                            Intent intentJ = hne.j("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intentJ.setData(Uri.fromParts("package", kxqVarN0.getPackageName(), null));
                            kxqVarN0.startActivityForResult(intentJ, 531);
                        } else {
                            whn0Var.G0();
                        }
                        break;
                    default:
                        s2m0 s2m0Var2 = whn0.Y1;
                        if (z2) {
                            ValueCallback valueCallback2 = whn0Var.Q1;
                            if (valueCallback2 != null) {
                                valueCallback2.onReceiveValue(null);
                            }
                            whn0Var.Q1 = null;
                            kxq kxqVarN1 = whn0Var.n0();
                            Intent intentJ2 = hne.j("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intentJ2.setData(Uri.fromParts("package", kxqVarN1.getPackageName(), null));
                            kxqVarN1.startActivityForResult(intentJ2, 555);
                        } else {
                            whn0Var.G0();
                        }
                        break;
                }
                return Unit.f46060a;
            }
        });
        ccq0.T(this, "PERMISSION_DIALOG", new phn0(this, (byte) 5));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        Object serializable;
        super.W(bundle);
        if (bundle != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = bundle.getSerializable("BUNDLE_EXTRA_CONTAINER", pm90.class);
            } else {
                Object serializable2 = bundle.getSerializable("BUNDLE_EXTRA_CONTAINER");
                if (!(serializable2 instanceof pm90)) {
                    serializable2 = null;
                }
                serializable = (pm90) serializable2;
            }
            pm90 pm90Var = (pm90) serializable;
            if (pm90Var != null) {
                qm90 qm90VarI0 = I0();
                qm90VarI0.getClass();
                qm90VarI0.g = pm90Var;
            }
        }
        qm90 qm90VarI1 = I0();
        qm90VarI1.getClass();
        rhn0 rhn0Var = this.V1;
        rhn0Var.getClass();
        rhn0 rhn0Var2 = this.W1;
        rhn0Var2.getClass();
        qm90VarI1.c = rhn0Var;
        qm90VarI1.d = rhn0Var2;
        this.u1.a(I0());
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        hxm0.n(H0().f29644a);
        super.e0();
    }

    @Override // androidx.fragment.app.Fragment
    public final void f0(Bundle bundle) {
        bundle.putSerializable("BUNDLE_EXTRA_CONTAINER", I0().g);
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        hxm0.m(H0().f29644a);
        this.j1 = true;
    }

    @Override // a.cg60
    public final boolean j() {
        fin0 fin0VarJ0 = J0();
        fin0VarJ0.b.d(new xhn0(fin0VarJ0, (byte) 0));
        return false;
    }
}
