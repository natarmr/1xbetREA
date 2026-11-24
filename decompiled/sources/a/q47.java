package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.bet_history.core.presentation.BetHistoryScreenModel;
import org.xplatform.bet_history.history.domain.model.HistoryMenuItem;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;
import org.xplatform.bet_history.history.domain.model.bet_history.TimeTypeModel;
import org.xplatform.bet_history.history.presentation.dialog.history_data_filter.model.HistoryDateFilterTypeModel;
import org.xplatform.uikit.compose.components.calendar.model.DateRangeModel;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/q47;", "La/yx5;", "La/ygt0;", "<init>", "()V", "a/gl5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class q47 extends yx5 implements ygt0 {
    public final s0r K1;
    public pii L1;
    public ynb M1;
    public wdk0 N1;
    public ii O1;
    public final a8z P1;
    public final khf0 Q1;
    public final ywq R1;
    public final boolean S1;
    public static final /* synthetic */ iiy[] V1 = {new j0d0(q47.class, "viewBinding", "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(q47.class, "betHistoryScreenModel", "getBetHistoryScreenModel()Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel;", 0)};
    public static final gl5 U1 = new gl5((byte) 5);

    public q47() {
        super(R.layout.compose_fragment);
        this.K1 = ltt0.o(this, p47.f26338a);
        this.P1 = xbc.a0(this, sre0.f32672a.b(f97.class), null, new l47(this, (byte) 5), 14);
        this.Q1 = new khf0("BET_HISTORY_SCREEN_MODEL_KEY");
        this.R1 = m0(new yl3(this, (byte) 2), new xn((byte) 7));
        this.S1 = true;
    }

    public final ii G0() {
        ii iiVar = this.O1;
        if (iiVar != null) {
            return iiVar;
        }
        Intrinsics.h("actionDialogManager");
        throw null;
    }

    public final wdk0 H0() {
        wdk0 wdk0Var = this.N1;
        if (wdk0Var != null) {
            return wdk0Var;
        }
        Intrinsics.h("snackbarManager");
        throw null;
    }

    public final k3t0 I0() {
        return (k3t0) this.P1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void V(Context context) {
        super.V(context);
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(u37.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            u37 u37Var = (u37) (ze3Var instanceof u37 ? ze3Var : null);
            if (u37Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                BetHistoryScreenModel betHistoryScreenModel = (BetHistoryScreenModel) this.Q1.n(this, V1[1]);
                i1w0VarF.getClass();
                y3v y3vVar = u37Var.c0;
                cad cadVar = u37Var.f34983a;
                ctf0 ctf0Var = u37Var.e;
                gst0 gst0Var = u37Var.f;
                gii0 gii0Var = u37Var.b;
                peg0 peg0Var = u37Var.d;
                t47 t47Var = u37Var.M;
                k7u k7uVar = u37Var.x;
                wdd0 wdd0Var = u37Var.G;
                j1q0 j1q0Var = u37Var.I;
                r9u r9uVar = u37Var.J;
                fme fmeVar = u37Var.w;
                v6j0 v6j0Var = u37Var.v;
                l7k l7kVar = u37Var.q;
                au0 au0Var = u37Var.n;
                s64 s64Var = u37Var.r;
                sjl0 sjl0Var = u37Var.O;
                ix0 ix0Var = u37Var.s;
                s64 s64Var2 = u37Var.o;
                cmt cmtVar = u37Var.p;
                kt2 kt2Var = u37Var.u;
                m1e m1eVar = u37Var.i;
                hru hruVar = u37Var.P;
                o470 o470Var = u37Var.L;
                q7d0 q7d0Var = u37Var.S;
                us3 us3Var = u37Var.R;
                b8u b8uVar = u37Var.K;
                wsf0 wsf0Var = u37Var.H;
                wdk0 wdk0Var = u37Var.m;
                duj dujVar = u37Var.C;
                edo edoVar = u37Var.T;
                j77 j77Var = u37Var.X;
                iip iipVar = u37Var.V;
                fsd fsdVar = u37Var.N;
                sue sueVar = u37Var.U;
                onv onvVar = u37Var.A;
                btt0 btt0Var = u37Var.j;
                knf0 knf0Var = u37Var.k;
                ocl oclVar = u37Var.B;
                ii iiVar = u37Var.l;
                v88 v88Var = u37Var.g;
                pru pruVar = u37Var.h;
                rou rouVar = u37Var.t;
                ugf0 ugf0Var = u37Var.D;
                org.xplatform.toto_bet.core.navigation.a aVar = u37Var.E;
                s2m0 s2m0Var = u37Var.W;
                jh70 jh70Var = u37Var.y;
                peg0 peg0Var2 = u37Var.F;
                tgk tgkVar = u37Var.Q;
                ouu ouuVar = u37Var.z;
                wsf0 wsf0Var2 = u37Var.c;
                t37 t37Var = u37Var.Y;
                xdj xdjVar = u37Var.Z;
                wgu wguVar = u37Var.a0;
                evz evzVar = u37Var.b0;
                nr00 nr00Var = u37Var.d0;
                wdd0Var.getClass();
                sueVar.getClass();
                iipVar.getClass();
                m1eVar.getClass();
                sjl0Var.getClass();
                fmeVar.getClass();
                kt2Var.getClass();
                fsdVar.getClass();
                j77Var.getClass();
                iiVar.getClass();
                t47Var.getClass();
                j1q0Var.getClass();
                r9uVar.getClass();
                q7d0Var.getClass();
                v6j0Var.getClass();
                us3Var.getClass();
                edoVar.getClass();
                ctf0Var.getClass();
                gst0Var.getClass();
                tgkVar.getClass();
                btt0Var.getClass();
                knf0Var.getClass();
                k7uVar.getClass();
                wdk0Var.getClass();
                gii0Var.getClass();
                t37Var.getClass();
                xdjVar.getClass();
                wguVar.getClass();
                this.L1 = (pii) new mdi(cadVar, wsf0Var2, peg0Var, ugf0Var, onvVar, sueVar, wdd0Var, wsf0Var, iipVar, evzVar, nr00Var, y3vVar, peg0Var2, au0Var, s64Var2, cmtVar, l7kVar, m1eVar, sjl0Var, fmeVar, s64Var, ix0Var, kt2Var, fsdVar, j77Var, b8uVar, iiVar, t47Var, o470Var, j1q0Var, r9uVar, hruVar, q7d0Var, v6j0Var, us3Var, edoVar, aVar, s2m0Var, ctf0Var, gst0Var, oclVar, tgkVar, dujVar, rouVar, v88Var, btt0Var, knf0Var, pruVar, jh70Var, k7uVar, betHistoryScreenModel, i1w0VarF, ouuVar, wdk0Var, gii0Var, t37Var, xdjVar, wguVar).t.get();
                ynb ynbVarI = ((yzn0) peg0Var.b).i();
                x1x.x(ynbVarI);
                this.M1 = ynbVarI;
                this.N1 = wdk0Var;
                this.O1 = iiVar;
                return;
            }
        }
        jf4.n(b1j.i(u37.class, "Cannot create dependency "));
    }

    @Override // androidx.fragment.app.Fragment
    public final void Y() {
        this.j1 = true;
        this.R1.b();
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        this.j1 = true;
        I0().x(w27.f38436a);
    }

    @Override // a.ygt0
    public final void e() {
        I0().x(f37.f8847a);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        I0().x(y27.f41892a);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        I0().x(c37.f3659a);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        final byte b = 2;
        C().u0("REQUEST_BET_HISTORY_TYPE_KEY", this, new k4r(this) { // from class: a.k47
            public final /* synthetic */ q47 b;

            {
                this.b = this;
            }

            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                String string;
                byte b2 = b;
                q47 q47Var = this.b;
                switch (b2) {
                    case 0:
                        gl5 gl5Var = q47.U1;
                        str.getClass();
                        if (str.equals("REQUEST_BET_HISTORY_HIDE_TYME_KEY") && bundle2.containsKey("TIME_MODEL_RESULT")) {
                            TimeTypeModel timeTypeModel = (TimeTypeModel) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("TIME_MODEL_RESULT") : (Parcelable) bundle2.getParcelable("TIME_MODEL_RESULT", TimeTypeModel.class));
                            if (timeTypeModel != null) {
                                q47Var.I0().x(new k27(timeTypeModel));
                                break;
                            }
                        }
                        break;
                    case 1:
                        gl5 gl5Var2 = q47.U1;
                        str.getClass();
                        if (str.equals("HISTORY_DATE_FILTER_REQUEST_KEY") && bundle2.containsKey("HISTORY_DATE_FILTER_REQUEST")) {
                            HistoryDateFilterTypeModel historyDateFilterTypeModel = (HistoryDateFilterTypeModel) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("HISTORY_DATE_FILTER_REQUEST") : (Parcelable) bundle2.getParcelable("HISTORY_DATE_FILTER_REQUEST", HistoryDateFilterTypeModel.class));
                            if (historyDateFilterTypeModel != null) {
                                q47Var.I0().x(new n17(historyDateFilterTypeModel));
                                break;
                            }
                        }
                        break;
                    case 2:
                        gl5 gl5Var3 = q47.U1;
                        str.getClass();
                        if (str.equals("REQUEST_BET_HISTORY_TYPE_KEY")) {
                            if (!bundle2.containsKey("RESULT_BET_HISTORY_CLICK")) {
                                if (bundle2.containsKey("RESULT_HIDE_BET_HISTORY_CLICK")) {
                                    q47Var.I0().x(j27.f15768a);
                                }
                                break;
                            } else {
                                HistoryTypeModel historyTypeModel = (HistoryTypeModel) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("RESULT_BET_HISTORY_CLICK") : (Parcelable) bundle2.getParcelable("RESULT_BET_HISTORY_CLICK", HistoryTypeModel.class));
                                if (historyTypeModel != null) {
                                    q47Var.I0().x(new l27(historyTypeModel));
                                    break;
                                }
                            }
                        }
                        break;
                    case 3:
                        gl5 gl5Var4 = q47.U1;
                        str.getClass();
                        if (str.equals("REQUEST_CONFIRM_SALE_DIALOG_KEY") && bundle2.containsKey("BET_SALE_CONFIRM_REQUEST")) {
                            k3t0 k3t0VarI0 = q47Var.I0();
                            String string2 = bundle2.getString("BET_SALE_CONFIRM_REQUEST", "");
                            string2.getClass();
                            k3t0VarI0.x(new z27(string2));
                        }
                        break;
                    case 4:
                        gl5 gl5Var5 = q47.U1;
                        str.getClass();
                        if (str.equals("REQUEST_BET_HISTORY_MENU_KEY") && bundle2.containsKey("HISTORY_MENU_ITEM_RESULT")) {
                            HistoryMenuItem historyMenuItem = (HistoryMenuItem) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("HISTORY_MENU_ITEM_RESULT") : (Parcelable) bundle2.getParcelable("HISTORY_MENU_ITEM_RESULT", HistoryMenuItem.class));
                            if (historyMenuItem != null) {
                                String string3 = bundle2.getString("HISTORY_MENU_BET_ID_RESULT", "");
                                k3t0 k3t0VarI1 = q47Var.I0();
                                string3.getClass();
                                k3t0VarI1.x(new t27(historyMenuItem, string3));
                                break;
                            }
                        }
                        break;
                    case 5:
                        gl5 gl5Var6 = q47.U1;
                        str.getClass();
                        if (str.equals("HISTORY_DATE_PICKER_KEY") && !bundle2.containsKey("BUNDLE_RESULT_CANCELED")) {
                            q47Var.I0().x(new o17(bundle2.getLong("BUNDLE_RESULT_START_TIME_SEC", 0L), bundle2.getLong("BUNDLE_RESULT_END_TIME_SEC", 0L)));
                        }
                        break;
                    case 6:
                        gl5 gl5Var7 = q47.U1;
                        str.getClass();
                        if (str.equals("HISTORY_DATE_PICKER_MAIL_KEY") && !bundle2.containsKey("BUNDLE_RESULT_CANCELED")) {
                            q47Var.I0().x(new p17(bundle2.getLong("BUNDLE_RESULT_START_TIME_SEC", 0L), bundle2.getLong("BUNDLE_RESULT_END_TIME_SEC", 0L)));
                        }
                        break;
                    case 7:
                        gl5 gl5Var8 = q47.U1;
                        str.getClass();
                        if (str.equals("REQUEST_BET_HISTORY_STATUS_FILTER_KEY") && bundle2.containsKey("HISTORY_STATUS_UPDATE_FILTER_REQUEST") && bundle2.getBoolean("HISTORY_STATUS_UPDATE_FILTER_REQUEST")) {
                            q47Var.I0().x(h37.f12371a);
                        }
                        break;
                    case 8:
                        gl5 gl5Var9 = q47.U1;
                        str.getClass();
                        if (str.equals("REQUEST_ALL_FILTERS_DIALOG_KEY")) {
                            HistoryDateFilterTypeModel historyDateFilterTypeModel2 = (HistoryDateFilterTypeModel) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("REQUEST_HISTORY_KEY") : (Parcelable) bundle2.getParcelable("REQUEST_HISTORY_KEY", HistoryDateFilterTypeModel.class));
                            boolean z = bundle2.getBoolean("SELECTED_DATE_KEY", false);
                            if (historyDateFilterTypeModel2 != null) {
                                q47Var.I0().x(new n17(historyDateFilterTypeModel2));
                            } else if (z) {
                                q47Var.I0().x(m27.f21042a);
                            }
                            break;
                        }
                        break;
                    default:
                        gl5 gl5Var10 = q47.U1;
                        str.getClass();
                        if (bundle2.containsKey("BET_INFO_FRAGMENT_REQUEST_KEY") && (string = bundle2.getString("BET_INFO_FRAGMENT_REQUEST_KEY")) != null) {
                            q47Var.I0().x(new o27(string));
                            break;
                        }
                        break;
                }
            }
        });
        final byte b2 = 0;
        C().u0("REQUEST_BET_HISTORY_HIDE_TYME_KEY", this, new k4r(this) { // from class: a.k47
            public final /* synthetic */ q47 b;

            {
                this.b = this;
            }

            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                String string;
                byte b3 = b2;
                q47 q47Var = this.b;
                switch (b3) {
                    case 0:
                        gl5 gl5Var = q47.U1;
                        str.getClass();
                        if (str.equals("REQUEST_BET_HISTORY_HIDE_TYME_KEY") && bundle2.containsKey("TIME_MODEL_RESULT")) {
                            TimeTypeModel timeTypeModel = (TimeTypeModel) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("TIME_MODEL_RESULT") : (Parcelable) bundle2.getParcelable("TIME_MODEL_RESULT", TimeTypeModel.class));
                            if (timeTypeModel != null) {
                                q47Var.I0().x(new k27(timeTypeModel));
                                break;
                            }
                        }
                        break;
                    case 1:
                        gl5 gl5Var2 = q47.U1;
                        str.getClass();
                        if (str.equals("HISTORY_DATE_FILTER_REQUEST_KEY") && bundle2.containsKey("HISTORY_DATE_FILTER_REQUEST")) {
                            HistoryDateFilterTypeModel historyDateFilterTypeModel = (HistoryDateFilterTypeModel) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("HISTORY_DATE_FILTER_REQUEST") : (Parcelable) bundle2.getParcelable("HISTORY_DATE_FILTER_REQUEST", HistoryDateFilterTypeModel.class));
                            if (historyDateFilterTypeModel != null) {
                                q47Var.I0().x(new n17(historyDateFilterTypeModel));
                                break;
                            }
                        }
                        break;
                    case 2:
                        gl5 gl5Var3 = q47.U1;
                        str.getClass();
                        if (str.equals("REQUEST_BET_HISTORY_TYPE_KEY")) {
                            if (!bundle2.containsKey("RESULT_BET_HISTORY_CLICK")) {
                                if (bundle2.containsKey("RESULT_HIDE_BET_HISTORY_CLICK")) {
                                    q47Var.I0().x(j27.f15768a);
                                }
                                break;
                            } else {
                                HistoryTypeModel historyTypeModel = (HistoryTypeModel) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("RESULT_BET_HISTORY_CLICK") : (Parcelable) bundle2.getParcelable("RESULT_BET_HISTORY_CLICK", HistoryTypeModel.class));
                                if (historyTypeModel != null) {
                                    q47Var.I0().x(new l27(historyTypeModel));
                                    break;
                                }
                            }
                        }
                        break;
                    case 3:
                        gl5 gl5Var4 = q47.U1;
                        str.getClass();
                        if (str.equals("REQUEST_CONFIRM_SALE_DIALOG_KEY") && bundle2.containsKey("BET_SALE_CONFIRM_REQUEST")) {
                            k3t0 k3t0VarI0 = q47Var.I0();
                            String string2 = bundle2.getString("BET_SALE_CONFIRM_REQUEST", "");
                            string2.getClass();
                            k3t0VarI0.x(new z27(string2));
                        }
                        break;
                    case 4:
                        gl5 gl5Var5 = q47.U1;
                        str.getClass();
                        if (str.equals("REQUEST_BET_HISTORY_MENU_KEY") && bundle2.containsKey("HISTORY_MENU_ITEM_RESULT")) {
                            HistoryMenuItem historyMenuItem = (HistoryMenuItem) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("HISTORY_MENU_ITEM_RESULT") : (Parcelable) bundle2.getParcelable("HISTORY_MENU_ITEM_RESULT", HistoryMenuItem.class));
                            if (historyMenuItem != null) {
                                String string3 = bundle2.getString("HISTORY_MENU_BET_ID_RESULT", "");
                                k3t0 k3t0VarI1 = q47Var.I0();
                                string3.getClass();
                                k3t0VarI1.x(new t27(historyMenuItem, string3));
                                break;
                            }
                        }
                        break;
                    case 5:
                        gl5 gl5Var6 = q47.U1;
                        str.getClass();
                        if (str.equals("HISTORY_DATE_PICKER_KEY") && !bundle2.containsKey("BUNDLE_RESULT_CANCELED")) {
                            q47Var.I0().x(new o17(bundle2.getLong("BUNDLE_RESULT_START_TIME_SEC", 0L), bundle2.getLong("BUNDLE_RESULT_END_TIME_SEC", 0L)));
                        }
                        break;
                    case 6:
                        gl5 gl5Var7 = q47.U1;
                        str.getClass();
                        if (str.equals("HISTORY_DATE_PICKER_MAIL_KEY") && !bundle2.containsKey("BUNDLE_RESULT_CANCELED")) {
                            q47Var.I0().x(new p17(bundle2.getLong("BUNDLE_RESULT_START_TIME_SEC", 0L), bundle2.getLong("BUNDLE_RESULT_END_TIME_SEC", 0L)));
                        }
                        break;
                    case 7:
                        gl5 gl5Var8 = q47.U1;
                        str.getClass();
                        if (str.equals("REQUEST_BET_HISTORY_STATUS_FILTER_KEY") && bundle2.containsKey("HISTORY_STATUS_UPDATE_FILTER_REQUEST") && bundle2.getBoolean("HISTORY_STATUS_UPDATE_FILTER_REQUEST")) {
                            q47Var.I0().x(h37.f12371a);
                        }
                        break;
                    case 8:
                        gl5 gl5Var9 = q47.U1;
                        str.getClass();
                        if (str.equals("REQUEST_ALL_FILTERS_DIALOG_KEY")) {
                            HistoryDateFilterTypeModel historyDateFilterTypeModel2 = (HistoryDateFilterTypeModel) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("REQUEST_HISTORY_KEY") : (Parcelable) bundle2.getParcelable("REQUEST_HISTORY_KEY", HistoryDateFilterTypeModel.class));
                            boolean z = bundle2.getBoolean("SELECTED_DATE_KEY", false);
                            if (historyDateFilterTypeModel2 != null) {
                                q47Var.I0().x(new n17(historyDateFilterTypeModel2));
                            } else if (z) {
                                q47Var.I0().x(m27.f21042a);
                            }
                            break;
                        }
                        break;
                    default:
                        gl5 gl5Var10 = q47.U1;
                        str.getClass();
                        if (bundle2.containsKey("BET_INFO_FRAGMENT_REQUEST_KEY") && (string = bundle2.getString("BET_INFO_FRAGMENT_REQUEST_KEY")) != null) {
                            q47Var.I0().x(new o27(string));
                            break;
                        }
                        break;
                }
            }
        });
        final byte b3 = 1;
        C().u0("HISTORY_DATE_FILTER_REQUEST_KEY", this, new k4r(this) { // from class: a.k47
            public final /* synthetic */ q47 b;

            {
                this.b = this;
            }

            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                String string;
                byte b4 = b3;
                q47 q47Var = this.b;
                switch (b4) {
                    case 0:
                        gl5 gl5Var = q47.U1;
                        str.getClass();
                        if (str.equals("REQUEST_BET_HISTORY_HIDE_TYME_KEY") && bundle2.containsKey("TIME_MODEL_RESULT")) {
                            TimeTypeModel timeTypeModel = (TimeTypeModel) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("TIME_MODEL_RESULT") : (Parcelable) bundle2.getParcelable("TIME_MODEL_RESULT", TimeTypeModel.class));
                            if (timeTypeModel != null) {
                                q47Var.I0().x(new k27(timeTypeModel));
                                break;
                            }
                        }
                        break;
                    case 1:
                        gl5 gl5Var2 = q47.U1;
                        str.getClass();
                        if (str.equals("HISTORY_DATE_FILTER_REQUEST_KEY") && bundle2.containsKey("HISTORY_DATE_FILTER_REQUEST")) {
                            HistoryDateFilterTypeModel historyDateFilterTypeModel = (HistoryDateFilterTypeModel) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("HISTORY_DATE_FILTER_REQUEST") : (Parcelable) bundle2.getParcelable("HISTORY_DATE_FILTER_REQUEST", HistoryDateFilterTypeModel.class));
                            if (historyDateFilterTypeModel != null) {
                                q47Var.I0().x(new n17(historyDateFilterTypeModel));
                                break;
                            }
                        }
                        break;
                    case 2:
                        gl5 gl5Var3 = q47.U1;
                        str.getClass();
                        if (str.equals("REQUEST_BET_HISTORY_TYPE_KEY")) {
                            if (!bundle2.containsKey("RESULT_BET_HISTORY_CLICK")) {
                                if (bundle2.containsKey("RESULT_HIDE_BET_HISTORY_CLICK")) {
                                    q47Var.I0().x(j27.f15768a);
                                }
                                break;
                            } else {
                                HistoryTypeModel historyTypeModel = (HistoryTypeModel) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("RESULT_BET_HISTORY_CLICK") : (Parcelable) bundle2.getParcelable("RESULT_BET_HISTORY_CLICK", HistoryTypeModel.class));
                                if (historyTypeModel != null) {
                                    q47Var.I0().x(new l27(historyTypeModel));
                                    break;
                                }
                            }
                        }
                        break;
                    case 3:
                        gl5 gl5Var4 = q47.U1;
                        str.getClass();
                        if (str.equals("REQUEST_CONFIRM_SALE_DIALOG_KEY") && bundle2.containsKey("BET_SALE_CONFIRM_REQUEST")) {
                            k3t0 k3t0VarI0 = q47Var.I0();
                            String string2 = bundle2.getString("BET_SALE_CONFIRM_REQUEST", "");
                            string2.getClass();
                            k3t0VarI0.x(new z27(string2));
                        }
                        break;
                    case 4:
                        gl5 gl5Var5 = q47.U1;
                        str.getClass();
                        if (str.equals("REQUEST_BET_HISTORY_MENU_KEY") && bundle2.containsKey("HISTORY_MENU_ITEM_RESULT")) {
                            HistoryMenuItem historyMenuItem = (HistoryMenuItem) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("HISTORY_MENU_ITEM_RESULT") : (Parcelable) bundle2.getParcelable("HISTORY_MENU_ITEM_RESULT", HistoryMenuItem.class));
                            if (historyMenuItem != null) {
                                String string3 = bundle2.getString("HISTORY_MENU_BET_ID_RESULT", "");
                                k3t0 k3t0VarI1 = q47Var.I0();
                                string3.getClass();
                                k3t0VarI1.x(new t27(historyMenuItem, string3));
                                break;
                            }
                        }
                        break;
                    case 5:
                        gl5 gl5Var6 = q47.U1;
                        str.getClass();
                        if (str.equals("HISTORY_DATE_PICKER_KEY") && !bundle2.containsKey("BUNDLE_RESULT_CANCELED")) {
                            q47Var.I0().x(new o17(bundle2.getLong("BUNDLE_RESULT_START_TIME_SEC", 0L), bundle2.getLong("BUNDLE_RESULT_END_TIME_SEC", 0L)));
                        }
                        break;
                    case 6:
                        gl5 gl5Var7 = q47.U1;
                        str.getClass();
                        if (str.equals("HISTORY_DATE_PICKER_MAIL_KEY") && !bundle2.containsKey("BUNDLE_RESULT_CANCELED")) {
                            q47Var.I0().x(new p17(bundle2.getLong("BUNDLE_RESULT_START_TIME_SEC", 0L), bundle2.getLong("BUNDLE_RESULT_END_TIME_SEC", 0L)));
                        }
                        break;
                    case 7:
                        gl5 gl5Var8 = q47.U1;
                        str.getClass();
                        if (str.equals("REQUEST_BET_HISTORY_STATUS_FILTER_KEY") && bundle2.containsKey("HISTORY_STATUS_UPDATE_FILTER_REQUEST") && bundle2.getBoolean("HISTORY_STATUS_UPDATE_FILTER_REQUEST")) {
                            q47Var.I0().x(h37.f12371a);
                        }
                        break;
                    case 8:
                        gl5 gl5Var9 = q47.U1;
                        str.getClass();
                        if (str.equals("REQUEST_ALL_FILTERS_DIALOG_KEY")) {
                            HistoryDateFilterTypeModel historyDateFilterTypeModel2 = (HistoryDateFilterTypeModel) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("REQUEST_HISTORY_KEY") : (Parcelable) bundle2.getParcelable("REQUEST_HISTORY_KEY", HistoryDateFilterTypeModel.class));
                            boolean z = bundle2.getBoolean("SELECTED_DATE_KEY", false);
                            if (historyDateFilterTypeModel2 != null) {
                                q47Var.I0().x(new n17(historyDateFilterTypeModel2));
                            } else if (z) {
                                q47Var.I0().x(m27.f21042a);
                            }
                            break;
                        }
                        break;
                    default:
                        gl5 gl5Var10 = q47.U1;
                        str.getClass();
                        if (bundle2.containsKey("BET_INFO_FRAGMENT_REQUEST_KEY") && (string = bundle2.getString("BET_INFO_FRAGMENT_REQUEST_KEY")) != null) {
                            q47Var.I0().x(new o27(string));
                            break;
                        }
                        break;
                }
            }
        });
        ccq0.T(this, "REQUEST_BIND_EMAIL_DIALOG_KEY", new l47(this, (byte) 2));
        final byte b4 = 3;
        ccq0.V(this, "REQUEST_BIND_EMAIL_DIALOG_KEY", new l47(this, (byte) 3));
        final byte b5 = 5;
        C().u0("HISTORY_DATE_PICKER_KEY", this, new k4r(this) { // from class: a.k47
            public final /* synthetic */ q47 b;

            {
                this.b = this;
            }

            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                String string;
                byte b6 = b5;
                q47 q47Var = this.b;
                switch (b6) {
                    case 0:
                        gl5 gl5Var = q47.U1;
                        str.getClass();
                        if (str.equals("REQUEST_BET_HISTORY_HIDE_TYME_KEY") && bundle2.containsKey("TIME_MODEL_RESULT")) {
                            TimeTypeModel timeTypeModel = (TimeTypeModel) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("TIME_MODEL_RESULT") : (Parcelable) bundle2.getParcelable("TIME_MODEL_RESULT", TimeTypeModel.class));
                            if (timeTypeModel != null) {
                                q47Var.I0().x(new k27(timeTypeModel));
                                break;
                            }
                        }
                        break;
                    case 1:
                        gl5 gl5Var2 = q47.U1;
                        str.getClass();
                        if (str.equals("HISTORY_DATE_FILTER_REQUEST_KEY") && bundle2.containsKey("HISTORY_DATE_FILTER_REQUEST")) {
                            HistoryDateFilterTypeModel historyDateFilterTypeModel = (HistoryDateFilterTypeModel) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("HISTORY_DATE_FILTER_REQUEST") : (Parcelable) bundle2.getParcelable("HISTORY_DATE_FILTER_REQUEST", HistoryDateFilterTypeModel.class));
                            if (historyDateFilterTypeModel != null) {
                                q47Var.I0().x(new n17(historyDateFilterTypeModel));
                                break;
                            }
                        }
                        break;
                    case 2:
                        gl5 gl5Var3 = q47.U1;
                        str.getClass();
                        if (str.equals("REQUEST_BET_HISTORY_TYPE_KEY")) {
                            if (!bundle2.containsKey("RESULT_BET_HISTORY_CLICK")) {
                                if (bundle2.containsKey("RESULT_HIDE_BET_HISTORY_CLICK")) {
                                    q47Var.I0().x(j27.f15768a);
                                }
                                break;
                            } else {
                                HistoryTypeModel historyTypeModel = (HistoryTypeModel) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("RESULT_BET_HISTORY_CLICK") : (Parcelable) bundle2.getParcelable("RESULT_BET_HISTORY_CLICK", HistoryTypeModel.class));
                                if (historyTypeModel != null) {
                                    q47Var.I0().x(new l27(historyTypeModel));
                                    break;
                                }
                            }
                        }
                        break;
                    case 3:
                        gl5 gl5Var4 = q47.U1;
                        str.getClass();
                        if (str.equals("REQUEST_CONFIRM_SALE_DIALOG_KEY") && bundle2.containsKey("BET_SALE_CONFIRM_REQUEST")) {
                            k3t0 k3t0VarI0 = q47Var.I0();
                            String string2 = bundle2.getString("BET_SALE_CONFIRM_REQUEST", "");
                            string2.getClass();
                            k3t0VarI0.x(new z27(string2));
                        }
                        break;
                    case 4:
                        gl5 gl5Var5 = q47.U1;
                        str.getClass();
                        if (str.equals("REQUEST_BET_HISTORY_MENU_KEY") && bundle2.containsKey("HISTORY_MENU_ITEM_RESULT")) {
                            HistoryMenuItem historyMenuItem = (HistoryMenuItem) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("HISTORY_MENU_ITEM_RESULT") : (Parcelable) bundle2.getParcelable("HISTORY_MENU_ITEM_RESULT", HistoryMenuItem.class));
                            if (historyMenuItem != null) {
                                String string3 = bundle2.getString("HISTORY_MENU_BET_ID_RESULT", "");
                                k3t0 k3t0VarI1 = q47Var.I0();
                                string3.getClass();
                                k3t0VarI1.x(new t27(historyMenuItem, string3));
                                break;
                            }
                        }
                        break;
                    case 5:
                        gl5 gl5Var6 = q47.U1;
                        str.getClass();
                        if (str.equals("HISTORY_DATE_PICKER_KEY") && !bundle2.containsKey("BUNDLE_RESULT_CANCELED")) {
                            q47Var.I0().x(new o17(bundle2.getLong("BUNDLE_RESULT_START_TIME_SEC", 0L), bundle2.getLong("BUNDLE_RESULT_END_TIME_SEC", 0L)));
                        }
                        break;
                    case 6:
                        gl5 gl5Var7 = q47.U1;
                        str.getClass();
                        if (str.equals("HISTORY_DATE_PICKER_MAIL_KEY") && !bundle2.containsKey("BUNDLE_RESULT_CANCELED")) {
                            q47Var.I0().x(new p17(bundle2.getLong("BUNDLE_RESULT_START_TIME_SEC", 0L), bundle2.getLong("BUNDLE_RESULT_END_TIME_SEC", 0L)));
                        }
                        break;
                    case 7:
                        gl5 gl5Var8 = q47.U1;
                        str.getClass();
                        if (str.equals("REQUEST_BET_HISTORY_STATUS_FILTER_KEY") && bundle2.containsKey("HISTORY_STATUS_UPDATE_FILTER_REQUEST") && bundle2.getBoolean("HISTORY_STATUS_UPDATE_FILTER_REQUEST")) {
                            q47Var.I0().x(h37.f12371a);
                        }
                        break;
                    case 8:
                        gl5 gl5Var9 = q47.U1;
                        str.getClass();
                        if (str.equals("REQUEST_ALL_FILTERS_DIALOG_KEY")) {
                            HistoryDateFilterTypeModel historyDateFilterTypeModel2 = (HistoryDateFilterTypeModel) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("REQUEST_HISTORY_KEY") : (Parcelable) bundle2.getParcelable("REQUEST_HISTORY_KEY", HistoryDateFilterTypeModel.class));
                            boolean z = bundle2.getBoolean("SELECTED_DATE_KEY", false);
                            if (historyDateFilterTypeModel2 != null) {
                                q47Var.I0().x(new n17(historyDateFilterTypeModel2));
                            } else if (z) {
                                q47Var.I0().x(m27.f21042a);
                            }
                            break;
                        }
                        break;
                    default:
                        gl5 gl5Var10 = q47.U1;
                        str.getClass();
                        if (bundle2.containsKey("BET_INFO_FRAGMENT_REQUEST_KEY") && (string = bundle2.getString("BET_INFO_FRAGMENT_REQUEST_KEY")) != null) {
                            q47Var.I0().x(new o27(string));
                            break;
                        }
                        break;
                }
            }
        });
        final byte b6 = 6;
        C().u0("HISTORY_DATE_PICKER_MAIL_KEY", this, new k4r(this) { // from class: a.k47
            public final /* synthetic */ q47 b;

            {
                this.b = this;
            }

            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                String string;
                byte b7 = b6;
                q47 q47Var = this.b;
                switch (b7) {
                    case 0:
                        gl5 gl5Var = q47.U1;
                        str.getClass();
                        if (str.equals("REQUEST_BET_HISTORY_HIDE_TYME_KEY") && bundle2.containsKey("TIME_MODEL_RESULT")) {
                            TimeTypeModel timeTypeModel = (TimeTypeModel) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("TIME_MODEL_RESULT") : (Parcelable) bundle2.getParcelable("TIME_MODEL_RESULT", TimeTypeModel.class));
                            if (timeTypeModel != null) {
                                q47Var.I0().x(new k27(timeTypeModel));
                                break;
                            }
                        }
                        break;
                    case 1:
                        gl5 gl5Var2 = q47.U1;
                        str.getClass();
                        if (str.equals("HISTORY_DATE_FILTER_REQUEST_KEY") && bundle2.containsKey("HISTORY_DATE_FILTER_REQUEST")) {
                            HistoryDateFilterTypeModel historyDateFilterTypeModel = (HistoryDateFilterTypeModel) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("HISTORY_DATE_FILTER_REQUEST") : (Parcelable) bundle2.getParcelable("HISTORY_DATE_FILTER_REQUEST", HistoryDateFilterTypeModel.class));
                            if (historyDateFilterTypeModel != null) {
                                q47Var.I0().x(new n17(historyDateFilterTypeModel));
                                break;
                            }
                        }
                        break;
                    case 2:
                        gl5 gl5Var3 = q47.U1;
                        str.getClass();
                        if (str.equals("REQUEST_BET_HISTORY_TYPE_KEY")) {
                            if (!bundle2.containsKey("RESULT_BET_HISTORY_CLICK")) {
                                if (bundle2.containsKey("RESULT_HIDE_BET_HISTORY_CLICK")) {
                                    q47Var.I0().x(j27.f15768a);
                                }
                                break;
                            } else {
                                HistoryTypeModel historyTypeModel = (HistoryTypeModel) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("RESULT_BET_HISTORY_CLICK") : (Parcelable) bundle2.getParcelable("RESULT_BET_HISTORY_CLICK", HistoryTypeModel.class));
                                if (historyTypeModel != null) {
                                    q47Var.I0().x(new l27(historyTypeModel));
                                    break;
                                }
                            }
                        }
                        break;
                    case 3:
                        gl5 gl5Var4 = q47.U1;
                        str.getClass();
                        if (str.equals("REQUEST_CONFIRM_SALE_DIALOG_KEY") && bundle2.containsKey("BET_SALE_CONFIRM_REQUEST")) {
                            k3t0 k3t0VarI0 = q47Var.I0();
                            String string2 = bundle2.getString("BET_SALE_CONFIRM_REQUEST", "");
                            string2.getClass();
                            k3t0VarI0.x(new z27(string2));
                        }
                        break;
                    case 4:
                        gl5 gl5Var5 = q47.U1;
                        str.getClass();
                        if (str.equals("REQUEST_BET_HISTORY_MENU_KEY") && bundle2.containsKey("HISTORY_MENU_ITEM_RESULT")) {
                            HistoryMenuItem historyMenuItem = (HistoryMenuItem) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("HISTORY_MENU_ITEM_RESULT") : (Parcelable) bundle2.getParcelable("HISTORY_MENU_ITEM_RESULT", HistoryMenuItem.class));
                            if (historyMenuItem != null) {
                                String string3 = bundle2.getString("HISTORY_MENU_BET_ID_RESULT", "");
                                k3t0 k3t0VarI1 = q47Var.I0();
                                string3.getClass();
                                k3t0VarI1.x(new t27(historyMenuItem, string3));
                                break;
                            }
                        }
                        break;
                    case 5:
                        gl5 gl5Var6 = q47.U1;
                        str.getClass();
                        if (str.equals("HISTORY_DATE_PICKER_KEY") && !bundle2.containsKey("BUNDLE_RESULT_CANCELED")) {
                            q47Var.I0().x(new o17(bundle2.getLong("BUNDLE_RESULT_START_TIME_SEC", 0L), bundle2.getLong("BUNDLE_RESULT_END_TIME_SEC", 0L)));
                        }
                        break;
                    case 6:
                        gl5 gl5Var7 = q47.U1;
                        str.getClass();
                        if (str.equals("HISTORY_DATE_PICKER_MAIL_KEY") && !bundle2.containsKey("BUNDLE_RESULT_CANCELED")) {
                            q47Var.I0().x(new p17(bundle2.getLong("BUNDLE_RESULT_START_TIME_SEC", 0L), bundle2.getLong("BUNDLE_RESULT_END_TIME_SEC", 0L)));
                        }
                        break;
                    case 7:
                        gl5 gl5Var8 = q47.U1;
                        str.getClass();
                        if (str.equals("REQUEST_BET_HISTORY_STATUS_FILTER_KEY") && bundle2.containsKey("HISTORY_STATUS_UPDATE_FILTER_REQUEST") && bundle2.getBoolean("HISTORY_STATUS_UPDATE_FILTER_REQUEST")) {
                            q47Var.I0().x(h37.f12371a);
                        }
                        break;
                    case 8:
                        gl5 gl5Var9 = q47.U1;
                        str.getClass();
                        if (str.equals("REQUEST_ALL_FILTERS_DIALOG_KEY")) {
                            HistoryDateFilterTypeModel historyDateFilterTypeModel2 = (HistoryDateFilterTypeModel) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("REQUEST_HISTORY_KEY") : (Parcelable) bundle2.getParcelable("REQUEST_HISTORY_KEY", HistoryDateFilterTypeModel.class));
                            boolean z = bundle2.getBoolean("SELECTED_DATE_KEY", false);
                            if (historyDateFilterTypeModel2 != null) {
                                q47Var.I0().x(new n17(historyDateFilterTypeModel2));
                            } else if (z) {
                                q47Var.I0().x(m27.f21042a);
                            }
                            break;
                        }
                        break;
                    default:
                        gl5 gl5Var10 = q47.U1;
                        str.getClass();
                        if (bundle2.containsKey("BET_INFO_FRAGMENT_REQUEST_KEY") && (string = bundle2.getString("BET_INFO_FRAGMENT_REQUEST_KEY")) != null) {
                            q47Var.I0().x(new o27(string));
                            break;
                        }
                        break;
                }
            }
        });
        sj3.A0(this, "RESULT_KEY_DATE_TIME_CALENDAR_REQUEST", new Function2(this) { // from class: a.n47
            public final /* synthetic */ q47 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                byte b7 = b4;
                q47 q47Var = this.b;
                switch (b7) {
                    case 0:
                        fet fetVar = (fet) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        gl5 gl5Var = q47.U1;
                        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                            q47 q47Var2 = this.b;
                            pz40 pz40VarY = ((i3t0) q47Var2.I0()).y(fetVar);
                            k3t0 k3t0VarI0 = q47Var2.I0();
                            boolean zI = fetVar.i(q47Var2);
                            Object objP = fetVar.P();
                            cl5 cl5Var = ukd.f35823a;
                            if (zI || objP == cl5Var) {
                                objP = new ur6(1, q47Var2, q47.class, "collectSideEffect", "collectSideEffect(Lorg/xplatform/bet_history/history/presentation/model/viewmodel/BetHistorySideEffect;)V", 0, (byte) 15);
                                fetVar.o0(objP);
                            }
                            lkz lkzVar = lkz.f20223a;
                            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
                            boolean zI2 = fetVar.i(k3t0VarI0) | fetVar.i(q47Var2) | fetVar.e(3) | fetVar.g(pz40VarF);
                            Object objP2 = fetVar.P();
                            if (zI2 || objP2 == cl5Var) {
                                objP2 = new l10(k3t0VarI0, q47Var2, pz40VarF, null, (byte) 29);
                                fetVar.o0(objP2);
                            }
                            m0x0.t(fetVar, q47Var2, (Function2) objP2);
                            int iOrdinal = ((BetHistoryScreenModel) q47Var2.Q1.n(q47Var2, q47.V1[1])).getC().ordinal();
                            if (iOrdinal == 0) {
                                fetVar.e0(168386433);
                                n0q n0qVar = o7k0.c;
                                z77 z77Var = (z77) pz40VarY.getValue();
                                k3t0 k3t0VarI1 = q47Var2.I0();
                                boolean zI3 = fetVar.i(k3t0VarI1);
                                Object objP3 = fetVar.P();
                                if (zI3 || objP3 == cl5Var) {
                                    objP3 = new ur6(1, k3t0VarI1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 16);
                                    fetVar.o0(objP3);
                                }
                                dwi0.f(n0qVar, z77Var, (Function1) ((jhy) objP3), fetVar, 6);
                                fetVar.r(false);
                            } else if (iOrdinal == 1) {
                                fetVar.e0(168693240);
                                n0q n0qVar2 = o7k0.c;
                                z77 z77Var2 = (z77) pz40VarY.getValue();
                                k3t0 k3t0VarI2 = q47Var2.I0();
                                boolean zI4 = fetVar.i(k3t0VarI2);
                                Object objP4 = fetVar.P();
                                if (zI4 || objP4 == cl5Var) {
                                    objP4 = new ur6(1, k3t0VarI2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 17);
                                    fetVar.o0(objP4);
                                }
                                idm0.c(n0qVar2, z77Var2, (Function1) ((jhy) objP4), fetVar, 6);
                                fetVar.r(false);
                            } else if (iOrdinal == 2) {
                                fetVar.e0(169011703);
                                n0q n0qVar3 = o7k0.c;
                                z77 z77Var3 = (z77) pz40VarY.getValue();
                                k3t0 k3t0VarI3 = q47Var2.I0();
                                boolean zI5 = fetVar.i(k3t0VarI3);
                                Object objP5 = fetVar.P();
                                if (zI5 || objP5 == cl5Var) {
                                    objP5 = new ur6(1, k3t0VarI3, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 18);
                                    fetVar.o0(objP5);
                                }
                                q7x.g(n0qVar3, z77Var3, (Function1) ((jhy) objP5), fetVar, 6);
                                fetVar.r(false);
                            } else if (iOrdinal == 3) {
                                fetVar.e0(169324183);
                                n0q n0qVar4 = o7k0.c;
                                z77 z77Var4 = (z77) pz40VarY.getValue();
                                k3t0 k3t0VarI4 = q47Var2.I0();
                                boolean zI6 = fetVar.i(k3t0VarI4);
                                Object objP6 = fetVar.P();
                                if (zI6 || objP6 == cl5Var) {
                                    objP6 = new ur6(1, k3t0VarI4, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 19);
                                    fetVar.o0(objP6);
                                }
                                hkb.b(n0qVar4, z77Var4, (Function1) ((jhy) objP6), fetVar, 6);
                                fetVar.r(false);
                            } else if (iOrdinal != 4) {
                                fetVar.e0(169914082);
                                n0q n0qVar5 = o7k0.c;
                                z77 z77Var5 = (z77) pz40VarY.getValue();
                                k3t0 k3t0VarI5 = q47Var2.I0();
                                boolean zI7 = fetVar.i(k3t0VarI5);
                                Object objP7 = fetVar.P();
                                if (zI7 || objP7 == cl5Var) {
                                    objP7 = new ur6(1, k3t0VarI5, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 21);
                                    fetVar.o0(objP7);
                                }
                                dwi0.f(n0qVar5, z77Var5, (Function1) ((jhy) objP7), fetVar, 6);
                                fetVar.r(false);
                            } else {
                                fetVar.e0(169637438);
                                n0q n0qVar6 = o7k0.c;
                                z77 z77Var6 = (z77) pz40VarY.getValue();
                                k3t0 k3t0VarI6 = q47Var2.I0();
                                boolean zI8 = fetVar.i(k3t0VarI6);
                                Object objP8 = fetVar.P();
                                if (zI8 || objP8 == cl5Var) {
                                    objP8 = new ur6(1, k3t0VarI6, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 20);
                                    fetVar.o0(objP8);
                                }
                                nnw0.y(n0qVar6, z77Var6, (Function1) ((jhy) objP8), fetVar, 6);
                                fetVar.r(false);
                            }
                        } else {
                            fetVar.X();
                        }
                        break;
                    case 1:
                        Bundle bundle2 = (Bundle) obj2;
                        gl5 gl5Var2 = q47.U1;
                        if (h97.B(bundle2, (String) obj, "REQUEST_BET_UPDATE_BY_ID")) {
                            String string = bundle2.getString("BUNDLE_BET_ID", "");
                            k3t0 k3t0VarI7 = q47Var.I0();
                            string.getClass();
                            k3t0VarI7.x(new g37(string));
                        }
                        break;
                    case 2:
                        Bundle bundle3 = (Bundle) obj2;
                        gl5 gl5Var3 = q47.U1;
                        if (h97.B(bundle3, (String) obj, "REQUEST_KEY_SUCCESS_SALE")) {
                            String string2 = bundle3.getString("BUNDLE_BET_ID", "");
                            k3t0 k3t0VarI8 = q47Var.I0();
                            string2.getClass();
                            k3t0VarI8.x(new g37(string2));
                        }
                        break;
                    case 3:
                        Bundle bundle4 = (Bundle) obj2;
                        gl5 gl5Var4 = q47.U1;
                        ((String) obj).getClass();
                        bundle4.getClass();
                        q47Var.I0().x(new s17(bundle4.getLong("RESULT_KEY_CALENDAR_START_SIMPLE_DATE"), bundle4.getLong("RESULT_KEY_CALENDAR_END_SIMPLE_DATE")));
                        break;
                    case 4:
                        Bundle bundle5 = (Bundle) obj2;
                        gl5 gl5Var5 = q47.U1;
                        ((String) obj).getClass();
                        bundle5.getClass();
                        SimpleDate simpleDate = (SimpleDate) (Build.VERSION.SDK_INT <= 33 ? bundle5.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE") : (Parcelable) bundle5.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE", SimpleDate.class));
                        if (simpleDate != null) {
                            q47Var.I0().x(new r17(simpleDate));
                        }
                        break;
                    case 5:
                        Bundle bundle6 = (Bundle) obj2;
                        gl5 gl5Var6 = q47.U1;
                        ((String) obj).getClass();
                        bundle6.getClass();
                        DateRangeModel dateRangeModel = (DateRangeModel) (Build.VERSION.SDK_INT <= 33 ? bundle6.getParcelable("RESULT_KEY_CALENDAR_DATE_RANGE") : (Parcelable) bundle6.getParcelable("RESULT_KEY_CALENDAR_DATE_RANGE", DateRangeModel.class));
                        if (dateRangeModel != null) {
                            q47Var.I0().x(new q17(dateRangeModel));
                        }
                        break;
                    default:
                        Bundle bundle7 = (Bundle) obj2;
                        gl5 gl5Var7 = q47.U1;
                        if (h97.B(bundle7, (String) obj, "REQUEST_EDIT_COUPON_DIALOG")) {
                            q47Var.I0().x(j37.f15816a);
                        }
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b7 = 4;
        C().u0("REQUEST_BET_HISTORY_MENU_KEY", this, new k4r(this) { // from class: a.k47
            public final /* synthetic */ q47 b;

            {
                this.b = this;
            }

            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                String string;
                byte b8 = b7;
                q47 q47Var = this.b;
                switch (b8) {
                    case 0:
                        gl5 gl5Var = q47.U1;
                        str.getClass();
                        if (str.equals("REQUEST_BET_HISTORY_HIDE_TYME_KEY") && bundle2.containsKey("TIME_MODEL_RESULT")) {
                            TimeTypeModel timeTypeModel = (TimeTypeModel) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("TIME_MODEL_RESULT") : (Parcelable) bundle2.getParcelable("TIME_MODEL_RESULT", TimeTypeModel.class));
                            if (timeTypeModel != null) {
                                q47Var.I0().x(new k27(timeTypeModel));
                                break;
                            }
                        }
                        break;
                    case 1:
                        gl5 gl5Var2 = q47.U1;
                        str.getClass();
                        if (str.equals("HISTORY_DATE_FILTER_REQUEST_KEY") && bundle2.containsKey("HISTORY_DATE_FILTER_REQUEST")) {
                            HistoryDateFilterTypeModel historyDateFilterTypeModel = (HistoryDateFilterTypeModel) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("HISTORY_DATE_FILTER_REQUEST") : (Parcelable) bundle2.getParcelable("HISTORY_DATE_FILTER_REQUEST", HistoryDateFilterTypeModel.class));
                            if (historyDateFilterTypeModel != null) {
                                q47Var.I0().x(new n17(historyDateFilterTypeModel));
                                break;
                            }
                        }
                        break;
                    case 2:
                        gl5 gl5Var3 = q47.U1;
                        str.getClass();
                        if (str.equals("REQUEST_BET_HISTORY_TYPE_KEY")) {
                            if (!bundle2.containsKey("RESULT_BET_HISTORY_CLICK")) {
                                if (bundle2.containsKey("RESULT_HIDE_BET_HISTORY_CLICK")) {
                                    q47Var.I0().x(j27.f15768a);
                                }
                                break;
                            } else {
                                HistoryTypeModel historyTypeModel = (HistoryTypeModel) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("RESULT_BET_HISTORY_CLICK") : (Parcelable) bundle2.getParcelable("RESULT_BET_HISTORY_CLICK", HistoryTypeModel.class));
                                if (historyTypeModel != null) {
                                    q47Var.I0().x(new l27(historyTypeModel));
                                    break;
                                }
                            }
                        }
                        break;
                    case 3:
                        gl5 gl5Var4 = q47.U1;
                        str.getClass();
                        if (str.equals("REQUEST_CONFIRM_SALE_DIALOG_KEY") && bundle2.containsKey("BET_SALE_CONFIRM_REQUEST")) {
                            k3t0 k3t0VarI0 = q47Var.I0();
                            String string2 = bundle2.getString("BET_SALE_CONFIRM_REQUEST", "");
                            string2.getClass();
                            k3t0VarI0.x(new z27(string2));
                        }
                        break;
                    case 4:
                        gl5 gl5Var5 = q47.U1;
                        str.getClass();
                        if (str.equals("REQUEST_BET_HISTORY_MENU_KEY") && bundle2.containsKey("HISTORY_MENU_ITEM_RESULT")) {
                            HistoryMenuItem historyMenuItem = (HistoryMenuItem) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("HISTORY_MENU_ITEM_RESULT") : (Parcelable) bundle2.getParcelable("HISTORY_MENU_ITEM_RESULT", HistoryMenuItem.class));
                            if (historyMenuItem != null) {
                                String string3 = bundle2.getString("HISTORY_MENU_BET_ID_RESULT", "");
                                k3t0 k3t0VarI1 = q47Var.I0();
                                string3.getClass();
                                k3t0VarI1.x(new t27(historyMenuItem, string3));
                                break;
                            }
                        }
                        break;
                    case 5:
                        gl5 gl5Var6 = q47.U1;
                        str.getClass();
                        if (str.equals("HISTORY_DATE_PICKER_KEY") && !bundle2.containsKey("BUNDLE_RESULT_CANCELED")) {
                            q47Var.I0().x(new o17(bundle2.getLong("BUNDLE_RESULT_START_TIME_SEC", 0L), bundle2.getLong("BUNDLE_RESULT_END_TIME_SEC", 0L)));
                        }
                        break;
                    case 6:
                        gl5 gl5Var7 = q47.U1;
                        str.getClass();
                        if (str.equals("HISTORY_DATE_PICKER_MAIL_KEY") && !bundle2.containsKey("BUNDLE_RESULT_CANCELED")) {
                            q47Var.I0().x(new p17(bundle2.getLong("BUNDLE_RESULT_START_TIME_SEC", 0L), bundle2.getLong("BUNDLE_RESULT_END_TIME_SEC", 0L)));
                        }
                        break;
                    case 7:
                        gl5 gl5Var8 = q47.U1;
                        str.getClass();
                        if (str.equals("REQUEST_BET_HISTORY_STATUS_FILTER_KEY") && bundle2.containsKey("HISTORY_STATUS_UPDATE_FILTER_REQUEST") && bundle2.getBoolean("HISTORY_STATUS_UPDATE_FILTER_REQUEST")) {
                            q47Var.I0().x(h37.f12371a);
                        }
                        break;
                    case 8:
                        gl5 gl5Var9 = q47.U1;
                        str.getClass();
                        if (str.equals("REQUEST_ALL_FILTERS_DIALOG_KEY")) {
                            HistoryDateFilterTypeModel historyDateFilterTypeModel2 = (HistoryDateFilterTypeModel) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("REQUEST_HISTORY_KEY") : (Parcelable) bundle2.getParcelable("REQUEST_HISTORY_KEY", HistoryDateFilterTypeModel.class));
                            boolean z = bundle2.getBoolean("SELECTED_DATE_KEY", false);
                            if (historyDateFilterTypeModel2 != null) {
                                q47Var.I0().x(new n17(historyDateFilterTypeModel2));
                            } else if (z) {
                                q47Var.I0().x(m27.f21042a);
                            }
                            break;
                        }
                        break;
                    default:
                        gl5 gl5Var10 = q47.U1;
                        str.getClass();
                        if (bundle2.containsKey("BET_INFO_FRAGMENT_REQUEST_KEY") && (string = bundle2.getString("BET_INFO_FRAGMENT_REQUEST_KEY")) != null) {
                            q47Var.I0().x(new o27(string));
                            break;
                        }
                        break;
                }
            }
        });
        final byte b8 = 7;
        C().u0("REQUEST_BET_HISTORY_STATUS_FILTER_KEY", this, new k4r(this) { // from class: a.k47
            public final /* synthetic */ q47 b;

            {
                this.b = this;
            }

            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                String string;
                byte b9 = b8;
                q47 q47Var = this.b;
                switch (b9) {
                    case 0:
                        gl5 gl5Var = q47.U1;
                        str.getClass();
                        if (str.equals("REQUEST_BET_HISTORY_HIDE_TYME_KEY") && bundle2.containsKey("TIME_MODEL_RESULT")) {
                            TimeTypeModel timeTypeModel = (TimeTypeModel) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("TIME_MODEL_RESULT") : (Parcelable) bundle2.getParcelable("TIME_MODEL_RESULT", TimeTypeModel.class));
                            if (timeTypeModel != null) {
                                q47Var.I0().x(new k27(timeTypeModel));
                                break;
                            }
                        }
                        break;
                    case 1:
                        gl5 gl5Var2 = q47.U1;
                        str.getClass();
                        if (str.equals("HISTORY_DATE_FILTER_REQUEST_KEY") && bundle2.containsKey("HISTORY_DATE_FILTER_REQUEST")) {
                            HistoryDateFilterTypeModel historyDateFilterTypeModel = (HistoryDateFilterTypeModel) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("HISTORY_DATE_FILTER_REQUEST") : (Parcelable) bundle2.getParcelable("HISTORY_DATE_FILTER_REQUEST", HistoryDateFilterTypeModel.class));
                            if (historyDateFilterTypeModel != null) {
                                q47Var.I0().x(new n17(historyDateFilterTypeModel));
                                break;
                            }
                        }
                        break;
                    case 2:
                        gl5 gl5Var3 = q47.U1;
                        str.getClass();
                        if (str.equals("REQUEST_BET_HISTORY_TYPE_KEY")) {
                            if (!bundle2.containsKey("RESULT_BET_HISTORY_CLICK")) {
                                if (bundle2.containsKey("RESULT_HIDE_BET_HISTORY_CLICK")) {
                                    q47Var.I0().x(j27.f15768a);
                                }
                                break;
                            } else {
                                HistoryTypeModel historyTypeModel = (HistoryTypeModel) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("RESULT_BET_HISTORY_CLICK") : (Parcelable) bundle2.getParcelable("RESULT_BET_HISTORY_CLICK", HistoryTypeModel.class));
                                if (historyTypeModel != null) {
                                    q47Var.I0().x(new l27(historyTypeModel));
                                    break;
                                }
                            }
                        }
                        break;
                    case 3:
                        gl5 gl5Var4 = q47.U1;
                        str.getClass();
                        if (str.equals("REQUEST_CONFIRM_SALE_DIALOG_KEY") && bundle2.containsKey("BET_SALE_CONFIRM_REQUEST")) {
                            k3t0 k3t0VarI0 = q47Var.I0();
                            String string2 = bundle2.getString("BET_SALE_CONFIRM_REQUEST", "");
                            string2.getClass();
                            k3t0VarI0.x(new z27(string2));
                        }
                        break;
                    case 4:
                        gl5 gl5Var5 = q47.U1;
                        str.getClass();
                        if (str.equals("REQUEST_BET_HISTORY_MENU_KEY") && bundle2.containsKey("HISTORY_MENU_ITEM_RESULT")) {
                            HistoryMenuItem historyMenuItem = (HistoryMenuItem) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("HISTORY_MENU_ITEM_RESULT") : (Parcelable) bundle2.getParcelable("HISTORY_MENU_ITEM_RESULT", HistoryMenuItem.class));
                            if (historyMenuItem != null) {
                                String string3 = bundle2.getString("HISTORY_MENU_BET_ID_RESULT", "");
                                k3t0 k3t0VarI1 = q47Var.I0();
                                string3.getClass();
                                k3t0VarI1.x(new t27(historyMenuItem, string3));
                                break;
                            }
                        }
                        break;
                    case 5:
                        gl5 gl5Var6 = q47.U1;
                        str.getClass();
                        if (str.equals("HISTORY_DATE_PICKER_KEY") && !bundle2.containsKey("BUNDLE_RESULT_CANCELED")) {
                            q47Var.I0().x(new o17(bundle2.getLong("BUNDLE_RESULT_START_TIME_SEC", 0L), bundle2.getLong("BUNDLE_RESULT_END_TIME_SEC", 0L)));
                        }
                        break;
                    case 6:
                        gl5 gl5Var7 = q47.U1;
                        str.getClass();
                        if (str.equals("HISTORY_DATE_PICKER_MAIL_KEY") && !bundle2.containsKey("BUNDLE_RESULT_CANCELED")) {
                            q47Var.I0().x(new p17(bundle2.getLong("BUNDLE_RESULT_START_TIME_SEC", 0L), bundle2.getLong("BUNDLE_RESULT_END_TIME_SEC", 0L)));
                        }
                        break;
                    case 7:
                        gl5 gl5Var8 = q47.U1;
                        str.getClass();
                        if (str.equals("REQUEST_BET_HISTORY_STATUS_FILTER_KEY") && bundle2.containsKey("HISTORY_STATUS_UPDATE_FILTER_REQUEST") && bundle2.getBoolean("HISTORY_STATUS_UPDATE_FILTER_REQUEST")) {
                            q47Var.I0().x(h37.f12371a);
                        }
                        break;
                    case 8:
                        gl5 gl5Var9 = q47.U1;
                        str.getClass();
                        if (str.equals("REQUEST_ALL_FILTERS_DIALOG_KEY")) {
                            HistoryDateFilterTypeModel historyDateFilterTypeModel2 = (HistoryDateFilterTypeModel) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("REQUEST_HISTORY_KEY") : (Parcelable) bundle2.getParcelable("REQUEST_HISTORY_KEY", HistoryDateFilterTypeModel.class));
                            boolean z = bundle2.getBoolean("SELECTED_DATE_KEY", false);
                            if (historyDateFilterTypeModel2 != null) {
                                q47Var.I0().x(new n17(historyDateFilterTypeModel2));
                            } else if (z) {
                                q47Var.I0().x(m27.f21042a);
                            }
                            break;
                        }
                        break;
                    default:
                        gl5 gl5Var10 = q47.U1;
                        str.getClass();
                        if (bundle2.containsKey("BET_INFO_FRAGMENT_REQUEST_KEY") && (string = bundle2.getString("BET_INFO_FRAGMENT_REQUEST_KEY")) != null) {
                            q47Var.I0().x(new o27(string));
                            break;
                        }
                        break;
                }
            }
        });
        vcc.g0(this, "REQUEST_EDIT_COUPON_DIALOG", new Function2(this) { // from class: a.n47
            public final /* synthetic */ q47 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                byte b9 = b6;
                q47 q47Var = this.b;
                switch (b9) {
                    case 0:
                        fet fetVar = (fet) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        gl5 gl5Var = q47.U1;
                        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                            q47 q47Var2 = this.b;
                            pz40 pz40VarY = ((i3t0) q47Var2.I0()).y(fetVar);
                            k3t0 k3t0VarI0 = q47Var2.I0();
                            boolean zI = fetVar.i(q47Var2);
                            Object objP = fetVar.P();
                            cl5 cl5Var = ukd.f35823a;
                            if (zI || objP == cl5Var) {
                                objP = new ur6(1, q47Var2, q47.class, "collectSideEffect", "collectSideEffect(Lorg/xplatform/bet_history/history/presentation/model/viewmodel/BetHistorySideEffect;)V", 0, (byte) 15);
                                fetVar.o0(objP);
                            }
                            lkz lkzVar = lkz.f20223a;
                            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
                            boolean zI2 = fetVar.i(k3t0VarI0) | fetVar.i(q47Var2) | fetVar.e(3) | fetVar.g(pz40VarF);
                            Object objP2 = fetVar.P();
                            if (zI2 || objP2 == cl5Var) {
                                objP2 = new l10(k3t0VarI0, q47Var2, pz40VarF, null, (byte) 29);
                                fetVar.o0(objP2);
                            }
                            m0x0.t(fetVar, q47Var2, (Function2) objP2);
                            int iOrdinal = ((BetHistoryScreenModel) q47Var2.Q1.n(q47Var2, q47.V1[1])).getC().ordinal();
                            if (iOrdinal == 0) {
                                fetVar.e0(168386433);
                                n0q n0qVar = o7k0.c;
                                z77 z77Var = (z77) pz40VarY.getValue();
                                k3t0 k3t0VarI1 = q47Var2.I0();
                                boolean zI3 = fetVar.i(k3t0VarI1);
                                Object objP3 = fetVar.P();
                                if (zI3 || objP3 == cl5Var) {
                                    objP3 = new ur6(1, k3t0VarI1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 16);
                                    fetVar.o0(objP3);
                                }
                                dwi0.f(n0qVar, z77Var, (Function1) ((jhy) objP3), fetVar, 6);
                                fetVar.r(false);
                            } else if (iOrdinal == 1) {
                                fetVar.e0(168693240);
                                n0q n0qVar2 = o7k0.c;
                                z77 z77Var2 = (z77) pz40VarY.getValue();
                                k3t0 k3t0VarI2 = q47Var2.I0();
                                boolean zI4 = fetVar.i(k3t0VarI2);
                                Object objP4 = fetVar.P();
                                if (zI4 || objP4 == cl5Var) {
                                    objP4 = new ur6(1, k3t0VarI2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 17);
                                    fetVar.o0(objP4);
                                }
                                idm0.c(n0qVar2, z77Var2, (Function1) ((jhy) objP4), fetVar, 6);
                                fetVar.r(false);
                            } else if (iOrdinal == 2) {
                                fetVar.e0(169011703);
                                n0q n0qVar3 = o7k0.c;
                                z77 z77Var3 = (z77) pz40VarY.getValue();
                                k3t0 k3t0VarI3 = q47Var2.I0();
                                boolean zI5 = fetVar.i(k3t0VarI3);
                                Object objP5 = fetVar.P();
                                if (zI5 || objP5 == cl5Var) {
                                    objP5 = new ur6(1, k3t0VarI3, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 18);
                                    fetVar.o0(objP5);
                                }
                                q7x.g(n0qVar3, z77Var3, (Function1) ((jhy) objP5), fetVar, 6);
                                fetVar.r(false);
                            } else if (iOrdinal == 3) {
                                fetVar.e0(169324183);
                                n0q n0qVar4 = o7k0.c;
                                z77 z77Var4 = (z77) pz40VarY.getValue();
                                k3t0 k3t0VarI4 = q47Var2.I0();
                                boolean zI6 = fetVar.i(k3t0VarI4);
                                Object objP6 = fetVar.P();
                                if (zI6 || objP6 == cl5Var) {
                                    objP6 = new ur6(1, k3t0VarI4, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 19);
                                    fetVar.o0(objP6);
                                }
                                hkb.b(n0qVar4, z77Var4, (Function1) ((jhy) objP6), fetVar, 6);
                                fetVar.r(false);
                            } else if (iOrdinal != 4) {
                                fetVar.e0(169914082);
                                n0q n0qVar5 = o7k0.c;
                                z77 z77Var5 = (z77) pz40VarY.getValue();
                                k3t0 k3t0VarI5 = q47Var2.I0();
                                boolean zI7 = fetVar.i(k3t0VarI5);
                                Object objP7 = fetVar.P();
                                if (zI7 || objP7 == cl5Var) {
                                    objP7 = new ur6(1, k3t0VarI5, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 21);
                                    fetVar.o0(objP7);
                                }
                                dwi0.f(n0qVar5, z77Var5, (Function1) ((jhy) objP7), fetVar, 6);
                                fetVar.r(false);
                            } else {
                                fetVar.e0(169637438);
                                n0q n0qVar6 = o7k0.c;
                                z77 z77Var6 = (z77) pz40VarY.getValue();
                                k3t0 k3t0VarI6 = q47Var2.I0();
                                boolean zI8 = fetVar.i(k3t0VarI6);
                                Object objP8 = fetVar.P();
                                if (zI8 || objP8 == cl5Var) {
                                    objP8 = new ur6(1, k3t0VarI6, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 20);
                                    fetVar.o0(objP8);
                                }
                                nnw0.y(n0qVar6, z77Var6, (Function1) ((jhy) objP8), fetVar, 6);
                                fetVar.r(false);
                            }
                        } else {
                            fetVar.X();
                        }
                        break;
                    case 1:
                        Bundle bundle2 = (Bundle) obj2;
                        gl5 gl5Var2 = q47.U1;
                        if (h97.B(bundle2, (String) obj, "REQUEST_BET_UPDATE_BY_ID")) {
                            String string = bundle2.getString("BUNDLE_BET_ID", "");
                            k3t0 k3t0VarI7 = q47Var.I0();
                            string.getClass();
                            k3t0VarI7.x(new g37(string));
                        }
                        break;
                    case 2:
                        Bundle bundle3 = (Bundle) obj2;
                        gl5 gl5Var3 = q47.U1;
                        if (h97.B(bundle3, (String) obj, "REQUEST_KEY_SUCCESS_SALE")) {
                            String string2 = bundle3.getString("BUNDLE_BET_ID", "");
                            k3t0 k3t0VarI8 = q47Var.I0();
                            string2.getClass();
                            k3t0VarI8.x(new g37(string2));
                        }
                        break;
                    case 3:
                        Bundle bundle4 = (Bundle) obj2;
                        gl5 gl5Var4 = q47.U1;
                        ((String) obj).getClass();
                        bundle4.getClass();
                        q47Var.I0().x(new s17(bundle4.getLong("RESULT_KEY_CALENDAR_START_SIMPLE_DATE"), bundle4.getLong("RESULT_KEY_CALENDAR_END_SIMPLE_DATE")));
                        break;
                    case 4:
                        Bundle bundle5 = (Bundle) obj2;
                        gl5 gl5Var5 = q47.U1;
                        ((String) obj).getClass();
                        bundle5.getClass();
                        SimpleDate simpleDate = (SimpleDate) (Build.VERSION.SDK_INT <= 33 ? bundle5.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE") : (Parcelable) bundle5.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE", SimpleDate.class));
                        if (simpleDate != null) {
                            q47Var.I0().x(new r17(simpleDate));
                        }
                        break;
                    case 5:
                        Bundle bundle6 = (Bundle) obj2;
                        gl5 gl5Var6 = q47.U1;
                        ((String) obj).getClass();
                        bundle6.getClass();
                        DateRangeModel dateRangeModel = (DateRangeModel) (Build.VERSION.SDK_INT <= 33 ? bundle6.getParcelable("RESULT_KEY_CALENDAR_DATE_RANGE") : (Parcelable) bundle6.getParcelable("RESULT_KEY_CALENDAR_DATE_RANGE", DateRangeModel.class));
                        if (dateRangeModel != null) {
                            q47Var.I0().x(new q17(dateRangeModel));
                        }
                        break;
                    default:
                        Bundle bundle7 = (Bundle) obj2;
                        gl5 gl5Var7 = q47.U1;
                        if (h97.B(bundle7, (String) obj, "REQUEST_EDIT_COUPON_DIALOG")) {
                            q47Var.I0().x(j37.f15816a);
                        }
                        break;
                }
                return Unit.f46060a;
            }
        });
        ccq0.V(this, "REQUEST_SYSTEM_NOTIFICATION_SETTINGS_DIALOG_KEY", new l47(this, (byte) 4));
        ccq0.V(this, "REQUEST_SETTINGS_PUSH_DIALOG_KEY", new l47(this, (byte) 0));
        ccq0.T(this, "REQUEST_SETTINGS_PUSH_DIALOG_KEY", new l47(this, (byte) 1));
        final byte b9 = 9;
        n0().r().u0("BET_INFO_FRAGMENT_REQUEST_KEY", this, new k4r(this) { // from class: a.k47
            public final /* synthetic */ q47 b;

            {
                this.b = this;
            }

            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                String string;
                byte b10 = b9;
                q47 q47Var = this.b;
                switch (b10) {
                    case 0:
                        gl5 gl5Var = q47.U1;
                        str.getClass();
                        if (str.equals("REQUEST_BET_HISTORY_HIDE_TYME_KEY") && bundle2.containsKey("TIME_MODEL_RESULT")) {
                            TimeTypeModel timeTypeModel = (TimeTypeModel) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("TIME_MODEL_RESULT") : (Parcelable) bundle2.getParcelable("TIME_MODEL_RESULT", TimeTypeModel.class));
                            if (timeTypeModel != null) {
                                q47Var.I0().x(new k27(timeTypeModel));
                                break;
                            }
                        }
                        break;
                    case 1:
                        gl5 gl5Var2 = q47.U1;
                        str.getClass();
                        if (str.equals("HISTORY_DATE_FILTER_REQUEST_KEY") && bundle2.containsKey("HISTORY_DATE_FILTER_REQUEST")) {
                            HistoryDateFilterTypeModel historyDateFilterTypeModel = (HistoryDateFilterTypeModel) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("HISTORY_DATE_FILTER_REQUEST") : (Parcelable) bundle2.getParcelable("HISTORY_DATE_FILTER_REQUEST", HistoryDateFilterTypeModel.class));
                            if (historyDateFilterTypeModel != null) {
                                q47Var.I0().x(new n17(historyDateFilterTypeModel));
                                break;
                            }
                        }
                        break;
                    case 2:
                        gl5 gl5Var3 = q47.U1;
                        str.getClass();
                        if (str.equals("REQUEST_BET_HISTORY_TYPE_KEY")) {
                            if (!bundle2.containsKey("RESULT_BET_HISTORY_CLICK")) {
                                if (bundle2.containsKey("RESULT_HIDE_BET_HISTORY_CLICK")) {
                                    q47Var.I0().x(j27.f15768a);
                                }
                                break;
                            } else {
                                HistoryTypeModel historyTypeModel = (HistoryTypeModel) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("RESULT_BET_HISTORY_CLICK") : (Parcelable) bundle2.getParcelable("RESULT_BET_HISTORY_CLICK", HistoryTypeModel.class));
                                if (historyTypeModel != null) {
                                    q47Var.I0().x(new l27(historyTypeModel));
                                    break;
                                }
                            }
                        }
                        break;
                    case 3:
                        gl5 gl5Var4 = q47.U1;
                        str.getClass();
                        if (str.equals("REQUEST_CONFIRM_SALE_DIALOG_KEY") && bundle2.containsKey("BET_SALE_CONFIRM_REQUEST")) {
                            k3t0 k3t0VarI0 = q47Var.I0();
                            String string2 = bundle2.getString("BET_SALE_CONFIRM_REQUEST", "");
                            string2.getClass();
                            k3t0VarI0.x(new z27(string2));
                        }
                        break;
                    case 4:
                        gl5 gl5Var5 = q47.U1;
                        str.getClass();
                        if (str.equals("REQUEST_BET_HISTORY_MENU_KEY") && bundle2.containsKey("HISTORY_MENU_ITEM_RESULT")) {
                            HistoryMenuItem historyMenuItem = (HistoryMenuItem) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("HISTORY_MENU_ITEM_RESULT") : (Parcelable) bundle2.getParcelable("HISTORY_MENU_ITEM_RESULT", HistoryMenuItem.class));
                            if (historyMenuItem != null) {
                                String string3 = bundle2.getString("HISTORY_MENU_BET_ID_RESULT", "");
                                k3t0 k3t0VarI1 = q47Var.I0();
                                string3.getClass();
                                k3t0VarI1.x(new t27(historyMenuItem, string3));
                                break;
                            }
                        }
                        break;
                    case 5:
                        gl5 gl5Var6 = q47.U1;
                        str.getClass();
                        if (str.equals("HISTORY_DATE_PICKER_KEY") && !bundle2.containsKey("BUNDLE_RESULT_CANCELED")) {
                            q47Var.I0().x(new o17(bundle2.getLong("BUNDLE_RESULT_START_TIME_SEC", 0L), bundle2.getLong("BUNDLE_RESULT_END_TIME_SEC", 0L)));
                        }
                        break;
                    case 6:
                        gl5 gl5Var7 = q47.U1;
                        str.getClass();
                        if (str.equals("HISTORY_DATE_PICKER_MAIL_KEY") && !bundle2.containsKey("BUNDLE_RESULT_CANCELED")) {
                            q47Var.I0().x(new p17(bundle2.getLong("BUNDLE_RESULT_START_TIME_SEC", 0L), bundle2.getLong("BUNDLE_RESULT_END_TIME_SEC", 0L)));
                        }
                        break;
                    case 7:
                        gl5 gl5Var8 = q47.U1;
                        str.getClass();
                        if (str.equals("REQUEST_BET_HISTORY_STATUS_FILTER_KEY") && bundle2.containsKey("HISTORY_STATUS_UPDATE_FILTER_REQUEST") && bundle2.getBoolean("HISTORY_STATUS_UPDATE_FILTER_REQUEST")) {
                            q47Var.I0().x(h37.f12371a);
                        }
                        break;
                    case 8:
                        gl5 gl5Var9 = q47.U1;
                        str.getClass();
                        if (str.equals("REQUEST_ALL_FILTERS_DIALOG_KEY")) {
                            HistoryDateFilterTypeModel historyDateFilterTypeModel2 = (HistoryDateFilterTypeModel) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("REQUEST_HISTORY_KEY") : (Parcelable) bundle2.getParcelable("REQUEST_HISTORY_KEY", HistoryDateFilterTypeModel.class));
                            boolean z = bundle2.getBoolean("SELECTED_DATE_KEY", false);
                            if (historyDateFilterTypeModel2 != null) {
                                q47Var.I0().x(new n17(historyDateFilterTypeModel2));
                            } else if (z) {
                                q47Var.I0().x(m27.f21042a);
                            }
                            break;
                        }
                        break;
                    default:
                        gl5 gl5Var10 = q47.U1;
                        str.getClass();
                        if (bundle2.containsKey("BET_INFO_FRAGMENT_REQUEST_KEY") && (string = bundle2.getString("BET_INFO_FRAGMENT_REQUEST_KEY")) != null) {
                            q47Var.I0().x(new o27(string));
                            break;
                        }
                        break;
                }
            }
        });
        final byte b10 = 8;
        C().u0("REQUEST_ALL_FILTERS_DIALOG_KEY", this, new k4r(this) { // from class: a.k47
            public final /* synthetic */ q47 b;

            {
                this.b = this;
            }

            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                String string;
                byte b11 = b10;
                q47 q47Var = this.b;
                switch (b11) {
                    case 0:
                        gl5 gl5Var = q47.U1;
                        str.getClass();
                        if (str.equals("REQUEST_BET_HISTORY_HIDE_TYME_KEY") && bundle2.containsKey("TIME_MODEL_RESULT")) {
                            TimeTypeModel timeTypeModel = (TimeTypeModel) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("TIME_MODEL_RESULT") : (Parcelable) bundle2.getParcelable("TIME_MODEL_RESULT", TimeTypeModel.class));
                            if (timeTypeModel != null) {
                                q47Var.I0().x(new k27(timeTypeModel));
                                break;
                            }
                        }
                        break;
                    case 1:
                        gl5 gl5Var2 = q47.U1;
                        str.getClass();
                        if (str.equals("HISTORY_DATE_FILTER_REQUEST_KEY") && bundle2.containsKey("HISTORY_DATE_FILTER_REQUEST")) {
                            HistoryDateFilterTypeModel historyDateFilterTypeModel = (HistoryDateFilterTypeModel) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("HISTORY_DATE_FILTER_REQUEST") : (Parcelable) bundle2.getParcelable("HISTORY_DATE_FILTER_REQUEST", HistoryDateFilterTypeModel.class));
                            if (historyDateFilterTypeModel != null) {
                                q47Var.I0().x(new n17(historyDateFilterTypeModel));
                                break;
                            }
                        }
                        break;
                    case 2:
                        gl5 gl5Var3 = q47.U1;
                        str.getClass();
                        if (str.equals("REQUEST_BET_HISTORY_TYPE_KEY")) {
                            if (!bundle2.containsKey("RESULT_BET_HISTORY_CLICK")) {
                                if (bundle2.containsKey("RESULT_HIDE_BET_HISTORY_CLICK")) {
                                    q47Var.I0().x(j27.f15768a);
                                }
                                break;
                            } else {
                                HistoryTypeModel historyTypeModel = (HistoryTypeModel) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("RESULT_BET_HISTORY_CLICK") : (Parcelable) bundle2.getParcelable("RESULT_BET_HISTORY_CLICK", HistoryTypeModel.class));
                                if (historyTypeModel != null) {
                                    q47Var.I0().x(new l27(historyTypeModel));
                                    break;
                                }
                            }
                        }
                        break;
                    case 3:
                        gl5 gl5Var4 = q47.U1;
                        str.getClass();
                        if (str.equals("REQUEST_CONFIRM_SALE_DIALOG_KEY") && bundle2.containsKey("BET_SALE_CONFIRM_REQUEST")) {
                            k3t0 k3t0VarI0 = q47Var.I0();
                            String string2 = bundle2.getString("BET_SALE_CONFIRM_REQUEST", "");
                            string2.getClass();
                            k3t0VarI0.x(new z27(string2));
                        }
                        break;
                    case 4:
                        gl5 gl5Var5 = q47.U1;
                        str.getClass();
                        if (str.equals("REQUEST_BET_HISTORY_MENU_KEY") && bundle2.containsKey("HISTORY_MENU_ITEM_RESULT")) {
                            HistoryMenuItem historyMenuItem = (HistoryMenuItem) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("HISTORY_MENU_ITEM_RESULT") : (Parcelable) bundle2.getParcelable("HISTORY_MENU_ITEM_RESULT", HistoryMenuItem.class));
                            if (historyMenuItem != null) {
                                String string3 = bundle2.getString("HISTORY_MENU_BET_ID_RESULT", "");
                                k3t0 k3t0VarI1 = q47Var.I0();
                                string3.getClass();
                                k3t0VarI1.x(new t27(historyMenuItem, string3));
                                break;
                            }
                        }
                        break;
                    case 5:
                        gl5 gl5Var6 = q47.U1;
                        str.getClass();
                        if (str.equals("HISTORY_DATE_PICKER_KEY") && !bundle2.containsKey("BUNDLE_RESULT_CANCELED")) {
                            q47Var.I0().x(new o17(bundle2.getLong("BUNDLE_RESULT_START_TIME_SEC", 0L), bundle2.getLong("BUNDLE_RESULT_END_TIME_SEC", 0L)));
                        }
                        break;
                    case 6:
                        gl5 gl5Var7 = q47.U1;
                        str.getClass();
                        if (str.equals("HISTORY_DATE_PICKER_MAIL_KEY") && !bundle2.containsKey("BUNDLE_RESULT_CANCELED")) {
                            q47Var.I0().x(new p17(bundle2.getLong("BUNDLE_RESULT_START_TIME_SEC", 0L), bundle2.getLong("BUNDLE_RESULT_END_TIME_SEC", 0L)));
                        }
                        break;
                    case 7:
                        gl5 gl5Var8 = q47.U1;
                        str.getClass();
                        if (str.equals("REQUEST_BET_HISTORY_STATUS_FILTER_KEY") && bundle2.containsKey("HISTORY_STATUS_UPDATE_FILTER_REQUEST") && bundle2.getBoolean("HISTORY_STATUS_UPDATE_FILTER_REQUEST")) {
                            q47Var.I0().x(h37.f12371a);
                        }
                        break;
                    case 8:
                        gl5 gl5Var9 = q47.U1;
                        str.getClass();
                        if (str.equals("REQUEST_ALL_FILTERS_DIALOG_KEY")) {
                            HistoryDateFilterTypeModel historyDateFilterTypeModel2 = (HistoryDateFilterTypeModel) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("REQUEST_HISTORY_KEY") : (Parcelable) bundle2.getParcelable("REQUEST_HISTORY_KEY", HistoryDateFilterTypeModel.class));
                            boolean z = bundle2.getBoolean("SELECTED_DATE_KEY", false);
                            if (historyDateFilterTypeModel2 != null) {
                                q47Var.I0().x(new n17(historyDateFilterTypeModel2));
                            } else if (z) {
                                q47Var.I0().x(m27.f21042a);
                            }
                            break;
                        }
                        break;
                    default:
                        gl5 gl5Var10 = q47.U1;
                        str.getClass();
                        if (bundle2.containsKey("BET_INFO_FRAGMENT_REQUEST_KEY") && (string = bundle2.getString("BET_INFO_FRAGMENT_REQUEST_KEY")) != null) {
                            q47Var.I0().x(new o27(string));
                            break;
                        }
                        break;
                }
            }
        });
        vcc.g0(this, "REQUEST_BET_UPDATE_BY_ID", new Function2(this) { // from class: a.n47
            public final /* synthetic */ q47 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                byte b11 = b3;
                q47 q47Var = this.b;
                switch (b11) {
                    case 0:
                        fet fetVar = (fet) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        gl5 gl5Var = q47.U1;
                        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                            q47 q47Var2 = this.b;
                            pz40 pz40VarY = ((i3t0) q47Var2.I0()).y(fetVar);
                            k3t0 k3t0VarI0 = q47Var2.I0();
                            boolean zI = fetVar.i(q47Var2);
                            Object objP = fetVar.P();
                            cl5 cl5Var = ukd.f35823a;
                            if (zI || objP == cl5Var) {
                                objP = new ur6(1, q47Var2, q47.class, "collectSideEffect", "collectSideEffect(Lorg/xplatform/bet_history/history/presentation/model/viewmodel/BetHistorySideEffect;)V", 0, (byte) 15);
                                fetVar.o0(objP);
                            }
                            lkz lkzVar = lkz.f20223a;
                            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
                            boolean zI2 = fetVar.i(k3t0VarI0) | fetVar.i(q47Var2) | fetVar.e(3) | fetVar.g(pz40VarF);
                            Object objP2 = fetVar.P();
                            if (zI2 || objP2 == cl5Var) {
                                objP2 = new l10(k3t0VarI0, q47Var2, pz40VarF, null, (byte) 29);
                                fetVar.o0(objP2);
                            }
                            m0x0.t(fetVar, q47Var2, (Function2) objP2);
                            int iOrdinal = ((BetHistoryScreenModel) q47Var2.Q1.n(q47Var2, q47.V1[1])).getC().ordinal();
                            if (iOrdinal == 0) {
                                fetVar.e0(168386433);
                                n0q n0qVar = o7k0.c;
                                z77 z77Var = (z77) pz40VarY.getValue();
                                k3t0 k3t0VarI1 = q47Var2.I0();
                                boolean zI3 = fetVar.i(k3t0VarI1);
                                Object objP3 = fetVar.P();
                                if (zI3 || objP3 == cl5Var) {
                                    objP3 = new ur6(1, k3t0VarI1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 16);
                                    fetVar.o0(objP3);
                                }
                                dwi0.f(n0qVar, z77Var, (Function1) ((jhy) objP3), fetVar, 6);
                                fetVar.r(false);
                            } else if (iOrdinal == 1) {
                                fetVar.e0(168693240);
                                n0q n0qVar2 = o7k0.c;
                                z77 z77Var2 = (z77) pz40VarY.getValue();
                                k3t0 k3t0VarI2 = q47Var2.I0();
                                boolean zI4 = fetVar.i(k3t0VarI2);
                                Object objP4 = fetVar.P();
                                if (zI4 || objP4 == cl5Var) {
                                    objP4 = new ur6(1, k3t0VarI2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 17);
                                    fetVar.o0(objP4);
                                }
                                idm0.c(n0qVar2, z77Var2, (Function1) ((jhy) objP4), fetVar, 6);
                                fetVar.r(false);
                            } else if (iOrdinal == 2) {
                                fetVar.e0(169011703);
                                n0q n0qVar3 = o7k0.c;
                                z77 z77Var3 = (z77) pz40VarY.getValue();
                                k3t0 k3t0VarI3 = q47Var2.I0();
                                boolean zI5 = fetVar.i(k3t0VarI3);
                                Object objP5 = fetVar.P();
                                if (zI5 || objP5 == cl5Var) {
                                    objP5 = new ur6(1, k3t0VarI3, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 18);
                                    fetVar.o0(objP5);
                                }
                                q7x.g(n0qVar3, z77Var3, (Function1) ((jhy) objP5), fetVar, 6);
                                fetVar.r(false);
                            } else if (iOrdinal == 3) {
                                fetVar.e0(169324183);
                                n0q n0qVar4 = o7k0.c;
                                z77 z77Var4 = (z77) pz40VarY.getValue();
                                k3t0 k3t0VarI4 = q47Var2.I0();
                                boolean zI6 = fetVar.i(k3t0VarI4);
                                Object objP6 = fetVar.P();
                                if (zI6 || objP6 == cl5Var) {
                                    objP6 = new ur6(1, k3t0VarI4, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 19);
                                    fetVar.o0(objP6);
                                }
                                hkb.b(n0qVar4, z77Var4, (Function1) ((jhy) objP6), fetVar, 6);
                                fetVar.r(false);
                            } else if (iOrdinal != 4) {
                                fetVar.e0(169914082);
                                n0q n0qVar5 = o7k0.c;
                                z77 z77Var5 = (z77) pz40VarY.getValue();
                                k3t0 k3t0VarI5 = q47Var2.I0();
                                boolean zI7 = fetVar.i(k3t0VarI5);
                                Object objP7 = fetVar.P();
                                if (zI7 || objP7 == cl5Var) {
                                    objP7 = new ur6(1, k3t0VarI5, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 21);
                                    fetVar.o0(objP7);
                                }
                                dwi0.f(n0qVar5, z77Var5, (Function1) ((jhy) objP7), fetVar, 6);
                                fetVar.r(false);
                            } else {
                                fetVar.e0(169637438);
                                n0q n0qVar6 = o7k0.c;
                                z77 z77Var6 = (z77) pz40VarY.getValue();
                                k3t0 k3t0VarI6 = q47Var2.I0();
                                boolean zI8 = fetVar.i(k3t0VarI6);
                                Object objP8 = fetVar.P();
                                if (zI8 || objP8 == cl5Var) {
                                    objP8 = new ur6(1, k3t0VarI6, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 20);
                                    fetVar.o0(objP8);
                                }
                                nnw0.y(n0qVar6, z77Var6, (Function1) ((jhy) objP8), fetVar, 6);
                                fetVar.r(false);
                            }
                        } else {
                            fetVar.X();
                        }
                        break;
                    case 1:
                        Bundle bundle2 = (Bundle) obj2;
                        gl5 gl5Var2 = q47.U1;
                        if (h97.B(bundle2, (String) obj, "REQUEST_BET_UPDATE_BY_ID")) {
                            String string = bundle2.getString("BUNDLE_BET_ID", "");
                            k3t0 k3t0VarI7 = q47Var.I0();
                            string.getClass();
                            k3t0VarI7.x(new g37(string));
                        }
                        break;
                    case 2:
                        Bundle bundle3 = (Bundle) obj2;
                        gl5 gl5Var3 = q47.U1;
                        if (h97.B(bundle3, (String) obj, "REQUEST_KEY_SUCCESS_SALE")) {
                            String string2 = bundle3.getString("BUNDLE_BET_ID", "");
                            k3t0 k3t0VarI8 = q47Var.I0();
                            string2.getClass();
                            k3t0VarI8.x(new g37(string2));
                        }
                        break;
                    case 3:
                        Bundle bundle4 = (Bundle) obj2;
                        gl5 gl5Var4 = q47.U1;
                        ((String) obj).getClass();
                        bundle4.getClass();
                        q47Var.I0().x(new s17(bundle4.getLong("RESULT_KEY_CALENDAR_START_SIMPLE_DATE"), bundle4.getLong("RESULT_KEY_CALENDAR_END_SIMPLE_DATE")));
                        break;
                    case 4:
                        Bundle bundle5 = (Bundle) obj2;
                        gl5 gl5Var5 = q47.U1;
                        ((String) obj).getClass();
                        bundle5.getClass();
                        SimpleDate simpleDate = (SimpleDate) (Build.VERSION.SDK_INT <= 33 ? bundle5.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE") : (Parcelable) bundle5.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE", SimpleDate.class));
                        if (simpleDate != null) {
                            q47Var.I0().x(new r17(simpleDate));
                        }
                        break;
                    case 5:
                        Bundle bundle6 = (Bundle) obj2;
                        gl5 gl5Var6 = q47.U1;
                        ((String) obj).getClass();
                        bundle6.getClass();
                        DateRangeModel dateRangeModel = (DateRangeModel) (Build.VERSION.SDK_INT <= 33 ? bundle6.getParcelable("RESULT_KEY_CALENDAR_DATE_RANGE") : (Parcelable) bundle6.getParcelable("RESULT_KEY_CALENDAR_DATE_RANGE", DateRangeModel.class));
                        if (dateRangeModel != null) {
                            q47Var.I0().x(new q17(dateRangeModel));
                        }
                        break;
                    default:
                        Bundle bundle7 = (Bundle) obj2;
                        gl5 gl5Var7 = q47.U1;
                        if (h97.B(bundle7, (String) obj, "REQUEST_EDIT_COUPON_DIALOG")) {
                            q47Var.I0().x(j37.f15816a);
                        }
                        break;
                }
                return Unit.f46060a;
            }
        });
        sj3.A0(this, "HISTORY_DAY_PICKER_KEY", new Function2(this) { // from class: a.n47
            public final /* synthetic */ q47 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                byte b11 = b7;
                q47 q47Var = this.b;
                switch (b11) {
                    case 0:
                        fet fetVar = (fet) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        gl5 gl5Var = q47.U1;
                        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                            q47 q47Var2 = this.b;
                            pz40 pz40VarY = ((i3t0) q47Var2.I0()).y(fetVar);
                            k3t0 k3t0VarI0 = q47Var2.I0();
                            boolean zI = fetVar.i(q47Var2);
                            Object objP = fetVar.P();
                            cl5 cl5Var = ukd.f35823a;
                            if (zI || objP == cl5Var) {
                                objP = new ur6(1, q47Var2, q47.class, "collectSideEffect", "collectSideEffect(Lorg/xplatform/bet_history/history/presentation/model/viewmodel/BetHistorySideEffect;)V", 0, (byte) 15);
                                fetVar.o0(objP);
                            }
                            lkz lkzVar = lkz.f20223a;
                            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
                            boolean zI2 = fetVar.i(k3t0VarI0) | fetVar.i(q47Var2) | fetVar.e(3) | fetVar.g(pz40VarF);
                            Object objP2 = fetVar.P();
                            if (zI2 || objP2 == cl5Var) {
                                objP2 = new l10(k3t0VarI0, q47Var2, pz40VarF, null, (byte) 29);
                                fetVar.o0(objP2);
                            }
                            m0x0.t(fetVar, q47Var2, (Function2) objP2);
                            int iOrdinal = ((BetHistoryScreenModel) q47Var2.Q1.n(q47Var2, q47.V1[1])).getC().ordinal();
                            if (iOrdinal == 0) {
                                fetVar.e0(168386433);
                                n0q n0qVar = o7k0.c;
                                z77 z77Var = (z77) pz40VarY.getValue();
                                k3t0 k3t0VarI1 = q47Var2.I0();
                                boolean zI3 = fetVar.i(k3t0VarI1);
                                Object objP3 = fetVar.P();
                                if (zI3 || objP3 == cl5Var) {
                                    objP3 = new ur6(1, k3t0VarI1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 16);
                                    fetVar.o0(objP3);
                                }
                                dwi0.f(n0qVar, z77Var, (Function1) ((jhy) objP3), fetVar, 6);
                                fetVar.r(false);
                            } else if (iOrdinal == 1) {
                                fetVar.e0(168693240);
                                n0q n0qVar2 = o7k0.c;
                                z77 z77Var2 = (z77) pz40VarY.getValue();
                                k3t0 k3t0VarI2 = q47Var2.I0();
                                boolean zI4 = fetVar.i(k3t0VarI2);
                                Object objP4 = fetVar.P();
                                if (zI4 || objP4 == cl5Var) {
                                    objP4 = new ur6(1, k3t0VarI2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 17);
                                    fetVar.o0(objP4);
                                }
                                idm0.c(n0qVar2, z77Var2, (Function1) ((jhy) objP4), fetVar, 6);
                                fetVar.r(false);
                            } else if (iOrdinal == 2) {
                                fetVar.e0(169011703);
                                n0q n0qVar3 = o7k0.c;
                                z77 z77Var3 = (z77) pz40VarY.getValue();
                                k3t0 k3t0VarI3 = q47Var2.I0();
                                boolean zI5 = fetVar.i(k3t0VarI3);
                                Object objP5 = fetVar.P();
                                if (zI5 || objP5 == cl5Var) {
                                    objP5 = new ur6(1, k3t0VarI3, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 18);
                                    fetVar.o0(objP5);
                                }
                                q7x.g(n0qVar3, z77Var3, (Function1) ((jhy) objP5), fetVar, 6);
                                fetVar.r(false);
                            } else if (iOrdinal == 3) {
                                fetVar.e0(169324183);
                                n0q n0qVar4 = o7k0.c;
                                z77 z77Var4 = (z77) pz40VarY.getValue();
                                k3t0 k3t0VarI4 = q47Var2.I0();
                                boolean zI6 = fetVar.i(k3t0VarI4);
                                Object objP6 = fetVar.P();
                                if (zI6 || objP6 == cl5Var) {
                                    objP6 = new ur6(1, k3t0VarI4, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 19);
                                    fetVar.o0(objP6);
                                }
                                hkb.b(n0qVar4, z77Var4, (Function1) ((jhy) objP6), fetVar, 6);
                                fetVar.r(false);
                            } else if (iOrdinal != 4) {
                                fetVar.e0(169914082);
                                n0q n0qVar5 = o7k0.c;
                                z77 z77Var5 = (z77) pz40VarY.getValue();
                                k3t0 k3t0VarI5 = q47Var2.I0();
                                boolean zI7 = fetVar.i(k3t0VarI5);
                                Object objP7 = fetVar.P();
                                if (zI7 || objP7 == cl5Var) {
                                    objP7 = new ur6(1, k3t0VarI5, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 21);
                                    fetVar.o0(objP7);
                                }
                                dwi0.f(n0qVar5, z77Var5, (Function1) ((jhy) objP7), fetVar, 6);
                                fetVar.r(false);
                            } else {
                                fetVar.e0(169637438);
                                n0q n0qVar6 = o7k0.c;
                                z77 z77Var6 = (z77) pz40VarY.getValue();
                                k3t0 k3t0VarI6 = q47Var2.I0();
                                boolean zI8 = fetVar.i(k3t0VarI6);
                                Object objP8 = fetVar.P();
                                if (zI8 || objP8 == cl5Var) {
                                    objP8 = new ur6(1, k3t0VarI6, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 20);
                                    fetVar.o0(objP8);
                                }
                                nnw0.y(n0qVar6, z77Var6, (Function1) ((jhy) objP8), fetVar, 6);
                                fetVar.r(false);
                            }
                        } else {
                            fetVar.X();
                        }
                        break;
                    case 1:
                        Bundle bundle2 = (Bundle) obj2;
                        gl5 gl5Var2 = q47.U1;
                        if (h97.B(bundle2, (String) obj, "REQUEST_BET_UPDATE_BY_ID")) {
                            String string = bundle2.getString("BUNDLE_BET_ID", "");
                            k3t0 k3t0VarI7 = q47Var.I0();
                            string.getClass();
                            k3t0VarI7.x(new g37(string));
                        }
                        break;
                    case 2:
                        Bundle bundle3 = (Bundle) obj2;
                        gl5 gl5Var3 = q47.U1;
                        if (h97.B(bundle3, (String) obj, "REQUEST_KEY_SUCCESS_SALE")) {
                            String string2 = bundle3.getString("BUNDLE_BET_ID", "");
                            k3t0 k3t0VarI8 = q47Var.I0();
                            string2.getClass();
                            k3t0VarI8.x(new g37(string2));
                        }
                        break;
                    case 3:
                        Bundle bundle4 = (Bundle) obj2;
                        gl5 gl5Var4 = q47.U1;
                        ((String) obj).getClass();
                        bundle4.getClass();
                        q47Var.I0().x(new s17(bundle4.getLong("RESULT_KEY_CALENDAR_START_SIMPLE_DATE"), bundle4.getLong("RESULT_KEY_CALENDAR_END_SIMPLE_DATE")));
                        break;
                    case 4:
                        Bundle bundle5 = (Bundle) obj2;
                        gl5 gl5Var5 = q47.U1;
                        ((String) obj).getClass();
                        bundle5.getClass();
                        SimpleDate simpleDate = (SimpleDate) (Build.VERSION.SDK_INT <= 33 ? bundle5.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE") : (Parcelable) bundle5.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE", SimpleDate.class));
                        if (simpleDate != null) {
                            q47Var.I0().x(new r17(simpleDate));
                        }
                        break;
                    case 5:
                        Bundle bundle6 = (Bundle) obj2;
                        gl5 gl5Var6 = q47.U1;
                        ((String) obj).getClass();
                        bundle6.getClass();
                        DateRangeModel dateRangeModel = (DateRangeModel) (Build.VERSION.SDK_INT <= 33 ? bundle6.getParcelable("RESULT_KEY_CALENDAR_DATE_RANGE") : (Parcelable) bundle6.getParcelable("RESULT_KEY_CALENDAR_DATE_RANGE", DateRangeModel.class));
                        if (dateRangeModel != null) {
                            q47Var.I0().x(new q17(dateRangeModel));
                        }
                        break;
                    default:
                        Bundle bundle7 = (Bundle) obj2;
                        gl5 gl5Var7 = q47.U1;
                        if (h97.B(bundle7, (String) obj, "REQUEST_EDIT_COUPON_DIALOG")) {
                            q47Var.I0().x(j37.f15816a);
                        }
                        break;
                }
                return Unit.f46060a;
            }
        });
        sj3.A0(this, "RESULT_KEY_CALENDAR_RANGE_REQUEST", new Function2(this) { // from class: a.n47
            public final /* synthetic */ q47 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                byte b11 = b5;
                q47 q47Var = this.b;
                switch (b11) {
                    case 0:
                        fet fetVar = (fet) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        gl5 gl5Var = q47.U1;
                        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                            q47 q47Var2 = this.b;
                            pz40 pz40VarY = ((i3t0) q47Var2.I0()).y(fetVar);
                            k3t0 k3t0VarI0 = q47Var2.I0();
                            boolean zI = fetVar.i(q47Var2);
                            Object objP = fetVar.P();
                            cl5 cl5Var = ukd.f35823a;
                            if (zI || objP == cl5Var) {
                                objP = new ur6(1, q47Var2, q47.class, "collectSideEffect", "collectSideEffect(Lorg/xplatform/bet_history/history/presentation/model/viewmodel/BetHistorySideEffect;)V", 0, (byte) 15);
                                fetVar.o0(objP);
                            }
                            lkz lkzVar = lkz.f20223a;
                            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
                            boolean zI2 = fetVar.i(k3t0VarI0) | fetVar.i(q47Var2) | fetVar.e(3) | fetVar.g(pz40VarF);
                            Object objP2 = fetVar.P();
                            if (zI2 || objP2 == cl5Var) {
                                objP2 = new l10(k3t0VarI0, q47Var2, pz40VarF, null, (byte) 29);
                                fetVar.o0(objP2);
                            }
                            m0x0.t(fetVar, q47Var2, (Function2) objP2);
                            int iOrdinal = ((BetHistoryScreenModel) q47Var2.Q1.n(q47Var2, q47.V1[1])).getC().ordinal();
                            if (iOrdinal == 0) {
                                fetVar.e0(168386433);
                                n0q n0qVar = o7k0.c;
                                z77 z77Var = (z77) pz40VarY.getValue();
                                k3t0 k3t0VarI1 = q47Var2.I0();
                                boolean zI3 = fetVar.i(k3t0VarI1);
                                Object objP3 = fetVar.P();
                                if (zI3 || objP3 == cl5Var) {
                                    objP3 = new ur6(1, k3t0VarI1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 16);
                                    fetVar.o0(objP3);
                                }
                                dwi0.f(n0qVar, z77Var, (Function1) ((jhy) objP3), fetVar, 6);
                                fetVar.r(false);
                            } else if (iOrdinal == 1) {
                                fetVar.e0(168693240);
                                n0q n0qVar2 = o7k0.c;
                                z77 z77Var2 = (z77) pz40VarY.getValue();
                                k3t0 k3t0VarI2 = q47Var2.I0();
                                boolean zI4 = fetVar.i(k3t0VarI2);
                                Object objP4 = fetVar.P();
                                if (zI4 || objP4 == cl5Var) {
                                    objP4 = new ur6(1, k3t0VarI2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 17);
                                    fetVar.o0(objP4);
                                }
                                idm0.c(n0qVar2, z77Var2, (Function1) ((jhy) objP4), fetVar, 6);
                                fetVar.r(false);
                            } else if (iOrdinal == 2) {
                                fetVar.e0(169011703);
                                n0q n0qVar3 = o7k0.c;
                                z77 z77Var3 = (z77) pz40VarY.getValue();
                                k3t0 k3t0VarI3 = q47Var2.I0();
                                boolean zI5 = fetVar.i(k3t0VarI3);
                                Object objP5 = fetVar.P();
                                if (zI5 || objP5 == cl5Var) {
                                    objP5 = new ur6(1, k3t0VarI3, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 18);
                                    fetVar.o0(objP5);
                                }
                                q7x.g(n0qVar3, z77Var3, (Function1) ((jhy) objP5), fetVar, 6);
                                fetVar.r(false);
                            } else if (iOrdinal == 3) {
                                fetVar.e0(169324183);
                                n0q n0qVar4 = o7k0.c;
                                z77 z77Var4 = (z77) pz40VarY.getValue();
                                k3t0 k3t0VarI4 = q47Var2.I0();
                                boolean zI6 = fetVar.i(k3t0VarI4);
                                Object objP6 = fetVar.P();
                                if (zI6 || objP6 == cl5Var) {
                                    objP6 = new ur6(1, k3t0VarI4, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 19);
                                    fetVar.o0(objP6);
                                }
                                hkb.b(n0qVar4, z77Var4, (Function1) ((jhy) objP6), fetVar, 6);
                                fetVar.r(false);
                            } else if (iOrdinal != 4) {
                                fetVar.e0(169914082);
                                n0q n0qVar5 = o7k0.c;
                                z77 z77Var5 = (z77) pz40VarY.getValue();
                                k3t0 k3t0VarI5 = q47Var2.I0();
                                boolean zI7 = fetVar.i(k3t0VarI5);
                                Object objP7 = fetVar.P();
                                if (zI7 || objP7 == cl5Var) {
                                    objP7 = new ur6(1, k3t0VarI5, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 21);
                                    fetVar.o0(objP7);
                                }
                                dwi0.f(n0qVar5, z77Var5, (Function1) ((jhy) objP7), fetVar, 6);
                                fetVar.r(false);
                            } else {
                                fetVar.e0(169637438);
                                n0q n0qVar6 = o7k0.c;
                                z77 z77Var6 = (z77) pz40VarY.getValue();
                                k3t0 k3t0VarI6 = q47Var2.I0();
                                boolean zI8 = fetVar.i(k3t0VarI6);
                                Object objP8 = fetVar.P();
                                if (zI8 || objP8 == cl5Var) {
                                    objP8 = new ur6(1, k3t0VarI6, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 20);
                                    fetVar.o0(objP8);
                                }
                                nnw0.y(n0qVar6, z77Var6, (Function1) ((jhy) objP8), fetVar, 6);
                                fetVar.r(false);
                            }
                        } else {
                            fetVar.X();
                        }
                        break;
                    case 1:
                        Bundle bundle2 = (Bundle) obj2;
                        gl5 gl5Var2 = q47.U1;
                        if (h97.B(bundle2, (String) obj, "REQUEST_BET_UPDATE_BY_ID")) {
                            String string = bundle2.getString("BUNDLE_BET_ID", "");
                            k3t0 k3t0VarI7 = q47Var.I0();
                            string.getClass();
                            k3t0VarI7.x(new g37(string));
                        }
                        break;
                    case 2:
                        Bundle bundle3 = (Bundle) obj2;
                        gl5 gl5Var3 = q47.U1;
                        if (h97.B(bundle3, (String) obj, "REQUEST_KEY_SUCCESS_SALE")) {
                            String string2 = bundle3.getString("BUNDLE_BET_ID", "");
                            k3t0 k3t0VarI8 = q47Var.I0();
                            string2.getClass();
                            k3t0VarI8.x(new g37(string2));
                        }
                        break;
                    case 3:
                        Bundle bundle4 = (Bundle) obj2;
                        gl5 gl5Var4 = q47.U1;
                        ((String) obj).getClass();
                        bundle4.getClass();
                        q47Var.I0().x(new s17(bundle4.getLong("RESULT_KEY_CALENDAR_START_SIMPLE_DATE"), bundle4.getLong("RESULT_KEY_CALENDAR_END_SIMPLE_DATE")));
                        break;
                    case 4:
                        Bundle bundle5 = (Bundle) obj2;
                        gl5 gl5Var5 = q47.U1;
                        ((String) obj).getClass();
                        bundle5.getClass();
                        SimpleDate simpleDate = (SimpleDate) (Build.VERSION.SDK_INT <= 33 ? bundle5.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE") : (Parcelable) bundle5.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE", SimpleDate.class));
                        if (simpleDate != null) {
                            q47Var.I0().x(new r17(simpleDate));
                        }
                        break;
                    case 5:
                        Bundle bundle6 = (Bundle) obj2;
                        gl5 gl5Var6 = q47.U1;
                        ((String) obj).getClass();
                        bundle6.getClass();
                        DateRangeModel dateRangeModel = (DateRangeModel) (Build.VERSION.SDK_INT <= 33 ? bundle6.getParcelable("RESULT_KEY_CALENDAR_DATE_RANGE") : (Parcelable) bundle6.getParcelable("RESULT_KEY_CALENDAR_DATE_RANGE", DateRangeModel.class));
                        if (dateRangeModel != null) {
                            q47Var.I0().x(new q17(dateRangeModel));
                        }
                        break;
                    default:
                        Bundle bundle7 = (Bundle) obj2;
                        gl5 gl5Var7 = q47.U1;
                        if (h97.B(bundle7, (String) obj, "REQUEST_EDIT_COUPON_DIALOG")) {
                            q47Var.I0().x(j37.f15816a);
                        }
                        break;
                }
                return Unit.f46060a;
            }
        });
        C().u0("REQUEST_CONFIRM_SALE_DIALOG_KEY", this, new k4r(this) { // from class: a.k47
            public final /* synthetic */ q47 b;

            {
                this.b = this;
            }

            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                String string;
                byte b11 = b4;
                q47 q47Var = this.b;
                switch (b11) {
                    case 0:
                        gl5 gl5Var = q47.U1;
                        str.getClass();
                        if (str.equals("REQUEST_BET_HISTORY_HIDE_TYME_KEY") && bundle2.containsKey("TIME_MODEL_RESULT")) {
                            TimeTypeModel timeTypeModel = (TimeTypeModel) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("TIME_MODEL_RESULT") : (Parcelable) bundle2.getParcelable("TIME_MODEL_RESULT", TimeTypeModel.class));
                            if (timeTypeModel != null) {
                                q47Var.I0().x(new k27(timeTypeModel));
                                break;
                            }
                        }
                        break;
                    case 1:
                        gl5 gl5Var2 = q47.U1;
                        str.getClass();
                        if (str.equals("HISTORY_DATE_FILTER_REQUEST_KEY") && bundle2.containsKey("HISTORY_DATE_FILTER_REQUEST")) {
                            HistoryDateFilterTypeModel historyDateFilterTypeModel = (HistoryDateFilterTypeModel) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("HISTORY_DATE_FILTER_REQUEST") : (Parcelable) bundle2.getParcelable("HISTORY_DATE_FILTER_REQUEST", HistoryDateFilterTypeModel.class));
                            if (historyDateFilterTypeModel != null) {
                                q47Var.I0().x(new n17(historyDateFilterTypeModel));
                                break;
                            }
                        }
                        break;
                    case 2:
                        gl5 gl5Var3 = q47.U1;
                        str.getClass();
                        if (str.equals("REQUEST_BET_HISTORY_TYPE_KEY")) {
                            if (!bundle2.containsKey("RESULT_BET_HISTORY_CLICK")) {
                                if (bundle2.containsKey("RESULT_HIDE_BET_HISTORY_CLICK")) {
                                    q47Var.I0().x(j27.f15768a);
                                }
                                break;
                            } else {
                                HistoryTypeModel historyTypeModel = (HistoryTypeModel) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("RESULT_BET_HISTORY_CLICK") : (Parcelable) bundle2.getParcelable("RESULT_BET_HISTORY_CLICK", HistoryTypeModel.class));
                                if (historyTypeModel != null) {
                                    q47Var.I0().x(new l27(historyTypeModel));
                                    break;
                                }
                            }
                        }
                        break;
                    case 3:
                        gl5 gl5Var4 = q47.U1;
                        str.getClass();
                        if (str.equals("REQUEST_CONFIRM_SALE_DIALOG_KEY") && bundle2.containsKey("BET_SALE_CONFIRM_REQUEST")) {
                            k3t0 k3t0VarI0 = q47Var.I0();
                            String string2 = bundle2.getString("BET_SALE_CONFIRM_REQUEST", "");
                            string2.getClass();
                            k3t0VarI0.x(new z27(string2));
                        }
                        break;
                    case 4:
                        gl5 gl5Var5 = q47.U1;
                        str.getClass();
                        if (str.equals("REQUEST_BET_HISTORY_MENU_KEY") && bundle2.containsKey("HISTORY_MENU_ITEM_RESULT")) {
                            HistoryMenuItem historyMenuItem = (HistoryMenuItem) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("HISTORY_MENU_ITEM_RESULT") : (Parcelable) bundle2.getParcelable("HISTORY_MENU_ITEM_RESULT", HistoryMenuItem.class));
                            if (historyMenuItem != null) {
                                String string3 = bundle2.getString("HISTORY_MENU_BET_ID_RESULT", "");
                                k3t0 k3t0VarI1 = q47Var.I0();
                                string3.getClass();
                                k3t0VarI1.x(new t27(historyMenuItem, string3));
                                break;
                            }
                        }
                        break;
                    case 5:
                        gl5 gl5Var6 = q47.U1;
                        str.getClass();
                        if (str.equals("HISTORY_DATE_PICKER_KEY") && !bundle2.containsKey("BUNDLE_RESULT_CANCELED")) {
                            q47Var.I0().x(new o17(bundle2.getLong("BUNDLE_RESULT_START_TIME_SEC", 0L), bundle2.getLong("BUNDLE_RESULT_END_TIME_SEC", 0L)));
                        }
                        break;
                    case 6:
                        gl5 gl5Var7 = q47.U1;
                        str.getClass();
                        if (str.equals("HISTORY_DATE_PICKER_MAIL_KEY") && !bundle2.containsKey("BUNDLE_RESULT_CANCELED")) {
                            q47Var.I0().x(new p17(bundle2.getLong("BUNDLE_RESULT_START_TIME_SEC", 0L), bundle2.getLong("BUNDLE_RESULT_END_TIME_SEC", 0L)));
                        }
                        break;
                    case 7:
                        gl5 gl5Var8 = q47.U1;
                        str.getClass();
                        if (str.equals("REQUEST_BET_HISTORY_STATUS_FILTER_KEY") && bundle2.containsKey("HISTORY_STATUS_UPDATE_FILTER_REQUEST") && bundle2.getBoolean("HISTORY_STATUS_UPDATE_FILTER_REQUEST")) {
                            q47Var.I0().x(h37.f12371a);
                        }
                        break;
                    case 8:
                        gl5 gl5Var9 = q47.U1;
                        str.getClass();
                        if (str.equals("REQUEST_ALL_FILTERS_DIALOG_KEY")) {
                            HistoryDateFilterTypeModel historyDateFilterTypeModel2 = (HistoryDateFilterTypeModel) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("REQUEST_HISTORY_KEY") : (Parcelable) bundle2.getParcelable("REQUEST_HISTORY_KEY", HistoryDateFilterTypeModel.class));
                            boolean z = bundle2.getBoolean("SELECTED_DATE_KEY", false);
                            if (historyDateFilterTypeModel2 != null) {
                                q47Var.I0().x(new n17(historyDateFilterTypeModel2));
                            } else if (z) {
                                q47Var.I0().x(m27.f21042a);
                            }
                            break;
                        }
                        break;
                    default:
                        gl5 gl5Var10 = q47.U1;
                        str.getClass();
                        if (bundle2.containsKey("BET_INFO_FRAGMENT_REQUEST_KEY") && (string = bundle2.getString("BET_INFO_FRAGMENT_REQUEST_KEY")) != null) {
                            q47Var.I0().x(new o27(string));
                            break;
                        }
                        break;
                }
            }
        });
        vcc.g0(this, "REQUEST_KEY_SUCCESS_SALE", new Function2(this) { // from class: a.n47
            public final /* synthetic */ q47 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                byte b11 = b;
                q47 q47Var = this.b;
                switch (b11) {
                    case 0:
                        fet fetVar = (fet) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        gl5 gl5Var = q47.U1;
                        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                            q47 q47Var2 = this.b;
                            pz40 pz40VarY = ((i3t0) q47Var2.I0()).y(fetVar);
                            k3t0 k3t0VarI0 = q47Var2.I0();
                            boolean zI = fetVar.i(q47Var2);
                            Object objP = fetVar.P();
                            cl5 cl5Var = ukd.f35823a;
                            if (zI || objP == cl5Var) {
                                objP = new ur6(1, q47Var2, q47.class, "collectSideEffect", "collectSideEffect(Lorg/xplatform/bet_history/history/presentation/model/viewmodel/BetHistorySideEffect;)V", 0, (byte) 15);
                                fetVar.o0(objP);
                            }
                            lkz lkzVar = lkz.f20223a;
                            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
                            boolean zI2 = fetVar.i(k3t0VarI0) | fetVar.i(q47Var2) | fetVar.e(3) | fetVar.g(pz40VarF);
                            Object objP2 = fetVar.P();
                            if (zI2 || objP2 == cl5Var) {
                                objP2 = new l10(k3t0VarI0, q47Var2, pz40VarF, null, (byte) 29);
                                fetVar.o0(objP2);
                            }
                            m0x0.t(fetVar, q47Var2, (Function2) objP2);
                            int iOrdinal = ((BetHistoryScreenModel) q47Var2.Q1.n(q47Var2, q47.V1[1])).getC().ordinal();
                            if (iOrdinal == 0) {
                                fetVar.e0(168386433);
                                n0q n0qVar = o7k0.c;
                                z77 z77Var = (z77) pz40VarY.getValue();
                                k3t0 k3t0VarI1 = q47Var2.I0();
                                boolean zI3 = fetVar.i(k3t0VarI1);
                                Object objP3 = fetVar.P();
                                if (zI3 || objP3 == cl5Var) {
                                    objP3 = new ur6(1, k3t0VarI1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 16);
                                    fetVar.o0(objP3);
                                }
                                dwi0.f(n0qVar, z77Var, (Function1) ((jhy) objP3), fetVar, 6);
                                fetVar.r(false);
                            } else if (iOrdinal == 1) {
                                fetVar.e0(168693240);
                                n0q n0qVar2 = o7k0.c;
                                z77 z77Var2 = (z77) pz40VarY.getValue();
                                k3t0 k3t0VarI2 = q47Var2.I0();
                                boolean zI4 = fetVar.i(k3t0VarI2);
                                Object objP4 = fetVar.P();
                                if (zI4 || objP4 == cl5Var) {
                                    objP4 = new ur6(1, k3t0VarI2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 17);
                                    fetVar.o0(objP4);
                                }
                                idm0.c(n0qVar2, z77Var2, (Function1) ((jhy) objP4), fetVar, 6);
                                fetVar.r(false);
                            } else if (iOrdinal == 2) {
                                fetVar.e0(169011703);
                                n0q n0qVar3 = o7k0.c;
                                z77 z77Var3 = (z77) pz40VarY.getValue();
                                k3t0 k3t0VarI3 = q47Var2.I0();
                                boolean zI5 = fetVar.i(k3t0VarI3);
                                Object objP5 = fetVar.P();
                                if (zI5 || objP5 == cl5Var) {
                                    objP5 = new ur6(1, k3t0VarI3, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 18);
                                    fetVar.o0(objP5);
                                }
                                q7x.g(n0qVar3, z77Var3, (Function1) ((jhy) objP5), fetVar, 6);
                                fetVar.r(false);
                            } else if (iOrdinal == 3) {
                                fetVar.e0(169324183);
                                n0q n0qVar4 = o7k0.c;
                                z77 z77Var4 = (z77) pz40VarY.getValue();
                                k3t0 k3t0VarI4 = q47Var2.I0();
                                boolean zI6 = fetVar.i(k3t0VarI4);
                                Object objP6 = fetVar.P();
                                if (zI6 || objP6 == cl5Var) {
                                    objP6 = new ur6(1, k3t0VarI4, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 19);
                                    fetVar.o0(objP6);
                                }
                                hkb.b(n0qVar4, z77Var4, (Function1) ((jhy) objP6), fetVar, 6);
                                fetVar.r(false);
                            } else if (iOrdinal != 4) {
                                fetVar.e0(169914082);
                                n0q n0qVar5 = o7k0.c;
                                z77 z77Var5 = (z77) pz40VarY.getValue();
                                k3t0 k3t0VarI5 = q47Var2.I0();
                                boolean zI7 = fetVar.i(k3t0VarI5);
                                Object objP7 = fetVar.P();
                                if (zI7 || objP7 == cl5Var) {
                                    objP7 = new ur6(1, k3t0VarI5, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 21);
                                    fetVar.o0(objP7);
                                }
                                dwi0.f(n0qVar5, z77Var5, (Function1) ((jhy) objP7), fetVar, 6);
                                fetVar.r(false);
                            } else {
                                fetVar.e0(169637438);
                                n0q n0qVar6 = o7k0.c;
                                z77 z77Var6 = (z77) pz40VarY.getValue();
                                k3t0 k3t0VarI6 = q47Var2.I0();
                                boolean zI8 = fetVar.i(k3t0VarI6);
                                Object objP8 = fetVar.P();
                                if (zI8 || objP8 == cl5Var) {
                                    objP8 = new ur6(1, k3t0VarI6, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 20);
                                    fetVar.o0(objP8);
                                }
                                nnw0.y(n0qVar6, z77Var6, (Function1) ((jhy) objP8), fetVar, 6);
                                fetVar.r(false);
                            }
                        } else {
                            fetVar.X();
                        }
                        break;
                    case 1:
                        Bundle bundle2 = (Bundle) obj2;
                        gl5 gl5Var2 = q47.U1;
                        if (h97.B(bundle2, (String) obj, "REQUEST_BET_UPDATE_BY_ID")) {
                            String string = bundle2.getString("BUNDLE_BET_ID", "");
                            k3t0 k3t0VarI7 = q47Var.I0();
                            string.getClass();
                            k3t0VarI7.x(new g37(string));
                        }
                        break;
                    case 2:
                        Bundle bundle3 = (Bundle) obj2;
                        gl5 gl5Var3 = q47.U1;
                        if (h97.B(bundle3, (String) obj, "REQUEST_KEY_SUCCESS_SALE")) {
                            String string2 = bundle3.getString("BUNDLE_BET_ID", "");
                            k3t0 k3t0VarI8 = q47Var.I0();
                            string2.getClass();
                            k3t0VarI8.x(new g37(string2));
                        }
                        break;
                    case 3:
                        Bundle bundle4 = (Bundle) obj2;
                        gl5 gl5Var4 = q47.U1;
                        ((String) obj).getClass();
                        bundle4.getClass();
                        q47Var.I0().x(new s17(bundle4.getLong("RESULT_KEY_CALENDAR_START_SIMPLE_DATE"), bundle4.getLong("RESULT_KEY_CALENDAR_END_SIMPLE_DATE")));
                        break;
                    case 4:
                        Bundle bundle5 = (Bundle) obj2;
                        gl5 gl5Var5 = q47.U1;
                        ((String) obj).getClass();
                        bundle5.getClass();
                        SimpleDate simpleDate = (SimpleDate) (Build.VERSION.SDK_INT <= 33 ? bundle5.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE") : (Parcelable) bundle5.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE", SimpleDate.class));
                        if (simpleDate != null) {
                            q47Var.I0().x(new r17(simpleDate));
                        }
                        break;
                    case 5:
                        Bundle bundle6 = (Bundle) obj2;
                        gl5 gl5Var6 = q47.U1;
                        ((String) obj).getClass();
                        bundle6.getClass();
                        DateRangeModel dateRangeModel = (DateRangeModel) (Build.VERSION.SDK_INT <= 33 ? bundle6.getParcelable("RESULT_KEY_CALENDAR_DATE_RANGE") : (Parcelable) bundle6.getParcelable("RESULT_KEY_CALENDAR_DATE_RANGE", DateRangeModel.class));
                        if (dateRangeModel != null) {
                            q47Var.I0().x(new q17(dateRangeModel));
                        }
                        break;
                    default:
                        Bundle bundle7 = (Bundle) obj2;
                        gl5 gl5Var7 = q47.U1;
                        if (h97.B(bundle7, (String) obj, "REQUEST_EDIT_COUPON_DIALOG")) {
                            q47Var.I0().x(j37.f15816a);
                        }
                        break;
                }
                return Unit.f46060a;
            }
        });
        Object objN = this.K1.n(V1[0], this);
        objN.getClass();
        h97.t(((aid) objN).f919a, new owp0(this), new ugd(-843965306, true, new Function2(this) { // from class: a.n47
            public final /* synthetic */ q47 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                byte b11 = b2;
                q47 q47Var = this.b;
                switch (b11) {
                    case 0:
                        fet fetVar = (fet) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        gl5 gl5Var = q47.U1;
                        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                            q47 q47Var2 = this.b;
                            pz40 pz40VarY = ((i3t0) q47Var2.I0()).y(fetVar);
                            k3t0 k3t0VarI0 = q47Var2.I0();
                            boolean zI = fetVar.i(q47Var2);
                            Object objP = fetVar.P();
                            cl5 cl5Var = ukd.f35823a;
                            if (zI || objP == cl5Var) {
                                objP = new ur6(1, q47Var2, q47.class, "collectSideEffect", "collectSideEffect(Lorg/xplatform/bet_history/history/presentation/model/viewmodel/BetHistorySideEffect;)V", 0, (byte) 15);
                                fetVar.o0(objP);
                            }
                            lkz lkzVar = lkz.f20223a;
                            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
                            boolean zI2 = fetVar.i(k3t0VarI0) | fetVar.i(q47Var2) | fetVar.e(3) | fetVar.g(pz40VarF);
                            Object objP2 = fetVar.P();
                            if (zI2 || objP2 == cl5Var) {
                                objP2 = new l10(k3t0VarI0, q47Var2, pz40VarF, null, (byte) 29);
                                fetVar.o0(objP2);
                            }
                            m0x0.t(fetVar, q47Var2, (Function2) objP2);
                            int iOrdinal = ((BetHistoryScreenModel) q47Var2.Q1.n(q47Var2, q47.V1[1])).getC().ordinal();
                            if (iOrdinal == 0) {
                                fetVar.e0(168386433);
                                n0q n0qVar = o7k0.c;
                                z77 z77Var = (z77) pz40VarY.getValue();
                                k3t0 k3t0VarI1 = q47Var2.I0();
                                boolean zI3 = fetVar.i(k3t0VarI1);
                                Object objP3 = fetVar.P();
                                if (zI3 || objP3 == cl5Var) {
                                    objP3 = new ur6(1, k3t0VarI1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 16);
                                    fetVar.o0(objP3);
                                }
                                dwi0.f(n0qVar, z77Var, (Function1) ((jhy) objP3), fetVar, 6);
                                fetVar.r(false);
                            } else if (iOrdinal == 1) {
                                fetVar.e0(168693240);
                                n0q n0qVar2 = o7k0.c;
                                z77 z77Var2 = (z77) pz40VarY.getValue();
                                k3t0 k3t0VarI2 = q47Var2.I0();
                                boolean zI4 = fetVar.i(k3t0VarI2);
                                Object objP4 = fetVar.P();
                                if (zI4 || objP4 == cl5Var) {
                                    objP4 = new ur6(1, k3t0VarI2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 17);
                                    fetVar.o0(objP4);
                                }
                                idm0.c(n0qVar2, z77Var2, (Function1) ((jhy) objP4), fetVar, 6);
                                fetVar.r(false);
                            } else if (iOrdinal == 2) {
                                fetVar.e0(169011703);
                                n0q n0qVar3 = o7k0.c;
                                z77 z77Var3 = (z77) pz40VarY.getValue();
                                k3t0 k3t0VarI3 = q47Var2.I0();
                                boolean zI5 = fetVar.i(k3t0VarI3);
                                Object objP5 = fetVar.P();
                                if (zI5 || objP5 == cl5Var) {
                                    objP5 = new ur6(1, k3t0VarI3, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 18);
                                    fetVar.o0(objP5);
                                }
                                q7x.g(n0qVar3, z77Var3, (Function1) ((jhy) objP5), fetVar, 6);
                                fetVar.r(false);
                            } else if (iOrdinal == 3) {
                                fetVar.e0(169324183);
                                n0q n0qVar4 = o7k0.c;
                                z77 z77Var4 = (z77) pz40VarY.getValue();
                                k3t0 k3t0VarI4 = q47Var2.I0();
                                boolean zI6 = fetVar.i(k3t0VarI4);
                                Object objP6 = fetVar.P();
                                if (zI6 || objP6 == cl5Var) {
                                    objP6 = new ur6(1, k3t0VarI4, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 19);
                                    fetVar.o0(objP6);
                                }
                                hkb.b(n0qVar4, z77Var4, (Function1) ((jhy) objP6), fetVar, 6);
                                fetVar.r(false);
                            } else if (iOrdinal != 4) {
                                fetVar.e0(169914082);
                                n0q n0qVar5 = o7k0.c;
                                z77 z77Var5 = (z77) pz40VarY.getValue();
                                k3t0 k3t0VarI5 = q47Var2.I0();
                                boolean zI7 = fetVar.i(k3t0VarI5);
                                Object objP7 = fetVar.P();
                                if (zI7 || objP7 == cl5Var) {
                                    objP7 = new ur6(1, k3t0VarI5, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 21);
                                    fetVar.o0(objP7);
                                }
                                dwi0.f(n0qVar5, z77Var5, (Function1) ((jhy) objP7), fetVar, 6);
                                fetVar.r(false);
                            } else {
                                fetVar.e0(169637438);
                                n0q n0qVar6 = o7k0.c;
                                z77 z77Var6 = (z77) pz40VarY.getValue();
                                k3t0 k3t0VarI6 = q47Var2.I0();
                                boolean zI8 = fetVar.i(k3t0VarI6);
                                Object objP8 = fetVar.P();
                                if (zI8 || objP8 == cl5Var) {
                                    objP8 = new ur6(1, k3t0VarI6, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 20);
                                    fetVar.o0(objP8);
                                }
                                nnw0.y(n0qVar6, z77Var6, (Function1) ((jhy) objP8), fetVar, 6);
                                fetVar.r(false);
                            }
                        } else {
                            fetVar.X();
                        }
                        break;
                    case 1:
                        Bundle bundle2 = (Bundle) obj2;
                        gl5 gl5Var2 = q47.U1;
                        if (h97.B(bundle2, (String) obj, "REQUEST_BET_UPDATE_BY_ID")) {
                            String string = bundle2.getString("BUNDLE_BET_ID", "");
                            k3t0 k3t0VarI7 = q47Var.I0();
                            string.getClass();
                            k3t0VarI7.x(new g37(string));
                        }
                        break;
                    case 2:
                        Bundle bundle3 = (Bundle) obj2;
                        gl5 gl5Var3 = q47.U1;
                        if (h97.B(bundle3, (String) obj, "REQUEST_KEY_SUCCESS_SALE")) {
                            String string2 = bundle3.getString("BUNDLE_BET_ID", "");
                            k3t0 k3t0VarI8 = q47Var.I0();
                            string2.getClass();
                            k3t0VarI8.x(new g37(string2));
                        }
                        break;
                    case 3:
                        Bundle bundle4 = (Bundle) obj2;
                        gl5 gl5Var4 = q47.U1;
                        ((String) obj).getClass();
                        bundle4.getClass();
                        q47Var.I0().x(new s17(bundle4.getLong("RESULT_KEY_CALENDAR_START_SIMPLE_DATE"), bundle4.getLong("RESULT_KEY_CALENDAR_END_SIMPLE_DATE")));
                        break;
                    case 4:
                        Bundle bundle5 = (Bundle) obj2;
                        gl5 gl5Var5 = q47.U1;
                        ((String) obj).getClass();
                        bundle5.getClass();
                        SimpleDate simpleDate = (SimpleDate) (Build.VERSION.SDK_INT <= 33 ? bundle5.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE") : (Parcelable) bundle5.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE", SimpleDate.class));
                        if (simpleDate != null) {
                            q47Var.I0().x(new r17(simpleDate));
                        }
                        break;
                    case 5:
                        Bundle bundle6 = (Bundle) obj2;
                        gl5 gl5Var6 = q47.U1;
                        ((String) obj).getClass();
                        bundle6.getClass();
                        DateRangeModel dateRangeModel = (DateRangeModel) (Build.VERSION.SDK_INT <= 33 ? bundle6.getParcelable("RESULT_KEY_CALENDAR_DATE_RANGE") : (Parcelable) bundle6.getParcelable("RESULT_KEY_CALENDAR_DATE_RANGE", DateRangeModel.class));
                        if (dateRangeModel != null) {
                            q47Var.I0().x(new q17(dateRangeModel));
                        }
                        break;
                    default:
                        Bundle bundle7 = (Bundle) obj2;
                        gl5 gl5Var7 = q47.U1;
                        if (h97.B(bundle7, (String) obj, "REQUEST_EDIT_COUPON_DIALOG")) {
                            q47Var.I0().x(j37.f15816a);
                        }
                        break;
                }
                return Unit.f46060a;
            }
        }));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getK1() {
        return this.S1;
    }
}
