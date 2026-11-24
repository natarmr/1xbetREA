package org.xplatform.statistic.lastgames.presentation.screen;

import a.iiy;
import a.m1r;
import a.n3q;
import a.s0z;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/statistic/lastgames/presentation/screen/LastGamesScreen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class LastGamesScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47039a;
    public final long b;
    public final n3q c;
    public final int d;

    public LastGamesScreen(String str, long j, n3q n3qVar, int i) {
        this.f47039a = str;
        this.b = j;
        this.c = n3qVar;
        this.d = i;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        s0z.U1.getClass();
        s0z s0zVar = new s0z();
        iiy[] iiyVarArr = s0z.V1;
        s0zVar.N1.x(s0zVar, iiyVarArr[1], this.f47039a);
        s0zVar.O1.j(s0zVar, iiyVarArr[2], this.b);
        s0zVar.P1.u(s0zVar, iiyVarArr[3], this.c);
        s0zVar.Q1.I(s0zVar, iiyVarArr[4], this.d);
        return s0zVar;
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
