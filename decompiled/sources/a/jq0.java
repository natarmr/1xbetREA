package a;

import android.app.Application;
import android.os.Bundle;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/jq0;", "La/yx5;", "<init>", "()V", "a/qek0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class jq0 extends yx5 {
    public final e9o0 K1;
    public final s0r L1;
    public final r34 M1;
    public l7i N1;
    public final kiu0 O1;
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(jq0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(jq0.class, "partitionId", "getPartitionId()J", 0)};
    public static final qek0 P1 = new qek0();

    public jq0() {
        super(R.layout.compose_fragment);
        this.K1 = new e9o0(R.attr.uikitBackgroundContent, R.attr.uikitStaticTransparent, 12);
        this.L1 = ltt0.o(this, iq0.f15186a);
        this.M1 = new r34("PARTITION_ID");
        nc ncVar = new nc(this, (byte) 12);
        a8z a8zVarA = maz.a(wez.b, new f80(new f80(this, (byte) 3), (byte) 4));
        this.O1 = agc.G(this, sre0.f32672a.b(gs0.class), new k8(a8zVarA, (byte) 24), new k8(a8zVarA, (byte) 25), ncVar);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        final byte b = 1;
        vcc.g0(this, "SELECT_SORT_OPTION_REQUEST_KEY", new Function2(this) { // from class: a.hq0
            public final /* synthetic */ jq0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                switch (b) {
                    case 0:
                        fet fetVar = (fet) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        qek0 qek0Var = jq0.P1;
                        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                            jq0 jq0Var = this.b;
                            gs0 gs0VarG0 = jq0Var.G0();
                            int i = gs0.G;
                            pz40 pz40VarY = gs0VarG0.y(fetVar);
                            gs0 gs0VarG1 = jq0Var.G0();
                            boolean zI = fetVar.i(jq0Var);
                            Object objP = fetVar.P();
                            cl5 cl5Var = ukd.f35823a;
                            if (zI || objP == cl5Var) {
                                t90 t90Var = new t90(1, jq0Var, jq0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/aggregator/impl/category/presentation/filters/models/AggregatorFiltersSideEffect;)V", 0, (byte) 13);
                                fetVar.o0(t90Var);
                                objP = t90Var;
                            }
                            lkz lkzVar = lkz.f20223a;
                            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
                            boolean zI2 = fetVar.i(gs0VarG1) | fetVar.i(jq0Var) | fetVar.e(3) | fetVar.g(pz40VarF);
                            Object objP2 = fetVar.P();
                            if (zI2 || objP2 == cl5Var) {
                                l10 l10Var = new l10(gs0VarG1, jq0Var, pz40VarF, null, (byte) 4);
                                fetVar.o0(l10Var);
                                objP2 = l10Var;
                            }
                            m0x0.t(fetVar, jq0Var, (Function2) objP2);
                            mm40 mm40VarE0 = o2e.e0(jm40.b, "AGGREGATOR_FILTER_SCREEN");
                            gs0 gs0VarG2 = jq0Var.G0();
                            boolean zI3 = fetVar.i(gs0VarG2);
                            Object objP3 = fetVar.P();
                            if (zI3 || objP3 == cl5Var) {
                                t90 t90Var2 = new t90(1, gs0VarG2, gs0.class, "onAction", "onAction(Lorg/xplatform/aggregator/impl/category/presentation/filters/models/AggregatorFiltersAction;)V", 0, (byte) 14);
                                fetVar.o0(t90Var2);
                                objP3 = t90Var2;
                            }
                            j2e.d(6, fetVar, mm40VarE0, pz40VarY, (Function1) ((jhy) objP3));
                        } else {
                            fetVar.X();
                        }
                        break;
                    default:
                        Bundle bundle2 = (Bundle) obj2;
                        qek0 qek0Var2 = jq0.P1;
                        if (h97.B(bundle2, (String) obj, "SELECT_SORT_OPTION_REQUEST_KEY")) {
                            String string = bundle2.getString("SELECT_SORT_OPTION_REQUEST_KEY");
                            if (string != null) {
                                this.b.G0().x(new aq0(string));
                            }
                        }
                        break;
                }
                return Unit.f46060a;
            }
        });
        bdx.O(n0().k(), K(), new t1(this, (byte) 22));
        final byte b2 = 0;
        Object objN = this.L1.n(Q1[0], this);
        objN.getClass();
        h97.t(((aid) objN).f919a, new owp0(this), new ugd(-1082276945, true, new Function2(this) { // from class: a.hq0
            public final /* synthetic */ jq0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                switch (b2) {
                    case 0:
                        fet fetVar = (fet) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        qek0 qek0Var = jq0.P1;
                        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                            jq0 jq0Var = this.b;
                            gs0 gs0VarG0 = jq0Var.G0();
                            int i = gs0.G;
                            pz40 pz40VarY = gs0VarG0.y(fetVar);
                            gs0 gs0VarG1 = jq0Var.G0();
                            boolean zI = fetVar.i(jq0Var);
                            Object objP = fetVar.P();
                            cl5 cl5Var = ukd.f35823a;
                            if (zI || objP == cl5Var) {
                                t90 t90Var = new t90(1, jq0Var, jq0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/aggregator/impl/category/presentation/filters/models/AggregatorFiltersSideEffect;)V", 0, (byte) 13);
                                fetVar.o0(t90Var);
                                objP = t90Var;
                            }
                            lkz lkzVar = lkz.f20223a;
                            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
                            boolean zI2 = fetVar.i(gs0VarG1) | fetVar.i(jq0Var) | fetVar.e(3) | fetVar.g(pz40VarF);
                            Object objP2 = fetVar.P();
                            if (zI2 || objP2 == cl5Var) {
                                l10 l10Var = new l10(gs0VarG1, jq0Var, pz40VarF, null, (byte) 4);
                                fetVar.o0(l10Var);
                                objP2 = l10Var;
                            }
                            m0x0.t(fetVar, jq0Var, (Function2) objP2);
                            mm40 mm40VarE0 = o2e.e0(jm40.b, "AGGREGATOR_FILTER_SCREEN");
                            gs0 gs0VarG2 = jq0Var.G0();
                            boolean zI3 = fetVar.i(gs0VarG2);
                            Object objP3 = fetVar.P();
                            if (zI3 || objP3 == cl5Var) {
                                t90 t90Var2 = new t90(1, gs0VarG2, gs0.class, "onAction", "onAction(Lorg/xplatform/aggregator/impl/category/presentation/filters/models/AggregatorFiltersAction;)V", 0, (byte) 14);
                                fetVar.o0(t90Var2);
                                objP3 = t90Var2;
                            }
                            j2e.d(6, fetVar, mm40VarE0, pz40VarY, (Function1) ((jhy) objP3));
                        } else {
                            fetVar.X();
                        }
                        break;
                    default:
                        Bundle bundle2 = (Bundle) obj2;
                        qek0 qek0Var2 = jq0.P1;
                        if (h97.B(bundle2, (String) obj, "SELECT_SORT_OPTION_REQUEST_KEY")) {
                            String string = bundle2.getString("SELECT_SORT_OPTION_REQUEST_KEY");
                            if (string != null) {
                                this.b.G0().x(new aq0(string));
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
        this.N1 = (l7i) uo0.b(jLongValue, hgh0Var, application).W.get();
    }

    public final gs0 G0() {
        return (gs0) this.O1.getValue();
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
