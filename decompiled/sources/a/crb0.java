package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.widget.TextView;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/crb0;", "La/yx5;", "<init>", "()V", "a/jh70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class crb0 extends yx5 {
    public final s0r K1;
    public final hnm0 L1;
    public final phf0 M1;
    public final r34 N1;
    public fiu0 O1;
    public ii P1;
    public wdk0 Q1;
    public final kiu0 R1;
    public static final /* synthetic */ iiy[] U1 = {new j0d0(crb0.class, "viewBinding", "getViewBinding()Lorg/xplatform/bethistory/impl/databinding/FragmentPowerbetBinding;", 0), new ez40(crb0.class, "betId", "getBetId()Ljava/lang/String;", 0), new ez40(crb0.class, "balanceId", "getBalanceId()J", 0)};
    public static final jh70 S1 = new jh70();

    public crb0() {
        super(R.layout.fragment_powerbet);
        this.K1 = ltt0.o(this, brb0.f3072a);
        this.L1 = hnm0.f13359a;
        this.M1 = new phf0("BET_ID_BUNDLE_KEY");
        this.N1 = new r34("BALANCE_ID_BUNDLE_KEY");
        yqb0 yqb0Var = new yqb0(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new g8b0(new g8b0(this, (byte) 3), (byte) 4));
        this.R1 = agc.G(this, sre0.f32672a.b(orb0.class), new x6b0(a8zVarA, (byte) 4), new x6b0(a8zVarA, (byte) 5), yqb0Var);
    }

    public static void J0(a3r a3rVar, hrb0 hrb0Var) {
        TextView textView = a3rVar.t;
        frb0 frb0Var = hrb0Var.j;
        textView.setText(frb0Var.f10011a);
        a3rVar.k.setText(frb0Var.b);
        TextView textView2 = a3rVar.v;
        pn40 pn40Var = pn40.f27267a;
        double d = frb0Var.c;
        String str = hrb0Var.i;
        p3u0 p3u0Var = p3u0.c;
        textView2.setText(pn40.d(d, str, p3u0Var));
        a3rVar.q.setText(pn40.d(frb0Var.d, str, p3u0Var));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        ccq0.V(this, "ERROR_DIALOG_REQUEST_KEY", new yqb0(this, (byte) 1));
        G0().b.setOnClickListener(new l910(this, (byte) 21));
        mc50.a(G0().i, new yqb0(this, (byte) 2));
        DsNavigationBar dsNavigationBar = G0().i;
        String strH = H(R.string.powerbet);
        strH.getClass();
        dsNavigationBar.setTitle(strH);
        knm0.h(G0().d, false);
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(xqb0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            xqb0 xqb0Var = (xqb0) (ze3Var instanceof xqb0 ? ze3Var : null);
            if (xqb0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                iiy[] iiyVarArr = U1;
                String strN = this.M1.n(this, iiyVarArr[1]);
                Long lN = this.N1.n(this, iiyVarArr[2]);
                i1w0VarF.getClass();
                strN.getClass();
                cad cadVar = xqb0Var.f;
                btt0 btt0Var = xqb0Var.f41309a;
                ii iiVar = xqb0Var.e;
                gst0 gst0Var = xqb0Var.b;
                zfo zfoVar = xqb0Var.c;
                edo edoVar = xqb0Var.d;
                duj dujVar = xqb0Var.g;
                m1e m1eVar = xqb0Var.h;
                drb0 drb0Var = xqb0Var.i;
                vqc vqcVar = xqb0Var.j;
                sa10 sa10Var = xqb0Var.l;
                wdk0 wdk0Var = xqb0Var.k;
                sue sueVar = xqb0Var.m;
                bzu bzuVar = xqb0Var.n;
                j1q0 j1q0Var = xqb0Var.o;
                iw20 iw20Var = xqb0Var.p;
                fvt0 fvt0Var = xqb0Var.q;
                gii0 gii0Var = xqb0Var.r;
                m0w m0wVar = xqb0Var.s;
                knf0 knf0Var = xqb0Var.t;
                ctf0 ctf0Var = xqb0Var.u;
                tnm0 tnm0Var = xqb0Var.v;
                sueVar.getClass();
                iiVar.getClass();
                btt0Var.getClass();
                gst0Var.getClass();
                zfoVar.getClass();
                edoVar.getClass();
                m1eVar.getClass();
                drb0Var.getClass();
                wdk0Var.getClass();
                j1q0Var.getClass();
                gii0Var.getClass();
                tnm0Var.getClass();
                m0wVar.getClass();
                ctf0Var.getClass();
                knf0Var.getClass();
                this.O1 = new fiu0(Collections.singletonMap(orb0.class, (eni) new v9i(cadVar, vqcVar, sueVar, bzuVar, iw20Var, fvt0Var, iiVar, btt0Var, gst0Var, zfoVar, edoVar, dujVar, i1w0VarF, m1eVar, drb0Var, strN, sa10Var, lN, wdk0Var, j1q0Var, gii0Var, tnm0Var, m0wVar, ctf0Var, knf0Var).y));
                this.P1 = iiVar;
                this.Q1 = wdk0Var;
                return;
            }
        }
        jf4.n(b1j.i(xqb0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        xae0 xae0VarN = vtb.N(H0().o);
        yje yjeVar = null;
        arb0 arb0Var = new arb0(this, yjeVar, (byte) 1);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new f8b0(xae0VarN, clzVarW, arb0Var, (yje) null), 3);
        vae0 vae0VarM = vtb.M(H0().p);
        arb0 arb0Var2 = new arb0(this, yjeVar, (byte) 0);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new f8b0(vae0VarM, clzVarW2, arb0Var2, (yje) null), 3);
        vae0 vae0VarM2 = vtb.M(H0().q);
        zqb0 zqb0Var = new zqb0(this, null, (byte) 1);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new f8b0(vae0VarM2, clzVarW3, zqb0Var, (yje) null, (byte) 0), 3);
        vae0 vae0VarM3 = vtb.M(H0().r);
        zqb0 zqb0Var2 = new zqb0(this, null, (byte) 0);
        clz clzVarW4 = aac.W(this);
        qjj.W(x0x.Q(clzVarW4.x()), null, null, new f8b0(vae0VarM3, clzVarW4, zqb0Var2, (yje) null), 3);
    }

    public final a3r G0() {
        Object objN = this.K1.n(U1[0], this);
        objN.getClass();
        return (a3r) objN;
    }

    public final orb0 H0() {
        return (orb0) this.R1.getValue();
    }

    public final void I0(a3r a3rVar, hrb0 hrb0Var) {
        TextView textView = a3rVar.m;
        rdj rdjVar = rdj.f30294a;
        boolean z = hrb0Var.l;
        e4f e4fVar = hrb0Var.g;
        String str = hrb0Var.i;
        textView.setText(rdj.g(hrb0Var.f13522a, efj.UNIVERSAL, Boolean.valueOf(z), false, 56));
        a3rVar.o.setText(hrb0Var.c);
        a3rVar.n.setText(I(R.string.history_coupon_number, hrb0Var.b));
        a3rVar.f.setVisibility(hrb0Var.h ? 0 : 8);
        a3rVar.l.setText(hrb0Var.d);
        TextView textView2 = a3rVar.w;
        pn40 pn40Var = pn40.f27267a;
        double d = hrb0Var.e;
        p3u0 p3u0Var = p3u0.c;
        textView2.setText(pn40.d(d, str, p3u0Var));
        a3rVar.r.setText(pn40.d(hrb0Var.f, str, p3u0Var));
        a3rVar.x.setText(H(feb.X(e4fVar)));
        a3rVar.e.setImageDrawable(o0().getDrawable(feb.V(e4fVar)));
    }

    public final void K0(boolean z, boolean z2, boolean z3) {
        a3r a3rVarG0 = G0();
        a3rVarG0.g.setVisibility(z ? 0 : 8);
        a3rVarG0.d.setVisibility((z || !z2) ? 8 : 0);
        a3rVarG0.h.setVisibility(z2 ? 0 : 8);
        a3rVarG0.c.setVisibility(z3 ? 0 : 8);
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.L1;
    }
}
