package a;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.app_update.api.presentation.AppUpdateScreenParams;
import org.xplatform.app_update.impl.presentation.apk_service.AppUpdateDownloadApkService;
import org.xplatform.app_update.impl.presentation.update_screen.views.AppUpdateScreenLayout;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/dm3;", "La/yx5;", "<init>", "()V", "a/qek0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class dm3 extends yx5 {
    public final e9o0 K1;
    public m8i L1;
    public ii M1;
    public final kiu0 N1;
    public final s0r O1;
    public final n0o0 P1;
    public final khf0 Q1;
    public AppUpdateDownloadApkService R1;
    public final ywq S1;
    public static final /* synthetic */ iiy[] V1 = {new j0d0(dm3.class, "binding", "getBinding()Lorg/xplatform/app_update/impl/databinding/AppUpdateFragmentBinding;", 0), new ez40(dm3.class, "params", "getParams()Lorg/xplatform/app_update/api/presentation/AppUpdateScreenParams;", 0)};
    public static final qek0 U1 = new qek0();

    public dm3() {
        super(R.layout.app_update_fragment);
        bp3 bp3Var = bp3.b;
        this.K1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitStaticBlack, bp3Var, bp3Var);
        byte b = 0;
        xl3 xl3Var = new xl3(this, b);
        a8z a8zVarA = maz.a(wez.b, new f80(new f80(this, (byte) 16), (byte) 17));
        this.N1 = agc.G(this, sre0.f32672a.b(on3.class), new t51(a8zVarA, (byte) 8), new t51(a8zVarA, (byte) 9), xl3Var);
        this.O1 = ltt0.o(this, zl3.f44562a);
        this.P1 = maz.b(new xl3(this, (byte) 1));
        this.Q1 = new khf0("APP_UPDATE_PARAMS");
        this.S1 = m0(new yl3(this, b), new xn((byte) 4));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        H0().c.setBackBtnClickedCallback(new xl3(this, (byte) 2));
        H0().c.setWhatsNewBtnClickedCallback(new xl3(this, (byte) 3));
        H0().c.setUpdateBtnClickedCallback(new xl3(this, (byte) 4));
        qcc.X(this, new xl3(this, (byte) 5));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(kk3.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            kk3 kk3Var = (kk3) (ze3Var instanceof kk3 ? ze3Var : null);
            if (kk3Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                AppUpdateScreenParams appUpdateScreenParams = (AppUpdateScreenParams) this.Q1.n(this, V1[1]);
                Application application2 = n0().getApplication();
                application2.getClass();
                esg0 esg0VarJ = y0x0.J(application2);
                i1w0VarF.getClass();
                iw20 iw20Var = kk3Var.f18417a;
                ot10 ot10Var = kk3Var.c;
                ii iiVar = kk3Var.e;
                oeg0 oeg0Var = kk3Var.d;
                ctf0 ctf0Var = kk3Var.f;
                bb6 bb6Var = kk3Var.g;
                cad cadVar = kk3Var.h;
                wdk0 wdk0Var = kk3Var.i;
                nv20 nv20Var = kk3Var.b;
                ntu ntuVar = kk3Var.j;
                bzt bztVar = kk3Var.k;
                aqt aqtVar = kk3Var.l;
                us3 us3Var = kk3Var.m;
                knf0 knf0Var = kk3Var.n;
                m1e m1eVar = kk3Var.o;
                lsn lsnVar = kk3Var.p;
                peg0 peg0Var = kk3Var.q;
                eg3 eg3Var = kk3Var.r;
                kt2 kt2Var = kk3Var.t;
                e41 e41Var = kk3Var.s;
                eg3Var.getClass();
                iiVar.getClass();
                oeg0Var.getClass();
                ctf0Var.getClass();
                wdk0Var.getClass();
                aqtVar.getClass();
                us3Var.getClass();
                knf0Var.getClass();
                m1eVar.getClass();
                kt2Var.getClass();
                this.L1 = (m8i) ((n5d0) new v5i(cadVar, iw20Var, nv20Var, esg0VarJ, lsnVar, peg0Var, eg3Var, i1w0VarF, iiVar, ot10Var, appUpdateScreenParams, ctf0Var, bb6Var, wdk0Var, ntuVar, bztVar, aqtVar, us3Var, knf0Var, m1eVar, e41Var, kt2Var).v).get();
                this.M1 = iiVar;
                return;
            }
        }
        jf4.n(b1j.i(kk3.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        on3 on3VarI0 = I0();
        lr lrVar = new lr(on3VarI0.r, (byte) 17);
        sy2 sy2Var = new sy2((byte) 26);
        jbp jbpVar = i120.g;
        c00 c00Var = new c00(i120.X(lrVar, sy2Var, jbpVar), on3VarI0, (byte) 9);
        yje yjeVar = null;
        cm3 cm3Var = new cm3(this, yjeVar, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new tg3(c00Var, clzVarW, cm3Var, (yje) null), 3);
        on3 on3VarI1 = I0();
        c00 c00Var2 = new c00(on3VarI1.r, on3VarI1, (byte) 10);
        int i = 4;
        Class<dm3> cls = dm3.class;
        i8 i8Var = new i8(2, this, cls, "handleUiState", "handleUiState(Lorg/xplatform/app_update/impl/presentation/update_screen/model/AppUpdateUiState;)V", i, (byte) 26);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new tg3(c00Var2, clzVarW2, i8Var, (yje) null), 3);
        lr lrVar2 = new lr(I0().s, (byte) 16);
        lkz lkzVar2 = lkz.f20223a;
        i8 i8Var2 = new i8(2, this, cls, "handleEvent", "handleEvent(Lorg/xplatform/app_update/impl/presentation/update_screen/AppUpdateEvent;)V", i, (byte) 27);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new tg3(lrVar2, clzVarW3, i8Var2, (yje) null, (byte) 0), 3);
        ji3 ji3Var = new ji3(i120.X(I0().r, new sy2((byte) 27), jbpVar), (byte) 2);
        pa paVar = new pa((Object) this, yjeVar, (byte) 29);
        clz clzVarW4 = aac.W(this);
        qjj.W(x0x.Q(clzVarW4.x()), null, null, new tg3(ji3Var, clzVarW4, paVar, (yje) null, (byte) 0), 3);
    }

    public final void G0() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            if (i < 26 || n0().getPackageManager().canRequestPackageInstalls()) {
                I0().x(ek3.f7935a);
                return;
            }
            ii iiVar = this.M1;
            if (iiVar == null) {
                Intrinsics.h("actionDialogManager");
                throw null;
            }
            String strH = H(R.string.caution);
            String strH2 = H(R.string.permission_message_install);
            String strH3 = H(R.string.open_settings);
            strH3.getClass();
            DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, H(R.string.cancel), (String) null, "PERMISSION_DIALOG", (String) null, (ActionDialogButtonStyle) null, n12.b, true, 464);
            androidx.fragment.app.e eVarC = C();
            eVarC.getClass();
            iiVar.d(dialogFields, eVarC);
        }
    }

    public final em3 H0() {
        Object objN = this.O1.n(V1[0], this);
        objN.getClass();
        return (em3) objN;
    }

    public final on3 I0() {
        return (on3) this.N1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        bcm0.x(n0().getWindow(), false);
        ccq0.V(this, "PERMISSION_DIALOG", new xl3(this, (byte) 6));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        kxq kxqVarB;
        AppUpdateScreenLayout appUpdateScreenLayout = H0().c;
        org.xplatform.ui_core.viewcomponents.smart_background.e eVar = (org.xplatform.ui_core.viewcomponents.smart_background.e) appUpdateScreenLayout.findViewById(R.id.smart_background_video);
        if ((appUpdateScreenLayout.s instanceof gbk0) && eVar != null) {
            eVar.a();
        }
        if (F().J(this.B) == null || this.m || ((kxqVarB = B()) != null && kxqVarB.isFinishing())) {
            y0x0.o = null;
        }
        AppUpdateDownloadApkService appUpdateDownloadApkService = this.R1;
        if (appUpdateDownloadApkService != null) {
            appUpdateDownloadApkService.a();
            Context contextD = D();
            if (contextD != null) {
                contextD.unbindService((am3) this.P1.getValue());
            }
        }
        super.Z();
    }

    @Override // a.yx5
    public final j9o0 z0() {
        return this.K1;
    }
}
