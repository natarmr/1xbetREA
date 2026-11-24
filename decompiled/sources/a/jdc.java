package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/jdc;", "La/yx5;", "<init>", "()V", "a/cl5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class jdc extends yx5 {
    public fiu0 K1;
    public ii L1;
    public final a8z M1;
    public final s0r N1;
    public final v62 O1;
    public final zz2 P1;
    public static final /* synthetic */ iiy[] R1 = {new j0d0(jdc.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(jdc.class, "limitTypeId", "getLimitTypeId()I", 0)};
    public static final cl5 Q1 = new cl5((byte) 24);

    public jdc() {
        super(R.layout.compose_fragment);
        this.M1 = xbc.b0(this, sre0.f32672a.b(wdc.class), new gdc(this, (byte) 0));
        this.N1 = ltt0.o(this, hdc.f12862a);
        this.O1 = new v62(this, (byte) 7);
        tqt tqtVar = asz.f1411a;
        this.P1 = new zz2("LIMIT_TYPY_ID_KEY", -1);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.N1.n(R1[0], this);
        objN.getClass();
        h97.t(((aid) objN).f919a, new owp0(this), new ugd(1485212511, true, new bna(this, (byte) 25)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(kdc.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            kdc kdcVar = (kdc) (ze3Var instanceof kdc ? ze3Var : null);
            if (kdcVar != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                tqt tqtVar = asz.f1411a;
                int iIntValue = this.P1.n(this, R1[1]).intValue();
                tqtVar.getClass();
                wrz wrzVarD = tqt.d(iIntValue);
                i1w0VarF.getClass();
                ii iiVar = kdcVar.e;
                cad cadVar = kdcVar.d;
                ctf0 ctf0Var = kdcVar.g;
                duj dujVar = kdcVar.f;
                btt0 btt0Var = kdcVar.f18098a;
                knf0 knf0Var = kdcVar.b;
                gii0 gii0Var = kdcVar.c;
                us00 us00Var = kdcVar.h;
                iiVar.getClass();
                ctf0Var.getClass();
                btt0Var.getClass();
                knf0Var.getClass();
                gii0Var.getClass();
                this.K1 = new fiu0(Collections.singletonMap(wdc.class, (dci) new mci(new w000(), cadVar, iiVar, ctf0Var, us00Var, btt0Var, knf0Var, gii0Var, i1w0VarF, wrzVarD, dujVar).r));
                this.L1 = iiVar;
                return;
            }
        }
        jf4.n(b1j.i(kdc.class, "Cannot create dependency "));
    }

    public final k3t0 G0() {
        return (k3t0) this.M1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        ccq0.V(this, "SHOW_CONFIRM_CHANGE_LIMIT_DIALOG_REQUEST_KEY", new gdc(this, (byte) 1));
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        this.O1.e();
        this.j1 = true;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        jg60 jg60VarK;
        kxq kxqVarB = B();
        if (kxqVarB != null && (jg60VarK = kxqVarB.k()) != null) {
            jg60VarK.b(this.O1);
        }
        super.e0();
    }
}
