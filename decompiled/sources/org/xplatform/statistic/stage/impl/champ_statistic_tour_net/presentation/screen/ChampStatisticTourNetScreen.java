package org.xplatform.statistic.stage.impl.champ_statistic_tour_net.presentation.screen;

import a.hgb;
import a.iiy;
import a.kl5;
import a.m1r;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;
import org.xplatform.statistic.stage.api.domain.TypeStageId;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/screen/ChampStatisticTourNetScreen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ChampStatisticTourNetScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f47070a;
    public final String b;
    public final String c;

    public ChampStatisticTourNetScreen(long j, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f47070a = j;
        this.b = str;
        this.c = str2;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        kl5 kl5Var = hgb.c2;
        TypeStageId.Game game = new TypeStageId.Game(this.b);
        kl5Var.getClass();
        String str = this.c;
        str.getClass();
        hgb hgbVar = new hgb();
        iiy[] iiyVarArr = hgb.d2;
        hgbVar.N1.j(hgbVar, iiyVarArr[0], this.f47070a);
        hgbVar.O1.J(hgbVar, iiyVarArr[1], game);
        hgbVar.P1.x(hgbVar, iiyVarArr[2], str);
        return hgbVar;
    }

    @Override // a.m7h0
    /* JADX INFO: renamed from: b */
    public final String getF45455a() {
        return ufx.C(this);
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    /* JADX INFO: renamed from: g */
    public final /* bridge */ boolean getB() {
        return true;
    }
}
