package com.google.android.material.datepicker;

import a.lhe0;
import a.tk80;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends lhe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f45570a;
    public final /* synthetic */ e b;

    public d(e eVar, i iVar) {
        this.b = eVar;
        this.f45570a = iVar;
    }

    @Override // a.lhe0
    public final void b(RecyclerView recyclerView, int i) {
        e eVar;
        tk80 tk80Var;
        int iU;
        if (i != 0 || (tk80Var = (eVar = this.b).W1) == null) {
            return;
        }
        View viewE = tk80Var.e((LinearLayoutManager) eVar.O1.getLayoutManager());
        if (viewE != null && (iU = RecyclerView.U(viewE)) != -1) {
            i iVar = this.f45570a;
            eVar.K1 = iVar.z(iU);
            eVar.U1.setText(iVar.z(iU).d());
            eVar.D0(iU);
        }
        eVar.C0();
    }

    @Override // a.lhe0
    public final void d(RecyclerView recyclerView, int i, int i2) {
        e eVar = this.b;
        RecyclerView recyclerView2 = eVar.O1;
        int iF1 = i < 0 ? ((LinearLayoutManager) recyclerView2.getLayoutManager()).f1() : ((LinearLayoutManager) recyclerView2.getLayoutManager()).h1();
        tk80 tk80Var = eVar.W1;
        i iVar = this.f45570a;
        if (tk80Var == null) {
            eVar.K1 = iVar.z(iF1);
        }
        eVar.U1.setText(iVar.z(iF1).d());
        eVar.D0(iF1);
    }
}
