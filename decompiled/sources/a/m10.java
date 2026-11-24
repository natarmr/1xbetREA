package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/m10;", "La/yx5;", "<init>", "()V", "a/pek0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class m10 extends yx5 {
    public final s0r K1;
    public final zz2 L1;
    public e6i M1;
    public ii N1;
    public final a8z O1;
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(m10.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(m10.class, "verificationTypeValue", "getVerificationTypeValue()I", 0)};
    public static final pek0 P1 = new pek0();

    public m10() {
        super(R.layout.compose_fragment);
        this.K1 = ltt0.o(this, k10.f17494a);
        this.L1 = new zz2("VERIFICATION_TYPE_BUNDLE");
        this.O1 = xbc.a0(this, sre0.f32672a.b(s20.class), null, new j10(this, (byte) 0), 14);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        qcc.W(this, this, new j10(this, (byte) 1));
        Object objN = this.K1.n(Q1[0], this);
        objN.getClass();
        b1j.t(((aid) objN).f919a, new ugd(1287865199, true, new o00(this, (byte) 5)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(o10.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            o10 o10Var = (o10) (ze3Var instanceof o10 ? ze3Var : null);
            if (o10Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                x860 x860Var = new x860(this.L1.n(this, Q1[1]).intValue(), false);
                i1w0VarF.getClass();
                ctf0 ctf0Var = o10Var.f24454a;
                rou rouVar = o10Var.b;
                mne mneVar = o10Var.c;
                m1e m1eVar = o10Var.d;
                iw20 iw20Var = o10Var.e;
                zas0 zas0Var = o10Var.f;
                bbw0 bbw0Var = o10Var.g;
                ani0 ani0Var = o10Var.h;
                pv00 pv00Var = o10Var.i;
                s9m0 s9m0Var = o10Var.j;
                atz atzVar = o10Var.k;
                r7v r7vVar = o10Var.l;
                j1q0 j1q0Var = o10Var.m;
                wdk0 wdk0Var = o10Var.n;
                bzt bztVar = o10Var.o;
                epi0 epi0Var = o10Var.p;
                ii iiVar = o10Var.q;
                jau0 jau0Var = o10Var.r;
                g2v g2vVar = o10Var.s;
                i7u0 i7u0Var = o10Var.t;
                q7u0 q7u0Var = o10Var.u;
                cmt cmtVar = o10Var.v;
                ctf0Var.getClass();
                m1eVar.getClass();
                j1q0Var.getClass();
                wdk0Var.getClass();
                iiVar.getClass();
                jau0Var.getClass();
                this.M1 = (e6i) ((n5d0) new f6i(x860Var, iw20Var, zas0Var, bbw0Var, ani0Var, pv00Var, s9m0Var, atzVar, r7vVar, epi0Var, ctf0Var, rouVar, mneVar, m1eVar, wdk0Var, bztVar, iiVar, jau0Var, i1w0VarF, g2vVar, i7u0Var, q7u0Var, cmtVar).d).get();
                this.N1 = iiVar;
                return;
            }
        }
        jf4.n(b1j.i(o10.class, "Cannot create dependency "));
    }

    public final k3t0 G0() {
        return (k3t0) this.O1.getValue();
    }
}
