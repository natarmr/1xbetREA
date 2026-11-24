package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/s10;", "La/yx5;", "<init>", "()V", "a/qek0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class s10 extends yx5 {
    public final s0r K1;
    public final zz2 L1;
    public g6i M1;
    public wdk0 N1;
    public ii O1;
    public final kiu0 P1;
    public static final /* synthetic */ iiy[] R1 = {new j0d0(s10.class, "binding", "getBinding()Lorg/xplatform/verification/status/impl/databinding/AdditionalVerificationStatusFragmentBinding;", 0), new ez40(s10.class, "verificationTypeValue", "getVerificationTypeValue()I", 0)};
    public static final qek0 Q1 = new qek0();

    public s10() {
        super(R.layout.additional_verification_status_fragment);
        this.K1 = ltt0.o(this, r10.f29654a);
        this.L1 = new zz2("VERIFICATION_TYPE_BUNDLE");
        p10 p10Var = new p10(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new o5(new o5(this, (byte) 27), (byte) 28));
        this.P1 = agc.G(this, sre0.f32672a.b(f20.class), new k8(a8zVarA, (byte) 18), new k8(a8zVarA, (byte) 19), p10Var);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        G0().e.setTitle(H(R.string.verification));
        G0().e.setNavigationOnClickListener(new q10(this, (byte) 0));
        qcc.W(this, this, new f8(0, H0(), f20.class, "onExit", "onExit()V", 0, (byte) 4));
        dyb.O(G0().b, new t1(this, (byte) 17));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(t10.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            t10 t10Var = (t10) (ze3Var instanceof t10 ? ze3Var : null);
            if (t10Var != null) {
                x860 x860Var = new x860(this.L1.n(this, R1[1]).intValue(), false);
                ctf0 ctf0Var = t10Var.f33145a;
                rou rouVar = t10Var.b;
                mne mneVar = t10Var.c;
                m1e m1eVar = t10Var.d;
                sa10 sa10Var = t10Var.e;
                iw20 iw20Var = t10Var.f;
                zas0 zas0Var = t10Var.g;
                bbw0 bbw0Var = t10Var.h;
                ani0 ani0Var = t10Var.i;
                pv00 pv00Var = t10Var.j;
                s9m0 s9m0Var = t10Var.k;
                atz atzVar = t10Var.l;
                r7v r7vVar = t10Var.m;
                j1q0 j1q0Var = t10Var.n;
                wdk0 wdk0Var = t10Var.o;
                bzt bztVar = t10Var.p;
                epi0 epi0Var = t10Var.q;
                ii iiVar = t10Var.r;
                jau0 jau0Var = t10Var.s;
                ctf0Var.getClass();
                m1eVar.getClass();
                j1q0Var.getClass();
                wdk0Var.getClass();
                iiVar.getClass();
                jau0Var.getClass();
                this.M1 = (g6i) ((n5d0) new h6i(x860Var, iw20Var, zas0Var, bbw0Var, ani0Var, pv00Var, s9m0Var, atzVar, r7vVar, epi0Var, ctf0Var, rouVar, mneVar, m1eVar, sa10Var, wdk0Var, bztVar, iiVar, jau0Var).c).get();
                this.N1 = wdk0Var;
                this.O1 = iiVar;
                return;
            }
        }
        jf4.n(b1j.i(t10.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        p7m0 p7m0Var = H0().A;
        Class<s10> cls = s10.class;
        i8 i8Var = new i8(2, this, cls, "handleViewState", "handleViewState(Lorg/xplatform/verification/status/impl/presentation/old/AdditionalVerificationStatusOldViewModel$ViewState;)V", 4, (byte) 5);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new kz(p7m0Var, clzVarW, i8Var, (yje) null), 3);
        ol60 ol60Var = H0().B;
        i8 i8Var2 = new i8(2, this, cls, "handleSingleEvent", "handleSingleEvent(Lorg/xplatform/verification/status/impl/presentation/old/AdditionalVerificationStatusOldViewModel$SingleEvent;)V", 4, (byte) 6);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new kz(ol60Var, clzVarW2, i8Var2, (yje) null, (byte) 0), 3);
    }

    public final n10 G0() {
        Object objN = this.K1.n(R1[0], this);
        objN.getClass();
        return (n10) objN;
    }

    public final f20 H0() {
        return (f20) this.P1.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        H0().C = false;
        this.j1 = true;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        c4m0 c4m0Var;
        super.e0();
        f20 f20VarH0 = H0();
        c4m0 c4m0Var2 = f20VarH0.z;
        yje yjeVar = null;
        if (c4m0Var2 != null && c4m0Var2.isActive() && (c4m0Var = f20VarH0.z) != null) {
            c4m0Var.cancel(null);
        }
        f20VarH0.z = sac.T(new fnq(f20VarH0.g.b(), new pa((Object) f20VarH0, yjeVar, (byte) 8), (byte) 4), d5c.S(jiu0.a(f20VarH0), f20VarH0.f.b), new e20(f20VarH0, null, (byte) 1));
    }
}
