package org.xplatform.special_event.impl.alleventsgames.navigation;

import a.m1r;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;
import org.xplatform.special_event.impl.alleventsgames.presentation.AllEventGamesScreenParams;
import org.xplatform.special_event.impl.alleventsgames.presentation.a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/special_event/impl/alleventsgames/navigation/AllEventGamesScreenFactoryImpl$getAllEventGamesScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class AllEventGamesScreenFactoryImpl$getAllEventGamesScreen$1 implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AllEventGamesScreenParams f46960a;

    public AllEventGamesScreenFactoryImpl$getAllEventGamesScreen$1(AllEventGamesScreenParams allEventGamesScreenParams) {
        this.f46960a = allEventGamesScreenParams;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        a.U1.getClass();
        a aVar = new a();
        aVar.O1.J(aVar, a.V1[0], this.f46960a);
        return aVar;
    }

    @Override // a.m7h0
    /* JADX INFO: renamed from: b */
    public final String getF45455a() {
        a.U1.getClass();
        return a.W1;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    /* JADX INFO: renamed from: g */
    public final /* bridge */ boolean getB() {
        return true;
    }
}
