package org.xplatform.bet_history.transation_history.presentation;

import a.afs0;
import a.iiy;
import a.m1r;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/bet_history/transation_history/presentation/TransactionHistoryScreen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class TransactionHistoryScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46406a;
    public final String b;

    public TransactionHistoryScreen(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f46406a = str;
        this.b = str2;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        afs0.P1.getClass();
        String str = this.f46406a;
        str.getClass();
        String str2 = this.b;
        str2.getClass();
        afs0 afs0Var = new afs0();
        iiy[] iiyVarArr = afs0.Q1;
        afs0Var.K1.x(afs0Var, iiyVarArr[0], str);
        afs0Var.L1.x(afs0Var, iiyVarArr[1], str2);
        return afs0Var;
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
