package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/doe0;", "La/yx5;", "<init>", "()V", "a/gle0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class doe0 extends yx5 {
    public final i9o0 K1;
    public final hnm0 L1;
    public fiu0 M1;
    public hoe0 N1;
    public final s0r O1;
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(doe0.class, "viewBinding", "getViewBinding()Lorg/xplatform/referral/impl/databinding/FragmentReferralProgramLoadDataBinding;", 0)};
    public static final gle0 P1 = new gle0();

    public doe0() {
        super(R.layout.fragment_referral_program_load_data);
        this.K1 = i9o0.f14396a;
        this.L1 = hnm0.f13359a;
        this.O1 = ltt0.o(this, coe0.f4695a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.O1.n(Q1[0], this);
        objN.getClass();
        ((x3r) objN).d.setNavigationOnClickListener(new l910(this, (byte) 29));
        qcc.X(this, new tie0(this, (byte) 6));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(eoe0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            eoe0 eoe0Var = (eoe0) (ze3Var instanceof eoe0 ? ze3Var : null);
            if (eoe0Var != null) {
                pzu pzuVar = eoe0Var.f8135a;
                btt0 btt0Var = eoe0Var.b;
                gii0 gii0Var = eoe0Var.c;
                m1e m1eVar = eoe0Var.d;
                duj dujVar = eoe0Var.e;
                sa10 sa10Var = eoe0Var.f;
                ioe0 ioe0Var = eoe0Var.g;
                btt0Var.getClass();
                gii0Var.getClass();
                m1eVar.getClass();
                ioe0Var.getClass();
                this.M1 = new fiu0(Collections.singletonMap(hoe0.class, (ppi) new rrd(pzuVar, btt0Var, gii0Var, m1eVar, dujVar, sa10Var, ioe0Var).i));
                return;
            }
        }
        jf4.n(b1j.i(eoe0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        hoe0 hoe0Var = this.N1;
        if (hoe0Var == null) {
            Intrinsics.h("viewModel");
            throw null;
        }
        p7m0 p7m0Var = hoe0Var.h;
        jjc0 jjc0Var = new jjc0(2, this, doe0.class, "handleUiState", "handleUiState(Lorg/xplatform/referral/impl/presentation/loaddata/LoadDataState;)V", 4, (byte) 20);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new g4e0((gmq) p7m0Var, clzVarW, jjc0Var, (yje) null, (short) 0), 3);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        fiu0 fiu0Var = this.M1;
        if (fiu0Var == null) {
            Intrinsics.h("viewModelFactory");
            throw null;
        }
        piu0 piu0VarG = g();
        wbf wbfVarO = u4n0.o(this);
        wbfVarO.getClass();
        h0q0 h0q0Var = new h0q0(piu0VarG, fiu0Var, wbfVarO);
        sgy sgyVarB = sre0.f32672a.b(hoe0.class);
        String strT = ny9.T(sgyVarB);
        if (strT != null) {
            this.N1 = (hoe0) h0q0Var.t(sgyVarB, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strT));
        } else {
            jf4.o("Local and anonymous classes can not be ViewModels");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        this.j1 = true;
        hoe0 hoe0Var = this.N1;
        if (hoe0Var != null) {
            v3c.N(hoe0Var.g);
        } else {
            Intrinsics.h("viewModel");
            throw null;
        }
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        hoe0 hoe0Var = this.N1;
        yje yjeVar = null;
        if (hoe0Var == null) {
            Intrinsics.h("viewModel");
            throw null;
        }
        c4m0 c4m0Var = hoe0Var.g;
        byte b = 1;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            hoe0Var.g = sac.T(new fnq(hoe0Var.d.b(), new foe0(hoe0Var, yjeVar, b), (byte) 4), jiu0.a(hoe0Var), goe0.h);
        }
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.L1;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
