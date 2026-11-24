package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.uikit.components.cells.right.DsCellRightButton;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/tik0;", "La/yx5;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class tik0 extends yx5 {
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(tik0.class, "binding", "getBinding()Lorg/xplatform/feature/office/social/impl/databinding/FragmentSocialNetworksBinding;", 0)};
    public final hnm0 K1;
    public fiu0 L1;
    public wdk0 M1;
    public kd30 N1;
    public final s0r O1;
    public final kiu0 P1;

    public tik0() {
        super(R.layout.fragment_social_networks);
        this.K1 = hnm0.f13359a;
        this.O1 = ltt0.o(this, sik0.f32267a);
        rik0 rik0Var = new rik0(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new l9i0(new l9i0(this, (byte) 25), (byte) 26));
        this.P1 = agc.G(this, sre0.f32672a.b(cjk0.class), new s9i0(a8zVarA, (byte) 22), new s9i0(a8zVarA, (byte) 23), rik0Var);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        mc50.a(H0().E, new rik0(this, (byte) 1));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(uik0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            uik0 uik0Var = (uik0) (ze3Var instanceof uik0 ? ze3Var : null);
            if (uik0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                cad cadVar = uik0Var.f35735a;
                duj dujVar = uik0Var.b;
                m1e m1eVar = uik0Var.c;
                kt2 kt2Var = uik0Var.d;
                sa10 sa10Var = uik0Var.e;
                pru pruVar = uik0Var.f;
                bzt bztVar = uik0Var.g;
                btt0 btt0Var = uik0Var.h;
                gii0 gii0Var = uik0Var.i;
                wdk0 wdk0Var = uik0Var.j;
                d1p d1pVar = uik0Var.k;
                kd30 kd30Var = uik0Var.l;
                yox yoxVar = uik0Var.m;
                d1pVar.getClass();
                m1eVar.getClass();
                kt2Var.getClass();
                btt0Var.getClass();
                gii0Var.getClass();
                wdk0Var.getClass();
                this.L1 = new fiu0(Collections.singletonMap(cjk0.class, (rti) new qv2(cadVar, d1pVar, yoxVar, i1w0VarF, dujVar, m1eVar, kt2Var, sa10Var, pruVar, bztVar, btt0Var, gii0Var, wdk0Var, kd30Var).n));
                this.M1 = wdk0Var;
                this.N1 = kd30Var;
                return;
            }
        }
        jf4.n(b1j.i(uik0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        p7m0 p7m0Var = I0().m;
        Class<tik0> cls = tik0.class;
        jbh0 jbh0Var = new jbh0(2, this, cls, "handleSocialNetworkState", "handleSocialNetworkState(Lorg/xplatform/feature/office/social/impl/presentation/models/SocialNetworkStateModel;)V", 4, (byte) 17);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new myj0((gmq) p7m0Var, clzVarW, jbh0Var, (yje) null), 3);
        qaf0 qaf0Var = new qaf0(I0().n, (byte) 5);
        jbh0 jbh0Var2 = new jbh0(2, this, cls, "handleAction", "handleAction(Lorg/xplatform/feature/office/social/impl/presentation/SocialNetworksViewModel$Action;)V", 4, (byte) 18);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new myj0(qaf0Var, clzVarW2, jbh0Var2, (yje) null), 3);
    }

    public final void G0(boolean z, ConstraintLayout constraintLayout, FrameLayout frameLayout, DsCellRightButton dsCellRightButton, int i) {
        constraintLayout.setVisibility(0);
        if (z) {
            dyb.O(constraintLayout, new thj0((byte) 29));
            frameLayout.setVisibility(0);
            String strH = H(R.string.social_already_connected);
            strH.getClass();
            dsCellRightButton.l(strH);
            dsCellRightButton.setEnabled(false);
            TypedValue typedValue = j5d.f15927a;
            dsCellRightButton.m(j5d.a(o0(), R.attr.uikitSecondary, false));
            return;
        }
        dsCellRightButton.setEnabled(true);
        dyb.O(dsCellRightButton, new z08((Object) this, i, (byte) 19));
        frameLayout.setVisibility(8);
        String strH2 = H(R.string.connect);
        strH2.getClass();
        dsCellRightButton.l(strH2);
        TypedValue typedValue2 = j5d.f15927a;
        dsCellRightButton.m(j5d.a(o0(), R.attr.uikitPrimary, false));
    }

    public final v4r H0() {
        Object objN = this.O1.n(Q1[0], this);
        objN.getClass();
        return (v4r) objN;
    }

    public final cjk0 I0() {
        return (cjk0) this.P1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        super.i0(view, bundle);
        if (o0().getResources().getBoolean(R.bool.isTablet)) {
            int dimensionPixelSize = G().getDimensionPixelSize(R.dimen.space_36);
            sj3.L0(H0().D, dimensionPixelSize, 0, dimensionPixelSize, 0, 10);
        }
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.K1;
    }
}
