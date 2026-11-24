package a;

import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/qi1;", "La/yx5;", "<init>", "()V", "a/pek0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class qi1 extends yx5 {
    public final e9o0 K1;
    public final s0r L1;
    public final r34 M1;
    public m7i N1;
    public final a8z O1;
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(qi1.class, "viewBinding", "getViewBinding()Lorg/xplatform/aggregator/impl/databinding/FragmentAggregatorProviderBinding;", 0), new ez40(qi1.class, "partitionId", "getPartitionId()J", 0)};
    public static final pek0 P1 = new pek0();

    public qi1() {
        super(R.layout.fragment_aggregator_provider);
        this.K1 = new e9o0(R.attr.uikitBackgroundContent, R.attr.uikitStaticTransparent, 12);
        this.L1 = ltt0.o(this, pi1.f27023a);
        this.M1 = new r34("AGGREGATOR_FILTERS_UI_ITEM");
        this.O1 = xbc.a0(this, sre0.f32672a.b(nj1.class), null, new ni1(this, (byte) 0), 14);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        final byte b = 1;
        vcc.g0(this, "SORT_RESULT_KEY", new Function2(this) { // from class: a.oi1
            public final /* synthetic */ qi1 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Object serializable;
                switch (b) {
                    case 0:
                        fet fetVar = (fet) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        pek0 pek0Var = qi1.P1;
                        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                            qi1 qi1Var = this.b;
                            k3t0 k3t0VarG0 = qi1Var.G0();
                            boolean zI = fetVar.i(qi1Var);
                            Object objP = fetVar.P();
                            cl5 cl5Var = ukd.f35823a;
                            if (zI || objP == cl5Var) {
                                c21 c21Var = new c21(1, qi1Var, qi1.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/aggregator/impl/category/presentation/providers/models/AggregatorProvidersSideEffect;)V", 0, (byte) 26);
                                fetVar.o0(c21Var);
                                objP = c21Var;
                            }
                            lkz lkzVar = lkz.f20223a;
                            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
                            boolean zI2 = fetVar.i(k3t0VarG0) | fetVar.i(qi1Var) | fetVar.e(3) | fetVar.g(pz40VarF);
                            Object objP2 = fetVar.P();
                            if (zI2 || objP2 == cl5Var) {
                                l10 l10Var = new l10(k3t0VarG0, qi1Var, pz40VarF, null, (byte) 10);
                                fetVar.o0(l10Var);
                                objP2 = l10Var;
                            }
                            m0x0.t(fetVar, qi1Var, (Function2) objP2);
                            mm40 mm40VarE0 = o2e.e0(yyw.X(jm40.b, null, fetVar, 1), "AGGREGATOR_PROVIDER_SCREEN");
                            pz40 pz40VarY = ((i3t0) qi1Var.G0()).y(fetVar);
                            k3t0 k3t0VarG1 = qi1Var.G0();
                            boolean zI3 = fetVar.i(k3t0VarG1);
                            Object objP3 = fetVar.P();
                            if (zI3 || objP3 == cl5Var) {
                                c21 c21Var2 = new c21(1, k3t0VarG1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 27);
                                fetVar.o0(c21Var2);
                                objP3 = c21Var2;
                            }
                            ahy.c(0, fetVar, mm40VarE0, pz40VarY, (Function1) ((jhy) objP3));
                        } else {
                            fetVar.X();
                        }
                        break;
                    default:
                        Bundle bundle2 = (Bundle) obj2;
                        pek0 pek0Var2 = qi1.P1;
                        if (h97.B(bundle2, (String) obj, "SORT_RESULT_KEY")) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable = bundle2.getSerializable("SORT_RESULT_KEY", uzb0.class);
                            } else {
                                Object serializable2 = bundle2.getSerializable("SORT_RESULT_KEY");
                                if (!(serializable2 instanceof uzb0)) {
                                    serializable2 = null;
                                }
                                serializable = (uzb0) serializable2;
                            }
                            uzb0 uzb0Var = serializable instanceof uzb0 ? (uzb0) serializable : null;
                            if (uzb0Var != null) {
                                this.b.G0().x(new fi1(uzb0Var));
                            }
                        }
                        break;
                }
                return Unit.f46060a;
            }
        });
        qcc.X(this, new ni1(this, (byte) 1));
        final byte b2 = 0;
        Object objN = this.L1.n(Q1[0], this);
        objN.getClass();
        pkd.h(((uxq) objN).f36453a, new owp0(this), null, new ugd(-247664842, true, new Function2(this) { // from class: a.oi1
            public final /* synthetic */ qi1 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Object serializable;
                switch (b2) {
                    case 0:
                        fet fetVar = (fet) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        pek0 pek0Var = qi1.P1;
                        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                            qi1 qi1Var = this.b;
                            k3t0 k3t0VarG0 = qi1Var.G0();
                            boolean zI = fetVar.i(qi1Var);
                            Object objP = fetVar.P();
                            cl5 cl5Var = ukd.f35823a;
                            if (zI || objP == cl5Var) {
                                c21 c21Var = new c21(1, qi1Var, qi1.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/aggregator/impl/category/presentation/providers/models/AggregatorProvidersSideEffect;)V", 0, (byte) 26);
                                fetVar.o0(c21Var);
                                objP = c21Var;
                            }
                            lkz lkzVar = lkz.f20223a;
                            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
                            boolean zI2 = fetVar.i(k3t0VarG0) | fetVar.i(qi1Var) | fetVar.e(3) | fetVar.g(pz40VarF);
                            Object objP2 = fetVar.P();
                            if (zI2 || objP2 == cl5Var) {
                                l10 l10Var = new l10(k3t0VarG0, qi1Var, pz40VarF, null, (byte) 10);
                                fetVar.o0(l10Var);
                                objP2 = l10Var;
                            }
                            m0x0.t(fetVar, qi1Var, (Function2) objP2);
                            mm40 mm40VarE0 = o2e.e0(yyw.X(jm40.b, null, fetVar, 1), "AGGREGATOR_PROVIDER_SCREEN");
                            pz40 pz40VarY = ((i3t0) qi1Var.G0()).y(fetVar);
                            k3t0 k3t0VarG1 = qi1Var.G0();
                            boolean zI3 = fetVar.i(k3t0VarG1);
                            Object objP3 = fetVar.P();
                            if (zI3 || objP3 == cl5Var) {
                                c21 c21Var2 = new c21(1, k3t0VarG1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 27);
                                fetVar.o0(c21Var2);
                                objP3 = c21Var2;
                            }
                            ahy.c(0, fetVar, mm40VarE0, pz40VarY, (Function1) ((jhy) objP3));
                        } else {
                            fetVar.X();
                        }
                        break;
                    default:
                        Bundle bundle2 = (Bundle) obj2;
                        pek0 pek0Var2 = qi1.P1;
                        if (h97.B(bundle2, (String) obj, "SORT_RESULT_KEY")) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable = bundle2.getSerializable("SORT_RESULT_KEY", uzb0.class);
                            } else {
                                Object serializable2 = bundle2.getSerializable("SORT_RESULT_KEY");
                                if (!(serializable2 instanceof uzb0)) {
                                    serializable2 = null;
                                }
                                serializable = (uzb0) serializable2;
                            }
                            uzb0 uzb0Var = serializable instanceof uzb0 ? (uzb0) serializable : null;
                            if (uzb0Var != null) {
                                this.b.G0().x(new fi1(uzb0Var));
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
        LinkedHashMap linkedHashMap = uo0.f35987a;
        long jLongValue = this.M1.n(this, Q1[1]).longValue();
        hgh0 hgh0Var = new hgh0(r7x.B(uzb0.f36529a));
        Application application = n0().getApplication();
        application.getClass();
        this.N1 = (m7i) uo0.b(jLongValue, hgh0Var, application).X.get();
    }

    public final k3t0 G0() {
        return (k3t0) this.O1.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        this.j1 = true;
        hxm0.m(q0());
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        hxm0.n(q0());
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
