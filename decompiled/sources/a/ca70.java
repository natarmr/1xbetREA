package a;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/ca70;", "La/yx5;", "<init>", "()V", "a/htz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ca70 extends yx5 {
    public smi K1;
    public z7z L1;
    public z7z M1;
    public z7z N1;
    public kl5 O1;
    public z7z P1;
    public final s0r Q1;
    public final a8z R1;
    public final n0o0 S1;
    public static final /* synthetic */ iiy[] V1 = {new j0d0(ca70.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final htz U1 = new htz();

    public ca70() {
        super(R.layout.compose_fragment);
        this.Q1 = ltt0.o(this, ba70.f2246a);
        this.R1 = xbc.a0(this, sre0.f32672a.b(xd70.class), null, new w970(this, (byte) 0), 14);
        this.S1 = maz.b(new w970(this, (byte) 8));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        if (bundle != null && C().J("OneXGamesWebGameDisableDemoBottomDialog.TAG") != null) {
            H0().x(t670.f33402a);
        }
        ccq0.V(this, "CHANGE_ACCOUNT_TO_PRIMARY_DIALOG", new w970(this, (byte) 13));
        final byte b = 2;
        ccq0.V(this, "DEMO_BONUS_DIALOG", new w970(this, b));
        final byte b2 = 3;
        ccq0.T(this, "DEMO_BONUS_DIALOG", new w970(this, b2));
        C().u0("DEMO_DISABLE_DIALOG", this, new k4r(this) { // from class: a.x970
            public final /* synthetic */ ca70 b;

            {
                this.b = this;
            }

            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                Object serializable;
                byte b3 = b2;
                ca70 ca70Var = this.b;
                switch (b3) {
                    case 0:
                        htz htzVar = ca70.U1;
                        str.getClass();
                        if (str.equals("BALANCE_SELECTOR")) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable = bundle2.getSerializable("RESULT_ON_ITEM_SELECTED_LISTENER_KEY", ql5.class);
                            } else {
                                Object serializable2 = bundle2.getSerializable("RESULT_ON_ITEM_SELECTED_LISTENER_KEY");
                                if (!(serializable2 instanceof ql5)) {
                                    serializable2 = null;
                                }
                                serializable = (ql5) serializable2;
                            }
                            ql5 ql5Var = (ql5) serializable;
                            if (ql5Var != null) {
                                ca70Var.H0().x(new o670(ql5Var));
                            }
                            break;
                        }
                        break;
                    case 1:
                        htz htzVar2 = ca70.U1;
                        str.getClass();
                        if (str.equals("UNFINISHED_GAME_DIALOG")) {
                            if (bundle2.containsKey("GameIsNotFinishedDialog.RESULT_KEY_CONTINUE")) {
                                ca70Var.H0().x(new q770(bundle2.getBoolean("GameIsNotFinishedDialog.RESULT_KEY_CONTINUE")));
                            } else if (bundle2.containsKey("GameIsNotFinishedDialog.RESULT_KEY_EXIT")) {
                                ca70Var.H0().x(new r770(bundle2.getBoolean("GameIsNotFinishedDialog.RESULT_KEY_EXIT")));
                            }
                            break;
                        }
                        break;
                    case 2:
                        htz htzVar3 = ca70.U1;
                        str.getClass();
                        if (str.equals("DEMO_UNAVAILABLE_DIALOG")) {
                            if (bundle2.containsKey("OneXGamesWebGame.UNAUTHORIZED_DEMO_DIALOG_RESULT_LOGIN_KEY")) {
                                ca70Var.H0().x(o770.f24772a);
                            } else if (bundle2.containsKey("OneXGamesWebGame.UNAUTHORIZED_DEMO_DIALOG_RESULT_REGISTRATION_KEY")) {
                                ca70Var.H0().x(p770.f26494a);
                            } else if (bundle2.containsKey("OneXGamesWebGame.UNAUTHORIZED_DEMO_DIALOG_RESULT_EXIT_KEY")) {
                                ca70Var.H0().x(n770.f23028a);
                            }
                            break;
                        }
                        break;
                    case 3:
                        htz htzVar4 = ca70.U1;
                        str.getClass();
                        if (str.equals("DEMO_DISABLE_DIALOG")) {
                            if (!bundle2.containsKey("OneXGamesWebGame.DISABLE_DEMO_DIALOG_RESULT_DISMISS_KEY")) {
                                ca70Var.H0().x(j770.f16028a);
                            } else {
                                ca70Var.H0().x(i770.f14280a);
                            }
                            break;
                        }
                        break;
                    default:
                        htz htzVar5 = ca70.U1;
                        str.getClass();
                        if (str.equals("DEMO_UNAUTHORIZED_DIALOG")) {
                            if (bundle2.containsKey("OneXGamesWebGame.UNAUTHORIZED_DEMO_DIALOG_RESULT_LOGIN_KEY")) {
                                ca70Var.H0().x(l770.f19544a);
                            } else if (bundle2.containsKey("OneXGamesWebGame.UNAUTHORIZED_DEMO_DIALOG_RESULT_REGISTRATION_KEY")) {
                                ca70Var.H0().x(m770.f21306a);
                            }
                            break;
                        }
                        break;
                }
            }
        });
        final byte b3 = 1;
        ccq0.V(this, "DEMO_REPLENISH_DIALOG", new w970(this, b3));
        final byte b4 = 4;
        C().u0("DEMO_UNAUTHORIZED_DIALOG", this, new k4r(this) { // from class: a.x970
            public final /* synthetic */ ca70 b;

            {
                this.b = this;
            }

            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                Object serializable;
                byte b5 = b4;
                ca70 ca70Var = this.b;
                switch (b5) {
                    case 0:
                        htz htzVar = ca70.U1;
                        str.getClass();
                        if (str.equals("BALANCE_SELECTOR")) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable = bundle2.getSerializable("RESULT_ON_ITEM_SELECTED_LISTENER_KEY", ql5.class);
                            } else {
                                Object serializable2 = bundle2.getSerializable("RESULT_ON_ITEM_SELECTED_LISTENER_KEY");
                                if (!(serializable2 instanceof ql5)) {
                                    serializable2 = null;
                                }
                                serializable = (ql5) serializable2;
                            }
                            ql5 ql5Var = (ql5) serializable;
                            if (ql5Var != null) {
                                ca70Var.H0().x(new o670(ql5Var));
                            }
                            break;
                        }
                        break;
                    case 1:
                        htz htzVar2 = ca70.U1;
                        str.getClass();
                        if (str.equals("UNFINISHED_GAME_DIALOG")) {
                            if (bundle2.containsKey("GameIsNotFinishedDialog.RESULT_KEY_CONTINUE")) {
                                ca70Var.H0().x(new q770(bundle2.getBoolean("GameIsNotFinishedDialog.RESULT_KEY_CONTINUE")));
                            } else if (bundle2.containsKey("GameIsNotFinishedDialog.RESULT_KEY_EXIT")) {
                                ca70Var.H0().x(new r770(bundle2.getBoolean("GameIsNotFinishedDialog.RESULT_KEY_EXIT")));
                            }
                            break;
                        }
                        break;
                    case 2:
                        htz htzVar3 = ca70.U1;
                        str.getClass();
                        if (str.equals("DEMO_UNAVAILABLE_DIALOG")) {
                            if (bundle2.containsKey("OneXGamesWebGame.UNAUTHORIZED_DEMO_DIALOG_RESULT_LOGIN_KEY")) {
                                ca70Var.H0().x(o770.f24772a);
                            } else if (bundle2.containsKey("OneXGamesWebGame.UNAUTHORIZED_DEMO_DIALOG_RESULT_REGISTRATION_KEY")) {
                                ca70Var.H0().x(p770.f26494a);
                            } else if (bundle2.containsKey("OneXGamesWebGame.UNAUTHORIZED_DEMO_DIALOG_RESULT_EXIT_KEY")) {
                                ca70Var.H0().x(n770.f23028a);
                            }
                            break;
                        }
                        break;
                    case 3:
                        htz htzVar4 = ca70.U1;
                        str.getClass();
                        if (str.equals("DEMO_DISABLE_DIALOG")) {
                            if (!bundle2.containsKey("OneXGamesWebGame.DISABLE_DEMO_DIALOG_RESULT_DISMISS_KEY")) {
                                ca70Var.H0().x(j770.f16028a);
                            } else {
                                ca70Var.H0().x(i770.f14280a);
                            }
                            break;
                        }
                        break;
                    default:
                        htz htzVar5 = ca70.U1;
                        str.getClass();
                        if (str.equals("DEMO_UNAUTHORIZED_DIALOG")) {
                            if (bundle2.containsKey("OneXGamesWebGame.UNAUTHORIZED_DEMO_DIALOG_RESULT_LOGIN_KEY")) {
                                ca70Var.H0().x(l770.f19544a);
                            } else if (bundle2.containsKey("OneXGamesWebGame.UNAUTHORIZED_DEMO_DIALOG_RESULT_REGISTRATION_KEY")) {
                                ca70Var.H0().x(m770.f21306a);
                            }
                            break;
                        }
                        break;
                }
            }
        });
        ccq0.V(this, "DEMO_UNAVAILABLE_DIALOG", new w970(this, (byte) 9));
        C().u0("DEMO_UNAVAILABLE_DIALOG", this, new k4r(this) { // from class: a.x970
            public final /* synthetic */ ca70 b;

            {
                this.b = this;
            }

            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                Object serializable;
                byte b5 = b;
                ca70 ca70Var = this.b;
                switch (b5) {
                    case 0:
                        htz htzVar = ca70.U1;
                        str.getClass();
                        if (str.equals("BALANCE_SELECTOR")) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable = bundle2.getSerializable("RESULT_ON_ITEM_SELECTED_LISTENER_KEY", ql5.class);
                            } else {
                                Object serializable2 = bundle2.getSerializable("RESULT_ON_ITEM_SELECTED_LISTENER_KEY");
                                if (!(serializable2 instanceof ql5)) {
                                    serializable2 = null;
                                }
                                serializable = (ql5) serializable2;
                            }
                            ql5 ql5Var = (ql5) serializable;
                            if (ql5Var != null) {
                                ca70Var.H0().x(new o670(ql5Var));
                            }
                            break;
                        }
                        break;
                    case 1:
                        htz htzVar2 = ca70.U1;
                        str.getClass();
                        if (str.equals("UNFINISHED_GAME_DIALOG")) {
                            if (bundle2.containsKey("GameIsNotFinishedDialog.RESULT_KEY_CONTINUE")) {
                                ca70Var.H0().x(new q770(bundle2.getBoolean("GameIsNotFinishedDialog.RESULT_KEY_CONTINUE")));
                            } else if (bundle2.containsKey("GameIsNotFinishedDialog.RESULT_KEY_EXIT")) {
                                ca70Var.H0().x(new r770(bundle2.getBoolean("GameIsNotFinishedDialog.RESULT_KEY_EXIT")));
                            }
                            break;
                        }
                        break;
                    case 2:
                        htz htzVar3 = ca70.U1;
                        str.getClass();
                        if (str.equals("DEMO_UNAVAILABLE_DIALOG")) {
                            if (bundle2.containsKey("OneXGamesWebGame.UNAUTHORIZED_DEMO_DIALOG_RESULT_LOGIN_KEY")) {
                                ca70Var.H0().x(o770.f24772a);
                            } else if (bundle2.containsKey("OneXGamesWebGame.UNAUTHORIZED_DEMO_DIALOG_RESULT_REGISTRATION_KEY")) {
                                ca70Var.H0().x(p770.f26494a);
                            } else if (bundle2.containsKey("OneXGamesWebGame.UNAUTHORIZED_DEMO_DIALOG_RESULT_EXIT_KEY")) {
                                ca70Var.H0().x(n770.f23028a);
                            }
                            break;
                        }
                        break;
                    case 3:
                        htz htzVar4 = ca70.U1;
                        str.getClass();
                        if (str.equals("DEMO_DISABLE_DIALOG")) {
                            if (!bundle2.containsKey("OneXGamesWebGame.DISABLE_DEMO_DIALOG_RESULT_DISMISS_KEY")) {
                                ca70Var.H0().x(j770.f16028a);
                            } else {
                                ca70Var.H0().x(i770.f14280a);
                            }
                            break;
                        }
                        break;
                    default:
                        htz htzVar5 = ca70.U1;
                        str.getClass();
                        if (str.equals("DEMO_UNAUTHORIZED_DIALOG")) {
                            if (bundle2.containsKey("OneXGamesWebGame.UNAUTHORIZED_DEMO_DIALOG_RESULT_LOGIN_KEY")) {
                                ca70Var.H0().x(l770.f19544a);
                            } else if (bundle2.containsKey("OneXGamesWebGame.UNAUTHORIZED_DEMO_DIALOG_RESULT_REGISTRATION_KEY")) {
                                ca70Var.H0().x(m770.f21306a);
                            }
                            break;
                        }
                        break;
                }
            }
        });
        ccq0.V(this, "RESTART_PAGE_DIALOG", new w970(this, b4));
        ccq0.T(this, "RESTART_PAGE_DIALOG", new w970(this, (byte) 5));
        C().u0("UNFINISHED_GAME_DIALOG", this, new k4r(this) { // from class: a.x970
            public final /* synthetic */ ca70 b;

            {
                this.b = this;
            }

            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                Object serializable;
                byte b5 = b3;
                ca70 ca70Var = this.b;
                switch (b5) {
                    case 0:
                        htz htzVar = ca70.U1;
                        str.getClass();
                        if (str.equals("BALANCE_SELECTOR")) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable = bundle2.getSerializable("RESULT_ON_ITEM_SELECTED_LISTENER_KEY", ql5.class);
                            } else {
                                Object serializable2 = bundle2.getSerializable("RESULT_ON_ITEM_SELECTED_LISTENER_KEY");
                                if (!(serializable2 instanceof ql5)) {
                                    serializable2 = null;
                                }
                                serializable = (ql5) serializable2;
                            }
                            ql5 ql5Var = (ql5) serializable;
                            if (ql5Var != null) {
                                ca70Var.H0().x(new o670(ql5Var));
                            }
                            break;
                        }
                        break;
                    case 1:
                        htz htzVar2 = ca70.U1;
                        str.getClass();
                        if (str.equals("UNFINISHED_GAME_DIALOG")) {
                            if (bundle2.containsKey("GameIsNotFinishedDialog.RESULT_KEY_CONTINUE")) {
                                ca70Var.H0().x(new q770(bundle2.getBoolean("GameIsNotFinishedDialog.RESULT_KEY_CONTINUE")));
                            } else if (bundle2.containsKey("GameIsNotFinishedDialog.RESULT_KEY_EXIT")) {
                                ca70Var.H0().x(new r770(bundle2.getBoolean("GameIsNotFinishedDialog.RESULT_KEY_EXIT")));
                            }
                            break;
                        }
                        break;
                    case 2:
                        htz htzVar3 = ca70.U1;
                        str.getClass();
                        if (str.equals("DEMO_UNAVAILABLE_DIALOG")) {
                            if (bundle2.containsKey("OneXGamesWebGame.UNAUTHORIZED_DEMO_DIALOG_RESULT_LOGIN_KEY")) {
                                ca70Var.H0().x(o770.f24772a);
                            } else if (bundle2.containsKey("OneXGamesWebGame.UNAUTHORIZED_DEMO_DIALOG_RESULT_REGISTRATION_KEY")) {
                                ca70Var.H0().x(p770.f26494a);
                            } else if (bundle2.containsKey("OneXGamesWebGame.UNAUTHORIZED_DEMO_DIALOG_RESULT_EXIT_KEY")) {
                                ca70Var.H0().x(n770.f23028a);
                            }
                            break;
                        }
                        break;
                    case 3:
                        htz htzVar4 = ca70.U1;
                        str.getClass();
                        if (str.equals("DEMO_DISABLE_DIALOG")) {
                            if (!bundle2.containsKey("OneXGamesWebGame.DISABLE_DEMO_DIALOG_RESULT_DISMISS_KEY")) {
                                ca70Var.H0().x(j770.f16028a);
                            } else {
                                ca70Var.H0().x(i770.f14280a);
                            }
                            break;
                        }
                        break;
                    default:
                        htz htzVar5 = ca70.U1;
                        str.getClass();
                        if (str.equals("DEMO_UNAUTHORIZED_DIALOG")) {
                            if (bundle2.containsKey("OneXGamesWebGame.UNAUTHORIZED_DEMO_DIALOG_RESULT_LOGIN_KEY")) {
                                ca70Var.H0().x(l770.f19544a);
                            } else if (bundle2.containsKey("OneXGamesWebGame.UNAUTHORIZED_DEMO_DIALOG_RESULT_REGISTRATION_KEY")) {
                                ca70Var.H0().x(m770.f21306a);
                            }
                            break;
                        }
                        break;
                }
            }
        });
        final byte b5 = 0;
        C().u0("BALANCE_SELECTOR", this, new k4r(this) { // from class: a.x970
            public final /* synthetic */ ca70 b;

            {
                this.b = this;
            }

            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                Object serializable;
                byte b6 = b5;
                ca70 ca70Var = this.b;
                switch (b6) {
                    case 0:
                        htz htzVar = ca70.U1;
                        str.getClass();
                        if (str.equals("BALANCE_SELECTOR")) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable = bundle2.getSerializable("RESULT_ON_ITEM_SELECTED_LISTENER_KEY", ql5.class);
                            } else {
                                Object serializable2 = bundle2.getSerializable("RESULT_ON_ITEM_SELECTED_LISTENER_KEY");
                                if (!(serializable2 instanceof ql5)) {
                                    serializable2 = null;
                                }
                                serializable = (ql5) serializable2;
                            }
                            ql5 ql5Var = (ql5) serializable;
                            if (ql5Var != null) {
                                ca70Var.H0().x(new o670(ql5Var));
                            }
                            break;
                        }
                        break;
                    case 1:
                        htz htzVar2 = ca70.U1;
                        str.getClass();
                        if (str.equals("UNFINISHED_GAME_DIALOG")) {
                            if (bundle2.containsKey("GameIsNotFinishedDialog.RESULT_KEY_CONTINUE")) {
                                ca70Var.H0().x(new q770(bundle2.getBoolean("GameIsNotFinishedDialog.RESULT_KEY_CONTINUE")));
                            } else if (bundle2.containsKey("GameIsNotFinishedDialog.RESULT_KEY_EXIT")) {
                                ca70Var.H0().x(new r770(bundle2.getBoolean("GameIsNotFinishedDialog.RESULT_KEY_EXIT")));
                            }
                            break;
                        }
                        break;
                    case 2:
                        htz htzVar3 = ca70.U1;
                        str.getClass();
                        if (str.equals("DEMO_UNAVAILABLE_DIALOG")) {
                            if (bundle2.containsKey("OneXGamesWebGame.UNAUTHORIZED_DEMO_DIALOG_RESULT_LOGIN_KEY")) {
                                ca70Var.H0().x(o770.f24772a);
                            } else if (bundle2.containsKey("OneXGamesWebGame.UNAUTHORIZED_DEMO_DIALOG_RESULT_REGISTRATION_KEY")) {
                                ca70Var.H0().x(p770.f26494a);
                            } else if (bundle2.containsKey("OneXGamesWebGame.UNAUTHORIZED_DEMO_DIALOG_RESULT_EXIT_KEY")) {
                                ca70Var.H0().x(n770.f23028a);
                            }
                            break;
                        }
                        break;
                    case 3:
                        htz htzVar4 = ca70.U1;
                        str.getClass();
                        if (str.equals("DEMO_DISABLE_DIALOG")) {
                            if (!bundle2.containsKey("OneXGamesWebGame.DISABLE_DEMO_DIALOG_RESULT_DISMISS_KEY")) {
                                ca70Var.H0().x(j770.f16028a);
                            } else {
                                ca70Var.H0().x(i770.f14280a);
                            }
                            break;
                        }
                        break;
                    default:
                        htz htzVar5 = ca70.U1;
                        str.getClass();
                        if (str.equals("DEMO_UNAUTHORIZED_DIALOG")) {
                            if (bundle2.containsKey("OneXGamesWebGame.UNAUTHORIZED_DEMO_DIALOG_RESULT_LOGIN_KEY")) {
                                ca70Var.H0().x(l770.f19544a);
                            } else if (bundle2.containsKey("OneXGamesWebGame.UNAUTHORIZED_DEMO_DIALOG_RESULT_REGISTRATION_KEY")) {
                                ca70Var.H0().x(m770.f21306a);
                            }
                            break;
                        }
                        break;
                }
            }
        });
        ccq0.V(this, "SECTION_BALANCE_EXPIRED_DIALOG", new w970(this, (byte) 14));
        ccq0.V(this, "BONUS_BALANCE_UNAVAILABLE_DIALOG", new w970(this, (byte) 6));
        ccq0.V(this, "SPORT_BONUS_BALANCE_UNAVAILABLE_DIALOG", new w970(this, (byte) 7));
        ccq0.V(this, "TECHNICAL_WORKS_DIALOG_REQUEST_KEY", new w970(this, (byte) 12));
        if (this.O1 == null) {
            Intrinsics.h("bonusesResultListener");
            throw null;
        }
        F().u0("BonusesFeature.BONUS_RESULT_KEY", this, new jk8(new Function2(this) { // from class: a.y970
            public final /* synthetic */ ca70 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                byte b6 = b3;
                final ca70 ca70Var = this.b;
                switch (b6) {
                    case 0:
                        fet fetVar = (fet) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        htz htzVar = ca70.U1;
                        final byte b7 = 0;
                        final byte b8 = 1;
                        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                            final Activity activity = (Activity) fetVar.k(cr00.f4820a);
                            clz clzVar = (clz) fetVar.k(or00.f25714a);
                            cc70 cc70Var = (cc70) ((i3t0) ca70Var.H0()).y(fetVar).getValue();
                            k3t0 k3t0VarH0 = ca70Var.H0();
                            boolean zI = fetVar.i(ca70Var);
                            Object objP = fetVar.P();
                            cl5 cl5Var = ukd.f35823a;
                            if (zI || objP == cl5Var) {
                                objP = new cd60((Object) ca70Var, (byte) 14);
                                fetVar.o0(objP);
                            }
                            lkz lkzVar = lkz.f20223a;
                            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) objP, fetVar);
                            boolean zI2 = fetVar.i(k3t0VarH0) | fetVar.i(clzVar) | fetVar.e(3) | fetVar.g(pz40VarF);
                            Object objP2 = fetVar.P();
                            if (zI2 || objP2 == cl5Var) {
                                rxt0 rxt0Var = new rxt0(k3t0VarH0, clzVar, pz40VarF, null, (byte) 1);
                                fetVar.o0(rxt0Var);
                                objP2 = rxt0Var;
                            }
                            m0x0.t(fetVar, clzVar, (Function2) objP2);
                            boolean zI3 = fetVar.i(activity) | fetVar.i(ca70Var);
                            Object objP3 = fetVar.P();
                            if (zI3 || objP3 == cl5Var) {
                                objP3 = new Function0() { // from class: a.z970
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Window window;
                                        Window window2;
                                        byte b9 = b7;
                                        ca70 ca70Var2 = ca70Var;
                                        Activity activity2 = activity;
                                        switch (b9) {
                                            case 0:
                                                htz htzVar2 = ca70.U1;
                                                if (activity2 != null && (window = activity2.getWindow()) != null) {
                                                    window.addFlags(128);
                                                }
                                                ca70Var2.H0().x(v670.f36861a);
                                                break;
                                            default:
                                                htz htzVar3 = ca70.U1;
                                                if (activity2 != null && (window2 = activity2.getWindow()) != null) {
                                                    window2.clearFlags(128);
                                                }
                                                ca70Var2.H0().x(u670.f35125a);
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                };
                                fetVar.o0(objP3);
                            }
                            Function0 function0 = (Function0) objP3;
                            boolean zI4 = fetVar.i(activity) | fetVar.i(ca70Var);
                            Object objP4 = fetVar.P();
                            if (zI4 || objP4 == cl5Var) {
                                objP4 = new Function0() { // from class: a.z970
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Window window;
                                        Window window2;
                                        byte b9 = b8;
                                        ca70 ca70Var2 = ca70Var;
                                        Activity activity2 = activity;
                                        switch (b9) {
                                            case 0:
                                                htz htzVar2 = ca70.U1;
                                                if (activity2 != null && (window = activity2.getWindow()) != null) {
                                                    window.addFlags(128);
                                                }
                                                ca70Var2.H0().x(v670.f36861a);
                                                break;
                                            default:
                                                htz htzVar3 = ca70.U1;
                                                if (activity2 != null && (window2 = activity2.getWindow()) != null) {
                                                    window2.clearFlags(128);
                                                }
                                                ca70Var2.H0().x(u670.f35125a);
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                };
                                fetVar.o0(objP4);
                            }
                            v3c.z(function0, (Function0) objP4, null, fetVar, 0, 4);
                            n0q n0qVar = o7k0.c;
                            k3t0 k3t0VarH1 = ca70Var.H0();
                            boolean zI5 = fetVar.i(k3t0VarH1);
                            Object objP5 = fetVar.P();
                            if (zI5 || objP5 == cl5Var) {
                                cy60 cy60Var = new cy60(1, k3t0VarH1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 13);
                                fetVar.o0(cy60Var);
                                objP5 = cy60Var;
                            }
                            cwr0.A(n0qVar, cc70Var, (Function1) ((jhy) objP5), fetVar, 6);
                        } else {
                            fetVar.X();
                        }
                        break;
                    default:
                        csr csrVar = (csr) obj;
                        long jLongValue = ((Long) obj2).longValue();
                        htz htzVar2 = ca70.U1;
                        csrVar.getClass();
                        ca70Var.H0().x(new r670(jLongValue, csrVar));
                        break;
                }
                return Unit.f46060a;
            }
        }, b5));
        Object objN = this.Q1.n(V1[0], this);
        objN.getClass();
        b1j.t(((aid) objN).b, new ugd(1427390242, true, new Function2(this) { // from class: a.y970
            public final /* synthetic */ ca70 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                byte b6 = b5;
                final ca70 ca70Var = this.b;
                switch (b6) {
                    case 0:
                        fet fetVar = (fet) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        htz htzVar = ca70.U1;
                        final byte b7 = 0;
                        final byte b8 = 1;
                        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                            final Activity activity = (Activity) fetVar.k(cr00.f4820a);
                            clz clzVar = (clz) fetVar.k(or00.f25714a);
                            cc70 cc70Var = (cc70) ((i3t0) ca70Var.H0()).y(fetVar).getValue();
                            k3t0 k3t0VarH0 = ca70Var.H0();
                            boolean zI = fetVar.i(ca70Var);
                            Object objP = fetVar.P();
                            cl5 cl5Var = ukd.f35823a;
                            if (zI || objP == cl5Var) {
                                objP = new cd60((Object) ca70Var, (byte) 14);
                                fetVar.o0(objP);
                            }
                            lkz lkzVar = lkz.f20223a;
                            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) objP, fetVar);
                            boolean zI2 = fetVar.i(k3t0VarH0) | fetVar.i(clzVar) | fetVar.e(3) | fetVar.g(pz40VarF);
                            Object objP2 = fetVar.P();
                            if (zI2 || objP2 == cl5Var) {
                                rxt0 rxt0Var = new rxt0(k3t0VarH0, clzVar, pz40VarF, null, (byte) 1);
                                fetVar.o0(rxt0Var);
                                objP2 = rxt0Var;
                            }
                            m0x0.t(fetVar, clzVar, (Function2) objP2);
                            boolean zI3 = fetVar.i(activity) | fetVar.i(ca70Var);
                            Object objP3 = fetVar.P();
                            if (zI3 || objP3 == cl5Var) {
                                objP3 = new Function0() { // from class: a.z970
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Window window;
                                        Window window2;
                                        byte b9 = b7;
                                        ca70 ca70Var2 = ca70Var;
                                        Activity activity2 = activity;
                                        switch (b9) {
                                            case 0:
                                                htz htzVar2 = ca70.U1;
                                                if (activity2 != null && (window = activity2.getWindow()) != null) {
                                                    window.addFlags(128);
                                                }
                                                ca70Var2.H0().x(v670.f36861a);
                                                break;
                                            default:
                                                htz htzVar3 = ca70.U1;
                                                if (activity2 != null && (window2 = activity2.getWindow()) != null) {
                                                    window2.clearFlags(128);
                                                }
                                                ca70Var2.H0().x(u670.f35125a);
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                };
                                fetVar.o0(objP3);
                            }
                            Function0 function0 = (Function0) objP3;
                            boolean zI4 = fetVar.i(activity) | fetVar.i(ca70Var);
                            Object objP4 = fetVar.P();
                            if (zI4 || objP4 == cl5Var) {
                                objP4 = new Function0() { // from class: a.z970
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Window window;
                                        Window window2;
                                        byte b9 = b8;
                                        ca70 ca70Var2 = ca70Var;
                                        Activity activity2 = activity;
                                        switch (b9) {
                                            case 0:
                                                htz htzVar2 = ca70.U1;
                                                if (activity2 != null && (window = activity2.getWindow()) != null) {
                                                    window.addFlags(128);
                                                }
                                                ca70Var2.H0().x(v670.f36861a);
                                                break;
                                            default:
                                                htz htzVar3 = ca70.U1;
                                                if (activity2 != null && (window2 = activity2.getWindow()) != null) {
                                                    window2.clearFlags(128);
                                                }
                                                ca70Var2.H0().x(u670.f35125a);
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                };
                                fetVar.o0(objP4);
                            }
                            v3c.z(function0, (Function0) objP4, null, fetVar, 0, 4);
                            n0q n0qVar = o7k0.c;
                            k3t0 k3t0VarH1 = ca70Var.H0();
                            boolean zI5 = fetVar.i(k3t0VarH1);
                            Object objP5 = fetVar.P();
                            if (zI5 || objP5 == cl5Var) {
                                cy60 cy60Var = new cy60(1, k3t0VarH1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 13);
                                fetVar.o0(cy60Var);
                                objP5 = cy60Var;
                            }
                            cwr0.A(n0qVar, cc70Var, (Function1) ((jhy) objP5), fetVar, 6);
                        } else {
                            fetVar.X();
                        }
                        break;
                    default:
                        csr csrVar = (csr) obj;
                        long jLongValue = ((Long) obj2).longValue();
                        htz htzVar2 = ca70.U1;
                        csrVar.getClass();
                        ca70Var.H0().x(new r670(jLongValue, csrVar));
                        break;
                }
                return Unit.f46060a;
            }
        }));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(d970.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            d970 d970Var = (d970) (ze3Var instanceof d970 ? ze3Var : null);
            if (d970Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                us00 us00Var = d970Var.f5687a;
                wsf0 wsf0Var = d970Var.b;
                peg0 peg0Var = d970Var.c;
                cad cadVar = d970Var.d;
                iw20 iw20Var = d970Var.e;
                mct mctVar = d970Var.f;
                d1p d1pVar = d970Var.g;
                nr00 nr00Var = d970Var.h;
                hse0 hse0Var = d970Var.i;
                btt0 btt0Var = d970Var.j;
                k9c k9cVar = d970Var.k;
                ntu ntuVar = d970Var.l;
                ddu dduVar = d970Var.m;
                z4u z4uVar = d970Var.n;
                bzt bztVar = d970Var.o;
                wyu wyuVar = d970Var.p;
                uyu uyuVar = d970Var.q;
                knf0 knf0Var = d970Var.r;
                tgk tgkVar = d970Var.s;
                us3 us3Var = d970Var.t;
                peg0 peg0Var2 = d970Var.u;
                pbt pbtVar = d970Var.v;
                j1q0 j1q0Var = d970Var.w;
                gst0 gst0Var = d970Var.x;
                kt2 kt2Var = d970Var.y;
                duj dujVar = d970Var.z;
                v88 v88Var = d970Var.A;
                ouu ouuVar = d970Var.B;
                ctf0 ctf0Var = d970Var.C;
                wdk0 wdk0Var = d970Var.D;
                ii iiVar = d970Var.E;
                m1e m1eVar = d970Var.F;
                vwb0 vwb0Var = d970Var.G;
                xwb0 xwb0Var = d970Var.H;
                vby vbyVar = d970Var.I;
                oeg0 oeg0Var = d970Var.J;
                kl5 kl5Var = d970Var.K;
                mctVar.getClass();
                d1pVar.getClass();
                hse0Var.getClass();
                btt0Var.getClass();
                wyuVar.getClass();
                knf0Var.getClass();
                tgkVar.getClass();
                us3Var.getClass();
                j1q0Var.getClass();
                pbtVar.getClass();
                gst0Var.getClass();
                kt2Var.getClass();
                ctf0Var.getClass();
                wdk0Var.getClass();
                iiVar.getClass();
                m1eVar.getClass();
                vwb0Var.getClass();
                xwb0Var.getClass();
                vbyVar.getClass();
                oeg0Var.getClass();
                tmi tmiVar = new tmi(wsf0Var, peg0Var, cadVar, iw20Var, mctVar, d1pVar, nr00Var, us00Var, hse0Var, btt0Var, k9cVar, ntuVar, dduVar, z4uVar, bztVar, wyuVar, uyuVar, knf0Var, tgkVar, us3Var, peg0Var2, j1q0Var, pbtVar, gst0Var, kt2Var, dujVar, v88Var, ouuVar, ctf0Var, wdk0Var, iiVar, m1eVar, i1w0VarF, vbyVar, oeg0Var, kl5Var);
                this.K1 = (smi) tmiVar.o0.get();
                this.L1 = mbl.a(tmiVar.p0);
                this.M1 = mbl.a(tmiVar.q0);
                this.N1 = mbl.a(tmiVar.r0);
                this.O1 = kl5Var;
                this.P1 = mbl.a(tmiVar.n0);
                return;
            }
        }
        jf4.n(b1j.i(d970.class, "Cannot create dependency "));
    }

    public final z7z G0() {
        z7z z7zVar = this.L1;
        if (z7zVar != null) {
            return z7zVar;
        }
        Intrinsics.h("actionDialogManager");
        throw null;
    }

    public final k3t0 H0() {
        return (k3t0) this.R1.getValue();
    }

    public final void I0(boolean z) {
        String strH = H(R.string.attention);
        String strH2 = H(R.string.web_game_restart_dialog_message);
        String strH3 = H(R.string.web_game_restart_dialog_exit_from_game_button);
        String strH4 = H(R.string.web_game_restart_dialog_button);
        strH4.getClass();
        DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH4, strH3, (String) null, "RESTART_PAGE_DIALOG", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
        androidx.fragment.app.e eVarC = C();
        eVarC.getClass();
        if (z) {
            ((ii) G0().get()).a(dialogFields, eVarC);
        } else {
            ((ii) G0().get()).d(dialogFields, eVarC);
        }
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        n0().f44297a.a((aa70) this.S1.getValue());
    }

    @Override // androidx.fragment.app.Fragment
    public final void Y() {
        this.j1 = true;
        n0().f44297a.f((aa70) this.S1.getValue());
        F().f("OneXGames.BONUS_NOT_USED_RESULT_KEY");
    }
}
