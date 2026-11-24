package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/tck0;", "La/iw5;", "<init>", "()V", "a/eke0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class tck0 extends iw5 {
    public bui k2;
    public gl5 l2;
    public final phf0 m2 = new phf0("REQUEST_CODE");
    public final cgx0 n2 = new cgx0("PAY_IN_OUT_KEY");
    public final phf0 o2 = new phf0("AMOUNT_KEY");
    public final phf0 p2 = new phf0("REQUEST_GUID_KEY");
    public final r34 q2 = new r34("PRODUCT_ID");
    public final r34 r2 = new r34("BALANCE_ID");
    public final a8z s2 = xbc.a0(this, sre0.f32672a.b(fdk0.class), null, new rck0(this, (byte) 0), 14);
    public static final /* synthetic */ iiy[] u2 = {new ez40(tck0.class, "requestCode", "getRequestCode()Ljava/lang/String;", 0), new ez40(tck0.class, "payInOut", "getPayInOut()Z", 0), new ez40(tck0.class, "amount", "getAmount()Ljava/lang/String;", 0), new ez40(tck0.class, "requestGuid", "getRequestGuid()Ljava/lang/String;", 0), new ez40(tck0.class, "productId", "getProductId()J", 0), new ez40(tck0.class, "balanceId", "getBalanceId()J", 0)};
    public static final eke0 t2 = new eke0();
    public static final String v2 = tck0.class.getSimpleName();

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        fetVar.e0(-1703016918);
        pz40 pz40VarY = ((i3t0) P0()).y(fetVar);
        k3t0 k3t0VarP0 = P0();
        boolean zI = fetVar.i(this);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        byte b = 0;
        if (zI || objP == obj) {
            objP = new sck0(this, b);
            fetVar.o0(objP);
        }
        lkz lkzVar = lkz.f20223a;
        pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) objP, fetVar);
        boolean zI2 = fetVar.i(k3t0VarP0) | fetVar.i(this) | fetVar.e(3) | fetVar.g(pz40VarF);
        Object objP2 = fetVar.P();
        if (zI2 || objP2 == obj) {
            objP2 = new qkb0(k3t0VarP0, this, pz40VarF, (yje) null);
            fetVar.o0(objP2);
        }
        m0x0.t(fetVar, this, (Function2) objP2);
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), u1c.M(615753881, new tft(pz40VarY, (byte) 22), fetVar), (ugd) null, u1c.M(1143147931, new in80(pz40VarY, this, (byte) 28), fetVar), 10);
        fetVar.r(false);
        return bw5Var;
    }

    public final k3t0 P0() {
        return (k3t0) this.s2.getValue();
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(qck0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            if (!(ze3Var instanceof qck0)) {
                ze3Var = null;
            }
            qck0 qck0Var = (qck0) ze3Var;
            if (qck0Var != null) {
                iiy[] iiyVarArr = u2;
                this.r2.n(this, iiyVarArr[5]);
                this.q2.n(this, iiyVarArr[4]);
                a4n0.f(this).getClass();
                cad cadVar = qck0Var.f28487a;
                oeg0 oeg0Var = qck0Var.d;
                btt0 btt0Var = qck0Var.b;
                duj dujVar = qck0Var.c;
                gii0 gii0Var = qck0Var.e;
                cyh cyhVar = qck0Var.f;
                z4w0 z4w0Var = qck0Var.g;
                gst0 gst0Var = qck0Var.h;
                m1e m1eVar = qck0Var.i;
                c1d0 c1d0Var = qck0Var.j;
                o1w0 o1w0Var = qck0Var.k;
                ctf0 ctf0Var = qck0Var.l;
                r9u r9uVar = qck0Var.m;
                oeg0Var.getClass();
                btt0Var.getClass();
                gst0Var.getClass();
                gii0Var.getClass();
                m1eVar.getClass();
                c1d0Var.getClass();
                o1w0Var.getClass();
                ctf0Var.getClass();
                r9uVar.getClass();
                g45 g45Var = new g45();
                g45Var.f10647a = gii0Var;
                g45Var.b = btt0Var;
                g45Var.c = cyhVar;
                g45Var.d = z4w0Var;
                g45Var.e = cadVar;
                g45Var.f = gst0Var;
                g45Var.g = dujVar;
                g45Var.h = ctf0Var;
                g45Var.i = n0k0.a(new rti(g45Var, (byte) 3));
                this.k2 = (bui) ((n5d0) g45Var.i).get();
                this.l2 = new gl5((byte) 17);
                super.W(bundle);
                F().f("REQUEST_CAPTCHA_CODE_DIALOG_KEY");
                if (this.l2 != null) {
                    gl5.k(this, "REQUEST_CAPTCHA_CODE_DIALOG_KEY", new rck0(this, (byte) 1), new sck0(this, (byte) 1));
                    return;
                } else {
                    Intrinsics.h("captchaDialogDelegate");
                    throw null;
                }
            }
        }
        jf4.n(b1j.i(qck0.class, "Cannot create dependency "));
    }

    @Override // a.iw5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        P0().x(ick0.f14540a);
    }

    @Override // a.iw5, a.sik, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        L0().K = true;
        L0().N(3);
    }
}
