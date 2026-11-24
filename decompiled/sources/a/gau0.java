package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/gau0;", "La/yx5;", "<init>", "()V", "a/kys0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class gau0 extends yx5 {
    public final s0r K1;
    public zyi L1;
    public ii M1;
    public final cgx0 N1;
    public final a8z O1;
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(gau0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(gau0.class, "fromBlockScreen", "getFromBlockScreen()Z", 0)};
    public static final kys0 P1 = new kys0(7);

    public gau0() {
        super(R.layout.compose_fragment);
        this.K1 = ltt0.o(this, eau0.f7487a);
        this.N1 = new cgx0("FROM_BLOCK_SCREEN_KEY", false);
        this.O1 = xbc.a0(this, sre0.f32672a.b(lbu0.class), null, new dau0(this, (byte) 2), 14);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        qcc.W(this, this, new dau0(this, (byte) 1));
        Object objN = this.K1.n(Q1[0], this);
        objN.getClass();
        pkd.i(((aid) objN).f919a, new b4u0((byte) 9), new ugd(-850783171, true, new ggt0(this, (byte) 7)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(iau0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            iau0 iau0Var = (iau0) (ze3Var instanceof iau0 ? ze3Var : null);
            if (iau0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                Boolean boolN = this.N1.n(this, Q1[1]);
                i1w0VarF.getClass();
                ctf0 ctf0Var = iau0Var.f14456a;
                r9u r9uVar = iau0Var.b;
                rou rouVar = iau0Var.c;
                bzt bztVar = iau0Var.d;
                v88 v88Var = iau0Var.e;
                mne mneVar = iau0Var.f;
                m1e m1eVar = iau0Var.g;
                iw20 iw20Var = iau0Var.h;
                zas0 zas0Var = iau0Var.i;
                wdk0 wdk0Var = iau0Var.j;
                ii iiVar = iau0Var.k;
                zx10 zx10Var = iau0Var.l;
                v6k v6kVar = iau0Var.m;
                pv00 pv00Var = iau0Var.n;
                jau0 jau0Var = iau0Var.o;
                atz atzVar = iau0Var.p;
                g2v g2vVar = iau0Var.q;
                i7u0 i7u0Var = iau0Var.r;
                q7u0 q7u0Var = iau0Var.s;
                cmt cmtVar = iau0Var.t;
                ctf0Var.getClass();
                r9uVar.getClass();
                m1eVar.getClass();
                wdk0Var.getClass();
                iiVar.getClass();
                jau0Var.getClass();
                this.L1 = (zyi) ((n5d0) new f6i(iw20Var, zas0Var, zx10Var, v6kVar, pv00Var, atzVar, ctf0Var, r9uVar, rouVar, bztVar, v88Var, mneVar, m1eVar, iiVar, jau0Var, i1w0VarF, boolN, g2vVar, i7u0Var, q7u0Var, cmtVar).d).get();
                this.M1 = iiVar;
                return;
            }
        }
        jf4.n(b1j.i(iau0.class, "Cannot create dependency "));
    }

    public final k3t0 G0() {
        return (k3t0) this.O1.getValue();
    }
}
