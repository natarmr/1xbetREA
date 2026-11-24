package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"La/lkv;", "La/yx5;", "<init>", "()V", "a/v62", "a/rqt", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class lkv extends yx5 {
    public final hnm0 K1;
    public mii L1;
    public final kiu0 M1;
    public final s0r N1;
    public final a8z O1;
    public final v62 P1;
    public static final /* synthetic */ iiy[] R1 = {new j0d0(lkv.class, "binding", "getBinding()Lorg/xplatform/shake/impl/databinding/FragmentHandshakeSettingsBinding;", 0)};
    public static final rqt Q1 = new rqt();

    public lkv() {
        super(R.layout.fragment_handshake_settings);
        this.K1 = hnm0.f13359a;
        jkv jkvVar = new jkv(this, (byte) 0);
        t7t t7tVar = new t7t(this, (byte) 14);
        wez wezVar = wez.b;
        a8z a8zVarA = maz.a(wezVar, new t7t(t7tVar, (byte) 15));
        this.M1 = agc.G(this, sre0.f32672a.b(xkv.class), new r6p(a8zVarA, (byte) 28), new r6p(a8zVarA, (byte) 29), jkvVar);
        this.N1 = ltt0.o(this, kkv.f18459a);
        this.O1 = maz.a(wezVar, new jkv(this, (byte) 1));
        this.P1 = new v62(this, (byte) 11);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) throws Exception {
        n0().k().a(K(), this.P1);
        mc50.a(G0().b, new jkv(this, (byte) 2));
        G0().c.setAdapter((hkv) this.O1.getValue());
        G0().c.m(new qkv((byte) 0));
        vvw.o(G0().c, false, 3);
        xae0 xae0VarN = vtb.N(((xkv) this.M1.getValue()).l);
        j0s j0sVar = new j0s(this, null, (byte) 23);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new hgv(xae0VarN, clzVarW, j0sVar, (yje) null), 3);
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(ikv.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            ikv ikvVar = (ikv) (ze3Var instanceof ikv ? ze3Var : null);
            if (ikvVar != null) {
                String simpleName = lkv.class.getSimpleName();
                d1p d1pVar = ikvVar.f14947a;
                zg zgVar = ikvVar.b;
                pru pruVar = ikvVar.c;
                q7d0 q7d0Var = ikvVar.d;
                ctf0 ctf0Var = ikvVar.e;
                d1pVar.getClass();
                q7d0Var.getClass();
                ctf0Var.getClass();
                this.L1 = (mii) ((n5d0) new xzp(d1pVar, simpleName, zgVar, pruVar, q7d0Var, ctf0Var).g).get();
                return;
            }
        }
        jf4.n(b1j.i(ikv.class, "Cannot create dependency "));
    }

    public final p0r G0() {
        Object objN = this.N1.n(R1[0], this);
        objN.getClass();
        return (p0r) objN;
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.K1;
    }
}
