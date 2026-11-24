package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import java.util.Collections;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/tj7;", "La/iw5;", "<init>", "()V", "a/gl5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class tj7 extends iw5 {
    public fiu0 k2;
    public final a8z l2 = xbc.b0(this, sre0.f32672a.b(zj7.class), new qj7(this, 0));
    public final phf0 m2 = new phf0("BET_SALE_CONFIRM_REQUEST");
    public final phf0 n2 = new phf0("BET_ID_KEY");
    public final phf0 o2 = new phf0("CURRENCY_KEY");
    public final chf0 p2 = new chf0("DOWNGRADE_BET_KEY", (byte) 13);
    public final chf0 q2 = new chf0("SALE_SUM_KEY", (byte) 13);
    public final chf0 r2 = new chf0("AUTO_SALE_SUM_KEY", (byte) 13);
    public final cgx0 s2 = new cgx0("IS_AUTO_SALE_KEY");
    public static final /* synthetic */ iiy[] u2 = {new ez40(tj7.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0), new ez40(tj7.class, "betId", "getBetId()Ljava/lang/String;", 0), new ez40(tj7.class, "currency", "getCurrency()Ljava/lang/String;", 0), new ez40(tj7.class, "downGradeBet", "getDownGradeBet()D", 0), new ez40(tj7.class, "saleSum", "getSaleSum()D", 0), new ez40(tj7.class, "autoSaleSum", "getAutoSaleSum()D", 0), new ez40(tj7.class, "isAutoSale", "isAutoSale()Z", 0)};
    public static final gl5 t2 = new gl5((byte) 6);

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        fetVar.e0(970408688);
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), u1c.M(-1911298401, new rj7(this, (byte) 1), fetVar), (ugd) null, u1c.M(-753766111, new qb(((i3t0) ((k3t0) this.l2.getValue())).y(fetVar).getValue(), (Object) ddz.a(0, 0, fetVar, 0, 3), (Object) this, false, (byte) 21), fetVar), 10);
        fetVar.r(false);
        return bw5Var;
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void V(Context context) {
        super.V(context);
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(ak7.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            ak7 ak7Var = (ak7) (ze3Var instanceof ak7 ? ze3Var : null);
            if (ak7Var != null) {
                iiy[] iiyVarArr = u2;
                String strN = this.n2.n(this, iiyVarArr[1]);
                String strN2 = this.o2.n(this, iiyVarArr[2]);
                Double dN = this.q2.n(this, iiyVarArr[4]);
                strN.getClass();
                strN2.getClass();
                cad cadVar = ak7Var.b;
                ctf0 ctf0Var = ak7Var.f1008a;
                ugf0 ugf0Var = ak7Var.d;
                edo edoVar = ak7Var.e;
                b8u b8uVar = ak7Var.f;
                fme fmeVar = ak7Var.c;
                vjp vjpVar = ak7Var.g;
                edoVar.getClass();
                ctf0Var.getClass();
                fmeVar.getClass();
                this.k2 = new fiu0(Collections.singletonMap(zj7.class, (n8i) new o3c(cadVar, ugf0Var, dN, strN, edoVar, strN2, ctf0Var, b8uVar, fmeVar, vjpVar).k));
                return;
            }
        }
        jf4.n(b1j.i(ak7.class, "Cannot create dependency "));
    }
}
