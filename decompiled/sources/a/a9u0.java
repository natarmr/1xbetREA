package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/a9u0;", "La/yx5;", "<init>", "()V", "a/uxs0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class a9u0 extends yx5 {
    public final s0r K1;
    public final zz2 L1;
    public final a8z M1;
    public wdk0 N1;
    public xyi O1;
    public final kiu0 P1;
    public final a8z Q1;
    public static final /* synthetic */ iiy[] S1 = {new j0d0(a9u0.class, "binding", "getBinding()Lorg/xplatform/verification/options/impl/databinding/FragmentVerificationOptionsBinding;", 0), new ez40(a9u0.class, "verificationType", "getVerificationType()I", 0)};
    public static final uxs0 R1 = new uxs0((byte) 7);

    public a9u0() {
        super(R.layout.fragment_verification_options);
        this.K1 = ltt0.o(this, y8u0.f42212a);
        this.L1 = new zz2("VERIFICATION_TYPE_BUNDLE");
        final byte b = 0;
        Function0 function0 = new Function0(this) { // from class: a.x8u0
            public final /* synthetic */ a9u0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                a9u0 a9u0Var = this.b;
                switch (b2) {
                    case 0:
                        uxs0 uxs0Var = a9u0.R1;
                        ComponentCallbacks2 application = a9u0Var.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(b9u0.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof b9u0)) {
                                ze3Var = null;
                            }
                            b9u0 b9u0Var = (b9u0) ze3Var;
                            if (b9u0Var != null) {
                                x860 x860Var = new x860(a9u0Var.L1.n(a9u0Var, a9u0.S1[1]).intValue(), false);
                                gii0 gii0Var = b9u0Var.f2228a;
                                btt0 btt0Var = b9u0Var.b;
                                vwb0 vwb0Var = b9u0Var.c;
                                vby vbyVar = b9u0Var.d;
                                pmi pmiVar = b9u0Var.e;
                                sa10 sa10Var = b9u0Var.f;
                                bbw0 bbw0Var = b9u0Var.g;
                                ilp0 ilp0Var = b9u0Var.h;
                                mne mneVar = b9u0Var.i;
                                wdk0 wdk0Var = b9u0Var.j;
                                gii0Var.getClass();
                                btt0Var.getClass();
                                vwb0Var.getClass();
                                vbyVar.getClass();
                                wdk0Var.getClass();
                                return new yyi(x860Var, gii0Var, btt0Var, vwb0Var, vbyVar, pmiVar, sa10Var, bbw0Var, ilp0Var, mneVar, wdk0Var);
                            }
                        }
                        jf4.n(b1j.i(b9u0.class, "Cannot create dependency "));
                        return null;
                    case 1:
                        uxs0 uxs0Var2 = a9u0.R1;
                        i1w0 i1w0VarF = a4n0.f(a9u0Var);
                        xyi xyiVar = a9u0Var.O1;
                        if (xyiVar != null) {
                            return new ry3(i1w0VarF, xyiVar);
                        }
                        Intrinsics.h("verificationOptionsViewModelFactory");
                        throw null;
                    default:
                        uxs0 uxs0Var3 = a9u0.R1;
                        ggt0 ggt0Var = new ggt0(a9u0Var, (byte) 6);
                        m8u0 m8u0Var = new m8u0(m8u0.f);
                        m8u0Var.d.b(new gbn(new b4u0((byte) 7), new d8q0(3, (byte) 20), new npt0(ggt0Var, (byte) 5), pfo0.Y));
                        return m8u0Var;
                }
            }
        };
        wez wezVar = wez.b;
        this.M1 = maz.a(wezVar, function0);
        final byte b2 = 1;
        Function0 function1 = new Function0(this) { // from class: a.x8u0
            public final /* synthetic */ a9u0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                a9u0 a9u0Var = this.b;
                switch (b3) {
                    case 0:
                        uxs0 uxs0Var = a9u0.R1;
                        ComponentCallbacks2 application = a9u0Var.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(b9u0.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof b9u0)) {
                                ze3Var = null;
                            }
                            b9u0 b9u0Var = (b9u0) ze3Var;
                            if (b9u0Var != null) {
                                x860 x860Var = new x860(a9u0Var.L1.n(a9u0Var, a9u0.S1[1]).intValue(), false);
                                gii0 gii0Var = b9u0Var.f2228a;
                                btt0 btt0Var = b9u0Var.b;
                                vwb0 vwb0Var = b9u0Var.c;
                                vby vbyVar = b9u0Var.d;
                                pmi pmiVar = b9u0Var.e;
                                sa10 sa10Var = b9u0Var.f;
                                bbw0 bbw0Var = b9u0Var.g;
                                ilp0 ilp0Var = b9u0Var.h;
                                mne mneVar = b9u0Var.i;
                                wdk0 wdk0Var = b9u0Var.j;
                                gii0Var.getClass();
                                btt0Var.getClass();
                                vwb0Var.getClass();
                                vbyVar.getClass();
                                wdk0Var.getClass();
                                return new yyi(x860Var, gii0Var, btt0Var, vwb0Var, vbyVar, pmiVar, sa10Var, bbw0Var, ilp0Var, mneVar, wdk0Var);
                            }
                        }
                        jf4.n(b1j.i(b9u0.class, "Cannot create dependency "));
                        return null;
                    case 1:
                        uxs0 uxs0Var2 = a9u0.R1;
                        i1w0 i1w0VarF = a4n0.f(a9u0Var);
                        xyi xyiVar = a9u0Var.O1;
                        if (xyiVar != null) {
                            return new ry3(i1w0VarF, xyiVar);
                        }
                        Intrinsics.h("verificationOptionsViewModelFactory");
                        throw null;
                    default:
                        uxs0 uxs0Var3 = a9u0.R1;
                        ggt0 ggt0Var = new ggt0(a9u0Var, (byte) 6);
                        m8u0 m8u0Var = new m8u0(m8u0.f);
                        m8u0Var.d.b(new gbn(new b4u0((byte) 7), new d8q0(3, (byte) 20), new npt0(ggt0Var, (byte) 5), pfo0.Y));
                        return m8u0Var;
                }
            }
        };
        a8z a8zVarA = maz.a(wezVar, new cvs0(new cvs0(this, (byte) 13), (byte) 14));
        this.P1 = agc.G(this, sre0.f32672a.b(i9u0.class), new w6u0(a8zVarA, (byte) 4), new w6u0(a8zVarA, (byte) 5), function1);
        final byte b3 = 2;
        this.Q1 = maz.a(wezVar, new Function0(this) { // from class: a.x8u0
            public final /* synthetic */ a9u0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b3;
                a9u0 a9u0Var = this.b;
                switch (b4) {
                    case 0:
                        uxs0 uxs0Var = a9u0.R1;
                        ComponentCallbacks2 application = a9u0Var.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(b9u0.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof b9u0)) {
                                ze3Var = null;
                            }
                            b9u0 b9u0Var = (b9u0) ze3Var;
                            if (b9u0Var != null) {
                                x860 x860Var = new x860(a9u0Var.L1.n(a9u0Var, a9u0.S1[1]).intValue(), false);
                                gii0 gii0Var = b9u0Var.f2228a;
                                btt0 btt0Var = b9u0Var.b;
                                vwb0 vwb0Var = b9u0Var.c;
                                vby vbyVar = b9u0Var.d;
                                pmi pmiVar = b9u0Var.e;
                                sa10 sa10Var = b9u0Var.f;
                                bbw0 bbw0Var = b9u0Var.g;
                                ilp0 ilp0Var = b9u0Var.h;
                                mne mneVar = b9u0Var.i;
                                wdk0 wdk0Var = b9u0Var.j;
                                gii0Var.getClass();
                                btt0Var.getClass();
                                vwb0Var.getClass();
                                vbyVar.getClass();
                                wdk0Var.getClass();
                                return new yyi(x860Var, gii0Var, btt0Var, vwb0Var, vbyVar, pmiVar, sa10Var, bbw0Var, ilp0Var, mneVar, wdk0Var);
                            }
                        }
                        jf4.n(b1j.i(b9u0.class, "Cannot create dependency "));
                        return null;
                    case 1:
                        uxs0 uxs0Var2 = a9u0.R1;
                        i1w0 i1w0VarF = a4n0.f(a9u0Var);
                        xyi xyiVar = a9u0Var.O1;
                        if (xyiVar != null) {
                            return new ry3(i1w0VarF, xyiVar);
                        }
                        Intrinsics.h("verificationOptionsViewModelFactory");
                        throw null;
                    default:
                        uxs0 uxs0Var3 = a9u0.R1;
                        ggt0 ggt0Var = new ggt0(a9u0Var, (byte) 6);
                        m8u0 m8u0Var = new m8u0(m8u0.f);
                        m8u0Var.d.b(new gbn(new b4u0((byte) 7), new d8q0(3, (byte) 20), new npt0(ggt0Var, (byte) 5), pfo0.Y));
                        return m8u0Var;
                }
            }
        });
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        G0().e.setTitle(H(R.string.verification));
        G0().e.setNavigationOnClickListener(new jpe0(this, (byte) 16));
        G0().d.setAdapter((m8u0) this.Q1.getValue());
    }

    @Override // a.yx5
    public final void C0() {
        yyi yyiVar = (yyi) this.M1.getValue();
        this.N1 = yyiVar.f43467a;
        this.O1 = (xyi) yyiVar.l.get();
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        kiu0 kiu0Var = this.P1;
        p7m0 p7m0Var = ((i9u0) kiu0Var.getValue()).g;
        yje yjeVar = null;
        z8u0 z8u0Var = new z8u0(this, yjeVar, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new tsr0(p7m0Var, clzVarW, z8u0Var, (yje) null), 3);
        qoj0 qoj0Var = ((i9u0) kiu0Var.getValue()).h;
        z8u0 z8u0Var2 = new z8u0(this, yjeVar, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new tsr0(qoj0Var, clzVarW2, z8u0Var2, (yje) null, (byte) 0), 3);
    }

    public final l6r G0() {
        Object objN = this.K1.n(S1[0], this);
        objN.getClass();
        return (l6r) objN;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        G0().d.setAdapter(null);
        super.Z();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        super.i0(view, bundle);
        i9u0 i9u0Var = (i9u0) this.P1.getValue();
        sac.V(jiu0.a(i9u0Var), new npt0(i9u0Var, (byte) 6), null, i9u0Var.f.f22085a, new k6s0(i9u0Var, null, (byte) 16), 10);
    }
}
