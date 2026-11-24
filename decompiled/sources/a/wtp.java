package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/wtp;", "La/yx5;", "<init>", "()V", "a/sek", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class wtp extends yx5 {
    public final e9o0 K1;
    public final boolean L1;
    public fiu0 M1;
    public final s0r N1;
    public final phf0 O1;
    public final r34 P1;
    public final a8z Q1;
    public static final /* synthetic */ iiy[] S1 = {new j0d0(wtp.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(wtp.class, "gameId", "getGameId()Ljava/lang/String;", 0), new ez40(wtp.class, "sportId", "getSportId()J", 0)};
    public static final sek R1 = new sek();

    public wtp() {
        super(R.layout.compose_fragment);
        bp3 bp3Var = bp3.f2960a;
        this.K1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitBackgroundContent, 8);
        this.L1 = true;
        this.N1 = ltt0.o(this, vtp.f38019a);
        this.O1 = new phf0("GAME_ID");
        this.P1 = new r34("SPORT_ID");
        this.Q1 = xbc.b0(this, sre0.f32672a.b(pup.class), new yip(this, (byte) 2));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.N1.n(S1[0], this);
        objN.getClass();
        pkd.h(((aid) objN).f919a, new owp0(this), null, new ugd(-678754238, true, new f5o(this, (byte) 21)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(otp.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            otp otpVar = (otp) (ze3Var instanceof otp ? ze3Var : null);
            if (otpVar != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                iiy[] iiyVarArr = S1;
                String strN = this.O1.n(this, iiyVarArr[1]);
                Long lN = this.P1.n(this, iiyVarArr[2]);
                i1w0VarF.getClass();
                strN.getClass();
                cad cadVar = otpVar.f25840a;
                gii0 gii0Var = otpVar.b;
                duj dujVar = otpVar.c;
                ctf0 ctf0Var = otpVar.h;
                r9u r9uVar = otpVar.g;
                m1e m1eVar = otpVar.e;
                pru pruVar = otpVar.f;
                ocl oclVar = otpVar.i;
                uyu uyuVar = otpVar.j;
                knf0 knf0Var = otpVar.k;
                pmi0 pmi0Var = otpVar.d;
                wyu wyuVar = otpVar.l;
                r9uVar.getClass();
                gii0Var.getClass();
                ctf0Var.getClass();
                m1eVar.getClass();
                knf0Var.getClass();
                wyuVar.getClass();
                this.M1 = new fiu0(Collections.singletonMap(pup.class, (ugi) new h6i(cadVar, pmi0Var, i1w0VarF, r9uVar, gii0Var, pruVar, dujVar, strN, ctf0Var, m1eVar, oclVar, uyuVar, lN, knf0Var, wyuVar).c));
                return;
            }
        }
        jf4.n(b1j.i(otp.class, "Cannot create dependency "));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        ((k3t0) this.Q1.getValue()).x(ltp.f20638a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        this.j1 = true;
        ((k3t0) this.Q1.getValue()).x(ktp.f18877a);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getL1() {
        return this.L1;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
