package a;

import android.content.ComponentCallbacks2;
import android.content.res.ColorStateList;
import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/b190;", "La/yx5;", "<init>", "()V", "a/fl70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class b190 extends yx5 {
    public final f9o0 K1;
    public final hnm0 L1;
    public jni M1;
    public ii N1;
    public wdk0 O1;
    public final kiu0 P1;
    public final kiu0 Q1;
    public final s0r R1;
    public final yzn0 S1;
    public int U1;
    public static final /* synthetic */ iiy[] W1 = {new j0d0(b190.class, "binding", "getBinding()Lorg/xplatform/security/impl/databinding/FragmentRestorePasswordScreenBinding;", 0), new ez40(b190.class, "navigation", "getNavigation()Lorg/xplatform/onexuser/presentation/NavigationEnum;", 0)};
    public static final fl70 V1 = new fl70();

    public b190() {
        super(R.layout.fragment_restore_password_screen);
        this.K1 = new f9o0(R.attr.uikitBackgroundContent);
        this.L1 = hnm0.f13359a;
        u090 u090Var = new u090(this, (byte) 0);
        z090 z090Var = new z090(this, (byte) 0);
        wez wezVar = wez.b;
        a8z a8zVarA = maz.a(wezVar, new wz80(z090Var, (byte) 2));
        tre0 tre0Var = sre0.f32672a;
        this.P1 = agc.G(this, tre0Var.b(t190.class), new a190(a8zVarA, (byte) 0), new a190(a8zVarA, (byte) 1), u090Var);
        a8z a8zVarA2 = maz.a(wezVar, new wz80(new z090(this, (byte) 1), (byte) 3));
        this.Q1 = agc.G(this, tre0Var.b(f190.class), new a190(a8zVarA2, (byte) 2), new a190(a8zVarA2, (byte) 3), new ha30(this, a8zVarA2, (byte) 19));
        this.R1 = ltt0.o(this, v090.f36571a);
        this.S1 = new yzn0("bundle_navigation");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) throws Exception {
        jmu0.j(G0().c, ColorStateList.valueOf(m5d.b(R.attr.uikitBackgroundContent, o0())));
        G0().d.b(new u090(this, (byte) 1));
        uvw.R(G0().b, this, null);
        qcc.X(this, new u090(this, (byte) 2));
        pkd.i(G0().f, null, new ugd(1682699035, true, new xd80(this, G0().g, (byte) 7)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(c190.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            c190 c190Var = (c190) (ze3Var instanceof c190 ? ze3Var : null);
            if (c190Var != null) {
                we50 we50Var = (we50) this.S1.n(this, W1[1]);
                duj dujVar = c190Var.f3565a;
                cad cadVar = c190Var.b;
                lef0 lef0Var = c190Var.c;
                m1e m1eVar = c190Var.d;
                pru pruVar = c190Var.f;
                ii iiVar = c190Var.i;
                iqt iqtVar = c190Var.g;
                rou rouVar = c190Var.h;
                d190 d190Var = c190Var.j;
                wdk0 wdk0Var = c190Var.k;
                gii0 gii0Var = c190Var.l;
                ctf0 ctf0Var = c190Var.e;
                iiVar.getClass();
                m1eVar.getClass();
                d190Var.getClass();
                gii0Var.getClass();
                wdk0Var.getClass();
                ctf0Var.getClass();
                ru ruVar = new ru();
                ruVar.f31100a = lef0Var;
                ruVar.e = ctf0Var;
                ruVar.c = iqtVar;
                ruVar.g = rouVar;
                ruVar.h = m1eVar;
                ruVar.d = pruVar;
                ruVar.b = dujVar;
                ruVar.f = cadVar;
                ruVar.i = we50Var;
                ruVar.j = n0k0.a(new eni(ruVar, (byte) 5));
                this.M1 = (jni) ((n5d0) ruVar.j).get();
                this.N1 = iiVar;
                this.O1 = wdk0Var;
                return;
            }
        }
        jf4.n(b1j.i(c190.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        p7m0 p7m0Var = ((f190) this.Q1.getValue()).d;
        yje yjeVar = null;
        byte b = 0;
        x090 x090Var = new x090(this, yjeVar, b);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new zm70(p7m0Var, clzVarW, x090Var, (yje) null), 3);
        t190 t190VarH0 = H0();
        byte b2 = 1;
        dnq dnqVar = new dnq(new fnq(t190VarH0.q, new o190(t190VarH0, yjeVar, b2)), new p190(t190VarH0, yjeVar, b2), (byte) 0);
        x090 x090Var2 = new x090(this, yjeVar, b2);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new zm70(dnqVar, clzVarW2, x090Var2, (yje) null), 3);
        xae0 xae0VarN = vtb.N(H0().s);
        y090 y090Var = new y090(this, yjeVar, b);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new zm70(xae0VarN, clzVarW3, y090Var, (yje) null), 3);
        xae0 xae0VarN2 = vtb.N((qz40) H0().r.getValue());
        y090 y090Var2 = new y090(this, yjeVar, b2);
        clz clzVarW4 = aac.W(this);
        qjj.W(x0x.Q(clzVarW4.x()), null, null, new zm70(xae0VarN2, clzVarW4, y090Var2, (yje) null, (byte) 0), 3);
        ol60 ol60Var = H0().u;
        byte b3 = 2;
        y090 y090Var3 = new y090(this, yjeVar, b3);
        clz clzVarW5 = aac.W(this);
        qjj.W(x0x.Q(clzVarW5.x()), null, null, new w090(ol60Var, clzVarW5, y090Var3, (yje) null), 3);
        t190 t190VarH1 = H0();
        dnq dnqVar2 = new dnq(new fnq(vtb.N(t190VarH1.v), new o190(t190VarH1, yjeVar, b)), new p190(t190VarH1, yjeVar, b), (byte) 0);
        x090 x090Var3 = new x090(this, yjeVar, b3);
        clz clzVarW6 = aac.W(this);
        qjj.W(x0x.Q(clzVarW6.x()), null, null, new w090(dnqVar2, clzVarW6, x090Var3, (yje) null), 3);
    }

    public final j4r G0() {
        Object objN = this.R1.n(W1[0], this);
        objN.getClass();
        return (j4r) objN;
    }

    public final t190 H0() {
        return (t190) this.P1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        if (bundle != null) {
            this.U1 = bundle.getInt("CURRENT_TAB_POSITION");
        }
        vcc.g0(this, "REQUEST_CODE", new ds60(this, (byte) 21));
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

    @Override // androidx.fragment.app.Fragment
    public final void f0(Bundle bundle) {
        bundle.putInt("CURRENT_TAB_POSITION", this.U1);
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.L1;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
