package org.xplatform.bet_history.bet_info.presentation;

import a.iiy;
import a.m1r;
import a.ufx;
import a.wa7;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;
import org.xplatform.bet_history.bet_info.presentation.model.BetInfoScreenModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/bet_history/bet_info/presentation/BetInfoScreen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class BetInfoScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46384a;
    public final BetInfoScreenModel b;

    public BetInfoScreen(String str, BetInfoScreenModel betInfoScreenModel) {
        str.getClass();
        this.f46384a = str;
        this.b = betInfoScreenModel;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        wa7.U1.getClass();
        String str = this.f46384a;
        str.getClass();
        wa7 wa7Var = new wa7();
        iiy[] iiyVarArr = wa7.V1;
        wa7Var.K1.x(wa7Var, iiyVarArr[0], str);
        wa7Var.L1.J(wa7Var, iiyVarArr[1], this.b);
        return wa7Var;
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
