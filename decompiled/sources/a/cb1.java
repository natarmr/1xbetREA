package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/cb1;", "La/yx5;", "<init>", "()V", "a/rek0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class cb1 extends yx5 {
    public final i9o0 K1;
    public final r34 L1;
    public final phf0 M1;
    public final zz2 N1;
    public final r34 O1;
    public final r34 P1;
    public final cgx0 Q1;
    public final cgx0 R1;
    public final cgx0 S1;
    public final cgx0 U1;
    public final cgx0 V1;
    public final cgx0 W1;
    public final phf0 X1;
    public final cgx0 Y1;
    public fiu0 Z1;
    public ii a2;
    public wdk0 b2;
    public ynb c2;
    public final a8z d2;
    public static final /* synthetic */ iiy[] f2 = {new ez40(cb1.class, "gameId", "getGameId()J", 0), new ez40(cb1.class, "gameName", "getGameName()Ljava/lang/String;", 0), new ez40(cb1.class, "subcategoryId", "getSubcategoryId()I", 0), new ez40(cb1.class, "providerId", "getProviderId()J", 0), new ez40(cb1.class, "productId", "getProductId()J", 0), new ez40(cb1.class, "needTransfer", "getNeedTransfer()Z", 0), new ez40(cb1.class, "fromMainScreen", "getFromMainScreen()Z", 0), new ez40(cb1.class, "noLoyalty", "getNoLoyalty()Z", 0), new ez40(cb1.class, "demoAvailable", "getDemoAvailable()Z", 0), new ez40(cb1.class, "bonusGame", "getBonusGame()Z", 0), new ez40(cb1.class, "needCheckGame", "getNeedCheckGame()Z", 0), new ez40(cb1.class, "gameMetricsUid", "getGameMetricsUid()Ljava/lang/String;", 0), new ez40(cb1.class, "shouldShowNavBar", "getShouldShowNavBar()Z", 0)};
    public static final rek0 e2 = new rek0((byte) 17);

    public cb1() {
        super(R.layout.aggregator_preload_game_fragment);
        this.K1 = i9o0.f14396a;
        this.L1 = new r34("GAME_ID");
        this.M1 = new phf0("GAME_NAME");
        this.N1 = new zz2("SUBCATEGORY_ID");
        this.O1 = new r34("GAME_PROVIDER_ID");
        this.P1 = new r34("PRODUCT_ID");
        this.Q1 = new cgx0("NEED_TRANSFER");
        this.R1 = new cgx0("FROM_MAIN_SCREEN");
        this.S1 = new cgx0("NO_LOYALTY");
        this.U1 = new cgx0("DEMO_MODE_AVAILABLE");
        this.V1 = new cgx0("BONUS_GAME");
        this.W1 = new cgx0("NEED_CHECK_GAME");
        this.X1 = new phf0("GAME_UID");
        this.Y1 = new cgx0("SHOW_NAV_BAR_KEY");
        this.d2 = xbc.b0(this, sre0.f32672a.b(kc1.class), new ab1(this, (byte) 7));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        ccq0.V(this, "REQUEST_GAME_NOT_AVAILABLE_DIALOG_KEY", new ab1(this, (byte) 1));
        ccq0.V(this, "REQUEST_SHOW_EMPTY_URL_ERROR_DIALOG_KEY", new ab1(this, (byte) 8));
        ccq0.V(this, "REQUEST_GAME_URL_ERROR_DIALOG_KEY", new ab1(this, (byte) 12));
        ccq0.V(this, "REQUEST_NEED_ACTIVATION_ERROR_DIALOG_KEY", new ab1(this, (byte) 11));
        ccq0.V(this, "REQUEST_NETWORK_ERROR_DIALOG_KEY", new ab1(this, (byte) 2));
        ccq0.V(this, "REQUEST_CONVERT_BALANCE_DIALOG_KEY", new ab1(this, (byte) 9));
        ccq0.T(this, "REQUEST_CONVERT_BALANCE_DIALOG_KEY", new ab1(this, (byte) 10));
        ccq0.V(this, "REQUEST_NICKNAME_ERROR_DIALOG_KEY", new ab1(this, (byte) 0));
        ccq0.V(this, "REQUEST_BONUS_BALANCE_ERROR_DIALOG_KEY", new ab1(this, (byte) 4));
        ccq0.T(this, "REQUEST_BONUS_BALANCE_ERROR_DIALOG_KEY", new ab1(this, (byte) 6));
        C().u0("GAME_CURRENCY_CONVERSATION_REQUEST_KEY", this, new bb1(this, (byte) 5));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(za1.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            za1 za1Var = (za1) (ze3Var instanceof za1 ? ze3Var : null);
            if (za1Var != null) {
                iiy[] iiyVarArr = f2;
                db1 db1Var = new db1(this.L1.n(this, iiyVarArr[0]).longValue(), this.M1.n(this, iiyVarArr[1]), this.O1.n(this, iiyVarArr[3]).longValue(), this.P1.n(this, iiyVarArr[4]).longValue(), this.S1.n(this, iiyVarArr[7]).booleanValue(), this.Q1.n(this, iiyVarArr[5]).booleanValue(), this.R1.n(this, iiyVarArr[6]).booleanValue(), this.N1.n(this, iiyVarArr[2]).intValue(), this.U1.n(this, iiyVarArr[8]).booleanValue(), this.V1.n(this, iiyVarArr[9]).booleanValue(), this.W1.n(this, iiyVarArr[10]).booleanValue(), this.X1.n(this, iiyVarArr[11]));
                Boolean boolN = this.Y1.n(this, iiyVarArr[12]);
                cad cadVar = za1Var.f44046a;
                oeg0 oeg0Var = za1Var.g;
                btt0 btt0Var = za1Var.b;
                duj dujVar = za1Var.f;
                wsf0 wsf0Var = za1Var.c;
                fvt0 fvt0Var = za1Var.d;
                d1p d1pVar = za1Var.e;
                u58 u58Var = za1Var.h;
                a6u a6uVar = za1Var.i;
                gst0 gst0Var = za1Var.j;
                peg0 peg0Var = za1Var.o;
                ii iiVar = za1Var.l;
                ntu ntuVar = za1Var.k;
                knf0 knf0Var = za1Var.m;
                wgu wguVar = za1Var.n;
                lrc lrcVar = za1Var.p;
                pl1 pl1Var = za1Var.q;
                bzu bzuVar = za1Var.r;
                ubu ubuVar = za1Var.s;
                tqx tqxVar = za1Var.t;
                s31 s31Var = za1Var.u;
                yzn0 yzn0Var = za1Var.v;
                do20 do20Var = za1Var.w;
                wdk0 wdk0Var = za1Var.x;
                ctf0 ctf0Var = za1Var.y;
                wsf0 wsf0Var2 = za1Var.z;
                d1pVar.getClass();
                iiVar.getClass();
                oeg0Var.getClass();
                btt0Var.getClass();
                gst0Var.getClass();
                knf0Var.getClass();
                wguVar.getClass();
                wdk0Var.getClass();
                ctf0Var.getClass();
                this.Z1 = new fiu0(Collections.singletonMap(kc1.class, (t5i) new gud(cadVar, peg0Var, wsf0Var, fvt0Var, d1pVar, wsf0Var2, boolN, iiVar, oeg0Var, dujVar, db1Var, u58Var, a6uVar, gst0Var, ntuVar, lrcVar, pl1Var, bzuVar, ubuVar, tqxVar, s31Var, yzn0Var, do20Var, wdk0Var, ctf0Var).w));
                this.a2 = iiVar;
                this.b2 = wdk0Var;
                ynb ynbVarI = ((yzn0) peg0Var.b).i();
                x1x.x(ynbVarI);
                this.c2 = ynbVarI;
                return;
            }
        }
        jf4.n(b1j.i(za1.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        k3t0 k3t0VarH0 = H0();
        eo0 eo0Var = new eo0((byte) 21);
        c21 c21Var = new c21(1, this, cb1.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/aggregator/game/impl/game/presentation/models/AggregatorPreloadGameSideEffect;)V", 0, (byte) 13);
        lkz lkzVar = lkz.f20223a;
        gmq gmqVarW = k3t0VarH0.w();
        Class<knx> cls = knx.class;
        oc ocVar = new oc(2, eo0Var, cls, "suspendConversion0", "suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 16);
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new y51(gmqVarW, clzVarW, ocVar, (yje) null), 3);
        gmq gmqVarC = ((i3t0) k3t0VarH0).C();
        oc ocVar2 = new oc(2, c21Var, cls, "suspendConversion0", "suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 17);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new y51((i89) gmqVarC, clzVarW2, ocVar2, (yje) null, (char) 0), 3);
    }

    public final ii G0() {
        ii iiVar = this.a2;
        if (iiVar != null) {
            return iiVar;
        }
        Intrinsics.h("actionDialogManager");
        throw null;
    }

    public final k3t0 H0() {
        return (k3t0) this.d2.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        super.Z();
        C().f("REQUEST_CODE_WALLET_DIALOG_KEY");
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        H0().x(va1.f37062a);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        super.i0(view, bundle);
        pek0 pek0Var = h51.Z1;
        androidx.fragment.app.e eVarC = C();
        eVarC.getClass();
        pek0Var.getClass();
        String simpleName = h51.class.getSimpleName();
        if (eVarC.J(simpleName) == null) {
            sj3.E0(new h51(), eVarC, simpleName);
        }
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0 */
    public final boolean getM1() {
        return this.Y1.n(this, f2[12]).booleanValue();
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
