package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/mau0;", "La/yx5;", "<init>", "()V", "a/bzs0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class mau0 extends yx5 {
    public final s0r K1;
    public azi L1;
    public wdk0 M1;
    public ii N1;
    public final cgx0 O1;
    public final kiu0 P1;
    public static final /* synthetic */ iiy[] R1 = {new j0d0(mau0.class, "binding", "getBinding()Lorg/xplatform/verification/status/impl/databinding/VerificationStatusFragmentBinding;", 0), new ez40(mau0.class, "fromBlockScreen", "getFromBlockScreen()Z", 0)};
    public static final bzs0 Q1 = new bzs0((byte) 7);

    public mau0() {
        super(R.layout.verification_status_fragment);
        this.K1 = ltt0.o(this, lau0.f19724a);
        this.O1 = new cgx0("FROM_BLOCK_SCREEN_KEY", false);
        kau0 kau0Var = new kau0(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new cvs0(new cvs0(this, (byte) 15), (byte) 16));
        this.P1 = agc.G(this, sre0.f32672a.b(abu0.class), new w6u0(a8zVarA, (byte) 6), new w6u0(a8zVarA, (byte) 7), kau0Var);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        G0().e.setTitle(H(R.string.verification));
        G0().e.setNavigationOnClickListener(new jpe0(this, (byte) 17));
        qcc.W(this, this, new avs0(0, H0(), abu0.class, "onExit", "onExit()V", 0, (byte) 4));
        dyb.O(G0().b, new npt0(this, (byte) 8));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(nau0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            nau0 nau0Var = (nau0) (ze3Var instanceof nau0 ? ze3Var : null);
            if (nau0Var != null) {
                ctf0 ctf0Var = nau0Var.f23209a;
                r9u r9uVar = nau0Var.b;
                rou rouVar = nau0Var.c;
                bzt bztVar = nau0Var.d;
                v88 v88Var = nau0Var.e;
                mne mneVar = nau0Var.f;
                m1e m1eVar = nau0Var.g;
                sa10 sa10Var = nau0Var.h;
                iw20 iw20Var = nau0Var.i;
                zas0 zas0Var = nau0Var.j;
                wdk0 wdk0Var = nau0Var.k;
                ii iiVar = nau0Var.l;
                zx10 zx10Var = nau0Var.m;
                v6k v6kVar = nau0Var.n;
                pv00 pv00Var = nau0Var.o;
                jau0 jau0Var = nau0Var.p;
                atz atzVar = nau0Var.q;
                ctf0Var.getClass();
                r9uVar.getClass();
                m1eVar.getClass();
                wdk0Var.getClass();
                iiVar.getClass();
                jau0Var.getClass();
                this.L1 = (azi) ((n5d0) new v7i(iiVar, v88Var, m1eVar, mneVar, v6kVar, bztVar, r9uVar, rouVar, atzVar, pv00Var, sa10Var, zx10Var, iw20Var, ctf0Var, wdk0Var, zas0Var, jau0Var).o).get();
                this.M1 = wdk0Var;
                this.N1 = iiVar;
                return;
            }
        }
        jf4.n(b1j.i(nau0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        p7m0 p7m0Var = H0().z;
        Class<mau0> cls = mau0.class;
        k5r0 k5r0Var = new k5r0(2, this, cls, "handleViewState", "handleViewState(Lorg/xplatform/verification/status/impl/presentation/old/VerificationStatusOldViewModel$ViewState;)V", 4, (byte) 14);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new tsr0(p7m0Var, clzVarW, k5r0Var, (yje) null), 3);
        ol60 ol60Var = H0().A;
        k5r0 k5r0Var2 = new k5r0(2, this, cls, "handleSingleEvent", "handleSingleEvent(Lorg/xplatform/verification/status/impl/presentation/old/VerificationStatusOldViewModel$SingleEvent;)V", 4, (byte) 15);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new tsr0(ol60Var, clzVarW2, k5r0Var2, (yje) null, (byte) 0), 3);
    }

    public final hau0 G0() {
        Object objN = this.K1.n(R1[0], this);
        objN.getClass();
        return (hau0) objN;
    }

    public final abu0 H0() {
        return (abu0) this.P1.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        H0().B = false;
        this.j1 = true;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        c4m0 c4m0Var;
        super.e0();
        abu0 abu0VarH0 = H0();
        c4m0 c4m0Var2 = abu0VarH0.x;
        byte b = 1;
        yje yjeVar = null;
        if (c4m0Var2 != null && c4m0Var2.isActive() && (c4m0Var = abu0VarH0.x) != null) {
            c4m0Var.cancel(null);
        }
        abu0VarH0.x = slb.U(new dnq(new fnq(abu0VarH0.g.b(), new yau0(abu0VarH0, yjeVar, b), (byte) 4), new zau0(abu0VarH0, yjeVar, b), b), jiu0.a(abu0VarH0));
    }
}
