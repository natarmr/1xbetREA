package org.xplatform.bet_history.history.presentation;

import a.jcb;
import a.k77;
import a.m1r;
import a.p57;
import a.q47;
import a.ufx;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;
import org.xplatform.bet_history.core.presentation.BetHistoryScreenModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/bet_history/history/presentation/BetHistoryScreen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class BetHistoryScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p57 f46395a;
    public final k77 b;

    public BetHistoryScreen(p57 p57Var, k77 k77Var) {
        this.f46395a = p57Var;
        this.b = k77Var;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        Parcelable betChampHistory;
        m1rVar.getClass();
        p57 p57Var = this.f46395a;
        int i = p57Var.f26391a;
        int length = p57Var.e.length();
        long j = p57Var.b;
        k77 k77Var = this.b;
        if (length == 0) {
            betChampHistory = new BetHistoryScreenModel.BetHistory(j, jcb.a0(i), k77Var, p57Var.c);
        } else {
            betChampHistory = new BetHistoryScreenModel.BetChampHistory(j, jcb.a0(i), k77Var, p57Var.c, p57Var.e, p57Var.d);
        }
        q47.U1.getClass();
        q47 q47Var = new q47();
        q47Var.Q1.J(q47Var, q47.V1[1], betChampHistory);
        return q47Var;
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
