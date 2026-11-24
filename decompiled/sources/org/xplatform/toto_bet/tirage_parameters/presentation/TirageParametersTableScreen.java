package org.xplatform.toto_bet.tirage_parameters.presentation;

import a.iiy;
import a.m1r;
import a.sqq0;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/toto_bet/tirage_parameters/presentation/TirageParametersTableScreen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class TirageParametersTableScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47166a;
    public final int b;

    public TirageParametersTableScreen(int i, int i2) {
        this.f47166a = i;
        this.b = i2;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        sqq0.S1.getClass();
        sqq0 sqq0Var = new sqq0();
        iiy[] iiyVarArr = sqq0.U1;
        sqq0Var.Q1.I(sqq0Var, iiyVarArr[2], this.f47166a);
        sqq0Var.P1.I(sqq0Var, iiyVarArr[1], this.b);
        return sqq0Var;
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
