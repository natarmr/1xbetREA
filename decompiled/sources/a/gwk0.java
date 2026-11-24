package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.special_event.impl.alleventsgames.navigation.AllEventGamesScreenFactoryImpl$getAllEventGamesScreen$1;
import org.xplatform.special_event.impl.alleventsgames.presentation.AllEventGamesScreenParams;
import org.xplatform.special_event.impl.special_event_tab.presentation.model.SpecialEventTabScreenParams;

/* JADX INFO: loaded from: classes5.dex */
public final class gwk0 extends bnn0 implements Function2 {
    public boolean i;
    public final /* synthetic */ iwk0 j;
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gwk0(iwk0 iwk0Var, int i, yje yjeVar) {
        super(2, yjeVar);
        this.j = iwk0Var;
        this.k = i;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new gwk0(this.j, this.k, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((gwk0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        iwk0 iwk0Var = this.j;
        SpecialEventTabScreenParams specialEventTabScreenParams = iwk0Var.p;
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        Object obj2 = null;
        if (!z) {
            z1x.P(obj);
            hnu hnuVar = iwk0Var.O;
            int i = specialEventTabScreenParams.f46974a;
            this.i = true;
            obj = ((iqp0) hnuVar.f13365a).a(i, this);
            if (obj == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        for (Object obj3 : (Iterable) obj) {
            if (((rfp0) obj3).b == this.k) {
                obj2 = obj3;
                break;
            }
        }
        rfp0 rfp0Var = (rfp0) obj2;
        if (rfp0Var != null) {
            ywu ywuVar = iwk0Var.K;
            int i2 = specialEventTabScreenParams.f46974a;
            yo4 yo4Var = (yo4) ywuVar.b;
            int i3 = this.k;
            String strValueOf = String.valueOf(i3);
            String str = (String) ywuVar.d;
            yo4Var.f42966a.a("sport_champ_team_call", xp20.f(new Pair("championship_id", Integer.valueOf(i2)), new Pair("option", strValueOf), new Pair("screen", str)));
            ((zr1) ywuVar.c).s(i2, String.valueOf(i3), str);
            h32 h32Var = iwk0Var.w;
            AllEventGamesScreenParams.ParticipantGames participantGames = new AllEventGamesScreenParams.ParticipantGames(specialEventTabScreenParams.f46974a, i3, ((dvk0) iwk0Var.D()).C.d, rfp0Var.c, rfp0Var.f30400a);
            h32Var.getClass();
            FragmentScreen allEventGamesScreenFactoryImpl$getAllEventGamesScreen$1 = new AllEventGamesScreenFactoryImpl$getAllEventGamesScreen$1(participantGames);
            i1w0 i1w0Var = iwk0Var.q;
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
            if (allEventGamesScreenFactoryImpl$getAllEventGamesScreen$1 instanceof DialogScreen) {
                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) allEventGamesScreenFactoryImpl$getAllEventGamesScreen$1)));
            } else {
                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(allEventGamesScreenFactoryImpl$getAllEventGamesScreen$1)));
            }
            ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
            while (true) {
                paw pawVar = (paw) listIteratorO;
                if (!pawVar.hasNext()) {
                    break;
                }
                i1w0Var.a((oe50) pawVar.next());
            }
        }
        return Unit.f46060a;
    }
}
