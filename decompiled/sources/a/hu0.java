package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Bundle;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/hu0;", "La/yx5;", "<init>", "()V", "a/rek0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class hu0 extends yx5 {
    public final e9o0 K1;
    public final phf0 L1;
    public final phf0 M1;
    public final phf0 N1;
    public final cgx0 O1;
    public final r34 P1;
    public final r34 Q1;
    public final n0o0 R1;
    public final s0r S1;
    public fiu0 U1;
    public ii V1;
    public wdk0 W1;
    public final a8z X1;
    public static final /* synthetic */ iiy[] Z1 = {new ez40(hu0.class, RemoteMessageConst.Notification.URL, "getUrl()Ljava/lang/String;", 0), new ez40(hu0.class, "title", "getTitle()Ljava/lang/String;", 0), new ez40(hu0.class, "lobbyUrl", "getLobbyUrl()Ljava/lang/String;", 0), new ez40(hu0.class, "paymentEnabled", "getPaymentEnabled()Z", 0), new ez40(hu0.class, "balanceId", "getBalanceId()J", 0), new ez40(hu0.class, "productId", "getProductId()J", 0), new j0d0(hu0.class, "viewBinding", "getViewBinding()Lorg/xplatform/aggregator/game/impl/databinding/AggregatorGameFragmentBinding;", 0)};
    public static final rek0 Y1 = new rek0((byte) 14);

    public hu0() {
        super(R.layout.aggregator_game_fragment);
        bp3 bp3Var = bp3.f2960a;
        this.K1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitStaticTransparent, 8);
        this.L1 = new phf0("URL");
        this.M1 = new phf0("TITLE");
        this.N1 = new phf0("LOBBY_URL");
        this.O1 = new cgx0("PAYMENT_ENABLED");
        this.P1 = new r34("BALANCE_ID");
        this.Q1 = new r34("PRODUCT_ID");
        this.R1 = maz.b(new eu0(this, (byte) 0));
        this.S1 = ltt0.o(this, gu0.f11905a);
        this.X1 = xbc.b0(this, sre0.f32672a.b(tw0.class), new eu0(this, (byte) 1));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        n0().setRequestedOrientation(-1);
        bdx.O(n0().k(), K(), new t1(this, (byte) 24));
        ccq0.T(this, "ERROR_DIALOG_KEY", new eu0(this, (byte) 3));
        Object objN = this.S1.n(Z1[6], this);
        objN.getClass();
        pkd.h(((iu0) objN).b, new owp0(this), null, new ugd(-1054729196, true, new o00(this, (byte) 10)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(wt0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            wt0 wt0Var = (wt0) (ze3Var instanceof wt0 ? ze3Var : null);
            if (wt0Var != null) {
                iiy[] iiyVarArr = Z1;
                bv0 bv0Var = new bv0(this.M1.n(this, iiyVarArr[1]), this.L1.n(this, iiyVarArr[0]), this.N1.n(this, iiyVarArr[2]), this.O1.n(this, iiyVarArr[3]).booleanValue(), this.P1.n(this, iiyVarArr[4]).longValue(), this.Q1.n(this, iiyVarArr[5]).longValue());
                us00 us00Var = wt0Var.f39716a;
                ii iiVar = wt0Var.b;
                wdk0 wdk0Var = wt0Var.c;
                ctf0 ctf0Var = wt0Var.d;
                duj dujVar = wt0Var.e;
                cad cadVar = wt0Var.f;
                oeg0 oeg0Var = wt0Var.g;
                j1q0 j1q0Var = wt0Var.h;
                wsf0 wsf0Var = wt0Var.i;
                bzt bztVar = wt0Var.j;
                r9u r9uVar = wt0Var.k;
                iiVar.getClass();
                wdk0Var.getClass();
                ctf0Var.getClass();
                oeg0Var.getClass();
                j1q0Var.getClass();
                r9uVar.getClass();
                ru ruVar = new ru();
                ruVar.f31100a = us00Var;
                ruVar.c = bv0Var;
                ruVar.e = ctf0Var;
                ruVar.b = dujVar;
                ruVar.d = cadVar;
                ruVar.f = oeg0Var;
                ruVar.g = j1q0Var;
                ruVar.h = wsf0Var;
                ruVar.i = bztVar;
                ruVar.j = new t5i(ruVar, (byte) 14);
                this.U1 = new fiu0(Collections.singletonMap(tw0.class, (t5i) ruVar.j));
                this.V1 = iiVar;
                this.W1 = wdk0Var;
                return;
            }
        }
        jf4.n(b1j.i(wt0.class, "Cannot create dependency "));
    }

    public final k3t0 G0() {
        return (k3t0) this.X1.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void Y() {
        v1r v1rVarR = n0().r();
        v1rVarR.t0(i120.U(), "REQUEST_KEY_CLOSE_GAME");
        v1rVarR.t0(i120.U(), "GAME_CLOSED_KEY");
        this.j1 = true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        this.j1 = true;
        G0().x(qs0.f29234a);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        G0().x(rs0.f31010a);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        Context contextD = D();
        if (contextD != null) {
            G0().x(new ss0(contextD));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        this.j1 = true;
        n0().setRequestedOrientation(1);
        G0().x(ts0.f34440a);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
