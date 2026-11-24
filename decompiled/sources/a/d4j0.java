package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/d4j0;", "La/yx5;", "<init>", "()V", "a/eke0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class d4j0 extends yx5 {
    public final hnm0 K1;
    public fiu0 L1;
    public ii M1;
    public final yzn0 N1;
    public final kiu0 O1;
    public final s0r P1;
    public final n0o0 Q1;
    public final ywq R1;
    public static final /* synthetic */ iiy[] U1 = {new ez40(d4j0.class, "bundleBalanceScreenType", "getBundleBalanceScreenType()Lorg/xplatform/balance/model/BalanceScreenType;", 0), new j0d0(d4j0.class, "binding", "getBinding()Lorg/xplatform/feature/office/make_bet_settings/impl/databinding/FragmentSettingsMakeBetBinding;", 0)};
    public static final eke0 S1 = new eke0();

    public d4j0() {
        super(R.layout.fragment_settings_make_bet);
        this.K1 = hnm0.f13359a;
        this.N1 = new yzn0("BALANCE_TYPE_BUNDLE_KEY");
        a4j0 a4j0Var = new a4j0(this, (byte) 9);
        byte b = 12;
        a8z a8zVarA = maz.a(wez.b, new l9i0(new l9i0(this, b), (byte) 13));
        byte b2 = 10;
        this.O1 = agc.G(this, sre0.f32672a.b(w5j0.class), new s9i0(a8zVarA, b2), new s9i0(a8zVarA, (byte) 11), a4j0Var);
        this.P1 = ltt0.o(this, c4j0.f3728a);
        this.Q1 = maz.b(new a4j0(this, b2));
        this.R1 = m0(new yl3(this, b), new xn((byte) 7));
    }

    public static /* synthetic */ void K0(d4j0 d4j0Var, String str, String str2, String str3, String str4, int i) {
        if ((i & 8) != 0) {
            str4 = d4j0Var.H(R.string.continue_action);
            str4.getClass();
        }
        String strH = d4j0Var.H(R.string.cancel);
        strH.getClass();
        d4j0Var.J0(str, str2, str3, str4, strH);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        final byte b = 0;
        mc50.a(G0().d, new a4j0(this, b));
        RecyclerView recyclerView = G0().c;
        final byte b2 = 1;
        recyclerView.setLayoutManager(new LinearLayoutManager(n0(), 1, false));
        recyclerView.setAdapter((y1j0) this.Q1.getValue());
        vvw.o(recyclerView, false, 3);
        ccq0.V(this, "APP_NOTIFICATION_SETTINGS_REQUEST_KEY", new a4j0(this, (byte) 7));
        ccq0.T(this, "APP_NOTIFICATION_SETTINGS_REQUEST_KEY", new a4j0(this, (byte) 8));
        ccq0.V(this, "SYSTEM_NOTIFICATION_SETTINGS_REQUEST_KEY", new a4j0(this, (byte) 3));
        ccq0.T(this, "SYSTEM_NOTIFICATION_SETTINGS_REQUEST_KEY", new a4j0(this, (byte) 4));
        ccq0.V(this, "AUTO_MAX_ACTIVATE_DIALOG_REQUEST_KEY", new a4j0(this, b2));
        ccq0.T(this, "AUTO_MAX_ACTIVATE_DIALOG_REQUEST_KEY", new a4j0(this, (byte) 2));
        ccq0.V(this, "VIP_ACTIVATE_DIALOG_REQUEST_KEY", new a4j0(this, (byte) 5));
        ccq0.T(this, "VIP_ACTIVATE_DIALOG_REQUEST_KEY", new a4j0(this, (byte) 6));
        sj3.A0(this, "DefaultBetSumBottomSheetKey", new Function2(this) { // from class: a.b4j0
            public final /* synthetic */ d4j0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                byte b3 = b2;
                d4j0 d4j0Var = this.b;
                String str = (String) obj;
                Bundle bundle2 = (Bundle) obj2;
                switch (b3) {
                    case 0:
                        eke0 eke0Var = d4j0.S1;
                        if (h97.B(bundle2, str, "QuickBetSumBottomSheetKey")) {
                            d4j0Var.I0().z(y4j0.f42005a);
                        }
                        break;
                    default:
                        eke0 eke0Var2 = d4j0.S1;
                        if (h97.B(bundle2, str, "DefaultBetSumBottomSheetKey")) {
                            d4j0Var.I0().z(new s4j0(bundle2.getDouble(str)));
                        }
                        break;
                }
                return Unit.f46060a;
            }
        });
        sj3.A0(this, "QuickBetSumBottomSheetKey", new Function2(this) { // from class: a.b4j0
            public final /* synthetic */ d4j0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                byte b3 = b;
                d4j0 d4j0Var = this.b;
                String str = (String) obj;
                Bundle bundle2 = (Bundle) obj2;
                switch (b3) {
                    case 0:
                        eke0 eke0Var = d4j0.S1;
                        if (h97.B(bundle2, str, "QuickBetSumBottomSheetKey")) {
                            d4j0Var.I0().z(y4j0.f42005a);
                        }
                        break;
                    default:
                        eke0 eke0Var2 = d4j0.S1;
                        if (h97.B(bundle2, str, "DefaultBetSumBottomSheetKey")) {
                            d4j0Var.I0().z(new s4j0(bundle2.getDouble(str)));
                        }
                        break;
                }
                return Unit.f46060a;
            }
        });
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(p2j0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            p2j0 p2j0Var = (p2j0) (ze3Var instanceof p2j0 ? ze3Var : null);
            if (p2j0Var != null) {
                i7i i7iVarA = p2j0Var.a(a4n0.f(this), H0());
                this.L1 = i7iVarA.x();
                this.M1 = (ii) i7iVarA.y;
                return;
            }
        }
        jf4.n(b1j.i(p2j0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        qaf0 qaf0Var = new qaf0(I0().A, (byte) 3);
        Class<d4j0> cls = d4j0.class;
        jbh0 jbh0Var = new jbh0(2, this, cls, "updateSettingsMakeBetUiState", "updateSettingsMakeBetUiState(Lorg/xplatform/make_bet_settings/impl/presentation/SettingsMakeBetUiState;)V", 4, (byte) 3);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new r7i0(qaf0Var, clzVarW, jbh0Var, (yje) null), 3);
        qaf0 qaf0Var2 = new qaf0(I0().B, (byte) 2);
        jbh0 jbh0Var2 = new jbh0(2, this, cls, "handleSettingsMakeBetUiEvent", "handleSettingsMakeBetUiEvent(Lorg/xplatform/make_bet_settings/impl/presentation/SettingsMakeBetUiEvent;)V", 4, (byte) 4);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new r7i0(qaf0Var2, clzVarW2, jbh0Var2, (yje) null, (byte) 0), 3);
    }

    public final t4r G0() {
        Object objN = this.P1.n(U1[1], this);
        objN.getClass();
        return (t4r) objN;
    }

    public final bm5 H0() {
        return (bm5) this.N1.n(this, U1[0]);
    }

    public final w5j0 I0() {
        return (w5j0) this.O1.getValue();
    }

    public final void J0(String str, String str2, String str3, String str4, String str5) {
        ii iiVar = this.M1;
        if (iiVar == null) {
            Intrinsics.h("actionDialogManager");
            throw null;
        }
        DialogFields dialogFields = new DialogFields((CharSequence) str, (CharSequence) str2, (CharSequence) str4, str5, (String) null, str3, (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
        androidx.fragment.app.e eVarC = C();
        eVarC.getClass();
        iiVar.d(dialogFields, eVarC);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        I0().z(v4j0.f36783a);
        G0().c.setAdapter(null);
        this.R1.b();
        super.Z();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        I0().z(new u4j0(H0()));
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.K1;
    }
}
