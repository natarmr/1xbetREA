package a;

import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.support.api.navigation.SupportMenuScreenParams;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/jjn0;", "La/yx5;", "<init>", "()V", "a/g9m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class jjn0 extends yx5 {
    public wdk0 K1;
    public final khf0 L1;
    public final hnm0 M1;
    public final String N1;
    public final s0r O1;
    public final a8z P1;
    public final kiu0 Q1;
    public final a8z R1;
    public static final /* synthetic */ iiy[] U1 = {new ez40(jjn0.class, "supportMenuScreenParams", "getSupportMenuScreenParams()Lorg/xplatform/support/api/navigation/SupportMenuScreenParams;", 0), new j0d0(jjn0.class, "binding", "getBinding()Lorg/xplatform/support/impl/databinding/FragmentSupportMenuBinding;", 0)};
    public static final g9m0 S1 = new g9m0();

    public jjn0() {
        super(R.layout.fragment_support_menu);
        this.L1 = new khf0("SUPPORT_MENU_SCREEN_PARAMS_KEY");
        this.M1 = hnm0.f13359a;
        this.N1 = jjn0.class.getSimpleName();
        this.O1 = ltt0.o(this, hjn0.f13169a);
        fjn0 fjn0Var = new fjn0(this, (byte) 1);
        wez wezVar = wez.b;
        this.P1 = maz.a(wezVar, fjn0Var);
        fyk0 fyk0Var = new fyk0(new fjn0(this, (byte) 2), (byte) 20);
        a8z a8zVarA = maz.a(wezVar, new fyk0(new fyk0(this, (byte) 21), (byte) 22));
        this.Q1 = agc.G(this, sre0.f32672a.b(mkn0.class), new cdl0(a8zVarA, (byte) 16), new cdl0(a8zVarA, (byte) 17), fyk0Var);
        this.R1 = maz.a(wezVar, new fjn0(this, (byte) 3));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        mc50.a(G0().c, new fjn0(this, (byte) 0));
        G0().d.setAdapter((ejn0) this.R1.getValue());
    }

    @Override // a.yx5
    public final void C0() {
        this.K1 = ((mvi) this.P1.getValue()).f22457a;
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        mkn0 mkn0VarH0 = H0();
        yje yjeVar = null;
        dnq dnqVar = new dnq(new fnq(new qaf0(mkn0VarH0.w, (byte) 15), new tmg0(mkn0VarH0, yjeVar, (byte) 25)), new sye0(mkn0VarH0, yjeVar, (byte) 11), (byte) 0);
        ijn0 ijn0Var = new ijn0(this, yjeVar, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new agn0(dnqVar, clzVarW, ijn0Var, (yje) null), 3);
        qoj0 qoj0Var = H0().x;
        ijn0 ijn0Var2 = new ijn0(this, yjeVar, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new agn0(qoj0Var, clzVarW2, ijn0Var2, (yje) null), 3);
        ol60 ol60Var = H0().z;
        ijn0 ijn0Var3 = new ijn0(this, yjeVar, (byte) 2);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new agn0(ol60Var, clzVarW3, ijn0Var3, (yje) null, (byte) 0), 3);
    }

    public final m5r G0() {
        Object objN = this.O1.n(U1[1], this);
        objN.getClass();
        return (m5r) objN;
    }

    public final mkn0 H0() {
        return (mkn0) this.Q1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        sj3.s0(this, "REQUEST_CODE_OPEN_SUPPORT_APP", new gjn0(this, (byte) 0));
        sj3.s0(this, "REQUEST_CODE_DOWNLOAD_SUPPORT_APP", new gjn0(this, (byte) 1));
    }

    @Override // androidx.fragment.app.Fragment
    public final void Y() {
        this.j1 = true;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0 */
    public final boolean getL1() {
        return ((SupportMenuScreenParams) this.L1.n(this, U1[0])).f47110a;
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.M1;
    }
}
