package a;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/geq0;", "La/yx5;", "<init>", "()V", "tile_matching"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class geq0 extends yx5 {
    public static final /* synthetic */ iiy[] O1 = {new j0d0(geq0.class, "binding", "getBinding()Lorg/xplatform/tile_matching/databinding/FragmentTileMatchingGameEndedBinding;", 0)};
    public final i9o0 K1;
    public fxi L1;
    public final kiu0 M1;
    public final s0r N1;

    public geq0() {
        super(R.layout.fragment_tile_matching_game_ended);
        this.K1 = i9o0.f14396a;
        deq0 deq0Var = new deq0(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new mfo0(new mfo0(this, (byte) 19), (byte) 20));
        this.M1 = agc.G(this, sre0.f32672a.b(oeq0.class), new r5p0(a8zVarA, (byte) 12), new r5p0(a8zVarA, (byte) 13), deq0Var);
        this.N1 = ltt0.o(this, eeq0.f7686a);
    }

    @Override // a.yx5
    public final void C0() {
        gxi gxiVar;
        Fragment fragment = this.y;
        qeq0 qeq0Var = fragment instanceof qeq0 ? (qeq0) fragment : null;
        if (qeq0Var == null || (gxiVar = (gxi) qeq0Var.X1.getValue()) == null) {
            return;
        }
        this.L1 = (fxi) gxiVar.l0.get();
    }

    public final x5r G0() {
        Object objN = this.N1.n(O1[0], this);
        objN.getClass();
        return (x5r) objN;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) throws Exception {
        view.getClass();
        super.i0(view, bundle);
        final byte b = 1;
        ccq0.V(this, "NOT_ENOUGH_FUNDS", new deq0(this, (byte) 1));
        final byte b2 = 0;
        dyb.c0(G0().h, new Function1(this) { // from class: a.ceq0
            public final /* synthetic */ geq0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                geq0 geq0Var = this.b;
                View view2 = (View) obj;
                switch (b3) {
                    case 0:
                        iiy[] iiyVarArr = geq0.O1;
                        view2.getClass();
                        oeq0 oeq0Var = (oeq0) geq0Var.M1.getValue();
                        if (oeq0Var.l.a()) {
                            oeq0Var.x(new heq0(false));
                            oeq0Var.f.a(true);
                            sac.V(jiu0.a(oeq0Var), new w6q0(1, oeq0Var, oeq0.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 3), null, oeq0Var.e.b, new keq0(oeq0Var, null, (byte) 1), 10);
                        }
                        break;
                    default:
                        iiy[] iiyVarArr2 = geq0.O1;
                        view2.getClass();
                        oeq0 oeq0Var2 = (oeq0) geq0Var.M1.getValue();
                        if (oeq0Var2.l.a()) {
                            oeq0Var2.x(new heq0(false));
                            sac.V(jiu0.a(oeq0Var2), jeq0.f16388a, null, oeq0Var2.e.f22085a, new keq0(oeq0Var2, null, (byte) 0), 10);
                        }
                        break;
                }
                return Unit.f46060a;
            }
        });
        dyb.c0(G0().e, new Function1(this) { // from class: a.ceq0
            public final /* synthetic */ geq0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b;
                geq0 geq0Var = this.b;
                View view2 = (View) obj;
                switch (b3) {
                    case 0:
                        iiy[] iiyVarArr = geq0.O1;
                        view2.getClass();
                        oeq0 oeq0Var = (oeq0) geq0Var.M1.getValue();
                        if (oeq0Var.l.a()) {
                            oeq0Var.x(new heq0(false));
                            oeq0Var.f.a(true);
                            sac.V(jiu0.a(oeq0Var), new w6q0(1, oeq0Var, oeq0.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 3), null, oeq0Var.e.b, new keq0(oeq0Var, null, (byte) 1), 10);
                        }
                        break;
                    default:
                        iiy[] iiyVarArr2 = geq0.O1;
                        view2.getClass();
                        oeq0 oeq0Var2 = (oeq0) geq0Var.M1.getValue();
                        if (oeq0Var2.l.a()) {
                            oeq0Var2.x(new heq0(false));
                            sac.V(jiu0.a(oeq0Var2), jeq0.f16388a, null, oeq0Var2.e.f22085a, new keq0(oeq0Var2, null, (byte) 0), 10);
                        }
                        break;
                }
                return Unit.f46060a;
            }
        });
        kiu0 kiu0Var = this.M1;
        p7m0 p7m0Var = ((oeq0) kiu0Var.getValue()).s;
        feq0 feq0Var = new feq0(this, null, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new lto0(p7m0Var, clzVarW, feq0Var, (yje) null), 3);
        p7m0 p7m0Var2 = ((oeq0) kiu0Var.getValue()).t;
        feq0 feq0Var2 = new feq0(this, null, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new lto0((gmq) p7m0Var2, clzVarW2, feq0Var2, (yje) null, (byte) 0), 3);
        G0().c.getLayoutParams().width = (int) (((double) o0().getResources().getDisplayMetrics().widthPixels) * 0.61d);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
