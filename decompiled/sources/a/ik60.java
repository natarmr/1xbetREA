package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/ik60;", "La/yx5;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ik60 extends yx5 {
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(ik60.class, "binding", "getBinding()Lorg/xplatform/onboarding_section/impl/databinding/FragmentOnboardingSectionsBinding;", 0)};
    public final hnm0 K1;
    public lmi L1;
    public final kiu0 M1;
    public roq0 N1;
    public final s0r O1;
    public final a8z P1;

    public ik60() {
        super(R.layout.fragment_onboarding_sections);
        this.K1 = hnm0.f13359a;
        gk60 gk60Var = new gk60(this, (byte) 1);
        ej50 ej50Var = new ej50(this, (byte) 7);
        wez wezVar = wez.b;
        a8z a8zVarA = maz.a(wezVar, new ej50(ej50Var, (byte) 8));
        this.M1 = agc.G(this, sre0.f32672a.b(pk60.class), new y620(a8zVarA, (byte) 26), new y620(a8zVarA, (byte) 27), gk60Var);
        this.O1 = ltt0.o(this, hk60.f13194a);
        this.P1 = maz.a(wezVar, new gk60(this, (byte) 2));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        mc50.a(G0().b, new gk60(this, (byte) 0));
        int dimensionPixelSize = G().getDimensionPixelSize(o0().getResources().getBoolean(R.bool.isTablet) ? R.dimen.space_36 : R.dimen.space_12);
        RecyclerView recyclerView = G0().c;
        recyclerView.setPadding(dimensionPixelSize, recyclerView.getPaddingTop(), dimensionPixelSize, recyclerView.getPaddingBottom());
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter((kk60) this.P1.getValue());
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(jk60.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            jk60 jk60Var = (jk60) (ze3Var instanceof jk60 ? ze3Var : null);
            if (jk60Var != null) {
                d1p d1pVar = jk60Var.f16652a;
                zx10 zx10Var = jk60Var.b;
                peg0 peg0Var = jk60Var.c;
                pek pekVar = jk60Var.d;
                zg zgVar = jk60Var.e;
                czt cztVar = jk60Var.f;
                pmi0 pmi0Var = jk60Var.g;
                ouu ouuVar = jk60Var.h;
                lbu lbuVar = jk60Var.i;
                kj5 kj5Var = jk60Var.j;
                mne mneVar = jk60Var.k;
                bst bstVar = jk60Var.l;
                ctf0 ctf0Var = jk60Var.m;
                pru pruVar = jk60Var.n;
                btt0 btt0Var = jk60Var.o;
                b3c0 b3c0Var = jk60Var.p;
                poq0 poq0Var = jk60Var.r;
                epi0 epi0Var = jk60Var.s;
                gst0 gst0Var = jk60Var.q;
                d1pVar.getClass();
                ctf0Var.getClass();
                btt0Var.getClass();
                b3c0Var.getClass();
                gst0Var.getClass();
                this.L1 = (lmi) ((n5d0) new mci(d1pVar, poq0Var, epi0Var, zx10Var, peg0Var, pekVar, zgVar, cztVar, pmi0Var, ouuVar, lbuVar, kj5Var, mneVar, bstVar, ctf0Var, pruVar, gst0Var).k).get();
                this.N1 = new roq0();
                return;
            }
        }
        jf4.n(b1j.i(jk60.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        kiu0 kiu0Var = this.M1;
        xae0 xae0VarN = vtb.N(((pk60) kiu0Var.getValue()).p);
        int i = 4;
        Class<ik60> cls = ik60.class;
        vf20 vf20Var = new vf20(2, this, cls, "showContent", "showContent(Ljava/util/List;)V", i, (byte) 12);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new yd60(xae0VarN, clzVarW, vf20Var, (yje) null), 3);
        ol60 ol60Var = ((pk60) kiu0Var.getValue()).q;
        vf20 vf20Var2 = new vf20(2, this, cls, "handleOpenTips", "handleOpenTips(I)V", i, (byte) 13);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new yd60(ol60Var, clzVarW2, vf20Var2, (yje) null), 3);
    }

    public final i2r G0() {
        Object objN = this.O1.n(Q1[0], this);
        objN.getClass();
        return (i2r) objN;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        super.Z();
        G0().c.setAdapter(null);
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.K1;
    }
}
