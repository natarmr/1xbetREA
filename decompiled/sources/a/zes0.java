package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/zes0;", "La/yx5;", "<init>", "()V", "a/m6m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class zes0 extends yx5 {
    public final hnm0 K1;
    public final s0r L1;
    public fiu0 M1;
    public final kiu0 N1;
    public final r34 O1;
    public final zz2 P1;
    public final phf0 Q1;
    public final phf0 R1;
    public final r34 S1;
    public final phf0 U1;
    public final phf0 V1;
    public final chf0 W1;
    public final phf0 X1;
    public final chf0 Y1;
    public final chf0 Z1;
    public final n0o0 a2;
    public static final /* synthetic */ iiy[] c2 = {new j0d0(zes0.class, "binding", "getBinding()Lorg/xplatform/bethistory/impl/databinding/TransactionHistoryFragmentNewBinding;", 0), new ez40(zes0.class, "balanceId", "getBalanceId()J", 0), new ez40(zes0.class, "betHistoryTypeId", "getBetHistoryTypeId()I", 0), new ez40(zes0.class, "betId", "getBetId()Ljava/lang/String;", 0), new ez40(zes0.class, "autoBetId", "getAutoBetId()Ljava/lang/String;", 0), new ez40(zes0.class, "date", "getDate()J", 0), new ez40(zes0.class, "couponTypeName", "getCouponTypeName()Ljava/lang/String;", 0), new ez40(zes0.class, "coefficientString", "getCoefficientString()Ljava/lang/String;", 0), new ez40(zes0.class, "betSum", "getBetSum()D", 0), new ez40(zes0.class, "currencySymbol", "getCurrencySymbol()Ljava/lang/String;", 0), new ez40(zes0.class, "saleSum", "getSaleSum()D", 0), new ez40(zes0.class, "outSum", "getOutSum()D", 0)};
    public static final m6m0 b2 = new m6m0((byte) 27);

    public zes0() {
        super(R.layout.transaction_history_fragment_new);
        this.K1 = hnm0.f13359a;
        this.L1 = ltt0.o(this, xes0.f40759a);
        ves0 ves0Var = new ves0(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new moq0(new moq0(this, (byte) 24), (byte) 25));
        this.N1 = agc.G(this, sre0.f32672a.b(vfs0.class), new p7r0(a8zVarA, (byte) 18), new p7r0(a8zVarA, (byte) 19), ves0Var);
        this.O1 = new r34("BALANCE_ID");
        this.P1 = new zz2("BET_HISTORY_TYPE_ID");
        this.Q1 = new phf0("BET_ID");
        this.R1 = new phf0("AUTO_BET_ID");
        this.S1 = new r34("DATE");
        this.U1 = new phf0("COUPON_TYPE_NAME");
        this.V1 = new phf0("COEFFICIENT_STRING");
        this.W1 = new chf0("BET_SUM", (byte) 13);
        this.X1 = new phf0("CURRENCY_SYMBOL");
        this.Y1 = new chf0("SALE_SUM", (byte) 13);
        this.Z1 = new chf0("OUT_SUM", (byte) 13);
        this.a2 = maz.b(new ves0(this, (byte) 1));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        mc50.a(G0().g, new ves0(this, (byte) 2));
        RecyclerView recyclerView = G0().e;
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(o0(), 1, false));
        recyclerView.setAdapter((les0) this.a2.getValue());
        G0().f.setOnRefreshListener(new b0l0(this, (byte) 26));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(ses0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            ses0 ses0Var = (ses0) (ze3Var instanceof ses0 ? ze3Var : null);
            if (ses0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                iiy[] iiyVarArr = c2;
                Long lN = this.O1.n(this, iiyVarArr[1]);
                String strN = this.Q1.n(this, iiyVarArr[3]);
                Double dN = this.W1.n(this, iiyVarArr[8]);
                i1w0VarF.getClass();
                strN.getClass();
                cad cadVar = ses0Var.f32089a;
                duj dujVar = ses0Var.b;
                gii0 gii0Var = ses0Var.c;
                m1e m1eVar = ses0Var.d;
                wsf0 wsf0Var = ses0Var.f;
                btt0 btt0Var = ses0Var.e;
                ctf0 ctf0Var = ses0Var.g;
                sa10 sa10Var = ses0Var.h;
                gii0Var.getClass();
                m1eVar.getClass();
                btt0Var.getClass();
                ctf0Var.getClass();
                this.M1 = new fiu0(Collections.singletonMap(vfs0.class, (yxi) new daf(cadVar, wsf0Var, dujVar, gii0Var, i1w0VarF, lN, strN, dN, btt0Var, ctf0Var, sa10Var).m));
                return;
            }
        }
        jf4.n(b1j.i(ses0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        xae0 xae0VarN = vtb.N(((vfs0) this.N1.getValue()).l);
        rtq0 rtq0Var = new rtq0(this, null, (byte) 11);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new tsr0(xae0VarN, clzVarW, rtq0Var, (yje) null), 3);
    }

    public final bfs0 G0() {
        Object objN = this.L1.n(c2[0], this);
        objN.getClass();
        return (bfs0) objN;
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.K1;
    }
}
