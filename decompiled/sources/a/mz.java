package a;

import android.os.Bundle;
import android.util.TypedValue;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/mz;", "La/yx5;", "<init>", "()V", "a/jdk0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class mz extends yx5 {
    public jh70 K1;
    public rl70 L1;
    public ii M1;
    public wdk0 N1;
    public final a8z O1;
    public final kiu0 P1;
    public final s0r Q1;
    public final bg5 R1;
    public final khf0 S1;
    public final yzn0 U1;
    public static final /* synthetic */ iiy[] W1 = {new j0d0(mz.class, "binding", "getBinding()Lorg/xplatform/security/impl/databinding/FragmentAdditionalInfoBinding;", 0), new ez40(mz.class, "tokenRestoreData", "getTokenRestoreData()Lorg/xplatform/security/api/presentation/models/TokenRestoreData;", 0), new ez40(mz.class, "navigation", "getNavigation()Lorg/xplatform/onexuser/presentation/NavigationEnum;", 0)};
    public static final jdk0 V1 = new jdk0();

    public mz() {
        super(R.layout.fragment_additional_info);
        byte b = 0;
        gz gzVar = new gz(this, b);
        wez wezVar = wez.b;
        this.O1 = maz.a(wezVar, gzVar);
        byte b2 = 4;
        byte b3 = 24;
        o5 o5Var = new o5(new gz(this, b2), b3);
        a8z a8zVarA = maz.a(wezVar, new o5(new o5(this, (byte) 25), (byte) 26));
        this.P1 = agc.G(this, sre0.f32672a.b(g00.class), new k8(a8zVarA, (byte) 16), new k8(a8zVarA, (byte) 17), o5Var);
        this.Q1 = ltt0.o(this, jz.f17383a);
        hz hzVar = new hz(this, (byte) 2);
        byte b4 = 3;
        hz hzVar2 = new hz(this, b4);
        gz gzVar2 = new gz(this, (byte) 5);
        iz izVar = new iz(this, b4);
        bg5 bg5Var = new bg5();
        gbn gbnVar = new gbn(new zgp0((byte) 22), new d8q0(b4, b), new nop0((Object) hzVar, (byte) 15), pfo0.i);
        dp dpVar = bg5Var.d;
        dpVar.b(gbnVar);
        dpVar.b(new gbn(new ch90(b3), new iv60(b4, (byte) 9), new ka70(hzVar2, gzVar2, (byte) 14), xk60.l));
        dpVar.b(new gbn(new sfc((byte) 7), new lq4(b4, (byte) 28), new lya(izVar, (byte) 20), qja.h));
        dpVar.b(new gbn(new svj((byte) 11), new e9k(b4, b2), new vbk((byte) 3), zdh.q));
        this.R1 = bg5Var;
        this.S1 = new khf0("BUNDLE_TOKEN_RESTORE_DATA");
        this.U1 = new yzn0("bundle_navigation");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        RecyclerView recyclerView = G0().b;
        TypedValue typedValue = j5d.f15927a;
        recyclerView.m(new lrh0(G().getDimensionPixelSize(R.dimen.corner_radius_16), j5d.a(o0(), R.attr.uikitBackgroundContent, false), G().getDimensionPixelSize(R.dimen.space_16), G().getDimensionPixelSize(R.dimen.space_12)));
        G0().b.setAdapter(this.R1);
        DsBottomBar.u(G0().c, new gz(this, (byte) 6));
        G0().d.b(new gz(this, (byte) 7));
        qcc.X(this, new gz(this, (byte) 8));
    }

    @Override // a.yx5
    public final void C0() {
        d6i d6iVar = (d6i) this.O1.getValue();
        this.K1 = d6iVar.f;
        this.L1 = d6iVar.p;
        this.M1 = d6iVar.q;
        this.N1 = d6iVar.r;
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        ol60 ol60Var = H0().y;
        yje yjeVar = null;
        byte b = 0;
        lz lzVar = new lz(this, yjeVar, b);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new m1(ol60Var, clzVarW, lzVar, (yje) null), 3);
        ol60 ol60Var2 = H0().z;
        lz lzVar2 = new lz(this, yjeVar, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new m1((gmq) ol60Var2, clzVarW2, lzVar2, (yje) null, (byte) 0), 3);
        g00 g00VarH0 = H0();
        dnq dnqVar = new dnq(new s6n0(g00VarH0.A, new d00(g00VarH0, yjeVar, b)), new e00(g00VarH0, yjeVar, b), (byte) 0);
        lz lzVar3 = new lz(this, yjeVar, (byte) 2);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new m1(dnqVar, clzVarW3, lzVar3, (yje) null), 3);
        g00 g00VarH1 = H0();
        c00 c00Var = new c00(g00VarH1.A, g00VarH1, (byte) 0);
        pa paVar = new pa((Object) this, yjeVar, (byte) 6);
        clz clzVarW4 = aac.W(this);
        qjj.W(x0x.Q(clzVarW4.x()), null, null, new kz(c00Var, clzVarW4, paVar, (yje) null), 3);
    }

    public final mxq G0() {
        Object objN = this.Q1.n(W1[0], this);
        objN.getClass();
        return (mxq) objN;
    }

    public final g00 H0() {
        return (g00) this.P1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        ccq0.V(this, "REQUEST_ROTTEN_TOKEN_ERROR_DIALOG_KEY", new gz(this, (byte) 3));
        ccq0.V(this, "REQUEST_BACK_DIALOG_KEY", new gz(this, (byte) 2));
        sj3.s0(this, "COUNTRY_CHOOSE_ITEM_KEY", new iz(this, (byte) 2));
        sj3.s0(this, "CITY_CHOOSE_ITEM_KEY", new iz(this, (byte) 1));
        sj3.s0(this, "REGION_CHOOSE_ITEM_KEY", new iz(this, (byte) 0));
        ccq0.V(this, "REQUEST_REQUEST_ERROR_KEY", new gz(this, (byte) 1));
        sj3.A0(this, "KEY_PICKER_MODEL_REQUEST", new hz(this, (byte) 0));
        sj3.A0(this, "KEY_PICKER_COUNTRY_ID_REQUEST", new hz(this, (byte) 1));
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        this.j1 = true;
        j120.Y(this);
        n0().getWindow().setSoftInputMode(32);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        n0().getWindow().setSoftInputMode(16);
    }
}
