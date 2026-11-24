package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/pir0;", "La/yx5;", "La/e920;", "<init>", "()V", "a/j6m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class pir0 extends yx5 implements e920 {
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
    public static final /* synthetic */ iiy[] X1 = {new ez40(pir0.class, "totoType", "getTotoType()Ljava/lang/String;", 0), new j0d0(pir0.class, "viewBinding", "getViewBinding()Lorg/xplatform/toto_bet/impl/databinding/FragmentTotoBetDsBinding;", 0)};
    public static final j6m0 W1 = new j6m0((byte) 24);

    public pir0() {
        super(R.layout.fragment_toto_bet_ds);
        bp3 bp3Var = bp3.f2960a;
        this.K1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitBackgroundContent, 8);
        this.L1 = new phf0("TOTO_TYPE");
        this.M1 = ltt0.o(this, oir0.f25325a);
        mir0 mir0Var = new mir0(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new moq0(new moq0(this, (byte) 12), (byte) 13));
        this.U1 = agc.G(this, sre0.f32672a.b(njr0.class), new p7r0(a8zVarA, (byte) 6), new p7r0(a8zVarA, (byte) 7), mir0Var);
        this.V1 = new v62(this, (byte) 26);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        final byte b = 1;
        ccq0.V(this, "REQUEST_TOTO_CLEAR_DIALOG_KEY", new mir0(this, b));
        sj3.A0(this, "TotoBetTypeBottomSheetKey", new Function2(this) { // from class: a.lir0
            public final /* synthetic */ pir0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                byte b2 = b;
                pir0 pir0Var = this.b;
                switch (b2) {
                    case 0:
                        fet fetVar = (fet) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        j6m0 j6m0Var = pir0.W1;
                        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                            nia0.V(pir0Var.G0(), null, fetVar, 8);
                        } else {
                            fetVar.X();
                        }
                        break;
                    default:
                        String str = (String) obj;
                        Bundle bundle2 = (Bundle) obj2;
                        j6m0 j6m0Var2 = pir0.W1;
                        if (h97.B(bundle2, str, "TotoBetTypeBottomSheetKey")) {
                            njr0 njr0VarG0 = pir0Var.G0();
                            int i = bundle2.getInt(str);
                            if (njr0VarG0.i.f4960a.r().f20312a != i) {
                                p7m0 p7m0Var = njr0VarG0.H;
                                p7m0Var.getClass();
                                p7m0Var.o(null, 0L);
                                sac.V(jiu0.a(njr0VarG0), new mjr0(1, njr0VarG0, njr0.class, "handleDataLoadError", "handleDataLoadError(Ljava/lang/Throwable;)V", 0, (byte) 2), null, njr0VarG0.b.b, new defpackage.e(njr0VarG0, i, null, (byte) 11), 10);
                            }
                        }
                        break;
                }
                return Unit.f46060a;
            }
        });
        ccq0.V(this, "SHOW_CHANGE_BALANCE_ACTION_DIALOG_KEY", new mir0(this, (byte) 2));
        ccq0.V(this, "REQUEST_TOTO_CLEAR_DIALOG_KEY", new mir0(this, (byte) 3));
        Object objN = this.M1.n(X1[1], this);
        objN.getClass();
        final byte b2 = 0;
        pkd.i(((d6r) objN).f5564a, null, new ugd(-1308296673, true, new Function2(this) { // from class: a.lir0
            public final /* synthetic */ pir0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                byte b3 = b2;
                pir0 pir0Var = this.b;
                switch (b3) {
                    case 0:
                        fet fetVar = (fet) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        j6m0 j6m0Var = pir0.W1;
                        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                            nia0.V(pir0Var.G0(), null, fetVar, 8);
                        } else {
                            fetVar.X();
                        }
                        break;
                    default:
                        String str = (String) obj;
                        Bundle bundle2 = (Bundle) obj2;
                        j6m0 j6m0Var2 = pir0.W1;
                        if (h97.B(bundle2, str, "TotoBetTypeBottomSheetKey")) {
                            njr0 njr0VarG0 = pir0Var.G0();
                            int i = bundle2.getInt(str);
                            if (njr0VarG0.i.f4960a.r().f20312a != i) {
                                p7m0 p7m0Var = njr0VarG0.H;
                                p7m0Var.getClass();
                                p7m0Var.o(null, 0L);
                                sac.V(jiu0.a(njr0VarG0), new mjr0(1, njr0VarG0, njr0.class, "handleDataLoadError", "handleDataLoadError(Ljava/lang/Throwable;)V", 0, (byte) 2), null, njr0VarG0.b.b, new defpackage.e(njr0VarG0, i, null, (byte) 11), 10);
                            }
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
            o5d0 o5d0Var = (o5d0) af3Var.d().get(pkr0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            pkr0 pkr0Var = (pkr0) (ze3Var instanceof pkr0 ? ze3Var : null);
            if (pkr0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                cad cadVar = pkr0Var.f27149a;
                gii0 gii0Var = pkr0Var.b;
                m1e m1eVar = pkr0Var.c;
                sa10 sa10Var = pkr0Var.d;
                ctf0 ctf0Var = pkr0Var.e;
                iw20 iw20Var = pkr0Var.f;
                ii iiVar = pkr0Var.o;
                btt0 btt0Var = pkr0Var.g;
                wsf0 wsf0Var = pkr0Var.m;
                j1q0 j1q0Var = pkr0Var.n;
                gst0 gst0Var = pkr0Var.h;
                duj dujVar = pkr0Var.i;
                ouu ouuVar = pkr0Var.l;
                lgn0 lgn0Var = pkr0Var.p;
                gkr0 gkr0Var = pkr0Var.j;
                sd80 sd80Var = pkr0Var.k;
                knf0 knf0Var = pkr0Var.q;
                fvt0 fvt0Var = pkr0Var.r;
                wdk0 wdk0Var = pkr0Var.s;
                poq0 poq0Var = pkr0Var.t;
                dlr0 dlr0Var = pkr0Var.u;
                rou rouVar = pkr0Var.v;
                wyu wyuVar = pkr0Var.w;
                r9u r9uVar = pkr0Var.x;
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
                this.N1 = new fiu0(Collections.singletonMap(njr0.class, (yxi) new v5i(cadVar, iw20Var, fvt0Var, wsf0Var, poq0Var, lgn0Var, iiVar, gii0Var, sa10Var, m1eVar, ctf0Var, i1w0VarF, btt0Var, dujVar, gkr0Var, sd80Var, knf0Var, wdk0Var, ouuVar, dlr0Var, rouVar, wyuVar, r9uVar).v));
                this.O1 = iiVar;
                this.P1 = wdk0Var;
                this.Q1 = lgn0Var;
                this.R1 = new roq0();
                this.S1 = r9uVar;
                return;
            }
        }
        jf4.n(b1j.i(pkr0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        p7m0 p7m0Var = G0().G;
        yje yjeVar = null;
        nir0 nir0Var = new nir0(this, yjeVar, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new hlq0(p7m0Var, clzVarW, nir0Var, (yje) null), 3);
        ol60 ol60Var = G0().I;
        nir0 nir0Var2 = new nir0(this, yjeVar, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new hlq0(ol60Var, clzVarW2, nir0Var2, (yje) null, (byte) 0), 3);
    }

    public final njr0 G0() {
        return (njr0) this.U1.getValue();
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
        G0().C(z);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
