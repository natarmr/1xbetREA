package org.xplatform.statistic.horses_race_menu.presentation.screen;

import a.cqw;
import a.iiy;
import a.llm0;
import a.m1r;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/statistic/horses_race_menu/presentation/screen/HorsesRaceMenuScreen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class HorsesRaceMenuScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47037a;
    public final long b;
    public final llm0 c;

    public HorsesRaceMenuScreen(String str, long j, llm0 llm0Var) {
        str.getClass();
        this.f47037a = str;
        this.b = j;
        this.c = llm0Var;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        cqw.S1.getClass();
        String str = this.f47037a;
        str.getClass();
        cqw cqwVar = new cqw();
        iiy[] iiyVarArr = cqw.U1;
        cqwVar.L1.x(cqwVar, iiyVarArr[0], str);
        cqwVar.M1.j(cqwVar, iiyVarArr[1], this.b);
        cqwVar.N1.u(cqwVar, iiyVarArr[2], this.c);
        return cqwVar;
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
