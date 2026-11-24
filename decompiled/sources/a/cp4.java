package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/cp4;", "La/yx5;", "<init>", "()V", "a/gfk0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class cp4 extends yx5 {
    public wdk0 K1;
    public fiu0 L1;
    public final yzn0 M1;
    public final s0r N1;
    public final a8z O1;
    public static final /* synthetic */ iiy[] Q1 = {new ez40(cp4.class, "navigation", "getNavigation()Lorg/xplatform/authenticator/api/navigation/AuthenticatorNavigationEnum;", 0), new j0d0(cp4.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final gfk0 P1 = new gfk0((byte) 27);

    public cp4() {
        super(R.layout.compose_fragment);
        this.M1 = new yzn0("NAVIGATION_EXTRA");
        this.N1 = ltt0.o(this, bp4.f2962a);
        this.O1 = xbc.b0(this, sre0.f32672a.b(kp4.class), new zo4(this, (byte) 1));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.N1.n(Q1[1], this);
        objN.getClass();
        b1j.t(((aid) objN).f919a, new ugd(-715858491, true, new fa2(this, (byte) 12)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(m74.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            m74 m74Var = (m74) (ze3Var instanceof m74 ? ze3Var : null);
            if (m74Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                mq4 mq4Var = (mq4) this.M1.n(this, Q1[0]);
                i1w0VarF.getClass();
                mne mneVar = m74Var.f21301a;
                sp4 sp4Var = m74Var.b;
                wdk0 wdk0Var = m74Var.c;
                ctf0 ctf0Var = m74Var.d;
                duj dujVar = m74Var.e;
                rou rouVar = m74Var.f;
                pmi0 pmi0Var = m74Var.g;
                g2v g2vVar = m74Var.h;
                kt2 kt2Var = m74Var.i;
                d1p d1pVar = m74Var.j;
                d1pVar.getClass();
                kt2Var.getClass();
                wdk0Var.getClass();
                ctf0Var.getClass();
                daf dafVar = new daf(mneVar, sp4Var, d1pVar, mq4Var, kt2Var, wdk0Var, ctf0Var, i1w0VarF, dujVar, rouVar, pmi0Var, g2vVar);
                this.K1 = wdk0Var;
                this.L1 = new fiu0(Collections.singletonMap(kp4.class, (n8i) dafVar.m));
                return;
            }
        }
        jf4.n(b1j.i(m74.class, "Cannot create dependency "));
    }
}
