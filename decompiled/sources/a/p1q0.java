package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/p1q0;", "La/yx5;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class p1q0 extends yx5 {
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(p1q0.class, "viewBinding", "getViewBinding()Lorg/xplatform/feature/office/test_section/impl/databinding/FragmentTestSectionNewBinding;", 0)};
    public final hnm0 K1;
    public axi L1;
    public rl70 M1;
    public final s0r N1;
    public final kiu0 O1;
    public final a8z P1;

    public p1q0() {
        super(R.layout.fragment_test_section_new);
        this.K1 = hnm0.f13359a;
        this.N1 = ltt0.o(this, o1q0.f24494a);
        n1q0 n1q0Var = new n1q0(this, (byte) 0);
        mfo0 mfo0Var = new mfo0(this, (byte) 13);
        wez wezVar = wez.b;
        a8z a8zVarA = maz.a(wezVar, new mfo0(mfo0Var, (byte) 14));
        this.O1 = agc.G(this, sre0.f32672a.b(x1q0.class), new r5p0(a8zVarA, (byte) 6), new r5p0(a8zVarA, (byte) 7), n1q0Var);
        this.P1 = maz.a(wezVar, new n1q0(this, (byte) 1));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        G0().b.b(new n1q0(this, (byte) 2));
        int dimensionPixelOffset = o0().getResources().getBoolean(R.bool.isTablet) ? G().getDimensionPixelOffset(R.dimen.space_64) : G().getDimensionPixelOffset(R.dimen.space_12);
        sj3.L0(G0().c, dimensionPixelOffset, 0, dimensionPixelOffset, 0, 10);
        G0().c.setAdapter((k1q0) this.P1.getValue());
        vvw.o(G0().c, false, 3);
        sj3.A0(this, "KEY_PICKER_MODEL_REQUEST", new l7p0(this, (byte) 15));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(q1q0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            q1q0 q1q0Var = (q1q0) (ze3Var instanceof q1q0 ? ze3Var : null);
            if (q1q0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                peg0 peg0Var = q1q0Var.f27967a;
                rjo rjoVar = q1q0Var.b;
                bxi bxiVar = q1q0Var.i;
                yox yoxVar = q1q0Var.c;
                ilp0 ilp0Var = q1q0Var.d;
                epi0 epi0Var = q1q0Var.e;
                n660 n660Var = q1q0Var.f;
                ou9 ou9Var = q1q0Var.g;
                ntu ntuVar = q1q0Var.h;
                ctf0 ctf0Var = q1q0Var.j;
                tgk tgkVar = q1q0Var.w;
                h760 h760Var = q1q0Var.k;
                ntu ntuVar2 = q1q0Var.l;
                pp90 pp90Var = q1q0Var.n;
                rl70 rl70Var = q1q0Var.m;
                bzt bztVar = q1q0Var.o;
                j1q0 j1q0Var = q1q0Var.p;
                xaq0 xaq0Var = q1q0Var.q;
                rek0 rek0Var = q1q0Var.r;
                nhf0 nhf0Var = q1q0Var.s;
                bot botVar = q1q0Var.t;
                bbw0 bbw0Var = q1q0Var.u;
                sue sueVar = q1q0Var.v;
                iqt iqtVar = q1q0Var.x;
                pp90Var.getClass();
                sueVar.getClass();
                tgkVar.getClass();
                ctf0Var.getClass();
                h760Var.getClass();
                j1q0Var.getClass();
                xaq0Var.getClass();
                this.L1 = (axi) ((n5d0) new v5i(pp90Var, bxiVar, peg0Var, epi0Var, rjoVar, yoxVar, ilp0Var, n660Var, ou9Var, ntuVar, tgkVar, ctf0Var, i1w0VarF, h760Var, ntuVar2, rl70Var, bztVar, rek0Var, nhf0Var, botVar, bbw0Var, iqtVar).v).get();
                this.M1 = rl70Var;
                return;
            }
        }
        jf4.n(b1j.i(q1q0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        p7m0 p7m0Var = H0().t;
        Class<p1q0> cls = p1q0.class;
        bdl0 bdl0Var = new bdl0(2, this, cls, "updateData", "updateData(Ljava/util/List;)V", 4, (byte) 10);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new lto0((gmq) p7m0Var, clzVarW, bdl0Var, (yje) null, (char) 0), 3);
        p7m0 p7m0Var2 = H0().u;
        bdl0 bdl0Var2 = new bdl0(2, this, cls, "handleEvent", "handleEvent(Lorg/xplatform/feature/office/test_section/impl/presentation/models/ButtonClickEvents;)V", 4, (byte) 11);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new lto0(p7m0Var2, clzVarW2, bdl0Var2, (yje) null, 0), 3);
    }

    public final u5r G0() {
        Object objN = this.N1.n(Q1[0], this);
        objN.getClass();
        return (u5r) objN;
    }

    public final x1q0 H0() {
        return (x1q0) this.O1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        G0().c.setAdapter(null);
        super.Z();
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.K1;
    }
}
