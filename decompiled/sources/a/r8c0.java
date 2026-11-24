package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.net.UnknownHostException;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/r8c0;", "La/yx5;", "<init>", "()V", "a/xi70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class r8c0 extends yx5 {
    public final hnm0 K1;
    public final boolean L1;
    public final r34 M1;
    public final s0r N1;
    public zpi O1;
    public wdk0 P1;
    public ii Q1;
    public final kiu0 R1;
    public final n0o0 S1;
    public static final /* synthetic */ iiy[] V1 = {new ez40(r8c0.class, "bundleGameId", "getBundleGameId()J", 0), new j0d0(r8c0.class, "binding", "getBinding()Lorg/xplatform/promo/impl/databinding/FragmentPromoSettingsBinding;", 0)};
    public static final xi70 U1 = new xi70();

    public r8c0() {
        super(R.layout.fragment_promo_settings);
        this.K1 = hnm0.f13359a;
        this.L1 = true;
        this.M1 = new r34("OPEN_BONUS_GAME_KEY");
        this.N1 = ltt0.o(this, o8c0.f24823a);
        n8c0 n8c0Var = new n8c0(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new g8b0(new g8b0(this, (byte) 11), (byte) 12));
        this.R1 = agc.G(this, sre0.f32672a.b(qyc0.class), new x6b0(a8zVarA, (byte) 14), new x6b0(a8zVarA, (byte) 15), n8c0Var);
        this.S1 = maz.b(new n8c0(this, (byte) 1));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        o2t.d(F(), this, "", new ppb0(this, (byte) 9));
        G0().c.setAdapter((g8c0) this.S1.getValue());
        G0().c.m(new yrh(G().getDimensionPixelSize(R.dimen.space_16), G().getDimensionPixelSize(R.dimen.space_12), (byte) 7));
        vvw.o(G0().c, true, 1);
        G0().b.b(new n8c0(this, (byte) 2));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(hic0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            hic0 hic0Var = (hic0) (ze3Var instanceof hic0 ? ze3Var : null);
            if (hic0Var != null) {
                aqi aqiVarA = hic0Var.a(a4n0.f(this), this.M1.n(this, V1[0]).longValue());
                this.O1 = (zpi) aqiVarA.X.get();
                this.P1 = aqiVarA.z;
                this.Q1 = aqiVarA.A;
                return;
            }
        }
        jf4.n(b1j.i(hic0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        xae0 xae0Var = H0().B;
        yje yjeVar = null;
        q8c0 q8c0Var = new q8c0(this, yjeVar, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new p8c0(xae0Var, clzVarW, q8c0Var, (yje) null), 3);
        ol60 ol60Var = H0().c.m;
        q8c0 q8c0Var2 = new q8c0(this, yjeVar, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new p8c0(ol60Var, clzVarW2, q8c0Var2, (yje) null, (byte) 0), 3);
    }

    public final e3r G0() {
        Object objN = this.N1.n(V1[1], this);
        objN.getClass();
        return (e3r) objN;
    }

    public final qyc0 H0() {
        return (qyc0) this.R1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        super.Z();
        o2t.a(F());
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        this.j1 = true;
        c4m0 c4m0Var = H0().w;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        qyc0 qyc0VarH0 = H0();
        yje yjeVar = null;
        qyc0VarH0.w = slb.U(new fnq(qyc0VarH0.j.b(), new pyc0(qyc0VarH0, yjeVar, (byte) 1), (byte) 4), jiu0.a(qyc0VarH0));
        bby bbyVar = qyc0VarH0.v;
        if (bbyVar == null || !bbyVar.isActive()) {
            qyc0VarH0.v = sac.i0(jiu0.a(qyc0VarH0), "PromoCardsWithGamesViewModel.getPromoBannerData", 3, 3L, q3d.j(UnknownHostException.class, oqt0.class), null, new pyc0(qyc0VarH0, yjeVar, (byte) 2), null, qyc0VarH0.i.b, null, null, 848);
        }
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getN1() {
        return this.L1;
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.K1;
    }
}
