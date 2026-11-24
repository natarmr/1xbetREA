package org.xplatform.special_event.impl.filter.navigation;

import a.ddl0;
import a.m1r;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/special_event/impl/filter/navigation/SportGameFilterSelectionScreenFactoryImpl$getSportGameFilterSelectionScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SportGameFilterSelectionScreenFactoryImpl$getSportGameFilterSelectionScreen$1 implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SportGameFilterSelectionScreenParams f46964a;

    public SportGameFilterSelectionScreenFactoryImpl$getSportGameFilterSelectionScreen$1(SportGameFilterSelectionScreenParams sportGameFilterSelectionScreenParams) {
        this.f46964a = sportGameFilterSelectionScreenParams;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        ddl0.V1.getClass();
        ddl0 ddl0Var = new ddl0();
        ddl0Var.O1.J(ddl0Var, ddl0.W1[0], this.f46964a);
        return ddl0Var;
    }

    @Override // a.m7h0
    /* JADX INFO: renamed from: b */
    public final String getF45455a() {
        ddl0.V1.getClass();
        return ddl0.X1;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    /* JADX INFO: renamed from: g */
    public final /* bridge */ boolean getB() {
        return true;
    }
}
