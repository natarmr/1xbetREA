package a;

import a.m1r;
import a.y5g0;
import a.y6u0;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.special_event.impl.alleventsgames.navigation.AllEventGamesScreenFactoryImpl$getAllEventGamesScreen$1;
import org.xplatform.special_event.impl.alleventsgames.presentation.AllEventGamesScreenParams;
import org.xplatform.special_event.impl.filter.navigation.SportGameFilterSelectionScreenFactoryImpl$getSportGameFilterSelectionScreen$1;
import org.xplatform.special_event.impl.filter.navigation.SportGameFilterSelectionScreenParams;
import org.xplatform.special_event.impl.results.presentation.model.ResultsScreenParams;
import org.xplatform.special_event.impl.special_event_tab.presentation.model.SpecialEventTabScreenParams;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class rvk0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31173a;
    public final /* synthetic */ iwk0 b;

    public /* synthetic */ rvk0(iwk0 iwk0Var, byte b) {
        this.f31173a = b;
        this.b = iwk0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f31173a;
        wsk0 wsk0Var = wsk0.f39697a;
        iwk0 iwk0Var = this.b;
        switch (b) {
            case 0:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                h32 h32Var = iwk0Var.w;
                int i = iwk0Var.p.f46974a;
                List list = ((dvk0) iwk0Var.D()).i.b;
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((rfp0) it.next()).b));
                }
                AllEventGamesScreenParams.AllGames allGames = new AllEventGamesScreenParams.AllGames(i, arrayList);
                h32Var.getClass();
                k0w0Var.h(new AllEventGamesScreenFactoryImpl$getAllEventGamesScreen$1(allGames));
                break;
            case 1:
                Throwable th = (Throwable) obj;
                th.getClass();
                iwk0Var.E.b(th, new awk0(iwk0Var, (byte) 1));
                break;
            case 2:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                iwk0Var.E.b(th2, new awk0(iwk0Var, (byte) 0));
                break;
            case 3:
                ((Throwable) obj).getClass();
                iwk0Var.W(new msk0(wsk0Var, iun.f15405a));
                break;
            case 4:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                iwk0Var.E.b(th3, new jak0((byte) 11));
                break;
            case 5:
                ((Throwable) obj).getClass();
                iwk0Var.W(new lsk0(wsk0Var, iun.f15405a));
                break;
            case 6:
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                eke0 eke0Var = iwk0Var.j0;
                int i2 = iwk0Var.p.f46974a;
                long j = ((dvk0) iwk0Var.D()).c.b;
                Date date = ((dvk0) iwk0Var.D()).b.b;
                final ResultsScreenParams resultsScreenParams = new ResultsScreenParams(i2, j, date != null ? Long.valueOf(date.getTime()) : null);
                eke0Var.getClass();
                k0w0Var2.h(new FragmentScreen() { // from class: org.xplatform.special_event.impl.results.navigation.ResultsScreenFactory$getScreen$1
                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    public final Fragment a(m1r m1rVar) {
                        m1rVar.getClass();
                        y5g0.Q1.getClass();
                        y5g0 y5g0Var = new y5g0();
                        y5g0Var.N1.J(y5g0Var, y5g0.R1[1], resultsScreenParams);
                        return y5g0Var;
                    }

                    @Override // a.m7h0
                    /* JADX INFO: renamed from: b */
                    public final String getF45455a() {
                        y5g0.Q1.getClass();
                        return y5g0.S1;
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    /* JADX INFO: renamed from: g */
                    public final /* bridge */ boolean getB() {
                        return true;
                    }
                });
                break;
            case 7:
                k0w0 k0w0Var3 = (k0w0) obj;
                k0w0Var3.getClass();
                z6u0 z6u0Var = iwk0Var.I;
                final int i3 = iwk0Var.p.f46974a;
                z6u0Var.getClass();
                k0w0Var3.h(new FragmentScreen() { // from class: org.xplatform.special_event.impl.venues.navigation.VenuesScreenFactoryImpl$getVenuesScreen$1
                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    public final Fragment a(m1r m1rVar) {
                        m1rVar.getClass();
                        y6u0.R1.getClass();
                        y6u0 y6u0Var = new y6u0();
                        y6u0Var.Q1.I(y6u0Var, y6u0.S1[1], i3);
                        return y6u0Var;
                    }

                    @Override // a.m7h0
                    /* JADX INFO: renamed from: b */
                    public final String getF45455a() {
                        y6u0.R1.getClass();
                        return y6u0.U1;
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    /* JADX INFO: renamed from: g */
                    public final /* bridge */ boolean getB() {
                        return true;
                    }
                });
                break;
            case 8:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                iwk0Var.E.b(th4, new awk0(iwk0Var, (byte) 2));
                break;
            case 9:
                k0w0 k0w0Var4 = (k0w0) obj;
                k0w0Var4.getClass();
                zie0 zie0Var = iwk0Var.m0;
                SpecialEventTabScreenParams specialEventTabScreenParams = iwk0Var.p;
                int i4 = specialEventTabScreenParams.f46974a;
                SportGameFilterSelectionScreenParams sportGameFilterSelectionScreenParams = new SportGameFilterSelectionScreenParams(i4, specialEventTabScreenParams.c.f46973a, new tr2(i4));
                zie0Var.getClass();
                k0w0Var4.h(new SportGameFilterSelectionScreenFactoryImpl$getSportGameFilterSelectionScreen$1(sportGameFilterSelectionScreenParams));
                break;
            case 10:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                iwk0Var.E.b(th5, new awk0(iwk0Var, (byte) 4));
                break;
            default:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                iwk0Var.E.b(th6, new awk0(iwk0Var, (byte) 5));
                break;
        }
        return Unit.f46060a;
    }
}
