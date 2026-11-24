package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/m71;", "La/yx5;", "La/d1j;", "<init>", "()V", "a/rek0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class m71 extends yx5 implements d1j {
    public final wtq K1;
    public final e9o0 L1;
    public final r34 M1;
    public final cgx0 N1;
    public final cgx0 O1;
    public final cgx0 P1;
    public final yzn0 Q1;
    public final phf0 R1;
    public final r34 S1;
    public final cgx0 U1;
    public final cgx0 V1;
    public final phf0 W1;
    public final n0o0 X1;
    public final s0r Y1;
    public fiu0 Z1;
    public ii a2;
    public wdk0 b2;
    public ynb c2;
    public final a8z d2;
    public static final /* synthetic */ iiy[] f2 = {new ez40(m71.class, "gameId", "getGameId()J", 0), new ez40(m71.class, "fromMainScreen", "getFromMainScreen()Z", 0), new ez40(m71.class, "demoAvailable", "getDemoAvailable()Z", 0), new ez40(m71.class, "isDemo", "isDemo()Z", 0), new ez40(m71.class, "gameUrl", "getGameUrl()Ljava/lang/String;", 0), new ez40(m71.class, "lobbyUrl", "getLobbyUrl()Ljava/lang/String;", 0), new ez40(m71.class, "balanceId", "getBalanceId()J", 0), new ez40(m71.class, "bonusGame", "getBonusGame()Z", 0), new ez40(m71.class, "unavailableLoyalty", "getUnavailableLoyalty()Z", 0), new ez40(m71.class, "gameMetricsUid", "getGameMetricsUid()Ljava/lang/String;", 0), new j0d0(m71.class, "viewBinding", "getViewBinding()Lorg/xplatform/aggregator/game/impl/databinding/AggregatorGameFragmentBinding;", 0)};
    public static final rek0 e2 = new rek0((byte) 16);

    public m71() {
        super(R.layout.aggregator_game_fragment);
        this.K1 = wtq.c;
        bp3 bp3Var = bp3.f2960a;
        this.L1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitStaticTransparent, 8);
        this.M1 = new r34("GAME_ID");
        this.N1 = new cgx0("FROM_MAIN_SCREEN");
        this.O1 = new cgx0("DEMO_AVAILABLE");
        this.P1 = new cgx0("IS_DEMO");
        this.Q1 = new yzn0("URL");
        this.R1 = new phf0("LOBBY_URL");
        this.S1 = new r34("BALANCE_ID");
        this.U1 = new cgx0("BONUS_GAME");
        this.V1 = new cgx0("UNAVAILABLE_LOYALTY");
        this.W1 = new phf0("GAME_UID");
        this.X1 = maz.b(new k71(this, (byte) 11));
        this.Y1 = ltt0.o(this, l71.f19535a);
        this.d2 = xbc.b0(this, sre0.f32672a.b(n91.class), new k71(this, (byte) 12));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        n0().setRequestedOrientation(-1);
        bdx.O(n0().k(), K(), new m51(this, (byte) 3));
        C().u0("AUTH_DIALOG_CLOSED_RESULT_KEY", K(), new j71(this, (byte) 2));
        C().u0("GAME_CURRENCY_CONVERSATION_REQUEST_KEY", this, new j71(this, (byte) 4));
        ccq0.V(this, "REQUEST_GAME_URL_ERROR_DIALOG_KEY", new k71(this, (byte) 10));
        ccq0.V(this, "REQUEST_NICKNAME_ERROR_DIALOG_KEY", new k71(this, (byte) 1));
        ccq0.V(this, "REQUEST_CONVERT_BALANCE_DIALOG_KEY", new k71(this, (byte) 8));
        ccq0.T(this, "REQUEST_CONVERT_BALANCE_DIALOG_KEY", new k71(this, (byte) 9));
        ccq0.V(this, "REQUEST_BONUS_BALANCE_ERROR_DIALOG_KEY", new k71(this, (byte) 13));
        ccq0.T(this, "REQUEST_BONUS_BALANCE_ERROR_DIALOG_KEY", new k71(this, (byte) 14));
        ccq0.V(this, "REQUEST_SHOW_EMPTY_URL_ERROR_DIALOG_KEY", new k71(this, (byte) 4));
        ccq0.V(this, "REQUEST_NETWORK_ERROR_DIALOG_KEY", new k71(this, (byte) 2));
        ccq0.T(this, "ERROR_DIALOG_KEY", new k71(this, (byte) 3));
        Object objN = this.Y1.n(f2[10], this);
        objN.getClass();
        pkd.h(((iu0) objN).b, new owp0(this), null, new ugd(1817513670, true, new o00(this, (byte) 12)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(i71.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            i71 i71Var = (i71) (ze3Var instanceof i71 ? ze3Var : null);
            if (i71Var != null) {
                iiy[] iiyVarArr = f2;
                n71 n71Var = new n71(this.M1.n(this, iiyVarArr[0]).longValue(), this.N1.n(this, iiyVarArr[1]).booleanValue(), this.O1.n(this, iiyVarArr[2]).booleanValue(), this.P1.n(this, iiyVarArr[3]).booleanValue(), (String) this.Q1.n(this, iiyVarArr[4]), this.R1.n(this, iiyVarArr[5]), this.S1.n(this, iiyVarArr[6]), this.U1.n(this, iiyVarArr[7]).booleanValue(), this.V1.n(this, iiyVarArr[8]).booleanValue(), this.W1.n(this, iiyVarArr[9]));
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                us00 us00Var = i71Var.f14267a;
                fvt0 fvt0Var = i71Var.b;
                iw20 iw20Var = i71Var.c;
                d1p d1pVar = i71Var.d;
                ih5 ih5Var = i71Var.e;
                zg zgVar = i71Var.f;
                ii iiVar = i71Var.g;
                wdk0 wdk0Var = i71Var.h;
                ctf0 ctf0Var = i71Var.i;
                duj dujVar = i71Var.j;
                cad cadVar = i71Var.k;
                oeg0 oeg0Var = i71Var.l;
                j1q0 j1q0Var = i71Var.m;
                wsf0 wsf0Var = i71Var.n;
                peg0 peg0Var = i71Var.o;
                ntu ntuVar = i71Var.p;
                v88 v88Var = i71Var.y;
                yzn0 yzn0Var = i71Var.q;
                ubu ubuVar = i71Var.r;
                tqx tqxVar = i71Var.s;
                do20 do20Var = i71Var.t;
                lrc lrcVar = i71Var.u;
                iqt iqtVar = i71Var.v;
                pl1 pl1Var = i71Var.w;
                a6u a6uVar = i71Var.x;
                gst0 gst0Var = i71Var.z;
                nr00 nr00Var = i71Var.A;
                wsf0 wsf0Var2 = i71Var.B;
                bzt bztVar = i71Var.C;
                d1pVar.getClass();
                iiVar.getClass();
                wdk0Var.getClass();
                ctf0Var.getClass();
                oeg0Var.getClass();
                j1q0Var.getClass();
                gst0Var.getClass();
                this.Z1 = new fiu0(Collections.singletonMap(n91.class, (t5i) new h7i(cadVar, d1pVar, wsf0Var, fvt0Var, iw20Var, peg0Var, nr00Var, wsf0Var2, us00Var, ih5Var, zgVar, n71Var, i1w0VarF, iiVar, wdk0Var, ctf0Var, dujVar, j1q0Var, ntuVar, v88Var, yzn0Var, ubuVar, tqxVar, do20Var, lrcVar, iqtVar, pl1Var, a6uVar, gst0Var, bztVar).B));
                this.a2 = iiVar;
                this.b2 = wdk0Var;
                ynb ynbVarI = ((yzn0) peg0Var.b).i();
                x1x.x(ynbVarI);
                this.c2 = ynbVarI;
                return;
            }
        }
        jf4.n(b1j.i(i71.class, "Cannot create dependency "));
    }

    public final void G0(boolean z) {
        ycm0 ziv0Var;
        Window window = n0().getWindow();
        if (window != null) {
            ani0 ani0Var = new ani0(window.getDecorView());
            int i = Build.VERSION.SDK_INT;
            if (i >= 35) {
                ziv0Var = new bjv0(window, ani0Var);
            } else if (i >= 30) {
                ziv0Var = new ajv0(window, ani0Var);
            } else {
                ziv0Var = i >= 26 ? new ziv0(window, ani0Var) : new yiv0(window, ani0Var);
            }
            ziv0Var.x(2);
            if (z) {
                ziv0Var.s(519);
                window.addFlags(512);
            } else {
                ziv0Var.y(519);
                window.clearFlags(512);
            }
        }
    }

    public final ii H0() {
        ii iiVar = this.a2;
        if (iiVar != null) {
            return iiVar;
        }
        Intrinsics.h("actionDialogManager");
        throw null;
    }

    public final wdk0 I0() {
        wdk0 wdk0Var = this.b2;
        if (wdk0Var != null) {
            return wdk0Var;
        }
        Intrinsics.h("snackBarManager");
        throw null;
    }

    public final k3t0 J0() {
        return (k3t0) this.d2.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        Object objPrevious;
        super.W(bundle);
        List listP = F().c.p();
        listP.getClass();
        List listP2 = C().c.p();
        listP2.getClass();
        ArrayList arrayListQ0 = CollectionsKt.q0(listP, listP2);
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListQ0) {
            if (obj instanceof of80) {
                arrayList.add(obj);
            }
        }
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!((of80) objPrevious).N());
        of80 of80Var = (of80) objPrevious;
        if (of80Var != null) {
            of80Var.z0(false, false, true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void Y() {
        v1r v1rVarR = n0().r();
        v1rVarR.t0(i120.U(), "REQUEST_KEY_CLOSE_GAME");
        v1rVarR.t0(i120.U(), "GAME_CLOSED_KEY");
        G0(false);
        this.j1 = true;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        C().g("AUTH_DIALOG_CLOSED_RESULT_KEY");
        super.Z();
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        this.j1 = true;
        J0().x(a71.f343a);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        J0().x(c71.f3839a);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        Context contextD = D();
        if (contextD != null) {
            J0().x(new d71(contextD));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        this.j1 = true;
        n0().setRequestedOrientation(1);
        J0().x(e71.f7311a);
    }

    @Override // a.d1j
    /* JADX INFO: renamed from: i, reason: from getter */
    public final wtq getK1() {
        return this.K1;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.L1;
    }
}
