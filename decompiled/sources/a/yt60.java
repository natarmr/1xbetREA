package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.games_section.api.models.GamesActionsFragmentResultModel;
import org.xplatform.uikit.components.account_selection.DsAccountSelection;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class yt60 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43202a;
    public final /* synthetic */ cu60 b;

    public /* synthetic */ yt60(cu60 cu60Var, byte b) {
        this.f43202a = b;
        this.b = cu60Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f43202a;
        byte b2 = 1;
        yje yjeVar = null;
        cu60 cu60Var = this.b;
        switch (b) {
            case 0:
                evz evzVar = cu60.U1;
                h2b h2bVarH0 = cu60Var.H0();
                bby bbyVar = h2bVarH0.L;
                if (bbyVar == null || !bbyVar.isActive()) {
                    h2bVarH0.i.f35083a.c("games_cashback_withdraw_call");
                    h2bVarH0.D.f15516a.a(xun.f41520a, 3336L);
                    h2bVarH0.L = sac.V(jiu0.a(h2bVarH0), new j1b(h2bVarH0, (byte) 3), null, null, new a2b(h2bVarH0, yjeVar, (byte) 2), 14);
                }
                return Unit.f46060a;
            case 1:
                evz evzVar2 = cu60.U1;
                i1w0 i1w0VarF = a4n0.f(cu60Var);
                tbi tbiVar = cu60Var.O1;
                if (tbiVar != null) {
                    return new ry3(i1w0VarF, tbiVar);
                }
                Intrinsics.h("cashbackViewModelFactory");
                throw null;
            case 2:
                evz evzVar3 = cu60.U1;
                androidx.fragment.app.e eVarF = cu60Var.F();
                String strN = cu60Var.K1.n(cu60Var, cu60.V1[0]);
                strN.getClass();
                o2t.c(eVarF, GamesActionsFragmentResultModel.PreviewActionGamesUnderMaintenance.f46723a, strN);
                cu60Var.H0().B();
                return Unit.f46060a;
            case 3:
                evz evzVar4 = cu60.U1;
                h2b h2bVarH1 = cu60Var.H0();
                i1w0 i1w0Var = h2bVarH1.b;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                FragmentScreen fragmentScreenE = h2bVarH1.o.f35560a.e();
                if (fragmentScreenE instanceof DialogScreen) {
                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenE)));
                } else {
                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenE)));
                }
                ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorO;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var.a((oe50) pawVar.next());
                }
                break;
            case 4:
                evz evzVar5 = cu60.U1;
                cu60Var.H0().C();
                return Unit.f46060a;
            case 5:
                evz evzVar6 = cu60.U1;
                h2b h2bVarH2 = cu60Var.H0();
                h2bVarH2.l.c("games_cashback");
                h2bVarH2.k.i("games_cashback");
                h2bVarH2.A(w1b.f38390a);
                return Unit.f46060a;
            case 6:
                evz evzVar7 = cu60.U1;
                h2b h2bVarH3 = cu60Var.H0();
                h2bVarH3.j.f(k7k.OneXCashback);
                l7k l7kVar = h2bVarH3.F;
                y1p y1pVar = y1p.MAIN;
                l7kVar.b("games_cashback", h2bVarH3.G.g());
                sac.V(jiu0.a(h2bVarH3), d2b.f5347a, null, null, new a2b(h2bVarH3, yjeVar, b2), 14);
                return Unit.f46060a;
            default:
                evz evzVar8 = cu60.U1;
                return qxw.y(cu60Var);
        }
    }

    public /* synthetic */ yt60(cu60 cu60Var, DsAccountSelection dsAccountSelection, byte b) {
        this.f43202a = b;
        this.b = cu60Var;
    }
}
