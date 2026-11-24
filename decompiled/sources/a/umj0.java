package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/umj0;", "La/yx5;", "<init>", "()V", "a/lme0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class umj0 extends yx5 {
    public final hnm0 K1;
    public fiu0 L1;
    public ii M1;
    public wdk0 N1;
    public final s0r O1;
    public final a8z P1;
    public final n0o0 Q1;
    public final phf0 R1;
    public static final /* synthetic */ iiy[] U1 = {new j0d0(umj0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(umj0.class, "couponId", "getCouponId()Ljava/lang/String;", 0)};
    public static final lme0 S1 = new lme0((byte) 21);

    public umj0() {
        super(R.layout.compose_fragment);
        this.K1 = hnm0.f13359a;
        this.O1 = ltt0.o(this, smj0.f32449a);
        this.P1 = xbc.b0(this, sre0.f32672a.b(eoj0.class), new rmj0(this, (byte) 0));
        this.Q1 = maz.b(new rmj0(this, (byte) 1));
        this.R1 = new phf0("KEY_COUPON_ID");
    }

    public static void H0(umj0 umj0Var, String str, String str2, int i) {
        sek0 sek0Var = qek0.f28589a;
        String str3 = (i & 2) != 0 ? "" : str2;
        if ((i & 4) != 0) {
            sek0Var = rek0.b;
        }
        sek0 sek0Var2 = sek0Var;
        wdk0 wdk0Var = umj0Var.N1;
        if (wdk0Var != null) {
            wdk0.k(wdk0Var, new xdk0(sek0Var2, str, str3, null, null, null, 120), umj0Var, null, null, false, null, 1020);
        } else {
            Intrinsics.h("snackbarManager");
            throw null;
        }
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        ccq0.V(this, "REQUEST_OPEN_SETTINGS_DIALOG_KEY", new rmj0(this, (byte) 2));
        Object objN = this.O1.n(U1[0], this);
        objN.getClass();
        pkd.i(((aid) objN).b, null, new ugd(-1994602753, true, new uph0((Object) this, (byte) 25)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(qmj0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            qmj0 qmj0Var = (qmj0) (ze3Var instanceof qmj0 ? ze3Var : null);
            if (qmj0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                String strN = this.R1.n(this, U1[1]);
                File cacheDir = o0().getCacheDir();
                cacheDir.getClass();
                v5i v5iVarA = qmj0Var.a(i1w0VarF, strN, cacheDir);
                this.L1 = v5iVarA.o();
                this.M1 = (ii) v5iVarA.t;
                this.N1 = (wdk0) v5iVarA.u;
                return;
            }
        }
        jf4.n(b1j.i(qmj0.class, "Cannot create dependency "));
    }

    public final k3t0 G0() {
        return (k3t0) this.P1.getValue();
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.K1;
    }
}
