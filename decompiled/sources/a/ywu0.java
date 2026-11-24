package a;

import android.content.ComponentCallbacks2;
import android.content.DialogInterface;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/ywu0;", "La/iw5;", "<init>", "()V", "a/sxs0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ywu0 extends iw5 {
    public gzi k2;
    public gl5 l2;
    public ii m2;
    public final cgx0 n2 = new cgx0("pay_in_out");
    public final r34 o2 = new r34("account_id");
    public final r34 p2 = new r34("product_id");
    public final phf0 q2 = new phf0("EXTRA_REQUEST_KEY");
    public final a8z r2 = xbc.a0(this, sre0.f32672a.b(dyu0.class), null, new wwu0(this, (byte) 0), 14);
    public static final /* synthetic */ iiy[] t2 = {new ez40(ywu0.class, "payInOut", "getPayInOut()Z", 0), new ez40(ywu0.class, "balanceId", "getBalanceId()J", 0), new ez40(ywu0.class, "productId", "getProductId()J", 0), new ez40(ywu0.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0)};
    public static final sxs0 s2 = new sxs0((byte) 11);

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        fetVar.e0(1986818970);
        pz40 pz40VarY = ((i3t0) P0()).y(fetVar);
        k3t0 k3t0VarP0 = P0();
        boolean zI = fetVar.i(this);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        byte b = 0;
        if (zI || objP == obj) {
            objP = new xwu0(this, b);
            fetVar.o0(objP);
        }
        lkz lkzVar = lkz.f20223a;
        pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) objP, fetVar);
        byte b2 = 3;
        boolean zI2 = fetVar.i(k3t0VarP0) | fetVar.i(this) | fetVar.e(3) | fetVar.g(pz40VarF);
        Object objP2 = fetVar.P();
        if (zI2 || objP2 == obj) {
            objP2 = new otp0(k3t0VarP0, this, pz40VarF, (yje) null);
            fetVar.o0(objP2);
        }
        m0x0.t(fetVar, this, (Function2) objP2);
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), u1c.M(857243019, new qjr0(pz40VarY, (byte) 5), fetVar), (ugd) null, u1c.M(609274825, new wis0(pz40VarY, this, b2), fetVar), 10);
        fetVar.r(false);
        return bw5Var;
    }

    public final k3t0 P0() {
        return (k3t0) this.r2.getValue();
    }

    public final void Q0(String str, String str2, n12 n12Var) {
        ii iiVar = this.m2;
        if (iiVar == null) {
            Intrinsics.h("actionDialogManager");
            throw null;
        }
        String strH = H(R.string.ok_new);
        strH.getClass();
        DialogFields dialogFields = new DialogFields((CharSequence) str, (CharSequence) str2, (CharSequence) strH, (String) null, (String) null, "ACTION_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12Var, false, 1496);
        androidx.fragment.app.e eVarC = C();
        eVarC.getClass();
        iiVar.d(dialogFields, eVarC);
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(zwu0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            if (!(ze3Var instanceof zwu0)) {
                ze3Var = null;
            }
            zwu0 zwu0Var = (zwu0) ze3Var;
            if (zwu0Var != null) {
                iiy[] iiyVarArr = t2;
                boolean zBooleanValue = this.n2.n(this, iiyVarArr[0]).booleanValue();
                long jLongValue = this.o2.n(this, iiyVarArr[1]).longValue();
                long jLongValue2 = this.p2.n(this, iiyVarArr[2]).longValue();
                xrs xrsVar = new xrs();
                xrsVar.c = zBooleanValue;
                xrsVar.f41384a = jLongValue;
                xrsVar.b = jLongValue2;
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                cad cadVar = zwu0Var.f45127a;
                wsf0 wsf0Var = zwu0Var.b;
                d1p d1pVar = zwu0Var.c;
                oeg0 oeg0Var = zwu0Var.g;
                btt0 btt0Var = zwu0Var.d;
                eqx eqxVar = zwu0Var.e;
                duj dujVar = zwu0Var.f;
                v88 v88Var = zwu0Var.h;
                gii0 gii0Var = zwu0Var.i;
                cyh cyhVar = zwu0Var.k;
                ii iiVar = zwu0Var.j;
                z4w0 z4w0Var = zwu0Var.l;
                ort ortVar = zwu0Var.m;
                gst0 gst0Var = zwu0Var.n;
                ctf0 ctf0Var = zwu0Var.o;
                ih5 ih5Var = zwu0Var.p;
                d1pVar.getClass();
                oeg0Var.getClass();
                iiVar.getClass();
                btt0Var.getClass();
                gii0Var.getClass();
                gst0Var.getClass();
                ctf0Var.getClass();
                byte b = 1;
                this.k2 = (gzi) ((n5d0) new cr(cadVar, wsf0Var, d1pVar, i1w0VarF, xrsVar, iiVar, btt0Var, eqxVar, dujVar, v88Var, gii0Var, cyhVar, z4w0Var, ortVar, gst0Var, ctf0Var, ih5Var).r).get();
                this.l2 = new gl5((byte) 17);
                this.m2 = iiVar;
                super.W(bundle);
                F().f("REQUEST_CAPTCHA_CODE_DIALOG_KEY");
                if (this.l2 == null) {
                    Intrinsics.h("captchaDialogDelegate");
                    throw null;
                }
                gl5.k(this, "REQUEST_CAPTCHA_CODE_DIALOG_KEY", new wwu0(this, (byte) 2), new xwu0(this, b));
                C().u0("REQUEST_CODE", this, new ytt0(this, (byte) 2));
                ccq0.V(this, "ACTION_DIALOG_KEY", new wwu0(this, (byte) 1));
                return;
            }
        }
        jf4.n(b1j.i(zwu0.class, "Cannot create dependency "));
    }

    @Override // a.iw5, a.sik, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        L0().K = true;
        L0().N(3);
    }

    @Override // a.sik, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        super.onDismiss(dialogInterface);
        iiy[] iiyVarArr = t2;
        iiy iiyVar = iiyVarArr[3];
        phf0 phf0Var = this.q2;
        if (phf0Var.n(this, iiyVar).length() > 0) {
            vcc.f0(i120.U(), this, phf0Var.n(this, iiyVarArr[3]));
        }
    }
}
