package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/zp10;", "La/yx5;", "<init>", "()V", "a/htz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class zp10 extends yx5 {
    public final f9o0 K1;
    public final hnm0 L1;
    public qki M1;
    public gl5 N1;
    public ii O1;
    public wdk0 P1;
    public final kiu0 Q1;
    public final s0r R1;
    public final a8z S1;
    public static final /* synthetic */ iiy[] V1 = {new j0d0(zp10.class, "binding", "getBinding()Lorg/xplatform/mailing/impl/databinding/FragmentMailingManagementBinding;", 0)};
    public static final htz U1 = new htz();

    public zp10() {
        super(R.layout.fragment_mailing_management);
        this.K1 = new f9o0(R.attr.uikitBackgroundContent);
        this.L1 = hnm0.f13359a;
        wp10 wp10Var = new wp10(this, (byte) 0);
        be00 be00Var = new be00(this, (byte) 22);
        wez wezVar = wez.b;
        a8z a8zVarA = maz.a(wezVar, new be00(be00Var, (byte) 23));
        this.Q1 = agc.G(this, sre0.f32672a.b(vq10.class), new j210(a8zVarA, (byte) 14), new j210(a8zVarA, (byte) 15), wp10Var);
        this.R1 = ltt0.o(this, xp10.f41247a);
        this.S1 = maz.a(wezVar, new wp10(this, (byte) 1));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        h1r h1rVarG0 = G0();
        mc50.a(h1rVarG0.f, new wp10(this, (byte) 2));
        qcc.X(this, new wp10(this, (byte) 3));
        ccq0.V(this, "INTERRUPT_DIALOG_REQUEST_KEY", new o0t(0, H0(), vq10.class, "onActionExit", "onActionExit()V", 0, (byte) 17));
        RecyclerView recyclerView = h1rVarG0.e;
        recyclerView.setAdapter((vp10) this.S1.getValue());
        recyclerView.m(new qmk0(G().getDimensionPixelSize(R.dimen.space_16), 0, 0, 0, 0, 1, new p610((byte) 17), rmk0.b, 286));
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (layoutParams == null) {
            hny.u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int dimensionPixelSize = G().getDimensionPixelSize(o0().getResources().getBoolean(R.bool.isTablet) ? R.dimen.space_36 : R.dimen.space_12);
        marginLayoutParams.setMarginStart(dimensionPixelSize);
        marginLayoutParams.setMarginEnd(dimensionPixelSize);
        recyclerView.setLayoutParams(marginLayoutParams);
        DsBottomBar.u(h1rVarG0.b, new wp10(this, (byte) 4));
        if (this.N1 != null) {
            gl5.k(this, "REQUEST_CAPTCHA_CODE_DIALOG_KEY", new wp10(this, (byte) 5), new km00(this, (byte) 7));
        } else {
            Intrinsics.h("captchaDialogDelegate");
            throw null;
        }
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(up10.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            up10 up10Var = (up10) (ze3Var instanceof up10 ? ze3Var : null);
            if (up10Var != null) {
                rou rouVar = up10Var.f36040a;
                qgd qgdVar = up10Var.c;
                duj dujVar = up10Var.d;
                kt2 kt2Var = up10Var.e;
                m1e m1eVar = up10Var.f;
                g2v g2vVar = up10Var.g;
                ii iiVar = up10Var.o;
                pru pruVar = up10Var.h;
                lbu lbuVar = up10Var.i;
                cyh cyhVar = up10Var.j;
                z4w0 z4w0Var = up10Var.k;
                ort ortVar = up10Var.l;
                mne mneVar = up10Var.m;
                ctf0 ctf0Var = up10Var.n;
                sek sekVar = up10Var.p;
                wdk0 wdk0Var = up10Var.q;
                mi70 mi70Var = up10Var.r;
                d1p d1pVar = up10Var.s;
                onv onvVar = up10Var.b;
                rpt rptVar = up10Var.t;
                d1pVar.getClass();
                iiVar.getClass();
                kt2Var.getClass();
                m1eVar.getClass();
                ctf0Var.getClass();
                wdk0Var.getClass();
                this.M1 = (qki) ((n5d0) new gbi(iiVar, kt2Var, qgdVar, m1eVar, mneVar, cyhVar, dujVar, sekVar, d1pVar, rptVar, ortVar, lbuVar, rouVar, pruVar, g2vVar, onvVar, mi70Var, ctf0Var, wdk0Var, z4w0Var).b).get();
                this.N1 = new gl5((byte) 17);
                this.O1 = iiVar;
                this.P1 = wdk0Var;
                return;
            }
        }
        jf4.n(b1j.i(up10.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        p7m0 p7m0Var = H0().v;
        yje yjeVar = null;
        yp10 yp10Var = new yp10(this, yjeVar, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new cm10(p7m0Var, clzVarW, yp10Var, (yje) null), 3);
        qoj0 qoj0Var = H0().w;
        yp10 yp10Var2 = new yp10(this, yjeVar, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new cm10(qoj0Var, clzVarW2, yp10Var2, (yje) null, (byte) 0), 3);
    }

    public final h1r G0() {
        Object objN = this.R1.n(V1[0], this);
        objN.getClass();
        return (h1r) objN;
    }

    public final vq10 H0() {
        return (vq10) this.Q1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        super.Z();
        G0().e.setAdapter(null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        this.j1 = true;
        vq10 vq10VarH0 = H0();
        c4m0 c4m0Var = vq10VarH0.A;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        bby bbyVar = vq10VarH0.y;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        vq10 vq10VarH0 = H0();
        c4m0 c4m0Var = vq10VarH0.A;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            vq10VarH0.A = slb.U(new fnq(vq10VarH0.g.b(), new qq10(vq10VarH0, null, (byte) 3), (byte) 4), d5c.S(jiu0.a(vq10VarH0), vq10VarH0.m.f22085a));
        }
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.L1;
    }

    @Override // a.yx5
    public final j9o0 z0() {
        return this.K1;
    }
}
