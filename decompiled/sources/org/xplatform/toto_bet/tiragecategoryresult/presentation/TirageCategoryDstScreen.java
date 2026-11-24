package org.xplatform.toto_bet.tiragecategoryresult.presentation;

import a.dpq0;
import a.iiy;
import a.m1r;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/toto_bet/tiragecategoryresult/presentation/TirageCategoryDstScreen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class TirageCategoryDstScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47167a;
    public final String b;

    public TirageCategoryDstScreen(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f47167a = str;
        this.b = str2;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        dpq0.R1.getClass();
        String str = this.f47167a;
        str.getClass();
        String str2 = this.b;
        str2.getClass();
        dpq0 dpq0Var = new dpq0();
        iiy[] iiyVarArr = dpq0.S1;
        dpq0Var.N1.x(dpq0Var, iiyVarArr[1], str);
        dpq0Var.O1.x(dpq0Var, iiyVarArr[2], str2);
        return dpq0Var;
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
