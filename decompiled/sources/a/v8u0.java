package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/v8u0;", "La/yx5;", "<init>", "()V", "a/sxs0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class v8u0 extends yx5 {
    public final s0r K1;
    public final zz2 L1;
    public wdk0 M1;
    public wyi N1;
    public final a8z O1;
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(v8u0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(v8u0.class, "verificationType", "getVerificationType()I", 0)};
    public static final sxs0 P1 = new sxs0((byte) 7);

    public v8u0() {
        super(R.layout.compose_fragment);
        this.K1 = ltt0.o(this, u8u0.f35250a);
        this.L1 = new zz2("VERIFICATION_TYPE_BUNDLE");
        this.O1 = xbc.a0(this, sre0.f32672a.b(q9u0.class), null, new t8u0(this, (byte) 0), 14);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        qcc.W(this, this, new t8u0(this, (byte) 1));
        Object objN = this.K1.n(Q1[0], this);
        objN.getClass();
        b1j.t(((aid) objN).f919a, new ugd(1161194065, true, new ggt0(this, (byte) 5)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(w8u0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            w8u0 w8u0Var = (w8u0) (ze3Var instanceof w8u0 ? ze3Var : null);
            if (w8u0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                x860 x860Var = new x860(this.L1.n(this, Q1[1]).intValue(), false);
                i1w0VarF.getClass();
                gii0 gii0Var = w8u0Var.f38743a;
                btt0 btt0Var = w8u0Var.b;
                vwb0 vwb0Var = w8u0Var.c;
                vby vbyVar = w8u0Var.d;
                pmi pmiVar = w8u0Var.e;
                bbw0 bbw0Var = w8u0Var.f;
                ilp0 ilp0Var = w8u0Var.g;
                mne mneVar = w8u0Var.h;
                wdk0 wdk0Var = w8u0Var.i;
                g2v g2vVar = w8u0Var.j;
                ctf0 ctf0Var = w8u0Var.k;
                i7u0 i7u0Var = w8u0Var.l;
                q7u0 q7u0Var = w8u0Var.m;
                gii0Var.getClass();
                btt0Var.getClass();
                vwb0Var.getClass();
                vbyVar.getClass();
                wdk0Var.getClass();
                ctf0Var.getClass();
                v7i v7iVar = new v7i(x860Var, gii0Var, btt0Var, vwb0Var, vbyVar, pmiVar, bbw0Var, ilp0Var, mneVar, wdk0Var, g2vVar, ctf0Var, i1w0VarF, i7u0Var, q7u0Var);
                this.M1 = wdk0Var;
                this.N1 = (wyi) ((n5d0) v7iVar.o).get();
                return;
            }
        }
        jf4.n(b1j.i(w8u0.class, "Cannot create dependency "));
    }
}
