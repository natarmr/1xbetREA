package org.xplatform.bethistory.powerbet.presentation;

import a.crb0;
import a.iiy;
import a.m1r;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/bethistory/powerbet/presentation/PowerbetOldScreen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class PowerbetOldScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46414a;
    public final long b;

    public PowerbetOldScreen(String str, long j) {
        str.getClass();
        this.f46414a = str;
        this.b = j;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        crb0.S1.getClass();
        String str = this.f46414a;
        str.getClass();
        crb0 crb0Var = new crb0();
        iiy[] iiyVarArr = crb0.U1;
        crb0Var.M1.x(crb0Var, iiyVarArr[1], str);
        crb0Var.N1.j(crb0Var, iiyVarArr[2], this.b);
        return crb0Var;
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
