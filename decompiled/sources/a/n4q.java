package a;

import android.os.Bundle;
import java.io.Serializable;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/n4q;", "La/yx5;", "<init>", "()V", "a/bek", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class n4q extends yx5 {
    public final i9o0 K1;
    public final phf0 L1;
    public final s0r M1;
    public fiu0 N1;
    public ii O1;
    public final a8z P1;
    public final boolean Q1;
    public static final /* synthetic */ iiy[] S1 = {new ez40(n4q.class, "playerId", "getPlayerId()Ljava/lang/String;", 0), new j0d0(n4q.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final bek R1 = new bek();

    public n4q() {
        super(R.layout.compose_fragment);
        this.K1 = i9o0.f14396a;
        this.L1 = new phf0("PLAYER_ID_BUNDLE_KEY");
        this.M1 = ltt0.o(this, m4q.f21184a);
        this.P1 = xbc.b0(this, sre0.f32672a.b(y4q.class), new k4q(this, (byte) 0));
        this.Q1 = true;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        final byte b = 1;
        Object objN = this.M1.n(S1[1], this);
        objN.getClass();
        final byte b2 = 0;
        pkd.h(((aid) objN).f919a, new owp0(this), new shd((byte) 14), new ugd(1424633645, true, new Function2(this) { // from class: a.l4q
            public final /* synthetic */ n4q b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int i;
                byte b3 = b2;
                n4q n4qVar = this.b;
                switch (b3) {
                    case 0:
                        fet fetVar = (fet) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        bek bekVar = n4q.R1;
                        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                            n4q n4qVar2 = this.b;
                            k3t0 k3t0VarG0 = n4qVar2.G0();
                            boolean zI = fetVar.i(n4qVar2);
                            Object objP = fetVar.P();
                            cl5 cl5Var = ukd.f35823a;
                            if (zI || objP == cl5Var) {
                                objP = new pop(1, n4qVar2, n4q.class, "handleSideEffects", "handleSideEffects(Lorg/xplatform/statistic/tennis/impl/wins_and_losses/presentation/actual/filter/FilterWinLossSideEffect;)V", 0, (byte) 9);
                                fetVar.o0(objP);
                            }
                            lkz lkzVar = lkz.f20223a;
                            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
                            boolean zI2 = fetVar.i(k3t0VarG0) | fetVar.i(n4qVar2) | fetVar.e(3) | fetVar.g(pz40VarF);
                            Object objP2 = fetVar.P();
                            if (zI2 || objP2 == cl5Var) {
                                objP2 = new bio(k3t0VarG0, n4qVar2, pz40VarF, null, (byte) 6);
                                fetVar.o0(objP2);
                            }
                            m0x0.t(fetVar, n4qVar2, (Function2) objP2);
                            pz40 pz40VarY = ((i3t0) n4qVar2.G0()).y(fetVar);
                            k3t0 k3t0VarG1 = n4qVar2.G0();
                            boolean zI3 = fetVar.i(k3t0VarG1);
                            Object objP3 = fetVar.P();
                            if (zI3 || objP3 == cl5Var) {
                                pop popVar = new pop(1, k3t0VarG1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 10);
                                fetVar.o0(popVar);
                                objP3 = popVar;
                            }
                            ntr.y(0, fetVar, null, pz40VarY, (Function1) ((jhy) objP3));
                        } else {
                            fetVar.X();
                        }
                        break;
                    case 1:
                        Bundle bundle2 = (Bundle) obj2;
                        bek bekVar2 = n4q.R1;
                        if (h97.B(bundle2, (String) obj, "REQUEST_MATCH_TYPES_DIALOG_KEY")) {
                            if (bundle2.containsKey("RESULT_ON_MATCH_TYPE_SELECTED_LISTENER_KEY")) {
                                Serializable serializable = bundle2.getSerializable("RESULT_ON_MATCH_TYPE_SELECTED_LISTENER_KEY");
                                lg30 lg30Var = serializable instanceof lg30 ? (lg30) serializable : null;
                                if (lg30Var != null) {
                                    n4qVar.G0().x(new c4q(lg30Var));
                                }
                            }
                        }
                        break;
                    default:
                        Bundle bundle3 = (Bundle) obj2;
                        bek bekVar3 = n4q.R1;
                        if (h97.B(bundle3, (String) obj, "REQUEST_SEASONS_DIALOG_KEY")) {
                            if (bundle3.containsKey("RESULT_ON_SEASON_SELECTED_LISTENER_KEY") && (i = bundle3.getInt("RESULT_ON_SEASON_SELECTED_LISTENER_KEY", 0)) != 0) {
                                n4qVar.G0().x(new f4q(i));
                            }
                        }
                        break;
                }
                return Unit.f46060a;
            }
        }));
        vcc.g0(this, "REQUEST_MATCH_TYPES_DIALOG_KEY", new Function2(this) { // from class: a.l4q
            public final /* synthetic */ n4q b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int i;
                byte b3 = b;
                n4q n4qVar = this.b;
                switch (b3) {
                    case 0:
                        fet fetVar = (fet) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        bek bekVar = n4q.R1;
                        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                            n4q n4qVar2 = this.b;
                            k3t0 k3t0VarG0 = n4qVar2.G0();
                            boolean zI = fetVar.i(n4qVar2);
                            Object objP = fetVar.P();
                            cl5 cl5Var = ukd.f35823a;
                            if (zI || objP == cl5Var) {
                                objP = new pop(1, n4qVar2, n4q.class, "handleSideEffects", "handleSideEffects(Lorg/xplatform/statistic/tennis/impl/wins_and_losses/presentation/actual/filter/FilterWinLossSideEffect;)V", 0, (byte) 9);
                                fetVar.o0(objP);
                            }
                            lkz lkzVar = lkz.f20223a;
                            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
                            boolean zI2 = fetVar.i(k3t0VarG0) | fetVar.i(n4qVar2) | fetVar.e(3) | fetVar.g(pz40VarF);
                            Object objP2 = fetVar.P();
                            if (zI2 || objP2 == cl5Var) {
                                objP2 = new bio(k3t0VarG0, n4qVar2, pz40VarF, null, (byte) 6);
                                fetVar.o0(objP2);
                            }
                            m0x0.t(fetVar, n4qVar2, (Function2) objP2);
                            pz40 pz40VarY = ((i3t0) n4qVar2.G0()).y(fetVar);
                            k3t0 k3t0VarG1 = n4qVar2.G0();
                            boolean zI3 = fetVar.i(k3t0VarG1);
                            Object objP3 = fetVar.P();
                            if (zI3 || objP3 == cl5Var) {
                                pop popVar = new pop(1, k3t0VarG1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 10);
                                fetVar.o0(popVar);
                                objP3 = popVar;
                            }
                            ntr.y(0, fetVar, null, pz40VarY, (Function1) ((jhy) objP3));
                        } else {
                            fetVar.X();
                        }
                        break;
                    case 1:
                        Bundle bundle2 = (Bundle) obj2;
                        bek bekVar2 = n4q.R1;
                        if (h97.B(bundle2, (String) obj, "REQUEST_MATCH_TYPES_DIALOG_KEY")) {
                            if (bundle2.containsKey("RESULT_ON_MATCH_TYPE_SELECTED_LISTENER_KEY")) {
                                Serializable serializable = bundle2.getSerializable("RESULT_ON_MATCH_TYPE_SELECTED_LISTENER_KEY");
                                lg30 lg30Var = serializable instanceof lg30 ? (lg30) serializable : null;
                                if (lg30Var != null) {
                                    n4qVar.G0().x(new c4q(lg30Var));
                                }
                            }
                        }
                        break;
                    default:
                        Bundle bundle3 = (Bundle) obj2;
                        bek bekVar3 = n4q.R1;
                        if (h97.B(bundle3, (String) obj, "REQUEST_SEASONS_DIALOG_KEY")) {
                            if (bundle3.containsKey("RESULT_ON_SEASON_SELECTED_LISTENER_KEY") && (i = bundle3.getInt("RESULT_ON_SEASON_SELECTED_LISTENER_KEY", 0)) != 0) {
                                n4qVar.G0().x(new f4q(i));
                            }
                        }
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b3 = 2;
        vcc.g0(this, "REQUEST_SEASONS_DIALOG_KEY", new Function2(this) { // from class: a.l4q
            public final /* synthetic */ n4q b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int i;
                byte b4 = b3;
                n4q n4qVar = this.b;
                switch (b4) {
                    case 0:
                        fet fetVar = (fet) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        bek bekVar = n4q.R1;
                        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                            n4q n4qVar2 = this.b;
                            k3t0 k3t0VarG0 = n4qVar2.G0();
                            boolean zI = fetVar.i(n4qVar2);
                            Object objP = fetVar.P();
                            cl5 cl5Var = ukd.f35823a;
                            if (zI || objP == cl5Var) {
                                objP = new pop(1, n4qVar2, n4q.class, "handleSideEffects", "handleSideEffects(Lorg/xplatform/statistic/tennis/impl/wins_and_losses/presentation/actual/filter/FilterWinLossSideEffect;)V", 0, (byte) 9);
                                fetVar.o0(objP);
                            }
                            lkz lkzVar = lkz.f20223a;
                            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
                            boolean zI2 = fetVar.i(k3t0VarG0) | fetVar.i(n4qVar2) | fetVar.e(3) | fetVar.g(pz40VarF);
                            Object objP2 = fetVar.P();
                            if (zI2 || objP2 == cl5Var) {
                                objP2 = new bio(k3t0VarG0, n4qVar2, pz40VarF, null, (byte) 6);
                                fetVar.o0(objP2);
                            }
                            m0x0.t(fetVar, n4qVar2, (Function2) objP2);
                            pz40 pz40VarY = ((i3t0) n4qVar2.G0()).y(fetVar);
                            k3t0 k3t0VarG1 = n4qVar2.G0();
                            boolean zI3 = fetVar.i(k3t0VarG1);
                            Object objP3 = fetVar.P();
                            if (zI3 || objP3 == cl5Var) {
                                pop popVar = new pop(1, k3t0VarG1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 10);
                                fetVar.o0(popVar);
                                objP3 = popVar;
                            }
                            ntr.y(0, fetVar, null, pz40VarY, (Function1) ((jhy) objP3));
                        } else {
                            fetVar.X();
                        }
                        break;
                    case 1:
                        Bundle bundle2 = (Bundle) obj2;
                        bek bekVar2 = n4q.R1;
                        if (h97.B(bundle2, (String) obj, "REQUEST_MATCH_TYPES_DIALOG_KEY")) {
                            if (bundle2.containsKey("RESULT_ON_MATCH_TYPE_SELECTED_LISTENER_KEY")) {
                                Serializable serializable = bundle2.getSerializable("RESULT_ON_MATCH_TYPE_SELECTED_LISTENER_KEY");
                                lg30 lg30Var = serializable instanceof lg30 ? (lg30) serializable : null;
                                if (lg30Var != null) {
                                    n4qVar.G0().x(new c4q(lg30Var));
                                }
                            }
                        }
                        break;
                    default:
                        Bundle bundle3 = (Bundle) obj2;
                        bek bekVar3 = n4q.R1;
                        if (h97.B(bundle3, (String) obj, "REQUEST_SEASONS_DIALOG_KEY")) {
                            if (bundle3.containsKey("RESULT_ON_SEASON_SELECTED_LISTENER_KEY") && (i = bundle3.getInt("RESULT_ON_SEASON_SELECTED_LISTENER_KEY", 0)) != 0) {
                                n4qVar.G0().x(new f4q(i));
                            }
                        }
                        break;
                }
                return Unit.f46060a;
            }
        });
        ccq0.V(this, "REQUEST_RESET_DIALOG_KEY", new k4q(this, (byte) 1));
    }

    @Override // a.yx5
    public final void C0() {
        LinkedHashMap linkedHashMap = d0q0.f5279a;
        iiy[] iiyVarArr = S1;
        iiy iiyVar = iiyVarArr[0];
        phf0 phf0Var = this.L1;
        xwi xwiVarB = d0q0.b(d0q0.a(phf0Var.n(this, iiyVar), efx.v(this)), this, phf0Var.n(this, iiyVarArr[0]), a4n0.f(this));
        this.N1 = xwiVarB.a();
        this.O1 = xwiVarB.k;
    }

    public final k3t0 G0() {
        return (k3t0) this.P1.getValue();
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getO1() {
        return this.Q1;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
