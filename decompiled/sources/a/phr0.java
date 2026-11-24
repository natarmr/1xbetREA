package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/phr0;", "La/yx5;", "La/e920;", "<init>", "()V", "a/y2m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class phr0 extends yx5 implements e920 {
    public final e9o0 K1;
    public final phf0 L1;
    public final s0r M1;
    public fiu0 N1;
    public ii O1;
    public wdk0 P1;
    public lgn0 Q1;
    public roq0 R1;
    public r9u S1;
    public final kiu0 U1;
    public final v62 V1;
    public static final /* synthetic */ iiy[] X1 = {new ez40(phr0.class, "totoType", "getTotoType()Ljava/lang/String;", 0), new j0d0(phr0.class, "viewBinding", "getViewBinding()Lorg/xplatform/toto_bet/impl/databinding/FragmentTotoBetDsBinding;", 0)};
    public static final y2m0 W1 = new y2m0((byte) 24);

    public phr0() {
        super(R.layout.fragment_toto_bet_ds);
        bp3 bp3Var = bp3.f2960a;
        this.K1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitBackgroundContent, 8);
        this.L1 = new phf0("TOTO_TYPE");
        this.M1 = ltt0.o(this, ohr0.f25279a);
        nhr0 nhr0Var = new nhr0(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new moq0(new moq0(this, (byte) 10), (byte) 11));
        this.U1 = agc.G(this, sre0.f32672a.b(fir0.class), new p7r0(a8zVarA, (byte) 4), new p7r0(a8zVarA, (byte) 5), nhr0Var);
        this.V1 = new v62(this, (byte) 25);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        ccq0.V(this, "REQUEST_TOTO_CLEAR_DIALOG_KEY", new nhr0(this, (byte) 2));
        final byte b = 1;
        sj3.A0(this, "TotoBetTypeBottomSheetKey", new Function2(this) { // from class: a.mhr0
            public final /* synthetic */ phr0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                switch (b) {
                    case 0:
                        fet fetVar = (fet) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        y2m0 y2m0Var = phr0.W1;
                        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                            phr0 phr0Var = this.b;
                            fir0 fir0VarG0 = phr0Var.G0();
                            boolean zI = fetVar.i(phr0Var);
                            Object objP = fetVar.P();
                            cl5 cl5Var = ukd.f35823a;
                            if (zI || objP == cl5Var) {
                                ddr0 ddr0Var = new ddr0(1, phr0Var, phr0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/toto_bet/active_tirage/presentation/TotoActiveTirageSideEffect;)V", 0, (byte) 4);
                                fetVar.o0(ddr0Var);
                                objP = ddr0Var;
                            }
                            int i = fir0.X;
                            lkz lkzVar = lkz.f20223a;
                            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
                            boolean zI2 = fetVar.i(fir0VarG0) | fetVar.i(phr0Var) | fetVar.e(3) | fetVar.g(pz40VarF);
                            Object objP2 = fetVar.P();
                            if (zI2 || objP2 == cl5Var) {
                                tmj0 tmj0Var = new tmj0(fir0VarG0, phr0Var, pz40VarF, null, (byte) 15);
                                fetVar.o0(tmj0Var);
                                objP2 = tmj0Var;
                            }
                            m0x0.t(fetVar, phr0Var, (Function2) objP2);
                            boolean zI3 = fetVar.i(phr0Var);
                            Object objP3 = fetVar.P();
                            if (zI3 || objP3 == cl5Var) {
                                objP3 = new nhr0(phr0Var, (byte) 1);
                                fetVar.o0(objP3);
                            }
                            v3c.A((Function0) objP3, null, null, fetVar, 0, 6);
                            air0 air0Var = (air0) phr0Var.G0().y(fetVar).getValue();
                            fir0 fir0VarG1 = phr0Var.G0();
                            boolean zI4 = fetVar.i(fir0VarG1);
                            Object objP4 = fetVar.P();
                            if (zI4 || objP4 == cl5Var) {
                                ddr0 ddr0Var2 = new ddr0(1, fir0VarG1, fir0.class, "onAction", "onAction(Lorg/xplatform/toto_bet/active_tirage/presentation/TotoActiveTirageAction;)V", 0, (byte) 5);
                                fetVar.o0(ddr0Var2);
                                objP4 = ddr0Var2;
                            }
                            wha0.E(null, air0Var, (Function1) ((jhy) objP4), fetVar, 0);
                        } else {
                            fetVar.X();
                        }
                        break;
                    default:
                        String str = (String) obj;
                        Bundle bundle2 = (Bundle) obj2;
                        y2m0 y2m0Var2 = phr0.W1;
                        if (h97.B(bundle2, str, "TotoBetTypeBottomSheetKey")) {
                            this.b.G0().x(new ehr0(bundle2.getInt(str)));
                        }
                        break;
                }
                return Unit.f46060a;
            }
        });
        ccq0.V(this, "SHOW_CHANGE_BALANCE_ACTION_DIALOG_KEY", new nhr0(this, (byte) 3));
        Object objN = this.M1.n(X1[1], this);
        objN.getClass();
        final byte b2 = 0;
        pkd.i(((d6r) objN).f5564a, null, new ugd(-1925735031, true, new Function2(this) { // from class: a.mhr0
            public final /* synthetic */ phr0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                switch (b2) {
                    case 0:
                        fet fetVar = (fet) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        y2m0 y2m0Var = phr0.W1;
                        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                            phr0 phr0Var = this.b;
                            fir0 fir0VarG0 = phr0Var.G0();
                            boolean zI = fetVar.i(phr0Var);
                            Object objP = fetVar.P();
                            cl5 cl5Var = ukd.f35823a;
                            if (zI || objP == cl5Var) {
                                ddr0 ddr0Var = new ddr0(1, phr0Var, phr0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/toto_bet/active_tirage/presentation/TotoActiveTirageSideEffect;)V", 0, (byte) 4);
                                fetVar.o0(ddr0Var);
                                objP = ddr0Var;
                            }
                            int i = fir0.X;
                            lkz lkzVar = lkz.f20223a;
                            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
                            boolean zI2 = fetVar.i(fir0VarG0) | fetVar.i(phr0Var) | fetVar.e(3) | fetVar.g(pz40VarF);
                            Object objP2 = fetVar.P();
                            if (zI2 || objP2 == cl5Var) {
                                tmj0 tmj0Var = new tmj0(fir0VarG0, phr0Var, pz40VarF, null, (byte) 15);
                                fetVar.o0(tmj0Var);
                                objP2 = tmj0Var;
                            }
                            m0x0.t(fetVar, phr0Var, (Function2) objP2);
                            boolean zI3 = fetVar.i(phr0Var);
                            Object objP3 = fetVar.P();
                            if (zI3 || objP3 == cl5Var) {
                                objP3 = new nhr0(phr0Var, (byte) 1);
                                fetVar.o0(objP3);
                            }
                            v3c.A((Function0) objP3, null, null, fetVar, 0, 6);
                            air0 air0Var = (air0) phr0Var.G0().y(fetVar).getValue();
                            fir0 fir0VarG1 = phr0Var.G0();
                            boolean zI4 = fetVar.i(fir0VarG1);
                            Object objP4 = fetVar.P();
                            if (zI4 || objP4 == cl5Var) {
                                ddr0 ddr0Var2 = new ddr0(1, fir0VarG1, fir0.class, "onAction", "onAction(Lorg/xplatform/toto_bet/active_tirage/presentation/TotoActiveTirageAction;)V", 0, (byte) 5);
                                fetVar.o0(ddr0Var2);
                                objP4 = ddr0Var2;
                            }
                            wha0.E(null, air0Var, (Function1) ((jhy) objP4), fetVar, 0);
                        } else {
                            fetVar.X();
                        }
                        break;
                    default:
                        String str = (String) obj;
                        Bundle bundle2 = (Bundle) obj2;
                        y2m0 y2m0Var2 = phr0.W1;
                        if (h97.B(bundle2, str, "TotoBetTypeBottomSheetKey")) {
                            this.b.G0().x(new ehr0(bundle2.getInt(str)));
                        }
                        break;
                }
                return Unit.f46060a;
            }
        }));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(sjr0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            sjr0 sjr0Var = (sjr0) (ze3Var instanceof sjr0 ? ze3Var : null);
            if (sjr0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                cad cadVar = sjr0Var.f32315a;
                gii0 gii0Var = sjr0Var.b;
                m1e m1eVar = sjr0Var.c;
                ocl oclVar = sjr0Var.d;
                ctf0 ctf0Var = sjr0Var.e;
                iw20 iw20Var = sjr0Var.f;
                ii iiVar = sjr0Var.o;
                btt0 btt0Var = sjr0Var.g;
                wsf0 wsf0Var = sjr0Var.m;
                j1q0 j1q0Var = sjr0Var.n;
                gst0 gst0Var = sjr0Var.h;
                duj dujVar = sjr0Var.i;
                ouu ouuVar = sjr0Var.l;
                lgn0 lgn0Var = sjr0Var.p;
                gkr0 gkr0Var = sjr0Var.j;
                sd80 sd80Var = sjr0Var.k;
                knf0 knf0Var = sjr0Var.q;
                fvt0 fvt0Var = sjr0Var.r;
                wdk0 wdk0Var = sjr0Var.s;
                poq0 poq0Var = sjr0Var.t;
                dlr0 dlr0Var = sjr0Var.u;
                rou rouVar = sjr0Var.v;
                wyu wyuVar = sjr0Var.w;
                r9u r9uVar = sjr0Var.x;
                j1q0Var.getClass();
                iiVar.getClass();
                gii0Var.getClass();
                m1eVar.getClass();
                ctf0Var.getClass();
                btt0Var.getClass();
                gst0Var.getClass();
                gkr0Var.getClass();
                sd80Var.getClass();
                knf0Var.getClass();
                wdk0Var.getClass();
                dlr0Var.getClass();
                wyuVar.getClass();
                r9uVar.getClass();
                this.N1 = new fiu0(Collections.singletonMap(fir0.class, (xvi) new v5i(cadVar, iw20Var, fvt0Var, wsf0Var, poq0Var, lgn0Var, iiVar, gii0Var, oclVar, m1eVar, ctf0Var, i1w0VarF, btt0Var, dujVar, gkr0Var, sd80Var, knf0Var, wdk0Var, ouuVar, dlr0Var, rouVar, wyuVar, r9uVar).v));
                this.O1 = iiVar;
                this.P1 = wdk0Var;
                this.Q1 = lgn0Var;
                this.R1 = new roq0();
                this.S1 = r9uVar;
                return;
            }
        }
        jf4.n(b1j.i(sjr0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() {
        fir0 fir0VarG0 = G0();
        lcr0 lcr0Var = new lcr0(this, (byte) 3);
        lkz lkzVar = lkz.f20223a;
        qjj.W(x0x.Q(this.u1), null, null, new hlq0(fir0VarG0.w(), this, new fup0(2, lcr0Var, knx.class, "suspendConversion0", "suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 11), (yje) null), 3);
    }

    public final fir0 G0() {
        return (fir0) this.U1.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        this.V1.e();
        this.j1 = true;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        n0().k().b(this.V1);
        super.e0();
    }

    @Override // a.e920
    public final void v(boolean z) {
        G0().x(new ygr0(z));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
