package org.xplatform.toto_bet.tirage.presentation.screen;

import a.iiy;
import a.m1r;
import a.mvr0;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/toto_bet/tirage/presentation/screen/TotoBetDsTirageScreen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class TotoBetDsTirageScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47165a;
    public final int b;

    public TotoBetDsTirageScreen(String str, int i) {
        str.getClass();
        this.f47165a = str;
        this.b = i;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        mvr0.W1.getClass();
        String str = this.f47165a;
        str.getClass();
        mvr0 mvr0Var = new mvr0();
        iiy[] iiyVarArr = mvr0.X1;
        mvr0Var.U1.x(mvr0Var, iiyVarArr[1], str);
        mvr0Var.V1.I(mvr0Var, iiyVarArr[2], this.b);
        return mvr0Var;
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
