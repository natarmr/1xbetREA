package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/amr0;", "La/iw5;", "<init>", "()V", "a/cvm0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class amr0 extends iw5 {
    public static final /* synthetic */ int m2 = 0;
    public fiu0 k2;
    public final kiu0 l2;

    public amr0() {
        qir0 qir0Var = new qir0(this, (byte) 2);
        a8z a8zVarA = maz.a(wez.b, new moq0(new moq0(this, (byte) 14), (byte) 15));
        this.l2 = agc.G(this, sre0.f32672a.b(gmr0.class), new p7r0(a8zVarA, (byte) 8), new p7r0(a8zVarA, (byte) 9), qir0Var);
    }

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        fetVar.e0(-2061057189);
        gmr0 gmr0Var = (gmr0) this.l2.getValue();
        pz40 pz40VarQ = gkb.Q(vtb.h0(new omi0(new i89(((gkr0) ((g090) gmr0Var.c.f13549a).f10448a).f11458a, (byte) 22), gmr0Var, (byte) 12), jiu0.a(gmr0Var), kpj0.b, new jq8("", iun.f15405a)), null, fetVar, 0, 7);
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), u1c.M(57608714, new qjr0(pz40VarQ, (byte) 2), fetVar), (ugd) null, u1c.M(-663310708, new nhl0(pz40VarQ, this, (byte) 27), fetVar), 10);
        fetVar.r(false);
        return bw5Var;
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(vlr0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            vlr0 vlr0Var = (vlr0) (ze3Var instanceof vlr0 ? ze3Var : null);
            if (vlr0Var != null) {
                this.k2 = vlr0Var.a().I();
                super.W(bundle);
                return;
            }
        }
        jf4.n(b1j.i(vlr0.class, "Cannot create dependency "));
    }
}
