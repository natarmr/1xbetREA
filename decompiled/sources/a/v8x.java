package a;

import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/v8x;", "La/yx5;", "<init>", "()V", "a/gst", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class v8x extends yx5 {
    public final hnm0 K1;
    public wdk0 L1;
    public final boolean M1;
    public String N1;
    public final s0r O1;
    public final a8z P1;
    public final kiu0 Q1;
    public final a8z R1;
    public ndk0 S1;
    public static final /* synthetic */ iiy[] V1 = {new j0d0(v8x.class, "binding", "getBinding()Lorg/xplatform/info/impl/databinding/FragmentInfoNewBinding;", 0)};
    public static final gst U1 = new gst();

    public v8x() {
        super(R.layout.fragment_info_new);
        this.K1 = hnm0.f13359a;
        this.M1 = true;
        this.N1 = "";
        this.O1 = ltt0.o(this, t8x.f33534a);
        s8x s8xVar = new s8x(this, (byte) 0);
        wez wezVar = wez.b;
        this.P1 = maz.a(wezVar, s8xVar);
        aaw aawVar = new aaw(new s8x(this, (byte) 1), (byte) 1);
        a8z a8zVarA = maz.a(wezVar, new aaw(new aaw(this, (byte) 2), (byte) 3));
        this.Q1 = agc.G(this, sre0.f32672a.b(tax.class), new qwv(a8zVarA, (byte) 14), new qwv(a8zVarA, (byte) 15), aawVar);
        this.R1 = maz.a(wezVar, new s8x(this, (byte) 2));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        mc50.a(G0().b, new s8x(this, (byte) 3));
        G0().c.setAdapter((h9x) this.R1.getValue());
        vvw.o(G0().c, true, 1);
    }

    @Override // a.yx5
    public final void C0() {
        this.L1 = ((bji) this.P1.getValue()).f2709a;
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        tax taxVarH0 = H0();
        yje yjeVar = null;
        dnq dnqVar = new dnq(new s6n0(taxVarH0.v, new cin(taxVarH0, yjeVar, (byte) 20)), new gbv(taxVarH0, yjeVar, (byte) 3), (byte) 0);
        u8x u8xVar = new u8x(this, yjeVar, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new r1w(dnqVar, clzVarW, u8xVar, (yje) null), 3);
        qoj0 qoj0Var = H0().w;
        u8x u8xVar2 = new u8x(this, yjeVar, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new r1w(qoj0Var, clzVarW2, u8xVar2, (yje) null), 3);
        ol60 ol60Var = H0().x;
        u8x u8xVar3 = new u8x(this, yjeVar, (byte) 2);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new r1w(ol60Var, clzVarW3, u8xVar3, (yje) null, (byte) 0), 3);
    }

    public final t0r G0() {
        Object objN = this.O1.n(V1[0], this);
        objN.getClass();
        return (t0r) objN;
    }

    public final tax H0() {
        return (tax) this.Q1.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void Y() {
        ndk0 ndk0Var = this.S1;
        if (ndk0Var != null) {
            ndk0Var.dismiss();
        }
        this.j1 = true;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        H0().C = false;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getM1() {
        return this.M1;
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.K1;
    }
}
